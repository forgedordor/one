package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athx {
    public static final atib a(atha athaVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2, boolean z) {
        if (z) {
            athaVar.e.a.addAll(arrayDeque2);
        }
        return new atib(athaVar, arrayDeque, z);
    }

    public static final void b(athk athkVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        arrayDeque.add(athkVar);
        arrayDeque2.add(athkVar.a());
    }
}
