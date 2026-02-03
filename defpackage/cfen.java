package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfen implements cfrj {
    public final axcm a;
    public String b;
    private final fdjx c;
    private final felf d;
    private final cfrh e;
    private long f;

    public cfen(fdjx fdjxVar, felf felfVar, axcm axcmVar, cfrh cfrhVar) {
        fdjxVar.getClass();
        felfVar.getClass();
        axcmVar.getClass();
        this.c = fdjxVar;
        this.d = felfVar;
        this.a = axcmVar;
        this.e = cfrhVar;
        this.b = "";
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture c(ezpp ezppVar) {
        ezppVar.getClass();
        String str = ezppVar.c;
        str.getClass();
        this.b = str;
        ezvt ezvtVar = (ezvt) ezvu.a.createBuilder();
        ezvtVar.getClass();
        eyzl eyzlVarA = eyzk.a((ezpo) ezppVar.toBuilder());
        eyzlVarA.c(this.d);
        ezpp ezppVarA = eyzlVarA.a();
        ezvtVar.copyOnWrite();
        ezvu ezvuVar = (ezvu) ezvtVar.instance;
        ezvuVar.c = ezppVarA;
        ezvuVar.b |= 1;
        evsn evsnVarBuild = ezvtVar.build();
        evsnVarBuild.getClass();
        eiju eijuVarE = eijx.e((ezvu) evsnVarBuild);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezvu ezvuVar = (ezvu) evuhVar;
        cezvVar.getClass();
        ezvuVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cfem(cezvVar, this, ezvuVar, null));
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        ezvw ezvwVar = (ezvw) evuhVar;
        ezvwVar.getClass();
        ezpr ezprVar = ezvwVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.f = ezprVar.b;
        eiju eijuVarE = eijx.e(ezvwVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "NetworkTransitionRpcHandlerImpl";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
