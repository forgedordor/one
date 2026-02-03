package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avy {
    private static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(1L, azv.b);
        map2.put(azv.b, Collections.singletonList(1L));
        map.put(2L, azv.c);
        map2.put((azv) map.get(2L), Collections.singletonList(2L));
        map.put(4L, azv.d);
        map2.put(azv.d, Collections.singletonList(4L));
        map.put(8L, azv.e);
        map2.put(azv.e, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            a.put((Long) it.next(), azv.f);
        }
        b.put(azv.f, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            a.put((Long) it2.next(), azv.g);
        }
        b.put(azv.g, listAsList2);
    }

    public static azv a(long j) {
        return (azv) a.get(Long.valueOf(j));
    }

    public static Long b(azv azvVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(azvVar);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
