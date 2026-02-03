package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adco extends adcs {
    public Context a;
    public Paint b;
    public RecyclerView c;
    public wv d;
    private addh e;
    private Drawable f;
    private Canvas g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private byte l;

    @Override // defpackage.adcs
    public final adct a() {
        Context context;
        addh addhVar;
        Drawable drawable;
        Paint paint;
        Canvas canvas;
        RecyclerView recyclerView;
        wv wvVar;
        if (this.l == 15 && (context = this.a) != null && (addhVar = this.e) != null && (drawable = this.f) != null && (paint = this.b) != null && (canvas = this.g) != null && (recyclerView = this.c) != null && (wvVar = this.d) != null) {
            return new adcp(context, addhVar, drawable, paint, canvas, recyclerView, wvVar, this.h, this.i, this.j, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.e == null) {
            sb.append(" iconProvider");
        }
        if (this.f == null) {
            sb.append(" drawable");
        }
        if (this.b == null) {
            sb.append(" backgroundPaint");
        }
        if (this.g == null) {
            sb.append(" canvas");
        }
        if (this.c == null) {
            sb.append(" recyclerView");
        }
        if (this.d == null) {
            sb.append(" viewHolder");
        }
        if ((this.l & 1) == 0) {
            sb.append(" dX");
        }
        if ((this.l & 2) == 0) {
            sb.append(" dXLast");
        }
        if ((this.l & 4) == 0) {
            sb.append(" isCurrentlyActive");
        }
        if ((this.l & 8) == 0) {
            sb.append(" swipeThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.adcs
    public final void b(Canvas canvas) {
        if (canvas == null) {
            throw new NullPointerException("Null canvas");
        }
        this.g = canvas;
    }

    @Override // defpackage.adcs
    public final void c(float f) {
        this.h = f;
        this.l = (byte) (this.l | 1);
    }

    @Override // defpackage.adcs
    public final void d(float f) {
        this.i = f;
        this.l = (byte) (this.l | 2);
    }

    @Override // defpackage.adcs
    public final void e(Drawable drawable) {
        if (drawable == null) {
            throw new NullPointerException("Null drawable");
        }
        this.f = drawable;
    }

    @Override // defpackage.adcs
    public final void f(addh addhVar) {
        if (addhVar == null) {
            throw new NullPointerException("Null iconProvider");
        }
        this.e = addhVar;
    }

    @Override // defpackage.adcs
    public final void g(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 4);
    }

    @Override // defpackage.adcs
    public final void h() {
        this.k = 0.5f;
        this.l = (byte) (this.l | 8);
    }
}
