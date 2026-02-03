package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdl extends fhdn {
    private final Method a;
    private final int b;

    public fhdl(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fhdn
    public final void a(fhds fhdsVar, Object obj) {
        if (obj == null) {
            throw fhef.d(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
        fhdsVar.e = obj.toString();
    }
}
