package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.android.vcard.VCardEntryCounter;
import com.android.vcard.VCardInterpreter;
import com.android.vcard.VCardSourceDetector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfd implements bxgk {
    private static final cqce h = cqce.g("Bugle", "VCardRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);
    public final cpbn a;
    public final bxfo b;
    public final bxfn c;
    public final fcsu d;
    public final Context e;
    public final List f = new ArrayList();
    public bxfi g;
    private final fcsu j;
    private final bxgl k;
    private final Uri l;

    public bxfd(fcsu fcsuVar, cpbn cpbnVar, bxfo bxfoVar, bxfn bxfnVar, fcsu fcsuVar2, Context context, bxgl bxglVar, Uri uri) {
        this.j = fcsuVar;
        this.a = cpbnVar;
        this.b = bxfoVar;
        this.c = bxfnVar;
        this.d = fcsuVar2;
        this.e = context;
        this.k = bxglVar;
        this.l = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0016, B:8:0x001f, B:9:0x0022, B:11:0x0026, B:12:0x0031, B:13:0x0035, B:21:0x0048, B:22:0x004f), top: B:43:0x0016, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean g(android.net.Uri r6, int r7, com.android.vcard.VCardInterpreter r8, boolean r9) throws java.io.IOException, defpackage.qyu {
        /*
            r5 = this;
            defpackage.cqaz.h()
            android.content.Context r0 = r5.e
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = 0
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: defpackage.qyq -> L56 defpackage.qyv -> L57 java.io.IOException -> L63
            com.android.vcard.VCardParser_V21 r3 = new com.android.vcard.VCardParser_V21     // Catch: defpackage.qyq -> L56 defpackage.qyv -> L57 java.io.IOException -> L63
            r3.<init>(r7)     // Catch: defpackage.qyq -> L56 defpackage.qyv -> L57 java.io.IOException -> L63
            r3.addInterpreter(r8)     // Catch: defpackage.qyq -> L56 defpackage.qyv -> L57 java.io.IOException -> L63
            r3.parse(r2)     // Catch: defpackage.qyw -> L1f java.lang.Throwable -> L45
            if (r2 == 0) goto L43
        L1b:
            r2.close()     // Catch: java.io.IOException -> L43 defpackage.qyq -> L56 defpackage.qyv -> L57
            goto L43
        L1f:
            r2.close()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L45
        L22:
            boolean r3 = r8 instanceof defpackage.bxhd     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L31
            r3 = r8
            bxhd r3 = (defpackage.bxhd) r3     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r3.b = r4     // Catch: java.lang.Throwable -> L45
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L45
            r3.clear()     // Catch: java.lang.Throwable -> L45
        L31:
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: java.lang.Throwable -> L45
            com.android.vcard.VCardParser_V30 r6 = new com.android.vcard.VCardParser_V30     // Catch: java.lang.Throwable -> L45 defpackage.qyw -> L47
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L45 defpackage.qyw -> L47
            r6.addInterpreter(r8)     // Catch: java.lang.Throwable -> L45 defpackage.qyw -> L47
            r6.parse(r2)     // Catch: java.lang.Throwable -> L45 defpackage.qyw -> L47
            if (r2 == 0) goto L43
            goto L1b
        L43:
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L50
        L47:
            r6 = move-exception
            qyq r7 = new qyq     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "vCard with unsupported version."
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L45
            throw r7     // Catch: java.lang.Throwable -> L45
        L50:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L55 defpackage.qyq -> L56 defpackage.qyv -> L57
        L55:
            throw r6     // Catch: defpackage.qyq -> L56 defpackage.qyv -> L57 java.io.IOException -> L63
        L56:
            return r1
        L57:
            r6 = move-exception
            boolean r7 = r6 instanceof defpackage.qyu
            if (r7 == 0) goto L62
            if (r9 != 0) goto L5f
            goto L62
        L5f:
            qyu r6 = (defpackage.qyu) r6
            throw r6
        L62:
            return r1
        L63:
            r6 = move-exception
            cqce r7 = defpackage.bxfd.h
            java.lang.String r8 = "IOException was emitted."
            r7.o(r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxfd.g(android.net.Uri, int, com.android.vcard.VCardInterpreter, boolean):boolean");
    }

    @Override // defpackage.bxgk
    public final int a() {
        return 0;
    }

    @Override // defpackage.bxgk
    public final int b() {
        return 3;
    }

    @Override // defpackage.bxgk
    public final bxgi c() {
        return ((bxgj) this.j.b()).c(4);
    }

    @Override // defpackage.bxgk
    public final bxgl d() {
        return this.k;
    }

    @Override // defpackage.bxgk
    public final /* bridge */ /* synthetic */ bxgz e(List list) throws InterruptedException, qyq, IOException {
        boolean zG;
        cqaz.h();
        cqaz.i(this.g);
        cqaz.a(0, this.f.size());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        cqaz.h();
        VCardInterpreter vCardEntryCounter = new VCardEntryCounter();
        VCardSourceDetector vCardSourceDetector = new VCardSourceDetector();
        Uri uri = this.l;
        try {
            try {
                zG = g(uri, 0, vCardSourceDetector, true);
            } catch (qyu unused) {
                zG = g(uri, vCardSourceDetector.getEstimatedType(), vCardEntryCounter, false);
            }
            if (zG) {
                cqaz.h();
                int estimatedType = vCardSourceDetector.getEstimatedType();
                if (estimatedType == 0) {
                    estimatedType = VCardConfig.getVCardTypeFromString("default");
                }
                bxhd bxhdVar = new bxhd(estimatedType);
                bxhdVar.c.add(new bxfc(this, countDownLatch));
                try {
                    if (g(uri, estimatedType, bxhdVar, false)) {
                        countDownLatch.await(i, TimeUnit.MILLISECONDS);
                        bxfi bxfiVar = this.g;
                        if (bxfiVar != null) {
                            return bxfiVar;
                        }
                        throw new qyq("Failure or timeout loading vcard");
                    }
                } catch (qyu e) {
                    h.o("Must not reach here.", e);
                }
            }
        } catch (qyu e2) {
            h.o("Must not reach here.", e2);
        }
        throw new qyq("Invalid vcard");
    }

    @Override // defpackage.bxgk
    public final String f() {
        return this.l.toString();
    }
}
