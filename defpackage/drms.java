package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drms implements eora {
    final /* synthetic */ drnj a;
    final /* synthetic */ drmt b;

    public drms(drmt drmtVar, drnj drnjVar) {
        this.a = drnjVar;
        this.b = drmtVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ekrd) ((ekrd) drmt.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onSuccess", 141, "DefaultStickyPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
        ekgp ekgpVarJ = ekgp.j(DesugarCollections.unmodifiableMap(this.a.b));
        if (!((Boolean) drng.d.b()).booleanValue()) {
            ((ekrd) ((ekrd) drng.a.d()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 115, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
            return;
        }
        HashSet hashSet = new HashSet();
        ekqg ekqgVarListIterator = ekgpVarJ.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            hashSet.add(drng.b.g(entry.getKey(), entry.getValue(), new Object[0]));
        }
        this.b.d.a().edit().putStringSet("emoji_variant_prefs", hashSet).apply();
        if (!ekgpVarJ.isEmpty()) {
            ekrg ekrgVar = drvi.a;
            drvg.a.b(drnk.a, 0);
        }
        ((ekrd) ((ekrd) drng.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 133, "EmojiVariantPreferencesBackupHelper.java")).q("Backed up emoji variant preferences to SharedPreferences");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) drmt.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onFailure", (char) 147, "DefaultStickyPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
    }
}
