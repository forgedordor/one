package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ash {
    public static final bjo a = new bhd("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    private static final Map b;
    private static final Map c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            hashSet.add(bnk.PREVIEW);
            hashSet.add(bnk.METERING_REPEATING);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bnk.PREVIEW);
            hashSet2.add(bnk.METERING_REPEATING);
            hashSet2.add(bnk.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(bnk.IMAGE_CAPTURE);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            hashSet4.add(bnk.VIDEO_CAPTURE);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bnk.PREVIEW);
            hashSet5.add(bnk.IMAGE_CAPTURE);
            hashSet5.add(bnk.VIDEO_CAPTURE);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bnk.PREVIEW);
            hashSet6.add(bnk.VIDEO_CAPTURE);
            map2.put(3L, hashSet6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bjq a(bjq bjqVar, long j) {
        bjo bjoVar = a;
        if (blz.g(bjqVar, bjoVar) && ((Long) blz.b(bjqVar, bjoVar)).longValue() == j) {
            return null;
        }
        bli bliVarB = bli.b(bjqVar);
        bliVarB.c(bjoVar, Long.valueOf(j));
        return new ale(bliVarB);
    }

    public static void b() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public static boolean c(bnk bnkVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bnkVar != bnk.STREAM_SHARING) {
            Map map = b;
            Long lValueOf = Long.valueOf(j);
            return map.containsKey(lValueOf) && ((Set) map.get(lValueOf)).contains(bnkVar);
        }
        Map map2 = c;
        Long lValueOf2 = Long.valueOf(j);
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(lValueOf2);
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((bnk) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(bjq bjqVar, bnk bnkVar) {
        if (((Boolean) bjqVar.n(bni.w, false)).booleanValue()) {
            return false;
        }
        bjo bjoVar = bkp.a;
        return bjqVar.t(bjoVar) && atb.a(bnkVar, ((Integer) bjqVar.m(bjoVar)).intValue()) == 5;
    }
}
