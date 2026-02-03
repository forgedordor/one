package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdcm {
    public static void a(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(a.q(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to "));
        fdbq.g(classCastException, fdcm.class.getName());
        throw classCastException;
    }

    public static boolean b(Object obj, int i) {
        if (obj instanceof fcsy) {
            if ((obj instanceof fdbm ? ((fdbm) obj).dS() : obj instanceof fdae ? 0 : obj instanceof fdap ? 1 : obj instanceof fdat ? 2 : obj instanceof fdau ? 3 : obj instanceof fdav ? 4 : obj instanceof fdaw ? 5 : obj instanceof fdax ? 6 : obj instanceof fday ? 7 : obj instanceof fdaz ? 8 : obj instanceof fdba ? 9 : obj instanceof fdaf ? 10 : obj instanceof fdag ? 11 : obj instanceof fdah ? 12 : obj instanceof fdai ? 13 : obj instanceof fdaj ? 14 : obj instanceof fdak ? 15 : obj instanceof fdal ? 16 : obj instanceof fdam ? 17 : obj instanceof fdan ? 18 : obj instanceof fdao ? 19 : obj instanceof fdaq ? 20 : obj instanceof fdar ? 21 : obj instanceof fdas ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof fdcn) || (obj instanceof fdcq);
        }
        return false;
    }

    public static boolean d(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof fdcn) || (obj instanceof fdcs);
        }
        return false;
    }

    public static void e(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return;
        }
        a(obj, a.g(i, "kotlin.jvm.functions.Function"));
    }

    public static void f(Object obj) {
        if (!(obj instanceof fdcn) || (obj instanceof fdco)) {
            return;
        }
        a(obj, "kotlin.collections.MutableCollection");
    }

    public static void g(Object obj) {
        if (!(obj instanceof fdcn) || (obj instanceof fdcr)) {
            return;
        }
        a(obj, "kotlin.collections.MutableMap");
    }
}
