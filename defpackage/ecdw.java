package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecdw {
    private static final ecaq a = new ecaq("debug.properties.can_override");
    private final String b;
    private final String c;

    public ecdw(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        if (!ecat.a(a)) {
            return this.c;
        }
        String str = this.b;
        String strA = ecek.a(str, this.c);
        if (strA == null || strA.length() != 91) {
            return strA;
        }
        StringBuilder sb = new StringBuilder(strA);
        int i = 2;
        while (true) {
            String strA2 = ecek.a(str + i, "");
            sb.append(strA2);
            if (strA2.length() != 91) {
                return sb.toString();
            }
            i++;
        }
    }
}
