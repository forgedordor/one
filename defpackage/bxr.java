package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxr {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final Map c;
    private final Map d = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(bxo.e, Range.create(2160, 4319));
        map.put(bxo.d, Range.create(1080, 1439));
        map.put(bxo.c, Range.create(720, 1079));
        map.put(bxo.b, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, bno.a);
        map2.put(1, bno.c);
    }

    public bxr(List list, Map map) {
        Integer num;
        bxo bxoVar;
        Map map2 = b;
        for (bxo bxoVar2 : map2.keySet()) {
            this.d.put(new bwt(bxoVar2, -1), new ArrayList());
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                this.d.put(new bwt(bxoVar2, ((Integer) it.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List listA = a((bxo) entry.getKey(), -1);
            listA.getClass();
            listA.add((Size) entry.getValue());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            Iterator it3 = map2.entrySet().iterator();
            while (true) {
                num = null;
                if (!it3.hasNext()) {
                    bxoVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    bxoVar = (bxo) entry2.getKey();
                    break;
                }
            }
            if (bxoVar != null) {
                Iterator it4 = c.entrySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it4.next();
                    if (bno.b(size, (Rational) entry3.getValue(), bsd.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List listA2 = a(bxoVar, num.intValue());
                    listA2.getClass();
                    listA2.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.d.entrySet()) {
            Size size2 = (Size) map.get(((bxq) entry4.getKey()).b());
            if (size2 != null) {
                final int iA = bsd.a(size2);
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: bxp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int i = bxr.a;
                        int iA2 = bsd.a((Size) obj);
                        int i2 = iA;
                        return Math.abs(iA2 - i2) - Math.abs(bsd.a((Size) obj2) - i2);
                    }
                });
            }
        }
    }

    public final List a(bxo bxoVar, int i) {
        return (List) this.d.get(new bwt(bxoVar, i));
    }
}
