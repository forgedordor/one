package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durt {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        if (j > 0) {
            return b.nextLong() % j == 0;
        }
        if (j < 0) {
            g("Bad sample interval: %d", Long.valueOf(j));
        }
        return false;
    }

    public static void b(String str, Object obj) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 62, "LogUtil.java")).t(str, obj);
        ((ekrd) ekrgVar.e()).Q();
    }

    public static void c(String str, Object obj, Object obj2) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 69, "LogUtil.java")).D(str, obj, obj2);
        ((ekrd) ekrgVar.e()).Q();
    }

    public static void d(String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 76, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.e()).Q();
    }

    public static void e(Throwable th, String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ((ekrd) ekrgVar.e()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 83, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.e()).Q();
    }

    public static void f(String str) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 116, "LogUtil.java")).t("%s", str);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void g(String str, Object obj) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 123, "LogUtil.java")).t(str, obj);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void h(String str, Object obj, Object obj2) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 130, "LogUtil.java")).D(str, obj, obj2);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void i(String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 137, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void j(Throwable th, String str) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ((ekrd) ekrgVar.i()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 144, "LogUtil.java")).t("%s", str);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void k(Throwable th, String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ((ekrd) ekrgVar.i()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 151, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.i()).Q();
    }

    public static void l(String str, Object obj, Object obj2) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 42, "LogUtil.java")).D(str, obj, obj2);
        ((ekrd) ekrgVar.f()).Q();
    }

    public static void m(String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 49, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.f()).Q();
    }

    public static void n(String str, Object obj) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 164, "LogUtil.java")).t(str, obj);
        ((ekrd) ekrgVar.j()).Q();
    }

    public static void o(String str, Object obj, Object obj2) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 171, "LogUtil.java")).D(str, obj, obj2);
        ((ekrd) ekrgVar.j()).Q();
    }

    public static void p(String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ekrgVar.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 178, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.j()).Q();
    }

    public static void q(Throwable th, String str, Object... objArr) {
        ekrg ekrgVar = durs.a;
        ((ekrd) ((ekrd) ((ekrd) ekrgVar.j()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 186, "LogUtil.java")).P(str, objArr);
        ((ekrd) ekrgVar.j()).Q();
    }
}
