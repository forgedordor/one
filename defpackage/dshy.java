package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshy implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evla evlaVar = (evla) obj;
        eton etonVar = (eton) etoo.a.createBuilder();
        if (evlaVar.b == 1 && evkz.a(1) == 2) {
            Object objApply = dsjz.b.apply((evir) evlaVar.c);
            etonVar.copyOnWrite();
            etoo etooVar = (etoo) etonVar.instance;
            objApply.getClass();
            etooVar.c = objApply;
            etooVar.b = 1;
        }
        if (evlaVar.b == 2 && evkz.a(2) == 3) {
            Object objApply2 = dsjz.a.apply((evlf) evlaVar.c);
            etonVar.copyOnWrite();
            etoo etooVar2 = (etoo) etonVar.instance;
            objApply2.getClass();
            etooVar2.c = objApply2;
            etooVar2.b = 4;
        }
        return (etoo) etonVar.build();
    }
}
