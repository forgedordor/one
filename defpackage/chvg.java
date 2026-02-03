package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chvg {
    private final Context a;
    private final fcsu b;
    private final chvo c;

    public chvg(Context context, fcsu fcsuVar, chvo chvoVar) {
        context.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = chvoVar;
    }

    @fcsv
    public final int a(chvn chvnVar) {
        chvnVar.getClass();
        ((ekrd) chvo.a.e().h("com/google/android/apps/messaging/shared/rcs/RcsSubIdFromPreferencesLogger", "logRcsSubIdFromPreferencesCaller", 15, "RcsSubIdFromPreferencesLogger.kt")).t("Called getRcsSubId() from %s", chvnVar);
        this.c.b.e("Bugle.Rcs.Shared.RcsPreferences.GetRcsSubIdCaller.Counts", chvnVar.y);
        return ((crqv) this.b.b()).d("rcs_sub_id", -2);
    }

    public final String b() {
        String string = this.a.getResources().getString(R.string.unknown_business_name);
        string.getClass();
        return string;
    }

    public final boolean c() {
        fcsu fcsuVar = this.b;
        Resources resources = this.a.getResources();
        return ((crqv) fcsuVar.b()).q(resources.getString(R.string.rcs_mobile_auto_download_in_roaming_pref_key), resources.getBoolean(R.bool.enable_rcs_mobile_auto_download_in_roaming_default));
    }

    public final boolean d() {
        fcsu fcsuVar = this.b;
        Resources resources = this.a.getResources();
        return ((crqv) fcsuVar.b()).q(resources.getString(R.string.enable_rcs_pref_key), resources.getBoolean(R.bool.enable_rcs_pref_default));
    }
}
