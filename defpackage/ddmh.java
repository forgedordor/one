package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddmh {
    public static String a(String str) {
        Object objB;
        try {
            objB = ddnb.b("get", new ddna(String.class, str), new ddna(String.class, ""));
        } catch (ReflectiveOperationException unused) {
        }
        return objB == null ? "" : (String) objB;
    }

    public static int b() {
        try {
            Object objB = ddnb.b("getInt", new ddna(String.class, "ro.boot.flash.locked"), new ddmz(Integer.TYPE, -1));
            if (objB == null) {
                return -1;
            }
            return ((Integer) objB).intValue();
        } catch (ReflectiveOperationException unused) {
            return -1;
        }
    }
}
