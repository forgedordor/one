package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwde extends BroadcastReceiver {
    final /* synthetic */ dwdf a;

    public dwde(dwdf dwdfVar) {
        this.a = dwdfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (dvjv.a(context)) {
            fbnd fbndVar = this.a.c;
            if (fbndVar instanceof fbqm) {
                ((fbqm) fbndVar).e();
            }
        }
    }
}
