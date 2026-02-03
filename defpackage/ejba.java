package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejba implements Serializable {
    public final ejas a;
    public final Map b;

    private ejba(ejas ejasVar, Map map) {
        this.a = ejasVar;
        this.b = map;
    }

    static ejba a(ejas ejasVar, Map map) {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("Authorization", ekgb.r("Bearer ".concat(String.valueOf(ejasVar.a))));
        ekgiVar.g(map);
        return new ejba(ejasVar, ekgiVar.c());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ejba)) {
            return false;
        }
        ejba ejbaVar = (ejba) obj;
        return Objects.equals(this.b, ejbaVar.b) && Objects.equals(this.a, ejbaVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
