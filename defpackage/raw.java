package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.car.app.model.Alert;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.google.android.libraries.glide.fife.module.FifeGlideModule;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class raw implements ComponentCallbacks2 {
    private static volatile raw h;
    private static volatile boolean i;
    public final rii a;
    public final rjj b;
    public final rbc c;
    public final rig d;
    public final List e = new ArrayList();
    public rbg f = rbg.NORMAL;
    public final rrp g;
    private final rhh j;
    private final rse k;

    public raw(Context context, rhh rhhVar, rjj rjjVar, rii riiVar, rig rigVar, rse rseVar, rrp rrpVar, rav ravVar, Map map, List list, List list2, rso rsoVar, rbe rbeVar) {
        this.j = rhhVar;
        this.a = riiVar;
        this.d = rigVar;
        this.b = rjjVar;
        this.k = rseVar;
        this.g = rrpVar;
        this.c = new rbc(context, rigVar, new rbo(this, list2, rsoVar), new rtv(), ravVar, map, list, rhhVar, rbeVar);
    }

    public static raw b(Context context) {
        boolean z;
        if (h == null) {
            GeneratedAppGlideModule generatedAppGlideModuleJ = j(context.getApplicationContext());
            synchronized (raw.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        rbb rbbVar = new rbb();
                        Context applicationContext = context.getApplicationContext();
                        List list = Collections.EMPTY_LIST;
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loading Glide modules");
                        }
                        ArrayList<FifeGlideModule> arrayList = new ArrayList();
                        int i2 = 2;
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null && applicationInfo.metaData != null) {
                                if (Log.isLoggable("ManifestParser", 2)) {
                                    Log.v("ManifestParser", "Got app info metadata: " + String.valueOf(applicationInfo.metaData));
                                }
                                for (String str : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                        arrayList.add(rsq.a(str));
                                        if (Log.isLoggable("ManifestParser", 3)) {
                                            Log.d("ManifestParser", a.v(str, "Loaded Glide module: "));
                                        }
                                    }
                                }
                                if (Log.isLoggable("ManifestParser", 3)) {
                                    Log.d("ManifestParser", "Finished loading Glide modules");
                                }
                            } else if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Got null app info metadata");
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            if (Log.isLoggable("ManifestParser", 6)) {
                                Log.e("ManifestParser", "Failed to parse glide modules", e);
                            }
                        }
                        if (generatedAppGlideModuleJ != null && !generatedAppGlideModuleJ.b().isEmpty()) {
                            Set setB = generatedAppGlideModuleJ.b();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                FifeGlideModule fifeGlideModule = (FifeGlideModule) it.next();
                                if (setB.contains(fifeGlideModule.getClass())) {
                                    if (Log.isLoggable("Glide", 3)) {
                                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: ".concat(String.valueOf(String.valueOf(fifeGlideModule))));
                                    }
                                    it.remove();
                                }
                            }
                        }
                        if (Log.isLoggable("Glide", 3)) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Log.d("Glide", "Discovered GlideModule from manifest: ".concat(String.valueOf(String.valueOf(((FifeGlideModule) it2.next()).getClass()))));
                            }
                        }
                        rbbVar.k = generatedAppGlideModuleJ != null ? generatedAppGlideModuleJ.a() : null;
                        for (FifeGlideModule fifeGlideModule2 : arrayList) {
                        }
                        if (generatedAppGlideModuleJ != null) {
                            generatedAppGlideModuleJ.c(applicationContext, rbbVar);
                        }
                        if (rbbVar.g == null) {
                            long j = rju.a;
                            rjq rjqVar = new rjq(false);
                            rjqVar.b(rju.a());
                            rjqVar.a = "source";
                            rbbVar.g = rjqVar.a();
                        }
                        if (rbbVar.h == null) {
                            long j2 = rju.a;
                            rjq rjqVar2 = new rjq(true);
                            rjqVar2.b(1);
                            rjqVar2.a = "disk-cache";
                            rbbVar.h = rjqVar2.a();
                        }
                        if (rbbVar.l == null) {
                            if (rju.a() < 4) {
                                i2 = 1;
                            }
                            rjq rjqVar3 = new rjq(true);
                            rjqVar3.b(i2);
                            rjqVar3.a = "animation";
                            rbbVar.l = rjqVar3.a();
                        }
                        if (rbbVar.i == null) {
                            rbbVar.i = new rjm(new rjk(applicationContext));
                        }
                        if (rbbVar.o == null) {
                            rbbVar.o = new rrp();
                        }
                        if (rbbVar.d == null) {
                            int i3 = rbbVar.i.a;
                            if (i3 > 0) {
                                rbbVar.d = new rir(i3);
                            } else {
                                rbbVar.d = new rij();
                            }
                        }
                        if (rbbVar.e == null) {
                            rbbVar.e = new riq(rbbVar.i.c);
                        }
                        if (rbbVar.f == null) {
                            rbbVar.f = new rjh(rbbVar.i.b);
                        }
                        if (rbbVar.n == null) {
                            rbbVar.n = new rjg(applicationContext);
                        }
                        if (rbbVar.c == null) {
                            rbbVar.c = new rhh(rbbVar.f, rbbVar.n, rbbVar.h, rbbVar.g, new rju(new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, rju.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new rjt("source-unlimited", false))), rbbVar.l);
                        }
                        List list2 = rbbVar.m;
                        if (list2 == null) {
                            rbbVar.m = Collections.EMPTY_LIST;
                        } else {
                            rbbVar.m = DesugarCollections.unmodifiableList(list2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                z = false;
                                                try {
                                                    raw rawVar = new raw(applicationContext, rbbVar.c, rbbVar.f, rbbVar.d, rbbVar.e, new rse(rbbVar.k), rbbVar.o, rbbVar.j, rbbVar.a, rbbVar.m, arrayList, generatedAppGlideModuleJ, new rbe(rbbVar.b));
                                                    applicationContext.registerComponentCallbacks(rawVar);
                                                    h = rawVar;
                                                    i = false;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i = z;
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z = false;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = false;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z = false;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z = false;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                z = false;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            z = false;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        z = false;
                    }
                }
            }
        }
        return h;
    }

    public static rbv c(Context context) {
        return f(context).b(context);
    }

    public static rbv d(ea eaVar) {
        return f(eaVar.z()).c(eaVar);
    }

    public static rbv e(View view) {
        rse rseVarF = f(view.getContext());
        if (rvk.m()) {
            return rseVarF.b(view.getContext().getApplicationContext());
        }
        rvi.f(view);
        rvi.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = rse.a(view.getContext());
        if (activityA == null) {
            return rseVarF.b(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof eg)) {
            return rseVarF.b(view.getContext().getApplicationContext());
        }
        eg egVar = (eg) activityA;
        csq csqVar = rseVarF.a;
        csqVar.clear();
        rse.e(egVar.a().o(), csqVar);
        View viewFindViewById = egVar.findViewById(R.id.content);
        ea eaVar = null;
        while (!view.equals(viewFindViewById) && (eaVar = (ea) csqVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        csqVar.clear();
        return eaVar != null ? rseVarF.c(eaVar) : rseVarF.d(egVar);
    }

    public static rse f(Context context) {
        rvi.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).k;
    }

    private static GeneratedAppGlideModule j(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            k(e);
            return null;
        } catch (InstantiationException e2) {
            k(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            k(e3);
            return null;
        } catch (InvocationTargetException e4) {
            k(e4);
            return null;
        }
    }

    private static void k(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.c.getBaseContext();
    }

    public final void g() {
        rvk.i();
        this.j.f.a().b();
    }

    public final void h() {
        rvk.j();
        this.b.e();
        this.a.c();
        this.d.b();
    }

    public final void i(int i2) {
        rvk.j();
        List<rbv> list = this.e;
        synchronized (list) {
            for (rbv rbvVar : list) {
            }
        }
        Object obj = this.b;
        if (i2 >= 40) {
            ((rvf) obj).e();
        } else if (i2 >= 20) {
            rvf rvfVar = (rvf) obj;
            rvfVar.k(rvfVar.g() / 2);
        } else if (i2 == 15) {
            i2 = 15;
            rvf rvfVar2 = (rvf) obj;
            rvfVar2.k(rvfVar2.g() / 2);
        }
        this.a.f(i2);
        this.d.d(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        i(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
