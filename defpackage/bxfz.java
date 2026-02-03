package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfz extends bxgh {
    public static final cqce a = cqce.g("Bugle", "DecodedImageResource");
    public boolean b;
    public final cqsu c;
    private Bitmap j;

    public bxfz(String str, Bitmap bitmap, int i, cogw cogwVar, cqsu cqsuVar) {
        super(str, i, cogwVar);
        this.b = true;
        this.j = bitmap;
        this.c = cqsuVar;
    }

    @Override // defpackage.bxgz
    public final int a() {
        o();
        try {
            cqaz.l(this.j);
            return this.j.getAllocationByteCount();
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgz
    protected final void b() {
        o();
        try {
            Bitmap bitmap = this.j;
            if (bitmap != null) {
                bitmap.recycle();
                this.j = null;
            }
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgh
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bxgh
    public final Bitmap d() {
        o();
        try {
            return this.j;
        } finally {
            r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        throw r0;
     */
    @Override // defpackage.bxgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap e() {
        /*
            r2 = this;
            r2.o()
            r2.o()     // Catch: java.lang.Throwable -> L1d
            int r0 = r2.f     // Catch: java.lang.Throwable -> L18
            r1 = 1
            defpackage.cqaz.a(r1, r0)     // Catch: java.lang.Throwable -> L18
            r2.r()     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r2.j     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r2.j = r1     // Catch: java.lang.Throwable -> L1d
            r2.r()
            return r0
        L18:
            r0 = move-exception
            r2.r()     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = move-exception
            r2.r()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxfz.e():android.graphics.Bitmap");
    }

    @Override // defpackage.bxgh
    public final Drawable f(Resources resources) {
        o();
        try {
            int i = this.d;
            Bitmap bitmap = this.j;
            bitmap.getClass();
            return (i == 1 || i == 0) ? new BitmapDrawable(resources, bitmap) : new cssv(i, resources, bitmap);
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgz
    public final bxgk g(bxgk bxgkVar) {
        cqaz.f(false);
        Bitmap bitmapD = d();
        bitmapD.getClass();
        if (bitmapD.hasAlpha()) {
            return null;
        }
        return new bxfy(this, bxgkVar);
    }

    @Override // defpackage.bxgz
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.bxgh
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bxgh
    public final byte[] j() {
        byte[] bArrM;
        o();
        try {
            try {
                bArrM = this.c.m(this.j, 100);
            } catch (Exception e) {
                a.o("Error trying to get the bitmap bytes.", e);
                bArrM = null;
            }
            return bArrM;
        } finally {
            r();
        }
    }
}
