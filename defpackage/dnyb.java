package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyb extends fcyz implements fdat {
    int a;
    int b;
    final /* synthetic */ dnvg c;
    final /* synthetic */ dnyn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnyb(dnvg dnvgVar, dnyn dnynVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnvgVar;
        this.d = dnynVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnyb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen$onStickerLongClicked$1$1"
            r4 = 1
            r5 = 0
            java.lang.String r6 = "EmotifyScreen.kt"
            if (r1 == 0) goto L1a
            if (r1 == r4) goto L16
            int r0 = r9.a
            defpackage.fctl.b(r10)
            goto L7b
        L16:
            defpackage.fctl.b(r10)
            goto L42
        L1a:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.dnyn.a
            ekrw r10 = r10.h()
            r1 = 248(0xf8, float:3.48E-43)
            ekrw r10 = r10.h(r3, r2, r1, r6)
            ekrd r10 = (defpackage.ekrd) r10
            dnvg r1 = r9.c
            java.lang.String r1 = r1.a
            java.lang.String r7 = "Deleting custom sticker %s"
            r10.t(r7, r1)
            dnyn r10 = r9.d
            dnvi r10 = r10.b()
            r9.b = r4
            java.lang.Object r10 = r10.c(r1, r9)
            if (r10 == r0) goto Lc3
        L42:
            dnyn r10 = r9.d
            android.content.Context r1 = r10.a()
            android.content.ContentResolver r1 = r1.getContentResolver()
            dnvg r7 = r9.c
            java.lang.String r8 = r7.b
            android.net.Uri r8 = android.net.Uri.parse(r8)
            int r1 = r1.delete(r8, r5, r5)
            dneq r10 = r10.am
            if (r10 != 0) goto L62
            java.lang.String r10 = "usageProcessor"
            defpackage.fdbq.c(r10)
            r10 = r5
        L62:
            java.lang.String r7 = r7.a
            dnwt r8 = new dnwt
            r8.<init>(r7)
            r9.a = r1
            r7 = 2
            r9.b = r7
            dnga r10 = r10.c
            java.lang.Object r10 = r10.b(r8, r9)
            if (r10 == r0) goto L78
            fctx r10 = defpackage.fctx.a
        L78:
            if (r10 == r0) goto Lc3
            r0 = r1
        L7b:
            if (r0 != 0) goto L91
            ekrg r10 = defpackage.dnyn.a
            ekrw r10 = r10.i()
            r0 = 253(0xfd, float:3.55E-43)
            ekrw r10 = r10.h(r3, r2, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Failed to delete custom sticker"
            r10.q(r0)
            goto La6
        L91:
            if (r0 <= r4) goto La6
            ekrg r10 = defpackage.dnyn.a
            ekrw r10 = r10.i()
            r1 = 257(0x101, float:3.6E-43)
            ekrw r10 = r10.h(r3, r2, r1, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r1 = "Deleted more than one matching custom sticker (%d)"
            r10.r(r1, r0)
        La6:
            dnyn r10 = r9.d
            j$.util.Optional r10 = r10.ak
            if (r10 != 0) goto Lb2
            java.lang.String r10 = "emotifyEventLogger"
            defpackage.fdbq.c(r10)
            goto Lb3
        Lb2:
            r5 = r10
        Lb3:
            dnxz r10 = new dnxz
            r10.<init>()
            dnya r0 = new dnya
            r0.<init>()
            r5.ifPresent(r0)
            fctx r10 = defpackage.fctx.a
            return r10
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnyb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnyb(this.c, this.d, fcxyVar);
    }
}
