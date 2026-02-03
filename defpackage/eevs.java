package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevs extends eesa {
    public final RectF x;

    public eevs(eesj eesjVar, RectF rectF) {
        super(eesjVar);
        this.x = rectF;
    }

    @Override // defpackage.eesa, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = eevu.b;
        eevt eevtVar = new eevt(this);
        eevtVar.invalidateSelf();
        return eevtVar;
    }

    public eevs(eevs eevsVar) {
        super(eevsVar);
        this.x = eevsVar.x;
    }
}
