package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmt implements bzmx {
    private final String a;

    public bzmt(String str) {
        this.a = str;
    }

    @Override // defpackage.bzmx
    public final void b(emcw emcwVar) {
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcx emcxVar2 = emcx.a;
        emcxVar.b |= 2048;
        emcxVar.o = this.a;
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        bmoyVar.k(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzmt) && fdbq.f(this.a, ((bzmt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CmsId(cmsId=" + this.a + ")";
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void a(embz embzVar) {
    }
}
