package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drmo implements eora {
    final /* synthetic */ drnr a;
    final /* synthetic */ drmp b;

    public drmo(drmp drmpVar, drnr drnrVar) {
        this.a = drnrVar;
        this.b = drmpVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) drng.d.b()).booleanValue()) {
            drmp drmpVar = this.b;
            String strJ = eldz.e.j(this.a.toByteArray());
            drmpVar.d.a().edit().putString("emoji_variant_global_prefs", strJ).apply();
            if (!TextUtils.isEmpty(strJ)) {
                ekrg ekrgVar = drvi.a;
                drvg.a.b(drnk.a, 2);
            }
        } else {
            ((ekrd) ((ekrd) drng.a.d()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backupForGlobalPreference", 74, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
        }
        ((ekrd) ((ekrd) drmp.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onSuccess", 83, "DefaultGlobalPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) drmp.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onFailure", 'X', "DefaultGlobalPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
    }
}
