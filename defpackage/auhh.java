package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auhh {
    public final auhe a;

    public auhh(auhe auheVar) {
        this.a = auheVar;
    }

    public final /* synthetic */ auhf a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (auhf) evsnVarBuild;
    }

    public final void b(String str) {
        auhe auheVar = this.a;
        auheVar.copyOnWrite();
        auhf auhfVar = (auhf) auheVar.instance;
        auhf auhfVar2 = auhf.a;
        auhfVar.b |= 1;
        auhfVar.e = str;
    }

    public final void c(auhn auhnVar) {
        auhe auheVar = this.a;
        auheVar.copyOnWrite();
        auhf auhfVar = (auhf) auheVar.instance;
        auhf auhfVar2 = auhf.a;
        auhfVar.d = auhnVar;
        auhfVar.c = 14;
    }

    public final void d(auhq auhqVar) {
        auhe auheVar = this.a;
        auheVar.copyOnWrite();
        auhf auhfVar = (auhf) auheVar.instance;
        auhf auhfVar2 = auhf.a;
        auhfVar.d = auhqVar;
        auhfVar.c = 13;
    }

    public final void e(auib auibVar) {
        auhe auheVar = this.a;
        auheVar.copyOnWrite();
        auhf auhfVar = (auhf) auheVar.instance;
        auhf auhfVar2 = auhf.a;
        auhfVar.g = auibVar;
        auhfVar.b |= 4;
    }
}
