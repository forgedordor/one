package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esix {
    private static final Object a = new Object();
    private static esku b;

    public static defn a(Context context, final Intent intent, boolean z) {
        esku eskuVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            if (b == null) {
                b = new esku(context);
            }
            eskuVar = b;
        }
        if (!z) {
            return eskuVar.a(intent).c(new esis(), new deeq() { // from class: esiv
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    return -1;
                }
            });
        }
        if (esjz.a().c(context)) {
            synchronized (eskn.b) {
                eskn.a(context);
                boolean zD = eskn.d(intent);
                eskn.c(intent, true);
                if (!zD) {
                    eskn.c.a(eskn.a);
                }
                eskuVar.a(intent).s(new defb() { // from class: eskm
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        eskn.b(intent);
                    }
                });
            }
        } else {
            eskuVar.a(intent);
        }
        return degc.c(-1);
    }

    public static final defn b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0;
        return (i < 26 || z) ? degc.a(executor, new Callable() { // from class: esit
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                ComponentName componentNameStartService;
                esjz esjzVarA = esjz.a();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                Intent intent2 = intent;
                Context context2 = context;
                esjzVarA.c.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                String strB = esjzVarA.b(context2, intent3);
                if (strB != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(strB));
                    }
                    intent3.setClassName(context2.getPackageName(), strB);
                }
                try {
                    if (esjzVarA.c(context2)) {
                        synchronized (eskn.b) {
                            eskn.a(context2);
                            boolean zD = eskn.d(intent3);
                            eskn.c(intent3, true);
                            componentNameStartService = context2.startService(intent3);
                            if (componentNameStartService == null) {
                                componentNameStartService = null;
                            } else if (!zD) {
                                eskn.c.a(eskn.a);
                            }
                        }
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
                    i2 = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).e(executor, new deeq() { // from class: esiu
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                if (((Integer) defnVar.i()).intValue() != 402) {
                    return defnVar;
                }
                boolean z2 = z;
                return esix.a(context, intent, z2).c(new esis(), new deeq() { // from class: esiw
                    @Override // defpackage.deeq
                    public final Object a(defn defnVar2) {
                        return 403;
                    }
                });
            }
        }) : a(context, intent, false);
    }
}
