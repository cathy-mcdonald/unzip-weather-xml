package org.bom.forecast

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.bind.Unmarshaller
import javax.xml.transform.Source
import javax.xml.transform.stream.StreamSource

import org.bom.forecast.jaxb.ProductType

class App {

	static void main(args) {
		if (args.length < 1) {
			println 'Usage: UnzipXml <input file>'
			println args.length.toString()
			System.exit(2)
		}
		
		println 'Town, StartTime, Summary, Maximum Temperature'
			
		def zipFileName = args[0]
		def zipFile = new java.util.zip.ZipFile(new File(zipFileName))
		zipFile.entries().each { entry ->
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ProductType.class)
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Source source = new StreamSource(zipFile.getInputStream(entry))
		
		    ProductType product = ((JAXBElement<ProductType>) jaxbUnmarshaller.unmarshal(source)).getValue()
			
		    product.getForecast()?.getArea()?.findAll { it.getType() == 'location' }.each { area ->
				area.getForecastPeriod()?.each { forecastPeriod ->
					print area.getDescription() + ', '
					print forecastPeriod.getStartTimeLocal()
					print ', '
					print forecastPeriod?.getWarningSummaryOrElementOrText()?.find { element ->
						element.getType() == 'precis'
					}?.getContent()[0]
					print ', '
					println forecastPeriod?.getWarningSummaryOrElementOrText()?.find { element ->
						element.getType() == 'air_temperature_maximum'
					}?.getValue()
			    }
			}
		}
	}
}