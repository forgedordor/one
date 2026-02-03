package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhde extends fhdn {
    private final Method a;
    private final int b;
    private final feyn c;
    private final fhbv d;

    public fhde(Method method, int i, feyn feynVar, fhbv fhbvVar) {
        this.a = method;
        this.b = i;
        this.c = feynVar;
        this.d = fhbvVar;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            fhdsVar.c(this.c, (fezf) this.d.a(obj));
        } catch (IOException e) {
            throw fhef.d(this.a, this.b, a.b(obj, "Unable to convert ", " to RequestBody"), e);
        }
    }
}
