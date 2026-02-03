package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqh {
    public final List a;
    public final diih b;
    public final fdae c;
    public final fdae d;
    private final String e;

    public diqh() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqh)) {
            return false;
        }
        diqh diqhVar = (diqh) obj;
        if (!fdbq.f(this.a, diqhVar.a)) {
            return false;
        }
        String str = diqhVar.e;
        return fdbq.f(null, null) && fdbq.f(this.b, diqhVar.b) && fdbq.f(this.c, diqhVar.c) && fdbq.f(this.d, diqhVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        diih diihVar = this.b;
        return ((((iHashCode + (diihVar == null ? 0 : diihVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BadgeGroupUiData(items=" + this.a + ", contentDescription=null, initialCompositionElement=" + this.b + ", onClick=" + this.c + ", onShown=" + this.d + ")";
    }

    public /* synthetic */ diqh(List list, diih diihVar, fdae fdaeVar, fdae fdaeVar2, int i) {
        list = (i & 1) != 0 ? fcvo.a : list;
        diihVar = (i & 4) != 0 ? null : diihVar;
        fdaeVar = (i & 8) != 0 ? new fdae() { // from class: diqf
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        fdaeVar2 = (i & 16) != 0 ? new fdae() { // from class: diqg
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2;
        list.getClass();
        fdaeVar.getClass();
        fdaeVar2.getClass();
        this.a = list;
        this.e = null;
        this.b = diihVar;
        this.c = fdaeVar;
        this.d = fdaeVar2;
    }
}
