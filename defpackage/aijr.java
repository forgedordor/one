package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aijr extends fdbo implements fdau {
    public aijr(Object obj) {
        super(3, obj, AlarmManager.class, "setAndAllowWhileIdle", "setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        PendingIntent pendingIntent = (PendingIntent) obj3;
        pendingIntent.getClass();
        ((AlarmManager) this.g).setAndAllowWhileIdle(iIntValue, jLongValue, pendingIntent);
        return fctx.a;
    }
}
