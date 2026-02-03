package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cixd implements Function {
    public final /* synthetic */ cixk a;

    public /* synthetic */ cixd(cixk cixkVar) {
        this.a = cixkVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        final alqm alqmVar = (alqm) obj;
        final cixk cixkVar = this.a;
        eiju eijuVarG = eiju.g(cixkVar.d.b(eiid.c(new eooy() { // from class: ciwy
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                alqm alqmVar2 = alqmVar;
                alqmVar2.getClass();
                cixk cixkVar2 = cixkVar;
                Optional optionalE = alqmVar2.e();
                final axga axgaVar = cixkVar2.l;
                final fdap fdapVar = new fdap() { // from class: axfy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return axgaVar.a.d((aubq) obj2);
                    }
                };
                Object objOrElse = optionalE.map(new Function() { // from class: axfz
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
                }).orElse(eijx.e(aszo.NOT_RCS));
                objOrElse.getClass();
                return (eiju) objOrElse;
            }
        }), cixkVar.f));
        eooz eoozVar = new eooz() { // from class: cixa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                if (!((aszo) obj2).equals(aszo.NOT_RCS)) {
                    return eijx.e(0);
                }
                final alqm alqmVar2 = alqmVar;
                final cixk cixkVar2 = cixkVar;
                return eijx.g(new Callable() { // from class: ciwx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final cixk cixkVar3 = cixkVar2;
                        baqx baqxVar = (baqx) cixkVar3.h.b();
                        alqm alqmVar3 = alqmVar2;
                        final ConversationIdType conversationIdTypeA = baqxVar.a(alqmVar3.h());
                        if (conversationIdTypeA.b()) {
                            cqbd cqbdVarE = cixk.a.e();
                            cqbdVarE.I("Could not get conversation from recipient destination");
                            cqbdVarE.I(alqmVar3.toString());
                            cqbdVarE.r();
                            return 0;
                        }
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("updateStatusForMessagesInLimbo");
                        brdrVarD.h(new Function() { // from class: ciwp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                brec brecVar = (brec) obj3;
                                cqce cqceVar = cixk.a;
                                brecVar.m(conversationIdTypeA);
                                brecVar.J(3);
                                brecVar.ah(cixk.c);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Stream streamE = brdrVarD.b().E();
                        try {
                            Integer numValueOf = Integer.valueOf(streamE.mapToInt(new ToIntFunction() { // from class: ciwq
                                @Override // java.util.function.ToIntFunction
                                public final int applyAsInt(Object obj3) {
                                    ajrc ajrcVar = (ajrc) cixkVar3.n.b();
                                    ajqy ajqyVarP = ajrb.p();
                                    ajqyVarP.c(((MessagesTable.BindData) obj3).E());
                                    ajqyVarP.g(embo.RECIPIENT_LOST_RCS);
                                    ajqyVarP.h(17);
                                    return ajrcVar.c(ajqyVarP.a()) ? 1 : 0;
                                }
                            }).sum());
                            if (streamE == null) {
                                return numValueOf;
                            }
                            streamE.close();
                            return numValueOf;
                        } catch (Throwable th) {
                            if (streamE != null) {
                                try {
                                    streamE.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }, cixkVar2.f);
            }
        };
        eosc eoscVar = cixkVar.g;
        return eijuVarG.i(eoozVar, eoscVar).e(assm.class, new ejvr() { // from class: cixb
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqbd cqbdVarE = cixk.a.e();
                cqbdVarE.I("Cannot get recipient limbo message count because OnlineStatus query failed");
                cqbdVarE.s((assm) obj2);
                return 0;
            }
        }, eoscVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
