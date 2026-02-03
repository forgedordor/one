package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcv extends phj {
    private final Context c;

    public qcv(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        if (this.b >= 10) {
            pjoVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
