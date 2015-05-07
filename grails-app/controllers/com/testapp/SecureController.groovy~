package com.testapp

import grails.plugin.springsecurity.annotation.Secured

class SecureController {
   @Secured(['ROLE_ADMIN'])
   def index() {
      render 'Acceso restrinjido pascualito, pedi unas credenciales'
// IMPORTANTE dependiendo donde se indica la anotacion de @Secure y el rol permitido se restringe una accion o todo el controller.
   }
}
