package nesneYonelimliAnalizVeTasarimProje;

import java.util.List;

public class Publisher implements ISubject{
	private List<IObserver> subscribers;

	public void attach(IObserver observer) {
		subscribers.add(observer);
	}

	public void detach(IObserver observer) {
		subscribers.remove(observer);
	}

	public void notify(Durumlar durum) {
		for(IObserver subscriber : subscribers) {
			subscriber.update(durum);
		}
	}
	
}
