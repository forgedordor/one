package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggm implements afyy {
    private final Context a;
    private final agax b;
    private final abvt c;

    public aggm(Context context, agax agaxVar, abvt abvtVar) {
        context.getClass();
        abvtVar.getClass();
        this.a = context;
        this.b = agaxVar;
        this.c = abvtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aggj r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aggk
            if (r0 == 0) goto L13
            r0 = r7
            aggk r0 = (defpackage.aggk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aggk r0 = new aggk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aggj r6 = r0.d
            defpackage.fctl.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            abvt r7 = r5.c
            j$.util.Optional r7 = r7.a()
            java.lang.Object r7 = r7.get()
            daot r7 = (defpackage.daot) r7
            android.content.Context r2 = r5.a
            android.net.Uri r4 = r6.a
            eiju r7 = r7.a(r2, r4)
            r7.getClass()
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L6c
        L55:
            com.google.android.apps.messaging.videotrimmer.FileInfoResult r7 = (com.google.android.apps.messaging.videotrimmer.FileInfoResult) r7
            if (r7 == 0) goto L5c
            java.lang.String r7 = r7.a
            goto L5d
        L5c:
            r7 = 0
        L5d:
            long r0 = r6.b
            int r2 = r6.c
            int r6 = r6.d
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.content.Intent r6 = defpackage.daoq.a(r7, r0, r2, r6)
            return r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggm.a(aggj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r9 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.afyy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aggj r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aggl
            if (r0 == 0) goto L13
            r0 = r9
            aggl r0 = (defpackage.aggl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aggl r0 = new aggl
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r9)
            goto L69
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            aeo r8 = r0.f
            java.lang.String r2 = r0.e
            agax r4 = r0.d
            defpackage.fctl.b(r9)
            goto L5b
        L3d:
            defpackage.fctl.b(r9)
            agax r9 = r7.b
            aeo r2 = new aeo
            r2.<init>()
            r0.d = r9
            java.lang.String r6 = "VideoTrimmer"
            r0.e = r6
            r0.f = r2
            r0.c = r4
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 == r1) goto L80
            r4 = r9
            r9 = r8
            r8 = r2
            r2 = r6
        L5b:
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r9 = defpackage.agax.c(r4, r2, r8, r9, r0)
            if (r9 == r1) goto L80
        L69:
            adh r9 = (defpackage.adh) r9
            int r8 = r9.a
            r0 = -1
            if (r8 != r0) goto L7f
            android.content.Intent r8 = r9.b
            if (r8 == 0) goto L78
            android.net.Uri r5 = r8.getData()
        L78:
            android.net.Uri r8 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r8 = defpackage.daos.a(r5, r8)
            return r8
        L7f:
            return r5
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggm.b(aggj, fcxy):java.lang.Object");
    }
}
