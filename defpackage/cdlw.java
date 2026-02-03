package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdlw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdlw(cdlx cdlxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdlxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdlw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdlx cdlxVar = this.b;
            ListenableFuture listenableFutureA = ((egyt) cdlxVar.d.b()).a(((egbf) cdlxVar.b.b()).b(), egzr.DONT_CARE);
            listenableFutureA.getClass();
            this.a = 1;
            obj = fdxs.c(listenableFutureA, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (fdbq.f(((egbe) obj2).b().k, "google")) {
                arrayList.add(obj2);
            }
        }
        final boolean z = !arrayList.isEmpty();
        ekrw ekrwVarH = cdlx.a.h();
        ekrwVarH.X(eksq.a, "BugleAccountSignOut");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/gaia/synclet/GaiaStatusUpdaterSynclet$sync$1", "invokeSuspend", 38, "GaiaStatusUpdaterSynclet.kt")).t("Storing is_gaia_detected=%s", Boolean.valueOf(z));
        final cdku cdkuVar = (cdku) this.b.c.b();
        eiju eijuVarH = cdkuVar.c.j(new ejvr() { // from class: cdju
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                cdjq cdjqVar = (cdjq) ((cdjt) obj3).toBuilder();
                cdjqVar.copyOnWrite();
                cdjt cdjtVar = (cdjt) cdjqVar.instance;
                cdjtVar.b |= 256;
                cdjtVar.i = z;
                return (cdjt) cdjqVar.build();
            }
        }).h(new ejvr() { // from class: cdjv
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                cdkuVar.e();
                return null;
            }
        }, cdkuVar.d);
        this.a = 2;
        Object objC = fdxs.c(eijuVarH, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdlw(this.b, fcxyVar);
    }
}
