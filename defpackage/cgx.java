package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgx {
    public static final Map a;
    public static final Map b;
    public static final Map c;
    public static final Map d;
    public static final Map e;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        HashMap map3 = new HashMap();
        c = map3;
        HashMap map4 = new HashMap();
        d = map4;
        HashMap map5 = new HashMap();
        e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        map6.put(azv.b, 1);
        map6.put(azv.c, 2);
        map6.put(azv.d, 4096);
        map6.put(azv.e, 8192);
        HashMap map7 = new HashMap();
        map7.put(azv.b, 1);
        map7.put(azv.c, 2);
        map7.put(azv.d, 4096);
        map7.put(azv.e, 8192);
        HashMap map8 = new HashMap();
        map8.put(azv.b, 1);
        map8.put(azv.c, 4);
        map8.put(azv.d, 4096);
        map8.put(azv.e, 16384);
        HashMap map9 = new HashMap();
        map9.put(azv.f, 256);
        map9.put(azv.g, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(bki bkiVar, azv azvVar) {
        int i = azvVar.i;
        int iA = bkiVar.a();
        Set set = (Set) a.get(Integer.valueOf(i));
        if (set == null || !set.contains(Integer.valueOf(iA))) {
            return false;
        }
        int iF = bkiVar.f();
        Set set2 = (Set) b.get(Integer.valueOf(azvVar.h));
        return set2 != null && set2.contains(Integer.valueOf(iF));
    }
}
