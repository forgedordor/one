package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qhm extends qhp {
    private final BroadcastReceiver e;

    public qhm(Context context, qmg qmgVar) {
        super(context, qmgVar);
        this.e = new qhl(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.qhp
    public final void d() {
        qas.c().a(qhn.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.qhp
    public final void e() {
        qas.c().a(qhn.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
