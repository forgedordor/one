package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwrn implements bvus {
    public static final ekgb a;
    public static final ekgb b;
    public static final cqce c;
    public static final ekrg d;
    public final bwjw e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final auau i;
    public final fcsu j;
    public final fcsu k;
    private final eosc l;
    private final bvur m;
    private final fcsu n;
    private final dqsn o;
    private final fcsu p;
    private final bwvo q;
    private final fcsu r;
    private final celq s;

    static {
        Integer numValueOf = Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        a = ekgb.B(numValueOf, 229, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 233, 234, 252, 215, 216, 219);
        b = ekgb.t(229, 226, 233);
        ekgb.s(numValueOf, 234);
        c = cqce.g("BugleE2eeEtouffee", "EtouffeeDatabaseOperationsImpl");
        d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl");
    }

    public bwrn(eosc eoscVar, bwjw bwjwVar, bvur bvurVar, fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bwvo bwvoVar, celq celqVar, fcsu fcsuVar6, auau auauVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.l = eoscVar;
        this.e = bwjwVar;
        this.m = bvurVar;
        this.n = fcsuVar;
        this.f = fcsuVar2;
        this.o = dqsnVar;
        this.p = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.q = bwvoVar;
        this.s = celqVar;
        this.r = fcsuVar6;
        this.i = auauVar;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
    }

    @Override // defpackage.bvus
    public final MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#getLatestVisibleMessageOrGroupEtouffeeTombstoneExcludingMessage");
        try {
            baxe baxeVar = (baxe) this.f.b();
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.z(messageIdType);
            brecVar.am(avbn.d);
            brecVar.A(false);
            brecVar.b(new Function() { // from class: bwrj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    ekgb ekgbVar = bwrn.a;
                    brecVar2.ak();
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bwrk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    ekgb ekgbVar = bwrn.a;
                    brecVar2.af();
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bwrl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    brecVar2.ah(bwrn.a);
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessageCoreData messageCoreDataN = baxeVar.n(new brdv(brecVar));
            eieuVarK.close();
            return messageCoreDataN;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final eiju b(final String str) {
        if (!this.m.m()) {
            return eijx.e(Optional.empty());
        }
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#getParticipantRemoteRegistrationId");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: bwrb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str2 = str;
                    if (str2 == null) {
                        return Optional.empty();
                    }
                    bwrn bwrnVar = this.a;
                    ecem.b();
                    ekgb ekgbVarC = bwrnVar.e.f.c(str2);
                    ArrayList arrayList = new ArrayList();
                    int size = ekgbVarC.size();
                    for (int i = 0; i < size; i++) {
                        bkvw bkvwVar = (bkvw) ekgbVarC.get(i);
                        if (bkvwVar.j()) {
                            String strI = bkvwVar.i();
                            if (!TextUtils.isEmpty(strI)) {
                                arrayList.add(strI);
                            }
                        }
                    }
                    if (arrayList.size() == 1) {
                        return Optional.of((String) arrayList.get(0));
                    }
                    if (arrayList.size() > 1) {
                        bwrn.c.r("Multiple registration id's found for other participant");
                    }
                    return Optional.empty();
                }
            }, this.l);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final ekgb c(int i) {
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#getPreviouslyE2eeCurrentlyNonE2eeConversations");
        try {
            botb botbVarE = botm.e();
            botbVarE.A("getPreviouslyE2eeCurrentlyNonE2eeConversations");
            botbVarE.s();
            botbVarE.i(new Function() { // from class: bwre
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    ekgb ekgbVar = bwrn.a;
                    botlVar.n(0);
                    botlVar.p(true);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.g(new Function() { // from class: bwrf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ekgb ekgbVar = bwrn.a;
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopp boppVar = botm.c;
            botbVarE.e(new bosy(boppVar.r, false), new bosy(boppVar.a, false));
            botbVarE.y(i);
            ekgb ekgbVarG = botbVarE.b().g();
            eieuVarK.close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final ekgb d(final ConversationIdType conversationIdType, final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#getRcsEncryptedMessages");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getRcsEncryptedMessages");
            brdrVarD.h(new Function() { // from class: bwqt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    ekgb ekgbVar2 = bwrn.a;
                    brecVar.m(conversationIdType);
                    brecVar.J(3);
                    brecVar.ah(ekgbVar);
                    brecVar.M(2);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = brdrVarD.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final Optional e(final MessageIdType messageIdType) {
        MessageCoreData messageCoreDataW = ((baxe) this.f.b()).w(messageIdType);
        if (messageCoreDataW == null) {
            cqbd cqbdVarE = c.e();
            cqbdVarE.I("Failed to find the message to resend.");
            cqbdVarE.d(messageIdType);
            cqbdVarE.r();
            return Optional.empty();
        }
        fcsu fcsuVar = this.n;
        final ConversationIdType conversationIdTypeA = messageCoreDataW.A();
        bajf bajfVarA = ((axgh) fcsuVar.b()).a(conversationIdTypeA);
        if (bajfVarA == null) {
            cqbd cqbdVarE2 = c.e();
            cqbdVarE2.I("Failed to find the conversation of the message to resend");
            cqbdVarE2.d(messageIdType);
            cqbdVarE2.c(conversationIdTypeA);
            cqbdVarE2.r();
            return Optional.empty();
        }
        if (bajfVarA.E() == 2 && messageCoreDataW.cB()) {
            final int iB = bwbv.b() + 1;
            return (Optional) this.o.c("prepareMessageForGroupResending", new ejxr() { // from class: bwra
                @Override // defpackage.ejxr
                public final Object get() {
                    final MessageIdType messageIdType2 = messageIdType;
                    MessagesTable.BindData bindDataB = MessagesTable.b(messageIdType2);
                    if (bindDataB == null) {
                        bwrn.c.r("Failed to find the message for resend.");
                        return Optional.empty();
                    }
                    bwrn bwrnVar = this.a;
                    bquu bquuVarK = bindDataB.K();
                    bquuVarK.j(null);
                    bquuVarK.i(null);
                    bquuVarK.r(Optional.empty());
                    bquuVarK.af(baro.a);
                    bquuVarK.x(Optional.of(UUID.randomUUID()));
                    bquuVarK.W(bwrnVar.i.a());
                    bquuVarK.T(0);
                    bquuVarK.aq(19);
                    bquuVarK.V(-1L);
                    bquuVarK.w(false);
                    bquuVarK.ah(1L);
                    MessagesTable.BindData bindDataC = bquuVarK.c();
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.A("prepareMessageForUnencryptedResending-parts");
                    bsjeVarC.h(new Function() { // from class: bwqx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            ekgb ekgbVar = bwrn.a;
                            bsjlVar.n(messageIdType2);
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                    while (bsgtVar.moveToNext()) {
                        try {
                            bscl bsclVarX = ((PartsTable.BindData) bsgtVar.cQ()).x();
                            bsclVarX.J(bindDataC.E());
                            bsclVarX.d();
                        } catch (Throwable th) {
                            try {
                                bsgtVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bsgtVar.close();
                    bpxe bpxeVarB = bpxj.b();
                    bpxeVarB.A("prepareMessageForUnencryptedResending-link_preview");
                    bpxeVarB.e(new Function() { // from class: bwqy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bpxi bpxiVar = (bpxi) obj;
                            ekgb ekgbVar = bwrn.a;
                            bpxiVar.b(messageIdType2);
                            return bpxiVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bpwk bpwkVar = (bpwk) bpxeVarB.b().p();
                    while (bpwkVar.moveToNext()) {
                        try {
                            bpvd bpvdVar = (bpvd) bpwkVar.cQ();
                            bpvi bpviVar = new bpvi();
                            bpviVar.c(bpvdVar, true, bpvdVar.cL);
                            bpviVar.n(bindDataC.E());
                            bpviVar.d();
                        } catch (Throwable th3) {
                            try {
                                bpwkVar.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    ConversationIdType conversationIdType = conversationIdTypeA;
                    int i = iB;
                    bpwkVar.close();
                    brdu brduVar = new brdu();
                    brduVar.ap("prepareMessageForUnencryptedResending");
                    brduVar.X(new Function() { // from class: bwqz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            ekgb ekgbVar = bwrn.a;
                            brecVar.p(messageIdType2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brduVar.L(i);
                    brduVar.U(22);
                    if (!((baxe) bwrnVar.f.b()).T(brduVar.b(), conversationIdType, messageIdType2)) {
                        cqbd cqbdVarE3 = bwrn.c.e();
                        cqbdVarE3.I("Failed to update the original message");
                        cqbdVarE3.d(messageIdType2);
                        cqbdVarE3.c(conversationIdType);
                        cqbdVarE3.r();
                    }
                    return Optional.of(bindDataC.E());
                }
            });
        }
        cqbd cqbdVarA = c.a();
        cqbdVarA.I("Not in a RCS group conversation, or message already not encrypted.");
        cqbdVarA.d(messageIdType);
        cqbdVarA.c(conversationIdTypeA);
        cqbdVarA.r();
        return k(messageIdType) ? Optional.of(messageIdType) : Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvus
    public final void f(ekgb ekgbVar, ConversationIdType conversationIdType) {
        ekgb ekgbVarB = this.s.b((ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bwri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aubq) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a));
        int size = ekgbVarB.size();
        int i = 0;
        while (i < size) {
            bkvw bkvwVar = (bkvw) ekgbVarB.get(i);
            if (bkvwVar.j()) {
                i++;
                if (!bkvwVar.k()) {
                }
            }
            cqbd cqbdVarA = c.a();
            cqbdVarA.I("Group conversation will downgrade as one or more users does not have group e2ee capability");
            cqbdVarA.c(conversationIdType);
            cqbdVarA.r();
            l(conversationIdType, 0, bwvi.DOWNGRADE_INVALID_PARTICIPANTS_IN_GROUP);
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvus
    public final void g(final SelfIdentityId selfIdentityId) {
        ecem.b();
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#disableEncryptionInConversations");
        try {
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.ap("disableEncryptionInConversations");
            boteVar.ak();
            boteVar.q(0);
            boteVar.w(cbqz.a);
            boteVar.ad(new Function() { // from class: bwqu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    ekgb ekgbVar = bwrn.a;
                    botlVar.n(1);
                    botlVar.k(((SelfIdentityIdImpl) selfIdentityId).a);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boteVar.am();
            final botd botdVarB = boteVar.b();
            final int i = 0;
            ekgb ekgbVar = (ekgb) botm.f().p("conversations.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: botc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejxr
                public final Object get() {
                    botb botbVarE = botm.e();
                    botbVarE.A("conversations.updateAndReturnUpdatedRows-query");
                    botd botdVar = botdVarB;
                    ekgb ekgbVar2 = botdVar.e;
                    int i2 = ((ekoe) ekgbVar2).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        botbVarE.k((botf) ((dqyj) ekgbVar2.get(i3)));
                    }
                    dqpb dqpbVar = (dqpb) botdVar.d;
                    if (dqpbVar.b) {
                        botl botlVar = new botl();
                        botlVar.ar(botdVar.h());
                        botbVarE.h(botlVar);
                    }
                    if (dqpbVar.c) {
                        botbVarE.s();
                    }
                    Integer num = i;
                    ekgb ekgbVarZ = botbVarE.b().z();
                    num.intValue();
                    botdVar.t(0);
                    return ekgbVarZ;
                }
            });
            ekrw ekrwVarH = d.h();
            ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl", "disableEncryptionInConversations", 649, "EtouffeeDatabaseOperationsImpl.java")).r("Updated conversation encryption status in database. count %d", ekgbVar.size());
            ekqh it = ekgbVar.iterator();
            while (it.hasNext()) {
                ((bxlc) this.p.b()).d(((bojh) it.next()).C());
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final void h(final aubq aubqVar, final ConversationIdType conversationIdType, final int i, final bwvi bwviVar) {
        ecem.b();
        this.o.d("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryption", new Runnable() { // from class: bwqw
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e0 A[Catch: all -> 0x01d4, TRY_ENTER, TryCatch #0 {all -> 0x01d4, blocks: (B:11:0x002d, B:22:0x00d9, B:25:0x00e0, B:27:0x0101, B:29:0x0120, B:30:0x0127, B:32:0x015d, B:47:0x01d3, B:46:0x01d0, B:12:0x0033, B:15:0x0049, B:19:0x009f, B:21:0x00cc, B:16:0x0069, B:18:0x0077, B:43:0x01cb), top: B:55:0x002d, inners: #1, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0101 A[Catch: all -> 0x01d4, TryCatch #0 {all -> 0x01d4, blocks: (B:11:0x002d, B:22:0x00d9, B:25:0x00e0, B:27:0x0101, B:29:0x0120, B:30:0x0127, B:32:0x015d, B:47:0x01d3, B:46:0x01d0, B:12:0x0033, B:15:0x0049, B:19:0x009f, B:21:0x00cc, B:16:0x0069, B:18:0x0077, B:43:0x01cb), top: B:55:0x002d, inners: #1, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 479
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqw.run():void");
            }
        });
    }

    @Override // defpackage.bvus
    public final void i(ConversationIdType conversationIdType, int i, bwvi bwviVar) {
        l(conversationIdType, i, bwviVar);
    }

    @Override // defpackage.bvus
    public final boolean j(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#hasGroupSwitchToE2eeTombstone");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("hasGroupSwitchToE2eeTombstone");
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.A(false);
            brecVar.b(new Function() { // from class: bwrm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    brecVar2.ah(bwrn.b);
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.g(brecVar);
            brdrVarD.y(1);
            boolean zU = brdrVarD.b().U();
            eieuVarK.close();
            return zU;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bvus
    public final boolean k(final MessageIdType messageIdType) {
        return ((Boolean) this.o.c("EtouffeeDatabaseOperationsImpl.markMessageForManualUnencryptedResending", new ejxr() { // from class: bwrg
            @Override // defpackage.ejxr
            public final Object get() {
                fcsu fcsuVar = this.a.f;
                baxe baxeVar = (baxe) fcsuVar.b();
                final MessageIdType messageIdType2 = messageIdType;
                MessageCoreData messageCoreDataW = baxeVar.w(messageIdType2);
                if (messageCoreDataW == null) {
                    return false;
                }
                ConversationIdType conversationIdTypeA = messageCoreDataW.A();
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("markMessageForManualUnencryptedResending");
                brduVar.al();
                brduVar.C(0);
                brduVar.X(new Function() { // from class: bwrh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        ekgb ekgbVar = bwrn.a;
                        brecVar.p(messageIdType2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (messageCoreDataW.cl()) {
                    brduVar.D(-1L);
                }
                return Boolean.valueOf(((baxe) fcsuVar.b()).T(brduVar.b(), conversationIdTypeA, messageIdType2));
            }
        })).booleanValue();
    }

    public final void l(final ConversationIdType conversationIdType, final int i, bwvi bwviVar) {
        bajf bajfVarA;
        eieu eieuVarK = eiiy.k("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryptionForAllIdentities");
        try {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            int iIntValue = ((Integer) this.o.c("updateDraftDefaultEncryptionForAllIdentities", new ejxr() { // from class: bwqv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejxr
                public final Object get() {
                    ekgb ekgbVar = bwrn.a;
                    botb botbVarE = botm.e();
                    botbVarE.A("updateDraftDefaultEncryptionForAllIdentities-query");
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    botbVarE.i(new Function() { // from class: bwrc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            ekgb ekgbVar2 = bwrn.a;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgb ekgbVarZ = botbVarE.b().z();
                    if (ekgbVarZ.size() != 1) {
                        return Integer.valueOf(ekgbVarZ.size());
                    }
                    int i2 = i;
                    bojh bojhVar = (bojh) ekgbVarZ.get(0);
                    if (bojhVar.m() != i2) {
                        atomicBoolean.getAndSet(true);
                    }
                    cbqz cbqzVarJ = bojhVar.J();
                    bote boteVar = new bote();
                    boteVar.ap("updateDraftDefaultEncryption-conversations#update1");
                    boteVar.q(i2);
                    if (i2 == 1) {
                        boteVar.y(true);
                        boteVar.w(cbqzVarJ.a(cbqz.b));
                    } else {
                        boteVar.w(cbqz.a);
                    }
                    boteVar.ad(new Function() { // from class: bwrd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            ekgb ekgbVar2 = bwrn.a;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Integer.valueOf(boteVar.b().e());
                }
            })).intValue();
            ejwl.l(iIntValue <= 1);
            if (iIntValue == 1) {
                ((bxlc) this.p.b()).d(conversationIdType);
                iIntValue = 1;
            }
            if (atomicBoolean.get() && (bajfVarA = ((axgh) this.n.b()).a(conversationIdType)) != null && bvdi.d(bajfVarA.E())) {
                bwvo bwvoVar = this.q;
                bwvm bwvmVar = (bwvm) bwvn.a.createBuilder();
                String strA = conversationIdType.a();
                bwvmVar.copyOnWrite();
                bwvn bwvnVar = (bwvn) bwvmVar.instance;
                strA.getClass();
                bwvnVar.b = strA;
                ((cazj) bwvoVar.a.b()).a(cbcu.f("tombstone_manager_on_rcs_group_e2ee_status_change", (bwvn) bwvmVar.build()));
            }
            if (bwviVar != bwvi.DEFAULT && iIntValue > 0) {
                ((ains) this.r.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", bwviVar.u);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
