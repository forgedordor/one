package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwy {
    private static final fgyj a;

    static {
        fgwx fgwxVar = new fgwx();
        a = fgwxVar;
        fgwxVar.d(1, "IN");
        fgwxVar.d(3, "CH");
        fgwxVar.e(3, "CHAOS");
        fgwxVar.d(4, "HS");
        fgwxVar.e(4, "HESIOD");
        fgwxVar.d(254, "NONE");
        fgwxVar.d(255, "ANY");
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i < 0 || i > 65535) {
            throw new fgxt(i);
        }
    }
}
