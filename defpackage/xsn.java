package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsn implements divg {
    public final fdpl a;
    public final List b;
    public final xsk c;
    private final boolean d;
    private final fdae e;

    /* JADX WARN: Multi-variable type inference failed */
    public xsn() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new xsn(this.a, this.b, this.c, this.d, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.e;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsn)) {
            return false;
        }
        xsn xsnVar = (xsn) obj;
        return fdbq.f(this.a, xsnVar.a) && fdbq.f(this.b, xsnVar.b) && fdbq.f(this.c, xsnVar.c) && this.d == xsnVar.d && fdbq.f(this.e, xsnVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        xsk xskVar = this.c;
        return (((((iHashCode * 31) + (xskVar == null ? 0 : xskVar.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ThemeSelectionUiData(currentThemeStateFlow=" + this.a + ", themes=" + this.b + ", menuButtonUiData=" + this.c + ", includeScrim=" + this.d + ", onDismiss=" + this.e + ")";
    }

    public xsn(fdpl fdplVar, List list, xsk xskVar, boolean z, fdae fdaeVar) {
        fdplVar.getClass();
        list.getClass();
        fdaeVar.getClass();
        this.a = fdplVar;
        this.b = list;
        this.c = xskVar;
        this.d = z;
        this.e = fdaeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xsn(fdpl fdplVar, xsk xskVar, fdae fdaeVar, int i) {
        List listA;
        fdpl fdpuVar = (i & 1) != 0 ? new fdpu(null) : fdplVar;
        if ((i & 2) != 0) {
            int i2 = xsj.a;
            listA = xsj.a();
        } else {
            listA = null;
        }
        this(fdpuVar, listA, (i & 4) != 0 ? null : xskVar, (i & 8) != 0, (i & 16) != 0 ? new fdae() { // from class: xsm
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar);
    }
}
