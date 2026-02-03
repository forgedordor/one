package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephx implements ephv {
    final ephi a;

    public ephx(ephi ephiVar) {
        this.a = ephiVar;
    }

    @Override // defpackage.ephv
    public final String a(ephf ephfVar, ephg ephgVar) {
        if (ephfVar.a() == 52 && this.a.j(ephfVar)) {
            long jB = ephfVar.b();
            ephn ephnVar = (ephn) ephfVar;
            if (ephw.a(jB) + ephnVar.a.g > 10 && jB > 0 && ((int) (jB / ephw.b(jB))) == 1 && (ephnVar.a.b & 128) == 0) {
                ephfVar.d(jB % ephw.b(jB));
            }
        }
        String strB = this.a.b(ephfVar, ephgVar);
        return (!ejwk.c(strB) && ephgVar == ephg.NATIONAL && strB.startsWith("01 ")) ? strB.replaceFirst("01 ", "") : strB;
    }
}
