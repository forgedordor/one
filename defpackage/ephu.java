package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephu implements ephv {
    private final ephi a;

    public ephu(ephi ephiVar) {
        this.a = ephiVar;
    }

    @Override // defpackage.ephv
    public final String a(ephf ephfVar, ephg ephgVar) {
        if (ephw.a(ephfVar.b()) == 10) {
            long jB = ephfVar.b();
            ephfVar.d(jB + (ephw.b(jB) * 90));
        }
        ephg ephgVar2 = ephg.E164;
        return ephgVar == ephgVar2 ? this.a.b(ephfVar, ephgVar2) : this.a.b(ephfVar, ephg.INTERNATIONAL);
    }
}
