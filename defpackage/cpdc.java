package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdc extends Drawable {
    private final Picture a;

    public cpdc(ryk rykVar) {
        Picture pictureB;
        float fG;
        rxk rxkVar = rykVar.a;
        rwu rwuVar = rxkVar.c;
        if (rwuVar != null) {
            float fG2 = rwuVar.g();
            rwh rwhVar = rxkVar.w;
            if (rwhVar != null) {
                fG = (rwhVar.d * fG2) / rwhVar.c;
            } else {
                rwu rwuVar2 = rxkVar.d;
                fG = rwuVar2 != null ? rwuVar2.g() : fG2;
            }
            pictureB = rykVar.b((int) Math.ceil(fG2), (int) Math.ceil(fG));
        } else {
            pictureB = rykVar.b(512, 512);
        }
        this.a = pictureB;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawPicture(this.a, getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
