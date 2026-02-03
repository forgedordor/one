package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjv extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cmjx c;
    final /* synthetic */ eoaz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjv(fcxy fcxyVar, List list, cmjx cmjxVar, eoaz eoazVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = cmjxVar;
        this.d = eoazVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                List list = this.b;
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((crny) this.c.e.b()).h(((dggr) it.next()).a));
                }
                cmjx cmjxVar = this.c;
                eoaz eoazVar = this.d;
                this.a = 1;
                obj = cmjxVar.g(arrayList, eoazVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (cmme) obj;
        } catch (dhkf unused) {
            ekrw ekrwVarJ = cmjx.a.j();
            ekrwVarJ.X(eksq.a, "BugleSimStateTracker");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$updateSubscriptionsOnceStable$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 186, "PhoneSimsStateUpdaterImpl.kt")).q("updateSubscriptionsOnceStable: Missing permissions for TelephonyManager");
            cmmd cmmdVar = (cmmd) cmme.a.createBuilder();
            cmmdVar.getClass();
            return cmmf.a(cmmdVar);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmjv cmjvVar = new cmjv(fcxyVar, this.b, this.c, this.d);
        cmjvVar.e = obj;
        return cmjvVar;
    }
}
