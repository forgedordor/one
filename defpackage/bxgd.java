package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgd extends bxgh {
    private static final cqce a = cqce.g("Bugle", "GifImageResource");
    private FrameSequence b;

    public bxgd(String str, FrameSequence frameSequence, cogw cogwVar) {
        super(str, 1, cogwVar);
        this.b = frameSequence;
    }

    public static bxgd m(String str, InputStream inputStream, cogw cogwVar) throws IOException {
        try {
            try {
                FrameSequence frameSequenceDecodeStream = FrameSequence.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                if (frameSequenceDecodeStream == null) {
                    return null;
                }
                return new bxgd(str, frameSequenceDecodeStream, cogwVar);
            } catch (IOException unused2) {
                return null;
            }
        } catch (UnsatisfiedLinkError unused3) {
            inputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    @Override // defpackage.bxgz
    public final int a() {
        cqaz.c("GifImageResource should not be used by a media cache");
        return 0;
    }

    @Override // defpackage.bxgz
    protected final void b() {
        o();
        try {
            this.b = null;
        } finally {
            r();
        }
    }

    @Override // defpackage.bxgh
    public final Bitmap d() throws bxgg {
        throw new bxgg();
    }

    @Override // defpackage.bxgh
    public final Bitmap e() {
        return null;
    }

    @Override // defpackage.bxgh
    public final Drawable f(Resources resources) {
        try {
            FrameSequence frameSequence = this.b;
            frameSequence.getClass();
            return new FrameSequenceDrawable(frameSequence);
        } catch (Throwable th) {
            a.o("Error getting drawable for GIF.", th);
            return null;
        }
    }

    @Override // defpackage.bxgz
    public final boolean h() {
        return false;
    }

    @Override // defpackage.bxgh
    public final boolean i() {
        return false;
    }

    @Override // defpackage.bxgh
    public final byte[] j() throws bxgg {
        throw new bxgg();
    }
}
