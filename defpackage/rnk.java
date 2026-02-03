package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnk implements ImageDecoder$OnHeaderDecodedListener {
    private final rox a = rox.a();
    private final int b;
    private final int c;
    private final rec d;
    private final rok e;
    private final boolean f;
    private final rey g;

    public rnk(int i, int i2, rex rexVar) {
        this.b = i;
        this.c = i2;
        this.d = (rec) rexVar.b(ron.a);
        this.e = (rok) rexVar.b(rok.h);
        rew rewVar = ron.d;
        boolean z = false;
        if (rexVar.b(rewVar) != null && ((Boolean) rexVar.b(rewVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (rey) rexVar.b(ron.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        rox roxVar = this.a;
        int width = this.b;
        int height = this.c;
        if (roxVar.b(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == rec.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new rnj());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fA);
        int iRound2 = Math.round(size.getHeight() * fA);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fA);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        rey reyVar = this.g;
        if (reyVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((reyVar == rey.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
