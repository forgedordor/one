package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfv {
    public final List a;
    public final fdap b;
    private final fctc c = fctd.a(new fdae() { // from class: dpfu
        @Override // defpackage.fdae
        public final Object invoke() {
            List list = this.a.a;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((doig) it.next()).a());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    });

    public dpfv(List list, fdap fdapVar) {
        this.a = list;
        this.b = fdapVar;
    }

    public final String[] a() {
        return (String[]) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpfv)) {
            return false;
        }
        dpfv dpfvVar = (dpfv) obj;
        return fdbq.f(this.a, dpfvVar.a) && fdbq.f(this.b, dpfvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContentInsertionListener(mediaTypes=" + this.a + ", onContentInserted=" + this.b + ")";
    }
}
