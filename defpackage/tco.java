package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class tco extends fdbb implements fdau {
    public tco(Object obj) {
        super(3, obj, tcx.class, "getFirstValidBannerContent", "getFirstValidBannerContent(Ljava/util/List;Ljava/util/Map;)Lcom/google/android/apps/messaging/banner/api/BannerContent;", 4);
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object next;
        fcti fctiVar;
        List list = (List) obj;
        Map map = (Map) obj2;
        tcx tcxVar = (tcx) this.b;
        ArrayList<fcti> arrayList = new ArrayList();
        for (Object obj4 : list) {
            egxh egxhVar = (egxh) ((fcti) obj4).a;
            if ((egxhVar instanceof egxd) || ((egxhVar instanceof egxf) && ((egxf) egxhVar).a != null)) {
                arrayList.add(obj4);
            }
        }
        if (arrayList.size() != list.size()) {
            ((ekrd) tcx.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 154, "BannersUiAdapterImpl.kt")).q("Banners are still loading, waiting until loaded to prioritize");
        } else {
            ekrg ekrgVar = tcx.a;
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 160, "BannersUiAdapterImpl.kt")).q("All banners have finished loading, getting the first non-null, eligible to display");
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            for (fcti fctiVar2 : arrayList) {
                egxh egxhVar2 = (egxh) fctiVar2.a;
                tdj tdjVar = (tdj) fctiVar2.b;
                tdh tdhVar = egxhVar2 instanceof egxd ? (tdh) ((egxd) egxhVar2).a : egxhVar2 instanceof egxf ? (tdh) ((egxf) egxhVar2).a : null;
                if (tdhVar == null) {
                    ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 173, "BannersUiAdapterImpl.kt")).t("Filtering out banner with %s because of invalid LocalSnapshot or null content", tdjVar);
                } else if (!tcxVar.g.b || fdbq.f(tdhVar.a(), tcxVar.c) || tdjVar.a) {
                    fctiVar = new fcti(tdhVar, tdjVar);
                    arrayList2.add(fctiVar);
                } else {
                    ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 191, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being blocked", tdhVar, tdjVar);
                }
                fctiVar = null;
                arrayList2.add(fctiVar);
            }
            List<fcti> listAe = fcva.ae(arrayList2);
            ArrayList arrayList3 = new ArrayList(fcva.p(listAe, 10));
            for (fcti fctiVar3 : listAe) {
                Object obj5 = fctiVar3.a;
                obj5.getClass();
                arrayList3.add(new fcti(obj5, fctiVar3.b));
            }
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!map.containsKey(((tdh) ((fcti) next).a).a())) {
                    break;
                }
            }
            fcti fctiVar4 = (fcti) next;
            if (fctiVar4 != null && !((tdj) fctiVar4.b).b) {
                tcxVar.f.b = true;
                if (tcxVar.c == null) {
                    tcxVar.c = tcxVar.a(fctiVar4).a();
                }
            }
            if (fctiVar4 != null) {
                return tcxVar.a(fctiVar4);
            }
        }
        return null;
    }
}
