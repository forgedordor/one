package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culr {
    private final culo a;

    public culr(culo culoVar) {
        this.a = culoVar;
    }

    public final /* synthetic */ culp a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (culp) evsnVarBuild;
    }

    public final void b(boolean z) {
        culo culoVar = this.a;
        culoVar.copyOnWrite();
        culp culpVar = (culp) culoVar.instance;
        culp culpVar2 = culp.a;
        culpVar.b |= 1;
        culpVar.c = z;
    }
}
