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
package jast.ast.nodes.collections;
import jast.ast.collections.TypedHashArrayBase;
import jast.ast.nodes.LocalVariableDeclaration;

public class LocalVariableArrayImpl extends    TypedHashArrayBase
                                    implements LocalVariableArray
{

    public void add(LocalVariableDeclaration var)
    {
        set(var.getName(), var);
    }

    public LocalVariableDeclaration get(int idx)
    {
        return (LocalVariableDeclaration)at(idx);
    }

    public LocalVariableDeclaration get(String name)
    {
        return (LocalVariableDeclaration)at(name);
    }

    public LocalVariableIterator getIterator()
    {
        return new LocalVariableIterator()
        {
            private int _curIdx = 0;

            public boolean hasNext()
            {
                return (_curIdx < getCount());
            }

            public LocalVariableDeclaration getNext()
            {
                return get(_curIdx++);
            }
        };
    }
}
