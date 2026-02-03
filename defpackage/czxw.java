package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxw {
    public final Context a;
    public final cogw b;
    public final aaxw c;

    public czxw(Context context, cogw cogwVar, aaxw aaxwVar) {
        this.a = context;
        this.b = cogwVar;
        this.c = aaxwVar;
    }

    public final String a(long j) {
        long jA = cqjl.a(this.b.f().toEpochMilli(), j, ZoneId.systemDefault());
        if (jA == 0) {
            return this.a.getResources().getString(R.string.reminder_datetime_today_format, this.c.b(j));
        }
        if (jA != 1) {
            return this.c.c(j);
        }
        return this.a.getResources().getString(R.string.reminder_datetime_tomorrow_format, this.c.b(j));
    }

    public final String b(long j, boolean z) {
        return this.a.getResources().getString(true != z ? R.string.reminder_snackbar_set_reminder_title_text : R.string.reminder_snackbar_update_reminder_title_text, a(j));
    }
}
