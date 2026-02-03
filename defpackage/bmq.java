package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bmq implements blm {
    private final AtomicReference c;
    public final Object a = new Object();
    private int d = 0;
    private boolean e = false;
    public final Map b = new HashMap();
    private final CopyOnWriteArraySet f = new CopyOnWriteArraySet();

    public bmq(Object obj) {
        this.c = new AtomicReference(obj);
    }

    public final void a(bll bllVar) {
        bmp bmpVar = (bmp) this.b.remove(bllVar);
        if (bmpVar != null) {
            bmpVar.a.set(false);
            this.f.remove(bmpVar);
        }
    }

    @Override // defpackage.blm
    public final ListenableFuture b() {
        Object obj = this.c.get();
        return obj instanceof bmo ? new bql(((bmo) obj).a()) : bqk.b(obj);
    }

    @Override // defpackage.blm
    public final void c(Executor executor, bll bllVar) {
        bmp bmpVar;
        synchronized (this.a) {
            a(bllVar);
            bmpVar = new bmp(this.c, executor, bllVar);
            this.b.put(bllVar, bmpVar);
            this.f.add(bmpVar);
        }
        bmpVar.a(0);
    }

    @Override // defpackage.blm
    public final void d(bll bllVar) {
        synchronized (this.a) {
            a(bllVar);
        }
    }

    public final void e(Object obj) {
        Iterator it;
        int i;
        synchronized (this.a) {
            if (Objects.equals(this.c.getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (this.e) {
                return;
            }
            this.e = true;
            Iterator it2 = this.f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ((bmp) it2.next()).a(i2);
                } else {
                    synchronized (this.a) {
                        if (this.d == i2) {
                            this.e = false;
                            return;
                        } else {
                            it = this.f.iterator();
                            i = this.d;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }
}
