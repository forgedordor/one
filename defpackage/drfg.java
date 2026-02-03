package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfg implements rez {
    private final List a;
    private final drfi b;

    public drfg(List list, rii riiVar, rig rigVar) {
        this.a = list;
        this.b = new drfi(list, riiVar, rigVar);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        int i3 = ruu.a;
        return this.b.c(new rus((ByteBuffer) obj));
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return rer.c(this.a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
