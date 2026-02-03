package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmr implements bzmx {
    private final byiv a;

    public bzmr(byiv byivVar) {
        this.a = byivVar;
    }

    @Override // defpackage.bzmx
    public final void a(embz embzVar) {
        byiv byivVar = this.a;
        int i = byivVar.h;
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emca emcaVar2 = emca.a;
        emcaVar.b |= 8;
        emcaVar.f = i;
        int i2 = true != byivVar.g ? 3 : 2;
        embzVar.copyOnWrite();
        emca emcaVar3 = (emca) embzVar.instance;
        emcaVar3.g = i2 - 1;
        emcaVar3.b |= 16;
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        byiv byivVar = this.a;
        bmoyVar.i(byivVar);
        bmoyVar.f(byivVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzmr) && fdbq.f(this.a, ((bzmr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CmsBackupContext(parameters=" + this.a + ")";
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void b(emcw emcwVar) {
    }
}
