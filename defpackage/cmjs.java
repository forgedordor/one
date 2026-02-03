package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmjs extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ cmjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjs(List list, cmjx cmjxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = list;
        this.b = cmjxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrg ekrgVar = cmjx.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSimStateTracker");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$scheduleStateUpdateForUnstableSubscription$1", "invokeSuspend", 544, "PhoneSimsStateUpdaterImpl.kt");
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((dggr) it.next()).a));
        }
        ekrdVar.w("Found %s unstable subscriptions. Scheduling verification delay for subIds: %s.", size, arrayList);
        ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Integer(((dggr) it2.next()).a));
        }
        fcva.aC(arrayList2);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleSimStateTracker");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$scheduleStateUpdateForUnstableSubscription$1", "invokeSuspend", 562, "PhoneSimsStateUpdaterImpl.kt")).q("Unstable subscription verification is disabled by flag.");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmjs(this.a, this.b, fcxyVar);
    }
}
