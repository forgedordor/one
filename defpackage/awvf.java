package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awvf extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ awvh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awvf(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awvf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073 A[LOOP:0: B:13:0x006d->B:15:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[LOOP:1: B:17:0x008a->B:19:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[LOOP:2: B:21:0x00ba->B:23:0x00c0, LOOP_END] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r7.a
            defpackage.fctl.b(r8)
            goto L41
        Lf:
            defpackage.fctl.b(r8)
            goto L28
        L13:
            defpackage.fctl.b(r8)
            awvh r8 = r7.c
            fcsu r8 = r8.c
            java.lang.Object r8 = r8.b()
            awzf r8 = (defpackage.awzf) r8
            r7.b = r2
            java.lang.Object r8 = r8.e(r7)
            if (r8 == r0) goto Ld6
        L28:
            awvh r1 = r7.c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            fcsu r1 = r1.c
            java.lang.Object r1 = r1.b()
            awzf r1 = (defpackage.awzf) r1
            r7.a = r8
            r2 = 2
            r7.b = r2
            java.lang.Object r1 = r1.f(r7)
            if (r1 == r0) goto Ld6
            r0 = r8
            r8 = r1
        L41:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            ekrg r1 = defpackage.awvh.a
            ekrw r1 = r1.e()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleCME"
            r1.X(r2, r3)
            r2 = 85
            java.lang.String r3 = "CachedMyIdentityManager.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager$refreshAllCacheFromDelegate$2"
            java.lang.String r5 = "invokeSuspend"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.fcva.p(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            awxn r5 = (defpackage.awxn) r5
            axcm r5 = r5.b()
            r2.add(r5)
            goto L6d
        L81:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L8a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r5.next()
            awxn r6 = (defpackage.awxn) r6
            ekhx r6 = r6.j()
            r6.getClass()
            defpackage.fcva.y(r4, r6)
            goto L8a
        La1:
            java.lang.String r5 = "Active MyIdentities %s have subIds: %s"
            r1.D(r5, r2, r4)
            awvh r1 = r7.c
            awye r1 = r1.b
            r1.d(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r0, r3)
            r8.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lce
            java.lang.Object r2 = r0.next()
            awxn r2 = (defpackage.awxn) r2
            axcm r2 = r2.b()
            r8.add(r2)
            goto Lba
        Lce:
            r1.c(r8)
            java.util.List r8 = defpackage.awuq.a(r1)
            return r8
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awvf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awvf(this.c, fcxyVar);
    }
}
