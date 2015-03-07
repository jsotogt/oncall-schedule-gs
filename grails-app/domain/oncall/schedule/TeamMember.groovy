package oncall.schedule

import groovy.transform.ToString

@ToString(includePackage = false, includes = "name")
class TeamMember {
	String name
	String mobile
	String email

    static constraints = {
    }
}
