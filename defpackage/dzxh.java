package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxh implements dzxk {
    @Override // defpackage.dzxk
    public final /* synthetic */ String a(evug evugVar) {
        return ((feix) ((feiw) evugVar).instance).e;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ String b(evug evugVar) {
        return ((feix) ((feiw) evugVar).instance).d;
    }

    @Override // defpackage.dzxk
    public final /* bridge */ /* synthetic */ void c(evug evugVar, Long l) {
        feiw feiwVar = (feiw) evugVar;
        if (l == null) {
            feiwVar.copyOnWrite();
            feix feixVar = (feix) feiwVar.instance;
            feix feixVar2 = feix.a;
            feixVar.b &= -2;
            feixVar.c = 0L;
            return;
        }
        long jLongValue = l.longValue();
        feiwVar.copyOnWrite();
        feix feixVar3 = (feix) feiwVar.instance;
        feix feixVar4 = feix.a;
        feixVar3.b |= 1;
        feixVar3.c = jLongValue;
    }

    @Override // defpackage.dzxk
    public final /* synthetic */ void d(evug evugVar) {
        feiw feiwVar = (feiw) evugVar;
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feix feixVar2 = feix.a;
        feixVar.b &= -3;
        feixVar.d = feix.a.d;
    }
}
