package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggi implements dgfx {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public dggi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.dgfx
    public final /* bridge */ /* synthetic */ dgfw a(String str, int i) {
        dgge dggeVar = (dgge) this.a.b();
        dgfv dgfvVar = (dgfv) this.b.b();
        dgfvVar.getClass();
        return new dggh(dggeVar, dgfvVar, (dgrs) this.c.b(), str, i);
    }
}
