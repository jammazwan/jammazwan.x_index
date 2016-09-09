"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|[TL;DR? _about:_](https://youtu.be/vea51DzmXyA)|
| --- | --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|[<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jamzVid1.png" alt="about" width="115" height="115" />](https://youtu.be/vea51DzmXyA)|
---

### Why not Official Camel Examples?

Jammazwan x__projects cover simpler issues than [official Camel examples](http://camel.apache.org/examples.html), and in a more isolated fashion. They are designed more for learning a part of Camel quickly, than a demo of Camel capabilities. Some x__projects are complex, but are marked accordingly.

[Official Camel examples](http://camel.apache.org/examples.html) are a great complement to the projects below for learning Camel.

---

# jammazwan.x_index:

An index of small, stand-alone **_x.._MyUseCase_** Camel example projects:

Search by title or description visually. **Or use the browser search** to search for "camel-jpa" or ....

If you want a more verbose JSON source to search, [*try this JSON source*](https://github.com/jammazwan/jammazwan.maker/blob/master/src/main/resources/xyzprojects.json)

---



[**xaa_SingleObjectToJsonFile**](https://github.com/jammazwan/xaa_SingleObjectToJsonFile)

 * Create an object, and save it as json in a file
 * Uses camel-jackson camel-file


[**xab_SeedDbFromManyCsvFiles**](https://github.com/jammazwan/xab_SeedDbFromManyCsvFiles)

 * Show off project only: Uses JPA and camel-bindy to seed a database from many different csv files
 * Uses camel-bindy camel-jpa camel-file


[**xac_PartialCopyCsvSplitAggregate**](https://github.com/jammazwan/xac_PartialCopyCsvSplitAggregate)

 * Create single field .csv file from multiple field .csv file, using simple splitter and aggregation
 * Uses camel-csv camel-file


[**xad_FileToConsoleLog**](https://github.com/jammazwan/xad_FileToConsoleLog)

 * Displays contents of a file in the console. Simplest possible file project
 * Uses camel-file


[**xae_CsvFileToObjects**](https://github.com/jammazwan/xae_CsvFileToObjects)

 * Opens .csv file, creates java objects from contents
 * Uses camel-file, camel-bindy


[**xaf_SplitXML**](https://github.com/jammazwan/xaf_SplitXML)

 * Different options for splitting a body with XML content
 * Uses camel-file camel-jackson camel-jacksonxml


[**xag_SplitJSON**](https://github.com/jammazwan/xag_SplitJSON)

 * Different options for splitting a body with JSON content
 * Uses camel-jsonpath camel-file


[**xah_SplitIterable**](https://github.com/jammazwan/xah_SplitIterable)

 * The mother of all splits: an Iterable body, or a bean, or an expression
 * Uses camel-core


[**xai_SplitString**](https://github.com/jammazwan/xai_SplitString)

 * Different options for splitting a body with a String as content
 * Uses camel-file


[**xal_SplitAggregate**](https://github.com/jammazwan/xal_SplitAggregate)

 * Splitting and aggregating back in the same call
 * Uses 


[**xam_CsvFileToRandomXmlJsonFile**](https://github.com/jammazwan/xam_CsvFileToRandomXmlJsonFile)

 * Show off project only. Generates random XML and JSON files from CSV input
 * Uses camel-file camel-bindy camel-jackson camel-jaxb


[**xan_SingleObjectToXmlJaxb**](https://github.com/jammazwan/xan_SingleObjectToXmlJaxb)

 * Uses JAXB to create two xml files from two different objects, attributes, elements
 * Uses camel-file camel-jaxb


[**xao_SingleObjectToXmlJackson**](https://github.com/jammazwan/xao_SingleObjectToXmlJackson)

 * Uses JacksonXML to create xml from a single object
 * Uses camel-file camel-jacksonxml


[**xap_HttpToFile**](https://github.com/jammazwan/xap_HttpToFile)

 * Uses camel-http to copy wired.com to file
 * Uses camel-file camel-http


[**xaq_JettyHttpToFile**](https://github.com/jammazwan/xaq_JettyHttpToFile)

 * Uses camel-jetty to copy wired.com to file
 * Uses camel-file camel-jetty


[**xar_FileToFtp**](https://github.com/jammazwan/xar_FileToFtp)

 * Uses camel-ftp to write a file from source
 * Uses camel-file camel-ftp


[**xas_TimerOptions**](https://github.com/jammazwan/xas_TimerOptions)

 * Uses timer a few different ways
 * Uses camel-core


[**xau_VelocityTemplateToFile**](https://github.com/jammazwan/xau_VelocityTemplateToFile)

 * Uses the Velocity template engine to write files
 * Uses camel-file camel-velocity


[**xav_CxfCodeFirstSimple**](https://github.com/jammazwan/xav_CxfCodeFirstSimple)

 * Code first CXF (SOAP) example project. Accepts, and returns simple input. 1 of 4
 * Uses camel-cxf cxf-rt-transports-http-jetty


[**xaw_CxfWsdlFirstSimple**](https://github.com/jammazwan/xaw_CxfWsdlFirstSimple)

 * WSDL first CXF (SOAP) example project. Accepts, and returns simple input. 2 of 4
 * Uses camel-cxf cxf-rt-transports-http-jetty wsdl2java


[**xax_CxfCodeFirstComplex**](https://github.com/jammazwan/xax_CxfCodeFirstComplex)

 * Code first CXF (SOAP) example project. Accepts, and returns complex objects. 3 of 4
 * Uses camel-cxf cxf-rx-transports-http-jetty


[**xay_CxfWsdlFirstComplex**](https://github.com/jammazwan/xay_CxfWsdlFirstComplex)

 * Code first CXF (SOAP) example project. Accepts, and returns complex objects.  4 of 4
 * Uses camel-cxf cxf-rt-transports-http-jetty wsdl2java


[**xaz_TransformWithBean**](https://github.com/jammazwan/xaz_TransformWithBean)

 * Transform a body using a bean
 * Uses camel-file


[**xba_TransformWithExpressions**](https://github.com/jammazwan/xba_TransformWithExpressions)

 * Exploration of several transforms executed with Camel Expressions
 * Uses camel-file


[**xbb_TransformWithXslt**](https://github.com/jammazwan/xbb_TransformWithXslt)

 * Transform an XML file with XSLT
 * Uses camel-file


[**xbc_NonEIPMultipleTo**](https://github.com/jammazwan/xbc_NonEIPMultipleTo)

 * What happens if we use multiple to(...) statements instead of proper EIP patterns?
 * Uses camel-file


[**xbd_EIPdistributionComparison**](https://github.com/jammazwan/xbd_EIPdistributionComparison)

 * show RecipientList RoutingSlip DynamicRoute Wiretap Multicast as compared to each other
 * Uses camel-file


[**xbe_FileConsumptionOptions**](https://github.com/jammazwan/xbe_FileConsumptionOptions)

 * Exploration - File consumption options - basic
 * Uses camel-file


[**xbf_FileProductionOptions**](https://github.com/jammazwan/xbf_FileProductionOptions)

 * Exploration - File production and move options - basic
 * Uses camel-file


[**xbg_JpaCreateOfCRUD**](https://github.com/jammazwan/xbg_JpaCreateOfCRUD)

 * JPA - Create of CRUD
 * Uses camel-file, camel-jpa, derbyDB


[**xbk_JmsLocal**](https://github.com/jammazwan/xbk_JmsLocal)

 * JMS messaging to a local VM only
 * Uses camel-file camel-jms


[**xbl_JmsRemote**](https://github.com/jammazwan/xbl_JmsRemote)

 * JMS messaging to a remote running JMS server
 * Uses camel-file camel-jms


[**xbm_BeanParameters**](https://github.com/jammazwan/xbm_BeanParameters)

 * Examples of calling a bean with different combinations of camel inputs
 * Uses camel-core


[**xbn_Properties**](https://github.com/jammazwan/xbn_Properties)

 * Consuming a basic properties file in a camel project.
 * Uses camel-core


[**xbo_BareBonesCamelMicroService**](https://github.com/jammazwan/xbo_BareBonesCamelMicroService)

 * Bare bones server - microservice Camel
 * Uses camel-core


[**xbp_SpringBootBareBonesCamelMicroService**](https://github.com/jammazwan/xbp_SpringBootBareBonesCamelMicroService)

 * Bare bones server - microservice Camel on a Spring Boot base
 * Uses camel-core springboot


[**xbq_DroolsCamelIntegration**](https://github.com/jammazwan/xbq_DroolsCamelIntegration)

 * Bare bones Drools run inside a Camel route
 * Uses camel-file, drools


---

