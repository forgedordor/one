package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdd extends fhdn {
    private final Method a;
    private final int b;

    public fhdd(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fhdn
    public final /* bridge */ /* synthetic */ void a(fhds fhdsVar, Object obj) {
        feyn feynVar = (feyn) obj;
        if (feynVar == null) {
            throw fhef.d(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
        feyl feylVar = fhdsVar.h;
        int iA = feynVar.a();
        for (int i = 0; i < iA; i++) {
            feylVar.c(feynVar.c(i), feynVar.d(i));
        }
    }
}
