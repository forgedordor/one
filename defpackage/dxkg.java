package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkg {
    private static final eksp a = eksp.c("GnpSdk");
    private static volatile dxkh b = null;

    public static dxkh a(Context context) {
        dxkh dxkhVarA;
        if (b == null) {
            Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof spw) {
                dxkhVarA = (dxkh) ((spw) applicationContext).a();
            } else {
                try {
                    dxkhVarA = (dxkh) ehli.a(context, dxkh.class);
                } catch (IllegalStateException e) {
                    ((eksl) ((eksl) a.o().g(e)).h("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 63, "Gnp.java")).q("Couldn't fetch GnpComponent entry point (relevant for Hilt/Tiktok integrations)");
                    try {
                        dxkhVarA = ((dxki) ehli.a(context, dxki.class)).a();
                    } catch (IllegalStateException e2) {
                        ((eksl) ((eksl) a.o().g(e2)).h("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 74, "Gnp.java")).q("Couldn't fetch GnpComponentSupplier entry point (relevant for custom integrations)");
                        throw new IllegalStateException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
                    }
                }
            }
            b = dxkhVarA;
        }
        b.dO().a(context);
        return b;
    }
}
