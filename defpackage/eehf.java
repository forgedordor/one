package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehf {
    public static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final eehe b;
    private static final eehe c;
    private static final Map d;
    private static final Map e;

    static {
        eehc eehcVar = new eehc();
        b = eehcVar;
        eehd eehdVar = new eehd();
        c = eehdVar;
        HashMap map = new HashMap();
        map.put("fcnt", eehcVar);
        map.put("google", eehcVar);
        map.put("hmd global", eehcVar);
        map.put("infinix", eehcVar);
        map.put("infinix mobility limited", eehcVar);
        map.put("itel", eehcVar);
        map.put("kyocera", eehcVar);
        map.put("lenovo", eehcVar);
        map.put("lge", eehcVar);
        map.put("meizu", eehcVar);
        map.put("motorola", eehcVar);
        map.put("nothing", eehcVar);
        map.put("oneplus", eehcVar);
        map.put("oppo", eehcVar);
        map.put("realme", eehcVar);
        map.put("robolectric", eehcVar);
        map.put("samsung", eehdVar);
        map.put("sharp", eehcVar);
        map.put("shift", eehcVar);
        map.put("sony", eehcVar);
        map.put("tcl", eehcVar);
        map.put("tecno", eehcVar);
        map.put("tecno mobile limited", eehcVar);
        map.put("vivo", eehcVar);
        map.put("wingtech", eehcVar);
        map.put("xiaomi", eehcVar);
        d = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", eehcVar);
        map2.put("jio", eehcVar);
        e = DesugarCollections.unmodifiableMap(map2);
    }

    private eehf() {
    }

    public static Context a(Context context) {
        if (b()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != 0) {
                return new ContextThemeWrapper(context, resourceId);
            }
        }
        return context;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (laa.b()) {
            return true;
        }
        eehe eeheVar = (eehe) d.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
        if (eeheVar == null) {
            eeheVar = (eehe) e.get(Build.BRAND.toLowerCase(Locale.ROOT));
        }
        return eeheVar != null && eeheVar.a();
    }
}
