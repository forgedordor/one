package defpackage;

import j$.util.Optional;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejoy {
    public static String a(ezgi ezgiVar) {
        int iA;
        Integer numValueOf = Integer.valueOf(ejkw.b(ezgiVar).a());
        String str = (ezgiVar.c == 7 ? (ezbj) ezgiVar.d : ezbj.a).b;
        ezbq ezbqVar = (ezgiVar.c == 6 ? (ezbs) ezgiVar.d : ezbs.a).c;
        if (ezbqVar == null) {
            ezbqVar = ezbq.a;
        }
        String str2 = ezbqVar.c;
        String str3 = (ezgiVar.c == 2 ? (ezgk) ezgiVar.d : ezgk.a).c;
        String str4 = (ezgiVar.c == 5 ? (ezdc) ezgiVar.d : ezdc.a).b;
        String str5 = (ezgiVar.c == 13 ? (ezcr) ezgiVar.d : ezcr.a).b;
        String str6 = (ezgiVar.c == 20 ? (ezfz) ezgiVar.d : ezfz.a).b;
        String str7 = (ezgiVar.c == 15 ? (ezfp) ezgiVar.d : ezfp.a).b;
        if (ezan.BUSINESS_MESSAGE.equals(ejkw.b(ezgiVar))) {
            ezgg ezggVar = ezgiVar.e;
            if (ezggVar == null) {
                ezggVar = ezgg.b;
            }
            ezal ezalVarB = ezal.b(ezggVar.g);
            if (ezalVarB == null) {
                ezalVarB = ezal.UNRECOGNIZED;
            }
            iA = ezalVarB.a();
        } else {
            iA = 0;
        }
        Integer numValueOf2 = Integer.valueOf(iA);
        int iB = ezdz.b((ezgiVar.c == 30 ? (ezea) ezgiVar.d : ezea.a).b);
        if (iB == 0) {
            iB = 1;
        }
        return String.format("%d:%s:%s:%s:%s:%s:%s:%s:%d:%d", numValueOf, str, str2, str3, str4, str5, str6, str7, numValueOf2, Integer.valueOf(ezdz.a(iB)));
    }

    public static boolean b(ezgi ezgiVar) {
        ezgg ezggVar = ezgiVar.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezal ezalVarB = ezal.b(ezggVar.g);
        if (ezalVarB == null) {
            ezalVarB = ezal.UNRECOGNIZED;
        }
        return ezalVarB == ezal.STICKY_PROVIDER;
    }

    public static void c(List list) {
        Collections.sort(list, new Comparator() { // from class: ejox
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ezgi ezgiVar = (ezgi) obj;
                ezgi ezgiVar2 = (ezgi) obj2;
                if (ezgiVar.c != 2 && ezgiVar2.c != 2 && ejoy.b(ezgiVar) != ejoy.b(ezgiVar2)) {
                    return !ejoy.b(ezgiVar2) ? 1 : -1;
                }
                int i = ezgiVar.c;
                boolean z = i == 15;
                int i2 = ezgiVar2.c;
                if (z != (i2 == 15)) {
                    return i != 15 ? 1 : -1;
                }
                if ((i == 7) != (i2 == 7)) {
                    return i != 7 ? 1 : -1;
                }
                if ((i == 14) != (i2 == 14)) {
                    return i != 14 ? 1 : -1;
                }
                if ((i == 6) != (i2 == 6)) {
                    return i != 6 ? 1 : -1;
                }
                if ((i == 11) != (i2 == 11)) {
                    return i != 11 ? 1 : -1;
                }
                if ((i == 3) != (i2 == 3)) {
                    return i != 3 ? 1 : -1;
                }
                if ((i == 4) != (i2 == 4)) {
                    return i != 4 ? 1 : -1;
                }
                if ((i == 5) != (i2 == 5)) {
                    return i != 5 ? 1 : -1;
                }
                if ((i == 19) != (i2 == 19)) {
                    return i != 19 ? 1 : -1;
                }
                if ((i == 2) != (i2 == 2)) {
                    return i != 2 ? 1 : -1;
                }
                return 0;
            }
        });
    }

    static ezgi d(ezgi ezgiVar, Optional optional, int i) {
        ezgg ezggVar = ezgiVar.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezgf ezgfVar = (ezgf) ezggVar.toBuilder();
        ezfg ezfgVar = (ezfg) ezfh.a.createBuilder();
        ezfgVar.copyOnWrite();
        ((ezfh) ezfgVar.instance).c = ezae.a(i);
        if (optional.isPresent()) {
            ezfi ezfiVar = (ezfi) ezfj.a.createBuilder();
            double dDoubleValue = ((Double) optional.get()).doubleValue();
            ezfiVar.copyOnWrite();
            ((ezfj) ezfiVar.instance).b = dDoubleValue;
            ezfgVar.copyOnWrite();
            ezfh ezfhVar = (ezfh) ezfgVar.instance;
            ezfj ezfjVar = (ezfj) ezfiVar.build();
            ezfjVar.getClass();
            ezfhVar.d = ezfjVar;
            ezfhVar.b |= 1;
        }
        ezgh ezghVar = (ezgh) ezgiVar.toBuilder();
        ezgfVar.copyOnWrite();
        ezgg ezggVar2 = (ezgg) ezgfVar.instance;
        ezfh ezfhVar2 = (ezfh) ezfgVar.build();
        ezfhVar2.getClass();
        ezggVar2.r = ezfhVar2;
        ezggVar2.c |= 4;
        ezghVar.copyOnWrite();
        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
        ezgg ezggVar3 = (ezgg) ezgfVar.build();
        ezggVar3.getClass();
        ezgiVar2.e = ezggVar3;
        ezgiVar2.b |= 1;
        return (ezgi) ezghVar.build();
    }
}
