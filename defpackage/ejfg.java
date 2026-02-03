package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ejfj c;
    final /* synthetic */ Bitmap d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejfg(ejfj ejfjVar, Bitmap bitmap, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ejfjVar;
        this.d = bitmap;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejfg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L11
            java.lang.Object r0 = r8.e
            android.net.Uri r0 = (android.net.Uri) r0
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L78
            goto L7d
        L11:
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.e
            ejfj r2 = (defpackage.ejfj) r2
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L78
            goto L59
        L1b:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.e
            fdjx r9 = (defpackage.fdjx) r9
            ejfj r9 = r8.c
            ekrg r1 = r9.e
            ekrw r1 = r1.h()
            r3 = 301(0x12d, float:4.22E-43)
            java.lang.String r4 = "EmotifyViewModel.kt"
            java.lang.String r5 = "com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel$onSelectEmote$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r1 = r1.h(r5, r6, r3, r4)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r3 = "ViewModel onClipSticker"
            r1.q(r3)
            android.graphics.Bitmap r1 = r8.d
            dncj r3 = r9.w     // Catch: java.lang.Throwable -> L78
            doig r4 = new doig     // Catch: java.lang.Throwable -> L78
            doid r5 = defpackage.doid.a     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "png"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L78
            r8.e = r9     // Catch: java.lang.Throwable -> L78
            r8.a = r1     // Catch: java.lang.Throwable -> L78
            r8.b = r2     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r3.a(r4, r8)     // Catch: java.lang.Throwable -> L78
            if (r2 == r0) goto L77
            r7 = r2
            r2 = r9
            r9 = r7
        L59:
            android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Throwable -> L78
            fcsu r3 = r2.c     // Catch: java.lang.Throwable -> L78
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L78
            ejfv r3 = (defpackage.ejfv) r3     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.k     // Catch: java.lang.Throwable -> L78
            r8.e = r9     // Catch: java.lang.Throwable -> L78
            r4 = 0
            r8.a = r4     // Catch: java.lang.Throwable -> L78
            r4 = 2
            r8.b = r4     // Catch: java.lang.Throwable -> L78
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r3.a(r1, r9, r2)     // Catch: java.lang.Throwable -> L78
            if (r1 == r0) goto L77
            r0 = r9
            goto L7d
        L77:
            return r0
        L78:
            r9 = move-exception
            java.lang.Object r0 = defpackage.fctl.a(r9)
        L7d:
            ejfj r9 = r8.c
            java.lang.Throwable r1 = defpackage.fctk.c(r0)
            if (r1 != 0) goto La1
            android.net.Uri r0 = (android.net.Uri) r0
            android.graphics.Bitmap r1 = r8.d
            r1.recycle()
            hox r1 = r9.m
            java.lang.Object r1 = r1.a()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L99
            r1.recycle()
        L99:
            fduf r9 = r9.r
            r9.f(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        La1:
            abvd r9 = r9.x
            if (r9 != 0) goto La6
            goto Lab
        La6:
            dnwz r0 = defpackage.dnwz.c
            r9.b(r0)
        Lab:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r0 = "Can't create URI from temp file"
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejfg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ejfg ejfgVar = new ejfg(this.c, this.d, fcxyVar);
        ejfgVar.e = obj;
        return ejfgVar;
    }
}
