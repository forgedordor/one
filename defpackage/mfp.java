package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfp {
    private static mfp e;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public boolean d;
    private int f;

    private mfp(final Context context) {
        Executor executorA = mef.a();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.f = 0;
        executorA.execute(new Runnable() { // from class: mfj
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new mfo(this.a), intentFilter);
            }
        });
    }

    public static synchronized mfp b(Context context) {
        if (e == null) {
            e = new mfp(context);
        }
        return e;
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.f;
        }
        return i;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            mfm mfmVar = (mfm) it.next();
            if (mfmVar.a.get() == null) {
                copyOnWriteArrayList.remove(mfmVar);
            }
        }
    }

    public final void d(int i) {
        c();
        synchronized (this.c) {
            if (this.d && this.f == i) {
                return;
            }
            this.d = true;
            this.f = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((mfm) it.next()).a();
            }
        }
    }
}
