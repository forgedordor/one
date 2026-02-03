package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnrl extends fdbo implements fdap {
    public dnrl(Object obj) {
        super(1, obj, dnro.class, "createSearchRenderer", "createSearchRenderer(Lcom/google/android/libraries/compose/emoji/search/EmojiSearch;)Lcom/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnnu dnnuVar = (dnnu) obj;
        dnnuVar.getClass();
        final dnro dnroVar = (dnro) this.g;
        int i = dnro.aj;
        dnsk dnskVar = dnroVar.c;
        if (dnskVar == null) {
            fdbq.c("emojiSearchRendererFactory");
            dnskVar = null;
        }
        return dnskVar.a(dnnuVar, (dnov) dnroVar.bC(), new fdat() { // from class: dnrh
            @Override // defpackage.fdat
            public final Object a(Object obj2, Object obj3) throws Exception {
                Iterable iterable = (Iterable) obj2;
                dnsa dnsaVarB = dnroVar.b();
                iterable.getClass();
                Object obj4 = dnsaVarB.n;
                if (!(obj4 instanceof drpl)) {
                    if (obj4 instanceof drqt) {
                        ((drqt) obj4).b();
                    }
                    drpl drplVar = new drpl(dnsaVarB.d, dnsaVarB.e, dnsaVarB.k, dnsaVarB.f.a, (drpq) dnsaVarB.l.a());
                    drplVar.h = 1.0f;
                    dnsaVarB.n = drplVar;
                    obj4 = drplVar;
                }
                drpl drplVar2 = (drpl) obj4;
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ekfwVar.h(drsy.a(((dnnt) it.next()).a.a().a().toString()));
                }
                eork.r(drplVar2.c.b(), new drpi(drplVar2, ekfwVar.g()), drlv.b);
                dnsaVarB.f.a.aj(0);
                dnsaVarB.a(false);
                return fctx.a;
            }
        }, new fdae() { // from class: dnri
            @Override // defpackage.fdae
            public final Object invoke() {
                dnroVar.b().c();
                return fctx.a;
            }
        });
    }
}
