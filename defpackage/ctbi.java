package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbi {
    public final ctbe a;

    public ctbi(ctbe ctbeVar) {
        this.a = ctbeVar;
    }

    public final /* synthetic */ ctbg a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (ctbg) evsnVarBuild;
    }

    public final void b(int i) {
        ctbe ctbeVar = this.a;
        ctbeVar.copyOnWrite();
        ctbg ctbgVar = (ctbg) ctbeVar.instance;
        ctbg ctbgVar2 = ctbg.a;
        ctbgVar.d = ctbf.a(i);
    }
}
