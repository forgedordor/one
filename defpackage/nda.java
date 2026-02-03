package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nda implements ndb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // defpackage.ndb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nqk a(defpackage.mau r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.o
            if (r6 == 0) goto L6c
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1354451219: goto L38;
                case -1348231605: goto L2e;
                case -1248341703: goto L24;
                case 1154383568: goto L1a;
                case 1652648887: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "application/x-scte35"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
            r0 = r3
            goto L43
        L1a:
            java.lang.String r0 = "application/x-emsg"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
            r0 = r4
            goto L43
        L24:
            java.lang.String r0 = "application/id3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
            r0 = 0
            goto L43
        L2e:
            java.lang.String r0 = "application/x-icy"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
            r0 = r2
            goto L43
        L38:
            java.lang.String r0 = "application/vnd.dvb.ait"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L42
            r0 = r1
            goto L43
        L42:
            r0 = -1
        L43:
            if (r0 == 0) goto L65
            if (r0 == r4) goto L5f
            if (r0 == r3) goto L59
            if (r0 == r2) goto L53
            if (r0 != r1) goto L6c
            nqo r6 = new nqo
            r6.<init>()
            return r6
        L53:
            nqu r6 = new nqu
            r6.<init>()
            return r6
        L59:
            nrt r6 = new nrt
            r6.<init>()
            return r6
        L5f:
            nqq r6 = new nqq
            r6.<init>()
            return r6
        L65:
            nrf r6 = new nrf
            r0 = 0
            r6.<init>(r0)
            return r6
        L6c:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nda.a(mau):nqk");
    }

    @Override // defpackage.ndb
    public final boolean b(mau mauVar) {
        String str = mauVar.o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
