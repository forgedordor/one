package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfcp {
    public static boolean a = false;
    public static final SparseBooleanArray b = new SparseBooleanArray();
    public static dfcl c = null;
    public static final dfco d = new dfco();
    public static final BroadcastReceiver e = new dfcm();
    public static deyx f = null;

    public static void a(Context context) throws Throwable {
        dhja.k("Initializing Carrier Services Logging.", new Object[0]);
        dhja.y(context);
        a = true;
    }

    public static synchronized void b(Context context) {
        if (c == null) {
            dhja.k("Initializing Carrier Services Library.", new Object[0]);
            dzzh.f(context);
            dfoc.m();
            dfaq.I(context);
            c = new dfcl();
            final Context applicationContext = context.getApplicationContext();
            SparseBooleanArray sparseBooleanArray = b;
            if (!sparseBooleanArray.get(applicationContext.hashCode(), false)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
                dfco dfcoVar = d;
                kxj.g(applicationContext, dfcoVar, intentFilter);
                Runnable runnable = new Runnable() { // from class: dfck
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        boolean z = dfcp.a;
                        ewqb ewqbVarF = dfaq.E().F();
                        deyx deyxVar = dfcp.f;
                        Context context2 = applicationContext;
                        if (deyxVar != null) {
                            deyxVar.d(context2, ewqbVarF);
                        }
                        if (!Objects.isNull(dfcp.c)) {
                            dfcl dfclVar = dfcp.c;
                            if (dfclVar.a != ((Boolean) dfbt.a.a()).booleanValue()) {
                                System.exit(0);
                            }
                        }
                        if (dfcp.a) {
                            dhja.y(context2);
                        }
                    }
                };
                List list = dfcoVar.a;
                synchronized (list) {
                    list.add(runnable);
                }
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter2.addDataScheme("package");
                applicationContext.registerReceiver(e, intentFilter2);
                sparseBooleanArray.put(applicationContext.hashCode(), true);
            }
            f = (deyx) ((dfdn) dfdr.a(context.getApplicationContext())).bA.b();
        }
    }
}
