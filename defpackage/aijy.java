package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aijy {
    private final Context a;

    public aijy(Context context) {
        context.getClass();
        this.a = context;
    }

    public final PendingIntent a(Intent intent, aiju aijuVar) {
        intent.setType(aijuVar.c);
        intent.putExtra("com.google.android.apps.messaging.shared.alarm.task", aijuVar.d);
        PendingIntent pendingIntentD = ebsn.d(this.a, 0, intent, crag.a(0));
        pendingIntentD.getClass();
        return pendingIntentD;
    }
}
