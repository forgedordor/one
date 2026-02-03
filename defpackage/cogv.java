package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogv {
    private static final ekgp a = ekgp.n(1L, cogu.SINGLE_COLOR_PALETTE, 2L, cogu.PASTEL_COLOR_PALETTE, 3L, cogu.OTHER_COLOR_PALETTE);
    private final fcsu b;

    public cogv(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    private final Long c() {
        return (Long) this.b.b();
    }

    public final cogu a() {
        return (cogu) a.getOrDefault(c(), cogu.CONTROL);
    }

    public final boolean b() {
        return a.containsKey(c());
    }
}
