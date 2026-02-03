package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evan extends euzl {
    public abstract euza a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    public abstract boolean e();

    public abstract void f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.euzl
    public final erxu g() {
        evas evasVar = (evas) evat.a.createBuilder();
        euzr euzrVar = (euzr) euzs.a.createBuilder();
        euzrVar.copyOnWrite();
        euzs euzsVar = (euzs) euzrVar.instance;
        euzsVar.b |= 2;
        euzsVar.d = false;
        euzrVar.mergeFrom((euzr) h(a()));
        euzs euzsVar2 = (euzs) euzrVar.build();
        evasVar.copyOnWrite();
        evat evatVar = (evat) evasVar.instance;
        euzsVar2.getClass();
        evatVar.d = euzsVar2;
        evatVar.c |= 1;
        String strD = d();
        evasVar.copyOnWrite();
        evat evatVar2 = (evat) evasVar.instance;
        evatVar2.c |= 2;
        evatVar2.e = strD;
        evau evauVar = (evau) evav.a.createBuilder();
        evasVar.copyOnWrite();
        evat evatVar3 = (evat) evasVar.instance;
        evav evavVar = (evav) evauVar.build();
        evavVar.getClass();
        evatVar3.f = evavVar;
        evatVar3.c |= 4;
        erxt erxtVar = (erxt) erxu.a.createBuilder();
        erxtVar.e(evat.b, (evat) evasVar.build());
        return (erxu) erxtVar.build();
    }

    public abstract void i();
}
