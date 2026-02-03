package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzt implements azvn {
    private final /* synthetic */ azvz a = new azvz(azxv.a, azyf.a, azzp.a, azzu.b, null, azzu.a, 1, null, 144);

    @Override // defpackage.azvn
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.azvn
    public final void b(dqws dqwsVar) {
        this.a.b(null);
    }

    @Override // defpackage.azvn
    public final void c(ahzu ahzuVar) {
        this.a.c(ahzuVar);
    }

    @Override // defpackage.azvn
    public final void d(ahzu ahzuVar) {
        this.a.d(ahzuVar);
    }

    @Override // defpackage.azvn
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.azvn
    public final void g(int i, dqxe dqxeVar) {
        String[] strArr = bmkn.a;
        String[] strArr2 = bmkn.a;
        bmki bmkiVar = new bmki(strArr2);
        bmjt bmjtVar = bmkn.c;
        bmju bmjuVar = bmjtVar.c;
        bmkiVar.c(bmjuVar, bmjtVar.a);
        bmkiVar.d(new Function() { // from class: azzq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.j.a);
                bmkmVar.c(0L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr3 = azfi.a;
        azff azffVar = new azff(azfi.a);
        azffVar.v();
        bmki bmkiVar2 = new bmki(strArr2);
        bmkiVar2.v();
        bmkiVar2.d(new Function() { // from class: azzr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.b.a);
                bmkmVar.e(2, 3, 1);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bmkh bmkhVarB = bmkiVar2.b();
        azeq azeqVar = azfi.c;
        azer azerVar = azeqVar.a;
        dqtr dqtrVarI = dqts.i(bmkhVarB, bmjuVar, azerVar);
        ((dqos) dqtrVarI).e = "message_id_map";
        azff azffVar2 = (azff) azffVar.j(dqtrVarI);
        bmki bmkiVar3 = new bmki(strArr2);
        bmkiVar3.v();
        bmkiVar3.d(new Function() { // from class: azzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.b.a);
                bmkmVar.e(2, 3, 1);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI2 = dqts.i(bmkiVar3.b(), bmjuVar, azeqVar.b);
        ((dqos) dqtrVarI2).e = "replied_to_message_id_map";
        dqtr dqtrVarI3 = dqts.i(((azff) azffVar2.j(dqtrVarI2)).b(), azerVar, bmjuVar);
        ((dqos) dqtrVarI3).e = "message_replies_map";
        bmki bmkiVar4 = (bmki) bmkiVar.j(dqtrVarI3);
        bmkiVar4.n(new dqxl("$V{J:message_id_map}", new Object[]{bmjtVar.d}), "bugle_id");
        azvg.a(bmkiVar4, azvt.j, 1L, 5);
    }

    @Override // defpackage.azvn
    public final void e(ahzu ahzuVar) {
    }
}
