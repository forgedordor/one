package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrz {
    private final Context a;
    private final cogw b;

    public cgrz(Context context, cogw cogwVar) {
        context.getClass();
        cogwVar.getClass();
        this.a = context;
        this.b = cogwVar;
    }

    public final String a(long j, boolean z) {
        return qxq.b(this.a, true != z ? R.string.nudge_banner_sent_title : R.string.nudge_banner_received_title, "days_ago", Long.valueOf(cqjl.a(this.b.f().toEpochMilli(), j, ZoneId.systemDefault())));
    }
}
