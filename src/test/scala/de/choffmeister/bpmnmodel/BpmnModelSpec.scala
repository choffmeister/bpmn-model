package de.choffmeister.bpmnmodel

import org.specs2.mutable._

class BpmnModelSpec extends SpecificationWithJUnit {
  "BpmnModel" should {
    "load models" in {
      val model1 = BpmnModel.loadFromXmlResource("/test1.bpmn20.xml")

      model1.rootElement must haveSize(1)
      model1.rootElement(0).value must beAnInstanceOf[TProcess]
      model1.rootElement(0).value.asInstanceOf[TProcess].id === Some("hello")
    }
  }
}
