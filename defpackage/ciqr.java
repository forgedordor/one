package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ciqt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqr(ciqt ciqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ciqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r9 != r0) goto L23;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$sync$1$1"
            java.lang.String r4 = "BugleGroupManagement"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "RepairForkedMmsGroupSynclet.kt"
            if (r1 == 0) goto L24
            if (r1 == r6) goto L1e
            if (r1 == r5) goto L1a
            java.lang.Object r0 = r8.a
            defpackage.fctl.b(r9)
            return r0
        L1a:
            defpackage.fctl.b(r9)     // Catch: java.util.concurrent.CancellationException -> L22
            goto L5f
        L1e:
            defpackage.fctl.b(r9)     // Catch: java.util.concurrent.CancellationException -> L22
            goto L32
        L22:
            r9 = move-exception
            goto L62
        L24:
            defpackage.fctl.b(r9)
            ciqt r9 = r8.c     // Catch: java.util.concurrent.CancellationException -> L22
            r8.b = r6     // Catch: java.util.concurrent.CancellationException -> L22
            java.lang.Object r9 = r9.g(r8)     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 != r0) goto L32
            goto La1
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L22
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 != 0) goto L54
            ekrg r9 = defpackage.ciqt.a     // Catch: java.util.concurrent.CancellationException -> L22
            ekrw r9 = r9.e()     // Catch: java.util.concurrent.CancellationException -> L22
            ekrz r1 = defpackage.eksq.a     // Catch: java.util.concurrent.CancellationException -> L22
            r9.X(r1, r4)     // Catch: java.util.concurrent.CancellationException -> L22
            r1 = 151(0x97, float:2.12E-43)
            ekrw r9 = r9.h(r3, r2, r1, r7)     // Catch: java.util.concurrent.CancellationException -> L22
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.util.concurrent.CancellationException -> L22
            java.lang.String r1 = "Skip as RepairForkedMmsGroupSynclet interval has not passed."
            r9.q(r1)     // Catch: java.util.concurrent.CancellationException -> L22
            r9 = 0
            return r9
        L54:
            ciqt r9 = r8.c     // Catch: java.util.concurrent.CancellationException -> L22
            r8.b = r5     // Catch: java.util.concurrent.CancellationException -> L22
            r1 = 0
            java.lang.Object r9 = r9.b(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 == r0) goto La1
        L5f:
            cipw r9 = (defpackage.cipw) r9     // Catch: java.util.concurrent.CancellationException -> L22
            goto L82
        L62:
            ekrg r1 = defpackage.ciqt.a
            ekrw r1 = r1.j()
            ekrz r5 = defpackage.eksq.a
            r1.X(r5, r4)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r9 = r1.g(r9)
            r1 = 156(0x9c, float:2.19E-43)
            ekrw r9 = r9.h(r3, r2, r1, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r1 = "RepairForkedMmsGroupSynclet has been cancelled."
            r9.q(r1)
            cipr r9 = defpackage.cipr.a
        L82:
            ciqt r1 = r8.c
            boolean r2 = r9 instanceof defpackage.cipr
            if (r2 != 0) goto La2
            r8.a = r9
            r2 = 3
            r8.b = r2
            ecjh r2 = r1.n
            cipm r3 = new cipm
            r3.<init>()
            java.lang.Object r1 = defpackage.crrj.b(r2, r3, r8)
            fcyl r2 = defpackage.fcyl.a
            if (r1 == r2) goto L9e
            fctx r1 = defpackage.fctx.a
        L9e:
            if (r1 == r0) goto La1
            goto La2
        La1:
            return r0
        La2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqr(this.c, fcxyVar);
    }
}
