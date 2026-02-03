package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oci extends och {
    private final oau n;
    private final int o;
    private final List p;
    private final LogSessionId q;
    private int r;

    public oci(oau oauVar, int i, oes oesVar, oak oakVar, LogSessionId logSessionId) {
        super(2, oesVar, oakVar);
        this.n = oauVar;
        this.o = i;
        this.q = logSessionId;
        this.p = new ArrayList();
        this.r = -1;
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "ExoAssetLoaderVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // defpackage.och
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void W(defpackage.mau r13) throws java.lang.NumberFormatException, defpackage.ocp {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oci.W(mau):void");
    }

    @Override // defpackage.och
    protected final boolean X() throws ocp {
        if (this.l.g()) {
            this.k.f();
            this.m = true;
            return false;
        }
        MediaCodec.BufferInfo bufferInfoA = this.l.a();
        if (bufferInfoA != null) {
            long j = bufferInfoA.presentationTimeUs - this.j;
            if (j >= 0) {
                long j2 = bufferInfoA.presentationTimeUs;
                List list = this.p;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) list.get(i)).longValue() == j2) {
                        list.remove(i);
                    }
                }
                if (((odt) this.k).a.a() != this.r && ((odt) this.k).a.j()) {
                    ((obe) this.l).l(true, j);
                    return true;
                }
            }
            this.l.i();
            return true;
        }
        return false;
    }

    @Override // defpackage.och
    protected final boolean Y(mix mixVar) {
        if (mixVar.eS()) {
            return false;
        }
        mee.f(mixVar.d);
        if (this.l != null) {
            return false;
        }
        mixVar.f -= this.j;
        return false;
    }

    @Override // defpackage.och
    protected final mau Z(mau mauVar) {
        if (this.o != 3 || !mag.i(mauVar.E)) {
            return mauVar;
        }
        mat matVar = new mat(mauVar);
        matVar.C = mag.a;
        return new mau(matVar);
    }

    @Override // defpackage.och
    protected final mau aa(mau mauVar) {
        mag magVarC = oeu.c(oeu.d(mauVar.E), this.o == 1);
        mat matVar = new mat(mauVar);
        matVar.C = magVarC;
        return new mau(matVar);
    }

    @Override // defpackage.och
    protected final void ab(mix mixVar) {
        long j = mixVar.f;
        if (j < this.f) {
            this.p.add(Long.valueOf(j));
        }
    }
}
