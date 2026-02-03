package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctte {
    public final String a;
    public final dkrj b;
    public final dkrk c;
    public final int d;
    public final ctrn e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final fdap o;
    public final fdae p;
    public final abs q;
    public final fdae r;
    public final cttd s;

    public ctte() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctte)) {
            return false;
        }
        ctte ctteVar = (ctte) obj;
        return fdbq.f(this.a, ctteVar.a) && fdbq.f(this.b, ctteVar.b) && fdbq.f(this.c, ctteVar.c) && this.d == ctteVar.d && fdbq.f(this.e, ctteVar.e) && fdbq.f(this.f, ctteVar.f) && fdbq.f(this.g, ctteVar.g) && fdbq.f(this.h, ctteVar.h) && fdbq.f(this.i, ctteVar.i) && this.j == ctteVar.j && fdbq.f(this.k, ctteVar.k) && this.l == ctteVar.l && this.m == ctteVar.m && this.n == ctteVar.n && fdbq.f(this.o, ctteVar.o) && fdbq.f(this.p, ctteVar.p) && fdbq.f(this.q, ctteVar.q) && fdbq.f(this.r, ctteVar.r) && fdbq.f(this.s, ctteVar.s);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dkrj dkrjVar = this.b;
        int iHashCode2 = (iHashCode + (dkrjVar == null ? 0 : dkrjVar.hashCode())) * 31;
        dkrk dkrkVar = this.c;
        int iHashCode3 = (((iHashCode2 + (dkrkVar == null ? 0 : dkrkVar.hashCode())) * 31) + this.d) * 31;
        ctrn ctrnVar = this.e;
        int iHashCode4 = (((((((((((((((((((((((iHashCode3 + (ctrnVar == null ? 0 : ctrnVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + ctsz.a(this.j)) * 31) + this.k.hashCode()) * 31) + ctsz.a(this.l)) * 31) + ctsz.a(this.m)) * 31) + ctsz.a(this.n)) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31;
        abs absVar = this.q;
        int iHashCode5 = (iHashCode4 + (absVar == null ? 0 : absVar.hashCode())) * 31;
        fdae fdaeVar = this.r;
        return ((iHashCode5 + (fdaeVar != null ? fdaeVar.hashCode() : 0)) * 31) + this.s.hashCode();
    }

    public final String toString() {
        return "GroupNameUiData(topBarTitle=" + this.a + ", multiMonogramUiData=" + this.b + ", singleMonogramUiData=" + this.c + ", monogramOverflowCount=" + this.d + ", duplicateGroupNoticeUiData=" + this.e + ", textFieldTitle=" + this.f + ", groupName=" + this.g + ", placeholder=" + this.h + ", actionButtonText=" + this.i + ", actionButtonEnabled=" + this.j + ", groupNameDescriptionText=" + this.k + ", isVisible=" + this.l + ", isEnabled=" + this.m + ", isError=" + this.n + ", onTextChange=" + this.o + ", onDoneClick=" + this.p + ", onBackPressed=" + this.q + ", onGroupIconEditClick=" + this.r + ", flags=" + this.s + ")";
    }

    public ctte(String str, dkrj dkrjVar, dkrk dkrkVar, int i, ctrn ctrnVar, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, fdap fdapVar, fdae fdaeVar, abs absVar, fdae fdaeVar2, cttd cttdVar) {
        str4.getClass();
        this.a = str;
        this.b = dkrjVar;
        this.c = dkrkVar;
        this.d = i;
        this.e = ctrnVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z;
        this.k = str6;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = fdapVar;
        this.p = fdaeVar;
        this.q = absVar;
        this.r = fdaeVar2;
        this.s = cttdVar;
    }

    public /* synthetic */ ctte(byte[] bArr) {
        this("", null, null, 0, null, "", "", "", "", false, "", false, false, false, new fdap() { // from class: ctta
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return fctx.a;
            }
        }, new fdae() { // from class: cttb
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, null, null, new cttd(null));
    }
}
