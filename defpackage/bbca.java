package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbca {
    public static final eksp a = eksp.c("BugleDataModel");
    public static final cqce b = cqce.g("BugleDataModel", "ParticipantDatabaseOperations");
    public final Optional c;
    public final Optional d;
    public final aqcf e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final axjq k;
    public final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public bbca(Optional optional, Optional optional2, aqcf aqcfVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, axjq axjqVar, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.c = optional;
        this.d = optional2;
        this.e = aqcfVar;
        this.m = fcsuVar;
        this.n = fcsuVar2;
        this.f = fcsuVar3;
        this.o = fcsuVar4;
        this.g = fcsuVar5;
        this.p = fcsuVar6;
        this.q = fcsuVar7;
        this.h = fcsuVar8;
        this.i = fcsuVar9;
        this.j = fcsuVar10;
        this.k = axjqVar;
        this.l = fcsuVar11;
        this.r = fcsuVar12;
    }

    public static ekgb e(final ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getOtherParticipants_dsdrGroupsFlag");
        try {
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getOtherParticipants");
            bsboVarE.h(new Function() { // from class: bbbg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    eksp ekspVar = bbca.a;
                    bsbxVar.v(-2);
                    String[] strArr = boiv.a;
                    boiq boiqVar = new boiq(boiv.a);
                    boiqVar.e(new Function() { // from class: bbbu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            eksp ekspVar2 = bbca.a;
                            return ((boic) obj2).b;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    boiqVar.f(new Function() { // from class: bbbv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            boiu boiuVar = (boiu) obj2;
                            eksp ekspVar2 = bbca.a;
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

    public static void o(ParticipantsTable.BindData bindData) {
        eksl ekslVar = (eksl) a.i();
        ekslVar.Z(eksk.FULL);
        eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "logInsertionFailureToFlogger", 692, "ParticipantDatabaseOperations.java");
        Boolean boolValueOf = Boolean.valueOf(bindData.ab());
        esvg esvgVar = esvg.NO_USER_DATA;
        ekslVar2.L("Unable to insert new participant: isValidPhoneNumberData = [%s], isCheckConstraintEnabledViaPhenotype = [%s], subId = [%s], normalizedDestinationIsNullOrEmpty = [%s], sendDestinationIsNullOrEmpty = [%s], displayDestinationIsNullOrEmpty = [%s]", new esvh(esvgVar, boolValueOf), new esvh(esvgVar, Boolean.valueOf(bindData.Y())), new esvh(esvgVar, Integer.valueOf(bindData.r())), new esvh(esvgVar, Boolean.valueOf(TextUtils.isEmpty(bindData.T()))), new esvh(esvgVar, Boolean.valueOf(TextUtils.isEmpty(bindData.V()))), new esvh(esvgVar, Boolean.valueOf(TextUtils.isEmpty(bindData.O()))));
    }

    public static boolean r(ParticipantsTable.BindData bindData) {
        return !TextUtils.isEmpty(bindData.S());
    }

    public final ParticipantsTable.BindData a() {
        ParticipantsTable.BindData bindData;
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperationsImpl#getDefaultSelfParticipant");
        try {
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getDefaultSelfParticipant");
            bsboVarE.h(new Function() { // from class: bbbr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    eksp ekspVar = bbca.a;
                    bsbxVar.v(-1);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brzj brzjVar = (brzj) bsboVarE.b().p();
            try {
                if (brzjVar.moveToFirst()) {
                    bindData = (ParticipantsTable.BindData) brzjVar.cQ();
                    brzjVar.close();
                } else {
                    brzjVar.close();
                    cqbd cqbdVarE = b.e();
                    cqbdVarE.I("Default self participant does not exist. Bugle db is under sync or corrupted");
                    cqbdVarE.r();
                    bindData = null;
                }
                eieuVarK.close();
                return bindData;
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

    public final ParticipantsTable.BindData b(String str) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getExistingParticipant");
        try {
            cqaz.h();
            ParticipantsTable.BindData bindData = str == null ? null : (ParticipantsTable.BindData) ParticipantsTable.k(str, new Function() { // from class: bbbq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                    eksp ekspVar = bbca.a;
                    return bindData2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return bindData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData c(String str) {
        ParticipantsTable.BindData bindDataB;
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getExistingRbmBot");
        try {
            String strM = m(str);
            ParticipantsTable.BindData bindData = null;
            if (TextUtils.isEmpty(strM)) {
                bindDataB = null;
            } else {
                bindDataB = b(strM);
                if (bindDataB != null) {
                    cqbd cqbdVarA = b.a();
                    cqbdVarA.I("getExistingRbmBot: found");
                    cqbdVarA.f(strM);
                    cqbdVarA.I("for participant");
                    cqbdVarA.k(str);
                    cqbdVarA.I("(is bot =");
                    cqbdVarA.J(bbbe.d(bindDataB));
                    cqbdVarA.u(')');
                    cqbdVarA.r();
                } else {
                    cqbd cqbdVarE = b.e();
                    cqbdVarE.I("Found existing participant");
                    cqbdVarE.f(strM);
                    cqbdVarE.I("but its participant is null.");
                    cqbdVarE.r();
                }
            }
            if (bindDataB != null) {
                if (bbbe.d(bindDataB)) {
                    bindData = bindDataB;
                }
            }
            eieuVarK.close();
            return bindData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData d(final String str) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getOtherParticipantByNormalizedDestination");
        try {
            cqaz.h();
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getOtherParticipantByNormalizedDestination");
            bsboVarE.h(new Function() { // from class: bbbl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    eksp ekspVar = bbca.a;
                    bsbxVar.v(-2);
                    bsbxVar.r(str);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bsboVarE.b().l();
            eieuVarK.close();
            return bindData;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb f(final String str) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getParticipants");
        try {
            ecem.b();
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getParticipantById");
            bsboVarE.h(new Function() { // from class: bbbj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    eksp ekspVar = bbca.a;
                    bsbxVar.k(str);
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

    public final ekgb g() {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getParticipants");
        try {
            cqaz.h();
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getParticipants");
            bsboVarE.s();
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

    public final String h(brvp brvpVar) {
        String str = brvpVar.f;
        String strM = bbdl.l(brvpVar) ? ((SelfIdentityIdImpl) ((bbdl) this.n.b()).f(brvpVar.d).f()).a : str == null ? null : m(str);
        if (strM != null) {
            String str2 = brvpVar.a;
            boolean z = true;
            if (str2 != null && !str2.equals(strM)) {
                z = false;
            }
            ejyb.c(z, "Looked up id doesn't match id in participant", new Object[0]);
            brvpVar.v(strM);
        }
        return strM;
    }

    public final String i(ParticipantsTable.BindData bindData) {
        return l(bindData, false);
    }

    public final String j(brvp brvpVar) {
        return k(brvpVar, false);
    }

    public final String k(final brvp brvpVar, final boolean z) {
        String strH;
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getOrCreateParticipant");
        try {
            cqaz.h();
            String strH2 = h(brvpVar);
            if (strH2 != null) {
                ((eksl) a.o().h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 481, "ParticipantDatabaseOperations.java")).t("Participant id %s has already existed, returning immediately.", strH2);
            } else {
                String str = null;
                if (brvpVar.q != -1) {
                    ((bbax) this.q.b()).c(brvpVar);
                } else {
                    fcsu fcsuVar = this.g;
                    ((axjg) fcsuVar.b()).f(brvpVar);
                    String str2 = brvpVar.f;
                    if (!u(brvpVar, 7) || TextUtils.equals(str2, brvpVar.f) || (strH = h(brvpVar)) == null) {
                        ((axjg) fcsuVar.b()).f(brvpVar);
                    } else {
                        str = strH;
                    }
                }
                if (str != null) {
                    eieuVarK.close();
                    return str;
                }
                strH2 = (String) ((dqsn) this.o.b()).c("ParticipantDatabaseOperations#getOrCreateParticipant", new ejxr() { // from class: bbbo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        final ParticipantsTable.BindData bindDataA;
                        long jLongValue;
                        bbca bbcaVar = this.a;
                        brvp brvpVar2 = brvpVar;
                        String strH3 = bbcaVar.h(brvpVar2);
                        try {
                            if (strH3 != null) {
                                ((eksl) bbca.a.o().h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 502, "ParticipantDatabaseOperations.java")).t("Participant id %s has already existed, returning immediately.", strH3);
                                brvpVar2.v(strH3);
                                return strH3;
                            }
                            ejwl.b(brvpVar2.a == null, "Why are we inserting a participant that already has an id??");
                            final boolean z2 = z;
                            if (z2) {
                                brvpVar2.g(cpyi.RESTORED_FROM_TELEPHONY);
                            }
                            boolean z3 = brvpVar2.d != -2;
                            if (z3) {
                                bbcaVar.k.e(brvpVar2);
                                bindDataA = brvpVar2.a();
                            } else {
                                bindDataA = brvpVar2.a();
                            }
                            if (z3) {
                                jLongValue = axjq.b(bindDataA);
                            } else {
                                if (((apqr) bbcaVar.l.b()).a()) {
                                    if (TextUtils.isEmpty(bindDataA.V())) {
                                        bbcaVar.t(3);
                                        bbca.o(bindDataA);
                                        throw new IllegalArgumentException(String.format("unable to insert participant sendDestination=%s", bindDataA.V()));
                                    }
                                    if (TextUtils.isEmpty(bindDataA.T())) {
                                        bbcaVar.t(3);
                                        bbca.o(bindDataA);
                                        throw new IllegalArgumentException(String.format("unable to insert participant normalizedDestination=%s", bindDataA.T()));
                                    }
                                }
                                jLongValue = bindDataA.I().longValue();
                            }
                            if (jLongValue >= 0 && bbdl.k(bindDataA)) {
                                String[] strArr = btyx.a;
                                btxi btxiVar = new btxi();
                                btxiVar.d(bindDataA.R());
                                btxiVar.e(bindDataA.T());
                                btxiVar.f(brvpVar2.e);
                                btxiVar.h(bindDataA.r());
                                btxiVar.j(bindDataA.W());
                                btxiVar.i(bindDataA.s());
                                axjq.a(btxiVar.a());
                            }
                            if (jLongValue == -1) {
                                bbcaVar.t(3);
                                bbca.o(bindDataA);
                                throw new IllegalArgumentException(String.format("unable to insert participant %s", cqcv.b(bindDataA.a())));
                            }
                            ((eksl) ((eksl) bbca.a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantDatabaseOperations", "getOrCreateParticipant", 576, "ParticipantDatabaseOperations.java")).A("ParticipantDatabaseOperations: Created id=%d with sendDestination %s", jLongValue, ((avog) ((awci) bbcaVar.i.b()).a().a(bindDataA.V())).a);
                            bbcaVar.t(2);
                            if (bbcaVar.e.a()) {
                                bbcaVar.d.ifPresent(new Consumer() { // from class: bbbs
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        eksp ekspVar = bbca.a;
                                        ((csyy) ((fcsu) obj).b()).c(ekgb.r(bindDataA));
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            } else {
                                bbcaVar.c.ifPresent(new Consumer() { // from class: bbbt
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        eksp ekspVar = bbca.a;
                                        ((csyk) ((fcsu) obj).b()).b(bindDataA);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            final bbau bbauVar = (bbau) bbcaVar.j.b();
                            final String string = Long.toString(jLongValue);
                            string.getClass();
                            bindDataA.getClass();
                            ((dqsn) bbauVar.b.b()).g(new dqsm() { // from class: bbas
                                @Override // defpackage.dqsm
                                public final eieu a() {
                                    return eiiy.a("OnParticipantInsertedProxy#afterParticipantInserted");
                                }
                            }, "OnParticipantInsertedProxy#afterParticipantInserted-".concat(string), new Runnable() { // from class: bbat
                                @Override // java.lang.Runnable
                                public final void run() throws IOException {
                                    String str3 = string;
                                    ParticipantsTable.BindData bindData = bindDataA;
                                    boolean z4 = z2;
                                    for (bbar bbarVar : (Set) bbauVar.a.b()) {
                                        eieu eieuVarA = bbarVar.a();
                                        try {
                                            bbarVar.b(str3, bindData, z4);
                                            fczl.a(eieuVarA, null);
                                        } finally {
                                        }
                                    }
                                }
                            });
                            String string2 = Long.toString(jLongValue);
                            ((axjg) bbcaVar.g.b()).d(bindDataA);
                            ((axjv) bbcaVar.f.b()).b(string2, bindDataA);
                            if (string2 != null) {
                                brvpVar2.v(string2);
                            }
                            return string2;
                        } catch (Throwable th) {
                            if (strH3 != null) {
                                brvpVar2.v(strH3);
                            }
                            throw th;
                        }
                    }
                });
            }
            eieuVarK.close();
            return strH2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String l(ParticipantsTable.BindData bindData, boolean z) {
        String strR = bindData.R();
        if (strR != null) {
            return strR;
        }
        String strK = k(bindData.C(), z);
        bindData.a = strK;
        return strK;
    }

    public final String m(final String str) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getOtherParticipantId");
        try {
            fcsu fcsuVar = this.g;
            String strA = ((axjg) fcsuVar.b()).a(str);
            if (TextUtils.isEmpty(strA)) {
                brzj brzjVar = null;
                strA = null;
                strA = null;
                try {
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("getOtherParticipantId-participants1");
                    bsboVarE.h(new Function() { // from class: bbbw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar = (bsbx) obj;
                            eksp ekspVar = bbca.a;
                            bsbxVar.r(str);
                            bsbxVar.v(-2);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsboVarE.f(new Function() { // from class: bbbx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            eksp ekspVar = bbca.a;
                            return ((brzh) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brzj brzjVar2 = (brzj) bsboVarE.b().p();
                    try {
                        if (brzjVar2.moveToFirst()) {
                            brzjVar = brzjVar2;
                        } else {
                            cmvy cmvyVar = (cmvy) this.m.b();
                            if (!alwh.k(str) || cmvyVar.h(str)) {
                                brzjVar2.close();
                            } else {
                                brzjVar2.close();
                                bsbo bsboVarE2 = ParticipantsTable.e();
                                bsboVarE2.A("getOtherParticipantId-participants2");
                                bsboVarE2.h(new Function() { // from class: bbby
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsbx bsbxVar = (bsbx) obj;
                                        eksp ekspVar = bbca.a;
                                        bsbxVar.v(-2);
                                        bsbxVar.ar(new dqxl("REPLACE($V, '-','') = $V", new Object[]{ParticipantsTable.c.f, str}));
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bsboVarE2.f(new Function() { // from class: bbbz
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        eksp ekspVar = bbca.a;
                                        return ((brzh) obj).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brzj brzjVar3 = (brzj) bsboVarE2.b().p();
                                try {
                                    if (brzjVar3.moveToFirst()) {
                                        brzjVar = brzjVar3;
                                    } else {
                                        brzjVar3.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    brzjVar = brzjVar3;
                                    if (brzjVar != null) {
                                        brzjVar.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        cqaz.a(1, brzjVar.getCount());
                        String strO = brzjVar.o();
                        if (!TextUtils.isEmpty(strO)) {
                            ((axjg) fcsuVar.b()).c(str, strO);
                        }
                        brzjVar.close();
                        strA = strO;
                    } catch (Throwable th2) {
                        th = th2;
                        brzjVar = brzjVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            eieuVarK.close();
            return strA;
        } catch (Throwable th4) {
            try {
                eieuVarK.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map n(final Iterable iterable) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#getExistingParticipants");
        try {
            cqaz.h();
            csq csqVar = new csq();
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("getExistingParticipants");
            bsboVarE.h(new Function() { // from class: bbbh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    eksp ekspVar = bbca.a;
                    bsbxVar.m(iterable);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = bsboVarE.b().z().iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                csqVar.put(bindData.R(), bindData);
            }
            eieuVarK.close();
            return csqVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void p(int i, String str) {
        if (i != 1) {
            b.n(str);
            ((bbdg) this.p.b()).a(4, 3);
        } else {
            b.q(str);
            ((bbdg) this.p.b()).a(4, 2);
        }
    }

    public final void q(final String str, final ParticipantCoreColor participantCoreColor) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#maybeUpdateParticipantColor");
        try {
            cqaz.h();
            ((dqsn) this.o.b()).d("ParticipantDatabaseOperations#maybeUpdateParticipantColor", new Runnable() { // from class: bbbk
                @Override // java.lang.Runnable
                public final void run() {
                    bbca bbcaVar = this.a;
                    final String str2 = str;
                    ParticipantCoreColor participantCoreColor2 = participantCoreColor;
                    if (participantCoreColor2.a() == 0) {
                        ParticipantsTable.BindData bindDataB = bbcaVar.b(str2);
                        if (bindDataB == null) {
                            bbca.b.n("Failed to retrieve participant when updating color.");
                            return;
                        } else if (!bbax.a(bindDataB).f(participantCoreColor2)) {
                            return;
                        }
                    }
                    bsbs bsbsVarF = ParticipantsTable.f();
                    bsbsVarF.ap("maybeUpdateParticipantColor");
                    bsbsVarF.U(new Function() { // from class: bbbi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsbx bsbxVar = (bsbx) obj;
                            eksp ekspVar = bbca.a;
                            bsbxVar.k(str2);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    participantCoreColor2.c(bsbsVarF);
                    ekgb ekgbVarA = bsbsVarF.b().a();
                    bbcaVar.p(ekgbVarA.size(), ekgbVarA.size() != 1 ? "Failed to update participants' color." : "Successfully updated participants' color.");
                }
            });
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

    public final boolean s(final String str, Uri uri) {
        eieu eieuVarK = eiiy.k("ParticipantDatabaseOperations#updateParticipantPhotoUri");
        try {
            cqaz.h();
            eieu eieuVarK2 = eiiy.k("ParticipantDatabaseOperations#getParticipantPhotoUri");
            try {
                Uri uri2 = (Uri) ParticipantsTable.k(str, new Function() { // from class: bbbm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eksp ekspVar = bbca.a;
                        return ((ParticipantsTable.BindData) obj).x();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                eieuVarK2.close();
                if ((uri == null && uri2 == null) || (uri != null && uri.equals(uri2))) {
                    cqbd cqbdVarA = b.a();
                    cqbdVarA.I("Not updating photo uri; existing photo uri matches new uri for");
                    cqbdVarA.D("participantId", str);
                    cqbdVarA.r();
                    eieuVarK.close();
                    return false;
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updateParticipantPhotoUri");
                bsbsVarF.M(uri);
                bsbsVarF.U(new Function() { // from class: bbbn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        eksp ekspVar = bbca.a;
                        bsbxVar.k(str);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int iE = bsbsVarF.b().e();
                p(iE, iE != 1 ? "Failed to update participants' photo Uri." : "Successfully updated participants' photo Uri.");
                boolean z = iE > 0;
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

    public final void t(int i) {
        ((bbdg) this.p.b()).a(2, i);
    }

    public final boolean u(brvp brvpVar, int i) {
        int iA = bbdl.l(brvpVar) ? ((bbdl) this.n.b()).a(brvpVar) : -1;
        return iA == 2 || ((anzv) this.r.b()).d(brvpVar, i) || iA == 1;
    }
}
