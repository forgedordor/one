package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccbk b;
    final /* synthetic */ ccpl c;
    final /* synthetic */ cbwd d;
    final /* synthetic */ aubt e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccbf(fcxy fcxyVar, ccbk ccbkVar, ccpl ccplVar, cbwd cbwdVar, aubt aubtVar) {
        super(2, fcxyVar);
        this.b = ccbkVar;
        this.c = ccplVar;
        this.d = cbwdVar;
        this.e = aubtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccbf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        Object objJ;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.f;
            try {
                fctl.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fczl.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            fctl.b(obj);
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("MlsRcsMessageProcessor.process");
            try {
                ccbk ccbkVar = this.b;
                ccpl ccplVar = this.c;
                cbwd cbwdVar = this.d;
                aubt aubtVar = this.e;
                this.f = eieuVarH;
                this.a = 1;
                if (cbwdVar.c != 2) {
                    throw new IllegalArgumentException("MlsContext is missing the incoming request.");
                }
                aubx aubxVar = aubtVar.c;
                if (aubxVar == null) {
                    aubxVar = aubx.a;
                }
                aubxVar.getClass();
                if (auby.g(aubxVar, cche.a) || auby.g(aubxVar, cche.c)) {
                    objJ = ccbkVar.i(ccplVar, cbwdVar, aubtVar, this);
                } else {
                    if (!auby.g(aubxVar, cche.d)) {
                        aubx aubxVar2 = aubtVar.c;
                        if (aubxVar2 == null) {
                            aubxVar2 = aubx.a;
                        }
                        aubxVar2.getClass();
                        throw new IllegalStateException("Invalid content type ".concat(auby.j(aubxVar2)));
                    }
                    objJ = ccbkVar.j(ccplVar, cbwdVar, aubtVar, this);
                }
                if (objJ == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
                obj = objJ;
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        ccan ccanVar = (ccan) obj;
        fczl.a(closeable, null);
        return ccanVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccbf ccbfVar = new ccbf(fcxyVar, this.b, this.c, this.d, this.e);
        ccbfVar.f = obj;
        return ccbfVar;
    }
}
