package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drng {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper");
    public static final ejwc b = ejwc.d(',');
    public static final ejxk c = ejxk.b(',');
    static final drtr d = drtt.d("enable_emoji_variant_preferences_backup");
    private final Context e;
    private SharedPreferences f = null;

    public drng(Context context) {
        this.e = context;
    }

    final SharedPreferences a() {
        if (this.f == null) {
            this.f = PreferenceManager.getDefaultSharedPreferences(dryh.a(this.e));
        }
        return this.f;
    }
}
