package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqa {
    public static final boolean a(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = fcvo.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int iE = fcva.e(list);
            int i = 0;
            while (i < iE) {
                i++;
                Object obj2 = list.get(i);
                jsl jslVar = (jsl) obj2;
                jsl jslVar2 = (jsl) obj;
                arrayList.add(new ihs((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (jslVar2.c().a() >> 32)) - Float.intBitsToFloat((int) (jslVar.c().a() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (jslVar2.c().a() & 4294967295L)) - Float.intBitsToFloat((int) (jslVar.c().a() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((ihs) fcva.N(list2)).a;
        } else {
            if (list2.isEmpty()) {
                kjw.c("Empty collection can't be reduced.");
            }
            Object objN = fcva.N(list2);
            int iE2 = fcva.e(list2);
            if (iE2 > 0) {
                int i2 = 1;
                while (true) {
                    objN = new ihs(ihs.e(((ihs) objN).a, ((ihs) list2.get(i2)).a));
                    if (i2 == iE2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((ihs) objN).a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean b(jsl jslVar) {
        return (jsd.a(jslVar.f(), jte.f) == null && jsd.a(jslVar.f(), jte.e) == null) ? false : true;
    }
}
