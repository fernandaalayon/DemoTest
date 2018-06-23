package com.s4n.demotest.pageobject.general

import com.codeborne.selenide.Selenide.$
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.Selenide.close
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner.url

import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement


class GeneralPage {

  def openUrl(url:String): GeneralPage = {
   open(url)
    return this
  }

  def closeBrowser : Unit ={
    close()
  }

  def getLinkText(link: String): SelenideElement = {
    $(Selectors.byLinkText(link))
  }
}
