package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diot implements dkgq {
    public final dilm a;
    public final dios b;
    public final String c;
    public final boolean d;
    public final fdae e;
    private final fdae f;

    public diot(dilm dilmVar, dios diosVar, String str, boolean z, fdae fdaeVar, fdae fdaeVar2) {
        fdaeVar.getClass();
        this.a = dilmVar;
        this.b = diosVar;
        this.c = str;
        this.d = z;
        this.f = fdaeVar;
        this.e = fdaeVar2;
    }

    public static /* synthetic */ diot e(diot diotVar, dilm dilmVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            dilmVar = diotVar.a;
        }
        dilm dilmVar2 = dilmVar;
        dios diosVar = (i & 2) != 0 ? diotVar.b : null;
        if ((i & 4) != 0) {
            str = diotVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = diotVar.d;
        }
        fdae fdaeVar = diotVar.f;
        fdae fdaeVar2 = diotVar.e;
        dilmVar2.getClass();
        diosVar.getClass();
        return new diot(dilmVar2, diosVar, str2, z, fdaeVar, fdaeVar2);
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.f;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diot)) {
            return false;
        }
        diot diotVar = (diot) obj;
        return fdbq.f(this.a, diotVar.a) && fdbq.f(this.b, diotVar.b) && fdbq.f(this.c, diotVar.c) && this.d == diotVar.d && fdbq.f(this.f, diotVar.f) && fdbq.f(this.e, diotVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AttachmentBubbleUiData(info=" + this.a + ", flags=" + this.b + ", contentDescription=" + this.c + ", isHighlighted=" + this.d + ", onClick=" + this.f + ", onLayout=" + this.e + ")";
    }

    public /* synthetic */ diot(dilm dilmVar, dios diosVar, String str, boolean z, fdae fdaeVar, int i) {
        this(dilmVar, (i & 2) != 0 ? new dios(null) : diosVar, str, ((i & 8) == 0) & z, (i & 16) != 0 ? new fdae() { // from class: diop
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : fdaeVar, new fdae() { // from class: dioq
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
