package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aijo extends fdbo implements fdau {
    public aijo(Object obj) {
        super(3, obj, AlarmManager.class, "setExactAndAllowWhileIdle", "setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        PendingIntent pendingIntent = (PendingIntent) obj3;
        pendingIntent.getClass();
        ((AlarmManager) this.g).setExactAndAllowWhileIdle(iIntValue, jLongValue, pendingIntent);
        return fctx.a;
    }
}
