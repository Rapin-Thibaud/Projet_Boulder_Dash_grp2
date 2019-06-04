/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package model;

import java.util.Map;

import org.junit.Test;

public class ModelTest {
	Map map;
	private final Model model = new Model();

	@Test
	public void setPlayableMapTest() {
		this.model.setMap(this.map);
		assertEquals(this.map, this.model.getMap());
	}

	@Test
	public void getIsRunningTest() {
		assertEquals(this.map, this.model.getMap());
	}
}
