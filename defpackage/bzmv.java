package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmv implements bzmx {
    private final emcn a;

    public bzmv(emcn emcnVar) {
        emcnVar.getClass();
        this.a = emcnVar;
    }

    @Override // defpackage.bzmx
    public final void a(embz embzVar) {
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emca emcaVar2 = emca.a;
        emcaVar.e = this.a.bs;
        emcaVar.b |= 4;
    }

    @Override // defpackage.bzmx
    public final void b(emcw emcwVar) {
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcx emcxVar2 = emcx.a;
        emcxVar.e = this.a.bs;
        emcxVar.b |= 4;
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        bmoyVar.l(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzmv) && this.a == ((bzmv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailureReason(failureReason=" + this.a + ")";
    }
}
