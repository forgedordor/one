package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkw implements anpj {
    public final fdjx a;
    public final bbmo b;
    public final Optional c;
    public final cgrz d;
    public final cgry e;
    public final BugleConversationId f;
    public cquc g;
    public final cqtq h;
    private final fdjx j;
    private final cqtp k;
    private final fctc l = fctd.a(new fdae() { // from class: amkm
        @Override // defpackage.fdae
        public final Object invoke() {
            bqch bqchVarA = bqcn.a();
            bqchVarA.A("createNudgeClassificationsQuery");
            final amkw amkwVar = this.a;
            bqchVarA.c(new Function() { // from class: amkk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqcm bqcmVar = (bqcm) obj;
                    brdr brdrVarE = amkw.e(amkwVar.f.a);
                    brdrVarE.f(new Function() { // from class: amko
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((bran) obj2).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bqcmVar.ap(new dqpk("message_classifications_table.message_id", 3, brdrVarE.b()));
                    return bqcmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqchVarA.c(new Function() { // from class: amkl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqcm bqcmVar = (bqcm) obj;
                    bqcmVar.b(ezah.NUDGE_CLASSIFICATION);
                    return bqcmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return bqchVarA.b();
        }
    });
    public final fctc i = fctd.a(new fdae() { // from class: amkn
        @Override // defpackage.fdae
        public final Object invoke() {
            return amkw.e(this.a.f.a).b();
        }
    });

    public amkw(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, Optional optional, cgrz cgrzVar, cgry cgryVar, BugleConversationId bugleConversationId) {
        this.a = fdjxVar;
        this.j = fdjxVar2;
        this.k = cqtpVar;
        this.b = bbmoVar;
        this.c = optional;
        this.d = cgrzVar;
        this.e = cgryVar;
        this.f = bugleConversationId;
        this.h = cqtpVar.a(new amkt(this));
    }

    public static final brdr e(final ConversationIdType conversationIdType) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.b(new Function() { // from class: amkp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.ak();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: amkq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                brecVar2.af();
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brec brecVar2 = new brec();
        brecVar2.am(avbn.d);
        brec brecVar3 = new brec();
        brecVar3.A(false);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("createLatestSuggestableMessageQuery");
        brdrVarD.h(new Function() { // from class: amkr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar4 = (brec) obj;
                brecVar4.m(conversationIdType);
                return brecVar4;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.g(brecVar);
        brdrVarD.g(brecVar2);
        brdrVarD.g(brecVar3);
        brdrVarD.d(new brdo(MessagesTable.c.i, false));
        brdrVarD.y(1);
        return brdrVarD;
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.h.a(new cqtk() { // from class: amki
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "ClassificationObservableSupplier::register", "ClassificationObservableSupplier::callback", "ClassificationObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new amks(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final bqcg d() {
        return (bqcg) this.l.a();
    }
}
