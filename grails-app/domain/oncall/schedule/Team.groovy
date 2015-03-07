package oncall.schedule

class Team {
	String name
	Date startDate
	Date endDate
	static hasMany = [members: TeamMember]

    static constraints = {
		name()
		members()
		startDate()
		endDate()
    }
}
