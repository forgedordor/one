package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzh implements azvn {
    private final /* synthetic */ azvz a = new azvz(azxt.a, azyd.a, azze.a, azzi.b, null, azzi.a, 1, null, 144);

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
        bmkiVar.d(new Function() { // from class: azzf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.k.a);
                bmkmVar.c(0L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        azcd azcdVarD = azxt.d();
        azcdVarD.v();
        bmki bmkiVar2 = new bmki(strArr2);
        bmkiVar2.v();
        bmkiVar2.d(new Function() { // from class: azzg
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
        azbs azbsVar = azcg.c.a;
        dqtr dqtrVarI = dqts.i(bmkhVarB, bmjuVar, azbsVar);
        ((dqos) dqtrVarI).e = "message_id_map";
        dqtr dqtrVarI2 = dqts.i(((azcd) azcdVarD.j(dqtrVarI)).b(), azbsVar, bmjuVar);
        ((dqos) dqtrVarI2).e = "message_captions_map";
        bmki bmkiVar3 = (bmki) bmkiVar.j(dqtrVarI2);
        bmkiVar3.n(new dqxl("$V{J:message_id_map}", new Object[]{bmjtVar.d}), "bugle_id");
        azvg.a(bmkiVar3, azvt.k, 1L, 5);
    }

    @Override // defpackage.azvn
    public final void e(ahzu ahzuVar) {
    }
}
