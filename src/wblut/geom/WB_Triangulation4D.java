/*
 * This file is part of HE_Mesh, a library for creating and manipulating meshes.
 * It is dedicated to the public domain. To the extent possible under law,
 * I , Frederik Vanhoutte, have waived all copyright and related or neighboring
 * rights.
 * 
 * This work is published from Belgium. (http://creativecommons.org/publicdomain/zero/1.0/)
 * 
 */
package wblut.geom;

/**
 * 
 */
public class WB_Triangulation4D {
    
    /**
     * 
     */
    private int[] _tetrahedra;

    /**
     * 
     */
    public WB_Triangulation4D() {
    }

    /**
     * 
     *
     * @param tetra 
     */
    public WB_Triangulation4D(final int[] tetra) {
	_tetrahedra = tetra;
    }
    
    /**
     * 
     *
     * @param tetra 
     */
    public WB_Triangulation4D(final int[][] tetra) {
    	_tetrahedra = new int[tetra.length*5];
    	for(int i=0;i<tetra.length;i++){
    		_tetrahedra[4*i]=tetra[i][0];
    		_tetrahedra[4*i+1]=tetra[i][1];
    		_tetrahedra[4*i+2]=tetra[i][2];
    		_tetrahedra[4*i+3]=tetra[i][3];
    	}
        }

    /**
     * 
     *
     * @return 
     */
    public int[] getTetrahedra() {
	return _tetrahedra;
    }
}