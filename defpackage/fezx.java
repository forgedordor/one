package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezx {
    public final ffaa a;
    public final String b;
    public boolean c;
    public fezu d;
    public final List e = new ArrayList();
    public boolean f;

    public fezx(ffaa ffaaVar, String str) {
        this.a = ffaaVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = fezr.a;
        ffaa ffaaVar = this.a;
        synchronized (ffaaVar) {
            if (c()) {
                ffaaVar.c(this);
            }
        }
    }

    public final void b() {
        byte[] bArr = fezr.a;
        ffaa ffaaVar = this.a;
        synchronized (ffaaVar) {
            this.c = true;
            if (c()) {
                ffaaVar.c(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        List list = this.e;
        int size = list.size() - 1;
        boolean z = false;
        while (size >= 0) {
            fezu fezuVar = (fezu) list.get(size);
            if (ffaa.b.isLoggable(Level.FINE)) {
                fezv.b(fezuVar, this, "canceled");
            }
            list.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(fezu fezuVar, long j, boolean z) {
        fezx fezxVar = fezuVar.b;
        if (fezxVar != this) {
            if (fezxVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            fezuVar.b = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        List list = this.e;
        int iIndexOf = list.indexOf(fezuVar);
        if (iIndexOf != -1) {
            if (fezuVar.c <= j2) {
                if (ffaa.b.isLoggable(Level.FINE)) {
                    fezv.b(fezuVar, this, "already scheduled");
                }
                return false;
            }
            list.remove(iIndexOf);
        }
        fezuVar.c = j2;
        if (ffaa.b.isLoggable(Level.FINE)) {
            long j3 = j2 - jNanoTime;
            fezv.b(fezuVar, this, z ? "run again after ".concat(fezv.a(j3)) : "scheduled after ".concat(fezv.a(j3)));
        }
        Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((fezu) it.next()).c - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, fezuVar);
        return size == 0;
    }

    public final void f(fezu fezuVar) {
        fezuVar.getClass();
        ffaa ffaaVar = this.a;
        synchronized (ffaaVar) {
            if (this.c) {
                if (ffaa.b.isLoggable(Level.FINE)) {
                    fezv.b(fezuVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d(fezuVar, 0L, false)) {
                    ffaaVar.c(this);
                }
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
