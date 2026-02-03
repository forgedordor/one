package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcq implements adcz {
    private final Context a;
    private final addh b;
    private final int c;
    private final Paint d;
    private Drawable e;
    private float f = 0.0f;

    public adcq(Context context, addh addhVar, int i, int i2) {
        this.a = context;
        this.b = addhVar;
        this.c = i2;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(eehg.d(context, i, "SwipeActionCallback"));
    }

    @Override // defpackage.adcz
    public final void a() {
        if (this.e == null) {
            addh addhVar = this.b;
            Drawable drawableB = addhVar.b();
            this.e = drawableB;
            addhVar.c(drawableB, eehg.d(this.a, this.c, "SwipeActionCallback"));
        }
    }

    @Override // defpackage.adcz
    public final void b(Canvas canvas, RecyclerView recyclerView, wv wvVar, float f, boolean z) {
        adco adcoVar = new adco();
        adcoVar.a = this.a;
        adcoVar.f(this.b);
        adcoVar.e(this.e);
        adcoVar.b = this.d;
        adcoVar.b(canvas);
        adcoVar.c = recyclerView;
        adcoVar.d = wvVar;
        adcoVar.c(f);
        adcoVar.d(this.f);
        adcoVar.g(z);
        adcoVar.h();
        this.f = adcy.a(adcoVar.a());
    }
}
