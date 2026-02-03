package defpackage;

import j$.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybt {
    public static final /* synthetic */ int a = 0;

    static {
        Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingInt(new ToIntFunction() { // from class: eybq
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eyaz) obj).b;
            }
        }), new ToIntFunction() { // from class: eybr
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eyaz) obj).c;
            }
        }), new ToIntFunction() { // from class: eybs
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eyaz) obj).d;
            }
        });
    }

    public static boolean a(int i, int i2, boolean z) {
        boolean z2 = false;
        if (i2 > 0 && i2 <= 12) {
            z2 = true;
        }
        ejwl.d(z2, "invalid month %s", i2);
        return d(i, i2 == 2 ? z ? 29 : 28 : ((5546 >> i2) & 1) + 30);
    }

    public static boolean b(int i) {
        return d(i, 12);
    }

    public static boolean c(int i) {
        return d(i, 9999);
    }

    private static boolean d(int i, int i2) {
        return i > 0 && i <= i2;
    }
}
