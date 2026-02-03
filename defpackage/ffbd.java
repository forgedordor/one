package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbd implements feyr {
    private final feyy a;

    public ffbd(feyy feyyVar) {
        this.a = feyyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b(java.io.IOException r5, defpackage.ffaj r6, defpackage.fezb r7, boolean r8) {
        /*
            r4 = this;
            feyy r0 = r4.a
            boolean r0 = r0.g
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r8 == 0) goto L1a
            fezf r7 = r7.d
            if (r7 == 0) goto L14
            boolean r7 = r7.d()
            if (r7 != 0) goto L19
        L14:
            boolean r7 = r5 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            boolean r7 = r5 instanceof java.net.ProtocolException
            if (r7 == 0) goto L1f
            goto L3a
        L1f:
            boolean r7 = r5 instanceof java.io.InterruptedIOException
            if (r7 == 0) goto L2a
            boolean r5 = r5 instanceof java.net.SocketTimeoutException
            if (r5 == 0) goto L3a
            if (r8 != 0) goto L3a
            goto L3b
        L2a:
            boolean r7 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r7 == 0) goto L36
            java.lang.Throwable r7 = r5.getCause()
            boolean r7 = r7 instanceof java.security.cert.CertificateException
            if (r7 != 0) goto L3a
        L36:
            boolean r5 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L3b
        L3a:
            return r1
        L3b:
            ffaf r5 = r6.f
            r5.getClass()
            int r6 = r5.f
            if (r6 != 0) goto L4d
            int r6 = r5.g
            if (r6 != 0) goto L4c
            int r6 = r5.h
            if (r6 == 0) goto L9e
        L4c:
            r6 = r1
        L4d:
            fezl r7 = r5.i
            r8 = 1
            if (r7 == 0) goto L53
            goto L9f
        L53:
            r7 = 0
            if (r6 > r8) goto L85
            int r6 = r5.g
            if (r6 > r8) goto L85
            int r6 = r5.h
            if (r6 <= 0) goto L5f
            goto L85
        L5f:
            ffaj r6 = r5.c
            ffam r6 = r6.g
            if (r6 != 0) goto L66
            goto L85
        L66:
            monitor-enter(r6)
            int r0 = r6.j     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L6d
            monitor-exit(r6)
            goto L85
        L6d:
            fezl r0 = r6.a     // Catch: java.lang.Throwable -> L82
            fexe r2 = r0.a     // Catch: java.lang.Throwable -> L82
            feyq r2 = r2.i     // Catch: java.lang.Throwable -> L82
            fexe r3 = r5.b     // Catch: java.lang.Throwable -> L82
            feyq r3 = r3.i     // Catch: java.lang.Throwable -> L82
            boolean r2 = defpackage.fezr.u(r2, r3)     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L7f
            monitor-exit(r6)
            goto L85
        L7f:
            monitor-exit(r6)
            r7 = r0
            goto L85
        L82:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L85:
            if (r7 == 0) goto L8a
            r5.i = r7
            goto L9f
        L8a:
            ffar r6 = r5.d
            if (r6 == 0) goto L94
            boolean r6 = r6.b()
            if (r6 == r8) goto L9f
        L94:
            ffas r5 = r5.e
            if (r5 == 0) goto L9f
            boolean r5 = r5.a()
            if (r5 != 0) goto L9f
        L9e:
            return r1
        L9f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffbd.b(java.io.IOException, ffaj, fezb, boolean):boolean");
    }

    private static final int c(fezh fezhVar, int i) {
        String strB = fezh.b(fezhVar, "Retry-After");
        return strB == null ? i : new fdgl("\\d+").e(strB) ? Integer.valueOf(strB).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0201, code lost:
    
        r10.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0205, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9 A[Catch: all -> 0x0246, TryCatch #1 {all -> 0x0246, blocks: (B:18:0x0075, B:20:0x0079, B:22:0x007f, B:24:0x0094, B:25:0x009b, B:26:0x00a2, B:27:0x00a3, B:29:0x00a8, B:31:0x00b4, B:44:0x00d6, B:46:0x00db, B:49:0x00e3, B:51:0x00e7, B:54:0x00ef, B:56:0x00f3, B:59:0x00f8, B:123:0x01d8, B:125:0x01dc, B:127:0x01e2, B:129:0x01e6, B:133:0x01f5, B:134:0x0200, B:62:0x0100, B:65:0x010e, B:66:0x0115, B:67:0x0116, B:69:0x011a, B:72:0x011f, B:75:0x0129, B:77:0x012d, B:81:0x0136, B:83:0x014e, B:87:0x0157, B:90:0x015e, B:93:0x0167, B:96:0x0170, B:98:0x0182, B:105:0x0193, B:109:0x019f, B:116:0x01b2, B:118:0x01c3, B:120:0x01c9, B:121:0x01ce, B:112:0x01a9, B:114:0x01ad, B:152:0x023e, B:153:0x0245, B:139:0x0208, B:141:0x0212, B:143:0x021c, B:144:0x021f, B:146:0x0221, B:148:0x022b, B:150:0x0238, B:151:0x023d), top: B:166:0x0075, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b2 A[Catch: all -> 0x0246, TryCatch #1 {all -> 0x0246, blocks: (B:18:0x0075, B:20:0x0079, B:22:0x007f, B:24:0x0094, B:25:0x009b, B:26:0x00a2, B:27:0x00a3, B:29:0x00a8, B:31:0x00b4, B:44:0x00d6, B:46:0x00db, B:49:0x00e3, B:51:0x00e7, B:54:0x00ef, B:56:0x00f3, B:59:0x00f8, B:123:0x01d8, B:125:0x01dc, B:127:0x01e2, B:129:0x01e6, B:133:0x01f5, B:134:0x0200, B:62:0x0100, B:65:0x010e, B:66:0x0115, B:67:0x0116, B:69:0x011a, B:72:0x011f, B:75:0x0129, B:77:0x012d, B:81:0x0136, B:83:0x014e, B:87:0x0157, B:90:0x015e, B:93:0x0167, B:96:0x0170, B:98:0x0182, B:105:0x0193, B:109:0x019f, B:116:0x01b2, B:118:0x01c3, B:120:0x01c9, B:121:0x01ce, B:112:0x01a9, B:114:0x01ad, B:152:0x023e, B:153:0x0245, B:139:0x0208, B:141:0x0212, B:143:0x021c, B:144:0x021f, B:146:0x0221, B:148:0x022b, B:150:0x0238, B:151:0x023d), top: B:166:0x0075, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157 A[Catch: all -> 0x0246, TryCatch #1 {all -> 0x0246, blocks: (B:18:0x0075, B:20:0x0079, B:22:0x007f, B:24:0x0094, B:25:0x009b, B:26:0x00a2, B:27:0x00a3, B:29:0x00a8, B:31:0x00b4, B:44:0x00d6, B:46:0x00db, B:49:0x00e3, B:51:0x00e7, B:54:0x00ef, B:56:0x00f3, B:59:0x00f8, B:123:0x01d8, B:125:0x01dc, B:127:0x01e2, B:129:0x01e6, B:133:0x01f5, B:134:0x0200, B:62:0x0100, B:65:0x010e, B:66:0x0115, B:67:0x0116, B:69:0x011a, B:72:0x011f, B:75:0x0129, B:77:0x012d, B:81:0x0136, B:83:0x014e, B:87:0x0157, B:90:0x015e, B:93:0x0167, B:96:0x0170, B:98:0x0182, B:105:0x0193, B:109:0x019f, B:116:0x01b2, B:118:0x01c3, B:120:0x01c9, B:121:0x01ce, B:112:0x01a9, B:114:0x01ad, B:152:0x023e, B:153:0x0245, B:139:0x0208, B:141:0x0212, B:143:0x021c, B:144:0x021f, B:146:0x0221, B:148:0x022b, B:150:0x0238, B:151:0x023d), top: B:166:0x0075, inners: #4 }] */
    @Override // defpackage.feyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fezh a(defpackage.ffba r31) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffbd.a(ffba):fezh");
    }
}
