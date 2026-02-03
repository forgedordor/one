package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baxe {
    public static final cqce a = cqce.g("BugleDataModel", "MessageDatabaseOperations");
    public static final ejxr b = cdag.w(206679830, "refactor_get_latest_message_by_conversation_and_sender");
    static final ejxr c = cdag.w(209309856, "new_read_user_reference_data");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public baxe(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15) {
        this.m = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.n = fcsuVar4;
        this.o = fcsuVar5;
        this.g = fcsuVar6;
        this.p = fcsuVar7;
        this.h = fcsuVar8;
        this.q = fcsuVar9;
        this.d = fcsuVar10;
        this.i = fcsuVar11;
        this.j = fcsuVar12;
        this.k = fcsuVar13;
        this.l = fcsuVar14;
        this.r = fcsuVar15;
    }

    public static brdu C(final MessageIdType messageIdType, int i, long j, Uri uri) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("getUpdateBuilderForResending");
        brduVar.z(i);
        brduVar.I(j);
        brduVar.X(new Function() { // from class: bavd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = baxe.a;
                brecVar.p(messageIdType);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (uri != null) {
            brduVar.S(uri);
        }
        brduVar.C(0);
        return brduVar;
    }

    public static brec D(ConversationIdType conversationIdType, boolean z) {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.m(conversationIdType);
        brecVar.am(avbn.d);
        if (!z) {
            brecVar.A(false);
        }
        return brecVar;
    }

    public static brec E(ConversationIdType conversationIdType) {
        brec brecVarD = D(conversationIdType, false);
        brecVarD.b(new Function() { // from class: bawd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = baxe.a;
                brecVar.ak();
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bawe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = baxe.a;
                brecVar.af();
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brecVarD;
    }

    public static void W(MessageCoreData messageCoreData, bote boteVar, String str) {
        MessagePartCoreData messagePartCoreData;
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#addSnippetTextAndPreviewToContentValues");
        try {
            boteVar.W(false);
            if (!crbf.c() || str == null) {
                boteVar.Y(messageCoreData.as());
            } else {
                boteVar.Y(str);
            }
            dqru.v(boteVar.a, "subject_text", cssq.a(messageCoreData.av()));
            Iterator it = ((MessageData) messageCoreData).i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    messagePartCoreData = null;
                    break;
                } else {
                    messagePartCoreData = (MessagePartCoreData) it.next();
                    if (le.p(messagePartCoreData.R())) {
                        break;
                    }
                }
            }
            if (messagePartCoreData != null) {
                baza bazaVarC = messagePartCoreData.C();
                boteVar.L(((bayz) bazaVarC).a);
                boteVar.M(((bayz) bazaVarC).b);
            } else {
                boteVar.L(null);
                boteVar.M(null);
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

    public static int a(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getCountOfAllMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.b(new Function() { // from class: baxd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar2.ak();
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bauk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar2.af();
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iAc = ac(new brdv(brecVar));
            eieuVarK.close();
            return iAc;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final buys aa(final MessageIdType messageIdType) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.e(new Function() { // from class: bauz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                cqce cqceVar = baxe.a;
                return new brzi[]{brzhVar.a, brzhVar.f, brzhVar.g, brzhVar.z, brzhVar.h, brzhVar.t, brzhVar.s, brzhVar.u, brzhVar.o, brzhVar.Q, brzhVar.m, brzhVar.n, brzhVar.r};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbm bsbmVarB = bsboVarE.b();
        String[] strArr = buyx.a;
        buyu buyuVar = new buyu(buyx.a);
        buyuVar.A("queryUserRefs");
        buyd buydVar = buyx.c;
        buyuVar.w(buydVar.b);
        buyuVar.c(new Function() { // from class: bava
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buyd buydVar2 = (buyd) obj;
                cqce cqceVar = baxe.a;
                return new buye[]{buydVar2.b, buydVar2.c, buydVar2.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buyuVar.d(new Function() { // from class: bavb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buyw buywVar = (buyw) obj;
                cqce cqceVar = baxe.a;
                buywVar.ap(new dqpj("user_references.message_id", 1, Long.valueOf(bary.a(messageIdType))));
                return buywVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buyuVar.D((String) DesugarArrays.stream(new buyr[]{new buyr(buydVar.d)}).map(new Function() { // from class: buyt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buyr) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        buyuVar.H(dqts.i(bsbmVarB, ParticipantsTable.c.a, buydVar.c).g());
        return buyuVar.b();
    }

    private static int ac(brdv brdvVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessageCount");
        try {
            cqaz.h();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("MessageDatabaseOperations#getMessageCount");
            brdrVarD.k(brdvVar);
            int iH = brdrVarD.b().h();
            eieuVarK.close();
            return iH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final MessageCoreData ad(brdv brdvVar, boolean z) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestOrLatestMessage");
        String str = z ? "earliest" : "latest";
        try {
            ekgb ekgbVarAe = ae(brdvVar, 1, z);
            MessageCoreData messageCoreData = null;
            if (ekgbVarAe == null) {
                a.n(a.a(str, "The returned list of ", " messages is null."));
            } else if (ekgbVarAe.size() != 1) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Unexpected list of");
                cqbdVarE.L(str, ekgbVarAe);
                cqbdVarE.I("is returned.");
                cqbdVarE.r();
            } else {
                messageCoreData = (MessageCoreData) ekgbVarAe.get(0);
            }
            eieuVarK.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final ekgb ae(brdv brdvVar, int i, boolean z) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestOrLatestMessages");
        try {
            String string = Integer.toString(i);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getEarliestOrLatestMessages");
            brdrVarD.k(brdvVar);
            brdo[] brdoVarArr = new brdo[1];
            brdoVarArr[0] = z ? new brdo(MessagesTable.c.i, true) : new brdo(MessagesTable.c.i, false);
            brdrVarD.d(brdoVarArr);
            brdrVarD.z(string);
            ekgb ekgbVarK = K(brdrVarD.b());
            eieuVarK.close();
            return ekgbVarK;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int b(ConversationIdType conversationIdType, String str) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getCountOfIncomingMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.W(str);
            brecVar.aj(100, 117);
            int iAc = ac(new brdv(brecVar));
            eieuVarK.close();
            return iAc;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int c(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getCountOfMessagesInBothConversationAndInTelephony");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.ac();
            int iAc = ac(new brdv(brecVar));
            eieuVarK.close();
            return iAc;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int d(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getCountOfOutgoingMessagesInConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(1, 25);
            int iAc = ac(new brdv(brecVar));
            eieuVarK.close();
            return iAc;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData A(MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageNoParts messageId");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.p(messageIdType);
            MessageCoreData messageCoreDataB = B(new brdv(brecVar));
            eieuVarK.close();
            return messageCoreDataB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData B(brdv brdvVar) {
        MessageCoreData messageCoreDataA;
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageNoParts where");
        try {
            cqaz.h();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("+readMessageData2");
            brdrVarD.k(brdvVar);
            MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
            if (bindData != null) {
                messageCoreDataA = ((bveg) this.e.b()).a();
                messageCoreDataA.aN(bindData);
            } else {
                messageCoreDataA = null;
            }
            eieuVarK.close();
            return messageCoreDataA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bvdk F(long j, String str, boolean z, boolean z2) {
        return G(((bakt) this.g.b()).m(j), str, z, z2);
    }

    public final bvdk G(ConversationIdType conversationIdType, String str, boolean z, boolean z2) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getArchiveStatusForIncomingMessage");
        try {
            ecem.b();
            ParticipantsTable.BindData bindDataD = ((bbca) this.o.b()).d(str);
            boolean z3 = true;
            boolean z4 = bindDataD != null && bindDataD.aa() && csdm.a(bindDataD.o()).e();
            if (!conversationIdType.b()) {
                if (q(conversationIdType) != null) {
                    z3 = false;
                }
                z4 &= z3;
            }
            bvdk bvdkVar = z4 ? bvdk.SPAM_FOLDER : z ? z2 ? bvdk.ARCHIVED : bvdk.BLOCKED_FOLDER : bvdk.UNARCHIVED;
            eieuVarK.close();
            return bvdkVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb H(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestIncomingMessagesForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(100, 117);
            ekgb ekgbVarI = I(new brdv(brecVar), i);
            eieuVarK.close();
            return ekgbVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb I(brdv brdvVar, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestMessages");
        try {
            ekgb ekgbVarAe = ae(brdvVar, i, false);
            eieuVarK.close();
            return ekgbVarAe;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb J(brec brecVar, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessageIdsDescending");
        try {
            ecem.b();
            brdr brdrVarE = MessagesTable.e("getMessageIdsDescending#query");
            brdrVarE.g(brecVar);
            brao braoVar = MessagesTable.c.a;
            brdrVarE.d(new brdo(braoVar, false));
            brdrVarE.c(braoVar);
            brdrVarE.y(i);
            brap brapVar = (brap) brdrVarE.b().p();
            try {
                ekgb ekgbVarW = brapVar.w();
                brapVar.close();
                eieuVarK.close();
                return ekgbVarW;
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

    public final ekgb K(brdp brdpVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessages");
        try {
            cqaz.h();
            ArrayList arrayList = new ArrayList();
            brap brapVar = (brap) brdpVar.p();
            while (brapVar.moveToNext()) {
                try {
                    MessageCoreData messageCoreDataA = ((bveg) this.e.b()).a();
                    messageCoreDataA.aO(brapVar);
                    ((bbae) this.f.b()).c(messageCoreDataA, false);
                    O(messageCoreDataA);
                    arrayList.add(messageCoreDataA);
                } finally {
                }
            }
            brapVar.close();
            ekgb ekgbVarN = ekgb.n(arrayList);
            eieuVarK.close();
            return ekgbVarN;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb L(final List list) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessagesByIds");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("+getMessagesByIds");
            brdrVarD.h(new Function() { // from class: baun
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.t(list);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarK = K(brdrVarD.b());
            eieuVarK.close();
            return ekgbVarK;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List M(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestMessagesForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            ekgb ekgbVarI = I(new brdv(brecVar), i);
            if (ekgbVarI == null) {
                int i2 = ekgb.d;
                ekgbVarI = ekoe.a;
            }
            eieuVarK.close();
            return ekgbVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List N(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestVisibleMessagesForConversation");
        try {
            ekgb ekgbVarI = I(new brdv(E(conversationIdType)), i);
            if (ekgbVarI == null) {
                int i2 = ekgb.d;
                ekgbVarI = ekoe.a;
            }
            eieuVarK.close();
            return ekgbVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void O(MessageCoreData messageCoreData) {
        if (((Boolean) ((cczi) c.get()).e()).booleanValue()) {
            eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readUserReferenceData");
            try {
                if (!byed.g(messageCoreData.k())) {
                    eieuVarK.close();
                    return;
                }
                String strAB = messageCoreData.aB();
                strAB.getClass();
                ParticipantsTable.BindData bindDataB = ParticipantsTable.b(strAB);
                bindDataB.getClass();
                buxp buxpVar = (buxp) aa(messageCoreData.C()).l();
                if (buxpVar != null) {
                    messageCoreData.bX(((bbcc) this.n.b()).a(bindDataB, false), bajt.i(buxpVar, this.m, this.d));
                } else {
                    a.q("Tombstone user reference list is empty");
                    messageCoreData.bX(((bbcc) this.n.b()).a(bindDataB, false), new ArrayList());
                }
                eieuVarK.close();
                return;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieu eieuVarK2 = eiiy.k("MessageDatabaseOperations#readUserReferenceData");
        try {
            if (!byed.g(messageCoreData.k())) {
                eieuVarK2.close();
                return;
            }
            String strAB2 = messageCoreData.aB();
            strAB2.getClass();
            ParticipantsTable.BindData bindDataB2 = ParticipantsTable.b(strAB2);
            bindDataB2.getClass();
            buxp buxpVar2 = (buxp) aa(messageCoreData.C()).l();
            if (buxpVar2 != null) {
                messageCoreData.bX(((bbcc) this.n.b()).a(bindDataB2, false), bajt.i(buxpVar2, this.m, this.d));
            } else {
                a.q("Tombstone user reference list is empty");
                messageCoreData.bX(((bbcc) this.n.b()).a(bindDataB2, false), new ArrayList());
            }
            eieuVarK2.close();
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void P(final MessageCoreData messageCoreData) {
        cqaz.h();
        ((dqsn) this.p.b()).d("MessageDatabaseOperations#updateMessage", new Runnable() { // from class: bawu
            @Override // java.lang.Runnable
            public final void run() {
                baxe baxeVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                final MessageIdType messageIdTypeC = messageCoreData2.C();
                if (baxeVar.w(messageIdTypeC) != null) {
                    String[] strArr = PartsTable.a;
                    bsix bsixVar = new bsix();
                    bsixVar.f("deletePartsForMessage");
                    bsixVar.a(new Function() { // from class: baws
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            cqce cqceVar = baxe.a;
                            bsjlVar.n(messageIdTypeC);
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    cqaz.d(bsixVar.d(), 0, Alert.DURATION_SHOW_INDEFINITELY);
                    for (MessagePartCoreData messagePartCoreData : messageCoreData2.M()) {
                        messagePartCoreData.aO(messageIdTypeC);
                        ((bauh) baxeVar.j.b()).b(messagePartCoreData, messageCoreData2.A());
                    }
                    baxeVar.V(messageCoreData2.A(), messageIdTypeC, messageCoreData2.K());
                }
            }
        });
    }

    public final void Q(final MessageCoreData messageCoreData, final List list) {
        cqaz.h();
        ((dqsn) this.p.b()).d("MessageDatabaseOperations#updateMessageAndParts", new Runnable() { // from class: baux
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = list.iterator();
                while (true) {
                    MessageCoreData messageCoreData2 = messageCoreData;
                    baxe baxeVar = this.a;
                    if (!it.hasNext()) {
                        baxeVar.V(messageCoreData2.A(), messageCoreData2.C(), messageCoreData2.K());
                        return;
                    }
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    String[] strArr = PartsTable.a;
                    bsjh bsjhVar = new bsjh();
                    bsjhVar.ap("updateMessageAndParts");
                    ContentValues contentValuesR = messagePartCoreData.r();
                    ContentValues contentValues = bsjhVar.a;
                    contentValues.clear();
                    contentValues.putAll(contentValuesR);
                    ((bbae) baxeVar.f.b()).f(messageCoreData2.A(), messageCoreData2.C(), messagePartCoreData.W(), bsjhVar);
                }
            }
        });
    }

    public final void R(ConversationIdType conversationIdType, MessageIdType messageIdType, brdu brduVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#updateMessageRow");
        try {
            cqaz.h();
            V(conversationIdType, messageIdType, brduVar);
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

    public final boolean S(final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#hasUnreadMessagesForConversation");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("hasUnreadMessagesForConversation1");
            brdrVarD.h(new Function() { // from class: bavu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    brecVar.m(conversationIdType2);
                    brdr brdrVarD2 = MessagesTable.d();
                    brdrVarD2.A("hasUnreadMessagesForConversation2");
                    brdrVarD2.h(new Function() { // from class: bavx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            cqce cqceVar2 = baxe.a;
                            brecVar2.m(conversationIdType2);
                            brecVar2.O(false);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brecVar.ar(new dqwh(brdrVarD2.b()));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
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

    public final boolean T(brdt brdtVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        if (brdtVar.e() <= 0) {
            return false;
        }
        ((bxlc) this.h.b()).l(conversationIdType, messageIdType, brdtVar.p());
        return true;
    }

    public final boolean U(MessageCoreData messageCoreData) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperationsImpl#updateMessageMetadata");
        try {
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            MessageIdType messageIdTypeC = messageCoreData.C();
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("updateMessageMetadata");
            brduVar.U(messageCoreData.k());
            brduVar.F(messageCoreData.cN());
            brduVar.v(messageCoreData.cM());
            brduVar.G(messageCoreData.o());
            brduVar.O(messageCoreData.r());
            brduVar.R(messageCoreData.s());
            brduVar.t(messageCoreData.l());
            brduVar.D(messageCoreData.n());
            boolean zV = V(conversationIdTypeA, messageIdTypeC, brduVar);
            eieuVarK.close();
            return zV;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean V(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final brdu brduVar) {
        cqaz.h();
        return ((Boolean) ((dqsn) this.p.b()).c("MessageDatabaseOperationsImpl#updateMessageRowIfExists", new ejxr() { // from class: bavm
            @Override // defpackage.ejxr
            public final Object get() {
                brdu brduVar2 = brduVar;
                brduVar2.ap("updateMessageRowIfExists");
                final MessageIdType messageIdType2 = messageIdType;
                brduVar2.X(new Function() { // from class: baxc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar.p(messageIdType2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdt brdtVarB = brduVar2.b();
                if (brdtVarB.e() <= 0) {
                    return false;
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                baxe baxeVar = this.a;
                ((bxlc) baxeVar.h.b()).l(conversationIdType2, messageIdType2, brdtVarB.p());
                if (brdtVarB.n("message_status")) {
                    int iA = brdtVarB.a();
                    if (!avbn.d.contains(Integer.valueOf(iA)) && !baea.aa(iA)) {
                        ((bakt) baxeVar.g.b()).U(conversationIdType2, null, false);
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    public final ekgb X(ConversationIdType conversationIdType, String str, boolean z) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestOrLatestIncomingMessagesByConversationAndSender");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.W(str);
            brecVar.aj(100, 117);
            ekgb ekgbVarAe = ae(new brdv(brecVar), 1, z);
            eieuVarK.close();
            return ekgbVarAe;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb Y(ConversationIdType conversationIdType, int i) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestIncomingMessagesPerProtocolForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(100, 117);
            brecVar.J(i);
            ekgb ekgbVarI = I(new brdv(brecVar), 1);
            if (ekgbVarI == null) {
                int i2 = ekgb.d;
                ekgbVarI = ekoe.a;
            }
            eieuVarK.close();
            return ekgbVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void Z(ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#markUndeliveredAsFallbackReady");
        try {
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("markUndeliveredAsFallbackReady");
            brduVar.U(14);
            brduVar.X(new Function() { // from class: bavy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.p(messageIdType);
                    brecVar.J(3);
                    brecVar.ae(1);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (brduVar.b().e() > 0) {
                ((bxlc) this.h.b()).l(conversationIdType, messageIdType, "message_status");
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

    public final void ab(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData, final boolean z) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#updateDraftMessageData");
        try {
            cqaz.h();
            cqaz.d(1, 1, 2);
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

    public final long e(final ConversationIdType conversationIdType) {
        long jL;
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestIncomingReadMessageTimestampMs");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getLatestIncomingReadMessageTimestampMs");
            brdrVarD.n(new dqxl("MAX($V)", new Object[]{MessagesTable.c.i}), "max_timestamp_expression");
            brdrVarD.h(new Function() { // from class: bawt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.m(conversationIdType);
                    brecVar.A(false);
                    brecVar.aj(100, 117);
                    brecVar.O(true);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brap brapVar = (brap) brdrVarD.b().p();
            try {
                if (brapVar.moveToFirst()) {
                    jL = brapVar.l();
                    brapVar.close();
                } else {
                    brapVar.close();
                    jL = 0;
                }
                eieuVarK.close();
                return jL;
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

    public final MessageCoreData f(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestIncomingMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(100, 117);
            MessageCoreData messageCoreDataG = g(new brdv(brecVar));
            eieuVarK.close();
            return messageCoreDataG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData g(brdv brdvVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestMessage");
        try {
            MessageCoreData messageCoreDataAd = ad(brdvVar, true);
            eieuVarK.close();
            return messageCoreDataAd;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData h(ConversationIdType conversationIdType, String str, boolean z) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestOrLatestIncomingMessageByConversationAndSender");
        try {
            ekgb ekgbVarX = X(conversationIdType, str, z);
            MessageCoreData messageCoreData = null;
            if (ekgbVarX != null && ekgbVarX.size() == 1) {
                messageCoreData = (MessageCoreData) ekgbVarX.get(0);
            }
            eieuVarK.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData i(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestOutgoingMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(1, 25);
            brecVar.am(avbn.d);
            MessageCoreData messageCoreDataG = g(new brdv(brecVar));
            eieuVarK.close();
            return messageCoreDataG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData j(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getEarliestVisibleMessageForConversation");
        try {
            MessageCoreData messageCoreDataG = g(new brdv(E(conversationIdType)));
            eieuVarK.close();
            return messageCoreDataG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData k(ConversationIdType conversationIdType, long j) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getFirstVisibleMessageOrTombstoneAfterTimestamp");
        try {
            brec brecVarD = D(conversationIdType, false);
            brecVarD.Q(j);
            MessageCoreData messageCoreDataG = g(new brdv(brecVarD));
            eieuVarK.close();
            return messageCoreDataG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData l(ConversationIdType conversationIdType, long j) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLastVisibleMessageOrTombstoneBeforeTimestamp");
        try {
            brec brecVarD = D(conversationIdType, false);
            brecVarD.S(j);
            MessageCoreData messageCoreDataN = n(new brdv(brecVarD));
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

    public final MessageCoreData m(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestInitializingEtouffeeTombstoneForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.A(false);
            brecVar.ai(213, 219, 226, 229);
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData n(brdv brdvVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestMessage");
        try {
            MessageCoreData messageCoreDataAd = ad(brdvVar, false);
            eieuVarK.close();
            return messageCoreDataAd;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData o(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData p(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestProtocoledMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.am(avbn.d);
            brecVar.A(false);
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData q(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestOutgoingMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.aj(1, 25);
            brecVar.am(avbn.d);
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData r(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestSatelliteMessageForConversation");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.ai(251, 239);
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData s(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestVisibleMessageForConversation");
        try {
            MessageCoreData messageCoreDataN = n(new brdv(E(conversationIdType)));
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

    public final MessageCoreData t(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestVisibleMessageOrEtouffeeTombstoneExcludingMessage");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.m(conversationIdType);
            brecVar.z(messageIdType);
            brecVar.am(avbn.d);
            brecVar.A(false);
            if (((arvu) this.r.b()).a()) {
                brecVar.am(avbn.e);
            }
            if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
                brecVar.b(new Function() { // from class: bawv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.ak();
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: baww
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.af();
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bawx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.ah(avbn.a);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bawy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.ae(242);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                brecVar.b(new Function() { // from class: bawz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.ak();
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: baxa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.af();
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: baxb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar2 = (brec) obj;
                        cqce cqceVar = baxe.a;
                        brecVar2.ah(avbn.a);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
            MessageCoreData messageCoreDataN = n(new brdv(brecVar));
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

    public final MessageCoreData u(final MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getMessageWithoutParts");
        try {
            MessageCoreData messageCoreData = (MessageCoreData) MessagesTable.j(messageIdType, new Function() { // from class: baup
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    baxe baxeVar = this.a;
                    MessageCoreData messageCoreDataA = ((bveg) baxeVar.e.b()).a();
                    messageCoreDataA.aN((MessagesTable.BindData) obj);
                    baxeVar.O(messageCoreDataA);
                    return messageCoreDataA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Supplier() { // from class: bauq
                @Override // java.util.function.Supplier
                public final Object get() {
                    cqbd cqbdVarE = baxe.a.e();
                    cqbdVarE.I("no message found for");
                    cqbdVarE.d(messageIdType);
                    cqbdVarE.r();
                    return null;
                }
            });
            eieuVarK.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData v(String str) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readCloudSyncMessageData");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.d(str);
            MessageCoreData messageCoreDataB = B(new brdv(brecVar));
            eieuVarK.close();
            return messageCoreDataB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData w(MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageAndParts");
        try {
            cqaz.h();
            MessageCoreData messageCoreDataA = A(messageIdType);
            if (messageCoreDataA != null) {
                ((bbae) this.f.b()).c(messageCoreDataA, false);
                O(messageCoreDataA);
            }
            eieuVarK.close();
            return messageCoreDataA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData x(basd basdVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageByRcsId");
        try {
            cqaz.h();
            MessageCoreData messageCoreDataY = y(basdVar);
            if (messageCoreDataY != null) {
                ((bbae) this.f.b()).c(messageCoreDataY, false);
                O(messageCoreDataY);
            }
            eieuVarK.close();
            return messageCoreDataY;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData y(basd basdVar) {
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageDataByRcsId");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.N(basdVar);
            brdv brdvVar = new brdv(brecVar);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("readMessageDataByRcsId");
            brdrVarD.k(brdvVar);
            Stream map = Collection.EL.stream(brdrVarD.b().z()).filter(new Predicate() { // from class: bawb
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
                public final boolean test(Object obj) {
                    return Objects.nonNull((MessagesTable.BindData) obj);
                }
            }).map(new Function() { // from class: bawc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageCoreData messageCoreDataA = ((bveg) this.a.e.b()).a();
                    messageCoreDataA.aN((MessagesTable.BindData) obj);
                    return messageCoreDataA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            if (ekgbVar.size() <= 1) {
                MessageCoreData messageCoreData = ekgbVar.isEmpty() ? null : (MessageCoreData) ekgbVar.get(0);
                eieuVarK.close();
                return messageCoreData;
            }
            ejyb.c(ekgbVar.size() == 2, "Violation of the unique rcs_message_id_and_seen_index on the MessagesTable", new Object[0]);
            cnpp cnppVar = (cnpp) this.q.b();
            MessageCoreData messageCoreData2 = (MessageCoreData) ekgbVar.get(0);
            MessageCoreData messageCoreData3 = (MessageCoreData) ekgbVar.get(1);
            ejwl.a(messageCoreData2.F().equals(messageCoreData3.F()));
            enpb enpbVarA = messageCoreData2.C().a < messageCoreData3.C().a ? cnpp.a(messageCoreData2, messageCoreData3) : cnpp.a(messageCoreData3, messageCoreData2);
            aill aillVar = (aill) cnppVar.b.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.DUPLICATE_RCS_MESSAGE_ID_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b = 1 | ellhVar.b;
            enpbVarA.copyOnWrite();
            enpf enpfVar = (enpf) enpbVarA.instance;
            enpf enpfVar2 = enpf.a;
            enpfVar.g = 2;
            enpfVar.b |= 16;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            enpf enpfVar3 = (enpf) enpbVarA.build();
            enpfVar3.getClass();
            ellhVar2.bk = enpfVar3;
            ellhVar2.f |= 131072;
            aillVar.j(ellgVar);
            throw new IllegalStateException("Expected 1 message but found 2 with the same RCS message ID");
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData z(final Uri uri) {
        MessageCoreData messageCoreDataA;
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageNoParts Uri");
        try {
            cqaz.h();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("readMessageData1");
            brdrVarD.h(new Function() { // from class: bauo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar.aa(uri);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
            if (bindData != null) {
                messageCoreDataA = ((bveg) this.e.b()).a();
                messageCoreDataA.aN(bindData);
            } else {
                messageCoreDataA = null;
            }
            eieuVarK.close();
            return messageCoreDataA;
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
