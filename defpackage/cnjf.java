package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnjf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnjg b;
    final /* synthetic */ alqm c;
    final /* synthetic */ ezli d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnjf(cnjg cnjgVar, alqm alqmVar, ezli ezliVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnjgVar;
        this.c = alqmVar;
        this.d = ezliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnjf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final cnjg cnjgVar = this.b;
            alqm alqmVar = this.c;
            this.a = 1;
            Optional optionalE = alqmVar.e();
            final fdap fdapVar = new fdap() { // from class: cnjb
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    aubq aubqVar = (aubq) obj2;
                    cozg cozgVar = (cozg) cnjgVar.b.b();
                    aubqVar.getClass();
                    return cozgVar.c(aubqVar);
                }
            };
            Optional map = optionalE.map(new Function() { // from class: cnjc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    eksp ekspVar = cnjg.a;
                    return fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final fdap fdapVar2 = new fdap() { // from class: cnjd
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    coze cozeVar = (coze) obj2;
                    eksp ekspVar = cnjg.a;
                    return Boolean.valueOf(cozeVar == coze.c);
                }
            };
            obj = map.map(new Function() { // from class: cnje
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    eksp ekspVar = cnjg.a;
                    return fdapVar2.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((eksl) cnjg.a.h()).q("Advertising Tachygram capability.");
            ezli ezliVar = this.d;
            ezuu ezuuVar = ezuu.a;
            ezut ezutVar = (ezut) ezuuVar.createBuilder();
            ezutVar.getClass();
            DesugarCollections.unmodifiableList(((ezuu) ezutVar.instance).b).getClass();
            ezutVar.a(cefn.TACHYGRAM.h);
            evsn evsnVarBuild = ezutVar.build();
            evsnVarBuild.getClass();
            ezuu ezuuVar2 = (ezuu) evsnVarBuild;
            ezliVar.copyOnWrite();
            ezlj ezljVar = (ezlj) ezliVar.instance;
            ezlj ezljVar2 = ezlj.a;
            ezuu ezuuVar3 = ezljVar.l;
            if (ezuuVar3 == null || ezuuVar3 == ezuuVar) {
                ezljVar.l = ezuuVar2;
            } else {
                ezut ezutVar2 = (ezut) ezuuVar.createBuilder(ezuuVar3);
                ezutVar2.mergeFrom((ezut) ezuuVar2);
                ezljVar.l = (ezuu) ezutVar2.buildPartial();
            }
            ezljVar.b |= 8;
        }
        return this.d;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnjf(this.b, this.c, this.d, fcxyVar);
    }
}
