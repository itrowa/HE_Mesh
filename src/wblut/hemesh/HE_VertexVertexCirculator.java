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

import java.util.Iterator;


public class HE_VertexVertexCirculator implements Iterator<HE_Vertex> {

	/**
	 *
	 */
	private final HE_Halfedge _start;

	/**
	 *
	 */
	private HE_Halfedge _current;

	/**
	 *
	 *
	 * @param v
	 */
	HE_VertexVertexCirculator(final HE_Vertex v) {
		_start = v.getHalfedge();
		_current = null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (_start == null) {
			return false;
		}
		return (_current == null) || (_current.getNextInVertex() != _start);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Iterator#next()
	 */
	@Override
	public HE_Vertex next() {
		if (_current == null) {
			_current = _start;
		} else {
			_current = _current.getNextInVertex();
		}
		return _current.getEndVertex();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}