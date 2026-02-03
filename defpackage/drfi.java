package defpackage;

import android.support.rastermill.FrameSequence;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfi implements rez {
    private final List a;
    private final rii b;
    private final rig c;

    public drfi(List list, rii riiVar, rig rigVar) {
        this.a = list;
        this.b = riiVar;
        this.c = rigVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        return c((InputStream) obj);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return rer.d(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public final rhy c(InputStream inputStream) {
        return new drfj(FrameSequence.decodeStream(inputStream), this.b);
    }
}
