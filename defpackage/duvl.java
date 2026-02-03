package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvl {
    public final dtpi a;
    public final duvk b;

    public duvl(duvk duvkVar, dtpi dtpiVar) {
        this.b = duvkVar;
        this.a = dtpiVar;
    }

    public final void a(int i, String str, String str2, String str3) {
        long jK = this.a.k();
        if (durt.a(jK)) {
            eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
            eoiuVar.copyOnWrite();
            eoiv eoivVar = (eoiv) eoiuVar.instance;
            eoivVar.b |= 524288;
            eoivVar.f = jK;
            eojm eojmVar = (eojm) eojn.a.createBuilder();
            eojmVar.copyOnWrite();
            eojn eojnVar = (eojn) eojmVar.instance;
            eojnVar.c = eokq.a(i);
            eojnVar.b |= 1;
            eojmVar.copyOnWrite();
            eojn eojnVar2 = (eojn) eojmVar.instance;
            str.getClass();
            eojnVar2.b |= 2;
            eojnVar2.d = str;
            eojmVar.copyOnWrite();
            eojn eojnVar3 = (eojn) eojmVar.instance;
            str2.getClass();
            eojnVar3.b |= 4;
            eojnVar3.e = str2;
            eojmVar.copyOnWrite();
            eojn eojnVar4 = (eojn) eojmVar.instance;
            str3.getClass();
            eojnVar4.b |= 8;
            eojnVar4.f = str3;
            eoiuVar.copyOnWrite();
            eoiv eoivVar2 = (eoiv) eoiuVar.instance;
            eojn eojnVar5 = (eojn) eojmVar.build();
            eojnVar5.getClass();
            eoivVar2.q = eojnVar5;
            eoivVar2.d |= 2;
            this.b.a((eoiv) eoiuVar.build(), eokk.a(1074));
        }
    }
}
