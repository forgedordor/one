package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimq {
    public static final eimr a(eiii eiiiVar, SparseArray sparseArray, float f) {
        eiiiVar.getClass();
        eiml eimlVar = new eiml(eiiiVar, sparseArray, f);
        fegb fegbVar = eimlVar.d;
        ejwl.l(((fegm) fegbVar.build()).equals(fegm.a));
        eiii eiiiVar2 = eimlVar.e;
        ejwl.l(eiiiVar2.e.size() > 0);
        evvp evvpVarC = evxc.c(eiiiVar2.f);
        fegbVar.copyOnWrite();
        fegm fegmVar = (fegm) fegbVar.instance;
        evvpVarC.getClass();
        fegmVar.g = evvpVarC;
        fegmVar.b |= 16;
        long jB = eims.b(eiiiVar2);
        fegbVar.copyOnWrite();
        fegm fegmVar2 = (fegm) fegbVar.instance;
        fegmVar2.b |= 1;
        fegmVar2.c = jB;
        float f2 = eimlVar.f;
        if (f2 > 0.0f) {
            fegi fegiVar = (fegi) fegj.a.createBuilder();
            fegiVar.copyOnWrite();
            fegj fegjVar = (fegj) fegiVar.instance;
            fegjVar.b = 2;
            fegjVar.c = Float.valueOf(f2);
            fegbVar.copyOnWrite();
            fegm fegmVar3 = (fegm) fegbVar.instance;
            fegj fegjVar2 = (fegj) fegiVar.build();
            fegjVar2.getClass();
            fegmVar3.e = fegjVar2;
            fegmVar3.b |= 4;
        }
        if ((eiiiVar2.b & 32) != 0) {
            eice eiceVar = eiiiVar2.i;
            if (eiceVar == null) {
                eiceVar = eice.a;
            }
            if ((eiceVar.b & 1) != 0) {
                eicd eicdVar = eiceVar.c;
                if (eicdVar == null) {
                    eicdVar = eicd.a;
                }
                int i = eicdVar.c;
                fegbVar.copyOnWrite();
                fegm fegmVar4 = (fegm) fegbVar.instance;
                fegmVar4.b |= 64;
                fegmVar4.i = i;
            }
            if ((eiceVar.b & 2) != 0) {
                fegk fegkVar = (fegk) fegl.a.createBuilder();
                eicb eicbVar = eiceVar.d;
                if (eicbVar == null) {
                    eicbVar = eicb.a;
                }
                evrj evrjVarD = evwy.d(eicbVar.c);
                fegkVar.copyOnWrite();
                fegl feglVar = (fegl) fegkVar.instance;
                evrjVarD.getClass();
                feglVar.c = evrjVarD;
                feglVar.b |= 1;
                fegbVar.copyOnWrite();
                fegm fegmVar5 = (fegm) fegbVar.instance;
                fegl feglVar2 = (fegl) fegkVar.build();
                feglVar2.getClass();
                fegmVar5.j = feglVar2;
                fegmVar5.b |= 128;
            }
        }
        Iterator<E> it = eiiiVar2.e.iterator();
        while (it.hasNext()) {
            eimlVar.b((eies) it.next());
        }
        Set<Long> set = eimlVar.b;
        if (!set.isEmpty()) {
            Map map = eimlVar.c;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                fegd fegdVar = (fegd) fege.a.createBuilder();
                long jLongValue = ((Long) entry.getKey()).longValue();
                fegdVar.copyOnWrite();
                fege fegeVar = (fege) fegdVar.instance;
                fegeVar.b |= 1;
                fegeVar.c = jLongValue;
                long jLongValue2 = ((Long) entry.getValue()).longValue();
                fegdVar.copyOnWrite();
                fege fegeVar2 = (fege) fegdVar.instance;
                fegeVar2.b |= 2;
                fegeVar2.d = jLongValue2;
                arrayList.add((fege) fegdVar.build());
            }
            for (Long l : set) {
                fegc fegcVar = (fegc) fegh.a.createBuilder();
                fegcVar.copyOnWrite();
                fegh feghVar = (fegh) fegcVar.instance;
                feghVar.e = 2;
                feghVar.b |= 1;
                l.longValue();
                fegcVar.copyOnWrite();
                fegh feghVar2 = (fegh) fegcVar.instance;
                feghVar2.c = 2;
                feghVar2.d = l;
                fegcVar.copyOnWrite();
                fegh feghVar3 = (fegh) fegcVar.instance;
                evtg evtgVar = feghVar3.f;
                if (!evtgVar.c()) {
                    feghVar3.f = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(arrayList, feghVar3.f);
                fegbVar.copyOnWrite();
                fegm fegmVar6 = (fegm) fegbVar.instance;
                fegh feghVar4 = (fegh) fegcVar.build();
                feghVar4.getClass();
                evtg evtgVar2 = fegmVar6.f;
                if (!evtgVar2.c()) {
                    fegmVar6.f = evsn.mutableCopy(evtgVar2);
                }
                fegmVar6.f.add(feghVar4);
            }
        }
        if (eimlVar.k == null) {
            eimlVar.k = eimlVar.j;
        }
        String str = eimlVar.k.c;
        fegbVar.copyOnWrite();
        fegm fegmVar7 = (fegm) fegbVar.instance;
        str.getClass();
        fegmVar7.b = 2 | fegmVar7.b;
        fegmVar7.d = str;
        boolean z = eiiiVar2.e.size() == 1 && eiiiVar2.g == eimlVar.g && (eiiiVar2.b & 32) == 0;
        ejwl.l(eimlVar.h != Long.MAX_VALUE);
        ejwl.l(eimlVar.i != Long.MIN_VALUE);
        evrj evrjVarE = evwy.e(eimlVar.i - eimlVar.h);
        fegbVar.copyOnWrite();
        fegm fegmVar8 = (fegm) fegbVar.instance;
        evrjVarE.getClass();
        fegmVar8.h = evrjVarE;
        fegmVar8.b |= 32;
        fejd fejdVar = (fejd) fejg.a.createBuilder();
        evrj evrjVarE2 = evwy.e((eiiiVar2.g * 1000000) + eiiiVar2.h);
        fejdVar.copyOnWrite();
        fejg fejgVar = (fejg) fejdVar.instance;
        evrjVarE2.getClass();
        fejgVar.d = evrjVarE2;
        fejgVar.b |= 1;
        Iterator it2 = eimlVar.a.values().iterator();
        while (it2.hasNext()) {
            fejf fejfVar = (fejf) ((feje) it2.next()).build();
            fejdVar.copyOnWrite();
            fejg fejgVar2 = (fejg) fejdVar.instance;
            fejfVar.getClass();
            evtg evtgVar3 = fejgVar2.c;
            if (!evtgVar3.c()) {
                fejgVar2.c = evsn.mutableCopy(evtgVar3);
            }
            fejgVar2.c.add(fejfVar);
        }
        eies eiesVar = eimlVar.k;
        dzfh dzfhVar = new dzfh(eiesVar.c);
        feeg feegVar = (feeg) eimlVar.a(eiesVar).f();
        long j = eiiiVar2.g;
        return new eima(dzfhVar, feegVar, j, j + eimlVar.g, z, (fegm) fegbVar.build(), (fejg) fejdVar.build());
    }
}
