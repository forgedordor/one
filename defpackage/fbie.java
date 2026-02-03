package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbie implements fbib {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;
    public static final eaci d;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.e("45408304", false, "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.c("45692046", 1L, "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.f("40", new eabn() { // from class: fbic
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (dzpv) evsn.parseFrom(dzpv.a, (byte[]) obj);
            }
        }, "Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", "com.google.android.libraries.performance.primes", eadcVar);
        d = eacj.f("13", new eabn() { // from class: fbid
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (fehf) evsn.parseFrom(fehf.a, (byte[]) obj);
            }
        }, "EAAYAg", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbib
    public final long a(Context context) {
        return ((Long) b.gX(context)).longValue();
    }

    @Override // defpackage.fbib
    public final dzpv b(Context context) {
        return (dzpv) c.gX(context);
    }

    @Override // defpackage.fbib
    public final fehf c(Context context) {
        return (fehf) d.gX(context);
    }

    @Override // defpackage.fbib
    public final boolean d(Context context) {
        return ((Boolean) a.gX(context)).booleanValue();
    }
}
