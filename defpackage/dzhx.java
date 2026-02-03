package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhx {
    public static ekgb a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new Function() { // from class: dzhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((dzhw) obj).c();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            return (ekgb) map.collect(ekcv.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((dzhw) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new Function() { // from class: dzhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((dzhw) obj).c();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = ekgb.d;
            return (ekgb) map2.collect(ekcv.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = arrayList.size();
        long jA2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            dzhw dzhwVar = (dzhw) arrayList.get(i5);
            i4++;
            jA2 += dzhwVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            ekfwVar.h(dzhwVar.c());
        }
        return ekfwVar.g();
    }
}
