package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdc extends fhdn {
    private final Method a;
    private final int b;

    public fhdc(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fhdn
    public final /* bridge */ /* synthetic */ void a(fhds fhdsVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fhef.d(this.a, this.b, "Header map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fhef.d(this.a, this.b, "Header map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fhef.d(this.a, this.b, a.a(str, "Header map contained null value for key '", "'."), new Object[0]);
            }
            fhdsVar.b(str, value.toString());
        }
    }
}
