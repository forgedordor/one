package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pim {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public pim(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    @fcsv
    public static final pim a(pjo pjoVar, String str) {
        return pih.a(new pgz(pjoVar), str);
    }

    public final boolean equals(Object obj) {
        return pip.f(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return pip.b(this);
    }
}
