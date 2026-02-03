package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgd implements bpu {
    final /* synthetic */ ceb a;
    final /* synthetic */ cge b;

    public cgd(cge cgeVar, ceb cebVar) {
        this.b = cgeVar;
        this.a = cebVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        cgh cghVar = this.b.b;
        cghVar.m.remove(this.a);
        if (th instanceof MediaCodec.CodecException) {
            cghVar.j((MediaCodec.CodecException) th);
        } else {
            cghVar.k(0, th.getMessage(), th);
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b.m.remove(this.a);
    }
}
