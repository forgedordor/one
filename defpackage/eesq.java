package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesq extends eesr {
    public float a;
    public float b;

    @Override // defpackage.eesr
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}
