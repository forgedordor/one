package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcy extends fhdn {
    private final Method a;
    private final int b;
    private final fhbv c;

    public fhcy(Method method, int i, fhbv fhbvVar) {
        this.a = method;
        this.b = i;
        this.c = fhbvVar;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        if (obj == null) {
            throw fhef.d(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            fhdsVar.m = (fezf) this.c.a(obj);
        } catch (IOException e) {
            throw fhef.e(this.a, e, this.b, a.b(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
