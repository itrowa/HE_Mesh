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
 * Simple interface for anything that present itself as a mutable 2D or 3D tuple
 * of double.
 *
 * @author Frederik Vanhoutte
 *
 */
public interface WB_MutableCoord extends WB_Coord {
    /**
     * Set x.
     *
     * @param x
     */
    public void setX(double x);

    /**
     * Set y.
     *
     * @param y
     */
    public void setY(double y);

    /**
     * Set z.
     *
     * @param z
     */
    public void setZ(double z);

    /**
     * Set w.
     *
     * @param w
     */
    public void setW(double w);

    /**
     * Set i'th ordinate. An implementation of this interface does not
     * necessarily check the validity of the passed parameter.
     *
     * @param i
     *            ordinate to set
     * @param v
     *            value
     */
    public void setCoord(int i, double v);

    /**
     * Set to value of tuple.
     *
     * @param p
     *            tuple to copy
     */
    public void set(WB_Coord p);

    /**
     * Set to coordinate values.
     *
     * @param x
     *            x-ordinate
     * @param y
     *            y-ordinate
     */
    public void set(double x, double y);

    /**
     * Set to coordinate values.
     *
     * @param x
     *            x-ordinate
     * @param y
     *            y-ordinate
     * @param z
     *            z-ordinate
     */
    public void set(double x, double y, double z);

    /**
     * Set to coordinate values.
     *
     * @param x
     *            x-ordinate
     * @param y
     *            y-ordinate
     * @param z
     *            z-ordinate
     * @param w
     *            w-ordinate
     */
    public void set(double x, double y, double z, double w);
}
