package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsc {
    private static final efte a = new efte("Validations");

    public static void a(String str, String str2, int i, int i2) {
        if (str == null) {
            a.d(String.format("Input of %s cannot be null", str2));
        } else if (str.length() > i2 || str.length() < i) {
            a.d(String.format("Length of \"%s\" should be in the range [%s-%s]", str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
