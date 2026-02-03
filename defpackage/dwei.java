package defpackage;

import android.util.Base64;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwei {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b = ekgp.m(eyrc.PHOTO, "photos", eyrc.RICH_CARD, "rich_card");

    public static dvyz a(dwje dwjeVar, ezol ezolVar, List list) {
        dwpx dwpxVarB = dweb.b(ezolVar, dwjeVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezol ezolVar2 = (ezol) it.next();
            dwpk dwpkVarA = dweb.a(ezolVar2);
            if (dwpkVarA != null) {
                arrayList.add(dwpkVarA);
            } else {
                dvhv.a("MsgProtoConverter", "Failed to convert Id: " + ezolVar2.c + " to ContactId");
            }
        }
        dvzy dvzyVar = new dvzy();
        dvzyVar.b(arrayList);
        return new dvzp(dwpxVarB, dvzyVar.a());
    }

    public static dwpk b(eysq eysqVar) {
        eypt eyptVar = eysqVar.k;
        if (eyptVar == null) {
            eyptVar = eypt.a;
        }
        return eysqVar.c == 5 ? dweg.a((eypt) eysqVar.d) : dweg.a(eyptVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
    
        if ((r2.g == 151 ? (defpackage.eyqj) r2.h : defpackage.eyqj.a).h == 1) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ejwi c(defpackage.ejwi r17, defpackage.dwje r18, android.content.Context r19, java.util.Map r20, defpackage.dwhr r21) {
        /*
            Method dump skipped, instructions count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwei.c(ejwi, dwje, android.content.Context, java.util.Map, dwhr):ejwi");
    }

    private static dwbk d(dwqk dwqkVar, eysq eysqVar, dwpk dwpkVar, dwpx dwpxVar, dwje dwjeVar, dwhr dwhrVar) {
        HashMap map = new HashMap();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(eysqVar.o);
        for (String str : mapUnmodifiableMap.keySet()) {
            map.put(str, ((evqe) mapUnmodifiableMap.get(str)).toByteString());
        }
        dwqkVar.l(map);
        dwqkVar.f(eysqVar.m);
        eypt eyptVar = eysqVar.k;
        if (eyptVar == null) {
            eyptVar = eypt.a;
        }
        dwpk dwpkVar2 = ((dwis) dwpxVar).a;
        boolean z = dwpkVar.equals(dwpkVar2) || dweg.a(eyptVar).equals(dwpkVar2);
        dwqkVar.g((z || eysqVar.q) ? 1 : 0);
        dwqkVar.j(eysqVar.i);
        dwnp dwnpVar = (dwnp) dwqkVar;
        dwnpVar.e = true != z ? 1 : 2;
        dwqkVar.k(z ? dwqq.OUTGOING_SENT : dwqq.INCOMING_RECEIVED);
        dwqkVar.o(eysqVar.p);
        dwnpVar.a = dwpkVar;
        dwqkVar.e(dwpxVar);
        dwqkVar.n(eysqVar.j);
        dwqw dwqwVarA = dwqkVar.a();
        int i = ((dwnq) dwqwVarA).j;
        if (i != -1) {
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(10011);
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.p(eysqVar.i);
            ((dwhn) dwhpVarR).a = ejwi.j(Integer.valueOf(i));
            dwhrVar.b(dwhpVarR.a());
        }
        dwai dwaiVar = new dwai();
        dwaiVar.b = new dvzj(dwqwVarA);
        dwaiVar.b(z || eysqVar.q);
        return dwaiVar.a();
    }

    private static boolean e(eyrc eyrcVar, dwqk dwqkVar, Map map, eysq eysqVar, dwje dwjeVar) {
        String str = (String) b.get(eyrcVar);
        if (map.containsKey(str)) {
            ((dwnp) dwqkVar).b = ((dwdz) map.get(str)).a().a(dwjeVar, eysqVar);
            return true;
        }
        eynu eynuVar = (eynu) eynv.a.createBuilder();
        eynuVar.copyOnWrite();
        eynv eynvVar = (eynv) eynuVar.instance;
        eynvVar.c = eysqVar;
        eynvVar.b |= 1;
        dwqkVar.t(evqs.x(Base64.encode(((eynv) eynuVar.build()).toByteArray(), 8)));
        dwqkVar.c(eysqVar.s);
        return false;
    }
}
