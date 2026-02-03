package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eekp extends eech {
    final /* synthetic */ eeks a;

    public eekp(eeks eeksVar) {
        this.a = eeksVar;
    }

    @Override // defpackage.eech
    /* renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.eech, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
