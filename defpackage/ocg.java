package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocg extends och {
    private final oau n;
    private final LogSessionId o;
    private boolean p;

    public ocg(oau oauVar, oes oesVar, oak oakVar, LogSessionId logSessionId) {
        super(1, oesVar, oakVar);
        this.n = oauVar;
        this.o = logSessionId;
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "ExoAssetLoaderAudioRenderer";
    }

    @Override // defpackage.och
    protected final void W(mau mauVar) throws ocp {
        oau oauVar = this.n;
        oas oasVar = (oas) oauVar;
        obe obeVarA = ((obg) oasVar.a).a(mfi.b(mauVar), mauVar, null, false, this.o);
        oasVar.b = obeVarA.c();
        this.l = obeVarA;
    }

    @Override // defpackage.och
    protected final boolean X() {
        mix mixVarC = this.k.c();
        if (mixVarC != null) {
            if (!this.p) {
                if (this.l.g()) {
                    ByteBuffer byteBuffer = mixVarC.d;
                    mee.f(byteBuffer);
                    byteBuffer.limit(0);
                    mixVarC.eQ(4);
                    this.k.i();
                    this.m = true;
                    return false;
                }
                ByteBuffer byteBufferD = this.l.d();
                if (byteBufferD != null) {
                    mixVarC.h(byteBufferD.limit());
                    mixVarC.d.put(byteBufferD).flip();
                    MediaCodec.BufferInfo bufferInfoA = this.l.a();
                    mee.f(bufferInfoA);
                    mixVarC.f = bufferInfoA.presentationTimeUs;
                    mixVarC.a = bufferInfoA.flags;
                    this.l.i();
                    this.p = true;
                }
            }
            this.k.i();
            this.p = false;
            return true;
        }
        return false;
    }

    @Override // defpackage.och
    protected final boolean Y(mix mixVar) {
        if (mixVar.eS()) {
            return false;
        }
        long j = mixVar.f - this.j;
        mixVar.f = j;
        if (this.l == null || j >= 0) {
            return false;
        }
        mixVar.eP();
        return true;
    }
}
