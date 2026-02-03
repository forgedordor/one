package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckot implements cknw {
    public static final eksp a = eksp.c("BugleReactions");
    public final fcsu b;
    public final MessageCoreData c;
    public final fctc d;
    public final boolean f;
    private final fcsu g;
    private final fdjx h;
    private final fcsu i;
    private final fctc j = fctd.a(new fdae() { // from class: ckoi
        @Override // defpackage.fdae
        public final Object invoke() {
            ckot ckotVar = this.a;
            boolean z = false;
            if (((arxn) ckotVar.b.b()).a() && ciuy.b(ckotVar.c.ac()).isPresent()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    private final fctc k = fctd.a(new fdae() { // from class: ckoj
        @Override // defpackage.fdae
        public final Object invoke() {
            ckot ckotVar = this.a;
            if (ckotVar.g()) {
                Optional optionalB = ciuy.b(ckotVar.c.ac());
                final fdap fdapVar = new fdap() { // from class: ckoa
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        eksp ekspVar = ckot.a;
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != -1237286534) {
                                if (iHashCode == 2036612408 && str.equals("-Custom-Reaction")) {
                                    return ckmc.REMOVE_REACTION;
                                }
                            } else if (str.equals("+Custom-Reaction")) {
                                return ckmc.ADD_REACTION;
                            }
                        }
                        return ckmc.REACTION_ACTION_UNSPECIFIED;
                    }
                };
                return (ckmc) optionalB.map(new Function() { // from class: ckob
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eksp ekspVar = ckot.a;
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(ckmc.REACTION_ACTION_UNSPECIFIED);
            }
            Optional optionalA = civb.a(ckotVar.c.ac(), civa.EMOTIFY_REACTIONS_NAMESPACE, "Message-Reply-Type");
            final fdap fdapVar2 = new fdap() { // from class: ckoc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    eksp ekspVar = ckot.a;
                    if (str != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1867304189) {
                            if (iHashCode == 45320930 && str.equals("message-reaction-remove")) {
                                return ckmc.REMOVE_REACTION;
                            }
                        } else if (str.equals("message-reaction-add")) {
                            return ckmc.ADD_REACTION;
                        }
                    }
                    return ckmc.REACTION_ACTION_UNSPECIFIED;
                }
            };
            return (ckmc) optionalA.map(new Function() { // from class: ckod
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    eksp ekspVar = ckot.a;
                    return fdapVar2.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(ckmc.REACTION_ACTION_UNSPECIFIED);
        }
    });
    private final fctc l = fctd.a(new fdae() { // from class: ckok
        @Override // defpackage.fdae
        public final Object invoke() {
            ckot ckotVar = this.a;
            Optional optionalA = ckotVar.g() ? ciuy.a(ckotVar.c.ac()) : civb.a(ckotVar.c.ac(), civa.EMOTIFY_REACTIONS_NAMESPACE, "In-Reply-To-Message-Id");
            final ckos ckosVar = ckos.a;
            Object objOrElse = optionalA.map(new Function() { // from class: ckoe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    eksp ekspVar = ckot.a;
                    return ckosVar.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(basd.a);
            objOrElse.getClass();
            final basd basdVar = (basd) objOrElse;
            if (!ckotVar.g() || ckotVar.d() != ckmc.REMOVE_REACTION || !basdVar.k()) {
                return basdVar;
            }
            basd basdVarI = null;
            try {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("EmotifyReactionsRcsReceiverImpl#reactedRcsMessageId");
                brao braoVar = MessagesTable.c.a;
                brdrVarD.w(braoVar);
                bqkg bqkgVarA = bqkl.a();
                bqkgVarA.v();
                brdr brdrVarD2 = MessagesTable.d();
                brdrVarD2.v();
                brdp brdpVarB = brdrVarD2.b();
                bqjp bqjpVar = bqkl.c;
                dqtr dqtrVarI = dqts.i(brdpVarB, braoVar, bqjpVar.b);
                ((dqos) dqtrVarI).e = "reaction_message";
                dqtr dqtrVarI2 = dqts.i(((bqkg) bqkgVarA.j(dqtrVarI)).b(), bqjpVar.d, braoVar);
                ((dqos) dqtrVarI2).e = "reacted_message";
                brdrVarD.E(dqtrVarI2.g());
                brdrVarD.h(new Function() { // from class: ckoq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        eksp ekspVar = ckot.a;
                        brecVar.ar(new dqxl("$V{J:reaction_message} = $V", new Object[]{MessagesTable.c.C, basdVar.b}));
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.f(new Function() { // from class: cknz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eksp ekspVar = ckot.a;
                        return ((bran) obj).C;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
                if (bindData != null) {
                    basdVarI = bindData.I();
                }
            } catch (IllegalStateException e) {
                eksl ekslVar = (eksl) ((eksl) ckot.a.j()).g(e);
                MessageCoreData messageCoreData = ckotVar.c;
                ekslVar.X(cqnc.s, messageCoreData.A());
                ekslVar.X(cqnc.p, messageCoreData.aB());
                ekslVar.X(ckmz.b, basdVar);
                ekslVar.X(ckmz.a, messageCoreData.C());
                ekslVar.X(ckmz.k, ckotVar.f());
                ekslVar.q("Unable to find reacted RCS message ID for reaction.");
            }
            return basdVarI == null ? basd.a : basdVarI;
        }
    });
    private final fctc m = fctd.a(new fdae() { // from class: ckol
        @Override // defpackage.fdae
        public final Object invoke() throws IOException {
            final ckot ckotVar = this.a;
            if (ckotVar.c().i()) {
                return bary.a;
            }
            ckotVar.c().getClass();
            MessageIdType messageIdTypeH = ckot.h("EmotifyReactionsRcsReceiverImpl#getReactedMessageId_original", new fdap() { // from class: ckog
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.getClass();
                    brecVar.F(ckotVar.c());
                    brecVar.A(false);
                    return brecVar;
                }
            });
            if (messageIdTypeH != null) {
                return messageIdTypeH;
            }
            ckotVar.c().getClass();
            MessageIdType messageIdTypeH2 = ckot.h("EmotifyReactionsRcsReceiverImpl#getReactedMessageId", new fdap() { // from class: ckoh
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.getClass();
                    brecVar.N(ckotVar.c());
                    brecVar.A(false);
                    return brecVar;
                }
            });
            return messageIdTypeH2 == null ? bary.a : messageIdTypeH2;
        }
    });
    private final fctc n = fctd.a(new fdae() { // from class: ckom
        @Override // defpackage.fdae
        public final Object invoke() {
            return (String) fdct.b(civb.a(this.a.c.ac(), civa.EMOTIFY_REACTIONS_NAMESPACE, "Reaction-Emotify-Id"));
        }
    });
    private final fctc o = fctd.a(new fdae() { // from class: ckon
        @Override // defpackage.fdae
        public final Object invoke() {
            ckot ckotVar = this.a;
            boolean z = false;
            if (ckotVar.g() && ckotVar.d() != ckmc.REACTION_ACTION_UNSPECIFIED) {
                z = true;
            }
            return (ckotVar.f() == null && z) ? UUID.randomUUID().toString() : ckotVar.f();
        }
    });
    public final fctc e = fctd.a(new fdae() { // from class: ckoo
        @Override // defpackage.fdae
        public final Object invoke() {
            ckot ckotVar = this.a;
            boolean z = false;
            if (ckotVar.d() != ckmc.REACTION_ACTION_UNSPECIFIED && !ckotVar.b().c() && ckotVar.e() != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });

    public ckot(fcsu fcsuVar, final fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4, MessageCoreData messageCoreData) {
        this.g = fcsuVar;
        this.h = fdjxVar;
        this.b = fcsuVar3;
        this.i = fcsuVar4;
        this.c = messageCoreData;
        this.d = fctd.a(new fdae() { // from class: ckny
            @Override // defpackage.fdae
            public final Object invoke() {
                eksp ekspVar = ckot.a;
                Object objB = fcsuVar2.b();
                objB.getClass();
                return (dnvi) fdct.b((Optional) objB);
            }
        });
        boolean z = true;
        if (d() != ckmc.ADD_REACTION && d() != ckmc.REPLACE_REACTION) {
            z = false;
        }
        this.f = z;
    }

    public static final MessageIdType h(String str, final fdap fdapVar) throws IOException {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A(str);
        brdrVarD.c(MessagesTable.c.a);
        brdrVarD.h(new Function() { // from class: ckop
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                eksp ekspVar = ckot.a;
                brecVar.getClass();
                return (brec) fdapVar.invoke(brecVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.y(1);
        dqqj dqqjVarP = brdrVarD.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToFirst()) {
                fczl.a(dqqjVarP, null);
                return null;
            }
            MessageIdType messageIdTypeQ = brapVar.q();
            fczl.a(dqqjVarP, null);
            return messageIdTypeQ;
        } finally {
        }
    }

    @Override // defpackage.cknw
    public final void a() {
        Object next;
        ckmi ckmiVarA;
        String str;
        fcsu fcsuVar = this.i;
        if (((arxm) fcsuVar.b()).a() && b().c()) {
            eksl ekslVar = (eksl) a.h();
            MessageCoreData messageCoreData = this.c;
            ekslVar.X(cqnc.s, messageCoreData.A());
            ekslVar.X(cqnc.p, messageCoreData.aB());
            ekslVar.X(ckmz.a, messageCoreData.C());
            ekslVar.X(ckmz.g, d());
            ekslVar.X(ckmz.k, f());
            ekslVar.q("Skipping processing incoming Emotify reaction due to missing reacted message.");
            return;
        }
        ckmi ckmiVarA2 = null;
        if (d() == ckmc.REMOVE_REACTION) {
            eksl ekslVar2 = (eksl) a.h();
            MessageCoreData messageCoreData2 = this.c;
            ekslVar2.X(cqnc.s, messageCoreData2.A());
            ekslVar2.X(cqnc.p, messageCoreData2.aB());
            ekslVar2.X(ckmz.a, messageCoreData2.C());
            ekslVar2.X(ckmz.g, d());
            ekslVar2.X(ckmz.k, f());
            ekslVar2.q("Processing incoming Emotify reaction.");
            ckvy ckvyVar = (ckvy) this.g.b();
            ConversationIdType conversationIdTypeA = messageCoreData2.A();
            MessageIdType messageIdTypeB = b();
            ckmb ckmbVar = ckmb.a;
            String strAB = messageCoreData2.aB();
            if (strAB != null) {
                ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
                ckmhVar.getClass();
                cklx cklxVar = (cklx) ckly.a.createBuilder();
                cklxVar.getClass();
                cklz.c(strAB, cklxVar);
                ckmj.b(cklz.a(cklxVar), ckmhVar);
                ckmiVarA2 = ckmj.a(ckmhVar);
            }
            ckvyVar.a(ckwk.a(conversationIdTypeA, messageIdTypeB, ckmbVar, ckmiVarA2, d(), null), messageCoreData2.C());
            return;
        }
        MessageCoreData messageCoreData3 = this.c;
        Iterator it = messageCoreData3.M().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (le.m(((MessagePartCoreData) next).R())) {
                    break;
                }
            }
        }
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) next;
        if (messagePartCoreData != null) {
            if (!((arxm) fcsuVar.b()).a()) {
                eksl ekslVar3 = (eksl) a.h();
                ekslVar3.X(cqnc.s, messageCoreData3.A());
                ekslVar3.X(cqnc.p, messageCoreData3.aB());
                ekslVar3.X(ckmz.a, messageCoreData3.C());
                ekslVar3.X(ckmz.g, d());
                ekslVar3.X(ckmz.j, String.valueOf(messagePartCoreData.t()));
                ekslVar3.X(ckmz.k, f());
                ekslVar3.q("Processing incoming Emotify reaction.");
            }
            if (e() == null || messagePartCoreData.t() == null) {
                return;
            }
            if (((arxm) fcsuVar.b()).a()) {
                eksl ekslVar4 = (eksl) a.h();
                ekslVar4.X(cqnc.s, messageCoreData3.A());
                ekslVar4.X(cqnc.p, messageCoreData3.aB());
                ekslVar4.X(ckmz.a, messageCoreData3.C());
                ekslVar4.X(ckmz.g, d());
                ekslVar4.X(ckmz.j, String.valueOf(messagePartCoreData.t()));
                ekslVar4.X(ckmz.k, f());
                ekslVar4.q("Processing incoming Emotify reaction.");
            }
            ckvy ckvyVar2 = (ckvy) this.g.b();
            ConversationIdType conversationIdTypeA2 = messageCoreData3.A();
            MessageIdType messageIdTypeB2 = b();
            String strE = e();
            strE.getClass();
            Uri uriT = messagePartCoreData.t();
            uriT.getClass();
            String strW = messagePartCoreData.W();
            String string = uriT.toString();
            string.getClass();
            dnwn dnwnVarH = dnwr.h(new dnvg(strE, string, strW, false, null, null, null, 0, 0, 0L, null, null, 4088));
            ckma ckmaVar = (ckma) ckmb.a.createBuilder();
            ckmaVar.getClass();
            String str2 = dnwnVarH.c;
            str2.getClass();
            ckmk.c(str2, ckmaVar);
            ckmk.d(ckml.EMOTIFY, ckmaVar);
            ckmk.b(dnwnVarH, ckmaVar);
            ckmb ckmbVarA = ckmk.a(ckmaVar);
            String strAB2 = messageCoreData3.aB();
            if (strAB2 != null) {
                ckmh ckmhVar2 = (ckmh) ckmi.a.createBuilder();
                ckmhVar2.getClass();
                if (((arxn) this.b.b()).a() && (str = messageCoreData3.F().b) != null) {
                    ckmj.c(str, ckmhVar2);
                }
                cklx cklxVar2 = (cklx) ckly.a.createBuilder();
                cklxVar2.getClass();
                cklz.c(strAB2, cklxVar2);
                ckmj.b(cklz.a(cklxVar2), ckmhVar2);
                ckmiVarA = ckmj.a(ckmhVar2);
            } else {
                ckmiVarA = null;
            }
            ckvyVar2.a(ckwk.a(conversationIdTypeA2, messageIdTypeB2, ckmbVarA, ckmiVarA, d(), null), messageCoreData3.C());
            auvw.k(this.h, null, null, new ckor(this, messagePartCoreData, null), 3);
        }
    }

    public final MessageIdType b() {
        return (MessageIdType) this.m.a();
    }

    public final basd c() {
        return (basd) this.l.a();
    }

    public final ckmc d() {
        return (ckmc) this.k.a();
    }

    public final String e() {
        return (String) this.o.a();
    }

    public final String f() {
        return (String) this.n.a();
    }

    public final boolean g() {
        return ((Boolean) this.j.a()).booleanValue();
    }
}
