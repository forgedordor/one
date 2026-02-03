package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonk {
    static final String a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String strConcat = String.valueOf(eonk.class.getName()).concat("$UnsafeComparator");
        a = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = eonj.a;
        }
        b = comparator;
    }

    eonk() {
    }
}
