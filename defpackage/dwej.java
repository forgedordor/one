package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwej {
    public static dwaz a(dwje dwjeVar, Context context, eypy eypyVar, dwhr dwhrVar, long j) {
        ejwi ejwiVarJ;
        dwab dwabVar = new dwab();
        dwabVar.f(eypyVar.c);
        eypv eypvVar = eypyVar.d;
        if (eypvVar == null) {
            eypvVar = eypv.a;
        }
        dwabVar.b(eypvVar.d);
        dwabVar.e = ejwi.j(Long.valueOf(j));
        if (!eypyVar.k.isEmpty()) {
            dwabVar.a = ejwi.j(eypyVar.k);
        }
        eypv eypvVar2 = eypyVar.d;
        if (eypvVar2 == null) {
            eypvVar2 = eypv.a;
        }
        if ((eypvVar2.b == 2 ? (String) eypvVar2.c : "").isEmpty()) {
            eypv eypvVar3 = eypyVar.d;
            if (eypvVar3 == null) {
                eypvVar3 = eypv.a;
            }
            dwabVar.g((eypvVar3.b == 1 ? (evqs) eypvVar3.c : evqs.b).I());
        } else {
            eypv eypvVar4 = eypyVar.d;
            if (eypvVar4 == null) {
                eypvVar4 = eypv.a;
            }
            dwabVar.c(eypvVar4.b == 2 ? (String) eypvVar4.c : "");
        }
        if ((eypyVar.b & 2) != 0) {
            dvzy dvzyVar = new dvzy();
            ArrayList arrayList = new ArrayList();
            eypp eyppVar = eypyVar.e;
            if (eyppVar == null) {
                eyppVar = eypp.a;
            }
            Iterator<E> it = eyppVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(dweg.a((eypt) it.next()));
            }
            dvzyVar.b(arrayList);
            dwabVar.b = ejwi.j(dvzyVar.a());
        }
        HashMap map = new HashMap();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(eypyVar.f);
        for (String str : mapUnmodifiableMap.keySet()) {
            map.put(str, ((evqe) mapUnmodifiableMap.get(str)).toByteArray());
        }
        dwabVar.e(map);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (eyqd eyqdVar : eypyVar.g) {
            eypd eypdVar = eyqdVar.c;
            if (eypdVar == null) {
                eypdVar = eypd.a;
            }
            ejud ejudVar = ejud.a;
            ejwi ejwiVarB = dwdv.b(eypdVar, ejudVar, ejudVar);
            if (ejwiVarB.g()) {
                dwnl dwnlVar = new dwnl();
                dwnlVar.c(eyqdVar.b);
                dwnlVar.a = (dwjr) ejwiVarB.c();
                ekfwVar.h(dwnlVar.a());
            }
        }
        dwabVar.d(ekfwVar.g());
        eyqr eyqrVar = eypyVar.j;
        if (eyqrVar == null) {
            eyqrVar = eyqr.a;
        }
        dwnn dwnnVar = new dwnn();
        int i2 = 0;
        dwnnVar.b(0);
        dwnnVar.c(0);
        if ((eyqrVar.b & 1) != 0) {
            eypf eypfVar = eyqrVar.c;
            if (eypfVar == null) {
                eypfVar = eypf.a;
            }
            int i3 = eypfVar.b;
            int i4 = i3 != 0 ? i3 != 1 ? 0 : 3 : 2;
            if (i4 == 0) {
                i4 = 1;
            }
            if (i4 - 2 != 1) {
                dwnnVar.b(0);
            } else {
                dwnnVar.b(1);
            }
        }
        int i5 = eyqrVar.d;
        if (i5 == 0) {
            i2 = 2;
        } else if (i5 == 1) {
            i2 = 3;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 - 2 != 1) {
            dwnnVar.c(1);
        } else {
            dwnnVar.c(2);
        }
        dwabVar.c = ejwi.j(dwnnVar.a());
        ekfw ekfwVar2 = new ekfw();
        for (eyqd eyqdVar2 : eypyVar.h) {
            ejwi ejwiVarJ2 = ejud.a;
            dwnl dwnlVar2 = new dwnl();
            eypd eypdVar2 = eyqdVar2.c;
            if (eypdVar2 == null) {
                eypdVar2 = eypd.a;
            }
            ejwi ejwiVarB2 = dwdv.b(eypdVar2, ejwiVarJ2, ejwiVarJ2);
            if (ejwiVarB2.g()) {
                dwnlVar2.c(eyqdVar2.b);
                dwnlVar2.a = (dwjr) ejwiVarB2.c();
                if (!eyqdVar2.d.H()) {
                    dwnlVar2.b(eyqdVar2.d.I());
                }
                ejwiVarJ2 = ejwi.j(dwnlVar2.a());
            }
            if (ejwiVarJ2.g()) {
                ekfwVar2.h(ejwiVarJ2.c());
            }
        }
        dwabVar.h(ekfwVar2.g());
        eypj eypjVar = eypyVar.i;
        if (eypjVar == null) {
            eypjVar = eypj.a;
        }
        int i6 = eypjVar.b;
        int iA = eyre.a(i6);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 2 == 1) {
            int iA2 = eyre.a(i6);
            if (iA2 != 0 && iA2 == 3) {
                try {
                    evqe evqeVar = eypjVar.c;
                    if (evqeVar == null) {
                        evqeVar = evqe.a;
                    }
                    dwsa dwsaVarA = dwey.a(dwjeVar, context, (eyuw) evsn.parseFrom(eyuw.a, evqeVar.c, evrr.a()), "RICH_TEXT_ACCESSORY_VIEW", dwhrVar);
                    dwoe dwoeVar = new dwoe();
                    dwoeVar.a = dwsaVarA;
                    ejwiVarJ = ejwi.j(dwoeVar.a());
                } catch (evtj unused) {
                    dvhv.c("RichTextCustomViewContentProtoConverter", "can not convert proto to RichText");
                    ejwiVarJ = ejud.a;
                }
            } else {
                dvhv.c("RichTextCustomViewContentProtoConverter", "This CustomViewContent is not type of RICH_TEXT");
                ejwiVarJ = ejud.a;
            }
            if (ejwiVarJ.g()) {
                dwabVar.d = ejwi.j(ejwiVarJ.c());
            }
        }
        return dwabVar.a();
    }
}
