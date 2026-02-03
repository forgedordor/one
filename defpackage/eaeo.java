package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaeo extends BroadcastReceiver {
    public static volatile eacx a;
    static volatile eacy b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.a(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        eacx eacxVar = a;
        if (eacxVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        eadb[] eadbVarArrA = eacxVar.a.a(stringExtra);
        if (eadbVarArrA != null) {
            for (eadb eadbVar : eadbVarArrA) {
                eada eadaVar = eadb.a;
                eadbVar.b();
            }
        }
    }
}
