package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entr {
    public final entd a;

    public entr(entd entdVar) {
        this.a = entdVar;
    }

    public final /* synthetic */ ente a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (ente) evsnVarBuild;
    }

    public final void b(boolean z) {
        entd entdVar = this.a;
        entdVar.copyOnWrite();
        ente enteVar = (ente) entdVar.instance;
        ente enteVar2 = ente.a;
        enteVar.b |= 16;
        enteVar.g = z;
    }

    public final void c(boolean z) {
        entd entdVar = this.a;
        entdVar.copyOnWrite();
        ente enteVar = (ente) entdVar.instance;
        ente enteVar2 = ente.a;
        enteVar.b |= 8;
        enteVar.f = z;
    }
}
