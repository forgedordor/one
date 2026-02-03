package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfw {
    public static final String a = qas.d("SystemJobInfoConverter");
    public final ComponentName b;

    public qfw(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
