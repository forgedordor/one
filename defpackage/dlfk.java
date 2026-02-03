package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfk implements dlfr {
    public final djrr a;
    public final dlen b;
    public final boolean c;
    private final String d;
    private final String e;
    private final fdae f;
    private final boolean g;
    private final fdae h;

    public dlfk(String str, String str2, djrr djrrVar, dlen dlenVar, boolean z, fdae fdaeVar, fdae fdaeVar2) {
        str.getClass();
        dlenVar.getClass();
        this.d = str;
        this.e = str2;
        this.a = djrrVar;
        this.b = dlenVar;
        this.c = z;
        this.f = fdaeVar;
        this.g = false;
        this.h = fdaeVar2;
    }

    public static /* synthetic */ dlfk e(dlfk dlfkVar, fdae fdaeVar) {
        return new dlfk(dlfkVar.d, dlfkVar.e, dlfkVar.a, dlfkVar.b, dlfkVar.c, fdaeVar, dlfkVar.h);
    }

    @Override // defpackage.dlfg
    public final fdae a() {
        return this.f;
    }

    @Override // defpackage.dlfr
    public final dlen b() {
        return this.b;
    }

    @Override // defpackage.dlfr
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dlfr
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlfk)) {
            return false;
        }
        dlfk dlfkVar = (dlfk) obj;
        if (!fdbq.f(this.d, dlfkVar.d) || !fdbq.f(this.e, dlfkVar.e) || this.a != dlfkVar.a || !fdbq.f(this.b, dlfkVar.b) || this.c != dlfkVar.c || !fdbq.f(this.f, dlfkVar.f)) {
            return false;
        }
        boolean z = dlfkVar.g;
        return fdbq.f(this.h, dlfkVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        djrr djrrVar = this.a;
        return ((((((((((iHashCode2 + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + this.b.hashCode()) * 31) + dlfh.a(this.c)) * 31) + this.f.hashCode()) * 31) + dlfh.a(false)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Basic(suggestionPrefix=" + this.d + ", displayText=" + this.e + ", icon=" + this.a + ", styleData=" + this.b + ", isEmojiOnly=" + this.c + ", onClick=" + this.f + ", closeable=false, onClose=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dlfk(String str, String str2, djrr djrrVar, dlen dlenVar, boolean z, int i) {
        dlen dlelVar = (i & 8) != 0 ? new dlel(null) : dlenVar;
        int i2 = i & 2;
        this(str, i2 != 0 ? null : str2, (i & 4) != 0 ? null : djrrVar, dlelVar, ((i & 16) == 0) & z, new fdae() { // from class: dlfi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: dlfj
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
