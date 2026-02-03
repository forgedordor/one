package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eevu extends eesc {
    public static final /* synthetic */ int b = 0;
    public eevs a;

    public eevu(eevs eevsVar) {
        super(eevsVar);
        this.a = eevsVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.x.left && f2 == this.a.x.top && f3 == this.a.x.right && f4 == this.a.x.bottom) {
            return;
        }
        this.a.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new eevs(this.a);
        return this;
    }
}
