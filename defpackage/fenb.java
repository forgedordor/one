package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fenb extends ArrayList implements Serializable {
    private static final long serialVersionUID = 7308557606558767449L;

    /* JADX WARN: Multi-variable type inference failed */
    public final fenb a(String str) {
        fenb fenbVar = new fenb();
        int size = size();
        for (int i = 0; i < size; i++) {
            femz femzVar = (femz) get(i);
            if (femzVar.a.equals(str)) {
                fenbVar.add(femzVar);
            }
        }
        return fenbVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (obj instanceof femz) {
            return super.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(femz.class.getName())));
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
