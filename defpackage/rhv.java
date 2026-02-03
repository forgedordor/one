package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhv {
    public final lcd a;
    public final List b;
    public final String c;

    public rhv(Class cls, Class cls2, Class cls3, List list, lcd lcdVar) {
        this.a = lcdVar;
        rvi.d(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
