package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euya extends euxz {
    private static final String p = "euya";
    public Surface n;
    public boolean o;

    public euya(euxy euxyVar, int i, int i2, int i3) {
        super(euxyVar, 100000L, 500000L, 33333L);
        this.o = false;
        try {
            a(euxyVar.d, i, i2, i3);
        } catch (MediaCodec.CodecException | NullPointerException unused) {
            throw new RuntimeException("Unable to create video encoder");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(android.media.MediaMuxer r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euya.a(android.media.MediaMuxer, int, int, int):void");
    }

    @Override // defpackage.euxz
    public final void c() {
        ejwl.a(this.j);
        ejwl.a(!this.l);
        if (this.o) {
            this.g.signalEndOfInputStream();
        } else {
            super.c();
        }
    }

    @Override // defpackage.euxz
    public final void d() {
        super.d();
        Surface surface = this.n;
        if (surface != null) {
            surface.release();
            this.n = null;
        }
    }
}
