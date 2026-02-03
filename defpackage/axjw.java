package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjw {
    public final StringBuilder a = new StringBuilder();
    public final HashSet b = new HashSet();

    private axjw() {
    }

    public static axjw a() {
        ThreadLocal threadLocal = axjx.a;
        axjw axjwVar = (axjw) threadLocal.get();
        if (axjwVar == null) {
            axjwVar = new axjw();
            threadLocal.set(axjwVar);
        }
        axjwVar.b.clear();
        axjwVar.a.setLength(0);
        return axjwVar;
    }
}
