package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class druh {
    public static final drtr a;
    static final drtr b;

    static {
        String str;
        drtt.d("haptic_improvement_long_press_effect");
        a = drtt.a("vibration_effect_min_sdk", 1024L);
        drtr drtrVarA = drtt.a("config_haptic_cutoff", 200L);
        drxr drxrVar = drxr.b;
        synchronized (drxrVar) {
            csq csqVar = drxrVar.c;
            if (csqVar.containsKey("ro.com.google.ime.haptic.cutoff")) {
                str = (String) csqVar.get("ro.com.google.ime.haptic.cutoff");
            } else {
                Method method = drxrVar.d;
                String str2 = null;
                if (method != null) {
                    try {
                        String str3 = (String) method.invoke(null, "ro.com.google.ime.haptic.cutoff");
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                    } catch (Exception e) {
                        ((ekrd) ((ekrd) ((ekrd) drxr.a.j()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "readSystemProperty", 126, "SystemProperties.java")).t("Fail to invoke SystemProperties.get(%s)", "ro.com.google.ime.haptic.cutoff");
                    }
                }
                csqVar.put("ro.com.google.ime.haptic.cutoff", str2);
                str = str2;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            drtz drtzVar = drtz.OEM;
            if (drtrVarA.a(drtzVar, false) == null) {
                try {
                    ((drtv) drtrVarA).h(drtzVar, Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException e2) {
                    ((ekrd) ((ekrd) ((ekrd) drtt.a.j()).g(e2)).h("com/google/android/libraries/inputmethod/flag/FlagFactory", "createLongFlagWithSystemProperty", 212, "FlagFactory.java")).D("Fail to parse long for %s: %s", "ro.com.google.ime.haptic.cutoff", str);
                }
            }
        }
        b = drtrVarA;
    }
}
