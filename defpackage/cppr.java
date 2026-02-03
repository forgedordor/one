package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cppr implements cppd {
    public static final cqce a = cqce.g("BugleCms", "CmsConversationFactoryImpl");
    private static final ekgp h;
    public final cpqp b;
    public final cppc c;
    public final cpos d;
    public final eqjv e;
    public boolean g;
    private final bbdl k;
    private final aqfr l;
    private final Supplier i = new cppp(this);
    public final Supplier f = new cppq(this);
    private final ejxr j = ejxx.a(new ejxr() { // from class: cppf
        @Override // defpackage.ejxr
        public final Object get() {
            cppr cpprVar = this.a;
            try {
                cpos cposVar = cpprVar.d;
                evqs evqsVar = (evqs) DesugarCollections.unmodifiableMap(cpprVar.e.g).get("additional_fields");
                if (evqsVar == null) {
                    epjf epjfVar = epjf.a;
                    epjfVar.getClass();
                    return epjfVar;
                }
                epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqsVar, evrr.a());
                epkhVar.getClass();
                evuh evuhVarA = cposVar.a.a(epkhVar, epjf.a);
                evuhVarA.getClass();
                return (epjf) evuhVarA;
            } catch (cpql e) {
                cqbd cqbdVarE = cppr.a.e();
                cqbdVarE.I("Conversation AdditionalFields decryption succeeded. Original exception is logged below.");
                cqbdVarE.A("cmsConversationId", cpprVar.e.c);
                cqbdVarE.s(e);
                cpprVar.g = true;
                return (epjf) e.a;
            } catch (evtj e2) {
                cqbd cqbdVarB = cppr.a.b();
                cqbdVarB.I("Failed to create AdditionalFieldsPart");
                cqbdVarB.A("cmsConversationId", cpprVar.e.c);
                cqbdVarB.s(e2);
                throw new cppl(e2);
            }
        }
    });

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(epjs.ACTIVE, bvdk.UNARCHIVED);
        ekgiVar.i(epjs.ARCHIVED, bvdk.ARCHIVED);
        ekgiVar.i(epjs.KEEP_ARCHIVED, bvdk.KEEP_ARCHIVED);
        ekgiVar.i(epjs.SPAM_FOLDER, bvdk.SPAM_FOLDER);
        ekgiVar.i(epjs.BLOCKED_FOLDER, bvdk.BLOCKED_FOLDER);
        ekgiVar.i(epjs.CROSS_COUNTRY_FOLDER, bvdk.CROSS_COUNTRY_FOLDER);
        h = ekgiVar.c();
    }

    public cppr(bbdl bbdlVar, cpqp cpqpVar, cppc cppcVar, cpos cposVar, aqfr aqfrVar, eqjv eqjvVar) {
        this.k = bbdlVar;
        this.b = cpqpVar;
        this.c = cppcVar;
        this.d = cposVar;
        this.e = eqjvVar;
        this.l = aqfrVar;
    }

    private static epjv h(epjv epjvVar, epjv epjvVar2) {
        return epjvVar.f >= epjvVar2.f ? epjvVar : epjvVar2;
    }

    @Override // defpackage.cppd
    public final bojh a() {
        avoe avoeVarB;
        epjq epjqVar;
        ecem.b();
        epjx epjxVarA = ((cppq) this.f).a();
        epjv epjvVarA = ((cppp) this.i).a();
        String[] strArr = botm.a;
        bojm bojmVar = new bojm();
        eqjv eqjvVar = this.e;
        String str = eqjvVar.c;
        if (!TextUtils.isEmpty(str)) {
            bojmVar.f(str);
        }
        String str2 = epjxVarA.c;
        if (!TextUtils.isEmpty(str2)) {
            bojmVar.M(str2);
        }
        int i = epjxVarA.q;
        epjy epjyVar = null;
        epjt epjtVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : epjt.CONVERSATION_TYPE_GROUP_RCS : epjt.CONVERSATION_TYPE_GROUP_XMS : epjt.CONVERSATION_TYPE_ONE_ON_ONE : epjt.UNKNOWN_CONVERSATION_TYPE;
        if (epjtVar == null) {
            epjtVar = epjt.UNRECOGNIZED;
        }
        Integer num = (Integer) cptt.c.get(epjtVar);
        if (num != null) {
            bojmVar.i(num.intValue());
        }
        bojmVar.N(epjxVarA.i ? bvdp.NAME_IS_AUTOMATIC : bvdp.NAME_IS_MANUAL);
        bojmVar.k(((SelfIdentityIdImpl) this.k.d().f()).a);
        bojmVar.Y(epjxVarA.g.size());
        boolean zIsEmpty = eqjvVar.e.isEmpty();
        epjv epjvVar = epjv.a;
        if (!zIsEmpty) {
            try {
                epjvVar = (epjv) evsn.parseFrom(epjvVar, eldz.e.k(eqjvVar.e), evrr.a());
            } catch (evtj | IllegalArgumentException e) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Could not decode snippet from subject");
                cqbdVarE.A("cmsConversationId", this.e.c);
                cqbdVarE.s(e);
            }
        }
        eqjv eqjvVar2 = this.e;
        epjv epjvVar2 = epjv.a;
        evqs evqsVar = (evqs) DesugarCollections.unmodifiableMap(eqjvVar2.g).get("temp_snippet");
        if (evqsVar != null) {
            try {
                epjvVar2 = (epjv) evsn.parseFrom(epjvVar2, evqsVar, evrr.a());
            } catch (evtj e2) {
                cqbd cqbdVarE2 = a.e();
                cqbdVarE2.I("Could not decode snippet from opaque data");
                cqbdVarE2.A("cmsConversationId", this.e.c);
                cqbdVarE2.s(e2);
            }
        }
        epjv epjvVarH = h(epjvVarA, h(epjvVar2, epjvVar));
        epkd epkdVar = epjvVarH.c;
        if (epkdVar == null) {
            epkdVar = epkd.a;
        }
        String str3 = epkdVar.d;
        if (!TextUtils.isEmpty(str3)) {
            bojmVar.at(str3);
        }
        bojmVar.ax(epjvVarH.g);
        bojmVar.au(epjvVarH.f);
        epjs epjsVarB = epjs.b(epjvVarA.e);
        if (epjsVarB == null) {
            epjsVarB = epjs.UNRECOGNIZED;
        }
        bojmVar.c((bvdk) h.getOrDefault(epjsVarB, bvdk.UNARCHIVED));
        int i2 = epjxVarA.r;
        epjr epjrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : epjr.CONVERSATION_SEND_MODE_XMS_LATCH : epjr.CONVERSATION_SEND_MODE_XMS : epjr.CONVERSATION_SEND_MODE_AUTO;
        if (epjrVar == null) {
            epjrVar = epjr.UNRECOGNIZED;
        }
        Integer num2 = (Integer) cptt.e.get(epjrVar);
        boolean zAnyMatch = false;
        bojmVar.ap(num2 != null ? num2.intValue() : 0);
        bojmVar.J(epjxVarA.s);
        eqjv eqjvVar3 = this.e;
        if (!TextUtils.isEmpty(eqjvVar3.c)) {
            final evtg evtgVar = ((cppq) this.f).a().g;
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("+getIncludeEmailAddress");
            bsboVarE.h(new Function() { // from class: cppi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    cqce cqceVar = cppr.a;
                    bsbxVar.e(evtgVar);
                    bsbxVar.ap(new dqpj("participants.normalized_destination", 11, "%@%"));
                    bsbxVar.v(-2);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            zAnyMatch = Collection.EL.stream(bsboVarE.b().z()).anyMatch(new Predicate() { // from class: cppj
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
                    return bbbe.c((ParticipantsTable.BindData) obj);
                }
            });
        }
        bojmVar.C(zAnyMatch);
        bojmVar.g(cpyi.CMS_RESTORE_IN_PROGRESS);
        if ((!((Boolean) avos.a.e()).booleanValue() || epjxVarA.l.isEmpty()) && num != null && num.intValue() == 2) {
            bojmVar.E(4);
        } else {
            switch (epjxVarA.p) {
                case 0:
                    epjqVar = epjq.UNKNOWN_CONVERSATION_JOIN_STATE;
                    break;
                case 1:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_JOINED;
                    break;
                case 2:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_INVITED;
                    break;
                case 3:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_LEFT;
                    break;
                case 4:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG;
                    break;
                case 5:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_RECOVERED_FROM_TELEPHONY;
                    break;
                case 6:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_FAILED;
                    break;
                case 7:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_FORKED;
                    break;
                case 8:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_SETTING_UP_FOR_VANILLA_RCS;
                    break;
                case 9:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_IN_PROGRESS;
                    break;
                case 10:
                    epjqVar = epjq.CONVERSATION_JOIN_STATE_SATELLITE_ENDED;
                    break;
                default:
                    epjqVar = null;
                    break;
            }
            if (epjqVar == null) {
                epjqVar = epjq.UNRECOGNIZED;
            }
            Integer num3 = (Integer) cptt.d.get(epjqVar);
            if (num3 != null) {
                bojmVar.E(num3.intValue());
            }
        }
        String str4 = epjxVarA.k;
        if (!TextUtils.isEmpty(str4)) {
            bojmVar.ai(str4);
        }
        String str5 = epjxVarA.l;
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.v.get()).e()).booleanValue() && !TextUtils.isEmpty(str5)) {
            bojmVar.af(str5);
        }
        if (num != null && num.intValue() == 2) {
            String str6 = epjxVarA.m;
            if (cpyl.a() && ((Boolean) ((cczi) cpxw.e.get()).e()).booleanValue() && !TextUtils.isEmpty(str6)) {
                bojmVar.ak(str6);
            }
            if (cpyl.a() && ((Boolean) ((cczi) cpxw.h.get()).e()).booleanValue()) {
                bojmVar.ag(new cigb(epjxVarA.n));
            }
            if (cpyl.a() && ((Boolean) ((cczi) cpxw.i.get()).e()).booleanValue() && (avoeVarB = avoe.b(epjxVarA.o)) != null) {
                bojmVar.x(avoeVarB);
            }
        }
        if (this.l.a()) {
            String str7 = eqjvVar3.d;
            if (!TextUtils.isEmpty(str7)) {
                bojmVar.e(str7);
            }
            switch (epjxVarA.t) {
                case 0:
                    epjyVar = epjy.STATUS_UNKNOWN_MMS_GROUP_UPGRADE_STATUS;
                    break;
                case 1:
                    epjyVar = epjy.STATUS_NOT_ELIGIBLE_BECAUSE_INACTIVE;
                    break;
                case 2:
                    epjyVar = epjy.STATUS_NOT_ELIGIBLE_NOT_EVERYONE_RCS;
                    break;
                case 3:
                    epjyVar = epjy.STATUS_NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT;
                    break;
                case 4:
                    epjyVar = epjy.STATUS_ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER;
                    break;
                case 5:
                    epjyVar = epjy.STATUS_UPGRADE_STARTED;
                    break;
                case 6:
                    epjyVar = epjy.STATUS_RCS_GROUP_CREATION_FAILED;
                    break;
                case 7:
                    epjyVar = epjy.STATUS_RCS_GROUP_CREATION_SUCCEEDED;
                    break;
                case 8:
                    epjyVar = epjy.STATUS_UPGRADE_FAILED;
                    break;
                case 9:
                    epjyVar = epjy.STATUS_UPGRADE_COMPLETE;
                    break;
            }
            if (epjyVar == null) {
                epjyVar = epjy.UNRECOGNIZED;
            }
            cins cinsVar = (cins) cptt.k.get(epjyVar);
            cinsVar.getClass();
            bojmVar.L(cinsVar);
        }
        return bojmVar.a();
    }

    @Override // defpackage.cppd
    public final ekgb b() {
        return ekgb.n(((cppq) this.f).a().g);
    }

    @Override // defpackage.cppd
    public final ekgb c() {
        ecem.b();
        eqjv eqjvVar = this.e;
        if (TextUtils.isEmpty(eqjvVar.c)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        final ekgb ekgbVarB = b();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("+getBugleParticipantIds");
        bsboVarE.h(new Function() { // from class: cpph
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                cqce cqceVar = cppr.a;
                bsbxVar.e(ekgbVarB);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarF = bsboVarE.b().f();
        if (((ekoe) ekgbVarF).c >= ekgbVarB.size()) {
            return (ekgb) Collection.EL.stream(ekgbVarF).map(new Function() { // from class: cppg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = cppr.a;
                    String[] strArr = boiv.a;
                    bohr bohrVar = new bohr();
                    bohrVar.e(Long.parseLong((String) obj));
                    return bohrVar.a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(ekcv.a);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Failed to resolve one or more participants for CMS ids");
        cqbdVarE.I(ekgbVarB);
        cqbdVarE.A("cmsConversationId", eqjvVar.c);
        cqbdVarE.r();
        throw new cppo();
    }

    @Override // defpackage.cppd
    public final ekhx d() {
        final ekhx ekhxVarO = ekhx.o(b());
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("+getMissingCmsParticipantIds");
        bsboVarE.h(new Function() { // from class: cppk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                cqce cqceVar = cppr.a;
                bsbxVar.e(ekhxVarO);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzj brzjVar = (brzj) bsboVarE.b().q(ParticipantsTable.c.E);
        try {
            ekgb ekgbVarJ = brzjVar.j();
            brzjVar.close();
            return ekpg.b(ekhxVarO, ekhx.o(ekgbVarJ)).f();
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cppd
    public final epjf e() {
        ecem.b();
        return (epjf) this.j.get();
    }

    @Override // defpackage.cppd
    public final boolean f() {
        return this.g;
    }
}
