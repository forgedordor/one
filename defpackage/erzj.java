package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.R;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzj {
    public static final Object a = new Object();
    public static final Map b = new csq();
    public final escn c;
    public final escx e;
    public final esgu f;
    private final Context h;
    private final String i;
    private final erzu j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    protected erzj(final Context context, String str, erzu erzuVar) throws PackageManager.NameNotFoundException {
        List<String> arrayList;
        new CopyOnWriteArrayList();
        dclh.m(context);
        this.h = context;
        dclh.k(str);
        this.i = str;
        this.j = erzuVar;
        erzv erzvVar = eslj.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new esgu() { // from class: escd
                @Override // defpackage.esgu
                public final Object a() {
                    return esce.a(str3);
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        eseh esehVar = eseh.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        escm.b(new FirebaseCommonRegistrar(), arrayList3);
        escm.b(new ExecutorsRegistrar(), arrayList3);
        escm.a(esca.e(context, Context.class, new Class[0]), arrayList4);
        escm.a(esca.e(this, erzj.class, new Class[0]), arrayList4);
        escm.a(esca.e(erzuVar, erzu.class, new Class[0]), arrayList4);
        esll esllVar = new esll();
        if (lal.a(context) && eslj.b.get()) {
            escm.a(esca.e(erzvVar, erzv.class, new Class[0]), arrayList4);
        }
        escn escnVar = new escn(esehVar, arrayList3, arrayList4, esllVar);
        this.c = escnVar;
        Trace.endSection();
        this.e = new escx(new esgu() { // from class: erzf
            @Override // defpackage.esgu
            public final Object a() {
                erzj erzjVar = this.a;
                escn escnVar2 = erzjVar.c;
                String strH = erzjVar.h();
                return new esid(context, strH);
            }
        });
        this.f = escb.a(escnVar, esfo.class);
        erzg erzgVar = new erzg(this);
        i();
        if (this.d.get() && dcgo.a.c()) {
            erzgVar.a(true);
        }
        this.g.add(erzgVar);
        Trace.endSection();
    }

    public static erzj b() {
        erzj erzjVar;
        synchronized (a) {
            erzjVar = (erzj) b.get("[DEFAULT]");
            if (erzjVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + dcnj.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((esfo) erzjVar.f.a()).c();
        }
        return erzjVar;
    }

    public static erzj c(Context context) {
        synchronized (a) {
            if (b.containsKey("[DEFAULT]")) {
                return b();
            }
            dclh.m(context);
            Resources resources = context.getResources();
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            String strA = dclp.a("google_app_id", resources, resourcePackageName);
            erzu erzuVar = TextUtils.isEmpty(strA) ? null : new erzu(strA, dclp.a("google_api_key", resources, resourcePackageName), dclp.a("firebase_database_url", resources, resourcePackageName), dclp.a("ga_trackingId", resources, resourcePackageName), dclp.a("gcm_defaultSenderId", resources, resourcePackageName), dclp.a("google_storage_bucket", resources, resourcePackageName), dclp.a("project_id", resources, resourcePackageName));
            if (erzuVar != null) {
                return d(context, erzuVar, "[DEFAULT]");
            }
            Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    public static erzj d(Context context, erzu erzuVar, String str) {
        erzj erzjVar;
        AtomicReference atomicReference = erzh.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = erzh.a;
            if (atomicReference2.get() == null) {
                erzh erzhVar = new erzh();
                while (true) {
                    if (atomicReference2.compareAndSet(null, erzhVar)) {
                        dcgo.b(application);
                        dcgo.a.a(erzhVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            dclh.i(!map.containsKey(strTrim), a.a(strTrim, "FirebaseApp name ", " already exists!"));
            dclh.n(context, "Application context cannot be null.");
            erzjVar = new erzj(context, strTrim, erzuVar);
            map.put(strTrim, erzjVar);
        }
        erzjVar.j();
        return erzjVar;
    }

    public final Context a() {
        i();
        return this.h;
    }

    public final erzu e() {
        i();
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof erzj) {
            return this.i.equals(((erzj) obj).g());
        }
        return false;
    }

    public final Object f(Class cls) {
        i();
        return escb.c(this.c, cls);
    }

    public final String g() {
        i();
        return this.i;
    }

    public final String h() {
        return dcmw.c(g().getBytes(Charset.defaultCharset())) + "+" + dcmw.c(e().b.getBytes(Charset.defaultCharset()));
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final void i() {
        dclh.i(!this.k.get(), "FirebaseApp was deleted");
    }

    public final void j() {
        HashMap map;
        Context context = this.h;
        if (!lal.a(context)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(g())));
            AtomicReference atomicReference = erzi.a;
            if (atomicReference.get() == null) {
                erzi erziVar = new erzi(context);
                while (!atomicReference.compareAndSet(null, erziVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(erziVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(g())));
        escn escnVar = this.c;
        Boolean boolValueOf = Boolean.valueOf(k());
        while (true) {
            AtomicReference atomicReference2 = escnVar.b;
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (escnVar) {
                    map = new HashMap(escnVar.a);
                }
                escnVar.f(map);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((esfo) this.f.a()).c();
    }

    public final boolean k() {
        return "[DEFAULT]".equals(g());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("name", this.i, arrayList);
        dclb.b("options", this.j, arrayList);
        return dclb.a(arrayList, this);
    }
}
