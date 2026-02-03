package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpe extends fcyz implements fdat {
    final /* synthetic */ awpo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpe(awpo awpoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = awpoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("MyIdentitiesListener#getAllRcsGroupIds");
        botbVarE.s();
        botbVarE.f(new Function() { // from class: awpc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bopp boppVar = (bopp) obj2;
                return new bopq[]{boppVar.C, boppVar.aa};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final awpo awpoVar = this.a;
        botbVarE.i(new Function() { // from class: awpd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.j(2);
                final awpo awpoVar2 = awpoVar;
                botlVar.b(new Function() { // from class: awpa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        botl botlVar2 = (botl) obj3;
                        Optional optionalB = basb.b(-1L);
                        int iIntValue = botm.g().intValue();
                        if (iIntValue < 58910) {
                            dqru.x("rcs_group_last_sync_timestamp", iIntValue);
                        }
                        botlVar2.ap(new dqpj("conversations.rcs_group_last_sync_timestamp", 1, Long.valueOf(basb.a(optionalB))));
                        return botlVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: awpb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        botl botlVar2 = (botl) obj3;
                        awpo awpoVar3 = awpoVar2;
                        Instant instantF = awpoVar3.e.f();
                        Object objB = awpoVar3.f.b();
                        objB.getClass();
                        Optional optionalOf = Optional.of(instantF.minus(evxd.c((evrj) objB)));
                        int iIntValue = botm.g().intValue();
                        if (iIntValue < 58910) {
                            dqru.x("rcs_group_last_sync_timestamp", iIntValue);
                        }
                        botlVar2.ap(new dqpj("conversations.rcs_group_last_sync_timestamp", 7, Long.valueOf(basb.a(optionalOf))));
                        return botlVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return botbVarE.b().z();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awpe(this.a, fcxyVar);
    }
}
