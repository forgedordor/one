package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceds {
    private final fcsu a;
    private final fcsu b;

    public ceds(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final int a() {
        fcsu fcsuVar = this.a;
        if (((Long) fcsuVar.b()).longValue() == -1) {
            return 3;
        }
        int iB = felo.b(((Long) fcsuVar.b()).intValue());
        if (iB != 0) {
            return iB;
        }
        return 3;
    }
}
