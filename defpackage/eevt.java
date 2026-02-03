package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevt extends eevu {
    public eevt(eevs eevsVar) {
        super(eevsVar);
    }

    @Override // defpackage.eesc
    protected final void K(Canvas canvas) {
        if (this.a.x.isEmpty()) {
            super.K(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.x);
        super.K(canvas);
        canvas.restore();
    }
}
