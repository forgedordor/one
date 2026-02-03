package defpackage;

import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ cyfu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfh(hox hoxVar, cyfu cyfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = cyfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hox] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        ?? r0;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            hox hoxVar = this.c;
            cyfu cyfuVar = this.d;
            this.a = hoxVar;
            this.b = 1;
            cyda cydaVar = cyfuVar.b;
            String str = cydaVar.e;
            str.getClass();
            dciz dcizVar = new dciz();
            dcizVar.a = new dbuj(str);
            dcizVar.b = new Feature[]{dbwc.a};
            dcizVar.c = 1578;
            defn defnVarJ = ((cphq) cydaVar.f).d.j(dcizVar.a());
            final fdap fdapVar = new fdap() { // from class: cphd
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    cqbd cqbdVarC = cphq.a.c();
                    cqbdVarC.I("getConsent Succeeded.");
                    cqbdVarC.B("consent", zBooleanValue);
                    cqbdVarC.r();
                    return fctx.a;
                }
            };
            defnVarJ.a(new defh() { // from class: cphe
                @Override // defpackage.defh
                public final void e(Object obj3) {
                    fdapVar.invoke(obj3);
                }
            });
            defnVarJ.t(new defe() { // from class: cphf
                @Override // defpackage.defe
                public final void d(Exception exc) {
                    cqbd cqbdVarE = cphq.a.e();
                    cqbdVarE.I("getConsent Failed.");
                    cqbdVarE.s(exc);
                }
            });
            eiju eijuVarG = eiju.g(drgi.a(defnVarJ));
            eijuVarG.getClass();
            if (eijuVarG != fcylVar) {
                obj2 = hoxVar;
                obj = eijuVarG;
            }
            return fcylVar;
        }
        if (i != 1) {
            Object obj3 = this.a;
            fctl.b(obj);
            r0 = obj3;
            r0.b(((Boolean) obj).toString());
            hox hoxVar2 = this.c;
            cqce cqceVar = cyfu.a;
            Object objA = hoxVar2.a();
            Objects.toString(objA);
            cqceVar.p("getConsent result ".concat(String.valueOf(objA)));
            return fctx.a;
        }
        obj2 = this.a;
        fctl.b(obj);
        this.a = obj2;
        this.b = 2;
        obj = fdxs.c((ListenableFuture) obj, this);
        if (obj != fcylVar) {
            r0 = obj2;
            r0.b(((Boolean) obj).toString());
            hox hoxVar22 = this.c;
            cqce cqceVar2 = cyfu.a;
            Object objA2 = hoxVar22.a();
            Objects.toString(objA2);
            cqceVar2.p("getConsent result ".concat(String.valueOf(objA2)));
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyfh(this.c, this.d, fcxyVar);
    }
}
