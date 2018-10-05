package pojos;
// Generated 5 Oct, 2018 9:57:19 AM by Hibernate Tools 3.6.0



/**
 * ProjectInfo generated by hbm2java
 */
public class ProjectInfo  implements java.io.Serializable {


     private Integer projectId;
     private String projectName;
     private String clientName;
     private String projectManager;
     private int teamSize;

    public ProjectInfo() {
    }

    public ProjectInfo(String projectName, String clientName, String projectManager, int teamSize) {
       this.projectName = projectName;
       this.clientName = clientName;
       this.projectManager = projectManager;
       this.teamSize = teamSize;
    }
   
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getClientName() {
        return this.clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getProjectManager() {
        return this.projectManager;
    }
    
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }
    public int getTeamSize() {
        return this.teamSize;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }




}


