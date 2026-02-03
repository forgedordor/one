package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edhi {
    public final exwf a;
    public final ejxm b;

    public edhi(exwf exwfVar, ejxm ejxmVar) {
        this.a = exwfVar;
        this.b = ejxmVar;
    }

    public final eure a() {
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = this.a.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        ejxm ejxmVar = this.b;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eureVar2.b |= 1;
        eureVar2.e = jA;
        return (eure) eurdVar.build();
    }

    public final eure b(int i) {
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = this.a.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        ejxm ejxmVar = this.b;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eureVar2.b |= 1;
        eureVar2.e = jA;
        eurdVar.copyOnWrite();
        eure eureVar3 = (eure) eurdVar.instance;
        eureVar3.b |= 4;
        eureVar3.g = i;
        return (eure) eurdVar.build();
    }

    public final eure c(Throwable th) {
        eurc eurcVar;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = this.a.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        ejxm ejxmVar = this.b;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eureVar2.b |= 1;
        eureVar2.e = jA;
        eurc eurcVar2 = edgo.a;
        if (th instanceof dbmi) {
            eurb eurbVar = (eurb) eurc.a.createBuilder();
            eurbVar.copyOnWrite();
            eurc eurcVar3 = (eurc) eurbVar.instance;
            eurcVar3.c = 16;
            eurcVar3.b |= 1;
            int i = true != edgi.b(th) ? 7 : 6;
            eurbVar.copyOnWrite();
            eurc eurcVar4 = (eurc) eurbVar.instance;
            eurcVar4.d = i - 1;
            eurcVar4.b |= 2;
            eurcVar = (eurc) eurbVar.build();
        } else if (th instanceof fbtf) {
            int iB = evbn.b(((fbtf) th).a.getCode().value());
            if (iB != 0) {
                eurb eurbVar2 = (eurb) eurc.a.createBuilder();
                eurbVar2.copyOnWrite();
                eurc eurcVar5 = (eurc) eurbVar2.instance;
                eurcVar5.c = iB - 1;
                eurcVar5.b |= 1;
                eurcVar = (eurc) eurbVar2.build();
            } else {
                eurcVar = edgo.a;
            }
        } else if (th instanceof IOException) {
            eurb eurbVar3 = (eurb) eurc.a.createBuilder();
            eurbVar3.copyOnWrite();
            eurc eurcVar6 = (eurc) eurbVar3.instance;
            eurcVar6.c = 14;
            eurcVar6.b |= 1;
            eurcVar = (eurc) eurbVar3.build();
        } else {
            eurcVar = edgo.a;
        }
        eurdVar.copyOnWrite();
        eure eureVar3 = (eure) eurdVar.instance;
        eurcVar.getClass();
        eureVar3.f = eurcVar;
        eureVar3.b |= 2;
        return (eure) eurdVar.build();
    }

    public final void d() {
        this.b.f();
    }

    public final eure e(int i, Throwable th) {
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurr eurrVar = (eurr) eurs.a.createBuilder();
        eurrVar.copyOnWrite();
        eurs eursVar = (eurs) eurrVar.instance;
        eursVar.c = this.a.R;
        eursVar.b |= 1;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eurs eursVar2 = (eurs) eurrVar.build();
        eursVar2.getClass();
        eureVar.d = eursVar2;
        eureVar.c = 2;
        ejxm ejxmVar = this.b;
        ejxmVar.g();
        long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar2 = (eure) eurdVar.instance;
        eureVar2.b |= 1;
        eureVar2.e = jA;
        eurb eurbVar = (eurb) eurc.a.createBuilder();
        eurbVar.copyOnWrite();
        eurc eurcVar = (eurc) eurbVar.instance;
        eurcVar.c = i - 1;
        eurcVar.b |= 1;
        String name = th.getCause() != null ? th.getCause().getClass().getName() : th.getClass().getName();
        eurbVar.copyOnWrite();
        eurc eurcVar2 = (eurc) eurbVar.instance;
        name.getClass();
        eurcVar2.b |= 8;
        eurcVar2.f = name;
        eurdVar.copyOnWrite();
        eure eureVar3 = (eure) eurdVar.instance;
        eurc eurcVar3 = (eurc) eurbVar.build();
        eurcVar3.getClass();
        eureVar3.f = eurcVar3;
        eureVar3.b |= 2;
        return (eure) eurdVar.build();
    }
}
