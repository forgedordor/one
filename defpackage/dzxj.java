package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxj implements dzxk {
    @Override // defpackage.dzxk
    public final /* synthetic */ String a(evug evugVar) {
        return ((fefr) ((fefp) evugVar).instance).c;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ String b(evug evugVar) {
        return ((fefr) ((fefp) evugVar).instance).e;
    }

    @Override // defpackage.dzxk
    public final /* bridge */ /* synthetic */ void c(evug evugVar, Long l) {
        fefp fefpVar = (fefp) evugVar;
        if (l == null) {
            fefpVar.copyOnWrite();
            fefr fefrVar = (fefr) fefpVar.instance;
            fefr fefrVar2 = fefr.a;
            fefrVar.b &= -3;
            fefrVar.d = 0L;
            return;
        }
        long jLongValue = l.longValue();
        fefpVar.copyOnWrite();
        fefr fefrVar3 = (fefr) fefpVar.instance;
        fefr fefrVar4 = fefr.a;
        fefrVar3.b |= 2;
        fefrVar3.d = jLongValue;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ void d(evug evugVar) {
        fefp fefpVar = (fefp) evugVar;
        fefpVar.copyOnWrite();
        fefr fefrVar = (fefr) fefpVar.instance;
        fefr fefrVar2 = fefr.a;
        fefrVar.b &= -5;
        fefrVar.e = fefr.a.e;
    }
}
