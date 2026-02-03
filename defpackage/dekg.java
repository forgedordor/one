package defpackage;

import android.hardware.Camera;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekg {
    public final dcjp a;
    public dcjp b;

    public dekg(Camera.Size size, Camera.Size size2) {
        this.a = new dcjp(size.width, size.height);
        if (size2 != null) {
            this.b = new dcjp(size2.width, size2.height);
        }
    }
}
