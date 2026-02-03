package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsl extends fcyz implements fdat {
    Object a;
    int b;
    int c;
    final /* synthetic */ fdau d;
    final /* synthetic */ Context e;
    final /* synthetic */ qrz f;
    final /* synthetic */ String g = "fonts/";
    final /* synthetic */ String h = "__LottieInternalDefaultCacheKey__";
    final /* synthetic */ hox i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsl(fdau fdauVar, Context context, qrz qrzVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fdauVar;
        this.e = context;
        this.f = qrzVar;
        this.i = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qsl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0090 -> B:45:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r1 = defpackage.fcyl.a
            int r0 = r13.c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            int r4 = r13.b
            java.lang.Object r0 = r13.a
            defpackage.fctl.b(r14)     // Catch: java.lang.Throwable -> L14
            r11 = r13
            goto L93
        L14:
            r0 = move-exception
            r14 = r0
            r11 = r13
            goto La8
        L19:
            int r0 = r13.b
            java.lang.Object r4 = r13.a
            defpackage.fctl.b(r14)
            goto L53
        L21:
            defpackage.fctl.b(r14)
            r14 = 0
            r0 = r14
            r4 = r2
        L27:
            hox r14 = r13.i
            qrs r14 = defpackage.qsm.a(r14)
            hsf r14 = r14.a
            java.lang.Object r14 = r14.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lad
            if (r0 == 0) goto L5b
            fdau r14 = r13.d
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            r4.getClass()
            r13.a = r4
            r13.b = r0
            r13.c = r3
            java.lang.Object r14 = r14.a(r5, r4, r13)
            if (r14 == r1) goto L5f
        L53:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lad
        L5b:
            r12 = r4
            r4 = r0
            r0 = r12
            goto L61
        L5f:
            r11 = r13
            goto L92
        L61:
            android.content.Context r5 = r13.e     // Catch: java.lang.Throwable -> La5
            qrz r6 = r13.f     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = defpackage.qsm.c(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r14 = r13.g     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = defpackage.qsm.c(r14)     // Catch: java.lang.Throwable -> La5
            java.lang.String r14 = ".ttf"
            boolean r9 = defpackage.fdgn.H(r14)     // Catch: java.lang.Throwable -> La5
            if (r9 != 0) goto L81
            java.lang.String r9 = "."
            boolean r9 = defpackage.fdgn.t(r14, r9)     // Catch: java.lang.Throwable -> L14
            if (r9 != 0) goto L81
            java.lang.String r14 = "..ttf"
        L81:
            r9 = r14
            java.lang.String r10 = r13.h     // Catch: java.lang.Throwable -> La5
            r13.a = r0     // Catch: java.lang.Throwable -> La5
            r13.b = r4     // Catch: java.lang.Throwable -> La5
            r14 = 2
            r13.c = r14     // Catch: java.lang.Throwable -> La5
            r11 = r13
            java.lang.Object r14 = defpackage.qsm.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La2
            if (r14 != r1) goto L93
        L92:
            return r1
        L93:
            qnm r14 = (defpackage.qnm) r14     // Catch: java.lang.Throwable -> La2
            hox r5 = r11.i     // Catch: java.lang.Throwable -> La2
            qrs r5 = defpackage.qsm.a(r5)     // Catch: java.lang.Throwable -> La2
            r5.d(r14)     // Catch: java.lang.Throwable -> La2
            r12 = r4
            r4 = r0
            r0 = r12
            goto L27
        La2:
            r0 = move-exception
        La3:
            r14 = r0
            goto La8
        La5:
            r0 = move-exception
            r11 = r13
            goto La3
        La8:
            int r0 = r4 + 1
            r4 = r14
            goto L27
        Lad:
            r11 = r13
            hox r14 = r11.i
            qrs r0 = defpackage.qsm.a(r14)
            boolean r0 = r0.f()
            if (r0 != 0) goto Lc5
            if (r4 == 0) goto Lc5
            qrs r14 = defpackage.qsm.a(r14)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r14.e(r4)
        Lc5:
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qsl(this.d, this.e, this.f, this.i, fcxyVar);
    }
}
