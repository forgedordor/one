package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrj {
    private final List a = new ArrayList();

    public final synchronized rrh a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return rrk.a;
        }
        for (rri rriVar : this.a) {
            if (rriVar.a(cls, cls2)) {
                return rriVar.c;
            }
        }
        throw new IllegalArgumentException(a.H(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (rri rriVar : this.a) {
            if (rriVar.a(cls, cls2)) {
                Class cls3 = rriVar.b;
                if (!arrayList.contains(cls3)) {
                    arrayList.add(cls3);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, rrh rrhVar) {
        this.a.add(new rri(cls, cls2, rrhVar));
    }
}
