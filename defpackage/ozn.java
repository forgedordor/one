package defpackage;

import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozn implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public ozn(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
