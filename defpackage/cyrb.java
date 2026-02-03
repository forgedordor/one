package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/gaia/GaiaIntentsImpl");

    public final void a(Context context, boolean z) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/gaia/GaiaIntentsImpl", "launchGaiaPairing", 37, "GaiaIntentsImpl.java")).q("GaiaIntents: Launching GaiaPairing page.");
        Intent intentA = aiiw.c(context, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
        intentA.putExtra("turnOnGaiaPairing", z);
        eiid.o(context, intentA);
    }
}
