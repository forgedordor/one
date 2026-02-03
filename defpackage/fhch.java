package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhch {
    public final Method a;
    private final List b;

    public fhch(Method method, List list) {
        this.a = method;
        this.b = DesugarCollections.unmodifiableList(list);
    }

    public final String toString() {
        Method method = this.a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.b);
    }
}
