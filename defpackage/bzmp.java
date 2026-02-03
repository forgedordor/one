package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmp implements bzmx {
    private final int a;

    public bzmp(int i) {
        this.a = i;
    }

    @Override // defpackage.bzmx
    public final void a(embz embzVar) {
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emca emcaVar2 = emca.a;
        emcaVar.b |= 8;
        emcaVar.f = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzmp) && this.a == ((bzmp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AttemptCount(attemptCount=" + this.a + ")";
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void b(emcw emcwVar) {
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void c(bmoy bmoyVar) {
    }
}
