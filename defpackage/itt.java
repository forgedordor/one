package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itt {
    public static final float a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void b(its itsVar, ise iseVar) {
        c(itsVar, iseVar, 0L);
    }

    public static final void c(its itsVar, ise iseVar, long j) {
        if (irt.d(iseVar)) {
            itsVar.b();
        }
        if (!irt.f(iseVar)) {
            List listA = iseVar.a();
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                irg irgVar = (irg) listA.get(i);
                itsVar.a(irgVar.a, ihs.e(irgVar.c, j));
            }
            itsVar.a(iseVar.b, ihs.e(iseVar.k, j));
        }
        if (irt.f(iseVar) && iseVar.b - itsVar.c > 40) {
            itsVar.b();
        }
        itsVar.c = iseVar.b;
    }
}
