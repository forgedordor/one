package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmm extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ ctmn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctmm(List list, ctmn ctmnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = ctmnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctmm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        Map map;
        LinkedHashMap linkedHashMap;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarE = ctmn.a.e();
            ekrwVarE.X(eksq.a, "BugleContacts");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/startchat/contactlist/capabilitiestracker/ContactRcsCapabilitiesTrackerImpl$onContactsLoaded$1", "invokeSuspend", 100, "ContactRcsCapabilitiesTrackerImpl.kt");
            List list = this.b;
            ekrdVar.r("Fetching %s loaded contacts capabilities.", list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fcva.y(arrayList, ((ajou) it.next()).b());
            }
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ajpk) it2.next()).a);
            }
            Set setAv = fcva.av(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : setAv) {
                if (((alqm) obj2).e().isPresent()) {
                    arrayList3.add(obj2);
                } else {
                    arrayList4.add(obj2);
                }
            }
            fcti fctiVar = new fcti(arrayList3, arrayList4);
            Object obj3 = fctiVar.a;
            Object obj4 = fctiVar.b;
            ctmn ctmnVar = this.c;
            List list2 = (List) obj3;
            List list3 = (List) obj4;
            ArrayList arrayList5 = new ArrayList(fcva.p(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(ctmnVar.d.h((alqm) it3.next()));
            }
            fduf fdufVar = ctmnVar.f;
            do {
                objC = fdufVar.c();
                map = (Map) objC;
                linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list3, 10)), 16));
                for (Object obj5 : list3) {
                    linkedHashMap.put(obj5, ctmn.c);
                }
            } while (!fdufVar.g(objC, fcwa.j(map, linkedHashMap)));
            fduf fdufVar2 = ctmnVar.g;
            ctml ctmlVar = new ctml(ctmnVar, arrayList5);
            this.a = 1;
            if (fdufVar2.a(ctmlVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctmm(this.b, this.c, fcxyVar);
    }
}
