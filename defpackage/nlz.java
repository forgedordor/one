package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlz extends mpc {
    private final mix j;
    private final mfr k;
    private nly l;
    private long m;

    public nlz() {
        super(6);
        this.j = new mix(1);
        this.k = new mfr();
    }

    private final void W() {
        nly nlyVar = this.l;
        if (nlyVar != null) {
            nlyVar.b();
        }
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.mth
    public final void S(long j, long j2) {
        float[] fArr;
        while (!M() && this.m < 100000 + j) {
            mix mixVar = this.j;
            mixVar.eP();
            if (c(j(), mixVar, 0) != -4 || mixVar.eS()) {
                return;
            }
            long j3 = mixVar.f;
            this.m = j3;
            long j4 = this.f;
            if (this.l != null && j3 >= j4) {
                mixVar.i();
                ByteBuffer byteBuffer = mixVar.d;
                String str = mgb.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    mfr mfrVar = this.k;
                    mfrVar.I(byteBuffer.array(), byteBuffer.limit());
                    mfrVar.K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(mfrVar.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.l.a(this.m - this.e, fArr);
                }
            }
        }
    }

    @Override // defpackage.mth
    public final boolean T() {
        return M();
    }

    @Override // defpackage.mth
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) {
        return mti.a(true != "application/x-camera-motion".equals(mauVar.o) ? 0 : 4);
    }

    @Override // defpackage.mpc, defpackage.mtd
    public final void r(int i, Object obj) {
        if (i == 8) {
            this.l = (nly) obj;
        }
    }

    @Override // defpackage.mpc
    protected final void u() {
        W();
    }

    @Override // defpackage.mpc
    protected final void w(long j, boolean z) {
        this.m = Long.MIN_VALUE;
        W();
    }
}
