package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqrj {
    public static final cqce a = cqce.g("Bugle", "BugleSurveyClient");
    public static final ejxr b = cdag.w(183538828, "hats_next_survey_client_logging");
    public final fcsu c;
    public final cqse d;

    public cqrj(cqse cqseVar, fcsu fcsuVar) {
        this.d = cqseVar;
        this.c = fcsuVar;
    }

    public final void a(Context context) throws IOException {
        try {
            eiid.o(context, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(context.getPackageName())))));
        } catch (ActivityNotFoundException e) {
            cqca.f("BugleHappinessTracking", "Unable to launch play store rating. ".concat(e.toString()));
        }
    }
}
