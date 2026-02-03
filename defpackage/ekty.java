package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekty {
    private static String a = "ekug";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "ekuz";
    private static final String[] d = {"ekug", "com.google.common.flogger.backend.google.GooglePlatform", "ekuz"};

    public static int a() {
        return ekwt.a().a;
    }

    public static long b() {
        return ektw.a.c();
    }

    public static ekta d(String str) {
        return ektw.a.e(str);
    }

    public static ekte f() {
        return i().b();
    }

    public static ektx g() {
        return ektw.a.h();
    }

    public static ekvf i() {
        return ektw.a.j();
    }

    public static ekwe k() {
        return i().d();
    }

    public static String l() {
        return ektw.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().e(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract ekta e(String str);

    protected abstract ektx h();

    protected ekvf j() {
        return ekvp.a;
    }

    protected abstract String m();
}
