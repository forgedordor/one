package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bapj implements bakt {
    public static final cqce a = cqce.g("BugleDataModel", "ConversationDatabaseOperationsImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    public final fcsu c;
    public final Optional d;
    public final fcsu e;
    public final fcsu f;
    public final dqsn g;
    public final fcsu h;
    public final cogw i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final aqhc t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;

    public bapj(fcsu fcsuVar, Optional optional, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, dqsn dqsnVar, fcsu fcsuVar8, fcsu fcsuVar9, cogw cogwVar, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, aqhc aqhcVar) {
        this.c = fcsuVar;
        this.d = optional;
        this.u = fcsuVar2;
        this.v = fcsuVar3;
        this.e = fcsuVar4;
        this.w = fcsuVar5;
        this.f = fcsuVar6;
        this.x = fcsuVar7;
        this.g = dqsnVar;
        this.h = fcsuVar8;
        this.y = fcsuVar9;
        this.i = cogwVar;
        this.z = fcsuVar10;
        this.j = fcsuVar11;
        this.A = fcsuVar12;
        this.k = fcsuVar13;
        this.l = fcsuVar14;
        this.m = fcsuVar15;
        this.n = fcsuVar16;
        this.o = fcsuVar17;
        this.p = fcsuVar18;
        this.B = fcsuVar19;
        this.q = fcsuVar20;
        this.r = fcsuVar21;
        this.C = fcsuVar22;
        this.s = fcsuVar23;
        this.D = fcsuVar25;
        this.t = aqhcVar;
        this.E = fcsuVar24;
    }

    public static void aC(bote boteVar, List list, int i) {
        long j;
        boolean z;
        String str;
        String str2;
        int i2;
        String strO;
        String strA = null;
        if (list == null || list.isEmpty()) {
            j = 0;
            z = false;
            str = null;
            str2 = null;
            i2 = i;
            strO = null;
        } else {
            boolean zB = bbbe.b(list);
            if (i == 0) {
                cqaz.a(1, list.size());
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) list.get(0);
                long jU = bindData.u();
                String strS = bindData.S();
                String strT = bindData.T();
                strO = bindData.O();
                str2 = strT;
                str = strS;
                i2 = 0;
                z = zB;
                j = jU;
            } else {
                z = zB;
                j = 0;
                i2 = i;
                strO = null;
                str = null;
                str2 = null;
            }
        }
        boteVar.F(j);
        boteVar.J(str);
        boteVar.K(str2);
        boteVar.H(strO);
        int iIntValue = botm.g().intValue();
        int iIntValue2 = botm.g().intValue();
        if (iIntValue2 < 12001) {
            dqru.x("has_ea2p_bot_recipient", iIntValue2);
        }
        if (iIntValue >= 12001) {
            boteVar.a.put("has_ea2p_bot_recipient", Boolean.valueOf(z));
        }
        if (i2 == 0 && list.size() == 1) {
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) list.get(0);
            if (!TextUtils.isEmpty(bindData2.R())) {
                final String strR = bindData2.R();
                bsun bsunVarA = ProfilesTable.a();
                bsunVarA.A("getProfileForParticipant");
                bsunVarA.d(new Function() { // from class: bamr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bstj) obj).i;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsunVarA.e(new Function() { // from class: bams
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsur bsurVar = (bsur) obj;
                        bsurVar.b(Long.parseLong(strR));
                        return bsurVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ProfilesTable.BindData bindData3 = (ProfilesTable.BindData) bsunVarA.b().l();
                if (bindData3 != null && !TextUtils.isEmpty(bindData3.v()) && TextUtils.isEmpty(bindData2.P()) && TextUtils.isEmpty(bindData2.Q())) {
                    strA = chsk.a(bindData3.v());
                }
            }
        }
        boteVar.ab(strA);
    }

    public static void aD(bote boteVar) {
        boteVar.W(false);
        boteVar.u("");
        boteVar.v("");
        boteVar.r("");
        boteVar.s(Uri.EMPTY);
    }

    public static boolean aF(int i) {
        return i == 3;
    }

    public static boolean aG(boolean z, int i) {
        return z || i == 2;
    }

    public static final ekgb aH(ConversationIdType conversationIdType, boolean z) {
        cqaz.h();
        return aK(conversationIdType, z).z();
    }

    public static final ekgb aJ(ConversationIdType conversationIdType) {
        return aH(conversationIdType, false);
    }

    private static bsbm aK(final ConversationIdType conversationIdType, boolean z) {
        cqaz.h();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getParticipantsForConversationQuery");
        bsboVarE.h(new Function() { // from class: bann
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.e(new Function() { // from class: balb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((boic) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationIdType conversationIdType2 = conversationIdType;
                boiqVar.f(new Function() { // from class: balc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        boiu boiuVar = (boiu) obj2;
                        boiuVar.b(conversationIdType2);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(boiqVar.b());
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (z) {
            bsun bsunVarA = ProfilesTable.a();
            bsunVarA.c(new Function() { // from class: bano
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bstj bstjVar = (bstj) obj;
                    return new bstk[]{bstjVar.i, bstjVar.g, bstjVar.h};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqtr dqtrVarI = dqts.i(bsunVarA.b(), ProfilesTable.c.b, ParticipantsTable.c.a);
            ((dqos) dqtrVarI).e = "profiles_table_join_tag";
            bsboVarE.H(dqtrVarI.g());
        }
        return bsboVarE.b();
    }

    private static ekgp aL(List list) {
        return (ekgp) Collection.EL.stream(list).distinct().collect(ekcv.a(new Function() { // from class: balj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ParticipantsTable.BindData) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: balk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new barf(auej.JOINED);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public static int av(List list, int i) {
        if (i != 2) {
            return list.size();
        }
        final ekhv ekhvVar = new ekhv();
        Iterable$EL.forEach(list, new Consumer() { // from class: banu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                if (bindData.T() != null) {
                    ekhvVar.c(bindData.T());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final ekhx ekhxVarG = ekhvVar.g();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getParticipantCount");
        bsboVarE.h(new Function() { // from class: banv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.w(-2);
                bsbxVar.s(ekhxVarG);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return list.size() - (bsboVarE.b().U() ? 1 : 0);
    }

    public static brdp ax(ConversationIdType conversationIdType) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+ConversationDatabaseOperationsImpl#getLastTwoMessages");
        brec brecVar = new brec();
        brecVar.m(conversationIdType);
        brecVar.A(false);
        brdrVarD.g(brecVar);
        brdrVarD.d(new brdo(MessagesTable.c.i, false));
        brdrVarD.y(2);
        brdrVarD.e(new Function() { // from class: banh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                return new brao[]{branVar.i, branVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brdrVarD.b();
    }

    @Override // defpackage.bakt
    public final ekgb A() {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#queryAllUnreadConversations.1");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("queryAllUnreadConversations#2");
            brdrVarD.h(new Function() { // from class: bals
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.O(false);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brao braoVar = MessagesTable.c.b;
            brdrVarD.w(braoVar);
            brdrVarD.c(braoVar);
            botb botbVarE = botm.e();
            botbVarE.c(botm.c.a);
            botbVarE.i(new Function() { // from class: balt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.z();
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.p(botbVarE.b());
            ekgb ekgbVarF = brdrVarD.b().f();
            eieuVarK.close();
            return ekgbVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ekgb B(ekgb ekgbVar) {
        ekgb ekgbVar2;
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#sanitizeConversationParticipants");
        try {
            cqaz.h();
            if (ekgbVar.isEmpty()) {
                ekgbVar2 = ekoe.a;
            } else {
                Stream stream = Collection.EL.stream(ekgbVar);
                final Function function = new Function() { // from class: bame
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).T();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                Stream streamFilter = stream.filter(new Predicate() { // from class: bamb
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
                        return setNewSetFromMap.add(function.apply(obj));
                    }
                });
                Collector collector = ekcv.a;
                ekgbVar2 = (ekgb) streamFilter.collect(collector);
                fcsu fcsuVar = this.A;
                final HashSet hashSetC = ((crmx) fcsuVar.b()).C();
                final ekhx ekhxVarD = ((crmx) fcsuVar.b()).d();
                ekgb ekgbVar3 = (ekgb) Collection.EL.stream(ekgbVar2).filter(new Predicate() { // from class: balh
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
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                        cczv cczvVar = alvx.a;
                        return ((Boolean) new alvg().get()).booleanValue() ? !ekhxVarD.contains(((alrj) this.a.j.b()).q(bindData)) : !hashSetC.contains(bindData.T());
                    }
                }).collect(collector);
                if (!ekgbVar3.isEmpty()) {
                    ekgbVar2 = ekgbVar3;
                }
            }
            eieuVarK.close();
            return ekgbVar2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ekgp C(final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getExistingConversations");
        try {
            ecem.b();
            botb botbVarE = botm.e();
            botbVarE.A("+getExistingConversations");
            botbVarE.i(new Function() { // from class: balm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.u(ekgbVar);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgp ekgpVar = (ekgp) Collection.EL.stream(botbVarE.b().z()).collect(ekcv.a(new Function() { // from class: baln
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bojh) obj).C();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: balo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (bojh) obj;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            eieuVarK.close();
            return ekgpVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ekhx D(String str) {
        final String strM = ((bbca) this.h.b()).m(str);
        if (TextUtils.isEmpty(strM)) {
            return ekon.a;
        }
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("getConversationsForParticipant");
        boiqVar.f(new Function() { // from class: balq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boiu boiuVar = (boiu) obj;
                boiuVar.e(Long.parseLong(strM));
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVar.c(boiv.c.a);
        return (ekhx) boiqVar.b().E().map(new Function() { // from class: balr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bohm) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
    }

    @Override // defpackage.bakt
    public final ekhx E(List list) {
        ekhv ekhvVar = new ekhv();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            String[] strArr = boiv.a;
            boiq boiqVar = new boiq(boiv.a);
            boiqVar.A("getConversationsForParticipants");
            boiqVar.f(new Function() { // from class: banf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boiu boiuVar = (boiu) obj;
                    boiuVar.e(Long.parseLong(str));
                    return boiuVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boie boieVar = (boie) boiqVar.b().p();
            while (boieVar.moveToNext()) {
                try {
                    ekhvVar.c(boieVar.e());
                } catch (Throwable th) {
                    try {
                        boieVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            boieVar.close();
        }
        return ekhvVar.g();
    }

    @Override // defpackage.bakt
    public final Optional F(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationTypeInfo");
        try {
            Optional map = Optional.ofNullable(r(conversationIdType)).map(new Function() { // from class: bans
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bojh bojhVar = (bojh) obj;
                    return new bakb(bojhVar.k(), bojhVar.an());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return map;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final Optional G(ConversationIdType conversationIdType) {
        Optional optionalEmpty = Optional.empty();
        brap brapVar = (brap) ax(conversationIdType).p();
        try {
            if (brapVar.moveToFirst()) {
                optionalEmpty = Optional.of(Long.valueOf(brapVar.l()));
            }
            if (brapVar.getCount() > 1) {
                if (brapVar.i() == 3) {
                    brapVar.moveToNext();
                }
                optionalEmpty = Optional.of(Long.valueOf(brapVar.l()));
            }
            brapVar.close();
            return optionalEmpty;
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final Optional H(ConversationIdType conversationIdType) {
        return Optional.ofNullable((cidt) botm.j(conversationIdType, new Function() { // from class: baou
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bojh) obj).K();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).map(new Function() { // from class: baov
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cidt) obj).c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.bakt
    public final String I(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationName");
        try {
            cqaz.h();
            bojh bojhVarR = r(conversationIdType);
            String strY = bojhVarR != null ? bojhVarR.Y() : null;
            eieuVarK.close();
            return strY;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    @Deprecated
    public final ArrayList J(final cmtz cmtzVar, final int i) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationParticipants");
        try {
            final ArrayList arrayList = new ArrayList();
            if (cmtzVar == null) {
                a.r("Failed to get conversation participants: thread data null.");
                eieuVarK.close();
                return arrayList;
            }
            cmtu cmtuVar = cmtzVar.h;
            if (cmtuVar == null) {
                this.g.d("ConversationDatabaseOperationsImpl#getConversationParticipants", new Runnable() { // from class: bamx
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (alqm alqmVar : cmtzVar.b) {
                            cczv cczvVar = alvx.a;
                            String strK = alqmVar.k(((Boolean) new alvr().get()).booleanValue());
                            if (TextUtils.isEmpty(strK)) {
                                bapj.a.r("empty recipient, skipping.");
                            } else {
                                int i2 = i;
                                brvp brvpVarG = ((Boolean) new alvc().get()).booleanValue() ? bbbd.g(i2, alqmVar) : bbbd.i(i2, strK);
                                if (TextUtils.isEmpty(brvpVarG.g)) {
                                    bapj.a.r("empty send destination after building participant, skipping.");
                                } else {
                                    ArrayList arrayList2 = arrayList;
                                    ((bbca) this.a.h.b()).j(brvpVarG);
                                    arrayList2.add(brvpVarG.a());
                                }
                            }
                        }
                    }
                });
                eieuVarK.close();
                return arrayList;
            }
            ArrayList arrayList2 = cmtzVar.b;
            int size = arrayList2.size();
            if (size != 1) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("ThreadData has RBM bot info but number of recipients is");
                cqbdVarE.G(size);
                cqbdVarE.r();
            }
            String strB = ejwk.b(cmtuVar.a);
            alrj alrjVar = (alrj) this.j.b();
            aubn aubnVar = (aubn) aubq.a.createBuilder();
            aubp aubpVar = aubp.BOT;
            aubnVar.copyOnWrite();
            aubq aubqVar = (aubq) aubnVar.instance;
            aubqVar.c = aubpVar.f;
            aubqVar.b = 1 | aubqVar.b;
            aubnVar.copyOnWrite();
            aubq aubqVar2 = (aubq) aubnVar.instance;
            aubqVar2.b |= 2;
            aubqVar2.d = strB;
            if (!arrayList2.contains(alrjVar.b((aubq) aubnVar.build()))) {
                cqbd cqbdVarB = a.b();
                cqbdVarB.I("RBM bot recipient not found in thread data.");
                cqbdVarB.D("rbmBotId", strB);
                cqbdVarB.r();
            }
            brvp brvpVarE = bbbd.e(strB, cmtuVar.b, cmtuVar.c);
            ((bbca) this.h.b()).j(brvpVarE);
            arrayList.add(brvpVarE.a());
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

    @Override // defpackage.bakt
    public final /* bridge */ /* synthetic */ List K(ConversationIdType conversationIdType) {
        return aJ(conversationIdType);
    }

    @Override // defpackage.bakt
    public final /* bridge */ /* synthetic */ List L(ConversationIdType conversationIdType, boolean z) {
        return aH(conversationIdType, z);
    }

    @Override // defpackage.bakt
    @Deprecated
    public final List M(final cnqj cnqjVar) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getParticipantsForThread");
        try {
            cqaz.h();
            botb botbVarE = botm.e();
            botbVarE.A("getParticipantsForThread-conversations");
            botbVarE.g(new Function() { // from class: baoo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.i(new Function() { // from class: baop
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.L(cnqjVar);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bosz boszVarB = botbVarE.b();
            String[] strArr = boiv.a;
            boiq boiqVar = new boiq(boiv.a);
            boiqVar.A("getParticipantsForThread-conversationParticipants");
            boiqVar.e(new Function() { // from class: baoq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((boic) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boiqVar.f(new Function() { // from class: baor
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boiu boiuVar = (boiu) obj;
                    boiuVar.d(boszVarB);
                    return boiuVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final boip boipVarB = boiqVar.b();
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getParticipantsForThread-participants");
            bsboVarE.h(new Function() { // from class: baos
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    bsbxVar.l(boipVarB);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bsboVarE.b().z();
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

    @Override // defpackage.bakt
    public final void N(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#orphanConversation");
        try {
            cqaz.h();
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.ap("orphanConversation");
            boteVar.A(2);
            aj(conversationIdType, boteVar);
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

    @Override // defpackage.bakt
    public final void O() {
        this.g.d("ConversationDatabaseOperationsImpl#rebuildConversationAvatars", new Runnable() { // from class: banp
            @Override // java.lang.Runnable
            public final void run() {
                botb botbVarE = botm.e();
                botbVarE.A("rebuildConversationAvatars");
                botbVarE.s();
                botbVarE.f(new Function() { // from class: bane
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bopp boppVar = (bopp) obj;
                        return new bopq[]{boppVar.a, boppVar.O};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bopr boprVar = (bopr) botbVarE.b().p();
                bapj bapjVar = this.a;
                while (boprVar.moveToNext()) {
                    try {
                        bapjVar.V(boprVar.h(), null, boprVar.c(), false);
                    } catch (Throwable th) {
                        try {
                            boprVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                boprVar.close();
            }
        });
    }

    @Override // defpackage.bakt
    public final void P(final ConversationIdType conversationIdType) {
        this.g.d("ConversationDatabaseOperationsImpl#refreshConversation", new Runnable() { // from class: banw
            @Override // java.lang.Runnable
            public final void run() {
                bapj bapjVar = this.a;
                ConversationIdType conversationIdType2 = conversationIdType;
                bapjVar.V(conversationIdType2, null, bapjVar.c(conversationIdType2), true);
            }
        });
        fcsu fcsuVar = this.w;
        ((bxlc) fcsuVar.b()).n(conversationIdType);
        ((bxlc) fcsuVar.b()).d(conversationIdType);
    }

    @Override // defpackage.bakt
    public final void Q(Set set) {
        dzub dzubVarA = ((ajfo) this.z.b()).a();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#refreshConversations");
        try {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    P((ConversationIdType) it.next());
                }
                ((bxlc) this.w.b()).c();
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Number of conversations refreshed.");
                cqbdVarC.L("conversationIds", set);
                cqbdVarC.r();
                ((ains) this.u.b()).e("Bugle.RefreshConversations.UpdatedConversations.Count", set.size());
            }
            eieuVarK.close();
            ((ajfo) this.z.b()).g(dzubVarA, new dzfh("ConversationDatabaseOperationsImpl#refreshConversations"));
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final void R(String str) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#refreshConversationsForParticipant");
        try {
            cqaz.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            S(arrayList);
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

    @Override // defpackage.bakt
    public final void S(ArrayList arrayList) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#refreshConversationsForParticipants");
        try {
            cqaz.h();
            Q(E(arrayList));
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

    @Override // defpackage.bakt
    public final void T(final ConversationIdType conversationIdType) {
        bojh bojhVarR = r(conversationIdType);
        if (bojhVarR == null || bojhVarR.k() == 2) {
            this.g.d("ConversationDatabaseOperationsImpl#refreshParticipantCountForRcsGroup", new Runnable() { // from class: baot
                @Override // java.lang.Runnable
                public final void run() {
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    conversationIdType2.getClass();
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.al();
                    boteVar.ap("refreshParticipantCountForRcsGroup#setCount");
                    botl botlVar = new botl();
                    botlVar.r(conversationIdType2);
                    boteVar.ac(botlVar);
                    String[] strArr2 = bgzx.a;
                    bgzs bgzsVar = new bgzs(bgzx.a);
                    bgzsVar.A("refreshParticipantCountForRcsGroup#setCount#inner");
                    bgzsVar.c(new Function() { // from class: bank
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bgzw bgzwVar = (bgzw) obj;
                            bgzwVar.b(conversationIdType2);
                            bgzwVar.ap(new dqpm("conversation_to_participants.rcs_group_join_status", 3, bgzw.as((Iterable) DesugarArrays.stream(new auej[]{auej.JOINED, auej.UNKNOWN_STATE}).map(new Function() { // from class: bgzv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return Integer.valueOf(((auej) obj2).e);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: bgzu
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }))), true));
                            return bgzwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgb ekgbVarZ = bgzsVar.b().z();
                    final ekhv ekhvVar = new ekhv();
                    Iterable$EL.forEach(ekgbVarZ, new Consumer() { // from class: banl
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            bgvm bgvmVar = (bgvm) obj;
                            if (bgvmVar.g() != null) {
                                ekhvVar.c(bgvmVar.g());
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    final ekhx ekhxVarG = ekhvVar.g();
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("refreshParticipantCountForRcsGroup#setCount#outer");
                    bsboVarE.h(new Function() { // from class: banm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar = (bsbx) obj;
                            bsbxVar.w(-2);
                            bsbxVar.s(ekhxVarG);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boteVar.G(ekgbVarZ.size() - (bsboVarE.b().U() ? 1 : 0));
                    boteVar.b().e();
                }
            });
        }
    }

    @Override // defpackage.bakt
    public final void U(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData, final boolean z) {
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationDraftSnippetAndPreview", new Runnable() { // from class: bamf
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                Uri uriT;
                String strR;
                ConversationIdType conversationIdType2 = conversationIdType;
                boolean z2 = z;
                long jMax = 0;
                if (z2) {
                    brap brapVar = (brap) bapj.ax(conversationIdType2).p();
                    try {
                        long jL = brapVar.moveToFirst() ? brapVar.l() : 0L;
                        if (brapVar.getCount() > 1) {
                            if (brapVar.i() == 3) {
                                brapVar.moveToNext();
                            }
                            jMax = brapVar.l();
                        }
                        brapVar.close();
                        j = jMax;
                        jMax = jL;
                    } finally {
                    }
                } else {
                    j = 0;
                }
                MessageCoreData messageCoreData2 = messageCoreData;
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.al();
                boteVar.ap("updateConversationDraftSnippetAndPreview");
                if (messageCoreData2 == null || !messageCoreData2.cn()) {
                    bapj.aD(boteVar);
                } else {
                    String strAs = messageCoreData2.as();
                    String strAv = messageCoreData2.av();
                    Iterator it = messageCoreData2.M().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            uriT = null;
                            strR = null;
                            break;
                        }
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                        if (messagePartCoreData.aX() && le.p(messagePartCoreData.R())) {
                            uriT = messagePartCoreData.t();
                            strR = messagePartCoreData.R();
                            break;
                        }
                    }
                    if (messageCoreData2.W() != null && ejwk.c(strAs) && ejwk.c(strAv) && uriT == null) {
                        bapj.aD(boteVar);
                        jMax = j;
                    } else {
                        jMax = Math.max(jMax, messageCoreData2.o());
                        boteVar.W(true);
                        boteVar.u(strAs);
                        boteVar.v(strAv);
                        boteVar.r(strR);
                        boteVar.s(uriT);
                    }
                }
                if (z2) {
                    boteVar.Z(jMax);
                }
                this.a.W(conversationIdType2, boteVar);
            }
        });
    }

    @Override // defpackage.bakt
    public final void V(final ConversationIdType conversationIdType, final String str, final int i, final boolean z) {
        cqaz.h();
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationNameAndAvatar", new Runnable() { // from class: baky
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
            /* JADX WARN: Type inference failed for: r0v2, types: [fcsu, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 337
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.baky.run():void");
            }
        });
    }

    @Override // defpackage.bakt
    public final void W(ConversationIdType conversationIdType, bote boteVar) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#updateConversationRow");
        try {
            cqaz.h();
            aj(conversationIdType, boteVar);
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

    @Override // defpackage.bakt
    public final void X(String str, ParticipantCoreColor participantCoreColor) {
        ((bbca) this.h.b()).q(str, participantCoreColor);
        if (participantCoreColor.a() != 0) {
            R(str);
            fcsu fcsuVar = this.w;
            ((bxlc) fcsuVar.b()).b();
            ((bxlc) fcsuVar.b()).a();
        }
    }

    @Override // defpackage.bakt
    public final void Y(Set set, final String str, final String str2) {
        ejwl.a(!set.isEmpty());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final ConversationIdType conversationIdType = (ConversationIdType) it.next();
            this.g.d("ConversationDatabaseOperationsImpl#updateParticipantIdList", new Runnable() { // from class: bakv
                @Override // java.lang.Runnable
                public final void run() {
                    String strAa;
                    botb botbVarE = botm.e();
                    botbVarE.A("updateParticipantIdList1");
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    botbVarE.i(new Function() { // from class: bamj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    botbVarE.g(new Function() { // from class: bamk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bopp) obj).J;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bojh bojhVar = (bojh) botbVarE.b().l();
                    if (bojhVar == null || (strAa = bojhVar.aa()) == null) {
                        return;
                    }
                    String str3 = str;
                    String str4 = str2;
                    TreeSet treeSet = new TreeSet(Arrays.asList(strAa.split(",")));
                    ejyb.a(treeSet.remove(str4));
                    treeSet.add(str3);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = treeSet.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ",");
                            }
                        }
                    }
                    String string = sb.toString();
                    bote boteVar = new bote();
                    boteVar.ap("updateParticipantIdList2");
                    boteVar.ad(new Function() { // from class: baml
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            botlVar.r(conversationIdType2);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boteVar.I(string);
                    if (boteVar.b().e() == 0) {
                        ekrw ekrwVarI = bapj.b.i();
                        ekrwVarI.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar = (ekrd) ekrwVarI;
                        ekrdVar.Z(eksk.LARGE);
                        ekrdVar.X(cqnc.r, conversationIdType2.toString());
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantIdList", 2011, "ConversationDatabaseOperationsImpl.java")).q("Failed to update PARTICIPANT_ID_LIST in conversation table.");
                    }
                }
            });
        }
    }

    @Override // defpackage.bakt
    public final void Z(Set set, ParticipantsTable.BindData bindData) {
        ejwl.a(!set.isEmpty());
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("updateParticipantRelatedConversationDataForOneOnOneConversations");
        botl botlVar = new botl();
        botlVar.u(set);
        botlVar.j(0);
        boteVar.ac(botlVar);
        boteVar.J(bindData.S());
        boteVar.K(bindData.T());
        boteVar.H(bindData.O());
        boteVar.F(bindData.u());
        if (boteVar.b().e() == 0) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.Z(eksk.LARGE);
            ekrdVar.X(cqnc.p, bindData.R());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantRelatedConversationDataForOneOnOneConversations", 2052, "ConversationDatabaseOperationsImpl.java")).q("Failed to update conversation table with new participant data.");
        }
    }

    @Override // defpackage.bakt
    public final int a(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationJoinState");
        try {
            cqaz.h();
            bojh bojhVarR = r(conversationIdType);
            int iN = bojhVarR != null ? bojhVarR.n() : 0;
            eieuVarK.close();
            return iN;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final void aA(bote boteVar, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boteVar.z(aw(list).toString());
    }

    public final void aB(bojl bojlVar, List list, int i) {
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("fillParticipantData");
        aC(boteVar, list, i);
        if (!((area) this.q.b()).a()) {
            aA(boteVar, list);
        }
        ContentValues contentValues = boteVar.a;
        bojlVar.X(contentValues.getAsLong("participant_contact_id").longValue());
        bojlVar.ab(boteVar.e());
        bojlVar.ac(boteVar.e());
        bojlVar.Z(contentValues.getAsString("participant_display_destination"));
        bojlVar.z(contentValues.getAsBoolean("has_ea2p_bot_recipient").booleanValue());
        if (boteVar.b().n(botm.c.t.toString())) {
            bojlVar.A(contentValues.getAsString("icon"));
        }
    }

    public final void aE(int i) {
        ((ains) this.v.b()).e("Bugle.DataModel.Data.CreateRcsGroupConversation.SelfParticipantInserted.Counts", i);
    }

    public final void aI(final ConversationIdType conversationIdType) {
        cqaz.h();
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationAddContactBannerStatus", new Runnable() { // from class: baof
            @Override // java.lang.Runnable
            public final void run() {
                Optional optionalEmpty;
                cqaz.h();
                String[] strArr = bmjd.a;
                bmiy bmiyVar = new bmiy(bmjd.a);
                bmiyVar.A("getAddContactBannerDataByConversationId");
                final ConversationIdType conversationIdType2 = conversationIdType;
                bmiyVar.k(new bmjb((bmjc) new Function() { // from class: banj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bmjc bmjcVar = (bmjc) obj;
                        bmjcVar.b(conversationIdType2);
                        return bmjcVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bmjc())));
                bmio bmioVar = (bmio) bmiyVar.b().p();
                try {
                    if (bmioVar.moveToNext()) {
                        optionalEmpty = Optional.of((bmib) bmioVar.cQ());
                        bmioVar.close();
                    } else {
                        bmioVar.close();
                        optionalEmpty = Optional.empty();
                    }
                    if (optionalEmpty.isPresent()) {
                        bmja bmjaVar = new bmja();
                        bmjaVar.ap("updateConversationAddContactBannerStatus");
                        bmjaVar.a.put("banner_status", (Integer) 2);
                        bmjaVar.am();
                        bmjaVar.af(new bmjb((bmjc) new Function() { // from class: bapd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bmjc bmjcVar = (bmjc) obj;
                                bmjcVar.b(conversationIdType2);
                                return bmjcVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(new bmjc())));
                        bmjaVar.b().e();
                        return;
                    }
                    bmie bmieVar = new bmie();
                    bmieVar.c(conversationIdType2);
                    bmieVar.b(2);
                    final bmib bmibVarA = bmieVar.a();
                    final dqsy dqsyVarA = bmjd.a();
                    dqru.b(bmjd.a(), "add_contact_banner", bmibVarA, new Function() { // from class: bmhy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarA.O("add_contact_banner", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bmhz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            Long l = (Long) obj;
                            if (l.longValue() >= 0) {
                                bmib bmibVar = bmibVarA;
                                bmibVar.a = l.longValue();
                                bmibVar.fN(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } catch (Throwable th) {
                    try {
                        bmioVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.bakt
    public final boolean aa(Optional optional, final ParticipantsTable.BindData bindData, final barg bargVar, final ConversationIdType conversationIdType, final boolean z, final boolean z2) {
        ejwl.b(bindData.r() == -2, "Is possible to persist just other participants (subId = -2)");
        final boolean zIsPresent = optional.filter(new Predicate() { // from class: bani
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
                final aubq aubqVar = (aubq) obj;
                Optional optionalE = ((alrj) this.a.j.b()).t(bindData).e();
                aubqVar.getClass();
                return optionalE.filter(new Predicate() { // from class: bamq
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
                        return aubqVar.equals((aubq) obj2);
                    }
                }).isPresent();
            }
        }).isPresent();
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantToConversation", new ejxr() { // from class: bapb
            /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() throws java.lang.NumberFormatException {
                /*
                    r15 = this;
                    bapj r0 = r15.a
                    fcsu r1 = r0.h
                    java.lang.Object r1 = r1.b()
                    bbca r1 = (defpackage.bbca) r1
                    com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r2
                    boolean r3 = r3
                    java.lang.String r1 = r1.l(r2, r3)
                    r1.getClass()
                    long r2 = java.lang.Long.parseLong(r1)
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r6
                    boolean r5 = r5
                    barg r6 = r4
                    auej r6 = r6.a()
                    r7 = 0
                    r8 = -1
                    r10 = 1
                    if (r5 == 0) goto L3c
                    cqce r5 = defpackage.bapj.a
                    cqbd r5 = r5.a()
                    java.lang.String r11 = "Skipping insertion of self participant in ConversationParticipantsTable"
                    r5.I(r11)
                    r5.f(r1)
                    r5.r()
                L3a:
                    r5 = r10
                    goto L75
                L3c:
                    java.lang.String[] r5 = defpackage.bocg.a
                    boau r5 = new boau
                    r5.<init>()
                    r5.b(r4)
                    r5.c(r2)
                    r5.d(r6)
                    boar r5 = r5.a()
                    dqsy r11 = defpackage.bocg.c()
                    dqsy r12 = defpackage.bocg.c()
                    boap r13 = new boap
                    r13.<init>()
                    boao r11 = new boao
                    r11.<init>()
                    java.lang.String r14 = "conversation_participants"
                    long r11 = defpackage.dqru.b(r12, r14, r5, r13, r11)
                    java.lang.Long r5 = java.lang.Long.valueOf(r11)
                    r5.getClass()
                    int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                    if (r5 == 0) goto L74
                    goto L3a
                L74:
                    r5 = r7
                L75:
                    java.lang.String[] r11 = defpackage.boiv.a
                    bohr r11 = new bohr
                    r11.<init>()
                    r11.c(r4)
                    r11.e(r2)
                    r11.f(r6)
                    bohm r2 = r11.a()
                    dqsy r3 = defpackage.boiv.a()
                    dqsy r6 = defpackage.boiv.a()
                    bohf r11 = new bohf
                    r11.<init>()
                    bohg r3 = new bohg
                    r3.<init>()
                    java.lang.String r12 = "conversation_to_participants"
                    long r2 = defpackage.dqru.b(r6, r12, r2, r11, r3)
                    java.lang.Long r6 = java.lang.Long.valueOf(r2)
                    r6.getClass()
                    cqce r6 = defpackage.bapj.a
                    cqbd r6 = r6.a()
                    r6.c(r4)
                    r6.f(r1)
                    java.lang.String r1 = "ConversationToParticipantsTable convToPartRowId: "
                    java.lang.String r1 = defpackage.a.u(r2, r1)
                    r6.I(r1)
                    r6.r()
                    int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r1 == 0) goto Lc5
                    r7 = r10
                Lc5:
                    r1 = r5 & r7
                    if (r1 == 0) goto Ld3
                    boolean r2 = r7
                    if (r2 == 0) goto Ld3
                    r0.P(r4)
                    r0.T(r4)
                Ld3:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bapb.get():java.lang.Object");
            }
        })).booleanValue();
    }

    @Override // defpackage.bakt
    public final boolean ab(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#conversationHasEmail");
        try {
            cqaz.h();
            boolean zBooleanValue = ((Boolean) botm.i(conversationIdType, new Function() { // from class: banx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((bojh) obj).ao());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Supplier() { // from class: bany
                @Override // java.util.function.Supplier
                public final Object get() {
                    return false;
                }
            })).booleanValue();
            eieuVarK.close();
            return zBooleanValue;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean ac(ConversationIdType conversationIdType) {
        if (!((aquo) this.C.b()).a()) {
            return false;
        }
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#hasEmergencyRcsRecipient");
        try {
            ecem.b();
            boolean zAnyMatch = Collection.EL.stream(aJ(conversationIdType)).anyMatch(new Predicate() { // from class: bamc
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
                    return ((alrj) this.a.j.b()).q((ParticipantsTable.BindData) obj).v();
                }
            });
            eieuVarK.close();
            return zAnyMatch;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean ad(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#hasRbmBotRecipient");
        try {
            cqaz.h();
            bojh bojhVarR = r(conversationIdType);
            boolean z = false;
            if (bojhVarR != null) {
                if (bojhVarR.an()) {
                    z = true;
                }
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean ae(final long j) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#isExistingMmsGroupConversation");
        try {
            eieu eieuVarK2 = eiiy.k("ConversationDatabaseOperationsImpl#isExistingConversation");
            try {
                cqaz.h();
                botb botbVarE = botm.e();
                botbVarE.A("isExistingConversation");
                botbVarE.i(new Function() { // from class: baoi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.j(1);
                        botlVar.L(cnqj.b(j));
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                botbVarE.g(new Function() { // from class: baoj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bopp) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bopr boprVar = (bopr) botbVarE.b().p();
                try {
                    boolean zMoveToFirst = boprVar.moveToFirst();
                    boprVar.close();
                    eieuVarK2.close();
                    eieuVarK.close();
                    return zMoveToFirst;
                } finally {
                }
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

    @Override // defpackage.bakt
    public final boolean af(final String str) {
        botb botbVarE = botm.e();
        botbVarE.A("rcsGroupConversationExists");
        botbVarE.g(new Function() { // from class: baob
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: baod
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.E(str);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return !botbVarE.b().g().isEmpty();
    }

    @Override // defpackage.bakt
    public final boolean ag(final ConversationIdType conversationIdType, final String str) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#isParticipantInConversation");
        try {
            cqaz.h();
            String[] strArr = boiv.a;
            boiq boiqVar = new boiq(boiv.a);
            boiqVar.A("isParticipantInConversation");
            boiqVar.f(new Function() { // from class: baoc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boiu boiuVar = (boiu) obj;
                    boiuVar.b(conversationIdType);
                    boiuVar.e(Long.parseLong(str));
                    return boiuVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boie boieVar = (boie) boiqVar.b().p();
            try {
                boolean z = boieVar.getCount() > 0;
                boieVar.close();
                eieuVarK.close();
                return z;
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

    @Override // defpackage.bakt
    public final boolean ah(ConversationIdType conversationIdType) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#isRevocationSupported");
        try {
            bojh bojhVarR = r(conversationIdType);
            boolean z = false;
            if (bojhVarR != null) {
                if (bojhVarR.as()) {
                    z = true;
                }
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean ai(final ParticipantsTable.BindData bindData, final ConversationIdType conversationIdType, final boolean z) {
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#removeParticipantFromConversation", new ejxr() { // from class: baoe
            @Override // defpackage.ejxr
            public final Object get() {
                bapj bapjVar = this.a;
                final String strI = ((bbca) bapjVar.h.b()).i(bindData);
                strI.getClass();
                String[] strArr = bocg.a;
                bobu bobuVar = new bobu();
                bobuVar.f("removeParticipantFromConversation");
                final ConversationIdType conversationIdType2 = conversationIdType;
                bobuVar.a(new Function() { // from class: balf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bocf bocfVar = (bocf) obj;
                        bocfVar.c(Long.parseLong(strI));
                        bocfVar.b(conversationIdType2);
                        return bocfVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int iD = bobuVar.d();
                String[] strArr2 = boiv.a;
                boil boilVar = new boil();
                boilVar.f("removeParticipantFromConversationToParticipants");
                boilVar.c(new Function() { // from class: balg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        boiu boiuVar = (boiu) obj;
                        boiuVar.e(Long.parseLong(strI));
                        boiuVar.b(conversationIdType2);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boolean z2 = (iD > 0) | (boilVar.d() > 0);
                if (z2 && z) {
                    bapjVar.P(conversationIdType2);
                    bapjVar.T(conversationIdType2);
                }
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }

    @Override // defpackage.bakt
    public final boolean aj(ConversationIdType conversationIdType, bote boteVar) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#updateConversationRowIfExists");
        try {
            cqaz.h();
            boolean zF = boteVar.f(conversationIdType);
            eieuVarK.close();
            return zF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean ak(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId) {
        cqaz.h();
        ekrg ekrgVar = b;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdType);
        ekrdVar.X(cqnc.y, selfIdentityId);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateConversationSelfId", 2396, "ConversationDatabaseOperationsImpl.java")).q("updateConversationSelfId with new selfId");
        botb botbVarE = botm.e();
        botbVarE.A("updateConversationSelfIdCheck");
        botbVarE.f(new Function() { // from class: bamg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new bopq[]{((bopp) obj).a};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: bamh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.k(aoet.b(selfIdentityId));
                botlVar.r(conversationIdType);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (!botbVarE.b().U()) {
            return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#updateConversationSelfId", new ejxr() { // from class: bami
                @Override // defpackage.ejxr
                public final Object get() {
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("updateConversationSelfId");
                    bapj bapjVar = this.a;
                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                    if (!bapjVar.am(selfIdentityId2, boteVar)) {
                        return false;
                    }
                    ConversationIdType conversationIdType2 = conversationIdType;
                    boolean zAj = bapjVar.aj(conversationIdType2, boteVar);
                    if (zAj && bapjVar.t.a()) {
                        fcsu fcsuVar = bapjVar.s;
                        if (((Optional) fcsuVar.b()).isPresent()) {
                            return Boolean.valueOf(((bycv) ((Optional) fcsuVar.b()).get()).b(conversationIdType2, selfIdentityId2));
                        }
                    }
                    return Boolean.valueOf(zAj);
                }
            })).booleanValue();
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateConversationSelfId", 2407, "ConversationDatabaseOperationsImpl.java")).t("Skipping self-id update, conversationId=%s", conversationIdType);
        return false;
    }

    @Override // defpackage.bakt
    public final boolean al(final ConversationIdType conversationIdType, final String str, final barg bargVar) {
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#updateParticipantJoinStatusInConversation", new ejxr() { // from class: bamv
            @Override // defpackage.ejxr
            public final Object get() throws NumberFormatException {
                try {
                    long j = Long.parseLong(str);
                    barg bargVar2 = bargVar;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    bocd bocdVarB = bocg.b();
                    bocdVarB.ap("updateParticipantRcsGroupJoinStatusInConversation");
                    bocf bocfVar = new bocf();
                    bocfVar.b(conversationIdType2);
                    bocfVar.c(j);
                    bocdVarB.af(new boce(bocfVar));
                    auej auejVar = ((barf) bargVar2).a;
                    bocdVarB.c(auejVar);
                    boolean z = bocdVarB.b().e() > 0;
                    String[] strArr = boiv.a;
                    bois boisVar = new bois();
                    ContentValues contentValues = boisVar.a;
                    contentValues.put("last_modified_by_key", bbam.c(bbam.b()));
                    boisVar.e.b().c("last_modified_by_key");
                    boisVar.ap("updateParticipantRcsGroupJoinStatusInConversation");
                    boiu boiuVar = new boiu();
                    boiuVar.b(conversationIdType2);
                    boiuVar.e(j);
                    boisVar.af(new boit(boiuVar));
                    contentValues.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
                    boolean z2 = z | (boisVar.b().e() > 0);
                    if (z2) {
                        this.a.T(conversationIdType2);
                    }
                    return Boolean.valueOf(z2);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to update RCS group join status due to invalid ID", e);
                }
            }
        })).booleanValue();
    }

    @Override // defpackage.bakt
    public final boolean am(final SelfIdentityId selfIdentityId, bote boteVar) {
        boolean z;
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("addConversationSelfIdToContentValues");
        bsboVarE.h(new Function() { // from class: bamo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.k(selfIdentityId.b());
                int iIntValue = ParticipantsTable.i().intValue();
                if (iIntValue < 2000) {
                    dqru.x("sim_slot_id", iIntValue);
                }
                bsbxVar.ap(new dqty("participants.sim_slot_id", 2, -1));
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.f(new Function() { // from class: bamp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((brzh) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzj brzjVar = (brzj) bsboVarE.b().p();
        try {
            if (brzjVar.getCount() > 0) {
                boteVar.n(selfIdentityId.c());
                z = true;
            } else {
                z = false;
            }
            brzjVar.close();
            return z;
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final boolean an(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType) {
        return aa(Optional.empty(), bindData, new barf(auej.JOINED), conversationIdType, true, false);
    }

    @Override // defpackage.bakt
    public final boolean ao(List list, final ConversationIdType conversationIdType) {
        final ekgp ekgpVarAL = aL(list);
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new ejxr() { // from class: bamd
            @Override // defpackage.ejxr
            public final Object get() {
                Map map = ekgpVarAL;
                for (ParticipantsTable.BindData bindData : map.keySet()) {
                    ConversationIdType conversationIdType2 = conversationIdType;
                    bapj bapjVar = this.a;
                    if (!bapjVar.aa(Optional.empty(), bindData, (barg) map.get(bindData), conversationIdType2, false, false)) {
                        return false;
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    @Override // defpackage.bakt
    public final boolean ap(final Optional optional, List list, final ConversationIdType conversationIdType, final boolean z) {
        final ekgp ekgpVarAL = aL(list);
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new ejxr() { // from class: bamm
            @Override // defpackage.ejxr
            public final Object get() {
                ekgp ekgpVar = ekgpVarAL;
                ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    boolean z2 = z;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    Optional optional2 = optional;
                    bapj bapjVar = this.a;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekqgVarListIterator.next();
                    if (!bapjVar.aa(optional2, bindData, (barg) Optional.ofNullable((barg) ekgpVar.get(bindData)).orElse(new barf(auej.JOINED)), conversationIdType2, false, z2)) {
                        return false;
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    @Override // defpackage.bakt
    public final ConversationIdType aq(final long j, final bvdk bvdkVar, final List list, final int i, final String str, final long j2) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#createConversationId");
        try {
            final SelfIdentityId selfIdentityIdF = ((bbdl) this.c.b()).d().f();
            ConversationIdType conversationIdType = (ConversationIdType) this.g.c("ConversationDatabaseOperationsImpl#createConversationIdTransaction", new ejxr() { // from class: band
                /* JADX WARN: Type inference failed for: r0v2, types: [fcsu, java.lang.Object] */
                @Override // defpackage.ejxr
                public final Object get() {
                    final bapj bapjVar = this.a;
                    final List list2 = list;
                    if (list2.isEmpty()) {
                        bapj.a.r("Creating conversation with empty list; using unknown sender.");
                        fcsu fcsuVar = bapjVar.h;
                        brvp brvpVarA = bbbe.a("ʼUNKNOWN_SENDER!ʼ");
                        ((bbca) fcsuVar.b()).j(brvpVarA);
                        list2.add(brvpVarA.a());
                    }
                    final long j3 = j2;
                    final String str2 = str;
                    final int i2 = i;
                    final bvdk bvdkVar2 = bvdkVar;
                    final SelfIdentityId selfIdentityId = selfIdentityIdF;
                    final long j4 = j;
                    Optional optional = bapjVar.d;
                    optional.isPresent();
                    ((cqdn) optional.get().b()).g();
                    return (ConversationIdType) bapjVar.g.c("ConversationDatabaseOperationsImpl#createConversation", new ejxr() { // from class: bamy
                        @Override // defpackage.ejxr
                        public final Object get() {
                            bapj bapjVar2 = bapjVar;
                            List<ParticipantsTable.BindData> list3 = list2;
                            int iAu = bapjVar2.au(0, false, list3.size());
                            boolean zC = false;
                            for (ParticipantsTable.BindData bindData : list3) {
                                if (iAu != 2) {
                                    cqaz.k(true ^ bbdl.k(bindData));
                                }
                                zC |= bbbe.c(bindData);
                            }
                            long j5 = j3;
                            String str3 = str2;
                            bvdk bvdkVar3 = bvdkVar2;
                            int i3 = i2;
                            SelfIdentityId selfIdentityId2 = selfIdentityId;
                            long j6 = j4;
                            String[] strArr = botm.a;
                            bojm bojmVar = new bojm();
                            bojmVar.as(cnqj.b(j6));
                            bojmVar.au(0L);
                            bojmVar.k(((SelfIdentityIdImpl) selfIdentityId2).a);
                            bojmVar.Y(bapj.av(list3, iAu));
                            bojmVar.C(zC);
                            bojmVar.av(i3);
                            bojmVar.c(bvdkVar3);
                            bojmVar.S(true);
                            bojmVar.U(true);
                            bojmVar.T(null);
                            bojmVar.aa(str3);
                            bojmVar.i(iAu);
                            bojmVar.E(0);
                            bojmVar.aw(false);
                            if (j5 != -1) {
                                if (cqbe.c() || ((Boolean) ccze.Z.e()).booleanValue()) {
                                    ejwl.l(bapjVar2.q(j5).b());
                                }
                                bojmVar.am(j5);
                            }
                            bapjVar2.aB(bojmVar, list3, iAu);
                            final bojh bojhVarA = bojmVar.a();
                            final dqsy dqsyVarF = botm.f();
                            ConversationIdType conversationIdType2 = new ConversationIdType(dqru.b(botm.f(), "conversations", bojhVarA, new Function() { // from class: bojc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dqsyVarF.O("conversations", (dqst) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: boja
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    bojhVarA.aj((Long) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }));
                            if (conversationIdType2.b()) {
                                bapj.a.n("failed to insert conversation into table.");
                                throw new IllegalStateException("unable to insert Conversation got -1 ".concat(String.valueOf(bojhVarA.toString())));
                            }
                            bapjVar2.ao(list3, conversationIdType2);
                            bapjVar2.V(conversationIdType2, null, iAu, true);
                            bapjVar2.aI(conversationIdType2);
                            final awch awchVarA = ((awci) bapjVar2.p.b()).a();
                            ekrw ekrwVarH = bapj.b.h();
                            ekrwVarH.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 850, "ConversationDatabaseOperationsImpl.java");
                            Stream map = Collection.EL.stream(list3).map(new Function() { // from class: bape
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return String.valueOf(((ParticipantsTable.BindData) obj).R());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i4 = ekgb.d;
                            Collector collector = ekcv.a;
                            ekrdVar.I("ConversationDatabaseOperationsImp: created id=%s with participantIds=%s and destinations=%s", conversationIdType2, map.collect(collector), Collection.EL.stream(list3).map(new baoy()).map(new Function() { // from class: bapf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((avog) awchVarA.a((String) obj)).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector));
                            ((bakq) bapjVar2.o.b()).a(conversationIdType2, ajsm.a);
                            return conversationIdType2;
                        }
                    });
                }
            });
            eieuVarK.close();
            return conversationIdType;
        } finally {
        }
    }

    @Override // defpackage.bakt
    public final ConversationIdType ar(long j, bvdk bvdkVar, List list) {
        return as(cmol.a, j, bvdkVar, list, -1L).a();
    }

    @Override // defpackage.bakt
    public final baqv as(final cmmp cmmpVar, final long j, final bvdk bvdkVar, final List list, final long j2) {
        cqaz.h();
        return (baqv) dqru.g(botm.f(), "getOrCreateConversationWithResult", new dqsh(new ejxr() { // from class: bana
            @Override // defpackage.ejxr
            public final Object get() {
                return baqv.c(this.a.o(cmmpVar, j));
            }
        }), new dqsf(new Function() { // from class: banb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((baqv) obj).a().b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dqsg(new Function() { // from class: banc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return baqv.d(this.a.aq(j, bvdkVar, list, 0, null, j2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.bakt
    public final boolean at(List list, final ConversationIdType conversationIdType) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(((bbca) this.h.b()).i((ParticipantsTable.BindData) it.next()))));
        }
        String[] strArr = bocg.a;
        bobu bobuVar = new bobu();
        bobuVar.f("removeParticipantsFromConversation");
        bobuVar.a(new Function() { // from class: bakz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bocf bocfVar = (bocf) obj;
                bocfVar.d(arrayList);
                bocfVar.b(conversationIdType);
                return bocfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boolean z = bobuVar.d() > 0;
        String[] strArr2 = boiv.a;
        boil boilVar = new boil();
        boilVar.f("removeParticipantsFromConversation");
        boilVar.c(new Function() { // from class: bala
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boiu boiuVar = (boiu) obj;
                boiuVar.f(arrayList);
                boiuVar.b(conversationIdType);
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return z | (boilVar.d() > 0);
    }

    public final int au(int i, boolean z, int i2) {
        if (((aqbh) this.B.b()).a() && i == 9) {
            return 0;
        }
        if (i != 0 || z) {
            return 2;
        }
        return i2 > 1 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri aw(List list) {
        bbfo bbfoVarA = ((bbfq) this.n.b()).a(ekgb.n(list));
        final axjf axjfVar = (axjf) this.x.b();
        ekgb ekgbVar = bbfoVarA.b;
        if (ekgbVar.isEmpty()) {
            ekgbVar = bbfoVarA.a;
        }
        ejwl.b(!ekgbVar.isEmpty(), "Participants must be provided.");
        if (ekgbVar.size() == 1) {
            return axjfVar.a((ParticipantsTable.BindData) ekgbVar.get(0));
        }
        return cpbr.p(axjfVar.a, (ekgb) Collection.EL.stream(ekgbVar).limit(4L).map(new Function() { // from class: axje
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return axjfVar.a((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a));
    }

    @Deprecated
    public final ekgb ay(cmmp cmmpVar, final long j) {
        int i;
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getAllExistingConversations");
        try {
            ((cmmq) this.y.b()).a(cmmpVar);
            botb botbVarE = botm.e();
            botbVarE.A("getAllExistingConversations");
            botbVarE.i(new Function() { // from class: baog
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.L(new cnqj(j));
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.g(new Function() { // from class: baoh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarG = botbVarE.b().g();
            if (!ekgbVarG.isEmpty() && (i = ((ekoe) ekgbVarG).c) != 1) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Unexpected cursor size:");
                cqbdVarE.G(i);
                cqbdVarE.s(new Throwable());
            }
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

    public final ekgb az(Optional optional, final ConversationIdType conversationIdType, Optional optional2) {
        ekgb ekgbVarAJ = aJ(conversationIdType);
        if (((Integer) optional2.orElseGet(new Supplier() { // from class: bang
            @Override // java.util.function.Supplier
            public final Object get() {
                return Integer.valueOf(this.a.c(conversationIdType));
            }
        })).intValue() != 2) {
            return ekgbVarAJ;
        }
        if (optional.isPresent()) {
            final aubq aubqVar = (aubq) optional.get();
            Stream streamFilter = Collection.EL.stream(ekgbVarAJ).filter(new Predicate() { // from class: banr
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
                    return !aubqVar.d.equals(((ParticipantsTable.BindData) obj).T());
                }
            });
            int i = ekgb.d;
            return (ekgb) streamFilter.collect(ekcv.a);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Failed to remove self from the list of message recipients as selfParticipant is empty.");
        cqbdVarE.r();
        return ekgbVarAJ;
    }

    @Override // defpackage.bakt
    public final int b(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationSourceType");
        try {
            ecem.b();
            bojh bojhVarR = r(conversationIdType);
            int iS = bojhVarR != null ? bojhVarR.s() : 0;
            eieuVarK.close();
            return iS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final int c(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationType");
        try {
            bojh bojhVarR = r(conversationIdType);
            int iK = bojhVarR != null ? bojhVarR.k() : -1;
            eieuVarK.close();
            return iK;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final int d(ConversationIdType conversationIdType) {
        return aK(conversationIdType, false).h();
    }

    @Override // defpackage.bakt
    public final int e(List list, boolean z) {
        ecem.b();
        String[] strArr = botm.a;
        botl botlVar = new botl();
        botlVar.u(list);
        if (!z) {
            botlVar.z();
        }
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#updateMarkAsUnread");
        try {
            bote boteVar = new bote();
            boteVar.ap("updateMarkedAsUnread");
            boteVar.af(new botf(botlVar));
            int iIntValue = botm.g().intValue();
            int iIntValue2 = botm.g().intValue();
            if (iIntValue2 < 59220) {
                dqru.x("marked_as_unread", iIntValue2);
            }
            if (iIntValue >= 59220) {
                boteVar.a.put("marked_as_unread", Boolean.valueOf(z));
            }
            int iE = boteVar.b().e();
            eieuVarK.close();
            return iE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final long f(ConversationIdType conversationIdType) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getCmsMostRecentIncomingReadMessageTimestampMs");
        try {
            bojh bojhVarR = r(conversationIdType);
            long jT = bojhVarR == null ? 0L : bojhVarR.t();
            eieuVarK.close();
            return jT;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final long g(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationRcsSession");
        try {
            cqaz.h();
            bojh bojhVarR = r(conversationIdType);
            long jV = bojhVarR != null ? bojhVarR.v() : -1L;
            eieuVarK.close();
            return jV;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final long h(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationSortTimestamp");
        try {
            bojh bojhVarR = r(conversationIdType);
            long jX = bojhVarR != null ? bojhVarR.x() : 0L;
            eieuVarK.close();
            return jX;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final SelfIdentityId i(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationSelfId");
        try {
            cqaz.h();
            bojh bojhVarR = r(conversationIdType);
            SelfIdentityId selfIdentityIdC = aofa.c(bojhVarR != null ? bojhVarR.T() : null);
            eieuVarK.close();
            return selfIdentityIdC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final /* synthetic */ baqv j(bara baraVar) {
        return k(baraVar, false);
    }

    @Override // defpackage.bakt
    public final baqv k(final bara baraVar, final boolean z) {
        return (baqv) this.g.c("ConversationDatabaseOperationsImpl#getOrCreateConversation", new ejxr() { // from class: bapg
            /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r6 = this;
                    cczi r0 = defpackage.avos.a
                    java.lang.Object r0 = r0.e()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    bapj r1 = r6.a
                    bara r2 = r3
                    boolean r3 = r2
                    if (r0 == 0) goto Lc4
                    if (r3 != 0) goto Ld0
                    r0 = r2
                    bakf r0 = (defpackage.bakf) r0
                    boolean r3 = r0.n
                    r4 = 0
                    if (r3 == 0) goto L74
                    cicq r3 = defpackage.cicr.w()
                    r5 = 1
                    r3.q(r5)
                    r3.p(r4)
                    emaf r5 = defpackage.emaf.UNKNOWN_TRIGGER_SOURCE
                    r3.w(r5)
                    r3.j(r4)
                    ekgb r4 = r0.e
                    r3.r(r4)
                    j$.util.Optional r4 = r0.o
                    baow r5 = new baow
                    r5.<init>()
                    r4.ifPresent(r5)
                    j$.util.Optional r4 = r0.q
                    baox r5 = new baox
                    r5.<init>()
                    r4.ifPresent(r5)
                    j$.util.Optional r4 = r0.p
                    baoz r5 = new baoz
                    r5.<init>()
                    r4.ifPresent(r5)
                    j$.util.Optional r4 = r0.l
                    bapa r5 = new bapa
                    r5.<init>()
                    r4.ifPresent(r5)
                    long r4 = r0.k
                    r3.z(r4)
                    fcsu r0 = r1.l
                    java.lang.Object r0 = r0.b()
                    awco r0 = (defpackage.awco) r0
                    cicr r3 = r3.D()
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r0.a(r3)
                    goto Ldb
                L74:
                    java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                    r3.<init>(r4)
                    bamt r4 = new bamt
                    r4.<init>()
                    ekgb r0 = r0.e
                    j$.util.stream.Stream r0 = j$.util.Collection.EL.stream(r0)
                    bamu r2 = new bamu
                    r2.<init>()
                    j$.util.stream.Stream r0 = r0.filter(r2)
                    bamw r2 = new bamw
                    r2.<init>()
                    j$.util.stream.Stream r0 = r0.map(r2)
                    int r2 = defpackage.ekgb.d
                    j$.util.stream.Collector r2 = defpackage.ekcv.a
                    java.lang.Object r0 = r0.collect(r2)
                    ekgb r0 = (defpackage.ekgb) r0
                    fcsu r1 = r1.k
                    java.lang.Object r1 = r1.b()
                    avpc r1 = (defpackage.avpc) r1
                    bojh r0 = r1.c(r0, r4)
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r0.C()
                    bakc r1 = new bakc
                    r1.<init>()
                    r1.b(r0)
                    boolean r0 = r3.get()
                    r1.c(r0)
                    baqv r0 = r1.a()
                    return r0
                Lc4:
                    if (r3 != 0) goto Ld0
                    r0 = r2
                    bakf r0 = (defpackage.bakf) r0
                    cnqj r0 = r0.a
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = defpackage.bakr.a(r1, r0)
                    goto Ldb
                Ld0:
                    r0 = r2
                    bakf r0 = (defpackage.bakf) r0
                    cnqj r0 = r0.a
                    cmmo r3 = defpackage.cmmo.f
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r1.p(r3, r0)
                Ldb:
                    boolean r3 = r0.b()
                    if (r3 != 0) goto Le6
                    baqv r0 = defpackage.baqv.c(r0)
                    return r0
                Le6:
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r1.l(r2)
                    baqv r0 = defpackage.baqv.d(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bapg.get():java.lang.Object");
            }
        });
    }

    @Override // defpackage.bakt
    public final ConversationIdType l(final bara baraVar) {
        ConversationIdType conversationIdType = (ConversationIdType) this.g.c("ConversationDatabaseOperationsImpl#createConversation", new ejxr() { // from class: ball
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                Optional optionalI;
                final bapj bapjVar = this.a;
                final bara baraVar2 = baraVar;
                SelfIdentityId selfIdentityId = (SelfIdentityId) baraVar2.q().orElseGet(new Supplier() { // from class: baon
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ekrw ekrwVarJ = bapj.b.j();
                        ekrwVarJ.X(eksq.a, "BugleDataModel");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 904, "ConversationDatabaseOperationsImpl.java")).q("selfId is not provided, fallback on default.");
                        return ((bbdl) bapjVar.c.b()).d().f();
                    }
                });
                ekgb ekgbVarG = baraVar2.g();
                if (ekgbVarG.isEmpty()) {
                    bapj.a.r("Creating conversation with empty list; using unknown sender.");
                    fcsu fcsuVar = bapjVar.h;
                    brvp brvpVarA = bbbe.a("ʼUNKNOWN_SENDER!ʼ");
                    ((bbca) fcsuVar.b()).j(brvpVarA);
                    ekgbVarG = ekgb.r(brvpVarA.a());
                }
                int iAu = bapjVar.au(baraVar2.a(), baraVar2.t(), baraVar2.g().size());
                Optional.empty();
                if (bvdi.d(iAu)) {
                    optionalI = baraVar2.i().or(new Supplier() { // from class: bald
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            Optional optionalFilter = baraVar2.p().filter(new Predicate() { // from class: baph
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
                                    String str = (String) obj;
                                    if (!str.isEmpty()) {
                                        int length = str.length();
                                        int iCharCount = 0;
                                        while (iCharCount < length) {
                                            int iCodePointAt = str.codePointAt(iCharCount);
                                            if (!Character.isWhitespace(iCodePointAt)) {
                                                return true;
                                            }
                                            iCharCount += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    return false;
                                }
                            });
                            final asqx asqxVar = (asqx) bapjVar.m.b();
                            asqxVar.getClass();
                            return optionalFilter.map(new Function() { // from class: baku
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return asqxVar.c((String) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                    });
                    if (!baraVar2.s()) {
                        Optional map = optionalI.map(new Function() { // from class: bale
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
                        });
                        boolean zS = baraVar2.s();
                        int iX = baraVar2.x();
                        if (!map.isEmpty()) {
                            if (bapj.aG(zS, iX)) {
                                bapjVar.aE(2);
                            } else if (bapj.aF(iX)) {
                                bapjVar.aE(6);
                            } else {
                                bapjVar.aE(1);
                            }
                            final String str = (String) map.get();
                            if (!Collection.EL.stream(ekgbVarG).anyMatch(new Predicate() { // from class: bali
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
                                    return str.equals(((ParticipantsTable.BindData) obj).T());
                                }
                            })) {
                                ekfw ekfwVar = new ekfw();
                                ekfwVar.j(ekgbVarG);
                                ekfwVar.h(bbbd.b((String) map.get()));
                                ekgbVarG = ekfwVar.g();
                            }
                        } else {
                            if (!bapj.aG(zS, iX) && !bapj.aF(iX)) {
                                bapjVar.aE(3);
                                throw new IllegalStateException("Self participant is not set.");
                            }
                            if (bapj.aG(zS, iX)) {
                                bapjVar.aE(4);
                                ekrw ekrwVarJ = bapj.b.j();
                                ekrwVarJ.X(eksq.a, "BugleDataModel");
                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "addSelfParticipantToParticipantList", 1136, "ConversationDatabaseOperationsImpl.java")).q("Self participant is not being set when recovering from telephony.");
                            } else if (bapj.aF(iX)) {
                                bapjVar.aE(5);
                                ekrw ekrwVarJ2 = bapj.b.j();
                                ekrwVarJ2.X(eksq.a, "BugleDataModel");
                                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "addSelfParticipantToParticipantList", 1140, "ConversationDatabaseOperationsImpl.java")).q("Self participant is not being set when recovering from CMS.");
                            }
                        }
                        ekgbVarG = ekgb.n(ekgbVarG);
                    }
                } else {
                    optionalI = baraVar2.i();
                }
                ekgb ekgbVarG2 = baraVar2.g();
                int size = ekgbVarG2.size();
                boolean zC = false;
                for (int i = 0; i < size; i++) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVarG2.get(i);
                    if (iAu != 2) {
                        ejwl.a(!bbdl.k(bindData));
                    }
                    zC = bbbe.c(bindData) | zC;
                }
                String[] strArr = botm.a;
                final bojm bojmVar = new bojm();
                bojmVar.as(baraVar2.f());
                bojmVar.au(0L);
                bojmVar.k(selfIdentityId.c());
                bojmVar.Y(bapj.av(ekgbVarG, iAu));
                bojmVar.C(zC);
                baraVar2.y();
                bojmVar.av(0);
                bojmVar.c(baraVar2.e());
                bojmVar.S(baraVar2.u());
                bojmVar.U(baraVar2.v());
                bojmVar.T((String) baraVar2.r().orElse(null));
                bojmVar.aa((String) baraVar2.k().orElse(null));
                bojmVar.i(iAu);
                bojmVar.am(baraVar2.b());
                bojmVar.E(baraVar2.a());
                bojmVar.aw(false);
                if (((aqnw) bapjVar.r.b()).a()) {
                    baraVar2.j().filter(new Predicate() { // from class: balp
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
                            return !((awjl) obj).equals(awjl.a);
                        }
                    }).ifPresent(new Consumer() { // from class: balu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            bojmVar.o((awjl) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                long jB = baraVar2.b();
                if (jB != -1) {
                    if (cqbe.c() || ((Boolean) ccze.Z.e()).booleanValue()) {
                        ejwl.l(bapjVar.q(jB).b());
                    }
                    bojmVar.am(jB);
                }
                if (baraVar2.t() && !baraVar2.s()) {
                    bojmVar.aj(Optional.of(bapjVar.i.f()));
                }
                if (baraVar2.t() || baraVar2.s()) {
                    baraVar2.o().ifPresent(new Consumer() { // from class: balv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            String str2 = (String) obj;
                            if (ejwk.c(str2)) {
                                return;
                            }
                            bojmVar.ai(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    baraVar2.l().ifPresent(new Consumer() { // from class: balw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            String str2 = (String) obj;
                            if (ejwk.c(str2)) {
                                return;
                            }
                            bojmVar.af(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    baraVar2.p().ifPresent(new Consumer() { // from class: balx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            String str2 = (String) obj;
                            if (ejwk.c(str2)) {
                                return;
                            }
                            bojmVar.ak(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                if (baraVar2.s()) {
                    bojmVar.g(cpyi.RESTORED_FROM_TELEPHONY);
                }
                if (((area) bapjVar.q.b()).a()) {
                    baraVar2.n().ifPresent(new Consumer() { // from class: baly
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            bojmVar.ah((Uri) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                baraVar2.m().ifPresent(new Consumer() { // from class: balz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        bojmVar.ag((cigb) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bapjVar.aB(bojmVar, ekgbVarG, iAu);
                ConversationIdType conversationIdTypeD = bojmVar.a().D();
                bapjVar.ap(optionalI, ekgbVarG, conversationIdTypeD, baraVar2.s());
                bapjVar.V(conversationIdTypeD, (String) baraVar2.h().orElse(null), iAu, true);
                if (!baraVar2.s()) {
                    bapjVar.aI(conversationIdTypeD);
                }
                final awch awchVarA = ((awci) bapjVar.p.b()).a();
                ekrw ekrwVarH = bapj.b.h();
                ekrwVarH.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 1081, "ConversationDatabaseOperationsImpl.java");
                Stream map2 = Collection.EL.stream(ekgbVarG).map(new Function() { // from class: bama
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return String.valueOf(((ParticipantsTable.BindData) obj).R());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Collector collector = ekcv.a;
                ekrdVar.I("ConversationDatabaseOperationsImpl: created id=%s with participantIds=%s and destinations=%s", conversationIdTypeD, map2.collect(collector), Collection.EL.stream(ekgbVarG).map(new baoy()).map(new Function() { // from class: bapi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((avog) awchVarA.a((String) obj)).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(collector));
                return conversationIdTypeD;
            }
        });
        ((bakq) this.o.b()).a(conversationIdType, baraVar.c());
        return conversationIdType;
    }

    @Override // defpackage.bakt
    public final /* synthetic */ ConversationIdType m(long j) {
        return o(cmol.a, j);
    }

    @Override // defpackage.bakt
    public final /* synthetic */ ConversationIdType n(cnqj cnqjVar) {
        return bakr.a(this, cnqjVar);
    }

    @Override // defpackage.bakt
    public final ConversationIdType o(cmmp cmmpVar, long j) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getExistingConversation");
        try {
            cqaz.h();
            ((cmmq) this.y.b()).a(cmmpVar);
            ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(ay(cmmpVar, j)).findFirst().orElse(barn.a);
            eieuVarK.close();
            return conversationIdType;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ConversationIdType p(cmmp cmmpVar, cnqj cnqjVar) {
        if (cnqjVar.d()) {
            return barn.a;
        }
        ((cmmq) this.y.b()).a(cmmpVar);
        return o(cmmpVar, cnqk.a(cnqjVar));
    }

    @Override // defpackage.bakt
    public final ConversationIdType q(final long j) {
        ConversationIdType conversationIdTypeH;
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getExistingRcsConversation");
        try {
            cqaz.h();
            cqaz.e(-1L, j);
            botb botbVarE = botm.e();
            botbVarE.A("getExistingRcsConversation");
            botbVarE.g(new Function() { // from class: bakw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.i(new Function() { // from class: bakx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.J(j);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                if (boprVar.moveToFirst()) {
                    if (boprVar.getCount() != 1) {
                        cqbd cqbdVarE = a.e();
                        cqbdVarE.I("Unexpected cursor size:");
                        cqbdVarE.G(boprVar.getCount());
                        cqbdVarE.s(new Throwable());
                    }
                    conversationIdTypeH = boprVar.h();
                } else {
                    conversationIdTypeH = barn.a;
                }
                boprVar.close();
                eieuVarK.close();
                return conversationIdTypeH;
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

    @Override // defpackage.bakt
    public final bojh r(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getConversationDataFromConversationId");
        try {
            bojh bojhVar = (bojh) botm.j(conversationIdType, new Function() { // from class: baoa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (bojh) obj;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return bojhVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final bvdk s(ConversationIdType conversationIdType) {
        return (bvdk) botm.j(conversationIdType, new Function() { // from class: banq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bojh) obj).G();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.bakt
    public final cpyi t(ConversationIdType conversationIdType) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getCmsLifeCycleState");
        try {
            cpyi cpyiVar = (cpyi) botm.j(conversationIdType, new Function() { // from class: bant
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bojh) obj).O();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return cpyiVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ekgb u() {
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getAllConversationIds");
        try {
            botb botbVarE = botm.e();
            botbVarE.A("getAllConversationIds");
            botbVarE.g(new Function() { // from class: baok
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
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

    @Override // defpackage.bakt
    public final /* synthetic */ ekgb v(cnqj cnqjVar) {
        return w(cmol.a, cnqjVar);
    }

    @Override // defpackage.bakt
    public final ekgb w(cmmp cmmpVar, cnqj cnqjVar) {
        return ay(cmmpVar, cnqk.a(cnqjVar));
    }

    @Override // defpackage.bakt
    public final ekgb x(final ConversationIdType conversationIdType) {
        String[] strArr = bgzx.a;
        bgzs bgzsVar = new bgzs(bgzx.a);
        bgzsVar.A("getRcsGroupJoinStatusOfParticipantsInConversation");
        bgzsVar.c(new Function() { // from class: bapc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bgzw bgzwVar = (bgzw) obj;
                bgzwVar.b(conversationIdType);
                return bgzwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bgzsVar.b().z();
    }

    @Override // defpackage.bakt
    public final ekgb y(final Optional optional, final ConversationIdType conversationIdType) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            ekgb ekgbVar = (ekgb) this.g.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new ejxr() { // from class: banz
                @Override // defpackage.ejxr
                public final Object get() {
                    return this.a.az(optional, conversationIdType, Optional.empty());
                }
            });
            eieuVarK.close();
            return ekgbVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bakt
    public final ekgb z(final Optional optional, final ConversationIdType conversationIdType, final int i) {
        ecem.b();
        eieu eieuVarK = eiiy.k("ConversationDatabaseOperationsImpl#getRecipientsForConversationWithCachedType");
        try {
            ekgb ekgbVar = (ekgb) this.g.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new ejxr() { // from class: bamz
                @Override // defpackage.ejxr
                public final Object get() {
                    return this.a.az(optional, conversationIdType, Optional.of(Integer.valueOf(i)));
                }
            });
            eieuVarK.close();
            return ekgbVar;
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
