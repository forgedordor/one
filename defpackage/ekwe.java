package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwe {
    public static final Comparator a = new ekvx();
    public static final ekwe b = new ekwe(new ekwc(Collections.EMPTY_LIST));
    public final ekwc c;

    private ekwe(ekwc ekwcVar) {
        this.c = ekwcVar;
    }

    public final ekwe a(ekwe ekweVar) {
        return ekweVar.b() ? this : b() ? ekweVar : new ekwe(new ekwc(this.c, ekweVar.c));
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ekwe) && ((ekwe) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ekwe(String str, Object obj) {
        this(new ekwc(str, obj));
        ekwr.c(str);
    }
}
