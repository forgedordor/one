package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshe implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evir evirVar = (evir) obj;
        etkk etkkVar = (etkk) etkl.a.createBuilder();
        if ((evirVar.b & 1) != 0) {
            int i = evirVar.c;
            etkkVar.copyOnWrite();
            etkl etklVar = (etkl) etkkVar.instance;
            etklVar.b |= 1;
            etklVar.c = i;
        }
        if ((evirVar.b & 2) != 0) {
            int i2 = evirVar.d;
            etkkVar.copyOnWrite();
            etkl etklVar2 = (etkl) etkkVar.instance;
            etklVar2.b |= 2;
            etklVar2.d = i2;
        }
        if ((evirVar.b & 4) != 0) {
            String str = evirVar.e;
            etkkVar.copyOnWrite();
            etkl etklVar3 = (etkl) etkkVar.instance;
            str.getClass();
            etklVar3.b |= 4;
            etklVar3.e = str;
        }
        return (etkl) etkkVar.build();
    }
}
