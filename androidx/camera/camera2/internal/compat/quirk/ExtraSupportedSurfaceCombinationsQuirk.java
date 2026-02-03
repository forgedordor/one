package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bhp;
import defpackage.bls;
import defpackage.bmt;
import defpackage.bmu;
import defpackage.bmv;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements bls {
    public static final bmt a;
    public static final bmt b;
    private static final Set c;
    private static final Set d;

    static {
        bmt bmtVar = new bmt();
        bmu bmuVar = bmu.VGA;
        bmu[] bmuVarArr = bmv.b;
        bmtVar.b(new bhp(2, bmuVar, 0L));
        bmtVar.b(new bhp(1, bmu.PREVIEW, 0L));
        bmtVar.b(new bhp(2, bmu.MAXIMUM, 0L));
        a = bmtVar;
        bmt bmtVar2 = new bmt();
        bmtVar2.b(new bhp(1, bmu.PREVIEW, 0L));
        bmtVar2.b(new bhp(1, bmu.VGA, 0L));
        bmtVar2.b(new bhp(2, bmu.MAXIMUM, 0L));
        b = bmtVar2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean a() {
        return "heroqltevzw".equalsIgnoreCase(Build.DEVICE) || "heroqltetmo".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean b() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
