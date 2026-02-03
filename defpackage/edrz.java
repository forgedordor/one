package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edrz {
    public final edgv a;
    public final fcsu b;
    public ejwi c = ejud.a;

    public edrz(edgv edgvVar, fcsu fcsuVar) {
        this.a = edgvVar;
        this.b = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List list) {
        if (this.c.g()) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 12;
            euroVar.b |= 1;
            ejxm ejxmVar = (ejxm) this.c.c();
            ejxmVar.g();
            long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            ekqh it = ((ekgb) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eure eureVar = (eure) it.next();
                if ((eureVar.b & 2) != 0) {
                    eurc eurcVar = eureVar.f;
                    if (eurcVar == null) {
                        eurcVar = eurc.a;
                    }
                    eurnVar.copyOnWrite();
                    euro euroVar3 = (euro) eurnVar.instance;
                    eurcVar.getClass();
                    euroVar3.e = eurcVar;
                    euroVar3.b |= 4;
                }
            }
            edgv edgvVar = this.a;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurjVar.a(list);
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
            this.c = ejud.a;
        }
    }
}
