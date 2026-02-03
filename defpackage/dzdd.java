package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdd implements TypeEvaluator {
    private final RectF a;

    public dzdd(RectF rectF) {
        this.a = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        float f2 = rectF.top + ((rectF2.top - rectF.top) * f);
        RectF rectF3 = this.a;
        rectF3.top = f2;
        rectF3.left = rectF.left + ((rectF2.left - rectF.left) * f);
        rectF3.right = rectF.right + ((rectF2.right - rectF.right) * f);
        rectF3.bottom = rectF.bottom + (f * (rectF2.bottom - rectF.bottom));
        return rectF3;
    }
}
