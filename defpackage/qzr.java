package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzr {
    public final Set a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final qyz d;
    public final qzi[] e;
    public qzb f;
    public final List g;
    public final qzg h;
    public final rad i;
    private final AtomicInteger j;
    private final List k;

    public qzr(qyz qyzVar, rad radVar) {
        qzg qzgVar = new qzg(new Handler(Looper.getMainLooper()));
        this.j = new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        this.g = new ArrayList();
        this.k = new ArrayList();
        this.d = qyzVar;
        this.i = radVar;
        this.e = new qzi[4];
        this.h = qzgVar;
    }

    public final void a(qzo qzoVar) {
        qzoVar.g = this;
        Set set = this.a;
        synchronized (set) {
            set.add(qzoVar);
        }
        qzoVar.f = Integer.valueOf(this.j.incrementAndGet());
        qzoVar.d("add-to-queue");
        b();
        this.b.add(qzoVar);
    }

    final void b() {
        List list = this.k;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((qzp) it.next()).a();
            }
        }
    }
}
