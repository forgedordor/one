package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgh implements bbm {
    bbl[] a;
    private final Object b;
    private final int c;
    private final int d;
    private final bbh e;

    public bgh(Bitmap bitmap, long j) {
        lcg.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        int rowBytes = bitmap.getRowBytes();
        int i = ImageProcessingUtil.a;
        ImageProcessingUtil.nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes(), rowBytes, bitmap.getWidth(), bitmap.getHeight(), false);
        byteBufferAllocateDirect.rewind();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.b = new Object();
        this.c = width;
        this.d = height;
        this.e = new bgg(j);
        byteBufferAllocateDirect.rewind();
        this.a = new bbl[]{new bgf(width * 4, byteBufferAllocateDirect)};
    }

    private final void g() {
        synchronized (this.b) {
            lcg.d(this.a != null, "The image is closed.");
        }
    }

    @Override // defpackage.bbm
    public final int a() {
        synchronized (this.b) {
            g();
        }
        return 1;
    }

    @Override // defpackage.bbm
    public final int b() {
        int i;
        synchronized (this.b) {
            g();
            i = this.d;
        }
        return i;
    }

    @Override // defpackage.bbm
    public final int c() {
        int i;
        synchronized (this.b) {
            g();
            i = this.c;
        }
        return i;
    }

    @Override // defpackage.bbm, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            g();
            this.a = null;
        }
    }

    @Override // defpackage.bbm
    public final Image d() {
        synchronized (this.b) {
            g();
        }
        return null;
    }

    @Override // defpackage.bbm
    public final bbh e() {
        bbh bbhVar;
        synchronized (this.b) {
            g();
            bbhVar = this.e;
        }
        return bbhVar;
    }

    @Override // defpackage.bbm
    public final bbl[] f() {
        bbl[] bblVarArr;
        synchronized (this.b) {
            g();
            bblVarArr = this.a;
            bblVarArr.getClass();
        }
        return bblVarArr;
    }
}
