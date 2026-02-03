package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blf {
    public final Object a;

    public blf(Object obj) {
        this.a = obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Result: <");
        Object obj = this.a;
        Objects.toString(obj);
        sb.append("Value: ".concat(String.valueOf(obj)));
        sb.append(">]");
        return sb.toString();
    }
}
