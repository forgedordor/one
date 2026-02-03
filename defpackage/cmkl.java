package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmkl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmkm b;
    final /* synthetic */ cmko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmkl(cmkm cmkmVar, cmko cmkoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmkmVar;
        this.c = cmkoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmkl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objI;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmkm cmkmVar = this.b;
        cmko cmkoVar = this.c;
        this.a = 1;
        int i2 = cmkoVar.c;
        cmky cmkyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : cmky.WORK_TYPE_UPDATE_PHONE_SIMS_STATE : cmky.WORK_TYPE_VERIFY_SIM_REMOVAL : cmky.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION : cmky.WORK_TYPE_UNKNOWN;
        if (cmkyVar == null) {
            cmkyVar = cmky.UNRECOGNIZED;
        }
        cmkyVar.getClass();
        ekrg ekrgVar = cmkm.a;
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimStateUpdateInternal", 70, "SimStateUpdateHandler.kt")).t("Handling SimStateUpdate. Request for %s work type received.", cmkyVar);
        int iOrdinal = cmkyVar.ordinal();
        if (iOrdinal == 1) {
            evsx evsxVar = cmkoVar.d;
            evsxVar.getClass();
            eoaz eoazVarB = eoaz.b(cmkoVar.e);
            if (eoazVarB == null) {
                eoazVarB = eoaz.UNRECOGNIZED;
            }
            eoazVarB.getClass();
            if (evsxVar.isEmpty()) {
                ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 89, "SimStateUpdateHandler.kt")).q("No unstable subscriptions to reverify.");
                objI = cbcw.i();
            } else {
                ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 94, "SimStateUpdateHandler.kt")).t("Handling unstable subscriptions reverification: %s", evsxVar);
                cmjl cmjlVar = (cmjl) cmkmVar.b.b();
                ArrayList arrayList = new ArrayList(fcva.p(evsxVar, 10));
                Iterator<E> it = evsxVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dggr(((Number) it.next()).intValue()));
                }
                cmjlVar.b(arrayList, eoazVarB);
                cmkmVar.l(cmky.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION);
                objI = cbcw.i();
            }
        } else if (iOrdinal == 2) {
            eoaz eoazVarB2 = eoaz.b(cmkoVar.e);
            if (eoazVarB2 == null) {
                eoazVarB2 = eoaz.UNRECOGNIZED;
            }
            eoazVarB2.getClass();
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimRemoval", 107, "SimStateUpdateHandler.kt")).q("Handling SIM removal verification.");
            ((cmjl) cmkmVar.b.b()).c(eoazVarB2);
            cmkmVar.l(cmky.WORK_TYPE_VERIFY_SIM_REMOVAL);
            objI = cbcw.i();
        } else if (iOrdinal != 3) {
            objI = cbcw.i();
        } else {
            eoaz eoazVarB3 = eoaz.b(cmkoVar.e);
            if (eoazVarB3 == null) {
                eoazVarB3 = eoaz.UNRECOGNIZED;
            }
            eoazVarB3.getClass();
            objI = cmkmVar.k(eoazVarB3, this);
        }
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmkl(this.b, this.c, fcxyVar);
    }
}
