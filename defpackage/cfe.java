package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfe extends cgl {
    final /* synthetic */ cgh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfe(cgh cghVar, MediaCodec mediaCodec, int i) {
        super(mediaCodec, i);
        this.a = cghVar;
    }

    @Override // defpackage.cgl
    public final void a(long j) {
        cgh cghVar = this.a;
        if (!cghVar.c) {
            j = cghVar.h(j);
        }
        super.a(j);
    }
}
