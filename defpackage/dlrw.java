package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrw extends dlrx {
    public final String a;
    public final Map b;

    public dlrw(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlrw)) {
            return false;
        }
        dlrw dlrwVar = (dlrw) obj;
        return fdbq.f(this.a, dlrwVar.a) && fdbq.f(this.b, dlrwVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Url(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
