package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdo implements tdh {
    public final String a;
    public final String b;
    public final String c;
    public final tds d;
    public final tdk e;
    public final tdk f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final fdae j;
    public final fdae k;

    public /* synthetic */ tdo(String str, String str2, String str3, tds tdsVar, tdk tdkVar, tdk tdkVar2, boolean z, fdae fdaeVar, fdae fdaeVar2, int i) {
        fdae fdaeVar3 = (i & 512) != 0 ? new fdae() { // from class: tdm
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        fdae fdaeVar4 = (i & 1024) != 0 ? new fdae() { // from class: tdn
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2;
        int i2 = i & 256;
        int i3 = i & 64;
        int i4 = i & 32;
        int i5 = i & 16;
        int i6 = i & 8;
        int i7 = i & 4;
        int i8 = i & 2;
        boolean z2 = !((i & 128) == 0);
        boolean z3 = i2 != 0;
        boolean z4 = z2 | z;
        boolean z5 = i3 != 0;
        tdk tdkVar3 = i4 != 0 ? null : tdkVar2;
        tdk tdkVar4 = i5 != 0 ? null : tdkVar;
        tds tdsVar2 = i6 != 0 ? null : tdsVar;
        str3 = i7 != 0 ? null : str3;
        str2 = i8 != 0 ? null : str2;
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tdsVar2;
        this.e = tdkVar4;
        this.f = tdkVar3;
        this.g = z5;
        this.h = z4;
        this.i = z3;
        this.j = fdaeVar3;
        this.k = fdaeVar4;
    }

    @Override // defpackage.tdh
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdo)) {
            return false;
        }
        tdo tdoVar = (tdo) obj;
        return fdbq.f(this.a, tdoVar.a) && fdbq.f(this.b, tdoVar.b) && fdbq.f(this.c, tdoVar.c) && fdbq.f(this.d, tdoVar.d) && fdbq.f(this.e, tdoVar.e) && fdbq.f(this.f, tdoVar.f) && this.g == tdoVar.g && this.h == tdoVar.h && this.i == tdoVar.i && fdbq.f(this.j, tdoVar.j) && fdbq.f(this.k, tdoVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        tds tdsVar = this.d;
        int iHashCode4 = (iHashCode3 + (tdsVar == null ? 0 : tdsVar.hashCode())) * 31;
        tdk tdkVar = this.e;
        int iHashCode5 = (iHashCode4 + (tdkVar == null ? 0 : tdkVar.hashCode())) * 31;
        tdk tdkVar2 = this.f;
        return ((((((((((iHashCode5 + (tdkVar2 != null ? tdkVar2.hashCode() : 0)) * 31) + tdl.a(this.g)) * 31) + tdl.a(this.h)) * 31) + tdl.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "FullBannerContent(id=" + this.a + ", title=" + this.b + ", text=" + this.c + ", symbol=" + this.d + ", confirmButton=" + this.e + ", dismissButton=" + this.f + ", showCloseButton=" + this.g + ", dismissAfterClicked=" + this.h + ", collapsible=" + this.i + ", onShownCallback=" + this.j + ", onHiddenCallback=" + this.k + ")";
    }
}
