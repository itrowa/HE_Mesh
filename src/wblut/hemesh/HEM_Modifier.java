/*
 * This file is part of HE_Mesh, a library for creating and manipulating meshes.
 * It is dedicated to the public domain. To the extent possible under law,
 * I , Frederik Vanhoutte, have waived all copyright and related or neighboring
 * rights.
 *
 * This work is published from Belgium. (http://creativecommons.org/publicdomain/zero/1.0/)
 *
 */
package wblut.hemesh;


/**
 * @author Frederik Vanhoutte (W:Blut)
 *
 */
abstract public class HEM_Modifier extends HE_Machine {
	/**
	 * Instantiates a new HEM_Modifier.
	 */
	public HEM_Modifier() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see wblut.hemesh.HE_Machine#apply(wblut.hemesh.HE_Mesh)
	 */
	@Override
	public abstract HE_Mesh apply(final HE_Mesh mesh);

	/*
	 * (non-Javadoc)
	 *
	 * @see wblut.hemesh.HE_Machine#apply(wblut.hemesh.HE_Selection)
	 */
	@Override
	public abstract HE_Mesh apply(final HE_Selection selection);
}
