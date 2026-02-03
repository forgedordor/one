package defpackage;

import android.app.backup.BackupManager;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szy implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final BackupManager b;
    private final eosc d;
    private final String e;
    private final dids f;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate");
    static final cczi a = cdag.p(160945957);

    public szy(String str, dids didsVar, BackupManager backupManager, eosc eoscVar) {
        this.d = eoscVar;
        didsVar.getClass();
        this.e = str;
        this.f = didsVar;
        this.b = backupManager;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean zB = this.f.b(str);
        ekrw ekrwVarG = c.g();
        ekrwVarG.X(eksq.a, "BugleBackup");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate", "onSharedPreferenceChanged", 75, "BugleOnSharedPreferenceChangeListenerDelegate.java")).I("Preference \"%s\" in \"%s\" was modified. %s", str, this.e, true != zB ? "Ignoring (key not backed up)." : "Scheduling a backup.");
        if (zB) {
            if (((Boolean) a.e()).booleanValue()) {
                auvh.h(eijx.f(new Runnable() { // from class: szx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b.dataChanged();
                    }
                }, this.d));
            } else {
                this.b.dataChanged();
            }
        }
    }
}
