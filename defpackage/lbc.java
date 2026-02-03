package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbc {
    public final int a;
    public final List b;

    public lbc(List list) {
        this.a = 0;
        this.b = list;
    }

    public final lbd[] a() {
        return (lbd[]) this.b.get(0);
    }

    @Deprecated
    public lbc() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }
}
