package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqp implements mbs {
    private static final mau f;
    private static final mau g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        mat matVar = new mat();
        matVar.c("application/id3");
        f = new mau(matVar);
        mat matVar2 = new mat();
        matVar2.c("application/x-scte35");
        g = new mau(matVar2);
    }

    public nqp(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    @Override // defpackage.mbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mau a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L22
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L18
            goto L36
        L18:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r4
            goto L37
        L22:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 0
            goto L37
        L2c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = -1
        L37:
            if (r0 == 0) goto L42
            if (r0 == r4) goto L42
            if (r0 == r3) goto L3f
            r0 = 0
            return r0
        L3f:
            mau r0 = defpackage.nqp.g
            return r0
        L42:
            mau r0 = defpackage.nqp.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqp.a():mau");
    }

    @Override // defpackage.mbs
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nqp nqpVar = (nqp) obj;
            if (this.c == nqpVar.c && this.d == nqpVar.d && Objects.equals(this.a, nqpVar.a) && Objects.equals(this.b, nqpVar.b) && Arrays.equals(this.e, nqpVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        long j = this.c;
        long j2 = this.d;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
