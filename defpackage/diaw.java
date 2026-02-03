package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diaw {
    private final List a;
    private final dhzx b;

    public diaw() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final diau a(List list) throws RemoteException {
        diam diamVar;
        dian dianVar;
        diau diauVar = new diau();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                diamVar = (diam) ((ListenableFuture) it.next()).get();
                dhzx dhzxVar = this.b;
                if (dhzxVar != null) {
                    try {
                        diap diapVar = diamVar.c;
                        if (diapVar == null || (dianVar = diamVar.b) == null) {
                            Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                        } else {
                            dbjt dbjtVar = dianVar.c;
                            int i = diapVar.a(dbjtVar).b;
                            diaf diafVar = dhzxVar.b;
                            if (i == 5) {
                                String str = dianVar.b;
                                Bundle bundleA = ((diad) diafVar).a();
                                bundleA.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((diad) diafVar).b.call("mark_fix_completed", null, bundleA);
                            } else {
                                diapVar.a(dbjtVar);
                                String str2 = dianVar.b;
                                Bundle bundleA2 = ((diad) diafVar).a();
                                bundleA2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((diad) diafVar).b.call("mark_fix_attempted", null, bundleA2);
                            }
                        }
                    } catch (RemoteException unused) {
                        diap diapVar2 = dhzxVar.c;
                        diaa diaaVar = dhzxVar.a;
                        dbkx dbkxVar = (dbkx) dbky.a.createBuilder();
                        dian dianVar2 = diamVar.b;
                        dbjt dbjtVar2 = dianVar2.c;
                        dbkxVar.copyOnWrite();
                        ((dbky) dbkxVar.instance).b = dbjtVar2.a();
                        String str3 = dianVar2.b;
                        dbkxVar.copyOnWrite();
                        dbky dbkyVar = (dbky) dbkxVar.instance;
                        str3.getClass();
                        dbkyVar.d = str3;
                        diaaVar.e(diapVar2.b, (dbky) dbkxVar.build(), diapVar2.a);
                    }
                }
                diauVar.a |= diamVar.b();
                diauVar.b |= diamVar.a();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
            if (diamVar.a() && diamVar.c != null) {
                Context context = diamVar.c.b;
                synchronized (dibb.class) {
                    Thread thread = dibb.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    if (dibb.b != null) {
                        Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                        dibb.b.getClass();
                    } else {
                        final Context applicationContext = context.getApplicationContext();
                        Thread thread2 = new Thread(new Runnable() { // from class: diba
                            @Override // java.lang.Runnable
                            public final void run() throws InterruptedException {
                                try {
                                    Thread.sleep(Math.max(0L, 600000L));
                                } catch (InterruptedException e2) {
                                    Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e2);
                                    Thread.currentThread().interrupt();
                                }
                                dibb.a(applicationContext);
                                dibb.b();
                            }
                        });
                        thread2.start();
                        dibb.a = thread2;
                        dibb.b = thread2;
                    }
                }
            } else if (diamVar.b()) {
                synchronized (dibb.class) {
                    Thread thread3 = dibb.a;
                    if (thread3 == null || !thread3.isAlive()) {
                        Thread thread4 = new Thread(new Runnable() { // from class: diaz
                            @Override // java.lang.Runnable
                            public final void run() throws InterruptedException {
                                try {
                                    Thread.sleep(Math.max(0L, 600000L));
                                } catch (InterruptedException e2) {
                                    Thread.currentThread().interrupt();
                                    synchronized (dibb.class) {
                                        Thread thread5 = dibb.b;
                                        if (thread5 != null && thread5.isAlive()) {
                                            Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e2);
                                            return;
                                        }
                                    }
                                }
                                dibb.b();
                            }
                        });
                        thread4.start();
                        dibb.a = thread4;
                    } else {
                        Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                        dibb.a.getClass();
                    }
                }
            } else {
                continue;
            }
        }
        return diauVar;
    }

    public final diav b(final diap diapVar) throws Throwable {
        ListenableFuture listenableFutureA;
        diau diauVarA;
        ListenableFuture listenableFutureA2;
        boolean z;
        final diau diauVar = new diau();
        try {
            ekgb<dian> ekgbVarN = ekgb.n(this.a);
            final ArrayList arrayList = new ArrayList(ekgbVarN.size());
            try {
                Iterator<E> it = ekgbVarN.iterator();
                while (it.hasNext()) {
                    if (((dian) it.next()).a(diapVar)) {
                        Context context = diapVar.b;
                        final dias diasVar = new dias(context);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (final dian dianVar : ekgbVarN) {
                            diao diaoVar = new diao(diapVar);
                            diaoVar.g = dianVar;
                            diap diapVarA = diaoVar.a();
                            if (dianVar.a(diapVarA)) {
                                diao diaoVar2 = new diao(diapVarA);
                                diaj diajVar = dianVar.e;
                                diaoVar2.b(new diak(diajVar.a, 3));
                                final diap diapVarA2 = diaoVar2.a();
                                dianVar.c(diapVarA2, diajVar, diasVar);
                                listenableFutureA2 = dianVar.f ? diah.a(new Callable() { // from class: dial
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        dian dianVar2 = dianVar;
                                        return dianVar2.b(diapVarA2, diasVar, dianVar2.e);
                                    }
                                }) : eork.i(dianVar.b(diapVarA2, diasVar, diajVar));
                                z = true;
                            } else {
                                listenableFutureA2 = eork.i(diam.a);
                                z = false;
                            }
                            z3 |= z;
                            z2 |= !listenableFutureA2.isDone();
                            arrayList.add(listenableFutureA2);
                        }
                        if (z2) {
                            diau diauVar2 = new diau();
                            try {
                                listenableFutureA = diah.a(Executors.callable(new Runnable() { // from class: diat
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        diaw diawVar = this.a;
                                        diau diauVar3 = diauVar;
                                        List list = arrayList;
                                        diap diapVar2 = diapVar;
                                        try {
                                            diau diauVarA2 = diawVar.a(list);
                                            diauVar3.a |= diauVarA2.a;
                                            diauVar3.b = diauVarA2.b | diauVar3.b;
                                            if (diauVar3.b()) {
                                                diauVar3.a(diapVar2.b);
                                            }
                                        } catch (Throwable th) {
                                            if (diauVar3.b()) {
                                                diauVar3.a(diapVar2.b);
                                            }
                                            throw th;
                                        }
                                    }
                                }));
                                diauVarA = diauVar2;
                            } catch (Throwable th) {
                                th = th;
                                diauVar = diauVar2;
                                if (diauVar.b()) {
                                    diauVar.a(diapVar.b);
                                }
                                throw th;
                            }
                        } else {
                            listenableFutureA = eork.i(null);
                            diauVarA = a(arrayList);
                        }
                        diav diavVar = new diav(z3, listenableFutureA);
                        if (diauVarA.b()) {
                            diauVarA.a(context);
                        }
                        return diavVar;
                    }
                }
                diav diavVar2 = new diav(false, eork.i(null));
                if (diauVar.b()) {
                    diauVar.a(diapVar.b);
                }
                return diavVar2;
            } catch (RuntimeException e) {
                diai.a(e, diapVar, "AppDoctorFixerFramework");
                diav diavVar3 = new diav(false, eork.h(e));
                if (diauVar.b()) {
                    diauVar.a(diapVar.b);
                }
                return diavVar3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(dian dianVar) {
        List list = this.a;
        ejwl.m(!list.contains(dianVar), "The same fixer cannot be added twice");
        list.add(dianVar);
    }

    public diaw(dhzx dhzxVar) {
        this.a = new ArrayList();
        this.b = dhzxVar;
    }
}
