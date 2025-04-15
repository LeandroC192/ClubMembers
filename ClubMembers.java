import java.lang.reflect.Member;
import java.util.ArrayList;
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;
    ArrayList<MemberInfo> alumni = new ArrayList<MemberInfo>();
    public ClubMembers()
    {
        memberList = new ArrayList<MemberInfo>();
    }

    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear)
    {
        for(String s: names)
        {
            memberList.add(new MemberInfo(s, gradYear, true));
        }
        /* to be implemented in part (a) */ 
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) 
    {
        for(int i = 0; i < memberList.size(); i++)
        {
            MemberInfo member = memberList.get(i);
            if(member.getGradYear() <= year)
            {
                if(member.inGoodStanding())
                {
                    alumni.add(member);
                }
                memberList.remove(i);
                i--;
            }
        }
        return alumni;
        /* to be implemented in part (b) */ 
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
    public ArrayList<MemberInfo> getMemberList() 
    {
        return memberList;
        /* to be implemented in part (b) */ 
    }

    public void setMemberList(ArrayList<MemberInfo> members)
    {
        memberList = members;
    }
}
