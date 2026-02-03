package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byvu {
    static final cczi a = cdag.e(cdag.b, "max_message_deletion_failure_retry_count", 10);
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate");
    private final appc A;
    public final cpsn c;
    public final bzwr d;
    public final eosc e;
    public final eosc f;
    public final dqsn g;
    public final aurx h;
    public final bxlc i;
    public final fcsu j;
    public final efwo k;
    public final cdys l;
    public final fcsu m;
    public final cogw n;
    public final cajh o;
    public final apom p;
    public final appk q;
    public final bzqk r;
    public final apoi s;
    public final apoy t;
    public final appt u;
    public final bzap v;
    public final appa w;
    public final aukz x;
    public final aqfm y;
    private final bywf z;

    public byvu(cpsn cpsnVar, bzwr bzwrVar, eosc eoscVar, eosc eoscVar2, bywf bywfVar, aurx aurxVar, fcsu fcsuVar, bxlc bxlcVar, dqsn dqsnVar, cdys cdysVar, efwo efwoVar, fcsu fcsuVar2, cogw cogwVar, cajh cajhVar, apom apomVar, appk appkVar, bzqk bzqkVar, apoi apoiVar, apoy apoyVar, appt apptVar, appc appcVar, bzap bzapVar, appa appaVar, aukz aukzVar, aqfm aqfmVar) {
        this.c = cpsnVar;
        this.d = bzwrVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.j = fcsuVar;
        this.i = bxlcVar;
        this.g = dqsnVar;
        this.z = bywfVar;
        this.h = aurxVar;
        this.l = cdysVar;
        this.k = efwoVar;
        this.m = fcsuVar2;
        this.n = cogwVar;
        this.o = cajhVar;
        this.p = apomVar;
        this.q = appkVar;
        this.r = bzqkVar;
        this.s = apoiVar;
        this.t = apoyVar;
        this.u = apptVar;
        this.A = appcVar;
        this.v = bzapVar;
        this.w = appaVar;
        this.x = aukzVar;
        this.y = aqfmVar;
    }

    public static void k(Map map, Map map2, Map map3, int i, int i2, Map map4, long j) {
        for (Map.Entry entry : map3.entrySet()) {
            String str = (String) entry.getKey();
            map4.put(str, new byfw(Optional.ofNullable((MessagesTable.BindData) entry.getValue()), true, i2, i, j));
            map.remove(str);
            if (map2 != null) {
                map2.remove(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bypb l(final MessagesTable.BindData bindData, ekgb ekgbVar, long j) {
        Optional optionalOfNullable;
        ecem.b();
        Optional optionalE = bzzd.e(ekgbVar);
        if (bindData.m() == 2) {
            String strU = bindData.U();
            strU.getClass();
            ekgp ekgpVarD = bzzd.d(ekgp.l(strU, bindData));
            if (ekgpVarD.isEmpty()) {
                optionalOfNullable = Optional.empty();
            } else {
                String strU2 = bindData.U();
                strU2.getClass();
                optionalOfNullable = Optional.ofNullable((MessagesTable.BindData) ekgpVarD.get(strU2));
            }
        } else if (optionalE.isPresent()) {
            final String strL = ((PartsTable.BindData) optionalE.get()).L();
            if (strL == null) {
                throw new bzyz(String.format("XMS text part does not have a text for cms id = %s", bindData.U()));
            }
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("findDuplicationWithText");
            brdrVarD.h(new Function() { // from class: bzxb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = bzzd.a;
                    brecVar.m(bindData.D());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(bzzd.i(bindData));
            brdrVarD.h(new Function() { // from class: bzxc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = bzzd.a;
                    brecVar.b(new Function() { // from class: bzyt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            cqce cqceVar2 = bzzd.a;
                            brecVar2.i(cpyi.UNKNOWN);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bzyu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            cqce cqceVar2 = bzzd.a;
                            brecVar2.i(cpyi.RESTORED_FROM_TELEPHONY);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.h(new Function() { // from class: bzxe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    cqce cqceVar = bzzd.a;
                    bsjlVar.ap(new dqpj("parts.text", 1, strL));
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.E(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a).g());
            ekgb ekgbVarZ = brdrVarD.b().z();
            if (ekgbVarZ.isEmpty()) {
                cqbd cqbdVarC = bzzd.a.c();
                cqbdVarC.I("Found no duplicate messages with matching text");
                cqbdVarC.r();
                optionalOfNullable = Optional.empty();
            } else {
                if (ekgbVarZ.size() > 1) {
                    cqbd cqbdVarC2 = bzzd.a.c();
                    cqbdVarC2.I("Found multiple duplicate messages with matching text");
                    cqbdVarC2.A("conversation id", bindData.D());
                    cqbdVarC2.z("timestamp", bindData.w());
                    cqbdVarC2.r();
                }
                MessagesTable.BindData bindData2 = (MessagesTable.BindData) ekgbVarZ.get(0);
                cqbd cqbdVarC3 = bzzd.a.c();
                cqbdVarC3.I("Found duplicate message in Bugle Db with matching text");
                cqbdVarC3.A("message id", bindData2.E());
                cqbdVarC3.A("conversation id", bindData2.D());
                cqbdVarC3.z("timestamp", bindData2.w());
                cqbdVarC3.r();
                optionalOfNullable = Optional.ofNullable(bindData2);
            }
        } else {
            long jCount = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bzyx
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
                    cqce cqceVar = bzzd.a;
                    return le.f.contains(((PartsTable.BindData) obj).I());
                }
            }).count();
            bsgr bsgrVar = PartsTable.d;
            bsgs bsgsVar = bsgrVar.b;
            Integer numValueOf = Integer.valueOf(ekgbVar.size());
            bsgs bsgsVar2 = bsgrVar.f;
            dqxl dqxlVar = new dqxl("COUNT($V{p})=$V AND SUM(CASE WHEN $V{p} IS NULL THEN 1 WHEN $V{p} IN ($R) THEN 1 ELSE 0 END) = $V", new Object[]{bsgsVar, numValueOf, bsgsVar2, bsgsVar2, Collection.EL.stream(le.f).map(new bzwt()).collect(Collectors.joining(",")), Long.valueOf(jCount)});
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("findDuplicationForMedia");
            brao braoVar = MessagesTable.c.a;
            brdrVarD2.w(braoVar);
            brdrVarD2.x(dqxlVar);
            bsje bsjeVarC2 = PartsTable.c();
            bsjeVarC2.c(bsgsVar);
            dqtr dqtrVarI = dqts.i(bsjeVarC2.b(), bsgsVar, braoVar);
            ((dqos) dqtrVarI).e = "p";
            brdrVarD2.H(dqtrVarI.g());
            brdrVarD2.h(new Function() { // from class: bzwu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = bzzd.a;
                    brecVar.m(bindData.D());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.h(bzzd.i(bindData));
            brdrVarD2.h(new Function() { // from class: bzwv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = bzzd.a;
                    brecVar.b(new Function() { // from class: bzxv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            cqce cqceVar2 = bzzd.a;
                            brecVar2.i(cpyi.UNKNOWN);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bzxw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            cqce cqceVar2 = bzzd.a;
                            brecVar2.i(cpyi.RESTORED_FROM_TELEPHONY);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ2 = brdrVarD2.b().z();
            if (ekgbVarZ2.isEmpty()) {
                optionalOfNullable = Optional.empty();
            } else {
                MessagesTable.BindData bindData3 = (MessagesTable.BindData) ekgbVarZ2.get(0);
                cqbd cqbdVarC4 = bzzd.a.c();
                cqbdVarC4.I("Found duplicate textless message in Bugle Db");
                cqbdVarC4.A("message id", bindData3.E());
                cqbdVarC4.A("conversation id", bindData3.D());
                cqbdVarC4.z("timestamp", bindData3.w());
                cqbdVarC4.y("parts count", ekgbVar.size());
                cqbdVarC4.z("media parts count", ekgbVar.size() - jCount);
                cqbdVarC4.r();
                optionalOfNullable = Optional.ofNullable(bindData3);
            }
        }
        Optional optional = optionalOfNullable;
        return optional.isPresent() ? new byfw(optional, true, 5, 6, j) : bypb.f(j);
    }

    public final eiju a(final int i, final MessageIdType messageIdType) {
        return (eiju) MessagesTable.h(messageIdType, new Function() { // from class: byvg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int iIntValue = ((Integer) byvu.a.e()).intValue();
                final int i2 = i;
                if (i2 <= iIntValue) {
                    final MessageIdType messageIdType2 = messageIdType;
                    final byvu byvuVar = this.a;
                    return (byvuVar.q.a() ? byvuVar.l.b(messageIdType2, cdyt.DUPLICATE_MESSAGE_RESTORE_DELETION) : byvuVar.l.a(messageIdType2)).i(new eooz() { // from class: byth
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            cbcw cbcwVar = (cbcw) obj2;
                            Bundle bundleA = cbcwVar.a();
                            if ((bundleA == null || bundleA.getInt("delete_count") == 1) && !cbcwVar.equals(cbcw.k())) {
                                return eijx.e(true);
                            }
                            MessageIdType messageIdType3 = messageIdType2;
                            int i3 = i2;
                            byvu byvuVar2 = byvuVar;
                            ekrw ekrwVarJ = byvu.b.j();
                            ekrwVarJ.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteLocalMessage", 1427, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed, will try to retry again");
                            return byvuVar2.a(i3 + 1, messageIdType3);
                        }
                    }, byvuVar.e);
                }
                ekrw ekrwVarJ = byvu.b.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteLocalMessage", 1406, "CmsMessageObjectConsumerDelegate.java")).r("Delete message failed after retried %d times", i2);
                return eijx.e(false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: byvh
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = byvu.b;
                return eijx.e(true);
            }
        });
    }

    public final eiju b(final MessageIdType messageIdType, final MessagesTable.BindData bindData, final List list, final epjf epjfVar, final String str, final boolean z) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("CmsMessageObjectConsumerDelegate#deleteLocalMessageAndInsertCmsMessage");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("deleteLocalMessageAndInsertCmsMessage");
            brdrVarD.h(new Function() { // from class: byvp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    ekrg ekrgVar = byvu.b;
                    brecVar.m(bindData.D());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (brdrVarD.b().h() == 1) {
                ekrw ekrwVarJ = b.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "reinsertThenDelete", 1382, "CmsMessageObjectConsumerDelegate.java")).q("This is the only message in Conversation, we do insert-then-delete");
                h(bindData, list, epjfVar, str, z);
                eijuVarH = a(0, messageIdType).h(new ejvr() { // from class: bytg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = byvu.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        ekrw ekrwVarJ2 = byvu.b.j();
                        ekrwVarJ2.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "reinsertThenDelete", 1390, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed after insert, will not retry");
                        throw new byvx(cpyz.NO_RETRY);
                    }
                }, this.f);
                eieuVarK.b(eijuVarH);
            } else {
                ekrw ekrwVarH = b.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1357, "CmsMessageObjectConsumerDelegate.java")).t("Removing and re-adding message msgid=%s", messageIdType);
                eijuVarH = a(0, messageIdType).h(new ejvr() { // from class: bytv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            ekrw ekrwVarJ2 = byvu.b.j();
                            ekrwVarJ2.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1368, "CmsMessageObjectConsumerDelegate.java")).q("Delete duplicate message failed before insert, will not retry");
                            throw new byvy(cpyz.NO_RETRY);
                        }
                        boolean z2 = z;
                        String str2 = str;
                        epjf epjfVar2 = epjfVar;
                        List list2 = list;
                        MessagesTable.BindData bindData2 = bindData;
                        MessageIdType messageIdType2 = messageIdType;
                        byvu byvuVar = this.a;
                        ekrg ekrgVar = byvu.b;
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH2.X(ekrzVar, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1362, "CmsMessageObjectConsumerDelegate.java")).t("Removed message, re-adding msgid=%s", messageIdType2);
                        byvuVar.h(bindData2, list2, epjfVar2, str2, z2);
                        ekrw ekrwVarH3 = ekrgVar.h();
                        ekrwVarH3.X(ekrzVar, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteThenReinsert", 1365, "CmsMessageObjectConsumerDelegate.java")).t("Re-added message msgid=%s", messageIdType2);
                        return null;
                    }
                }, this.e);
                eieuVarK.b(eijuVarH);
            }
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju c(final defpackage.eqnd r4, final boolean r5, final boolean r6) throws java.lang.Throwable {
        /*
            r3 = this;
            apoy r0 = r3.t
            boolean r0 = r0.a()
            if (r0 == 0) goto L49
            if (r5 == 0) goto L49
            evvp r0 = r4.o
            if (r0 != 0) goto L10
            evvp r0 = defpackage.evvp.a
        L10:
            evvp r1 = defpackage.evxc.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            java.lang.String r5 = r4.c
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a(r5)
            if (r5 == 0) goto L36
            cdys r6 = r3.l
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r5.E()
            eiju r5 = r6.a(r5)
            byvm r6 = new byvm
            r6.<init>()
            eoqg r0 = defpackage.eoqg.a
            eiju r5 = r5.h(r6, r0)
            goto L3b
        L36:
            r5 = 0
            eiju r5 = defpackage.eijx.e(r5)
        L3b:
            byuh r6 = new byuh
            r6.<init>()
            eoqg r4 = defpackage.eoqg.a
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            eiju r4 = r5.f(r0, r6, r4)
            goto L65
        L49:
            aurx r0 = r3.h     // Catch: java.lang.Exception -> L5b
            eiju r0 = r0.q()     // Catch: java.lang.Exception -> L5b
            byus r1 = new byus     // Catch: java.lang.Exception -> L5b
            r1.<init>()     // Catch: java.lang.Exception -> L5b
            eosc r2 = r3.e     // Catch: java.lang.Exception -> L5b
            eiju r4 = r0.i(r1, r2)     // Catch: java.lang.Exception -> L5b
            goto L65
        L5b:
            cpsn r0 = r3.c
            cptg r0 = r0.a(r4)
            eiju r4 = r3.d(r0, r4, r5, r6)
        L65:
            appa r5 = r3.w
            boolean r5 = r5.a()
            if (r5 == 0) goto L81
            byut r5 = new byut
            r5.<init>()
            eoqg r6 = defpackage.eoqg.a
            eiju r4 = r4.i(r5, r6)
            byuu r5 = new byuu
            r5.<init>()
            eiju r4 = r4.h(r5, r6)
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byvu.c(eqnd, boolean, boolean):eiju");
    }

    public final eiju d(cpsm cpsmVar, final eqnd eqndVar, final boolean z, boolean z2) throws Throwable {
        apom apomVar = this.p;
        final MessagesTable.BindData bindDataA = cpsmVar.a();
        final List listC = cpsmVar.c();
        final epjf epjfVarB = (apomVar.a() && cpyl.a()) ? cpsmVar.b() : epjf.a;
        if (this.w.a() && cpsmVar.d()) {
            this.v.f(eqndVar.c);
        }
        final String str = eqndVar.c;
        final ekgb ekgbVarN = ekgb.n(listC);
        eieu eieuVarK = eiiy.k("CmsMessageObjectConsumerDelegate#deduplicateCmsMessageAsync");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: byto
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: all -> 0x02e3, TryCatch #0 {all -> 0x02e3, blocks: (B:3:0x000a, B:6:0x0020, B:8:0x0034, B:10:0x0046, B:13:0x005c, B:15:0x0066, B:24:0x00d5, B:26:0x00dc, B:16:0x006b, B:18:0x008a, B:19:0x008f, B:21:0x0095, B:22:0x00aa, B:23:0x00d1, B:27:0x00e6, B:29:0x00f0, B:35:0x0125, B:37:0x012b, B:38:0x0135, B:31:0x00f6, B:33:0x0115, B:34:0x011a, B:39:0x013b, B:42:0x0147, B:47:0x0170, B:49:0x0176, B:51:0x018e, B:53:0x01a0, B:54:0x01a6, B:56:0x01b3, B:57:0x01b8, B:59:0x01d7, B:60:0x01dc, B:62:0x01e2, B:63:0x01f7, B:64:0x021d, B:66:0x0223, B:67:0x022e, B:71:0x023c, B:73:0x0242, B:75:0x0248, B:77:0x0251, B:80:0x0258, B:82:0x0277, B:89:0x02bc, B:91:0x02c3, B:92:0x02cc, B:83:0x027c, B:86:0x0284, B:87:0x0295, B:88:0x02b8, B:93:0x02d1, B:94:0x02d6, B:43:0x014c, B:45:0x0152, B:46:0x016c), top: B:104:0x000a }] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 750
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.byto.call():java.lang.Object");
                }
            }, this.e);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            eieu eieuVarK2 = eiiy.k("CmsMessageObjectConsumerDelegate#resolveDuplication");
            try {
                eieuVarK2.b(eijuVarG);
                try {
                    eooz eoozVar = new eooz() { // from class: bytp
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final bypb bypbVar = (bypb) obj;
                            boolean zC = bypbVar.c();
                            final MessagesTable.BindData bindData = bindDataA;
                            final String str2 = str;
                            final byvu byvuVar = this.a;
                            if (!zC) {
                                byvuVar.j(bypbVar, bindData, str2, Optional.empty());
                                return eijx.e(bypbVar);
                            }
                            epjf epjfVar = epjfVarB;
                            ekgb ekgbVar = ekgbVarN;
                            int iD = bypbVar.d() - 1;
                            if (iD == 1) {
                                return byvuVar.d.a((MessagesTable.BindData) bypbVar.b().get(), bindData, ekgbVar, epjfVar).i(new eooz() { // from class: byti
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        bypb bypbVar2 = bypbVar;
                                        Optional optionalOf = Optional.of(((MessagesTable.BindData) bypbVar2.b().get()).E());
                                        byvuVar.j(bypbVar2, bindData, str2, optionalOf);
                                        return eijx.e(bypbVar2);
                                    }
                                }, byvuVar.e);
                            }
                            if (iD == 2) {
                                MessagesTable.BindData bindData2 = (MessagesTable.BindData) bypbVar.b().get();
                                eieu eieuVarK3 = eiiy.k("CmsMessageObjectConsumerDelegate#deduplicateByCmsIdAsync");
                                try {
                                    final MessageIdType messageIdTypeE = bindData2.E();
                                    ekrw ekrwVarH = byvu.b.h();
                                    ekrwVarH.X(eksq.a, "BugleCms");
                                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByCmsIdAsync", 1801, "CmsMessageObjectConsumerDelegate.java")).D("Deduplicating message with message id: %s, cmsId: %s", messageIdTypeE, bindData.U());
                                    eiju eijuVarA = byvuVar.d.a(bindData2, bindData, ekgbVar, epjfVar);
                                    eieuVarK3.b(eijuVarA);
                                    eiju eijuVarH = eijuVarA.h(new ejvr() { // from class: byur
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            ekrg ekrgVar = byvu.b;
                                            return messageIdTypeE;
                                        }
                                    }, byvuVar.f);
                                    eieuVarK3.close();
                                    return eijuVarH.h(new ejvr() { // from class: bytj
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            Optional optionalOf = Optional.of((MessageIdType) obj2);
                                            byvu byvuVar2 = byvuVar;
                                            bypb bypbVar2 = bypbVar;
                                            byvuVar2.j(bypbVar2, bindData, str2, optionalOf);
                                            return bypbVar2;
                                        }
                                    }, byvuVar.e);
                                } catch (Throwable th) {
                                    try {
                                        eieuVarK3.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            if (iD == 3) {
                                MessagesTable.BindData bindData3 = (MessagesTable.BindData) bypbVar.b().get();
                                eieu eieuVarK4 = eiiy.k("CmsMessageObjectConsumerDelegate#deduplicateByMessagePersistenceIdAsync");
                                try {
                                    final MessageIdType messageIdTypeE2 = bindData3.E();
                                    ekrw ekrwVarH2 = byvu.b.h();
                                    ekrwVarH2.X(eksq.a, "BugleCms");
                                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByMessagePersistenceIdAsync", 1842, "CmsMessageObjectConsumerDelegate.java")).I("Deduplicating message with message id: %s, cmsId: %s, persistence ID: %s", messageIdTypeE2, bindData.U(), bindData.R());
                                    eiju eijuVarA2 = byvuVar.d.a(bindData3, bindData, ekgbVar, epjfVar);
                                    eieuVarK4.b(eijuVarA2);
                                    eiju eijuVarH2 = eijuVarA2.h(new ejvr() { // from class: bytc
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            ekrg ekrgVar = byvu.b;
                                            return messageIdTypeE2;
                                        }
                                    }, byvuVar.e);
                                    eieuVarK4.close();
                                    return eijuVarH2.h(new ejvr() { // from class: bytk
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            Optional optionalOf = Optional.of((MessageIdType) obj2);
                                            byvu byvuVar2 = byvuVar;
                                            bypb bypbVar2 = bypbVar;
                                            byvuVar2.j(bypbVar2, bindData, str2, optionalOf);
                                            return bypbVar2;
                                        }
                                    }, byvuVar.e);
                                } catch (Throwable th3) {
                                    try {
                                        eieuVarK4.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            if (iD == 4) {
                                MessagesTable.BindData bindData4 = (MessagesTable.BindData) bypbVar.b().get();
                                eieu eieuVarK5 = eiiy.k("CmsMessageObjectConsumerDelegate#deduplicateByRcsIdAsync");
                                try {
                                    final MessageIdType messageIdTypeE3 = bindData4.E();
                                    ekrw ekrwVarH3 = byvu.b.h();
                                    ekrwVarH3.X(eksq.a, "BugleCms");
                                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateByRcsIdAsync", 1821, "CmsMessageObjectConsumerDelegate.java")).I("Deduplicating RCS message with message id: %s, cmsId: %s, rcsId: %s", messageIdTypeE3, bindData.U(), bindData.I());
                                    eiju eijuVarA3 = byvuVar.d.a(bindData4, bindData, ekgbVar, epjfVar);
                                    eieuVarK5.b(eijuVarA3);
                                    eiju eijuVarH3 = eijuVarA3.h(new ejvr() { // from class: bytu
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            ekrg ekrgVar = byvu.b;
                                            return messageIdTypeE3;
                                        }
                                    }, byvuVar.e);
                                    eieuVarK5.close();
                                    return eijuVarH3.h(new ejvr() { // from class: bytm
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            Optional optionalOf = Optional.of((MessageIdType) obj2);
                                            byvu byvuVar2 = byvuVar;
                                            bypb bypbVar2 = bypbVar;
                                            byvuVar2.j(bypbVar2, bindData, str2, optionalOf);
                                            return bypbVar2;
                                        }
                                    }, byvuVar.e);
                                } catch (Throwable th5) {
                                    try {
                                        eieuVarK5.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                    throw th5;
                                }
                            }
                            if (iD != 5) {
                                byvuVar.j(bypbVar, bindData, str2, Optional.empty());
                                return eijx.e(bypbVar);
                            }
                            MessagesTable.BindData bindData5 = (MessagesTable.BindData) bypbVar.b().get();
                            eieu eieuVarK6 = eiiy.k("CmsMessageObjectConsumerDelegate#deduplicateForXmsAsync");
                            try {
                                final MessageIdType messageIdTypeE4 = bindData5.E();
                                ekrw ekrwVarH4 = byvu.b.h();
                                ekrwVarH4.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deduplicateForXmsAsync", 1881, "CmsMessageObjectConsumerDelegate.java")).D("Deduplicating XMS message with message id: %s, cmsId: %s", messageIdTypeE4, bindData.U());
                                eiju eijuVarA4 = byvuVar.d.a(bindData5, bindData, ekgbVar, epjfVar);
                                eieuVarK6.b(eijuVarA4);
                                eiju eijuVarH4 = eijuVarA4.h(new ejvr() { // from class: byuv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        ekrg ekrgVar = byvu.b;
                                        return messageIdTypeE4;
                                    }
                                }, byvuVar.e);
                                eieuVarK6.close();
                                return eijuVarH4.h(new ejvr() { // from class: bytn
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        Optional optionalOf = Optional.of((MessageIdType) obj2);
                                        byvu byvuVar2 = byvuVar;
                                        bypb bypbVar2 = bypbVar;
                                        byvuVar2.j(bypbVar2, bindData, str2, optionalOf);
                                        return bypbVar2;
                                    }
                                }, byvuVar.e);
                            } catch (Throwable th7) {
                                try {
                                    eieuVarK6.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                    };
                    eosc eoscVar = this.e;
                    eiju eijuVarF = eijuVarG.i(eoozVar, eoscVar).h(new ejvr() { // from class: bytq
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return Boolean.valueOf(((bypb) obj).c());
                        }
                    }, this.f).f(bzyy.class, new eooz() { // from class: bytr
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            MessageIdType messageIdType = ((bzyy) obj).a;
                            MessagesTable.BindData bindData = bindDataA;
                            ekgb ekgbVar = ekgbVarN;
                            epjf epjfVar = epjfVarB;
                            String str2 = str;
                            byvu byvuVar = this.a;
                            return byvuVar.b(messageIdType, bindData, ekgbVar, epjfVar, str2, z).h(new ejvr() { // from class: byug
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    ekrg ekrgVar = byvu.b;
                                    return true;
                                }
                            }, byvuVar.f);
                        }
                    }, eoscVar);
                    eieuVarK2.close();
                    eiju eijuVarH = eijuVarF.h(new ejvr() { // from class: byvd
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                return null;
                            }
                            boolean z3 = z;
                            eqnd eqndVar2 = eqndVar;
                            epjf epjfVar = epjfVarB;
                            List list = listC;
                            this.a.h(bindDataA, list, epjfVar, eqndVar2.c, z3);
                            return null;
                        }
                    }, this.e);
                    boolean z3 = true;
                    boolean z4 = cpyl.a() && ((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue() && !z2 && !this.A.a();
                    if (!cpyl.a()) {
                        z3 = z4;
                    } else if (!z4 || !z) {
                        z3 = false;
                    }
                    if (!z3) {
                        return eijuVarH;
                    }
                    eooz eoozVar2 = new eooz() { // from class: byvn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return this.a.h.s();
                        }
                    };
                    eosc eoscVar2 = this.f;
                    return eijuVarH.i(eoozVar2, eoscVar2).i(new eooz() { // from class: byvo
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((Boolean) obj).booleanValue() ? this.a.h.u(1L) : eijx.e(null);
                        }
                    }, eoscVar2);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        eieuVarK2.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } finally {
        }
    }

    public final eiju e(final String str, final Optional optional, final ekgb ekgbVar, final Map map, final Map map2, final Map map3, final Map map4, final Map map5, final ekgi ekgiVar) {
        return eijx.h(new eooy() { // from class: byuf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                int i = ekgb.d;
                final ekfw ekfwVar = new ekfw();
                final byvu byvuVar = this.a;
                final ekgb ekgbVar2 = ekgbVar;
                final String str2 = str;
                final Optional optional2 = optional;
                final Map map6 = map;
                final Map map7 = map2;
                final Map map8 = map3;
                final Map map9 = map4;
                final Map map10 = map5;
                final ekgi ekgiVar2 = ekgiVar;
                ((Boolean) byvuVar.g.b(new ejxr() { // from class: bytb
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:363:0x0cfc A[Catch: all -> 0x0dda, TRY_LEAVE, TryCatch #25 {all -> 0x0dda, blocks: (B:383:0x0d90, B:384:0x0d98, B:386:0x0d9e, B:320:0x0b34, B:321:0x0b59, B:323:0x0b5f, B:325:0x0b65, B:327:0x0b6b, B:359:0x0ccc, B:360:0x0ce8, B:361:0x0cf6, B:363:0x0cfc, B:364:0x0d03, B:367:0x0d1c, B:369:0x0d2c, B:371:0x0d3a, B:373:0x0d7d, B:381:0x0d8b, B:380:0x0d88, B:382:0x0d8c, B:338:0x0b98, B:340:0x0bad, B:345:0x0be2, B:346:0x0c56, B:348:0x0c5c, B:349:0x0c75, B:372:0x0d40, B:377:0x0d83), top: B:465:0x0ab0, inners: #12, #16, #18 }] */
                    /* JADX WARN: Removed duplicated region for block: B:371:0x0d3a A[Catch: all -> 0x0dda, TRY_LEAVE, TryCatch #25 {all -> 0x0dda, blocks: (B:383:0x0d90, B:384:0x0d98, B:386:0x0d9e, B:320:0x0b34, B:321:0x0b59, B:323:0x0b5f, B:325:0x0b65, B:327:0x0b6b, B:359:0x0ccc, B:360:0x0ce8, B:361:0x0cf6, B:363:0x0cfc, B:364:0x0d03, B:367:0x0d1c, B:369:0x0d2c, B:371:0x0d3a, B:373:0x0d7d, B:381:0x0d8b, B:380:0x0d88, B:382:0x0d8c, B:338:0x0b98, B:340:0x0bad, B:345:0x0be2, B:346:0x0c56, B:348:0x0c5c, B:349:0x0c75, B:372:0x0d40, B:377:0x0d83), top: B:465:0x0ab0, inners: #12, #16, #18 }] */
                    /* JADX WARN: Removed duplicated region for block: B:386:0x0d9e A[Catch: all -> 0x0dda, LOOP:2: B:384:0x0d98->B:386:0x0d9e, LOOP_END, TRY_LEAVE, TryCatch #25 {all -> 0x0dda, blocks: (B:383:0x0d90, B:384:0x0d98, B:386:0x0d9e, B:320:0x0b34, B:321:0x0b59, B:323:0x0b5f, B:325:0x0b65, B:327:0x0b6b, B:359:0x0ccc, B:360:0x0ce8, B:361:0x0cf6, B:363:0x0cfc, B:364:0x0d03, B:367:0x0d1c, B:369:0x0d2c, B:371:0x0d3a, B:373:0x0d7d, B:381:0x0d8b, B:380:0x0d88, B:382:0x0d8c, B:338:0x0b98, B:340:0x0bad, B:345:0x0be2, B:346:0x0c56, B:348:0x0c5c, B:349:0x0c75, B:372:0x0d40, B:377:0x0d83), top: B:465:0x0ab0, inners: #12, #16, #18 }] */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
                    /* JADX WARN: Type inference failed for: r27v15, types: [eieu] */
                    /* JADX WARN: Type inference failed for: r27v26, types: [eieu] */
                    /* JADX WARN: Type inference failed for: r27v27 */
                    /* JADX WARN: Type inference failed for: r27v28 */
                    /* JADX WARN: Type inference failed for: r27v36 */
                    /* JADX WARN: Type inference failed for: r27v37 */
                    /* JADX WARN: Type inference failed for: r28v10 */
                    /* JADX WARN: Type inference failed for: r28v11 */
                    /* JADX WARN: Type inference failed for: r28v12 */
                    /* JADX WARN: Type inference failed for: r28v13 */
                    /* JADX WARN: Type inference failed for: r28v7 */
                    /* JADX WARN: Type inference failed for: r2v31, types: [bzwr] */
                    /* JADX WARN: Type inference failed for: r2v32 */
                    /* JADX WARN: Type inference failed for: r2v40 */
                    /* JADX WARN: Type inference failed for: r2v41 */
                    /* JADX WARN: Type inference failed for: r2v47 */
                    /* JADX WARN: Type inference failed for: r30v15 */
                    /* JADX WARN: Type inference failed for: r30v16 */
                    /* JADX WARN: Type inference failed for: r30v20 */
                    /* JADX WARN: Type inference failed for: r31v2 */
                    /* JADX WARN: Type inference failed for: r31v3, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r31v7 */
                    /* JADX WARN: Type inference failed for: r32v0 */
                    /* JADX WARN: Type inference failed for: r32v10 */
                    /* JADX WARN: Type inference failed for: r32v12 */
                    /* JADX WARN: Type inference failed for: r32v13 */
                    /* JADX WARN: Type inference failed for: r32v2 */
                    /* JADX WARN: Type inference failed for: r32v4, types: [eieu] */
                    /* JADX WARN: Type inference failed for: r32v5 */
                    /* JADX WARN: Type inference failed for: r32v7 */
                    /* JADX WARN: Type inference failed for: r32v8 */
                    /* JADX WARN: Type inference failed for: r32v9 */
                    /* JADX WARN: Type inference failed for: r4v10 */
                    /* JADX WARN: Type inference failed for: r4v11 */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v14 */
                    /* JADX WARN: Type inference failed for: r4v4, types: [ekfe, ekot] */
                    /* JADX WARN: Type inference failed for: r4v5, types: [ekot] */
                    /* JADX WARN: Type inference failed for: r4v6 */
                    @Override // defpackage.ejxr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 3593
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bytb.get():java.lang.Object");
                    }
                })).booleanValue();
                return eijx.e(ekfwVar.g());
            }
        }, this.e);
    }

    public final eiju f() {
        return this.h.q().i(new eooz() { // from class: byue
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e("");
                }
                final tpi tpiVar = (tpi) this.a.j.b();
                return tpiVar.e.g().i(new eooz() { // from class: tpa
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        aulz aulzVar = (aulz) obj2;
                        long jLongValue = aulzVar.d + ((Long) tpi.a.e()).longValue();
                        tpi tpiVar2 = tpiVar;
                        return jLongValue > tpiVar2.f.f().toEpochMilli() ? eork.i(aulzVar.c) : tpiVar2.b();
                    }
                }, tpiVar.g);
            }
        }, this.f);
    }

    public final eiju g() {
        return this.h.q().i(new eooz() { // from class: byvq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(Optional.empty());
                }
                byvu byvuVar = this.a;
                final tpi tpiVar = (tpi) byvuVar.j.b();
                return tpiVar.e.g().i(new eooz() { // from class: tpb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        aulz aulzVar = (aulz) obj2;
                        long jLongValue = aulzVar.d + ((Long) tpi.a.e()).longValue();
                        final tpi tpiVar2 = tpiVar;
                        return jLongValue > tpiVar2.f.f().toEpochMilli() ? eork.i(tpiVar2.j.n(aulzVar.c)) : tpiVar2.c.a().h(new ejvr() { // from class: toz
                            /* JADX WARN: Type inference failed for: r2v4, types: [cmfo, java.lang.Object] */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                tpi tpiVar3 = tpiVar2;
                                alqm alqmVarA = tpiVar3.a((eymf) obj3);
                                String strO = alqmVarA.o();
                                ecem.b();
                                auly aulyVar = (auly) aulz.a.createBuilder();
                                aulyVar.copyOnWrite();
                                aulz aulzVar2 = (aulz) aulyVar.instance;
                                aulzVar2.b |= 1;
                                aulzVar2.c = strO;
                                aurx aurxVar = tpiVar3.e;
                                long epochMilli = aurxVar.d.f().toEpochMilli();
                                aulyVar.copyOnWrite();
                                aulz aulzVar3 = (aulz) aulyVar.instance;
                                aulzVar3.b |= 2;
                                aulzVar3.d = epochMilli;
                                final aulz aulzVar4 = (aulz) aulyVar.build();
                                aurxVar.e.get().m(new ejvr() { // from class: aupv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj4) {
                                        cqce cqceVar = aurx.a;
                                        aumg builder = ((aumq) obj4).toBuilder();
                                        builder.copyOnWrite();
                                        aumq aumqVar = (aumq) builder.instance;
                                        aulz aulzVar5 = aulzVar4;
                                        aulzVar5.getClass();
                                        aumqVar.u = aulzVar5;
                                        aumqVar.b |= 131072;
                                        return builder.build();
                                    }
                                });
                                aurxVar.L();
                                return alqmVarA;
                            }
                        }, tpiVar2.h);
                    }
                }, tpiVar.g).h(new ejvr() { // from class: byty
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Optional.of((alqm) obj2);
                    }
                }, byvuVar.f);
            }
        }, this.f);
    }

    public final void h(MessagesTable.BindData bindData, final List list, final epjf epjfVar, final String str, final boolean z) {
        if (!z && !byed.g(bindData.s())) {
            Uri uriA = this.z.a(bindData, ekgb.n(list));
            if (uriA == null) {
                throw new bywe(cpyz.RETRY);
            }
            bquu bquuVarJ = bindData.J();
            bquuVarJ.ao(uriA);
            bindData = bquuVarJ.a();
        }
        final MessagesTable.BindData bindData2 = bindData;
    }

    public final eiju i(final ekgb ekgbVar, final Optional optional) {
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(ekgbVar).collect(ekcv.a(new Function() { // from class: byuy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eqnd) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity()));
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        final HashMap map3 = new HashMap();
        final HashMap map4 = new HashMap();
        final HashMap map5 = new HashMap();
        final ekgi ekgiVar = new ekgi();
        eiju eijuVarQ = this.h.q();
        eooz eoozVar = new eooz() { // from class: byuz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final byvu byvuVar = this.a;
                final ekgb ekgbVar2 = ekgbVar;
                final Map map6 = map;
                final Map map7 = map2;
                final Map map8 = map3;
                final Map map9 = map4;
                final Map map10 = map5;
                final ekgi ekgiVar2 = ekgiVar;
                if (!zBooleanValue) {
                    return byvuVar.e("", Optional.empty(), ekgbVar2, map6, map7, map8, map9, map10, ekgiVar2);
                }
                cczv cczvVar = alvx.a;
                return ((Boolean) new alvn().get()).booleanValue() ? byvuVar.g().i(new eooz() { // from class: bytl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return byvuVar.e("", (Optional) obj2, ekgbVar2, map6, map7, map8, map9, map10, ekgiVar2);
                    }
                }, eoqg.a) : byvuVar.f().i(new eooz() { // from class: bytw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return byvuVar.e((String) obj2, Optional.empty(), ekgbVar2, map6, map7, map8, map9, map10, ekgiVar2);
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        final eiju eijuVarI = eijuVarQ.i(eoozVar, eoqgVar);
        eooz eoozVar2 = new eooz() { // from class: byva
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrg ekrgVar = byvu.b;
                Consumer consumer = new Consumer() { // from class: byua
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ekrg ekrgVar2 = byvu.b;
                        ((cark) obj2).a("getLists and deduplication results");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Optional optional2 = optional;
                optional2.ifPresent(consumer);
                Stream map6 = Collection.EL.stream((ekgb) obj).map(new byub());
                int i = ekgb.d;
                ekgb ekgbVar2 = (ekgb) map6.collect(ekcv.a);
                optional2.ifPresent(new Consumer() { // from class: byuc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ekrg ekrgVar2 = byvu.b;
                        ((cark) obj2).a("Deduplication logic");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                return eijx.e(ekgbVar2);
            }
        };
        eosc eoscVar = this.e;
        eiju eijuVarI2 = eijuVarI.i(eoozVar2, eoscVar).h(new ejvr() { // from class: byvb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final byvu byvuVar;
                epjf epjfVar;
                ekgb ekgbVar2 = (ekgb) obj;
                boolean zIsEmpty = ekgbVar2.isEmpty();
                ekgi ekgiVar2 = ekgiVar;
                if (zIsEmpty) {
                    ekrw ekrwVarH = byvu.b.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "executeRestoreCmsItemDataList", 483, "CmsMessageObjectConsumerDelegate.java")).q("0 messages to be inserted in BugleDb.");
                    return ekgiVar2.c();
                }
                ekrw ekrwVarH2 = byvu.b.h();
                ekrwVarH2.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "executeRestoreCmsItemDataList", 486, "CmsMessageObjectConsumerDelegate.java")).w("Bulk inserting %d messages in BugleDb. Messages CMS Id's=%s", ekgbVar2.size(), ekgbVar2);
                ekfw ekfwVar = new ekfw();
                int size = ekgbVar2.size();
                int i = 0;
                while (true) {
                    byvuVar = this.a;
                    if (i >= size) {
                        break;
                    }
                    Map map6 = map3;
                    Map map7 = map;
                    String str = (String) ekgbVar2.get(i);
                    MessagesTable.BindData bindData = (MessagesTable.BindData) map7.get(str);
                    bindData.getClass();
                    ekgb ekgbVar3 = (ekgb) map6.get(str);
                    ekgbVar3.getClass();
                    apom apomVar = byvuVar.p;
                    Optional optionalEmpty = Optional.empty();
                    if (apomVar.a() && cpyl.a() && (epjfVar = (epjf) map4.get(str)) != null) {
                        optionalEmpty = Optional.of(epjfVar);
                    }
                    Map map8 = map2;
                    final bygd bygdVar = new bygd();
                    bygdVar.c(str);
                    bygdVar.a = bindData;
                    bygdVar.b = ekgbVar3;
                    optionalEmpty.ifPresent(new Consumer() { // from class: byui
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            bygdVar.b((epjf) obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    bpvd bpvdVar = (bpvd) map8.get(str);
                    if (bpvdVar != null) {
                        bygdVar.c = bpvdVar;
                    }
                    ekfwVar.h(bygdVar.a());
                    i++;
                }
                final ekgb ekgbVarG = ekfwVar.g();
                if (!ekgbVarG.isEmpty()) {
                    try {
                        byvuVar.g.d("CmsMessageObjectConsumer#bulkRestoreCmsMessageToBugleDb", new Runnable() { // from class: byud
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekgb ekgbVar4;
                                int i2;
                                ekgb ekgbVar5 = ekgbVarG;
                                int i3 = 0;
                                long[] jArrB = dqru.B(MessagesTable.f(), 0, true, new BiConsumer() { // from class: bqud
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        MessagesTable.BindData bindData2 = (MessagesTable.BindData) obj2;
                                        Long l = (Long) obj3;
                                        String[] strArr = MessagesTable.a;
                                        if (l.longValue() >= 0) {
                                            bindData2.a = new MessageIdType(l.longValue());
                                            bindData2.fN(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (MessagesTable.BindData[]) Collection.EL.stream(ekgbVar5).map(new Function() { // from class: byul
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        ekrg ekrgVar = byvu.b;
                                        bquu bquuVarJ = ((bzar) obj2).b().J();
                                        bquuVarJ.l(cpyi.CMS_RESTORE_IN_PROGRESS);
                                        return bquuVarJ.a();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: byum
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i4) {
                                        ekrg ekrgVar = byvu.b;
                                        return new MessagesTable.BindData[i4];
                                    }
                                }));
                                if (jArrB == null) {
                                    throw new cpyv(79, "Returned message ids list from bugle bulk insertion is null!", cpyz.NO_RETRY);
                                }
                                int i4 = ((ekoe) ekgbVar5).c;
                                ejwl.b(i4 == jArrB.length, "Container list's size is not equal to length of returned message ids!");
                                Stream streamMapToObj = DesugarArrays.stream(jArrB).mapToObj(new LongFunction() { // from class: byun
                                    @Override // java.util.function.LongFunction
                                    public final Object apply(long j) {
                                        ekrg ekrgVar = byvu.b;
                                        return new MessageIdType(j);
                                    }
                                });
                                Collector collector = ekcv.a;
                                final ekgb ekgbVar6 = (ekgb) streamMapToObj.collect(collector);
                                byga bygaVar = new byga();
                                bygaVar.a(ekoe.a);
                                ekfw ekfwVar2 = new ekfw();
                                ekfw ekfwVar3 = new ekfw();
                                int i5 = 0;
                                while (i5 < i4) {
                                    bzar bzarVar = (bzar) ekgbVar5.get(i5);
                                    ekgb ekgbVarC = bzarVar.c();
                                    int size2 = ekgbVarC.size();
                                    for (int i6 = i3; i6 < size2; i6++) {
                                        bscl bsclVarW = ((PartsTable.BindData) ekgbVarC.get(i6)).w();
                                        bsclVarW.J((MessageIdType) ekgbVar6.get(i5));
                                        ekfwVar2.h(new bygc(bzarVar.b(), bsclVarW.a()));
                                    }
                                    bpvd bpvdVarA = bzarVar.a();
                                    if (bpvdVarA != null) {
                                        bpvi bpviVar = new bpvi();
                                        bpviVar.c(bpvdVarA, false, bpvdVarA.cL);
                                        bpviVar.n((MessageIdType) ekgbVar6.get(i5));
                                        ekfwVar3.h(bpviVar.a());
                                    }
                                    i5++;
                                    i3 = 0;
                                }
                                ekgb ekgbVarG2 = ekfwVar2.g();
                                if (ekgbVarG2 == null) {
                                    throw new NullPointerException("Null partAndAssociatedMessageList");
                                }
                                bygaVar.a = ekgbVarG2;
                                bygaVar.a(ekfwVar3.g());
                                ekgb ekgbVar7 = bygaVar.a;
                                if (ekgbVar7 == null || (ekgbVar4 = bygaVar.b) == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (bygaVar.a == null) {
                                        sb.append(" partAndAssociatedMessageList");
                                    }
                                    if (bygaVar.b == null) {
                                        sb.append(" linkPreviewList");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                byvu byvuVar2 = byvuVar;
                                bygb bygbVar = new bygb(ekgbVar7, ekgbVar4);
                                ekgb ekgbVar8 = bygbVar.a;
                                long[] jArrB2 = dqru.B(PartsTable.d(), 0, true, new BiConsumer() { // from class: bsbz
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        PartsTable.BindData bindData2 = (PartsTable.BindData) obj2;
                                        Long l = (Long) obj3;
                                        String[] strArr = PartsTable.a;
                                        if (l.longValue() >= 0) {
                                            bindData2.a = String.valueOf(l);
                                            bindData2.fN(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (PartsTable.BindData[]) Collection.EL.stream(ekgbVar8).map(new Function() { // from class: byuo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((byvt) obj2).b();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: byup
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i7) {
                                        ekrg ekrgVar = byvu.b;
                                        return new PartsTable.BindData[i7];
                                    }
                                }));
                                if (byvuVar2.p.a() && cpyl.a()) {
                                    final ekfw ekfwVar4 = new ekfw();
                                    for (final int i7 = 0; i7 < i4; i7++) {
                                        final bzar bzarVar2 = (bzar) ekgbVar5.get(i7);
                                        bzarVar2.d().ifPresent(new Consumer() { // from class: byux
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                ekrg ekrgVar = byvu.b;
                                                ekfwVar4.h(new cajg(((MessageIdType) ekgbVar6.get(i7)).b(), bzarVar2.e(), (epjf) obj2));
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                    cajh cajhVar = byvuVar2.o;
                                    cajhVar.a(ekfwVar4.g(), 2);
                                    ekgb ekgbVar9 = (ekgb) Collection.EL.stream(ekgbVar5).map(new byub()).collect(collector);
                                    ekgbVar9.getClass();
                                    ekgb<bmxf> ekgbVarA = cpuv.a(ekgbVar9);
                                    ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
                                    for (bmxf bmxfVar : ekgbVarA) {
                                        String strValueOf = String.valueOf(bmxfVar.k());
                                        String strN = bmxfVar.n();
                                        strN.getClass();
                                        epjd epjdVar = (epjd) epjf.a.createBuilder();
                                        epjdVar.a(bmxfVar.m().name(), evqs.x(bmxfVar.o()));
                                        evsn evsnVarBuild = epjdVar.build();
                                        evsnVarBuild.getClass();
                                        arrayList.add(new cajg(strValueOf, strN, (epjf) evsnVarBuild));
                                    }
                                    cajhVar.a(arrayList, 2);
                                }
                                ekgb ekgbVar10 = bygbVar.b;
                                if (ekgbVar10.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    dqru.B(bpxj.c(), 5, false, new BiConsumer() { // from class: bpuv
                                        @Override // java.util.function.BiConsumer
                                        public final void accept(Object obj2, Object obj3) {
                                            bpvd bpvdVar2 = (bpvd) obj2;
                                            Long l = (Long) obj3;
                                            String[] strArr = bpxj.a;
                                            if (l.longValue() >= 0) {
                                                bpvdVar2.a = l.longValue();
                                                bpvdVar2.fN(0);
                                            }
                                        }

                                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                                        }
                                    }, (bpvd[]) Collection.EL.stream(ekgbVar10).toArray(new IntFunction() { // from class: byuq
                                        @Override // java.util.function.IntFunction
                                        public final Object apply(int i8) {
                                            ekrg ekrgVar = byvu.b;
                                            return new bpvd[i8];
                                        }
                                    }));
                                }
                                brdu brduVar = new brdu();
                                brduVar.m(cpyi.RESTORED_FROM_CMS);
                                brec brecVar = new brec();
                                brecVar.t(ekgbVar6);
                                brduVar.W(brecVar);
                                brduVar.ap("bulkRestoreCmsMessageToBugleDb-cmsLifeCycle-restored");
                                brduVar.b().e();
                                if (jArrB2 == null) {
                                    throw new cpyv(80, "Returned part ids list from bugle bulk insertion is null!", cpyz.NO_RETRY);
                                }
                                int i8 = ((ekoe) ekgbVar8).c;
                                if (jArrB2.length != i8) {
                                    throw new cpyv(81, "Returned parts id size is different from Part data list size!", cpyz.NO_RETRY);
                                }
                                if (byvuVar2.s.a()) {
                                    return;
                                }
                                while (i2 < i8) {
                                    long j = jArrB2[i2];
                                    byvt byvtVar = (byvt) ekgbVar8.get(i2);
                                    if (le.p(byvtVar.b().I())) {
                                        byvuVar2.r.b(byvtVar.b().v(), byvtVar.a().U(), String.valueOf(j), byvuVar2.k.a(), true);
                                    }
                                    i2++;
                                }
                            }
                        });
                    } catch (RuntimeException e) {
                        if ((e instanceof cpyv) && ((cpyv) e).b == cpyz.RETRY) {
                            throw e;
                        }
                        ekrw ekrwVarJ = byvu.b.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "bulkRestoreCmsMessagesWithIterativeFallback", (char) 623, "CmsMessageObjectConsumerDelegate.java")).q("Bulk insert failed with non retriable exception. Falling back to iterative insert.");
                        if (((eoth) ((aqew) byvuVar.y).a.b()).a("bugle.log_restore_failure_for_iterative_fallback")) {
                            byvuVar.x.w(2, 0, e, 0, null);
                        }
                        int i2 = ((ekoe) ekgbVarG).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            bzar bzarVar = (bzar) ekgbVarG.get(i3);
                            try {
                                byvuVar.h(bzarVar.b(), bzarVar.c(), (epjf) (bzarVar.d().isPresent() ? bzarVar.d().get() : epjf.a), bzarVar.e(), true);
                            } catch (RuntimeException e2) {
                                eqnd eqndVar = (eqnd) ekgpVar.get(bzarVar.e());
                                eqndVar.getClass();
                                ekgiVar2.i(eqndVar, e2);
                            }
                        }
                    }
                }
                optional.ifPresent(new Consumer() { // from class: byuj
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ekrg ekrgVar = byvu.b;
                        ((cark) obj2).a("BugleDb bulk insert");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ekgiVar2.c();
            }
        }, eoscVar).i(new eooz() { // from class: byvc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgp ekgpVar2 = (ekgp) obj;
                if (ekgpVar2.isEmpty()) {
                    return eijx.e(ekgpVar2);
                }
                ArrayList arrayList = new ArrayList();
                final ekgi ekgiVar2 = new ekgi();
                ekqg ekqgVarListIterator = ekgpVar2.entrySet().listIterator();
                while (true) {
                    byvu byvuVar = this.a;
                    if (!ekqgVarListIterator.hasNext()) {
                        return eijx.j(arrayList).a(new Callable() { // from class: bytt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ekgiVar2.c();
                            }
                        }, byvuVar.f);
                    }
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    if (entry.getValue() instanceof bzyy) {
                        Map map6 = map4;
                        Map map7 = map3;
                        Map map8 = map;
                        final eqnd eqndVar = (eqnd) entry.getKey();
                        String str = eqndVar.c;
                        MessageIdType messageIdType = ((bzyy) entry.getValue()).a;
                        MessagesTable.BindData bindData = (MessagesTable.BindData) map8.get(str);
                        bindData.getClass();
                        ekgb ekgbVar2 = (ekgb) map7.get(str);
                        ekgbVar2.getClass();
                        epjf epjfVar = (epjf) map6.get(str);
                        epjfVar.getClass();
                        arrayList.add(byvuVar.b(messageIdType, bindData, ekgbVar2, epjfVar, str, true).e(Exception.class, new ejvr() { // from class: byts
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ekrg ekrgVar = byvu.b;
                                ekgiVar2.i(eqndVar, (Exception) obj2);
                                return null;
                            }
                        }, byvuVar.f));
                    } else {
                        ekgiVar2.j(entry);
                    }
                }
            }
        }, eoscVar);
        if (this.t.a()) {
            eijuVarI2 = eijuVarI2.i(new eooz() { // from class: byve
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final ekgp ekgpVar2 = (ekgp) obj;
                    final Map map6 = map5;
                    final byvu byvuVar = this.a;
                    final ekgp ekgpVar3 = ekgpVar;
                    eiju eijuVarH = eijuVarI.h(new ejvr() { // from class: byvi
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eieu eieuVarK = eiiy.k("CmsMessageObjectConsumerDelegate#deleteMessagesWithPartsFromSameConversation");
                            ekgp ekgpVar4 = ekgpVar3;
                            Map map7 = map6;
                            ekgp ekgpVar5 = ekgpVar2;
                            byvu byvuVar2 = byvuVar;
                            try {
                                ekgi ekgiVar2 = new ekgi();
                                ekgiVar2.g(ekgpVar5);
                                for (Map.Entry entry : map7.entrySet()) {
                                    String str = (String) entry.getKey();
                                    final ekhx ekhxVarG = ((ekhv) entry.getValue()).g();
                                    if (!ekhxVarG.isEmpty()) {
                                        brdr brdrVarD = MessagesTable.d();
                                        brdrVarD.A("CmsMessageObjectConsumerDelegate#deleteMessagesWithPartsFromSameConversation");
                                        brdrVarD.h(new Function() { // from class: bytx
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                brec brecVar = (brec) obj3;
                                                ekrg ekrgVar = byvu.b;
                                                brecVar.g(ekhxVarG);
                                                return brecVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        ekgb ekgbVarG = brdrVarD.b().g();
                                        try {
                                            ekrw ekrwVarH = byvu.b.h();
                                            ekrwVarH.X(eksq.a, "BugleCms");
                                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 1980, "CmsMessageObjectConsumerDelegate.java")).D("%s: Deleting messages with parts from same conversation: %s", "CmsMessageObjectConsumerDelegate", str);
                                            byvuVar2.l.f(ekgbVarG);
                                        } catch (RuntimeException e) {
                                            ekrw ekrwVarJ = byvu.b.j();
                                            ekrwVarJ.X(eksq.a, "BugleCms");
                                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 1988, "CmsMessageObjectConsumerDelegate.java")).D("%s: Failed to delete messages with parts from same conversation: %s", "CmsMessageObjectConsumerDelegate", str);
                                            ekqg ekqgVarListIterator = ekhxVarG.listIterator();
                                            while (ekqgVarListIterator.hasNext()) {
                                                eqnd eqndVar = (eqnd) ekgpVar4.get((String) ekqgVarListIterator.next());
                                                eqndVar.getClass();
                                                ekgiVar2.i(eqndVar, e);
                                            }
                                        }
                                    }
                                }
                                eieuVarK.close();
                                return ekgiVar2;
                            } finally {
                            }
                        }
                    }, byvuVar.e);
                    ejvr ejvrVar = new ejvr() { // from class: byvj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return ((ekgi) obj2).b();
                        }
                    };
                    eosc eoscVar2 = byvuVar.f;
                    return eijuVarH.h(ejvrVar, eoscVar2).e(Exception.class, new ejvr() { // from class: byvk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrw ekrwVarJ = byvu.b.j();
                            ekrwVarJ.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Exception) obj2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsMessageObjectConsumerDelegate", "deleteMessagesWithPartsFromSameConversation", 2005, "CmsMessageObjectConsumerDelegate.java")).t("%s: Failed to deleteMessagesWithPartsFromSameConversation", "CmsMessageObjectConsumerDelegate");
                            return ekgpVar2;
                        }
                    }, eoscVar2);
                }
            }, eoscVar);
        }
        return this.w.a() ? eijuVarI2.i(new eooz() { // from class: byvf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgp ekgpVar2 = (ekgp) obj;
                return this.a.v.b().h(new ejvr() { // from class: byta
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrg ekrgVar = byvu.b;
                        return ekgpVar2;
                    }
                }, eoqg.a);
            }
        }, eoqgVar) : eijuVarI2;
    }

    public final void j(bypb bypbVar, MessagesTable.BindData bindData, String str, Optional optional) {
        if (bypbVar.c()) {
            ConversationIdType conversationIdTypeD = bindData.D();
            if (optional.isEmpty()) {
                throw new byvz(String.format("duplicate message found, but the duplicate message id is not set. cmsId: %s", str), cpyz.NO_RETRY);
            }
            if (conversationIdTypeD.b()) {
                throw new byvv(String.format("ConversationId is not set for message: %s, cmsId: %s", optional.get(), str), cpyz.NO_RETRY);
            }
            bxlc bxlcVar = this.i;
            Object obj = optional.get();
            String[] strArr = MessagesTable.a;
            bxlcVar.l(conversationIdTypeD, (MessageIdType) obj, "messages");
        }
        fcsu fcsuVar = this.m;
        ((ains) fcsuVar.b()).e("Bugle.Cms.Restore.Message.Outcome", bypbVar.e() - 1);
        ((ains) fcsuVar.b()).g("Bugle.Cms.Restore.Message.DuplicateSearchDuration", this.n.a() - bypbVar.a());
    }
}
