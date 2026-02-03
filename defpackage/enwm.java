package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwm {
    private final enkp a;

    public enwm(enkp enkpVar) {
        this.a = enkpVar;
    }

    public final /* synthetic */ enkq a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (enkq) evsnVarBuild;
    }

    public final void b(long j) {
        enkp enkpVar = this.a;
        enkpVar.copyOnWrite();
        enkq enkqVar = (enkq) enkpVar.instance;
        enkq enkqVar2 = enkq.a;
        enkqVar.b |= 1;
        enkqVar.c = j;
    }

    public final void c(boolean z) {
        enkp enkpVar = this.a;
        enkpVar.copyOnWrite();
        enkq enkqVar = (enkq) enkpVar.instance;
        enkq enkqVar2 = enkq.a;
        enkqVar.b |= 2;
        enkqVar.d = z;
    }

    public final void d(boolean z) {
        enkp enkpVar = this.a;
        enkpVar.copyOnWrite();
        enkq enkqVar = (enkq) enkpVar.instance;
        enkq enkqVar2 = enkq.a;
        enkqVar.b |= 4;
        enkqVar.e = z;
    }
}
