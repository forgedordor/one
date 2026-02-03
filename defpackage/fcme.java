package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcme {
    public final String a;
    public final Map b;

    public fcme(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fcme) {
            fcme fcmeVar = (fcme) obj;
            if (this.a.equals(fcmeVar.a) && this.b.equals(fcmeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("policyName", this.a);
        ejwfVarB.b("rawConfigValue", this.b);
        return ejwfVarB.toString();
    }
}
