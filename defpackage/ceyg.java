package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyg implements cexq {
    public final eosc a;
    public final anty b;
    public final ajvr c;
    private final eosc d;
    private final fcsu e;
    private final aofc f;

    public ceyg(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, aofc aofcVar, anty antyVar, ajvr ajvrVar) {
        this.a = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.f = aofcVar;
        this.b = antyVar;
        this.c = ajvrVar;
    }

    private final eiju h(ConversationId conversationId) {
        conversationId.getClass();
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return eijx.g(new Callable() { // from class: ceye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c.L(bugleConversationId, true);
            }
        }, this.d).i(new eooz() { // from class: ceyf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((BugleConversation) obj).g().b();
            }
        }, this.a);
    }

    @Override // defpackage.cexq
    public final eiju a(final ConversationId conversationId) {
        eiju eijuVarH = h(conversationId);
        ejvr ejvrVar = new ejvr() { // from class: cexu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (ekhx) Collection.EL.stream((ekgb) obj).map(new Function() { // from class: cexr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aoer) obj2).o();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cexx
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((Optional) obj2).isPresent();
                    }
                }).map(new Function() { // from class: cexy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (alqm) ((Optional) obj2).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
            }
        };
        eosc eoscVar = this.a;
        return eijuVarH.h(ejvrVar, eoscVar).i(new eooz() { // from class: cexw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ceyg ceygVar = this.a;
                anty antyVar = ceygVar.b;
                ConversationId conversationId2 = conversationId;
                ekhx ekhxVar = (ekhx) obj;
                final eiju eijuVarE = ceygVar.e(antyVar.e(conversationId2).b(), ekhxVar);
                final eiju eijuVarE2 = ceygVar.e(antyVar.d(conversationId2).b(), ekhxVar);
                return eijx.m(eijuVarE, eijuVarE2).a(eiid.l(new Callable() { // from class: ceyd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekgb ekgbVar = (ekgb) eork.q(eijuVarE);
                        ceyg ceygVar2 = ceygVar;
                        ekgb ekgbVarF = ceygVar2.f(ekgbVar);
                        final ekhx ekhxVar2 = (ekhx) Collection.EL.stream(ekgbVarF).map(new Function() { // from class: cexv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                epcm epcmVar = ((epcj) obj2).c;
                                if (epcmVar == null) {
                                    epcmVar = epcm.a;
                                }
                                return epcmVar.d;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(ekcv.b);
                        Stream streamFilter = Collection.EL.stream(ceygVar2.f((ekgb) eork.q(eijuVarE2))).filter(new Predicate() { // from class: cext
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo538negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                epcm epcmVar = ((epcj) obj2).c;
                                if (epcmVar == null) {
                                    epcmVar = epcm.a;
                                }
                                return !ekhxVar2.contains(epcmVar.d);
                            }
                        });
                        int i = ekgb.d;
                        ekgb ekgbVar2 = (ekgb) streamFilter.collect(ekcv.a);
                        ekfw ekfwVar = new ekfw();
                        ekfwVar.j(ekgbVarF);
                        ekfwVar.j(ekgbVar2);
                        return ekfwVar.g();
                    }
                }), ceygVar.a);
            }
        }, eoscVar);
    }

    @Override // defpackage.cexq
    public final eiju b(ConversationIdType conversationIdType) {
        return conversationIdType.b() ? d() : c(new BugleConversationId(conversationIdType));
    }

    @Override // defpackage.cexq
    public final eiju c(ConversationId conversationId) {
        return h(conversationId).h(new cexz(this), this.a);
    }

    @Override // defpackage.cexq
    public final eiju d() {
        return this.f.d().b().h(new cexz(this), this.a);
    }

    public final eiju e(eiju eijuVar, final ekhx ekhxVar) {
        return eijuVar.h(new ejvr() { // from class: ceyc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream((ekgb) obj);
                final ekhx ekhxVar2 = ekhxVar;
                Stream streamFilter = stream.filter(new Predicate() { // from class: ceya
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return !ekhxVar2.contains(((ResolvedRecipient) obj2).g());
                    }
                });
                int i = ekgb.d;
                return (ekgb) streamFilter.collect(ekcv.a);
            }
        }, this.a);
    }

    public final ekgb f(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: ceyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                epci epciVarG = this.a.g(resolvedRecipient.F().a, resolvedRecipient.g().l(), resolvedRecipient.g().F().a, resolvedRecipient.w());
                epciVarG.copyOnWrite();
                epcj epcjVar = (epcj) epciVarG.instance;
                epcj epcjVar2 = epcj.a;
                epcjVar.g = false;
                epeq epeqVar = (epeq) epes.a.createBuilder();
                epeqVar.copyOnWrite();
                ((epes) epeqVar.instance).b = eper.a(3);
                epes epesVar = (epes) epeqVar.build();
                epciVarG.copyOnWrite();
                epcj epcjVar3 = (epcj) epciVarG.instance;
                epesVar.getClass();
                epcjVar3.h = epesVar;
                epcjVar3.b |= 4;
                return (epcj) epciVarG.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final epci g(String str, String str2, String str3, String str4) {
        epck epckVar = (epck) epcm.a.createBuilder();
        epckVar.copyOnWrite();
        epcm epcmVar = (epcm) epckVar.instance;
        str.getClass();
        epcmVar.d = str;
        epckVar.copyOnWrite();
        ((epcm) epckVar.instance).b = epcl.a(3);
        if (str2 != null) {
            epckVar.copyOnWrite();
            ((epcm) epckVar.instance).c = str2;
        }
        epci epciVar = (epci) epcj.a.createBuilder();
        epcm epcmVar2 = (epcm) epckVar.build();
        epciVar.copyOnWrite();
        epcj epcjVar = (epcj) epciVar.instance;
        epcmVar2.getClass();
        epcjVar.c = epcmVar2;
        epcjVar.b |= 1;
        String strB = cexp.b(((crlw) this.e.b()).d(cpbs.a(str2)));
        epciVar.copyOnWrite();
        epcj epcjVar2 = (epcj) epciVar.instance;
        strB.getClass();
        epcjVar2.f = strB;
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).n = epcb.a(2);
        String strB2 = ejwk.b(str3);
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).o = strB2;
        String strB3 = ejwk.b(str4);
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).e = strB3;
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).i = true;
        return epciVar;
    }
}
