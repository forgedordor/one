package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzq extends ReentrantLock {
    final ekak a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final ejyf n;

    public ejzq(ekak ekakVar, int i, long j, ejyf ejyfVar) {
        this.a = ekakVar;
        this.g = j;
        ejyfVar.getClass();
        this.n = ejyfVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!ekakVar.g()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = ekakVar.n() ? new ReferenceQueue() : null;
        this.i = ekakVar.o() ? new ReferenceQueue() : null;
        this.j = ekakVar.m() ? new ConcurrentLinkedQueue() : ekak.c;
        this.l = ekakVar.j() ? new ekai() : ekak.c;
        this.m = ekakVar.m() ? new ejyx() : ekak.c;
    }

    final ekal a(ekal ekalVar, ekal ekalVar2) {
        Object objJ = ekalVar.j();
        if (objJ == null) {
            return null;
        }
        ejzz ejzzVarD = ekalVar.d();
        Object obj = ejzzVarD.get();
        if (obj == null && ejzzVarD.f()) {
            return null;
        }
        ekal ekalVarA = this.a.q.a(this, ekalVar, ekalVar2, objJ);
        ekalVarA.p(ejzzVarD.b(this.i, obj, ekalVarA));
        return ekalVarA;
    }

    final ekal b(Object obj, int i) {
        for (ekal ekalVarE = (ekal) this.f.get((r0.length() - 1) & i); ekalVarE != null; ekalVarE = ekalVarE.e()) {
            if (ekalVarE.a() == i) {
                Object objJ = ekalVarE.j();
                if (objJ == null) {
                    u();
                } else if (this.a.h.c(obj, objJ)) {
                    return ekalVarE;
                }
            }
        }
        return null;
    }

    final ekal c(Object obj, int i, long j) {
        ekal ekalVarB = b(obj, i);
        if (ekalVarB == null) {
            return null;
        }
        if (!this.a.k(ekalVarB, j)) {
            return ekalVarB;
        }
        v(j);
        return null;
    }

    final ekal d(Object obj, int i, ekal ekalVar) {
        return this.a.q.b(this, obj, i, ekalVar);
    }

    final ekal e(ekal ekalVar, ekal ekalVar2) {
        int i = this.b;
        ekal ekalVarE = ekalVar2.e();
        while (ekalVar != ekalVar2) {
            ekal ekalVarA = a(ekalVar, ekalVarE);
            if (ekalVarA != null) {
                ekalVarE = ekalVarA;
            } else {
                r(ekalVar);
                i--;
            }
            ekalVar = ekalVar.e();
        }
        this.b = i;
        return ekalVarE;
    }

    final Object f(Object obj, int i) {
        try {
            Object obj2 = null;
            if (this.b != 0) {
                ekak ekakVar = this.a;
                long jA = ekakVar.p.a();
                ekal ekalVarC = c(obj, i, jA);
                if (ekalVarC != null) {
                    Object obj3 = ekalVarC.d().get();
                    if (obj3 != null) {
                        q(ekalVarC, jA);
                        ekalVarC.j();
                        ejyn ejynVar = ekakVar.r;
                        obj2 = obj3;
                    } else {
                        u();
                    }
                }
            }
            return obj2;
        } finally {
            o();
        }
    }

    final Object g(ekal ekalVar, long j) {
        if (ekalVar.j() == null) {
            u();
            return null;
        }
        Object obj = ekalVar.d().get();
        if (obj == null) {
            u();
            return null;
        }
        if (!this.a.k(ekalVar, j)) {
            return obj;
        }
        v(j);
        return null;
    }

    final Object h(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        int i2;
        lock();
        try {
            ekak ekakVar = this.a;
            long jA = ekakVar.p.a();
            s(jA);
            if (this.b + 1 > this.e) {
                m();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            ekal ekalVar = (ekal) atomicReferenceArray.get(length);
            ekal ekalVarE = ekalVar;
            while (true) {
                obj3 = null;
                if (ekalVarE == null) {
                    this.d++;
                    ekal ekalVarD = d(obj, i, ekalVar);
                    z(ekalVarD, obj2, jA);
                    atomicReferenceArray.set(length, ekalVarD);
                    this.b++;
                    l(ekalVarD);
                    break;
                }
                Object objJ = ekalVarE.j();
                if (ekalVarE.a() == i && objJ != null && ekakVar.h.c(obj, objJ)) {
                    ejzz ejzzVarD = ekalVarE.d();
                    Object obj4 = ejzzVarD.get();
                    if (obj4 == null) {
                        this.d++;
                        if (ejzzVarD.f()) {
                            x(obj, null, ejzzVarD.a(), 3);
                            z(ekalVarE, obj2, jA);
                            i2 = this.b;
                        } else {
                            z(ekalVarE, obj2, jA);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        l(ekalVarE);
                    } else {
                        if (z) {
                            p(ekalVarE, jA);
                        } else {
                            this.d++;
                            x(obj, obj4, ejzzVarD.a(), 2);
                            z(ekalVarE, obj2, jA);
                            l(ekalVarE);
                        }
                        obj3 = obj4;
                    }
                } else {
                    ekalVarE = ekalVarE.e();
                }
            }
            return obj3;
        } finally {
            unlock();
            t();
        }
    }

    final Object i(ekal ekalVar, Object obj, ejzz ejzzVar) {
        if (!ejzzVar.g()) {
            throw new AssertionError();
        }
        ejwl.p(!Thread.holdsLock(ekalVar), "Recursive load of: %s", obj);
        Object objD = ejzzVar.d();
        if (objD == null) {
            throw new ejym(a.b(obj, "CacheLoader returned null for key ", "."));
        }
        q(ekalVar, this.a.p.a());
        return objD;
    }

    final void j() {
        while (true) {
            ekal ekalVar = (ekal) this.j.poll();
            if (ekalVar == null) {
                return;
            }
            Queue queue = this.m;
            if (queue.contains(ekalVar)) {
                queue.add(ekalVar);
            }
        }
    }

    final void k() {
        ekak ekakVar = this.a;
        int i = 0;
        if (ekakVar.n()) {
            int i2 = 0;
            do {
                Object objPoll = this.h.poll();
                if (objPoll == null) {
                    break;
                }
                ekal ekalVar = (ekal) objPoll;
                int iA = ekalVar.a();
                ejzq ejzqVarB = ekakVar.b(iA);
                ejzqVarB.lock();
                try {
                    int i3 = ejzqVarB.b;
                    AtomicReferenceArray atomicReferenceArray = ejzqVarB.f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    ekal ekalVar2 = (ekal) atomicReferenceArray.get(length);
                    ekal ekalVarE = ekalVar2;
                    while (true) {
                        if (ekalVarE == null) {
                            break;
                        }
                        if (ekalVarE == ekalVar) {
                            ejzqVarB.d++;
                            ekal ekalVarY = ejzqVarB.y(ekalVar2, ekalVarE, ekalVarE.j(), ekalVarE.d().get(), ekalVarE.d(), 3);
                            int i4 = ejzqVarB.b - 1;
                            atomicReferenceArray.set(length, ekalVarY);
                            ejzqVarB.b = i4;
                            break;
                        }
                        ekalVarE = ekalVarE.e();
                    }
                    ejzqVarB.unlock();
                    ejzqVarB.t();
                    i2++;
                } catch (Throwable th) {
                    ejzqVarB.unlock();
                    ejzqVarB.t();
                    throw th;
                }
            } while (i2 != 16);
        }
        ekak ekakVar2 = this.a;
        if (ekakVar2.o()) {
            do {
                Object objPoll2 = this.i.poll();
                if (objPoll2 == null) {
                    return;
                }
                ejzz ejzzVar = (ejzz) objPoll2;
                ekal ekalVarC = ejzzVar.c();
                int iA2 = ekalVarC.a();
                ejzq ejzqVarB2 = ekakVar2.b(iA2);
                Object objJ = ekalVarC.j();
                ejzqVarB2.lock();
                try {
                    int i5 = ejzqVarB2.b;
                    AtomicReferenceArray atomicReferenceArray2 = ejzqVarB2.f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    ekal ekalVarE2 = (ekal) atomicReferenceArray2.get(length2);
                    int i6 = iA2;
                    while (true) {
                        if (ekalVarE2 != null) {
                            int i7 = i6;
                            Object objJ2 = ekalVarE2.j();
                            if (ekalVarE2.a() != i7 || objJ2 == null || !ejzqVarB2.a.h.c(objJ, objJ2)) {
                                ekalVarE2 = ekalVarE2.e();
                                i6 = i7;
                            } else if (ekalVarE2.d() == ejzzVar) {
                                ejzqVarB2.d++;
                                ekal ekalVarY2 = ejzqVarB2.y(ekalVarE2, ekalVarE2, objJ2, ejzzVar.get(), ejzzVar, 3);
                                int i8 = ejzqVarB2.b - 1;
                                atomicReferenceArray2.set(length2, ekalVarY2);
                                ejzqVarB2.b = i8;
                                ejzqVarB2.unlock();
                                if (!ejzqVarB2.isHeldByCurrentThread()) {
                                }
                            } else {
                                ejzqVarB2.unlock();
                                if (!ejzqVarB2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            ejzqVarB2.unlock();
                            if (!ejzqVarB2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    ejzqVarB2.t();
                    i++;
                } catch (Throwable th2) {
                    ejzqVarB2.unlock();
                    if (!ejzqVarB2.isHeldByCurrentThread()) {
                        ejzqVarB2.t();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    final void l(ekal ekalVar) {
        if (this.a.h()) {
            j();
            long jA = ekalVar.d().a();
            long j = this.g;
            if (jA > j && !w(ekalVar, ekalVar.a(), 5)) {
                throw new AssertionError();
            }
            while (this.c > j) {
                for (ekal ekalVar2 : this.m) {
                    if (ekalVar2.d().a() > 0) {
                        if (!w(ekalVar2, ekalVar2.a(), 5)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void m() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            ekal ekalVarE = (ekal) atomicReferenceArray.get(i2);
            if (ekalVarE != null) {
                ekal ekalVarE2 = ekalVarE.e();
                int iA = ekalVarE.a() & length2;
                if (ekalVarE2 == null) {
                    atomicReferenceArray2.set(iA, ekalVarE);
                } else {
                    ekal ekalVar = ekalVarE;
                    while (ekalVarE2 != null) {
                        int iA2 = ekalVarE2.a() & length2;
                        int i3 = iA2 != iA ? iA2 : iA;
                        if (iA2 != iA) {
                            ekalVar = ekalVarE2;
                        }
                        ekalVarE2 = ekalVarE2.e();
                        iA = i3;
                    }
                    atomicReferenceArray2.set(iA, ekalVar);
                    while (ekalVarE != ekalVar) {
                        int iA3 = ekalVarE.a() & length2;
                        ekal ekalVarA = a(ekalVarE, (ekal) atomicReferenceArray2.get(iA3));
                        if (ekalVarA != null) {
                            atomicReferenceArray2.set(iA3, ekalVarA);
                        } else {
                            r(ekalVarE);
                            i--;
                        }
                        ekalVarE = ekalVarE.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    final void n(long j) {
        ekal ekalVar;
        ekal ekalVar2;
        j();
        do {
            ekalVar = (ekal) this.l.peek();
            if (ekalVar == null || !this.a.k(ekalVar, j)) {
                do {
                    ekalVar2 = (ekal) this.m.peek();
                    if (ekalVar2 == null || !this.a.k(ekalVar2, j)) {
                        return;
                    }
                } while (w(ekalVar2, ekalVar2.a(), 4));
                throw new AssertionError();
            }
        } while (w(ekalVar, ekalVar.a(), 4));
        throw new AssertionError();
    }

    final void o() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            s(this.a.p.a());
            t();
        }
    }

    final void p(ekal ekalVar, long j) {
        if (this.a.i()) {
            ekalVar.k(j);
        }
        this.m.add(ekalVar);
    }

    final void q(ekal ekalVar, long j) {
        if (this.a.i()) {
            ekalVar.k(j);
        }
        this.j.add(ekalVar);
    }

    final void r(ekal ekalVar) {
        Object objJ = ekalVar.j();
        ekalVar.a();
        x(objJ, ekalVar.d().get(), ekalVar.d().a(), 3);
        this.l.remove(ekalVar);
        this.m.remove(ekalVar);
    }

    final void s(long j) {
        if (tryLock()) {
            try {
                k();
                n(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void t() {
        if (isHeldByCurrentThread()) {
            return;
        }
        ekak ekakVar = this.a;
        while (((ekam) ekakVar.o.poll()) != null) {
            try {
                ejyi ejyiVar = ekakVar.w;
            } catch (Throwable th) {
                ekak.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void u() {
        if (tryLock()) {
            try {
                k();
            } finally {
                unlock();
            }
        }
    }

    final void v(long j) {
        if (tryLock()) {
            try {
                n(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean w(ekal ekalVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        ekal ekalVar2 = (ekal) atomicReferenceArray.get(length);
        for (ekal ekalVarE = ekalVar2; ekalVarE != null; ekalVarE = ekalVarE.e()) {
            if (ekalVarE == ekalVar) {
                this.d++;
                ekal ekalVarY = y(ekalVar2, ekalVarE, ekalVarE.j(), ekalVarE.d().get(), ekalVarE.d(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, ekalVarY);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    final void x(Object obj, Object obj2, int i, int i2) {
        this.c -= i;
        Queue queue = this.a.o;
        if (queue != ekak.c) {
            queue.offer(new ekam(obj, obj2));
        }
    }

    final ekal y(ekal ekalVar, ekal ekalVar2, Object obj, Object obj2, ejzz ejzzVar, int i) {
        x(obj, obj2, ejzzVar.a(), i);
        this.l.remove(ekalVar2);
        this.m.remove(ekalVar2);
        if (!ejzzVar.g()) {
            return e(ekalVar, ekalVar2);
        }
        ejzzVar.e(null);
        return ekalVar;
    }

    final void z(ekal ekalVar, Object obj, long j) {
        ejzz ejzwVar;
        ekak ekakVar = this.a;
        ejzz ejzzVarD = ekalVar.d();
        ejyj ejyjVar = ekakVar.v;
        ejwl.m(true, "Weights must be non-negative");
        int iOrdinal = ekakVar.k.ordinal();
        if (iOrdinal == 0) {
            ejzwVar = new ejzw(obj);
        } else if (iOrdinal == 1) {
            ejzwVar = new ejzr(this.i, obj, ekalVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            ejzwVar = new ekae(this.i, obj, ekalVar);
        }
        ekalVar.p(ejzwVar);
        j();
        this.c++;
        if (ekakVar.i()) {
            ekalVar.k(j);
        }
        if (ekakVar.l()) {
            ekalVar.q(j);
        }
        this.m.add(ekalVar);
        this.l.add(ekalVar);
        ejzzVarD.e(obj);
    }
}
