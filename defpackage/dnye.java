package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnye extends fdbo implements fdap {
    public dnye(Object obj) {
        super(1, obj, dnyn.class, "onStickerClicked", "onStickerClicked(Lcom/google/android/libraries/compose/emotify/data/CustomSticker;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnvg dnvgVar = (dnvg) obj;
        dnvgVar.getClass();
        dnyn dnynVar = (dnyn) this.g;
        ekrg ekrgVar = dnyn.a;
        Optional optional = dnynVar.al;
        if (optional == null) {
            fdbq.c("draftAttachmentsInteractionListener");
            optional = null;
        }
        dnhr dnhrVar = (dnhr) fdct.b(optional);
        fdil.d(dnynVar.bH(), null, null, new dnxy(dnynVar, dnvgVar, dnhrVar != null ? dnhrVar.l(dnvgVar.i, dohn.a(dnvgVar)) : null, null), 3);
        Optional optionalF = dnynVar.f();
        final fdap fdapVar = new fdap() { // from class: dnxp
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                abvh abvhVar = (abvh) obj2;
                ekrg ekrgVar2 = dnyn.a;
                abvhVar.getClass();
                abvhVar.b++;
                return fctx.a;
            }
        };
        optionalF.ifPresent(new Consumer() { // from class: dnxq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                ekrg ekrgVar2 = dnyn.a;
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }
}
