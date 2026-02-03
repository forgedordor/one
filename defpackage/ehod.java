package defpackage;

import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehod {
    private static final ThreadLocal a = new ehob();

    public static void a(Object obj) {
        ((ehoc) ((Stack) a.get()).pop()).a(obj);
    }

    public static void b(ehoc ehocVar) {
        ejwl.l(((ehoc) ((Stack) a.get()).pop()) == ehocVar);
    }

    public static void c(ehoc ehocVar) {
        ((Stack) a.get()).push(ehocVar);
    }
}
