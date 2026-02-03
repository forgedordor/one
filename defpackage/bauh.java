package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bauh {
    private static final cqce f = cqce.g("Bugle", "MessageCoreDataInserter");
    public final dqsn a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final cogw j;
    private final fcsu k;

    public bauh(dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar, fcsu fcsuVar8) {
        this.a = dqsnVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.g = fcsuVar3;
        this.d = fcsuVar4;
        this.h = fcsuVar5;
        this.e = fcsuVar6;
        this.i = fcsuVar7;
        this.j = cogwVar;
        this.k = fcsuVar8;
    }

    public final MessageIdType a(MessageCoreData messageCoreData) {
        eieu eieuVarK = eiiy.k("MessageCoreDataInserter#insertNewMessage1");
        try {
            eieu eieuVarK2 = eiiy.k("MessageCoreDataInserter#insertNewMessage2");
            try {
                MessageIdType messageIdTypeD = d(messageCoreData, false, Optional.empty());
                eieuVarK2.close();
                eieuVarK.close();
                return messageIdTypeD;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String b(final MessagePartCoreData messagePartCoreData, final ConversationIdType conversationIdType) {
        return (String) this.a.c("MessageCoreDataInserter#insertNewMessagePart", new ejxr() { // from class: bauc
            @Override // defpackage.ejxr
            public final Object get() {
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                ConversationIdType conversationIdType2 = conversationIdType;
                messagePartCoreData2.as(conversationIdType2);
                long jQ = messagePartCoreData2.q();
                final bauh bauhVar = this.a;
                bxlc bxlcVar = (bxlc) bauhVar.b.b();
                MessageIdType messageIdTypeB = messagePartCoreData2.B();
                String[] strArr = PartsTable.a;
                bxlcVar.l(conversationIdType2, messageIdTypeB, "parts");
                cqaz.r(jQ);
                String string = Long.toString(jQ);
                messagePartCoreData2.aP(string);
                messagePartCoreData2.aN(conversationIdType2);
                bauhVar.a.g(new dqsm() { // from class: baud
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("MCDI::onPartInsertedSync::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: baue
                    @Override // java.lang.Runnable
                    public final void run() {
                        awlc awlcVar = (awlc) bauhVar.d.b();
                        final MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        awlcVar.d(new Consumer() { // from class: baug
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ((cnos) obj).c(messagePartCoreData3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                });
                return string;
            }
        });
    }

    public final MessageIdType c(MessageCoreData messageCoreData) {
        boolean zU;
        messageCoreData.bJ(this.j.f());
        messageCoreData.aL(elny.class.getName(), messageCoreData.z().j());
        MessagesTable.BindData bindDataJ = messageCoreData.J();
        try {
            return bindDataJ.G();
        } catch (SQLiteConstraintException e) {
            final ConversationIdType conversationIdTypeD = bindDataJ.D();
            if (conversationIdTypeD.b()) {
                zU = false;
            } else {
                botb botbVarE = botm.e();
                botbVarE.A("logSQLiteConstraintExceptionForMessageInsert");
                botbVarE.i(new Function() { // from class: baub
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.r(conversationIdTypeD);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                zU = botbVarE.b().U();
            }
            String strZ = bindDataJ.Z();
            ParticipantsTable.BindData bindDataB = strZ == null ? null : ((bbca) this.h.b()).b(strZ);
            String strAa = bindDataJ.aa();
            ParticipantsTable.BindData bindDataB2 = strAa == null ? null : ((bbca) this.h.b()).b(strAa);
            alqm alqmVarQ = bindDataB == null ? null : ((alrj) this.i.b()).q(bindDataB);
            alqm alqmVarQ2 = bindDataB2 == null ? null : ((alrj) this.i.b()).q(bindDataB2);
            String strA = bindDataJ.a();
            if (!zU) {
                conversationIdTypeD = barn.a;
            }
            String strO = alqmVarQ == null ? null : ((alqk) alqmVarQ).o();
            String strO2 = alqmVarQ2 != null ? ((alqk) alqmVarQ2).o() : null;
            cqce cqceVar = f;
            if (cqceVar.t(5)) {
                cqbd cqbdVarE = cqceVar.e();
                cqbdVarE.I("SQLiteConstraintException while inserting:");
                cqbdVarE.D("message", strA);
                cqbdVarE.I("found:");
                cqbdVarE.c(conversationIdTypeD);
                cqbdVarE.A("selfId", strZ);
                cqbdVarE.A("senderId", bindDataB2);
                cqbdVarE.I("found:");
                cqbdVarE.D("selfDest", strO);
                cqbdVarE.I("found:");
                cqbdVarE.D("senderDest", strO2);
                cqbdVarE.s(e);
            }
            throw e;
        }
    }

    public final MessageIdType d(MessageCoreData messageCoreData, boolean z, Optional optional) {
        cqaz.h();
        if (messageCoreData.t() == 0) {
            aika aikaVar = (aika) this.g.b();
            if (optional.isPresent()) {
                messageCoreData.bW(messageCoreData.cK() ? aikaVar.e(messageCoreData) : aikaVar.f());
            } else {
                messageCoreData.bW(aikaVar.d(messageCoreData));
            }
        }
        if (z) {
            messageCoreData.br(cpyi.RESTORED_FROM_TELEPHONY);
        }
        return e(messageCoreData, z);
    }

    public final MessageIdType e(final MessageCoreData messageCoreData, final boolean z) {
        return (MessageIdType) this.a.c("MessageCoreDataInserter#insertPreparedNewMessage", new ejxr() { // from class: bauf
            @Override // defpackage.ejxr
            public final Object get() throws IOException {
                bauh bauhVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (!z && messageCoreData2.F().i() && ((messageCoreData2.cX() || messageCoreData2.di()) && !messageCoreData2.db())) {
                    messageCoreData2.cd(((auau) bauhVar.c.b()).a());
                }
                MessageIdType messageIdTypeC = bauhVar.c(messageCoreData2);
                cqaz.r(messageIdTypeC.a);
                messageCoreData2.cc(messageIdTypeC);
                baxt baxtVarG = messageCoreData2.G();
                if (baxtVarG != null) {
                    String[] strArr = bqbb.a;
                    bqag bqagVar = new bqag();
                    bqagVar.c(messageIdTypeC);
                    bqagVar.b(baxtVarG.a);
                    bqad bqadVarA = bqagVar.a();
                    final dqsy dqsyVarA = bqbb.a();
                    ejwl.a(Long.valueOf(dqru.b(bqbb.a(), "message_captions", bqadVarA, new Function() { // from class: bqaa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarA.P("message_captions", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bqab
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    })).longValue() >= 0);
                }
                ((bxlc) bauhVar.b.b()).l(messageCoreData2.A(), messageIdTypeC, new String[0]);
                for (MessagePartCoreData messagePartCoreData : messageCoreData2.M()) {
                    messagePartCoreData.aO(messageIdTypeC);
                    bauhVar.b(messagePartCoreData, messageCoreData2.A());
                }
                if (messageCoreData2.cS()) {
                    fcsu fcsuVar = bauhVar.e;
                    if (((bays) fcsuVar.b()).a().booleanValue()) {
                        bays baysVar = (bays) fcsuVar.b();
                        messageCoreData2.getClass();
                        eieu eieuVarH = eiiy.h("OutgoingMessageInsertionListenersManager::onInsertInTransaction");
                        try {
                            Iterator it = baysVar.b().iterator();
                            while (it.hasNext()) {
                                ((bayk) it.next()).h(messageCoreData2);
                            }
                            fczl.a(eieuVarH, null);
                            return messageIdTypeC;
                        } finally {
                        }
                    }
                }
                return messageIdTypeC;
            }
        });
    }
}
