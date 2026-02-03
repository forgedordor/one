package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddq {
    public static void a(Activity activity) {
        try {
            ComponentCallbacks2 application = activity.getApplication();
            if (application instanceof ecyi) {
                ((ecyi) application).a().b(activity);
                return;
            }
            if (application instanceof eygk) {
                ComponentCallbacks2 application2 = activity.getApplication();
                if (!(application2 instanceof eygk)) {
                    throw new RuntimeException(String.format("%s does not implement %s", application2.getClass().getCanonicalName(), eygk.class.getCanonicalName()));
                }
                eygk eygkVar = (eygk) application2;
                eygj eygjVarAb = eygkVar.ab();
                eygkVar.getClass();
                eygjVarAb.getClass();
                eygjVarAb.a(activity);
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
