package defpackage;

import android.util.LruCache;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgx implements cqci {
    public final LruCache a;
    private final awgu b;

    public awgx(awgu awguVar) {
        this.b = awguVar;
        this.a = new LruCache(awguVar.a);
    }

    public final Object a(Object obj) {
        obj.getClass();
        return this.a.get(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5, defpackage.fdat r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.awgv
            if (r0 == 0) goto L13
            r0 = r7
            awgv r0 = (defpackage.awgv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awgv r0 = new awgv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            awgx r5 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r4.a(r5)
            if (r7 != 0) goto L5e
            r0.a = r5
            r0.e = r4
            r0.d = r3
            java.lang.Object r7 = r6.a(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
            r5 = r4
        L4b:
            android.util.LruCache r5 = r5.a
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r6)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L59
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            return r7
        L59:
            monitor-exit(r5)
            return r0
        L5b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awgx.b(java.lang.Object, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r10, defpackage.fdat r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.awgw
            if (r0 == 0) goto L13
            r0 = r12
            awgw r0 = (defpackage.awgw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            awgw r0 = new awgw
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r10 = r0.b
            java.lang.Object r11 = r0.a
            defpackage.fctl.b(r12)
            r8 = r12
            r12 = r10
            r10 = r11
            r11 = r8
            goto L84
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.fctl.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r10.iterator()
        L44:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r2.next()
            java.lang.Object r6 = r9.a(r5)
            if (r6 == 0) goto L5a
            fcti r7 = new fcti
            r7.<init>(r5, r6)
            goto L5b
        L5a:
            r7 = r3
        L5b:
            if (r7 == 0) goto L44
            r12.add(r7)
            goto L44
        L61:
            java.util.Map r12 = defpackage.fcwa.k(r12)
            int r2 = r12.size()
            int r5 = r10.size()
            if (r2 != r5) goto L70
            return r12
        L70:
            java.util.Set r2 = r12.keySet()
            java.util.Set r2 = defpackage.fcva.at(r10, r2)
            r0.a = r10
            r0.b = r12
            r0.e = r4
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 == r1) goto Ld6
        L84:
            android.util.LruCache r0 = r9.a
            java.util.Map r11 = (java.util.Map) r11
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Ld3
            r2 = 10
            int r2 = defpackage.fcva.p(r10, r2)     // Catch: java.lang.Throwable -> Ld3
            int r2 = defpackage.fcwa.a(r2)     // Catch: java.lang.Throwable -> Ld3
            r4 = 16
            int r2 = defpackage.fddu.f(r2, r4)     // Catch: java.lang.Throwable -> Ld3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Ld3
        La2:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r4 = r9.a(r2)     // Catch: java.lang.Throwable -> Ld3
            if (r4 != 0) goto Lc3
            java.lang.Object r4 = r11.get(r2)     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Lbc
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> Ld3
            goto Lbd
        Lbc:
            r4 = r3
        Lbd:
            if (r4 != 0) goto Lc3
            java.lang.Object r4 = r12.get(r2)     // Catch: java.lang.Throwable -> Ld3
        Lc3:
            if (r4 == 0) goto Lc9
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Ld3
            goto La2
        Lc9:
            java.lang.String r10 = "delegate function did not return values for all keys."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld3
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Ld3
            throw r11     // Catch: java.lang.Throwable -> Ld3
        Ld1:
            monitor-exit(r0)
            return r1
        Ld3:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awgx.c(java.util.Set, fdat, fcxy):java.lang.Object");
    }

    public final Object d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        obj.getClass();
        return this.a.remove(obj);
    }

    public final void f() {
        this.a.evictAll();
    }

    public final void g(Map map) {
        map.getClass();
        synchronized (this.a) {
            fcxe fcxeVar = new fcxe();
            for (Map.Entry entry : map.entrySet()) {
                Object objD = d(entry.getKey(), entry.getValue());
                if (objD != null) {
                    fcxeVar.put(entry.getKey(), objD);
                }
            }
            fcwa.b(fcxeVar);
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        if (i >= this.b.b) {
            f();
        }
    }
}
