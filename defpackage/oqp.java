package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqp {
    public boolean a;
    private final fdap b;
    private final fdae c;
    private final ReentrantLock d = new ReentrantLock();
    private final List e = new ArrayList();

    public oqp(fdap fdapVar, fdae fdaeVar) {
        this.b = fdapVar;
        this.c = fdaeVar;
    }

    public final void a(Object obj) {
        fdae fdaeVar = this.c;
        boolean z = true;
        if (fdaeVar != null && ((Boolean) fdaeVar.invoke()).booleanValue()) {
            c();
        }
        if (this.a) {
            this.b.invoke(obj);
            return;
        }
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (!this.a) {
                this.e.add(obj);
                z = false;
            }
            if (z) {
                this.b.invoke(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Object obj) {
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            this.e.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        if (this.a) {
            return false;
        }
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            if (this.a) {
                return false;
            }
            this.a = true;
            List list = this.e;
            List listAo = fcva.ao(list);
            list.clear();
            reentrantLock.unlock();
            fdap fdapVar = this.b;
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                fdapVar.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
