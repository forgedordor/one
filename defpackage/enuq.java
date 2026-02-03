package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enuq {
    public final enkn a;

    public enuq(enkn enknVar) {
        this.a = enknVar;
    }

    public final /* synthetic */ enko a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (enko) evsnVarBuild;
    }

    public final void b(enkq enkqVar) {
        enkn enknVar = this.a;
        enknVar.copyOnWrite();
        enko enkoVar = (enko) enknVar.instance;
        enko enkoVar2 = enko.a;
        enkoVar.f = enkqVar;
        enkoVar.c |= 64;
    }
}
