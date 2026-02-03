package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgn implements zgr {
    private final zij a;
    private final boolean b;
    private final fdae c;
    private final String d;
    private final fdae e;

    public /* synthetic */ zgn(zij zijVar, boolean z, fdae fdaeVar, String str, fdae fdaeVar2, int i) {
        this.a = zijVar;
        this.b = ((i & 2) == 0) & z;
        this.c = (i & 4) != 0 ? null : fdaeVar;
        this.d = (i & 8) != 0 ? null : str;
        this.e = (i & 16) != 0 ? null : fdaeVar2;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.a.n;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.a.k;
    }

    @Override // defpackage.zgr
    public final zgq e() {
        return this.a.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgn)) {
            return false;
        }
        zgn zgnVar = (zgn) obj;
        return fdbq.f(this.a, zgnVar.a) && this.b == zgnVar.b && fdbq.f(this.c, zgnVar.c) && fdbq.f(this.d, zgnVar.d) && fdbq.f(this.e, zgnVar.e);
    }

    @Override // defpackage.dkez
    public final dker f() {
        return this.a.i;
    }

    @Override // defpackage.dkez
    public final dlhy g() {
        return null;
    }

    @Override // defpackage.dkez
    public final Integer h() {
        return this.a.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdae fdaeVar = this.c;
        int iHashCode2 = (((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        fdae fdaeVar2 = this.e;
        return iHashCode3 + (fdaeVar2 != null ? fdaeVar2.hashCode() : 0);
    }

    @Override // defpackage.dkez
    public final Integer i() {
        return this.a.l;
    }

    @Override // defpackage.dkez
    public final int j() {
        return this.a.p;
    }

    public final String toString() {
        return "MaskedVideoBubbleUiData(videoBubbleUiData=" + this.a + ", showLoadingIndicator=" + this.b + ", onClickToggle=" + this.c + ", contentMaskText=" + this.d + ", onClickContentMask=" + this.e + ")";
    }
}
