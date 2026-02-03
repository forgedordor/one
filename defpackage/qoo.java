package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qoo {
    public static Executor a = Executors.newCachedThreadPool();
    public volatile qol b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public qoo(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            qws.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qoh) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qoh) arrayList.get(i)).a(obj);
        }
    }

    public final void c(qol qolVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = qolVar;
        this.e.post(new Runnable() { // from class: qom
            @Override // java.lang.Runnable
            public final void run() {
                qoo qooVar = this.a;
                qol qolVar2 = qooVar.b;
                if (qolVar2 == null) {
                    return;
                }
                Object obj = qolVar2.a;
                if (obj != null) {
                    qooVar.b(obj);
                } else {
                    qooVar.a(qolVar2.b);
                }
            }
        });
    }

    public final synchronized void d(qoh qohVar) {
        Throwable th;
        qol qolVar = this.b;
        if (qolVar != null && (th = qolVar.b) != null) {
            qohVar.a(th);
        }
        this.d.add(qohVar);
    }

    public final synchronized void e(qoh qohVar) {
        Object obj;
        qol qolVar = this.b;
        if (qolVar != null && (obj = qolVar.a) != null) {
            qohVar.a(obj);
        }
        this.c.add(qohVar);
    }

    public final synchronized void f(qoh qohVar) {
        this.d.remove(qohVar);
    }

    public final synchronized void g(qoh qohVar) {
        this.c.remove(qohVar);
    }

    public qoo(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (!z) {
            a.execute(new qon(this, callable));
            return;
        }
        try {
            c((qol) callable.call());
        } catch (Throwable th) {
            c(new qol(th));
        }
    }
}
