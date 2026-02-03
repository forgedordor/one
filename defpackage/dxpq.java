package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpq {
    public static final int a(evfy evfyVar, List list, Map map) {
        list.getClass();
        map.getClass();
        if (evfyVar == null) {
            return 0;
        }
        evga evgaVarA = evfz.a((evfv) evfyVar.toBuilder());
        evfv evfvVar = evgaVarA.a;
        evfvVar.copyOnWrite();
        evfy evfyVar2 = (evfy) evfvVar.instance;
        evfyVar2.b &= -5;
        evfyVar2.e = 0;
        evfvVar.copyOnWrite();
        evfy evfyVar3 = (evfy) evfvVar.instance;
        evfyVar3.b &= -17;
        evfyVar3.h = evfy.a.h;
        evwn evwnVarB = evgaVarA.b();
        ArrayList arrayList = new ArrayList(fcva.p(evwnVarB, 10));
        Iterator<E> it = evwnVarB.iterator();
        while (it.hasNext()) {
            evgc evgcVarA = evgb.a((evfw) ((evfx) it.next()).toBuilder());
            evfw evfwVar = evgcVarA.a;
            evfwVar.copyOnWrite();
            evfx evfxVar = (evfx) evfwVar.instance;
            evfxVar.b &= -2;
            evfx evfxVar2 = evfx.a;
            evfxVar.c = evfxVar2.c;
            evfwVar.copyOnWrite();
            evfx evfxVar3 = (evfx) evfwVar.instance;
            evfxVar3.d = null;
            evfxVar3.b &= -3;
            evfwVar.copyOnWrite();
            evfx evfxVar4 = (evfx) evfwVar.instance;
            evfxVar4.b &= -17;
            evfxVar4.g = evfxVar2.g;
            arrayList.add(evgcVarA.a());
        }
        List listAl = fcva.al(arrayList, new dxpp());
        evgaVarA.b();
        evgaVarA.d();
        evgaVarA.b();
        evgaVarA.c(listAl);
        int iHashCode = evgaVarA.a().hashCode();
        ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((dxvi) it2.next()).a().hashCode()));
        }
        Iterator it3 = fcva.ak(arrayList2).iterator();
        while (it3.hasNext()) {
            iHashCode = (iHashCode * 53) + ((Number) it3.next()).intValue();
        }
        ArrayList<dxvl> arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof dxvl) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(fcva.p(arrayList3, 10));
        for (dxvl dxvlVar : arrayList3) {
            int iHashCode2 = dxvlVar.a.hashCode() * 53;
            dxhe dxheVar = (dxhe) map.get(dxvlVar);
            String strK = dxheVar != null ? dxheVar.k() : null;
            arrayList4.add(Integer.valueOf(iHashCode2 + (strK != null ? strK.hashCode() : 0)));
        }
        Iterator it4 = fcva.ak(arrayList4).iterator();
        while (it4.hasNext()) {
            iHashCode = (iHashCode * 53) + ((Number) it4.next()).intValue();
        }
        return iHashCode;
    }
}
