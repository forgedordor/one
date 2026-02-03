package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qcu implements qhx {
    public static final String a = qas.d("Processor");
    public final Context c;
    public final WorkDatabase d;
    private final pzd k;
    private final qmg l;
    public final Map f = new HashMap();
    public final Map e = new HashMap();
    public final Set h = new HashSet();
    public final List i = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object j = new Object();
    public final Map g = new HashMap();

    public qcu(Context context, pzd pzdVar, qmg qmgVar, WorkDatabase workDatabase) {
        this.c = context;
        this.k = pzdVar;
        this.l = qmgVar;
        this.d = workDatabase;
    }

    public static boolean e(String str, qfa qfaVar, int i) {
        if (qfaVar == null) {
            qas.c().a(a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
            return false;
        }
        qfaVar.j.t(new qei(i));
        qas.c().a(a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
        return true;
    }

    private final void h(final qiw qiwVar) {
        this.l.d.execute(new Runnable() { // from class: qcr
            @Override // java.lang.Runnable
            public final void run() {
                qcu qcuVar = this.a;
                Object obj = qcuVar.j;
                qiw qiwVar2 = qiwVar;
                synchronized (obj) {
                    Iterator it = qcuVar.i.iterator();
                    while (it.hasNext()) {
                        ((qcg) it.next()).a(qiwVar2, false);
                    }
                }
            }
        });
    }

    public final qfa a(String str) {
        Map map = this.e;
        qfa qfaVar = (qfa) map.remove(str);
        boolean z = qfaVar != null;
        if (!z) {
            qfaVar = (qfa) this.f.remove(str);
        }
        this.g.remove(str);
        if (z) {
            synchronized (this.j) {
                if (map.isEmpty()) {
                    Context context = this.c;
                    int i = qia.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        qas.c();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return qfaVar;
    }

    public final qfa b(String str) {
        qfa qfaVar = (qfa) this.e.get(str);
        return qfaVar == null ? (qfa) this.f.get(str) : qfaVar;
    }

    public final void c(qcg qcgVar) {
        synchronized (this.j) {
            this.i.add(qcgVar);
        }
    }

    public final void d(qcg qcgVar) {
        synchronized (this.j) {
            this.i.remove(qcgVar);
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.j) {
            z = b(str) != null;
        }
        return z;
    }

    public final boolean g(qda qdaVar, qcd qcdVar) throws Throwable {
        Throwable th;
        final ArrayList arrayList = new ArrayList();
        qiw qiwVar = qdaVar.a;
        final String str = qiwVar.a;
        Callable callable = new Callable() { // from class: qcs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.a.d;
                qkn qknVarE = workDatabase.E();
                String str2 = str;
                arrayList.addAll(qknVarE.a(str2));
                return workDatabase.D().b(str2);
            }
        };
        WorkDatabase workDatabase = this.d;
        qjn qjnVar = (qjn) workDatabase.f(callable);
        if (qjnVar == null) {
            qas.c();
            String str2 = a;
            Objects.toString(qiwVar);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(qiwVar.toString()));
            h(qiwVar);
            return false;
        }
        synchronized (this.j) {
            try {
                try {
                    try {
                        if (f(str)) {
                            Set set = (Set) this.g.get(str);
                            if (((qda) set.iterator().next()).a.b == qiwVar.b) {
                                set.add(qdaVar);
                                qas.c().a(a, a.h(qiwVar, "Work ", " is already enqueued for processing"));
                            } else {
                                h(qiwVar);
                            }
                        } else {
                            if (qjnVar.v == qiwVar.b) {
                                Context context = this.c;
                                pzd pzdVar = this.k;
                                qmg qmgVar = this.l;
                                qep qepVar = new qep(context, pzdVar, qmgVar, this, workDatabase, qjnVar, arrayList);
                                if (qcdVar != null) {
                                    qepVar.g = qcdVar;
                                }
                                final qfa qfaVar = new qfa(qepVar);
                                final ListenableFuture listenableFutureB = qak.b(qfaVar.i.b.plus(new fdlt(null)), new qew(qfaVar, null));
                                listenableFutureB.b(new Runnable() { // from class: qct
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zBooleanValue;
                                        ListenableFuture listenableFuture = listenableFutureB;
                                        qfa qfaVar2 = qfaVar;
                                        try {
                                            zBooleanValue = ((Boolean) listenableFuture.get()).booleanValue();
                                        } catch (InterruptedException | ExecutionException unused) {
                                            zBooleanValue = true;
                                        }
                                        qcu qcuVar = this.a;
                                        synchronized (qcuVar.j) {
                                            qiw qiwVarA = qfaVar2.a();
                                            String str3 = qiwVarA.a;
                                            if (qcuVar.b(str3) == qfaVar2) {
                                                qcuVar.a(str3);
                                            }
                                            qas.c().a(qcu.a, qcuVar.getClass().getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                                            Iterator it = qcuVar.i.iterator();
                                            while (it.hasNext()) {
                                                ((qcg) it.next()).a(qiwVarA, zBooleanValue);
                                            }
                                        }
                                    }
                                }, qmgVar.d);
                                this.f.put(str, qfaVar);
                                HashSet hashSet = new HashSet();
                                hashSet.add(qdaVar);
                                this.g.put(str, hashSet);
                                qas.c().a(a, getClass().getSimpleName() + ": processing " + qiwVar);
                                return true;
                            }
                            h(qiwVar);
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
