package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsx {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor");
    private int b = ((Integer) cqsq.f.e()).intValue();
    private final int c = ((Integer) cqsq.h.e()).intValue();
    private int d = ((Integer) cqsq.g.e()).intValue();
    private final int e = ((Integer) cqsq.a.e()).intValue();
    private final int f = ((Integer) cqsq.b.e()).intValue();
    private final double g = ((Double) cqsq.c.e()).doubleValue();
    private final double h = ((Double) cqsq.d.e()).doubleValue();
    private final int i = ((Integer) cqsq.e.e()).intValue();
    private final cqsu j;
    private final rbv k;
    private final aipo l;
    private final ains m;
    private final cqui n;
    private final cogw o;
    private final cqmz p;
    private final cqtc q;
    private final fcsu r;

    public cqsx(Context context, cqsu cqsuVar, aipo aipoVar, ains ainsVar, cqui cquiVar, cogw cogwVar, cqmz cqmzVar, cqtc cqtcVar, fcsu fcsuVar) {
        this.j = cqsuVar;
        this.k = raw.c(context);
        this.l = aipoVar;
        this.m = ainsVar;
        this.n = cquiVar;
        this.o = cogwVar;
        this.p = cqmzVar;
        this.q = cqtcVar;
        this.r = fcsuVar;
    }

    private final Bitmap c(Uri uri, int i, int i2, long j) {
        long jA = this.o.a();
        try {
            return (Bitmap) this.k.b().i(uri).q(((rtj) new rtj().V(rnp.a, Integer.valueOf(this.f))).z()).t(i, i2).get();
        } catch (InterruptedException | ExecutionException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e);
            ekrdVar.X(cqnc.ab, uri);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "scaleBitmap", 405, "StaticImageCompressor.java")).q("Glide was unable to load image.");
            this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 9);
            h(13, uri, j, jA);
            return null;
        }
    }

    private static void d(Bitmap bitmap, byte[] bArr, int i) {
        if (bitmap == null || bArr == null) {
            return;
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleResizing");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "maybeLogVerboseResult", 422, "StaticImageCompressor.java")).J("Scaled image. width: %d, height: %d, size: %d, quality: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bArr.length), Integer.valueOf(i));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:4|93|5|91|6|(2:8|(3:10|(1:12)(1:13)|14)(3:15|(1:17)(1:18)|19))(1:20)|21|(1:33)(2:29|(1:31)(9:32|35|96|36|37|98|38|(1:(1:41)(5:42|43|92|44|(1:(1:(2:55|56)(2:49|(1:51)(2:53|54)))(2:57|58))(2:59|60)))(1:69)|(1:83)(2:84|(1:86)(2:87|88))))|34|35|96|36|37|98|38|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
    
        r12 = r3;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        h(6, r27, r30, r7);
        r1 = defpackage.cqsx.a.j();
        r1.X(defpackage.eksq.a, "BugleResizing");
        ((defpackage.ekrd) ((defpackage.ekrd) ((defpackage.ekrd) r1).g(r0)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressInternal", 260, r17)).q("IO exception with jpegli encoder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c8, code lost:
    
        r12 = r3;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ca, code lost:
    
        r1 = defpackage.cqsx.a.j();
        r1.X(defpackage.eksq.a, "BugleResizing");
        ((defpackage.ekrd) ((defpackage.ekrd) ((defpackage.ekrd) r1).g(r0)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressInternal", 246, r17)).q("Got OutOfMemoryError while compress image using default config.");
        h(11, r27, r30, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192 A[Catch: IOException -> 0x019d, OutOfMemoryError -> 0x019f, TRY_LEAVE, TryCatch #7 {IOException -> 0x019d, OutOfMemoryError -> 0x019f, blocks: (B:38:0x00f4, B:42:0x0105, B:51:0x0152, B:68:0x0191, B:67:0x018e, B:69:0x0192), top: B:98:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] e(android.net.Uri r27, int r28, int r29, long r30) throws defpackage.evtj {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqsx.e(android.net.Uri, int, int, long):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] f(android.net.Uri r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqsx.f(android.net.Uri, int, int, long):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] g(android.graphics.Bitmap r19, byte[] r20, long r21, android.net.Uri r23) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r4 = r21
            java.lang.String r2 = "BugleResizing"
            int r3 = r1.f
            r6 = 1
            int r3 = r3 + r6
            int r7 = r1.e
            java.lang.String r13 = "StaticImageCompressor.java"
            r15 = r20
        L12:
            int r8 = r3 - r7
            if (r8 <= r6) goto L93
            int r8 = r7 + r3
            int r8 = r8 >> r6
            cogw r9 = r1.o
            long r16 = r9.a()
            cqsu r9 = r1.j     // Catch: java.lang.OutOfMemoryError -> L68
            byte[] r9 = r9.m(r0, r8)     // Catch: java.lang.OutOfMemoryError -> L68
            d(r0, r9, r8)
            if (r9 == 0) goto L65
            int r10 = r9.length
            long r11 = (long) r10
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 > 0) goto L65
            double r11 = r1.h
            double r14 = (double) r10
            double r6 = (double) r4
            double r11 = r11 * r6
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 >= 0) goto L3c
            r7 = r8
            r15 = r9
            goto L66
        L3c:
            ekrg r3 = defpackage.cqsx.a
            ekrw r3 = r3.e()
            ekrz r4 = defpackage.eksq.a
            r3.X(r4, r2)
            ekrd r3 = (defpackage.ekrd) r3
            java.lang.String r2 = "tuneImageQuality"
            r4 = 358(0x166, float:5.02E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/image/StaticImageCompressor"
            ekrw r2 = r3.h(r5, r2, r4, r13)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Fast exit from the compression step."
            r2.q(r3)
            d(r0, r9, r8)
            ains r0 = r1.m
            java.lang.String r2 = "Bugle.Media.Attachment.Resize.V2.Image.FastExit.Count"
            r0.c(r2)
            return r9
        L65:
            r3 = r8
        L66:
            r6 = 1
            goto L12
        L68:
            r0 = move-exception
            r14 = r0
            ekrg r0 = defpackage.cqsx.a
            ekrw r8 = r0.j()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r2)
            java.lang.String r11 = "tuneImageQuality"
            r12 = 340(0x154, float:4.76E-43)
            java.lang.String r9 = "Got OutOfMemoryError while compressing the image. Return the current best result."
            java.lang.String r10 = "com/google/android/apps/messaging/shared/util/image/StaticImageCompressor"
            defpackage.a.o(r8, r9, r10, r11, r12, r13, r14)
            ains r0 = r1.m
            java.lang.String r2 = "Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts"
            r3 = 8
            r0.e(r2, r3)
            r2 = 11
            r3 = r23
            r6 = r16
            r1.h(r2, r3, r4, r6)
            return r15
        L93:
            d(r0, r15, r7)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqsx.g(android.graphics.Bitmap, byte[], long, android.net.Uri):byte[]");
    }

    private final void h(int i, Uri uri, long j, long j2) {
        i(5, i, uri, j, j2);
    }

    private final void i(int i, int i2, Uri uri, long j, long j2) {
        emke emkeVar = (emke) emki.a.createBuilder();
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emkiVar.c = emkf.a(i);
        emkiVar.b |= 1;
        emkeVar.copyOnWrite();
        emki emkiVar2 = (emki) emkeVar.instance;
        emkiVar2.v = emkd.a(i2);
        emkiVar2.b |= 524288;
        int iA = (int) this.p.a(uri);
        emkeVar.copyOnWrite();
        emki emkiVar3 = (emki) emkeVar.instance;
        emkiVar3.b |= 8;
        emkiVar3.f = iA;
        emkeVar.copyOnWrite();
        emki emkiVar4 = (emki) emkeVar.instance;
        emkiVar4.b |= 16;
        emkiVar4.g = (int) j;
        emkeVar.copyOnWrite();
        emki emkiVar5 = (emki) emkeVar.instance;
        emkiVar5.t = emkg.a(3);
        emkiVar5.b |= 131072;
        long jA = this.o.a() - j2;
        emkeVar.copyOnWrite();
        emki emkiVar6 = (emki) emkeVar.instance;
        emkiVar6.b |= 2;
        emkiVar6.d = jA / 1000.0f;
        this.n.k(new cqsv(emkeVar));
    }

    final Bitmap a(Uri uri, int i, int i2) {
        long jA = this.o.a();
        try {
            return c(uri, i, i2, -1L);
        } catch (OutOfMemoryError e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleResizing");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "getScaledBitmapForWeb", (char) 381, "StaticImageCompressor.java")).q("Got OutOfMemoryError while scaling image for web use.");
            h(11, uri, -1L, jA);
            return null;
        }
    }

    public final byte[] b(Uri uri, int i, int i2, long j) throws evtj {
        ainv ainvVarB = this.l.b("Bugle.Media.Attachment.Resize.V2.Image.Duration");
        cogw cogwVar = this.o;
        long jA = cogwVar.a();
        byte[] bArrE = e(uri, i, i2, j);
        emke emkeVar = (emke) emki.a.createBuilder();
        int iA = (int) this.p.a(uri);
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emkiVar.b |= 8;
        emkiVar.f = iA;
        emkeVar.copyOnWrite();
        emki emkiVar2 = (emki) emkeVar.instance;
        emkiVar2.t = emkg.a(3);
        emkiVar2.b |= 131072;
        emkeVar.copyOnWrite();
        emki emkiVar3 = (emki) emkeVar.instance;
        emkiVar3.b |= 16;
        emkiVar3.g = (int) j;
        long jA2 = cogwVar.a() - jA;
        emkeVar.copyOnWrite();
        emki emkiVar4 = (emki) emkeVar.instance;
        emkiVar4.b |= 2;
        emkiVar4.d = jA2 / 1000.0f;
        if (bArrE != null) {
            emkeVar.copyOnWrite();
            emki emkiVar5 = (emki) emkeVar.instance;
            emkiVar5.c = emkf.a(2);
            emkiVar5.b |= 1;
            emkeVar.copyOnWrite();
            emki emkiVar6 = (emki) emkeVar.instance;
            emkiVar6.b |= 32;
            emkiVar6.h = bArrE.length;
        } else {
            emkeVar.copyOnWrite();
            emki emkiVar7 = (emki) emkeVar.instance;
            emkiVar7.c = emkf.a(3);
            emkiVar7.b |= 1;
        }
        this.n.k(new cqsv(emkeVar));
        ainvVarB.c();
        ains ainsVar = this.m;
        ainsVar.c(bArrE != null ? "Bugle.Media.Attachment.Resize.V2.Image.Success.Count" : "Bugle.Media.Attachment.Resize.V2.Image.Fail.Count");
        if (j != 0 && bArrE != null) {
            ainsVar.e("Bugle.Media.Attachment.Resize.V2.Used.Space.Percentage", (int) ((bArrE.length * 100) / j));
        }
        return bArrE;
    }
}
