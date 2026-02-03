package defpackage;

import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylu extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cymk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cylu(cymk cymkVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = cymkVar;
    }

    @Override // defpackage.fdav
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = ((fctk) obj2).a;
        cylu cyluVar = new cylu(this.d, (fcxy) obj4);
        cyluVar.a = (List) obj;
        cyluVar.b = new fctk(obj5);
        cyluVar.c = (Map) obj3;
        return cyluVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Instant instant;
        int i;
        Object next;
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = ((fctk) this.b).a;
        if (true == (obj2 instanceof fctj)) {
            obj2 = null;
        }
        ?? r3 = this.c;
        ekgb ekgbVar = (ekgb) obj2;
        if (ekgbVar == null) {
            return fcvo.a;
        }
        List listAo = fcva.ao(ekgbVar);
        ArrayList<cbht> arrayList = new ArrayList();
        for (Object obj3 : listAo) {
            cbht cbhtVar = (cbht) obj3;
            Iterator it = r1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (fdbq.f(((cynk) next).a, cbhtVar.m())) {
                    break;
                }
            }
            if (next == null) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (cbht cbhtVar2 : arrayList) {
            String strM = cbhtVar2.m();
            strM.getClass();
            cbhtVar2.aA(2, "scheduled_at_time");
            Instant instant2 = DateRetargetClass.toInstant(cbhtVar2.c);
            instant2.getClass();
            cbhtVar2.getClass();
            pzh pzhVar = new pzh();
            cbhtVar2.aA(5, "requires_charging");
            pzhVar.a = cbhtVar2.f;
            cbhtVar2.aA(6, "requires_device_idle");
            pzhVar.b = cbhtVar2.g;
            cbhtVar2.aA(8, "requires_storage_not_low");
            pzhVar.d = cbhtVar2.i;
            cbhtVar2.aA(7, "requires_battery_not_low");
            pzhVar.c = cbhtVar2.h;
            cbhtVar2.aA(4, "requires_network_type");
            int i2 = cbhtVar2.e;
            int[] iArr = {1, 2, 3, 4, 5, 6};
            int iIntValue = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 6) {
                    instant = null;
                    i = 0;
                    break;
                }
                i = iArr[i3];
                instant = null;
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i4 == i2) {
                    break;
                }
                i3++;
            }
            pzhVar.c(i == 0 ? 1 : i);
            pzj pzjVarA = pzhVar.a();
            cbhtVar2.aA(3, "minimum_start_time");
            Date date = cbhtVar2.d;
            Instant instant3 = date != null ? DateRetargetClass.toInstant(date) : instant;
            Optional optionalK = cbhtVar2.k();
            optionalK.getClass();
            UUID uuid = (UUID) fdct.b(optionalK);
            Integer num = (Integer) r3.get(uuid != null ? uuid.toString() : instant);
            if (num != null) {
                iIntValue = num.intValue();
            }
            arrayList2.add(new cynl(strM, instant2, pzjVarA, instant3, iIntValue));
        }
        return arrayList2;
    }
}
