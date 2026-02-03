package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekkn extends ReentrantLock {
    final eklm a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final AtomicInteger f = new AtomicInteger();

    public ekkn(eklm eklmVar, int i) {
        this.a = eklmVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    static boolean m(ekkj ekkjVar) {
        return ekkjVar.d() == null;
    }

    static final void n(ReferenceQueue referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    final ekkj a(ekkj ekkjVar, ekkj ekkjVar2) {
        return this.a.g.a(this, ekkjVar, ekkjVar2);
    }

    final ekkj b(Object obj, int i) {
        if (this.b == 0) {
            return null;
        }
        for (ekkj ekkjVarB = (ekkj) this.e.get((r0.length() - 1) & i); ekkjVarB != null; ekkjVarB = ekkjVarB.b()) {
            if (ekkjVarB.a() == i) {
                Object objC = ekkjVarB.c();
                if (objC == null) {
                    l();
                } else if (this.a.f.c(obj, objC)) {
                    return ekkjVarB;
                }
            }
        }
        return null;
    }

    final ekkj c(ekkj ekkjVar, ekkj ekkjVar2) {
        int i = this.b;
        ekkj ekkjVarB = ekkjVar2.b();
        while (ekkjVar != ekkjVar2) {
            ekkj ekkjVarA = a(ekkjVar, ekkjVarB);
            if (ekkjVarA != null) {
                ekkjVarB = ekkjVarA;
            } else {
                i--;
            }
            ekkjVar = ekkjVar.b();
        }
        this.b = i;
        return ekkjVarB;
    }

    final Object d(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        ekkj ekkjVarB = (ekkj) atomicReferenceArray.get(i4);
                        if (ekkjVarB != null) {
                            ekkj ekkjVarB2 = ekkjVarB.b();
                            int iA = ekkjVarB.a() & length2;
                            if (ekkjVarB2 == null) {
                                atomicReferenceArray2.set(iA, ekkjVarB);
                            } else {
                                ekkj ekkjVar = ekkjVarB;
                                while (ekkjVarB2 != null) {
                                    int iA2 = ekkjVarB2.a() & length2;
                                    int i5 = iA2 != iA ? iA2 : iA;
                                    if (iA2 != iA) {
                                        ekkjVar = ekkjVarB2;
                                    }
                                    ekkjVarB2 = ekkjVarB2.b();
                                    iA = i5;
                                }
                                atomicReferenceArray2.set(iA, ekkjVar);
                                while (ekkjVarB != ekkjVar) {
                                    int iA3 = ekkjVarB.a() & length2;
                                    ekkj ekkjVarA = a(ekkjVarB, (ekkj) atomicReferenceArray2.get(iA3));
                                    if (ekkjVarA != null) {
                                        atomicReferenceArray2.set(iA3, ekkjVarA);
                                    } else {
                                        i3--;
                                    }
                                    ekkjVarB = ekkjVarB.b();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            ekkj ekkjVar2 = (ekkj) atomicReferenceArray3.get(length3);
            ekkj ekkjVarB3 = ekkjVar2;
            while (true) {
                obj3 = null;
                if (ekkjVarB3 == null) {
                    this.c++;
                    ekkj ekkjVarB4 = this.a.g.b(this, obj, i, ekkjVar2);
                    k(ekkjVarB4, obj2);
                    atomicReferenceArray3.set(length3, ekkjVarB4);
                    this.b = i2;
                    break;
                }
                Object objC = ekkjVarB3.c();
                if (ekkjVarB3.a() == i && objC != null && this.a.f.c(obj, objC)) {
                    Object objD = ekkjVarB3.d();
                    if (objD == null) {
                        this.c++;
                        k(ekkjVarB3, obj2);
                        this.b = this.b;
                    } else {
                        if (!z) {
                            this.c++;
                            k(ekkjVarB3, obj2);
                        }
                        obj3 = objD;
                    }
                } else {
                    ekkjVarB3 = ekkjVarB3.b();
                }
            }
            return obj3;
        } finally {
            unlock();
        }
    }

    final void e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            eklm eklmVar = this.a;
            ekkj ekkjVar = (ekkj) objPoll;
            int iA = ekkjVar.a();
            ekkn ekknVarC = eklmVar.c(iA);
            ekknVarC.lock();
            try {
                int i2 = ekknVarC.b;
                AtomicReferenceArray atomicReferenceArray = ekknVarC.e;
                int length = iA & (atomicReferenceArray.length() - 1);
                ekkj ekkjVar2 = (ekkj) atomicReferenceArray.get(length);
                ekkj ekkjVarB = ekkjVar2;
                while (true) {
                    if (ekkjVarB == null) {
                        break;
                    }
                    if (ekkjVarB == ekkjVar) {
                        ekknVarC.c++;
                        ekkj ekkjVarC = ekknVarC.c(ekkjVar2, ekkjVarB);
                        int i3 = ekknVarC.b - 1;
                        atomicReferenceArray.set(length, ekkjVarC);
                        ekknVarC.b = i3;
                        break;
                    }
                    ekkjVarB = ekkjVarB.b();
                }
                ekknVarC.unlock();
                i++;
            } catch (Throwable th) {
                ekknVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            eklm eklmVar = this.a;
            eklj ekljVar = (eklj) objPoll;
            ekkj ekkjVarA = ekljVar.a();
            int iA = ekkjVarA.a();
            ekkn ekknVarC = eklmVar.c(iA);
            Object objC = ekkjVarA.c();
            ekknVarC.lock();
            try {
                int i2 = ekknVarC.b;
                AtomicReferenceArray atomicReferenceArray = ekknVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                ekkj ekkjVar = (ekkj) atomicReferenceArray.get(length);
                ekkj ekkjVarB = ekkjVar;
                while (true) {
                    if (ekkjVarB == null) {
                        break;
                    }
                    Object objC2 = ekkjVarB.c();
                    if (ekkjVarB.a() != iA || objC2 == null || !ekknVarC.a.f.c(objC, objC2)) {
                        ekkjVarB = ekkjVarB.b();
                    } else if (((ekli) ekkjVarB).e() == ekljVar) {
                        ekknVarC.c++;
                        ekkj ekkjVarC = ekknVarC.c(ekkjVar, ekkjVarB);
                        int i3 = ekknVarC.b - 1;
                        atomicReferenceArray.set(length, ekkjVarC);
                        ekknVarC.b = i3;
                    }
                }
                ekknVarC.unlock();
                i++;
            } catch (Throwable th) {
                ekknVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void i() {
        if ((this.f.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    final void j() {
        if (tryLock()) {
            try {
                h();
                this.f.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void k(ekkj ekkjVar, Object obj) {
        this.a.g.f(this, ekkjVar, obj);
    }

    final void l() {
        if (tryLock()) {
            try {
                h();
            } finally {
                unlock();
            }
        }
    }

    public void g() {
    }

    public void h() {
    }
}
