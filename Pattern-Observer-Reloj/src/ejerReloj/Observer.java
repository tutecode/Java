package ejerReloj;

import java.io.Serializable;

public interface Observer {
	void update(Serializable value);
}
