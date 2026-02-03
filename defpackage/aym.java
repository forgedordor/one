package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aym implements bkw {
    public final Object a = new Object();
    public boolean b = true;
    private final ImageReader c;

    public aym(ImageReader imageReader) {
        this.c = imageReader;
    }

    private static final boolean k(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // defpackage.bkw
    public final int a() {
        int height;
        synchronized (this.a) {
            height = this.c.getHeight();
        }
        return height;
    }

    @Override // defpackage.bkw
    public final int b() {
        int imageFormat;
        synchronized (this.a) {
            imageFormat = this.c.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.bkw
    public final int c() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.c.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.bkw
    public final int d() {
        int width;
        synchronized (this.a) {
            width = this.c.getWidth();
        }
        return width;
    }

    @Override // defpackage.bkw
    public final Surface e() {
        Surface surface;
        synchronized (this.a) {
            surface = this.c.getSurface();
        }
        return surface;
    }

    @Override // defpackage.bkw
    public final bbm f() {
        Image imageAcquireLatestImage;
        synchronized (this.a) {
            try {
                imageAcquireLatestImage = this.c.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!k(e)) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new ayj(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.bkw
    public final bbm g() {
        Image imageAcquireNextImage;
        synchronized (this.a) {
            try {
                imageAcquireNextImage = this.c.acquireNextImage();
            } catch (RuntimeException e) {
                if (!k(e)) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new ayj(imageAcquireNextImage);
        }
    }

    @Override // defpackage.bkw
    public final void h() {
        synchronized (this.a) {
            this.b = true;
            this.c.setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.bkw
    public final void i() {
        synchronized (this.a) {
            this.c.close();
        }
    }

    @Override // defpackage.bkw
    public final void j(final bkv bkvVar, final Executor executor) {
        synchronized (this.a) {
            this.b = false;
            this.c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: ayl
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    final aym aymVar = this.a;
                    Object obj = aymVar.a;
                    Executor executor2 = executor;
                    final bkv bkvVar2 = bkvVar;
                    synchronized (obj) {
                        if (!aymVar.b) {
                            executor2.execute(new Runnable() { // from class: ayk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bkvVar2.a(aymVar);
                                }
                            });
                        }
                    }
                }
            }, bon.a());
        }
    }
}
