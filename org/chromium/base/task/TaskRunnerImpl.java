package org.chromium.base.task;

import android.util.Pair;
import defpackage.ffyz;
import defpackage.ffzb;
import internal.J.N;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.TaskRunnerImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class TaskRunnerImpl implements ffyz {
    public static final ReferenceQueue a = new ReferenceQueue();
    private static final Object g = new Object();
    private static final Runnable[] h = new Runnable[50];
    private static int i = 50;
    private static final Map j = new HashMap();
    private static final Set k = new HashSet();
    public final String b;
    public volatile long c;
    protected final Runnable d;
    public final Object e;
    public Queue f;
    private final int l;
    private final int m;
    private boolean n;
    private List o;

    protected TaskRunnerImpl(int i2, String str, int i3) {
        this.d = new Runnable() { // from class: ffza
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunnerImpl taskRunnerImpl = this.a;
                TraceEvent traceEventA = TraceEvent.a(taskRunnerImpl.b);
                try {
                    synchronized (taskRunnerImpl.e) {
                        Queue queue = taskRunnerImpl.f;
                        if (queue != null) {
                            ((Runnable) queue.poll()).run();
                        }
                    }
                    if (traceEventA != null) {
                        traceEventA.close();
                    }
                } catch (Throwable th) {
                    if (traceEventA != null) {
                        try {
                            traceEventA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
        this.e = new Object();
        this.l = i2;
        this.b = str.concat(".PreNativeTask.run");
        this.m = i3;
    }

    private static void d() {
        while (true) {
            ffzb ffzbVar = (ffzb) a.poll();
            if (ffzbVar == null) {
                return;
            }
            N.MERCiIV8(ffzbVar.a);
            Set set = k;
            synchronized (set) {
                set.remove(ffzbVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        r1 = org.chromium.base.task.TaskRunnerImpl.i;
        org.chromium.base.task.TaskRunnerImpl.i = r1 + 1;
        org.chromium.base.task.TaskRunnerImpl.j.put(java.lang.Integer.valueOf(r1), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(long r6, java.lang.Runnable r8, long r9) {
        /*
            java.lang.Object r0 = org.chromium.base.task.TaskRunnerImpl.g
            monitor-enter(r0)
            r1 = 0
        L4:
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L20
            java.lang.Runnable[] r4 = org.chromium.base.task.TaskRunnerImpl.h     // Catch: java.lang.Throwable -> L1e
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1e
            r5 = 50
            if (r1 >= r5) goto L1c
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L19
            r4[r1] = r8     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            goto L31
        L19:
            int r1 = r1 + 1
            goto L4
        L1c:
            r9 = r2
            goto L20
        L1e:
            r6 = move-exception
            goto L35
        L20:
            int r1 = org.chromium.base.task.TaskRunnerImpl.i     // Catch: java.lang.Throwable -> L1e
            int r2 = r1 + 1
            org.chromium.base.task.TaskRunnerImpl.i = r2     // Catch: java.lang.Throwable -> L1e
            java.util.Map r2 = org.chromium.base.task.TaskRunnerImpl.j     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1e
            r2.put(r3, r8)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r2 = r9
        L31:
            internal.J.N.MGnQU$47(r6, r2, r1)
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.task.TaskRunnerImpl.e(long, java.lang.Runnable, long):void");
    }

    static void runTask(int i2) {
        Runnable runnable;
        synchronized (g) {
            Runnable[] runnableArr = h;
            int length = runnableArr.length;
            if (i2 < 50) {
                runnable = runnableArr[i2];
                runnableArr[i2] = null;
            } else {
                runnable = (Runnable) j.remove(Integer.valueOf(i2));
            }
        }
        runnable.run();
    }

    @Override // defpackage.ffyz
    public final void a(Runnable runnable) {
        Object obj = PostTask.a;
        if (this.c != 0) {
            e(this.c, runnable, 0L);
            return;
        }
        synchronized (this.e) {
            if (!this.n) {
                this.n = true;
                synchronized (PostTask.a) {
                    List list = PostTask.b;
                    if (list == null) {
                        b();
                    } else {
                        list.add(this);
                        this.f = new ArrayDeque();
                        this.o = new ArrayList();
                    }
                }
            }
            if (this.c != 0) {
                e(this.c, runnable, 0L);
            } else {
                this.f.add(runnable);
                c();
            }
        }
    }

    final void b() {
        long jM5_IQXaH = N.M5_IQXaH(this.m, this.l);
        synchronized (this.e) {
            Queue queue = this.f;
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    e(jM5_IQXaH, (Runnable) it.next(), 0L);
                }
                this.f = null;
            }
            List<Pair> list = this.o;
            if (list != null) {
                for (Pair pair : list) {
                    e(jM5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue());
                }
                this.o = null;
            }
            this.c = jM5_IQXaH;
        }
        Set set = k;
        synchronized (set) {
            set.add(new ffzb(this));
        }
        d();
    }

    protected void c() {
        Executor executor = PostTask.d;
        PostTask.c.execute(this.d);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable);
    }

    public TaskRunnerImpl(int i2) {
        this(i2, "TaskRunnerImpl", 0);
        d();
    }
}
