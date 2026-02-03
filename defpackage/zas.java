package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zas {
    private final fcsu a;

    public zas(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final boolean a() {
        Long l = (Long) this.a.b();
        if (l != null && l.longValue() == 1) {
            return true;
        }
        return l != null && l.longValue() == 2;
    }
}
