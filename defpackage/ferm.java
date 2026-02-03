package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferm extends ArrayList implements Serializable {
    private static final long serialVersionUID = 1243262497035300445L;

    public ferm() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (obj instanceof ferl) {
            return super.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(ferl.class.getName())));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public ferm(String str) {
        boolean zB = fewr.b("ical4j.compatibility.outlook");
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            if (zB) {
                add(new ferl(stringTokenizer.nextToken().replaceAll(" ", "")));
            } else {
                add(new ferl(stringTokenizer.nextToken()));
            }
        }
    }
}
