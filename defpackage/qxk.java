package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxk implements Runnable {
    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g = -1;
    private boolean h;

    public qxk(PhotoView photoView) {
        this.b = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        if (this.h) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f3 = this.g != -1 ? (jCurrentTimeMillis - r2) / 1000.0f : 0.0f;
        PhotoView photoView = this.b;
        int iB = photoView.b(this.c * f3, this.d * f3);
        this.g = jCurrentTimeMillis;
        float f4 = this.e * f3;
        if (Math.abs(this.c) > Math.abs(f4)) {
            this.c -= f4;
        } else {
            this.c = 0.0f;
        }
        float f5 = this.f * f3;
        if (Math.abs(this.d) > Math.abs(f5)) {
            f2 = this.d - f5;
            this.d = f2;
            f = f2;
        } else {
            this.d = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
        }
        float f6 = this.c;
        if ((f6 == 0.0f && f2 == 0.0f) || iB == 0) {
            this.a = false;
            this.h = true;
            photoView.d();
        } else {
            if (iB == 1) {
                this.e = f6 <= 0.0f ? -20000.0f : 20000.0f;
                this.f = 0.0f;
                this.d = 0.0f;
            } else if (iB == 2) {
                this.e = 0.0f;
                this.f = f <= 0.0f ? -20000.0f : 20000.0f;
                this.c = 0.0f;
            }
        }
        if (this.h) {
            return;
        }
        photoView.post(this);
    }
}
