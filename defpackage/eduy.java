package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eduy {
    private final edgv a;
    private final edgp b;
    private final edmz c;
    private ejwi d = ejud.a;

    public eduy(edgv edgvVar, edgp edgpVar, edmz edmzVar) {
        this.a = edgvVar;
        this.b = edgpVar;
        this.c = edmzVar;
    }

    public final void a() {
        if (!this.d.g()) {
            this.d = ejwi.j(this.b.a());
        }
        Object objC = this.d.c();
        edmz edmzVar = this.c;
        ejxm ejxmVar = ((edgq) objC).a;
        int i = edmzVar.c;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurx eurxVar = (eurx) eury.a.createBuilder();
        eurxVar.copyOnWrite();
        eury euryVar = (eury) eurxVar.instance;
        euryVar.c = 7;
        euryVar.b |= 1;
        eurxVar.copyOnWrite();
        eury euryVar2 = (eury) eurxVar.instance;
        euryVar2.d = 5;
        euryVar2.b |= 2;
        eurxVar.copyOnWrite();
        eury euryVar3 = (eury) eurxVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        euryVar3.e = i2;
        euryVar3.b |= 4;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eury euryVar4 = (eury) eurxVar.build();
        euryVar4.getClass();
        eureVar.d = euryVar4;
        eureVar.c = 1;
        eure eureVarA = new edgr(ejxmVar, eurdVar).a();
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        eurjVar.c(eureVarA);
        eurn eurnVar = (eurn) euro.a.createBuilder();
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        euroVar.c = 13;
        euroVar.b |= 1;
        long j = eureVarA.e;
        eurnVar.copyOnWrite();
        euro euroVar2 = (euro) eurnVar.instance;
        euroVar2.b |= 2;
        euroVar2.d = j;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar3 = (euro) eurnVar.build();
        euroVar3.getClass();
        eurkVar.d = euroVar3;
        eurkVar.b |= 1;
        eurk eurkVar2 = (eurk) eurjVar.build();
        edgv edgvVar = this.a;
        eupv eupvVar = (eupv) eupw.a.createBuilder();
        euqf euqfVar = (euqf) euqg.a.createBuilder();
        boolean z = edmzVar.a;
        euqfVar.copyOnWrite();
        euqg euqgVar = (euqg) euqfVar.instance;
        euqgVar.b |= 4;
        euqgVar.c = z;
        euqg euqgVar2 = (euqg) euqfVar.build();
        eupvVar.copyOnWrite();
        eupw eupwVar = (eupw) eupvVar.instance;
        euqgVar2.getClass();
        eupwVar.c = euqgVar2;
        eupwVar.b = 1;
        edgvVar.d(eurkVar2, (eupw) eupvVar.build());
    }

    public final void b() {
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 13;
        eurmVar.b |= 1;
        this.a.e((eurm) eurlVar.build());
        edgq edgqVarA = this.b.a();
        ejxm ejxmVar = edgqVarA.a;
        ejxmVar.e();
        ejxmVar.f();
        this.d = ejwi.j(edgqVarA);
    }
}
