package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhda extends fhdn {
    private final Method a;
    private final int b;
    private final fhbv c;
    private final boolean d;

    public fhda(Method method, int i, fhbv fhbvVar, boolean z) {
        this.a = method;
        this.b = i;
        this.c = fhbvVar;
        this.d = z;
    }

    @Override // defpackage.fhdn
    public final /* bridge */ /* synthetic */ void a(fhds fhdsVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            throw fhef.d(this.a, this.b, "Field map was null.", new Object[0]);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw fhef.d(this.a, this.b, "Field map contained null key.", new Object[0]);
            }
            Object value = entry.getValue();
            if (value == null) {
                throw fhef.d(this.a, this.b, a.a(str, "Field map contained null value for key '", "'."), new Object[0]);
            }
            String string = value.toString();
            if (string == null) {
                throw fhef.d(this.a, this.b, "Field map value '" + value.toString() + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
            }
            fhdsVar.a(str, string, this.d);
        }
    }
}
