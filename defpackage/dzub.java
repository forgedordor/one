package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzub {
    public final dzlv b;
    public dzua c;
    boolean d;
    private static final diep e = new dieu();
    public static final dzub a = new dzub();

    public dzub(dzlw dzlwVar) {
        this.c = dzua.UNKNOWN;
        this.d = false;
        this.b = new dzlv(dzlwVar);
    }

    public static boolean e(dzub dzubVar) {
        return dzubVar == null || dzubVar == a;
    }

    final long a() {
        dzlv dzlvVar = this.b;
        return ((dzky) dzlvVar.b).a - ((dzky) dzlvVar.a).a;
    }

    final long b() {
        dzlv dzlvVar = this.b;
        return ((dzky) dzlvVar.b).b - ((dzky) dzlvVar.a).b;
    }

    public final void c() {
        this.b.b = dzlw.d(e);
    }

    final void d(dzua dzuaVar) {
        if (dzuaVar == null) {
            dzuaVar = dzua.UNKNOWN;
        }
        this.c = dzuaVar;
    }

    public dzub() {
        this.c = dzua.UNKNOWN;
        this.d = false;
        this.b = new dzlv(e);
    }

    public dzub(long j, long j2, dzua dzuaVar) {
        this.c = dzua.UNKNOWN;
        this.d = false;
        if (j2 < j) {
            throw new IllegalArgumentException(ejxq.a("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
        }
        this.b = new dzlv(new dzky(j, j), new dzky(j2, j2));
        this.c = dzuaVar;
    }
}
