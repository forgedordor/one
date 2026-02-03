package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsiv extends dshd {
    @Override // defpackage.dshd
    public final void a(evip evipVar, etki etkiVar) {
        etmj etmjVar = (etmj) etmk.a.createBuilder();
        int i = evipVar.d;
        etmjVar.copyOnWrite();
        etmk etmkVar = (etmk) etmjVar.instance;
        etmkVar.b |= 1;
        etmkVar.c = i;
        int i2 = evipVar.e;
        etmjVar.copyOnWrite();
        etmk etmkVar2 = (etmk) etmjVar.instance;
        etmkVar2.b |= 2;
        etmkVar2.d = i2;
        etkiVar.copyOnWrite();
        etkj etkjVar = (etkj) etkiVar.instance;
        etmk etmkVar3 = (etmk) etmjVar.build();
        etkj etkjVar2 = etkj.a;
        etmkVar3.getClass();
        etkjVar.d = etmkVar3;
        etkjVar.c = 2;
    }
}
