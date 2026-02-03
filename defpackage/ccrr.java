package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrr extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b = "MlsChatApiSender#sendMlsMessage";
    final /* synthetic */ ccrt c;
    final /* synthetic */ ccar d;
    final /* synthetic */ evvp e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccrr(fcxy fcxyVar, ccrt ccrtVar, ccar ccarVar, evvp evvpVar) {
        super(2, fcxyVar);
        this.c = ccrtVar;
        this.d = ccarVar;
        this.e = evvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccrr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        fcyl fcylVar = fcyl.a;
        ?? r2 = this.a;
        try {
            if (r2 != 0) {
                Closeable closeable = (Closeable) this.f;
                fctl.b(obj);
                objC = obj;
                r2 = closeable;
            } else {
                fctl.b(obj);
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h(this.b);
                auia auiaVar = (auia) auib.a.createBuilder();
                auiaVar.getClass();
                ccrt ccrtVar = this.c;
                String str = cqdr.a().b;
                str.getClass();
                auiaVar.copyOnWrite();
                auib auibVar = (auib) auiaVar.instance;
                auibVar.b |= 1;
                auibVar.c = str;
                evsn evsnVarBuild = auiaVar.build();
                evsnVarBuild.getClass();
                auhh auhhVarA = auhg.a((auhe) auhf.a.createBuilder());
                auhm auhmVar = (auhm) auhn.a.createBuilder();
                auhmVar.getClass();
                auho.b(this.e, auhmVar);
                auhhVarA.c(auho.a(auhmVar));
                ccar ccarVar = this.d;
                basd basdVar = ccarVar.b;
                auhhVarA.b(basdVar.f());
                auhhVarA.e((auib) evsnVarBuild);
                eiju eijuVarE = ccrtVar.a.e(basdVar, ccarVar.c, ccarVar.f, ccarVar.d, auhhVarA.a(), ccarVar.e, ccarVar.a);
                this.f = eieuVarH;
                this.a = 1;
                objC = fdxs.c(eijuVarE, this);
                r2 = eieuVarH;
                if (objC == fcylVar) {
                    return fcylVar;
                }
            }
            fczl.a(r2, null);
            return objC;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccrr ccrrVar = new ccrr(fcxyVar, this.c, this.d, this.e);
        ccrrVar.f = obj;
        return ccrrVar;
    }
}
