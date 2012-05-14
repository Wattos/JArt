/*
 * Copyright (C) 2002 Thomas Dudziak, Jan Wloka
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without 
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, subject to the following 
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */
package jast.profiler;
import java.util.Vector;

public class DoubleArray
{
    private Vector _data = new Vector();

    public void add(double value)
    {
        _data.addElement(new Double(value));
    }

    public double get(int idx)
    {
        return ((Double)_data.elementAt(idx)).doubleValue();
    }

    public int getCount()
    {
        return _data.size();
    }

    public boolean isEmpty()
    {
        return _data.isEmpty();
    }

    public void set(int idx, double value)
    {
        _data.setElementAt(new Double(value), idx);
    }
}
