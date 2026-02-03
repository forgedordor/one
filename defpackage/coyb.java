package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyb implements eyde {
    private final eyde a;
    private final cqbm b;
    private final fcsu c;
    private final fcsu d;

    public coyb(cqbm cqbmVar, eyde eydeVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = cqbmVar;
        this.a = eydeVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    private final void c() {
        if (((aqts) this.c.b()).a() || ((aqtr) this.d.b()).a()) {
            if (((cqey) this.b.a()).u()) {
                throw new coiz("Transfer via satellite");
            }
        } else if (((cqey) this.b.a()).s()) {
            throw new coiz("Transfer via satellite");
        }
    }

    @Override // defpackage.eyde
    public final eycv a(String str, eycb eycbVar, eydb eydbVar) {
        c();
        return this.a.a(str, eycbVar, eydbVar);
    }

    @Override // defpackage.eyde
    public final eycv b(String str, eyce eyceVar, eycb eycbVar, String str2, eydb eydbVar) {
        c();
        return this.a.b(str, eyceVar, eycbVar, str2, eydbVar);
    }
}
