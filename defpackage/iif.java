package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iif implements ijp {
    public final Bitmap a;

    public iif(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.ijp
    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    @Override // defpackage.ijp
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.ijp
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.ijp
    public final void d() {
        this.a.prepareToDraw();
    }
}
