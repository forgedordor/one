package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkj {
    public final List a;
    public final fdap b;
    public final fdae c;
    public final fdae d;
    public final hsf e;
    public final djki f;

    public djkj() {
        this(null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djkj)) {
            return false;
        }
        djkj djkjVar = (djkj) obj;
        return fdbq.f(this.a, djkjVar.a) && fdbq.f(this.b, djkjVar.b) && fdbq.f(this.c, djkjVar.c) && fdbq.f(this.d, djkjVar.d) && fdbq.f(this.e, djkjVar.e) && fdbq.f(this.f, djkjVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "ContactBarUiData(chips=" + this.a + ", onSearchTextChange=" + this.b + ", onBackspaceInput=" + this.c + ", onDoneInput=" + this.d + ", searchText=" + this.e + ", flags=" + this.f + ")";
    }

    public djkj(List list, fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, hsf hsfVar, djki djkiVar) {
        list.getClass();
        fdapVar.getClass();
        fdaeVar.getClass();
        fdaeVar2.getClass();
        hsfVar.getClass();
        djkiVar.getClass();
        this.a = list;
        this.b = fdapVar;
        this.c = fdaeVar;
        this.d = fdaeVar2;
        this.e = hsfVar;
        this.f = djkiVar;
    }

    public /* synthetic */ djkj(djki djkiVar, int i) {
        this((i & 1) != 0 ? fcvo.a : null, (i & 2) != 0 ? new fdap() { // from class: djke
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return fctx.a;
            }
        } : null, (i & 4) != 0 ? new fdae() { // from class: djkf
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : null, (i & 8) != 0 ? new fdae() { // from class: djkg
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : null, (i & 16) != 0 ? new hpl("", hsi.a) : null, (i & 32) != 0 ? new djki(null) : djkiVar);
    }
}
