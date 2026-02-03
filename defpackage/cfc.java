package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfc implements bpu {
    final /* synthetic */ cfd a;

    public cfc(cfd cfdVar) {
        this.a = cfdVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            this.a.a.j((MediaCodec.CodecException) th);
        } else {
            cfd cfdVar = this.a;
            cfdVar.a.k(0, th.getMessage(), th);
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
