package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awlc {
    private final fcsu a;
    private final fdjx b;
    private final List c;
    private final ReentrantLock d;

    public awlc(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fdjxVar;
        this.c = fcva.aq(fcvo.a);
        this.d = new ReentrantLock();
    }

    public final eiju a(Function function) {
        return auvw.c(this.b, fcyi.a, fdjz.a, new awlb(this, function, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdat r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awkz
            if (r0 == 0) goto L13
            r0 = r6
            awkz r0 = (defpackage.awkz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            awkz r0 = new awkz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r6)
            goto L40
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            java.util.Collection r6 = r4.c()
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L40:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            r0.a = r2
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L40
            return r1
        L57:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awlc.b(fdat, fcxy):java.lang.Object");
    }

    public final Collection c() {
        Object objB = this.a.b();
        objB.getClass();
        Set set = (Set) objB;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            List list = this.c;
            reentrantLock.unlock();
            return fcwm.g(set, list);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Consumer consumer) {
        Iterator it = c().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public final void e(Object obj) {
        obj.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.c.add(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(Object obj) {
        obj.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.c.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }
}
