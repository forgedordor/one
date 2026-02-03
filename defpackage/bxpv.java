package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxpv extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ feav f;
    final /* synthetic */ bxqa g;
    final /* synthetic */ MessageId h;
    final /* synthetic */ coik i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxpv(feav feavVar, bxqa bxqaVar, MessageId messageId, coik coikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = feavVar;
        this.g = bxqaVar;
        this.h = messageId;
        this.i = coikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxpv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x0047, B:14:0x0058), top: B:21:0x0047 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.e
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L15
            java.lang.Object r0 = r5.d
            java.lang.Object r1 = r5.c
            java.lang.Object r2 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.fctl.b(r6)
            goto L47
        L15:
            defpackage.fctl.b(r6)
            goto L2a
        L19:
            defpackage.fctl.b(r6)
            j$.time.Duration r6 = defpackage.bxqa.a
            long r3 = r6.toMillis()
            r5.e = r2
            java.lang.Object r6 = defpackage.fdkj.c(r3, r5)
            if (r6 == r0) goto L6d
        L2a:
            feav r3 = r5.f
            r3.getClass()
            bxqa r2 = r5.g
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r5.h
            coik r6 = r5.i
            r5.a = r3
            r5.b = r2
            r5.c = r1
            r5.d = r6
            r4 = 2
            r5.e = r4
            java.lang.Object r4 = r3.b(r5)
            if (r4 == r0) goto L6d
            r0 = r6
        L47:
            j$.time.Duration r6 = defpackage.bxqa.a     // Catch: java.lang.Throwable -> L68
            r6 = r2
            bxqa r6 = (defpackage.bxqa) r6     // Catch: java.lang.Throwable -> L68
            j$.util.concurrent.ConcurrentHashMap r6 = r6.c     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r6.get(r1)     // Catch: java.lang.Throwable -> L68
            boolean r0 = defpackage.fdbq.f(r4, r0)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L62
            r6.remove(r1)     // Catch: java.lang.Throwable -> L68
            bxqa r2 = (defpackage.bxqa) r2     // Catch: java.lang.Throwable -> L68
            j$.util.concurrent.ConcurrentHashMap r6 = r2.d     // Catch: java.lang.Throwable -> L68
            r6.remove(r1)     // Catch: java.lang.Throwable -> L68
        L62:
            r3.d()
            fctx r6 = defpackage.fctx.a
            return r6
        L68:
            r6 = move-exception
            r3.d()
            throw r6
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxpv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxpv(this.f, this.g, this.h, this.i, fcxyVar);
    }
}
