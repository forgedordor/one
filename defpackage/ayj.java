package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayj implements bbm {
    private final Image a;
    private final ayi[] b;
    private final bbh c;

    public ayj(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new ayi[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new ayi(planes[i]);
            }
        } else {
            this.b = new ayi[0];
        }
        this.c = new ayq(bmx.a, image.getTimestamp(), new Matrix());
    }

    @Override // defpackage.bbm
    public final int a() {
        return this.a.getFormat();
    }

    @Override // defpackage.bbm
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.bbm
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.bbm, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bbm
    public final Image d() {
        return this.a;
    }

    @Override // defpackage.bbm
    public final bbh e() {
        return this.c;
    }

    @Override // defpackage.bbm
    public final bbl[] f() {
        return this.b;
    }
}
