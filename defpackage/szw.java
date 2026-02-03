package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szw {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener");
    public final Context a;
    public final tbx b;
    private final eosc d;
    private final cvw e = new cvw();

    public szw(Context context, eosc eoscVar, tbx tbxVar) {
        this.a = context;
        this.d = eoscVar;
        this.b = tbxVar;
    }

    public final void a(String str, dids didsVar) {
        synchronized (szy.class) {
            cvw cvwVar = this.e;
            if (cvwVar.containsKey(str)) {
                ekrw ekrwVarJ = c.j();
                ekrwVarJ.X(eksq.a, "BugleBackup");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 54, "BugleOnSharedPreferenceChangeListener.java")).t("Preference change listener for \"%s\" has already been registered.", str);
            } else {
                szy szyVar = new szy(str, didsVar, new BackupManager(this.a), this.d);
                cvwVar.put(str, szyVar);
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleBackup");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 68, "BugleOnSharedPreferenceChangeListener.java")).t("Registering preference change listener for \"%s\".", str);
                this.a.getSharedPreferences(str, 0).registerOnSharedPreferenceChangeListener(szyVar);
            }
        }
    }
}
