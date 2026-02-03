package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwd {
    public static final pwe a(final float f) {
        Float fValueOf = Float.valueOf(f);
        String str = pwf.a;
        str.getClass();
        Object objB = new prq(fValueOf, str, 1).a("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new fdap() { // from class: pwc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                float f2 = f;
                double d = f2;
                boolean z = false;
                if (d >= 0.0d && d <= 1.0d && !fcur.Q(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(f2))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).b();
        objB.getClass();
        float fFloatValue = ((Number) objB).floatValue();
        return new pwe("ratio:" + fFloatValue, fFloatValue);
    }
}
