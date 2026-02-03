package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshl implements ejvr {
    public abstract void a(evmo evmoVar, etod etodVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evmo evmoVar = (evmo) obj;
        etod etodVar = (etod) etoh.a.createBuilder();
        if (evmoVar.c == 6 && evml.a(6) == 7) {
            String str = (String) evmoVar.d;
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            str.getClass();
            etohVar.c = 1;
            etohVar.d = str;
        }
        if (evmoVar.c == 7 && evml.a(7) == 8) {
            String str2 = (String) evmoVar.d;
            etodVar.copyOnWrite();
            etoh etohVar2 = (etoh) etodVar.instance;
            str2.getClass();
            etohVar2.c = 8;
            etohVar2.d = str2;
        }
        if (evmoVar.c == 8 && evml.a(8) == 9) {
            Integer num = (Integer) evmoVar.d;
            num.intValue();
            etodVar.copyOnWrite();
            etoh etohVar3 = (etoh) etodVar.instance;
            etohVar3.c = 9;
            etohVar3.d = num;
        }
        b(evmoVar, etodVar);
        g(evmoVar, etodVar);
        if ((evmoVar.b & 1) != 0) {
            d(evmoVar, etodVar);
        }
        if ((evmoVar.b & 2) != 0) {
            c(evmoVar, etodVar);
        }
        e(evmoVar, etodVar);
        a(evmoVar, etodVar);
        f(evmoVar, etodVar);
        return (etoh) etodVar.build();
    }

    public abstract void b(evmo evmoVar, etod etodVar);

    public abstract void c(evmo evmoVar, etod etodVar);

    public abstract void d(evmo evmoVar, etod etodVar);

    public abstract void e(evmo evmoVar, etod etodVar);

    public abstract void f(evmo evmoVar, etod etodVar);

    public abstract void g(evmo evmoVar, etod etodVar);
}
