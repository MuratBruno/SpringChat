package chat.beans;

public abstract class HelloBeanFactory {
	public String userDefault;
	
	public abstract HelloBean CreerHelloDefault() ;
	public abstract HelloBean CreerHelloHasard() ;
	protected HelloBeanFactory() {
		userDefault="Visiteur inconnu";
	}
}
