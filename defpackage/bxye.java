package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.AnnotationSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxye implements bxxd {
    public static final /* synthetic */ int a = 0;
    private static final String b;
    private final bxym c;
    private final fcsu d;

    static {
        bcur bcurVar = bcve.b;
        b = "case when (" + bcurVar.a.toString() + " in (%s)) then 0 else 1 end, " + bcurVar.b.toString() + " DESC";
    }

    public bxye(bxym bxymVar, fcsu fcsuVar) {
        this.c = bxymVar;
        this.d = fcsuVar;
    }

    public static dqxe t(dqpo dqpoVar, long j, long j2) {
        return new dqxl("$V >= $V AND $V < $V", new Object[]{dqpoVar, Long.valueOf(j), dqpoVar, Long.valueOf(j2)});
    }

    static List u(ConversationIdType conversationIdType, String str, Collection collection, boolean z) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getUrlsForSearch");
        try {
            cqaz.h();
            eyzy eyzyVar = eyzy.LINK_ANNOTATION;
            bpzr bpzrVarV = v(eyzyVar, conversationIdType, collection);
            final bpzr bpzrVarV2 = v(eyzy.ADDRESS_ANNOTATION, conversationIdType, null);
            final bpzr bpzrVarV3 = v(eyzy.ASSISTANT_ANNOTATION, conversationIdType, null);
            bpzs bpzsVarA = bpzx.a();
            bpzsVarA.d(new Function() { // from class: bxxt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = bxye.a;
                    return ((bpzc) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bpzsVarA.e(new Function() { // from class: bxxu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpzw bpzwVar = (bpzw) obj;
                    int i = bxye.a;
                    bpzwVar.f(bpzrVarV3);
                    bpzwVar.f(bpzrVarV2);
                    return bpzwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bpzr bpzrVarB = bpzsVarA.b();
            bmeo bmeoVarA = UrlSearchQuery.a();
            bmeoVarA.A("+getUrlsForSearch");
            bmeq bmeqVar = new bmeq();
            int iIntValue = UrlSearchQuery.c().intValue();
            if (iIntValue < 20040) {
                dqru.x("message_id", iIntValue);
            }
            bmeqVar.ap(new dqpk("messages_annotations.message_id", 3, bpzrVarV));
            bmeqVar.ap(new dqty("messages_annotations.annotation_type", 1, Integer.valueOf(eyzyVar.a())));
            int iIntValue2 = UrlSearchQuery.c().intValue();
            if (iIntValue2 < 20040) {
                dqru.x("message_id", iIntValue2);
            }
            bmeqVar.ap(new dqpk("messages_annotations.message_id", 4, bpzrVarB));
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                bxyf.b(sb, str);
                bmeqVar.ar(new dqxm(sb.toString()));
            }
            if (z) {
                bmeqVar.ap(new dqpn("message_star._id", 6));
            }
            bmeqVar.ap(new dqpn("parent_disallowed_conversations.conversation_id", 5));
            bmeoVarA.s();
            bmeoVarA.k(new bmep(bmeqVar));
            bmei bmeiVar = UrlSearchQuery.b;
            bmeoVarA.D((String) DesugarArrays.stream(new bmel[]{new bmel(bmeiVar.a), new bmel(bmeiVar.b)}).map(new Function() { // from class: bmen
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bmel) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", ")));
            ekgb ekgbVarB = bmeoVarA.b().B(new Supplier() { // from class: bxxv
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new UrlSearchResult();
                }
            });
            eieuVarK.close();
            return ekgbVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static bpzr v(eyzy eyzyVar, ConversationIdType conversationIdType, Collection collection) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getMessageIdsForSearchQuery");
        try {
            String[] strArr = bpzx.a;
            bpzw bpzwVar = new bpzw();
            bpzwVar.b(eyzyVar.a());
            if (!conversationIdType.b()) {
                bpzwVar.ap(new dqpj("messages_annotations.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
            }
            if (collection != null && !collection.isEmpty()) {
                bpzwVar.ap(new dqpm("messages_annotations._id", 3, bpzw.au((String[]) ((ArrayList) Collection.EL.stream(collection).map(new Function() { // from class: bxxh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = bxye.a;
                        return ((Long) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bxxy()))).toArray(new String[0])), false));
            }
            bpzs bpzsVarA = bpzx.a();
            bpzsVarA.A("getMessageIdsForSearchQuery");
            bpzsVarA.d(new Function() { // from class: bxxi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = bxye.a;
                    return ((bpzc) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bpzsVarA.w(bpzx.c.c);
            bpzsVarA.k(new bpzv(bpzwVar));
            bpzr bpzrVarB = bpzsVarA.b();
            eieuVarK.close();
            return bpzrVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final bxut w(final String str, bxwf bxwfVar, int i) {
        bxtv bxtvVar;
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getConversations");
        try {
            if (bxwfVar.f() && TextUtils.isEmpty(str)) {
                bxtvVar = null;
            } else {
                ekhx ekhxVar = (ekhx) Collection.EL.stream(bxwfVar.d().entrySet()).filter(new Predicate() { // from class: bxxq
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
                        int i2 = bxye.a;
                        return ((Long) ((Map.Entry) obj).getValue()).longValue() == -1;
                    }
                }).map(new Function() { // from class: bxxr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (ConversationIdType) ((Map.Entry) obj).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
                java.util.Collection collectionC = bxwfVar.c();
                eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getConversationsForSearch");
                try {
                    cqaz.h();
                    String[] strArr = MessagesTable.a;
                    brec brecVar = new brec();
                    brecVar.am(avbn.d);
                    if (((askz) this.d.b()).a()) {
                        int iIntValue = MessagesTable.g().intValue();
                        if (iIntValue < 30010) {
                            dqru.x("is_hidden", iIntValue);
                        }
                        brecVar.ap(new dqty("messages.is_hidden", 2, 1));
                    }
                    final ConversationIdType[] conversationIdTypeArr = (ConversationIdType[]) ((ArrayList) Collection.EL.stream(ekhxVar).collect(Collectors.toCollection(new bxxy()))).toArray(new ConversationIdType[0]);
                    String[] strArr2 = bktl.a;
                    bkti bktiVar = new bkti(bktl.a);
                    bktiVar.d(new Function() { // from class: bxxz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bktk bktkVar = (bktk) obj;
                            int i2 = bxye.a;
                            bktkVar.b(str);
                            return bktkVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bktiVar.c(new Function() { // from class: bxya
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i2 = bxye.a;
                            return ((bkte) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bkth bkthVarB = bktiVar.b();
                    if (!collectionC.isEmpty() || !ekhxVar.isEmpty()) {
                        final MessageIdType[] messageIdTypeArr = (MessageIdType[]) ((ArrayList) Collection.EL.stream(collectionC).collect(Collectors.toCollection(new bxxy()))).toArray(new MessageIdType[0]);
                        brecVar.b(new Function() { // from class: bxyb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar2 = (brec) obj;
                                int i2 = bxye.a;
                                brecVar2.u(messageIdTypeArr);
                                return brecVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: bxyc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar2 = (brec) obj;
                                int i2 = bxye.a;
                                brecVar2.ap(new dqpm("messages.conversation_id", 3, brec.as((Iterable) DesugarArrays.stream(conversationIdTypeArr).map(new Function() { // from class: brdy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return String.valueOf(barn.a((ConversationIdType) obj2));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new brdz()))), true));
                                return brecVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                    if (!TextUtils.isEmpty(str)) {
                        brecVar.ap(new dqpk("messages.conversation_id", 3, bkthVarB));
                    }
                    brdr brdrVarD = MessagesTable.d();
                    bran branVar = MessagesTable.c;
                    brdrVarD.c(branVar.a);
                    brdrVarD.n(new dqxl("MAX($V)", new Object[]{branVar.i}), "max_received_timestamp_expression");
                    brdrVarD.g(brecVar);
                    brao braoVar = branVar.b;
                    brdrVarD.w(braoVar);
                    brdp brdpVarB = brdrVarD.b();
                    String[] strArr3 = bcve.a;
                    bcvd bcvdVar = new bcvd();
                    bcvdVar.ap(new dqpk("messages._id", 3, new dqxl(" (SELECT $R FROM ($R)) ", new Object[]{"_id", brdpVarB.J()})));
                    brdr brdrVarD2 = MessagesTable.d();
                    brdrVarD2.c(braoVar);
                    brdrVarD2.h(new Function() { // from class: bxyd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar2 = (brec) obj;
                            int i2 = bxye.a;
                            brecVar2.n(new dqxl("$V", new Object[]{botm.c.a}));
                            brecVar2.b(new Function() { // from class: bxxn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar3 = (brec) obj2;
                                    int i3 = bxye.a;
                                    brecVar3.ak();
                                    return brecVar3;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: bxxo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar3 = (brec) obj2;
                                    int i3 = bxye.a;
                                    brecVar3.af();
                                    return brecVar3;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD2.w(braoVar);
                    brdrVarD2.x(new dqxl("COUNT($V{p}) > 0", new Object[]{braoVar}));
                    final brdp brdpVarB2 = brdrVarD2.b();
                    bcvdVar.b(new Function() { // from class: bxxf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bcvd bcvdVar2 = (bcvd) obj;
                            int i2 = bxye.a;
                            int iIntValue2 = bcve.d().intValue();
                            if (iIntValue2 < 10007) {
                                dqru.x("conv_type", iIntValue2);
                            }
                            brdp brdpVar = brdpVarB2;
                            bcvdVar2.ap(new dqty("conversations.conv_type", 1, 0));
                            bcvdVar2.e(new dqxl("($R)", new Object[]{brdpVar.J()}));
                            return bcvdVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bxxg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bcvd bcvdVar2 = (bcvd) obj;
                            int i2 = bxye.a;
                            int iIntValue2 = bcve.d().intValue();
                            if (iIntValue2 < 10007) {
                                dqru.x("conv_type", iIntValue2);
                            }
                            bcvdVar2.ap(new dqty("conversations.conv_type", 2, 0));
                            return bcvdVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bcuy bcuyVarB = bbth.b();
                    bcuyVarB.w(bcve.b.a);
                    bcuyVarB.D(String.format(Locale.US, b, new ejwc(",").f(conversationIdTypeArr)));
                    bcuyVarB.d(bcvdVar);
                    bcuyVarB.y(i);
                    bcut bcutVar = (bcut) bcuyVarB.b().p();
                    eieuVarK2.close();
                    Cursor cursorA = bcutVar.a();
                    axie.l(cursorA);
                    bxut bxutVar = bxut.c;
                    bxtvVar = new bxtv(cursorA, ekhxVar);
                } finally {
                }
            }
            eieuVarK.close();
            return bxtvVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxxd
    public final long a(int i) {
        eieu eieuVarK;
        eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getLastId");
        long j = 0;
        try {
            if (i == 1) {
                eieu eieuVarK3 = eiiy.k("messages");
                try {
                    String[] strArr = MessageWithTextIdsQuery.a;
                    bkku bkkuVar = new bkku(MessageWithTextIdsQuery.a);
                    bkkuVar.A("getLastId-messages");
                    bkkuVar.y(1);
                    bkkuVar.D((String) DesugarArrays.stream(new bkkr[]{new bkkr(MessageWithTextIdsQuery.b.a)}).map(new Function() { // from class: bkkt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bkkr) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    bkkq bkkqVar = (bkkq) bkkuVar.b().p();
                    try {
                        if (bkkqVar.moveToNext()) {
                            j = bkkqVar.getLong(0);
                            bkkqVar.close();
                        } else {
                            bkkqVar.close();
                        }
                        eieuVarK3.close();
                    } finally {
                    }
                } finally {
                    try {
                        eieuVarK3.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else if (i == 2) {
                eieuVarK = eiiy.k("conversations");
                try {
                    botb botbVarE = botm.e();
                    botbVarE.A("getLastId-conversations");
                    botbVarE.d();
                    botbVarE.s();
                    botbVarE.y(1);
                    botbVarE.g(new Function() { // from class: bxxw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int i2 = bxye.a;
                            return ((bopp) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    botbVarE.e(new bosy(botm.c.a, false));
                    bopr boprVar = (bopr) botbVarE.b().p();
                    try {
                        if (boprVar.moveToNext()) {
                            j = boprVar.h().a;
                            boprVar.close();
                        } else {
                            boprVar.close();
                        }
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else if (i == 3) {
                eieuVarK = eiiy.k("participants");
                try {
                    String[] strArr2 = ParticipantIdsQuery.a;
                    bkox bkoxVar = new bkox(ParticipantIdsQuery.a);
                    bkoxVar.A("getLastId-participants");
                    bkoxVar.s();
                    bkoxVar.y(1);
                    bkoxVar.D((String) DesugarArrays.stream(new bkou[]{new bkou(ParticipantIdsQuery.b.a)}).map(new Function() { // from class: bkow
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bkou) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    bkot bkotVar = (bkot) bkoxVar.b().p();
                    try {
                        if (bkotVar.moveToNext()) {
                            j = bkotVar.getLong(0);
                            bkotVar.close();
                        } else {
                            bkotVar.close();
                        }
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                }
            } else if (i != 4) {
                ejwl.m(false, "Unknown table type");
            } else {
                eieuVarK = eiiy.k("annotations");
                try {
                    String[] strArr3 = LocationAndLinkAnnotationIdsQuery.a;
                    bhku bhkuVar = new bhku(LocationAndLinkAnnotationIdsQuery.a);
                    bhkuVar.A("getLastId-messages_annotations");
                    bhkuVar.y(1);
                    bhkuVar.D((String) DesugarArrays.stream(new bhkr[]{new bhkr(LocationAndLinkAnnotationIdsQuery.b.a)}).map(new Function() { // from class: bhkt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bhkr) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                    bhkq bhkqVar = (bhkq) bhkuVar.b().p();
                    try {
                        if (bhkqVar.moveToNext()) {
                            j = bhkqVar.getLong(0);
                            bhkqVar.close();
                        } else {
                            bhkqVar.close();
                        }
                        eieuVarK.close();
                    } finally {
                    }
                } finally {
                }
            }
            eieuVarK2.close();
            return j;
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.bxxd
    public final bojh b(final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getConversation");
        try {
            botb botbVarE = botm.e();
            botbVarE.A("DatabaseSearchOperations#getConversation");
            botbVarE.d();
            botbVarE.i(new Function() { // from class: bxxs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    int i = bxye.a;
                    botlVar.r(conversationIdType);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                bojh bojhVar = (bojh) boprVar.cS();
                boprVar.close();
                eieuVarK.close();
                return bojhVar;
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

    @Override // defpackage.bxxd
    public final MessagesTable.BindData c(MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getMessage");
        try {
            MessagesTable.BindData bindDataB = MessagesTable.b(messageIdType);
            eieuVarK.close();
            return bindDataB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxxd
    public final ParticipantsTable.BindData d(String str) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getParticipant");
        try {
            ParticipantsTable.BindData bindDataB = ParticipantsTable.b(str);
            eieuVarK.close();
            return bindDataB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxxd
    public final bxut e(bcvd bcvdVar) {
        bcuy bcuyVarC = bbth.c();
        bcur bcurVar = bcve.b;
        bcuyVarC.w(bcurVar.a);
        bcuyVarC.c(new bcuv(bcurVar.b, false));
        bcuyVarC.d(bcvdVar);
        Cursor cursorA = ((bcut) bcuyVarC.b().p()).a();
        axie.l(cursorA);
        ekon ekonVar = ekon.a;
        bxut bxutVar = bxut.c;
        return new bxtv(cursorA, ekonVar);
    }

    @Override // defpackage.bxxd
    public final bxut f(String str, bxwf bxwfVar) {
        return w(str, bxwfVar, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.bxxd
    public final bxut g(String str, bxwf bxwfVar, int i) {
        return w(str, bxwfVar, i);
    }

    @Override // defpackage.bxxd
    public final bxut h(ConversationIdType conversationIdType, final String str, java.util.Collection collection, int i) {
        String[] strArr = bcve.a;
        bcvd bcvdVar = new bcvd();
        bcvdVar.ap(new dqpj("parts.content_type", 1, "text/plain"));
        bcvdVar.ap(new dqpn("message_star._id", 6));
        if (!conversationIdType.b()) {
            bcvdVar.ap(new dqpj("messages.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
        }
        if (!collection.isEmpty()) {
            ekfw ekfwVar = new ekfw();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
            }
            bcvdVar.ap(new dqpm("messages._id", 3, bcvd.as(ekfwVar.g()), true));
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArr2 = bktl.a;
            bkti bktiVar = new bkti(bktl.a);
            bktiVar.A("subqueryForParticipants");
            bktiVar.d(new Function() { // from class: bxxj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bktk bktkVar = (bktk) obj;
                    int i2 = bxye.a;
                    bktkVar.b(str);
                    return bktkVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bktiVar.c(new Function() { // from class: bxxk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i2 = bxye.a;
                    return ((bkte) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bcvdVar.e(bktiVar.b());
        }
        bcuy bcuyVarB = bbth.b();
        bcuyVarB.c(new bcuv(bcve.b.c, false));
        bcuyVarB.d(bcvdVar);
        bcuyVarB.y(i);
        Cursor cursorA = ((bcut) bcuyVarB.b().p()).a();
        axie.l(cursorA);
        ekon ekonVar = ekon.a;
        bxut bxutVar = bxut.c;
        return new bxtv(cursorA, ekonVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bxxd
    public final List i(ConversationIdType conversationIdType, String str, bxwf bxwfVar, boolean z) {
        java.util.Collection collectionB;
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getLocations");
        if (bxwfVar != null) {
            try {
                collectionB = bxwfVar.b();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            collectionB = null;
        }
        eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getAddressAnnotationForSearch");
        try {
            cqaz.h();
            bpzr bpzrVarV = v(eyzy.ADDRESS_ANNOTATION, conversationIdType, collectionB);
            String[] strArr = LocationSearchQuery.a;
            bibt bibtVar = new bibt();
            int iIntValue = LocationSearchQuery.c().intValue();
            if (iIntValue < 20040) {
                dqru.x("message_id", iIntValue);
            }
            bibtVar.ap(new dqpk("messages_annotations.message_id", 3, bpzrVarV));
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                bxyf.b(sb, str);
                bibtVar.ar(new dqxm(sb.toString()));
            }
            if (z) {
                bibtVar.ap(new dqpn("message_star._id", 6));
            }
            bibtVar.ap(new dqpn("parent_disallowed_conversations.conversation_id", 5));
            bibr bibrVarA = LocationSearchQuery.a();
            bibrVarA.A("+getAddressAnnotationForSearch");
            bibrVarA.k(new bibs(bibtVar));
            bibrVarA.s();
            bibl biblVar = LocationSearchQuery.b;
            bibrVarA.D((String) DesugarArrays.stream(new bibo[]{new bibo(biblVar.b), new bibo(biblVar.a)}).map(new Function() { // from class: bibq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bibo) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", ")));
            List listB = bibrVarA.b().B(new Supplier() { // from class: bxxx
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new AnnotationSearchResult();
                }
            });
            eieuVarK2.close();
            List listU = u(conversationIdType, str, collectionB, z);
            bxym bxymVar = this.c;
            if (listB == null) {
                listB = new ArrayList();
            }
            if (listU == null) {
                listU = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            Map mapA = bxym.a(listB, new Function() { // from class: bxyg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String strB = ((AnnotationSearchResult) obj).f().b();
                    strB.getClass();
                    return strB;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Predicate() { // from class: bxyh
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
                    ezds ezdsVarG = ((AnnotationSearchResult) obj).g();
                    if (ezdsVarG == null || ezdsVarG.c != 7) {
                        return false;
                    }
                    ezbd ezbdVar = (ezbd) ezdsVarG.d;
                    int i = ezbdVar.b;
                    int i2 = i & 4;
                    if ((i & 1) == 0 && i2 == 0) {
                        return false;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    ezev ezevVar = ezbdVar.c;
                    if (ezevVar == null) {
                        ezevVar = ezev.a;
                    }
                    return (ezevVar.b.isEmpty() && ezevVar.c.isEmpty() && ezevVar.d.isEmpty()) ? false : true;
                }
            });
            Map mapA2 = bxym.a(listU, new Function() { // from class: bxyi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String strB = ((UrlSearchResult) obj).k().b();
                    strB.getClass();
                    return strB;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Predicate() { // from class: bxyj
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
                    return bxym.b((UrlSearchResult) obj);
                }
            });
            ekqg it = ekpg.d(mapA.keySet(), mapA2.keySet()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                ekgb ekgbVar2 = (ekgb) Map.EL.getOrDefault(mapA, str2, ekgbVar);
                ekgbVar2.getClass();
                ekgb<UrlSearchResult> ekgbVar3 = (ekgb) Map.EL.getOrDefault(mapA2, str2, ekgbVar);
                ekgbVar3.getClass();
                if (!ekgbVar3.isEmpty() && ekgbVar2.isEmpty()) {
                    for (UrlSearchResult urlSearchResult : ekgbVar3) {
                        bxtw bxtwVar = new bxtw();
                        bxtwVar.s(urlSearchResult, bxymVar.a);
                        arrayList.add(bxtwVar.b());
                    }
                } else if (ekgbVar3.isEmpty()) {
                    Iterator<E> it2 = ekgbVar2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new bxtw().r((AnnotationSearchResult) it2.next(), bxymVar.a).b());
                    }
                } else {
                    if (ekgbVar2.size() == 1 && ekgbVar3.size() == 1) {
                        ezds ezdsVarL = ((UrlSearchResult) ekgbVar3.get(0)).l();
                        ezds ezdsVarG = ((AnnotationSearchResult) ekgbVar2.get(0)).g();
                        ezdsVarG.getClass();
                        if (ezdsVarL != null) {
                            if (!(ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a).c.isEmpty()) {
                                String str3 = (ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a).c;
                                ezet ezetVar = (ezdsVarG.c == 7 ? (ezbd) ezdsVarG.d : ezbd.a).e;
                                if (ezetVar == null) {
                                    ezetVar = ezet.a;
                                }
                                if (str3.equalsIgnoreCase(ezetVar.f)) {
                                    bxtw bxtwVar2 = new bxtw();
                                    UrlSearchResult urlSearchResult2 = (UrlSearchResult) ekgbVar3.get(0);
                                    alrj alrjVar = bxymVar.a;
                                    bxtwVar2.s(urlSearchResult2, alrjVar);
                                    arrayList.add(bxtwVar2.r((AnnotationSearchResult) ekgbVar2.get(0), alrjVar).b());
                                }
                            }
                        }
                    }
                    for (UrlSearchResult urlSearchResult3 : ekgbVar3) {
                        bxtw bxtwVar3 = new bxtw();
                        bxtwVar3.s(urlSearchResult3, bxymVar.a);
                        arrayList.add(bxtwVar3.b());
                    }
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: bxyk
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    bxuy bxuyVar = (bxuy) obj;
                    bxuy bxuyVar2 = (bxuy) obj2;
                    return bxuyVar.b() != bxuyVar2.b() ? Long.compare(bxuyVar2.b(), bxuyVar.b()) : Long.compare(bxuyVar2.d().a, bxuyVar.d().a);
                }
            });
            eieuVarK.close();
            return arrayList;
        } finally {
        }
    }

    @Override // defpackage.bxxd
    public final List j(ConversationIdType conversationIdType, java.util.Collection collection) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getMessageIdsOrderedByTimeExcludingDraft");
        try {
            ArrayList arrayList = new ArrayList();
            if (!collection.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(collection);
                String str = bjdl.a;
                String[] strArr = bjju.a;
                bjjp bjjpVar = new bjjp(bjju.a);
                bjjpVar.A("+queryConversationMessageIdsByTimeQuerySql");
                bjjpVar.o(bjdl.d, "messages.received_timestamp");
                bjjpVar.o(bjdl.b, "ASC");
                bjjpVar.o(bjdl.a, conversationIdType.a());
                bjjpVar.o(bjdl.c, "messages.message_status <> 3");
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    final MessageIdType[] messageIdTypeArr = new MessageIdType[size];
                    for (int i = 0; i < size; i++) {
                        messageIdTypeArr[i] = (MessageIdType) arrayList2.get(i);
                    }
                    bjjpVar.d(new Function() { // from class: bjdi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bjjt bjjtVar = (bjjt) obj;
                            String str2 = bjdl.a;
                            bjjtVar.ap(new dqpm("messages._id", 3, bjjt.as((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bjjs
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return String.valueOf(bary.a((MessageIdType) obj2));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: bjjr
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }))), true));
                            return bjjtVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                bjjl bjjlVar = (bjjl) bjjpVar.b().p();
                while (bjjlVar.moveToNext()) {
                    try {
                        arrayList.add(bjjlVar.c());
                    } finally {
                    }
                }
                bjjlVar.close();
            }
            eieuVarK.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxxd
    public final List k(java.util.Collection collection, final ConversationIdType conversationIdType) {
        ekgb ekgbVarZ;
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getParticipants");
        try {
            if (collection.isEmpty()) {
                int i = ekgb.d;
                ekgbVarZ = ekoe.a;
            } else {
                String[] strArr = new String[collection.size()];
                Iterator it = collection.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    strArr[i2] = String.valueOf(((Long) it.next()).longValue());
                    i2++;
                }
                String[] strArr2 = ParticipantsTable.a;
                bsbx bsbxVar = new bsbx();
                bsbxVar.ap(new dqpm("participants._id", 3, bsbx.au(strArr), false));
                if (!conversationIdType.b()) {
                    String[] strArr3 = boiv.a;
                    boiq boiqVar = new boiq(boiv.a);
                    boiqVar.f(new Function() { // from class: bxxm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            boiu boiuVar = (boiu) obj;
                            int i3 = bxye.a;
                            boiuVar.b(conversationIdType);
                            return boiuVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boiqVar.c(boiv.c.b);
                    bsbxVar.l(boiqVar.b());
                }
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("+DatabaseSearchOperations#getParticipants");
                bsboVarE.g(bsbxVar);
                brzh brzhVar = ParticipantsTable.c;
                bsboVarE.w(brzhVar.r);
                bsboVarE.d(new bsbl(brzhVar.m, true));
                ekgbVarZ = bsboVarE.b().z();
            }
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

    @Override // defpackage.bxxd
    public final List l(final MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getParts");
        try {
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("DatabaseSearchOperations#getParts");
            bsjeVarC.h(new Function() { // from class: bxxp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    int i = bxye.a;
                    bsjlVar.n(messageIdType);
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bsjeVarC.b().z();
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

    @Override // defpackage.bxxd
    public final List m(ConversationIdType conversationIdType, String str, bxwf bxwfVar, boolean z, int i) {
        java.util.Collection collectionA;
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getUrls");
        if (bxwfVar != null) {
            try {
                collectionA = bxwfVar.a();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            collectionA = null;
        }
        Stream streamLimit = Collection.EL.stream(u(conversationIdType, str, collectionA, z)).filter(new Predicate() { // from class: bxxl
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
                int i2 = bxye.a;
                return !bxym.b((UrlSearchResult) obj);
            }
        }).limit(i);
        int i2 = ekgb.d;
        List list = (List) streamLimit.collect(ekcv.a);
        eieuVarK.close();
        return list;
    }

    @Override // defpackage.bxxd
    public final Set n(int i, final long j, final long j2) {
        eieu eieuVarK;
        eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getIndexableIdsInRange");
        try {
            css cssVar = new css();
            if (i == 1) {
                eieu eieuVarK3 = eiiy.k("messages");
                try {
                    String[] strArr = MessageWithTextIdsQuery.a;
                    bkku bkkuVar = new bkku(MessageWithTextIdsQuery.a);
                    bkkuVar.A("getIndexableIdsInRangeOld-messages");
                    bkkuVar.k(new bkkv((bkkw) new Function() { // from class: bxxe
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bkkw bkkwVar = (bkkw) obj;
                            int i2 = bxye.a;
                            bkkwVar.ar(bxye.t(MessageWithTextIdsQuery.b.a, j, j2));
                            return bkkwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bkkw())));
                    bkkq bkkqVar = (bkkq) bkkuVar.b().p();
                    while (bkkqVar.moveToNext()) {
                        try {
                            cssVar.add(Long.valueOf(bkkqVar.c().a));
                        } finally {
                        }
                    }
                    bkkqVar.close();
                    eieuVarK3.close();
                } finally {
                    try {
                        eieuVarK3.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else if (i == 2) {
                eieuVarK = eiiy.k("conversations");
                try {
                    String[] strArr2 = ConversationIdsQuery.a;
                    bbtd bbtdVar = new bbtd(ConversationIdsQuery.a);
                    bbtdVar.A("getIndexableIdsInRangeOld-conversations");
                    ((dqox) bbtdVar.a).o = true;
                    bbtf bbtfVar = new bbtf();
                    bbtfVar.ar(t(ConversationIdsQuery.b.a, j, j2));
                    bbtdVar.k(new bbte(bbtfVar));
                    bbtb bbtbVar = (bbtb) bbtdVar.b().p();
                    while (bbtbVar.moveToNext()) {
                        try {
                            cssVar.add(Long.valueOf(bbtbVar.c().a));
                        } finally {
                        }
                    }
                    bbtbVar.close();
                    eieuVarK.close();
                } finally {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else if (i == 3) {
                eieuVarK = eiiy.k("participants");
                try {
                    String[] strArr3 = ParticipantIdsQuery.a;
                    bkox bkoxVar = new bkox(ParticipantIdsQuery.a);
                    bkoxVar.A("getIndexableIdsInRangeOld-participants");
                    bkoz bkozVar = new bkoz();
                    bkozVar.ar(t(ParticipantIdsQuery.b.a, j, j2));
                    bkoxVar.k(new bkoy(bkozVar));
                    bkot bkotVar = (bkot) bkoxVar.b().p();
                    while (bkotVar.moveToNext()) {
                        try {
                            cssVar.add(Long.valueOf(bkotVar.c()));
                        } finally {
                        }
                    }
                    bkotVar.close();
                    eieuVarK.close();
                } finally {
                }
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unknown table type");
                }
                eieuVarK = eiiy.k("annotations");
                try {
                    String[] strArr4 = LocationAndLinkAnnotationIdsQuery.a;
                    bhku bhkuVar = new bhku(LocationAndLinkAnnotationIdsQuery.a);
                    bhkuVar.A("getIndexableIdsInRangeOld-messages_annotations");
                    bhkw bhkwVar = new bhkw();
                    bhkwVar.ar(t(LocationAndLinkAnnotationIdsQuery.b.a, j, j2));
                    bhkuVar.k(new bhkv(bhkwVar));
                    bhkq bhkqVar = (bhkq) bhkuVar.b().p();
                    while (bhkqVar.moveToNext()) {
                        try {
                            cssVar.add(Long.valueOf(bhkqVar.c()));
                        } finally {
                        }
                    }
                    bhkqVar.close();
                    eieuVarK.close();
                } finally {
                }
            }
            eieuVarK2.close();
            return cssVar;
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.bxxd
    public final void o(String str, ezds ezdsVar) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#replaceAnnotation");
        try {
            eieu eieuVarK2 = eiiy.k("MessageAnnotationDatabaseOperations#updateAnnotationDetails");
            try {
                cqaz.h();
                String[] strArr = bpzx.a;
                bpzu bpzuVar = new bpzu();
                bpzuVar.ap("updateAnnotationDetails");
                if (ezdsVar == null) {
                    bpzuVar.a.putNull("annotation_details");
                } else {
                    bpzuVar.a.put("annotation_details", ezdsVar.toByteArray());
                }
                bpzuVar.am();
                bpzw bpzwVar = new bpzw();
                bpzwVar.ap(new dqpj("messages_annotations._id", 1, String.valueOf(str)));
                bpzuVar.aj(new bpzv(bpzwVar), "messages_annotations-buildAndUpdateForId");
                eieuVarK2.close();
                eieuVarK.close();
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

    @Override // defpackage.bxxd
    public final biwf p(ConversationIdType conversationIdType, String str, boolean z) {
        return q(conversationIdType, str, z, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.bxxd
    public final biwf q(ConversationIdType conversationIdType, String str, boolean z, int i) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getImages");
        try {
            eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getPhotosForSearch");
            try {
                cqaz.h();
                String[] strArr = MediaSearchQuery.a;
                biwl biwlVar = new biwl();
                biwlVar.ar(new dqxm(bxyf.a(str, conversationIdType, Arrays.asList(le.b))));
                if (z) {
                    biwlVar.c();
                }
                biwlVar.b();
                biwj biwjVarA = MediaSearchQuery.a();
                biwjVarA.A("+getPhotosForSearch");
                biwjVarA.d(biwlVar);
                biwjVarA.s();
                biwjVarA.c(new biwg(MediaSearchQuery.b.a));
                biwjVarA.y(i);
                biwf biwfVar = (biwf) biwjVarA.b().p();
                eieuVarK2.close();
                eieuVarK.close();
                return biwfVar;
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

    @Override // defpackage.bxxd
    public final biwf r(ConversationIdType conversationIdType, String str, boolean z) {
        return s(conversationIdType, str, z, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.bxxd
    public final biwf s(ConversationIdType conversationIdType, String str, boolean z, int i) {
        eieu eieuVarK = eiiy.k("DatabaseSearchOperationsImpl#getVideos");
        try {
            eieu eieuVarK2 = eiiy.k("DatabaseSearchOperationsImpl#getVideosForSearch");
            try {
                cqaz.h();
                String[] strArr = MediaSearchQuery.a;
                biwl biwlVar = new biwl();
                biwlVar.ar(new dqxm(bxyf.a(str, conversationIdType, Arrays.asList(le.a))));
                if (z) {
                    biwlVar.c();
                }
                biwlVar.b();
                biwj biwjVarA = MediaSearchQuery.a();
                biwjVarA.A("+getVideosForSearch");
                biwjVarA.d(biwlVar);
                biwjVarA.s();
                biwjVarA.c(new biwg(MediaSearchQuery.b.a));
                biwjVarA.y(i);
                biwf biwfVar = (biwf) biwjVarA.b().p();
                eieuVarK2.close();
                eieuVarK.close();
                return biwfVar;
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
}
