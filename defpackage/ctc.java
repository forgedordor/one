package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctc {
    public static final float[] a;

    static {
        long[] jArr;
        ctb ctbVar = new ctb();
        int iD = cvp.d(0);
        int iMax = iD > 0 ? Math.max(7, cvp.c(iD)) : 0;
        ctbVar.c = iMax;
        if (iMax == 0) {
            jArr = cvp.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            fcur.t(jArr, -9187201950435737472L, jArr.length);
        }
        ctbVar.a = jArr;
        long[] jArr2 = ctbVar.a;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        ctbVar.b = new float[iMax];
        a = new float[0];
    }
}
