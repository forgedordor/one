package defpackage;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayi implements bbl {
    private final Image.Plane a;

    public ayi(Image.Plane plane) {
        this.a = plane;
    }

    @Override // defpackage.bbl
    public final int a() {
        return this.a.getPixelStride();
    }

    @Override // defpackage.bbl
    public final int b() {
        return this.a.getRowStride();
    }

    @Override // defpackage.bbl
    public final ByteBuffer c() {
        return this.a.getBuffer();
    }
}
