package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lyp {
    public final Map b = new LinkedHashMap();

    public abstract Object a(lyo lyoVar);

    public final boolean equals(Object obj) {
        return (obj instanceof lyp) && fdbq.f(this.b, ((lyp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
