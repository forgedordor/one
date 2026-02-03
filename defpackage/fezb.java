package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezb {
    public final feyq a;
    public final String b;
    public final feyn c;
    public final fezf d;
    public final Map e;
    public fexi f;

    public fezb(feyq feyqVar, String str, feyn feynVar, fezf fezfVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = feyqVar;
        this.b = str;
        this.c = feynVar;
        this.d = fezfVar;
        this.e = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        feyn feynVar = this.c;
        if (feynVar.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : feynVar) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                fcti fctiVar = (fcti) obj;
                String str = (String) fctiVar.a;
                String str2 = (String) fctiVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
