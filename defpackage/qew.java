package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qew extends fcyz implements fdat {
    int a;
    final /* synthetic */ qfa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qew(qfa qfaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qfaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qew) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final qet qeqVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                qfa qfaVar = this.b;
                fdlt fdltVar = qfaVar.j;
                qev qevVar = new qev(qfaVar, null);
                this.a = 1;
                obj = fdin.a(fdltVar, qevVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            qeqVar = (qet) obj;
        } catch (qei e) {
            qeqVar = new qes(e.a);
        } catch (CancellationException unused) {
            qeqVar = new qeq(null);
        } catch (Throwable th) {
            String str = qfc.a;
            qas.c();
            Log.e(str, "Unexpected error in WorkerWrapper", th);
            qeqVar = new qeq(null);
        }
        final qfa qfaVar2 = this.b;
        Object objF = qfaVar2.e.f(new Callable() { // from class: qeu
            /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 451
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qeu.call():java.lang.Object");
            }
        });
        objF.getClass();
        return objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qew(this.b, fcxyVar);
    }
}
