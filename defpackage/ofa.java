package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.effect.SingleInputVideoGraph;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofa extends odm {
    public final oex e;
    public volatile long f;
    private final oez g;
    private final mix h;
    private long i;
    private boolean j;

    public ofa(Context context, mau mauVar, odx odxVar, mcv mcvVar, List list, mcy mcyVar, oav oavVar, odh odhVar, meo meoVar, ocv ocvVar, maj majVar, boolean z, ekgb ekgbVar, LogSessionId logSessionId) throws ocp {
        super(mauVar, odhVar);
        this.f = -9223372036854775807L;
        this.i = -9223372036854775807L;
        mag magVar = mauVar.E;
        mee.f(magVar);
        mag magVar2 = magVar.e == 2 ? Objects.equals(mauVar.o, "image/jpeg_r") ? new mag(6, 1, 7, null, -1, -1) : mag.a : magVar;
        mat matVar = new mat(mauVar);
        matVar.C = magVar2;
        oex oexVar = new oex(oavVar, new mau(matVar), ekgbVar, odhVar.b(2), odxVar, ocvVar, logSessionId);
        this.e = oexVar;
        this.h = new mix(0);
        if (oexVar.h == 2 && mag.i(magVar)) {
            magVar2 = mag.a;
        }
        try {
            oez oezVar = new oez(this, context, z ? new mni(mcyVar) : new SingleInputVideoGraph.Factory(mcyVar), magVar2, majVar, mcvVar, list, meoVar);
            this.g = oezVar;
            oezVar.a.d();
        } catch (mcw e) {
            throw new ocp("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.odm
    public final void d() {
        this.g.a.h();
        oex oexVar = this.e;
        if (oexVar.k != null) {
            oexVar.k.f();
        }
        oexVar.m = true;
    }

    @Override // defpackage.odm
    protected final mau p() {
        oex oexVar = this.e;
        if (oexVar.k == null) {
            return null;
        }
        mau mauVarB = oexVar.k.b();
        if (mauVarB == null || oexVar.l == 0) {
            return mauVarB;
        }
        mat matVar = new mat(mauVarB);
        matVar.y = oexVar.l;
        return new mau(matVar);
    }

    @Override // defpackage.odm
    protected final mix q() {
        oex oexVar = this.e;
        ByteBuffer byteBufferD = oexVar.k != null ? oexVar.k.d() : null;
        mix mixVar = this.h;
        mixVar.d = byteBufferD;
        if (mixVar.d == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfoA = oexVar.k != null ? oexVar.k.a() : null;
        mee.f(bufferInfoA);
        if (bufferInfoA.presentationTimeUs == 0 && this.g.a.l() == this.j && this.f != -9223372036854775807L && bufferInfoA.size > 0) {
            bufferInfoA.presentationTimeUs = this.f;
        }
        mixVar.f = bufferInfoA.presentationTimeUs;
        mixVar.a = bufferInfoA.flags;
        this.i = bufferInfoA.presentationTimeUs;
        return mixVar;
    }

    @Override // defpackage.odm
    public final ocx r(obt obtVar, mau mauVar, int i) throws ocp {
        try {
            oez oezVar = this.g;
            mdd mddVar = oezVar.a;
            mddVar.f(i);
            long j = oezVar.c;
            return new oey(mddVar, i);
        } catch (mcw e) {
            throw new ocp("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.odm
    protected final void s() {
        if (this.i == 0) {
            this.j = true;
        }
        oex oexVar = this.e;
        if (oexVar.k != null) {
            oexVar.k.i();
        }
        boolean z = this.g.b;
    }

    @Override // defpackage.odm
    protected final boolean t() {
        oex oexVar = this.e;
        if (oexVar.k != null && oexVar.k.g()) {
            return true;
        }
        boolean z = this.g.b;
        return false;
    }
}
