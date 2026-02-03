package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbb {
    public final cuz b;
    public final kgm c;
    private final Object d = null;
    public final cub a = new cub(16);

    public kbb() {
        long[] jArr = cvp.a;
        this.b = new cuz((byte[]) null);
        this.c = new kgm();
    }

    public static /* synthetic */ void a(kbb kbbVar, kbh kbhVar, Object obj) {
        kaz kazVar = new kaz(kbhVar);
        synchronized (kbbVar.c) {
            if (obj == null) {
                cuz cuzVar = kbbVar.b;
                Object obj2 = kbbVar.d;
                cuzVar.e(kazVar, new kay(null));
            } else {
                kbbVar.a.d(kazVar, new kay(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kbh r6, defpackage.fdap r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.kba
            if (r0 == 0) goto L13
            r0 = r8
            kba r0 = (defpackage.kba) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kba r0 = new kba
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kaz r6 = r0.d
            defpackage.fctl.b(r8)
            goto L62
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r8)
            kaz r8 = new kaz
            r8.<init>(r6)
            kgm r6 = r5.c
            monitor-enter(r6)
            cub r2 = r5.a     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.c(r8)     // Catch: java.lang.Throwable -> L83
            kay r2 = (defpackage.kay) r2     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L4e
            cuz r2 = r5.b     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.f(r8)     // Catch: java.lang.Throwable -> L83
            kay r2 = (defpackage.kay) r2     // Catch: java.lang.Throwable -> L83
        L4e:
            if (r2 == 0) goto L54
            java.lang.Object r7 = r2.a     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)
            return r7
        L54:
            monitor-exit(r6)
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 == r1) goto L82
            r4 = r8
            r8 = r6
            r6 = r4
        L62:
            kgm r7 = r5.c
            monitor-enter(r7)
            if (r8 != 0) goto L73
            cuz r0 = r5.b     // Catch: java.lang.Throwable -> L7f
            kay r1 = new kay     // Catch: java.lang.Throwable -> L7f
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            r0.e(r6, r1)     // Catch: java.lang.Throwable -> L7f
            goto L7d
        L73:
            cub r0 = r5.a     // Catch: java.lang.Throwable -> L7f
            kay r1 = new kay     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L7f
            r0.d(r6, r1)     // Catch: java.lang.Throwable -> L7f
        L7d:
            monitor-exit(r7)
            return r8
        L7f:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L82:
            return r1
        L83:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbb.b(kbh, fdap, fcxy):java.lang.Object");
    }
}
