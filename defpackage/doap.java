package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doap {
    private final doav a;

    public doap(doav doavVar) {
        this.a = doavVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable, java.util.Collection] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof doap)) {
            return false;
        }
        doav doavVar = this.a;
        doav doavVar2 = ((doap) obj).a;
        if (fdbq.f(doavVar.e(), doavVar2.e()) || fdbq.f(doavVar.f(), doavVar2.f())) {
            return true;
        }
        ?? C = doavVar2.c();
        if (!C.isEmpty()) {
            Iterator it = C.iterator();
            while (it.hasNext()) {
                if (fdbq.f(((doau) it.next()).b, doavVar.f())) {
                    return true;
                }
            }
        }
        ?? C2 = doavVar.c();
        if (!C2.isEmpty()) {
            Iterator it2 = C2.iterator();
            while (it2.hasNext()) {
                if (fdbq.f(((doau) it2.next()).b, doavVar2.f())) {
                    return true;
                }
            }
        }
        if (!fdgn.H(doavVar.e()) && !fdgn.H(doavVar2.e())) {
            return false;
        }
        ?? C3 = doavVar2.c();
        if (C3.isEmpty()) {
            return false;
        }
        for (doau doauVar : C3) {
            ?? C4 = doavVar.c();
            if (!C4.isEmpty()) {
                Iterator it3 = C4.iterator();
                while (it3.hasNext()) {
                    if (fdbq.f(((doau) it3.next()).b, doauVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
