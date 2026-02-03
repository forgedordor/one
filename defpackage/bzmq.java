package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmq implements bzmx {
    private final String a;

    public bzmq(String str) {
        this.a = str;
    }

    @Override // defpackage.bzmx
    public final void a(embz embzVar) {
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emca emcaVar2 = emca.a;
        emcaVar.b |= 64;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        emcaVar.i = str;
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        bmoyVar.g(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzmq) && fdbq.f(this.a, ((bzmq) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "BugleId(bugleId=" + this.a + ")";
    }

    @Override // defpackage.bzmx
    public final /* synthetic */ void b(emcw emcwVar) {
    }
}
