package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqt {
    public static final eksp a = eksp.c("BugleBackup");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final Context f;
    public final anuh g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final dqsn k;

    public cnqt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dqsn dqsnVar, Context context, fcsu fcsuVar4, anuh anuhVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.k = dqsnVar;
        this.f = context;
        this.e = fcsuVar4;
        this.h = fcsuVar5;
        this.g = anuhVar;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
    }

    public static baqz a(cnvx cnvxVar, cnqj cnqjVar, ekgb ekgbVar, boolean z, boolean z2, ajsm ajsmVar) {
        baqz baqzVarA = cnvxVar != null ? bara.A(cnvxVar) : bara.z();
        if (z2) {
            baqzVarA.v(true);
        }
        baqzVarA.l(false);
        baqzVarA.k(z);
        baqzVarA.t(true == z ? 2 : 1);
        baqzVarA.x(cnqjVar);
        baqzVarA.p(ekgbVar);
        baqzVarA.g(ajsmVar);
        return baqzVarA;
    }

    final bara b(final cnvx cnvxVar, final cmny cmnyVar, final ekhx ekhxVar, final ekhx ekhxVar2) {
        return (bara) this.k.c("ConversationParametersCreator#createMmsConversationParameters", new ejxr() { // from class: cnqo
            @Override // defpackage.ejxr
            public final Object get() {
                ParticipantsTable.BindData bindDataC;
                cmny cmnyVar2 = cmnyVar;
                cnqj cnqjVar = new cnqj(cmnyVar2.i);
                int i = ekgb.d;
                ekgb ekgbVarE = ekoe.a;
                baqz baqzVarA = cnqt.a(cnvxVar, cnqjVar, ekgbVarE, true, false, ajsm.c);
                boolean zIsEmpty = TextUtils.isEmpty(cmnyVar2.o);
                final cnqt cnqtVar = this.a;
                if (zIsEmpty) {
                    final String str = cmnyVar2.a;
                    if (str != null) {
                        final long j = cmnyVar2.i;
                        String str2 = ((cnrp) cnqtVar.j.b()).b(new cnqj(j), new fcsu() { // from class: cnqp
                            @Override // defpackage.fcsu
                            public final Object b() {
                                return ((cmsk) cnqtVar.i.b()).a(cmmo.a, j, str, null);
                            }
                        }).c;
                        Optional optionalEmpty = (str2 == null || str2.isEmpty()) ? Optional.empty() : Optional.of(str2);
                        if (optionalEmpty.isPresent()) {
                            baqzVarA.h((String) optionalEmpty.get());
                        }
                    }
                } else {
                    chxw chxwVarC = chxx.c(cmnyVar2.o);
                    if (chxwVarC != null) {
                        ekhx ekhxVar3 = (ekhx) Collection.EL.stream(ekhxVar2).map(new Function() { // from class: cnqr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                eksp ekspVar = cnqt.a;
                                cczv cczvVar = alvx.a;
                                ((Boolean) new alux().get()).booleanValue();
                                return Optional.ofNullable(((alqm) obj).p(false));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).map(new Function() { // from class: cnqs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                eksp ekspVar = cnqt.a;
                                return (String) ((Optional) obj).orElse("ʼUNKNOWN_SENDER!ʼ");
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(ekcv.b);
                        chul chulVar = (chul) chxwVarC;
                        Optional optional = chulVar.b;
                        if (optional.isPresent()) {
                            baqzVarA.l(true);
                            baqzVarA.q(((chui) optional.get()).a);
                        } else {
                            Optional optional2 = chulVar.c;
                            if (optional2.isPresent()) {
                                if (((chvb) optional2.get()).c == 2) {
                                    baqzVarA.l(true);
                                    chvb chvbVar = (chvb) optional2.get();
                                    chuz chuzVar = chvbVar.c == 2 ? (chuz) chvbVar.d : chuz.a;
                                    ((bake) baqzVarA).c = Optional.of(chuzVar.b);
                                    baqzVarA.h(chuzVar.c);
                                    baqzVarA.q(chuzVar.d);
                                } else if (((chvb) optional2.get()).c == 3) {
                                    ekrw ekrwVarO = cnqt.a.o();
                                    ekrwVarO.V(1, TimeUnit.SECONDS);
                                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 312, "ConversationParametersCreator.java")).q("Creating participant for RBM conversation");
                                    chvb chvbVar2 = (chvb) optional2.get();
                                    chux chuxVar = chvbVar2.c == 3 ? (chux) chvbVar2.d : chux.a;
                                    baqzVarA.x(((chvp) cnqtVar.b.b()).g(new cmtu(chuxVar.b, chuxVar.c, chuxVar.d)));
                                    if (((Boolean) cnqtVar.h.b()).booleanValue()) {
                                        bindDataC = bbbd.e(chuxVar.b, chuxVar.c, chuxVar.d).a();
                                        ((bbca) cnqtVar.c.b()).i(bindDataC);
                                    } else {
                                        bindDataC = bbbd.e(chuxVar.b, chuxVar.c, chuxVar.d).c();
                                    }
                                    ekgbVarE = ekgb.r(bindDataC);
                                } else if (!((Boolean) ((cczi) crbf.aw.get()).e()).booleanValue() || (((chvb) optional2.get()).b & 1) == 0) {
                                    baqzVarA.x(new cnqj(((cmqj) cnqtVar.d.b()).g(cnqtVar.f, cmmo.b, ekhxVar3)));
                                } else {
                                    chuo chuoVar = ((chvb) optional2.get()).f;
                                    if (chuoVar == null) {
                                        chuoVar = chuo.a;
                                    }
                                    String str3 = chuoVar.b;
                                    ejwl.l(!str3.isEmpty());
                                    ekgbVarE = ekgb.r(cnqtVar.g.a(((alrj) cnqtVar.e.b()).n(str3)));
                                }
                            } else if (chulVar.a.isPresent() || chulVar.d.isPresent() || chulVar.e.isPresent()) {
                                baqzVarA.x(new cnqj(((cmqj) cnqtVar.d.b()).g(cnqtVar.f, cmmo.a, ekhxVar3)));
                            } else {
                                ((eksl) ((eksl) cnqt.a.j()).h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 388, "ConversationParametersCreator.java")).t("Unknown message type  transactionId=%s", chxwVarC);
                            }
                        }
                    }
                }
                if (ekgbVarE.isEmpty()) {
                    ekhx ekhxVar4 = ekhxVar;
                    ekrw ekrwVarO2 = cnqt.a.o();
                    ekrwVarO2.V(1, TimeUnit.SECONDS);
                    ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createMmsConversationParametersForForwardSync", 268, "ConversationParametersCreator.java")).r("Creating [%s] participants for MMS or RCS conversation", ekhxVar4.size());
                    cczv cczvVar = alvx.a;
                    ((Boolean) new alux().get()).booleanValue();
                    ekgbVarE = cnqtVar.e(cmnyVar2.q, ekhxVar4);
                }
                baqzVarA.p(ekgbVarE);
                return baqzVarA.y();
            }
        });
    }

    public final bara c(cnvx cnvxVar, alqm alqmVar, int i, cnqj cnqjVar, boolean z) {
        return d(cnvxVar, bbbd.c(alqmVar, i), cnqjVar, z, false, ajsm.c);
    }

    public final bara d(final cnvx cnvxVar, final ParticipantsTable.BindData bindData, final cnqj cnqjVar, final boolean z, final boolean z2, final ajsm ajsmVar) {
        return (bara) this.k.c("ConversationParametersCreator#createSmsConversationParameters", new ejxr() { // from class: cnqq
            @Override // defpackage.ejxr
            public final Object get() {
                ekgb ekgbVarR = ekgb.r(ParticipantsTable.c(((bbca) this.a.c.b()).i(bindData)));
                boolean z3 = z;
                return cnqt.a(cnvxVar, cnqjVar, ekgbVarR, z3, z2, ajsmVar).y();
            }
        });
    }

    public final ekgb e(final int i, ekhx ekhxVar) {
        Stream map = Collection.EL.stream(ekhxVar).map(new Function() { // from class: cnqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cnqt cnqtVar = this.a;
                bbca bbcaVar = (bbca) cnqtVar.c.b();
                alrj alrjVar = (alrj) cnqtVar.e.b();
                int i2 = i;
                return ParticipantsTable.c(bbcaVar.i(bbbd.c(alrjVar.u((String) obj, i2), i2)));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final bara f(alqm alqmVar, int i) {
        return c(null, alqmVar, i, new cnqj(), false);
    }

    public final bara g(ekhx ekhxVar, int i) {
        cczv cczvVar = alvx.a;
        ((Boolean) new alux().get()).booleanValue();
        ejwl.a(!ekhxVar.isEmpty());
        cnqj cnqjVar = new cnqj();
        ((Boolean) new alux().get()).booleanValue();
        return a(null, cnqjVar, e(i, ekhxVar), false, false, ajsm.c).y();
    }
}
