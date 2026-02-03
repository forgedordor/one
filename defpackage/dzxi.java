package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxi implements dzxk {
    @Override // defpackage.dzxk
    public final /* synthetic */ String a(evug evugVar) {
        return ((fecs) ((fecp) evugVar).instance).f;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ String b(evug evugVar) {
        return ((fecs) ((fecp) evugVar).instance).e;
    }

    @Override // defpackage.dzxk
    public final /* bridge */ /* synthetic */ void c(evug evugVar, Long l) {
        fecp fecpVar = (fecp) evugVar;
        if (l == null) {
            fecpVar.copyOnWrite();
            fecs fecsVar = (fecs) fecpVar.instance;
            fecs fecsVar2 = fecs.a;
            fecsVar.b &= -3;
            fecsVar.d = 0L;
            return;
        }
        long jLongValue = l.longValue();
        fecpVar.copyOnWrite();
        fecs fecsVar3 = (fecs) fecpVar.instance;
        fecs fecsVar4 = fecs.a;
        fecsVar3.b |= 2;
        fecsVar3.d = jLongValue;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ void d(evug evugVar) {
        fecp fecpVar = (fecp) evugVar;
        fecpVar.copyOnWrite();
        fecs fecsVar = (fecs) fecpVar.instance;
        fecs fecsVar2 = fecs.a;
        fecsVar.b &= -5;
        fecsVar.e = fecs.a.e;
    }
}
