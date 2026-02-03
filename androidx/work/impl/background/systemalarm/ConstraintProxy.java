package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.qas;
import defpackage.qfk;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;
    private static final String b = qas.d("ConstraintProxy");

    /* compiled from: PG */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qas qasVarC = qas.c();
        String str = b;
        Objects.toString(intent);
        qasVarC.a(str, "onReceive : ".concat(String.valueOf(intent)));
        context.startService(qfk.b(context));
    }
}
