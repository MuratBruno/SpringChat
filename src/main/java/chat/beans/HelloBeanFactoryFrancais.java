package chat.beans;

public class HelloBeanFactoryFrancais extends HelloBeanFactory {
	
	public HelloBeanFactoryFrancais(){
		super();
	}

	@Override
	public HelloBean CreerHelloDefault() {
		// TODO Auto-generated method stub
		HelloBean h= new HelloBean();
		h.setUser(this.userDefault);
		return h;
		
	}

	@Override
	public HelloBean CreerHelloHasard() {
		// TODO Auto-generated method stub
		HelloBean h= new HelloBean();
		String[] listeUsersRandom= {"Dupont","Murat"};
		h.setUser(listeUsersRandom[1]);
		return h;
	}
	
}
