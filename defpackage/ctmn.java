package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmn implements ctma {
    public final anty d;
    public final fcsu e;
    public final fduf f;
    public final fduf g;
    private final fdjx i;
    private final fcyh j;
    private final fcsu k;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/contactlist/capabilitiestracker/ContactRcsCapabilitiesTrackerImpl");
    public static final ctmo b = new ctmo(1, 2);
    private static final ctmo h = new ctmo(2, 2);
    public static final ctmo c = new ctmo(3, 2);

    public ctmn(anty antyVar, fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        antyVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = antyVar;
        this.i = fdjxVar;
        this.j = fcyhVar;
        this.k = fcsuVar;
        this.e = fcsuVar2;
        this.f = fdvf.a(fcvp.a);
        this.g = fdvf.a(false);
    }

    public static final ctmo f(anyy anyyVar) {
        return !anyyVar.s() ? b : anyyVar.q() ? h : c;
    }

    @Override // defpackage.ctma
    public final fdpl a() {
        return this.f;
    }

    @Override // defpackage.ctma
    public final fdpl b(List list) {
        list.getClass();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/startchat/contactlist/capabilitiestracker/ContactRcsCapabilitiesTrackerImpl", "getSearchContactsRcsCapabilities", 71, "ContactRcsCapabilitiesTrackerImpl.kt")).r("Fetching %s searched contacts capabilities.", list.size());
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ajpq) it.next()).b());
        }
        Set setAv = fcva.av(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : setAv) {
            if (((alqm) obj).e().isPresent()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        fcti fctiVar = new fcti(arrayList2, arrayList3);
        List list2 = (List) fctiVar.a;
        List list3 = (List) fctiVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list3, 10)), 16));
        for (Object obj2 : list3) {
            linkedHashMap.put(obj2, c);
        }
        ArrayList arrayList4 = new ArrayList(fcva.p(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(this.d.h((alqm) it2.next()));
        }
        anty antyVar = this.d;
        ekgb ekgbVarA = ekfv.a(arrayList4);
        Object objB = this.k.b();
        objB.getClass();
        return fdqq.a(fdsc.c(new fdrn(new fdto(linkedHashMap, new ctme(anov.a(antyVar.a(ekgbVarA, evxd.c((evrj) objB)))), new ctmf(null)), new ctmg(null)), new ctmh(setAv, null)));
    }

    @Override // defpackage.ctma
    public final fdpl c(alqm alqmVar) {
        if (alqmVar.e().isEmpty()) {
            return new auxq(new fdae() { // from class: ctmb
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ctmn.c;
                }
            });
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleContacts");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.G, alqmVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/startchat/contactlist/capabilitiestracker/ContactRcsCapabilitiesTrackerImpl", "getSinglePhoneNumberRcsCapabilities", 142, "ContactRcsCapabilitiesTrackerImpl.kt")).q("Fetching single phone number.");
        anty antyVar = this.d;
        ekgb ekgbVarR = ekgb.r(antyVar.h(alqmVar));
        Object objB = this.k.b();
        objB.getClass();
        return new fdqz(new ctmj(null), fdsc.c(anov.a(antyVar.a(ekgbVarR, evxd.c((evrj) objB))), new ctmi(alqmVar, this, null)));
    }

    @Override // defpackage.ctma
    public final void d(List list) {
        auvw.k(this.i, this.j, null, new ctmm(list, this, null), 2);
    }

    @Override // defpackage.ctma
    public final void e() {
        this.g.f(true);
    }
}
