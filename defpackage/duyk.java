package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyk {
    public final Executor a;
    public final duyi b;

    public duyk(duyj duyjVar) {
        this.b = duyjVar.b;
        this.a = duyjVar.a;
    }

    public final ListenableFuture a(ejwi ejwiVar) {
        return eika.i(new eooy() { // from class: duyg
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                duyk duykVar = this.a;
                dvae dvaeVar = duykVar.b.a;
                dtpw dtpwVar = (dtpw) dtpy.a.createBuilder();
                String strA = cdvg.b.a();
                dtpwVar.copyOnWrite();
                dtpy dtpyVar = (dtpy) dtpwVar.instance;
                strA.getClass();
                dtpyVar.b |= 64;
                dtpyVar.f = strA;
                String strA2 = cdvg.a.a();
                dtpwVar.copyOnWrite();
                dtpy dtpyVar2 = (dtpy) dtpwVar.instance;
                strA2.getClass();
                dtpyVar2.b |= 32;
                dtpyVar2.e = strA2;
                String strA3 = cdvg.c.a();
                dtpwVar.copyOnWrite();
                dtpy dtpyVar3 = (dtpy) dtpwVar.instance;
                strA3.getClass();
                dtpyVar3.b |= 128;
                dtpyVar3.g = strA3;
                String str = cswl.a(((cdvf) dvaeVar).a).a;
                dtpwVar.copyOnWrite();
                dtpy dtpyVar4 = (dtpy) dtpwVar.instance;
                str.getClass();
                dtpyVar4.b |= 2;
                dtpyVar4.d = str;
                final ListenableFuture listenableFutureJ = eika.j(eijx.e((dtpy) dtpwVar.build()), new ejvr() { // from class: duyh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ekgb.r((dtpy) obj);
                    }
                }, eoqg.a);
                dvaq dvaqVarE = dvaq.e(listenableFutureJ);
                eooz eoozVar = new eooz() { // from class: duye
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((ekgb) obj).isEmpty() ? eork.i(dtpy.a) : eork.i(dtpy.a);
                    }
                };
                Executor executor = duykVar.a;
                return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: duyf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        dtpy dtpyVar5 = (dtpy) obj;
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        ekgb ekgbVar = (ekgb) eork.q(listenableFutureJ);
                        int size = ekgbVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dtpw dtpwVar2 = (dtpw) ((dtpy) ekgbVar.get(i2)).toBuilder();
                            dtpwVar2.mergeFrom((dtpw) dtpyVar5);
                            ekfwVar.h((dtpy) dtpwVar2.build());
                        }
                        return eork.i(ekfwVar.g());
                    }
                }, executor);
            }
        }, this.a);
    }
}
