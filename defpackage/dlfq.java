package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfq implements dlfr {
    public final dlfp a;
    public final dlen b;
    private final String c;
    private final String d;
    private final fdae e;
    private final boolean f;
    private final fdae g;

    public dlfq(String str, String str2, dlfp dlfpVar, dlen dlenVar, fdae fdaeVar, fdae fdaeVar2) {
        str.getClass();
        dlenVar.getClass();
        this.c = str;
        this.d = str2;
        this.a = dlfpVar;
        this.b = dlenVar;
        this.e = fdaeVar;
        this.f = false;
        this.g = fdaeVar2;
    }

    public static /* synthetic */ dlfq e(dlfq dlfqVar, fdae fdaeVar) {
        return new dlfq(dlfqVar.c, dlfqVar.d, dlfqVar.a, dlfqVar.b, fdaeVar, dlfqVar.g);
    }

    @Override // defpackage.dlfg
    public final fdae a() {
        return this.e;
    }

    @Override // defpackage.dlfr
    public final dlen b() {
        return this.b;
    }

    @Override // defpackage.dlfr
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dlfr
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlfq)) {
            return false;
        }
        dlfq dlfqVar = (dlfq) obj;
        if (!fdbq.f(this.c, dlfqVar.c) || !fdbq.f(this.d, dlfqVar.d) || !fdbq.f(this.a, dlfqVar.a) || !fdbq.f(this.b, dlfqVar.b) || !fdbq.f(this.e, dlfqVar.e)) {
            return false;
        }
        boolean z = dlfqVar.f;
        return fdbq.f(this.g, dlfqVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CustomIcon(suggestionPrefix=" + this.c + ", displayText=" + this.d + ", iconSource=" + this.a + ", styleData=" + this.b + ", onClick=" + this.e + ", closeable=false, onClose=" + this.g + ")";
    }

    public /* synthetic */ dlfq(String str, String str2, dlfp dlfpVar, dlen dlenVar, int i) {
        this(str, (i & 2) != 0 ? null : str2, dlfpVar, (i & 8) != 0 ? new dlem() : dlenVar, new fdae() { // from class: dlfl
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dlfm
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
