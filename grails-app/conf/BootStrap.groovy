import oncall.schedule.TeamMember

class BootStrap {

    def init = { servletContext ->
		if (!TeamMember.count()) {
			new TeamMember(name: "Jaime Soto", email: "jsoto@accesso.com", mobile: "4071231111").save(faileOnError: true)
			new TeamMember(name: "Sean Sharp", email: "ssharp@accesso.com", mobile: "4071232222").save(faileOnError: true)
			new TeamMember(name: "Jordan Deveroux", email: "jdeveroux@accesso.com", mobile: "4071234444").save(faileOnError: true)
		}
    }
    def destroy = {
    }
}
