package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnpj extends fdbo implements fdap {
    public dnpj(Object obj) {
        super(1, obj, dnpz.class, "createSearchRenderer", "createSearchRenderer(Lcom/google/android/libraries/compose/emoji/search/EmojiSearch;)Lcom/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnnu dnnuVar = (dnnu) obj;
        dnnuVar.getClass();
        final dnpz dnpzVar = (dnpz) this.g;
        int i = dnpz.ar;
        dnsk dnskVar = dnpzVar.ai;
        if (dnskVar == null) {
            fdbq.c("emojiSearchRendererFactory");
            dnskVar = null;
        }
        return dnskVar.a(dnnuVar, (dnov) dnpzVar.bC(), new fdat() { // from class: dnow
            @Override // defpackage.fdat
            public final Object a(Object obj2, Object obj3) {
                dnpz dnpzVar2 = dnpzVar;
                Iterable iterable = (Iterable) obj2;
                String str = (String) obj3;
                dnqz dnqzVarQ = dnpzVar2.q();
                iterable.getClass();
                str.getClass();
                List list = dnqzVarQ.i;
                ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dnqs(((dnnt) it.next()).a, 0));
                }
                List listA = dndw.a(list, arrayList, 0, null, null, 60);
                dnqzVarQ.n = str;
                dnqzVarQ.L(arrayList);
                int i2 = dnqzVarQ.h;
                dndw.b(listA, i2 + i2, dnqzVarQ);
                dnpzVar2.bd(dnpzVar2.q());
                dnph dnphVar = dnpzVar2.aq;
                if (dnphVar == null) {
                    fdbq.c("views");
                    dnphVar = null;
                }
                dnphVar.a.aj(0);
                return fctx.a;
            }
        }, new fdae() { // from class: dnoy
            @Override // defpackage.fdae
            public final Object invoke() {
                dnpz dnpzVar2 = dnpzVar;
                if (dnpzVar2.ag != null) {
                    dnpzVar2.bd(dnpzVar2.p());
                }
                return fctx.a;
            }
        });
    }
}
