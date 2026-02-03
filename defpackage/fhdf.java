package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdf extends fhdn {
    private final Method a;
    private final int b;
    private final fhbv c;
    private final String d;

    public fhdf(Method method, int i, fhbv fhbvVar, String str) {
        this.a = method;
        this.b = i;
        this.c = fhbvVar;
        this.d = str;
    }

    @Override // defpackage.fhdn
    public final /* synthetic */ void a(fhds fhdsVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fhef.d(this.a, this.b, "Part map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fhef.d(this.a, this.b, "Part map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fhef.d(this.a, this.b, a.a(str, "Part map contained null value for key '", "'."), new Object[0]);
            }
            fhdsVar.c(feym.c(ffho.c, a.a(str, "form-data; name=\"", "\""), ffho.b, this.d), (fezf) this.c.a(value));
        }
    }
}
