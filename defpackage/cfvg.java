package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvg implements cfvh {
    private final cfvo a;
    private final cfvj b;
    private final String c = "Replaying";

    public cfvg(cfvo cfvoVar, cfvj cfvjVar) {
        this.a = cfvoVar;
        this.b = cfvjVar;
    }

    @Override // defpackage.cfvh
    public final Object a(fcxy fcxyVar) {
        cfvn cfvnVar = (cfvn) this.b.c.get();
        if (cfvnVar == null) {
            throw new IllegalArgumentException("No persistent channel controller request found.");
        }
        this.a.b(cfvnVar);
        return fctx.a;
    }

    @Override // defpackage.cfvh
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cfvh
    public final /* synthetic */ Object c() {
        return fctx.a;
    }
}
