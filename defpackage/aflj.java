package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aflj extends fcyz implements fdat {
    final /* synthetic */ afln a;
    final /* synthetic */ ajlt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflj(fcxy fcxyVar, afln aflnVar, ajlt ajltVar) {
        super(2, fcxyVar);
        this.a = aflnVar;
        this.b = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aflj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("MessageDetailsScreenUiAdapter#createUiDataFlow");
        try {
            afln aflnVar = this.a;
            ajlt ajltVar = this.b;
            aflnVar.g.a();
            Optional optional = aflnVar.f.a;
            final fdap fdapVar = new fdap() { // from class: aflg
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return ((cwec) obj2).a(new cwdf(5));
                }
            };
            Object objOrElse = optional.map(new Function() { // from class: aflh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(fdvf.a(null));
            objOrElse.getClass();
            yko ykoVar = new yko(aflnVar.h.a(ajltVar, null, null), false, null, null, null, false, false, false, false, false, null, false, false, false, false, true, false, false, 1211836);
            aflt afltVar = aflnVar.b;
            auyk.a(new aflr(((vjn) afltVar.b.b()).b, afltVar), "TopbarUiData");
            new afll(null);
            auyk.a(aflnVar.c.a(aflnVar.d, ykoVar), "MessageBubbleUiData");
            new aflm(null);
            if (ajltVar.d() instanceof ajmq) {
                ajmc ajmcVarD = ajltVar.d();
                ajmcVarD.getClass();
                throw null;
            }
            ajmc ajmcVarD2 = ajltVar.d();
            ajmcVarD2.getClass();
            throw null;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aflj afljVar = new aflj(fcxyVar, this.a, this.b);
        afljVar.c = obj;
        return afljVar;
    }
}
