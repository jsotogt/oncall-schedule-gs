package oncall.schedule

import grails.converters.JSON
import grails.converters.XML


class ScheduleController {

    def today() {
		render Team.list() as XML
	}
	
	def nextweek() {
		render Team.list() as JSON
	}
}
