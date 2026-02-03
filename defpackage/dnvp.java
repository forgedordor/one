package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvp implements dnvi {
    private static final dnce b = new dnce(0);
    public final dnwk a;
    private final Context c;
    private final dneq d;
    private final dncj e;

    public dnvp(dnwk dnwkVar, dner dnerVar, dncj dncjVar, Context context) {
        dncjVar.getClass();
        context.getClass();
        this.a = dnwkVar;
        this.e = dncjVar;
        this.c = context;
        this.d = dnerVar.a(new dnfv(31));
    }

    @Override // defpackage.dnvi
    public final Object a(fcxy fcxyVar) {
        dnwk dnwkVar = this.a;
        return dnwkVar.c.c("EmotifyDataService#stickerCount", new dnwj(dnwkVar, null), fcxyVar);
    }

    @Override // defpackage.dnvi
    public final Object b(Uri uri, fcxy fcxyVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return g(string, uri, null, true, fcxyVar);
    }

    @Override // defpackage.dnvi
    public final Object c(String str, fcxy fcxyVar) {
        dnwk dnwkVar = this.a;
        Object objC = dnwkVar.c.c("EmotifyDataService#delete", new dnvx(dnwkVar, str, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objC != fcylVar) {
            objC = fctx.a;
        }
        return objC == fcylVar ? objC : fctx.a;
    }

    @Override // defpackage.dnvi
    public final Object d(fcxy fcxyVar) {
        dnwk dnwkVar = this.a;
        return dnwkVar.c.c("EmotifyDataService#getCustomSticker", new dnwg(dnwkVar, null), fcxyVar);
    }

    @Override // defpackage.dnvi
    public final fdpl e() {
        return fdqq.a(new dnvn(this.d.c(b), this));
    }

    @Override // defpackage.dnvi
    public final Object f(String str, Uri uri, String str2, fcxy fcxyVar) {
        return g(str, uri, str2, false, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r29, android.net.Uri r30, java.lang.String r31, boolean r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnvp.g(java.lang.String, android.net.Uri, java.lang.String, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dnvk
            if (r0 == 0) goto L13
            r0 = r8
            dnvk r0 = (defpackage.dnvk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnvk r0 = new dnvk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            dncj r8 = r6.e
            doig r2 = new doig
            doid r4 = defpackage.doid.a
            java.lang.String r5 = "png"
            r2.<init>(r4, r5)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 == r1) goto L96
        L49:
            android.content.Context r0 = r6.c
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r1 = "com.android.providers.telephony"
            ebsu r1 = defpackage.ebsu.a(r1)
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r7 = defpackage.ebsv.a(r0, r7, r2, r1)
            r1 = 0
            if (r7 == 0) goto L63
            android.os.ParcelFileDescriptor r7 = r7.getParcelFileDescriptor()
            goto L64
        L63:
            r7 = r1
        L64:
            java.lang.String r2 = "w"
            ebsu r3 = defpackage.ebsu.c
            android.content.res.AssetFileDescriptor r0 = defpackage.ebsv.a(r0, r8, r2, r3)
            if (r0 == 0) goto L73
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            goto L74
        L73:
            r0 = r1
        L74:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r2.<init>(r7)
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r7 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L8f
            defpackage.elec.a(r2, r7)     // Catch: java.lang.Throwable -> L88
            defpackage.fczl.a(r7, r1)     // Catch: java.lang.Throwable -> L8f
            defpackage.fczl.a(r2, r1)
            return r8
        L88:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            defpackage.fczl.a(r2, r7)
            throw r8
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnvp.h(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dnvg r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dnvo
            if (r0 == 0) goto L13
            r0 = r12
            dnvo r0 = (defpackage.dnvo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnvo r0 = new dnvo
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r12)
            goto L50
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r12)
            dnwk r5 = r10.a
            java.lang.String r6 = r11.a
            java.lang.String r7 = r11.b
            r0.c = r3
            dnvv r4 = new dnvv
            r9 = 0
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            dngc r11 = r5.c
            java.lang.String r12 = "EmotifyDataService#addSticker"
            java.lang.Object r11 = r11.c(r12, r4, r0)
            if (r11 == r1) goto L4d
            fctx r11 = defpackage.fctx.a
        L4d:
            if (r11 != r1) goto L50
            return r1
        L50:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnvp.i(dnvg, fcxy):java.lang.Object");
    }
}
