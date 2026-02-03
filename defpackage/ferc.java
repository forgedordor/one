package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferc extends ArrayList implements Serializable {
    private static final long serialVersionUID = -8875923766224921031L;

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (obj instanceof feou) {
            return super.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(feou.class.getName())));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(get(i).toString());
        }
        return stringBuffer.toString();
    }
}
