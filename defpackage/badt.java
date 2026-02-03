package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class badt extends bajf implements bajb {
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData");
    public final fcsu a;
    public final awij b;
    private final fcsu h;
    private final fcsu i;
    private final cqbm j;
    private final cjpo k;
    private final fcsu l;
    private final fcsu m;
    private final Context n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;

    public badt(fcsu fcsuVar, fcsu fcsuVar2, cqbm cqbmVar, cjpo cjpoVar, fcsu fcsuVar3, awij awijVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, Context context) {
        this.h = fcsuVar;
        this.p = fcsuVar7;
        this.q = fcsuVar8;
        String[] strArr = bdxk.a;
        dqpg dqpgVar = new dqpg(bdxk.d());
        ConversationIdType conversationIdType = barn.a;
        bcvs.a(conversationIdType, new cnqj(), bvdp.NAME_IS_AUTOMATIC, bvdk.UNARCHIVED, avoe.b(0), basb.b(-1L), new cbqz(0L), bary.a, basd.a, aonp.VMT_STATUS_UNKNOWN, conversationIdType, dqpgVar);
        String[] strArr2 = bcve.a;
        dqpg dqpgVar2 = new dqpg(bcve.e());
        ConversationIdType conversationIdType2 = barn.a;
        this.d = bbtm.a(conversationIdType2, new cnqj(), bvdp.NAME_IS_AUTOMATIC, bvdk.UNARCHIVED, avoe.b(0), basb.b(-1L), new cbqz(0L), bary.a, basd.a, aonp.VMT_STATUS_UNKNOWN, conversationIdType2, dqpgVar2);
        this.i = fcsuVar2;
        this.j = cqbmVar;
        this.k = cjpoVar;
        this.a = fcsuVar3;
        this.b = awijVar;
        this.o = fcsuVar4;
        this.l = fcsuVar5;
        this.m = fcsuVar6;
        this.n = context;
    }

    private final Optional T() {
        if (f() == null) {
            ekrw ekrwVarJ = g.j();
            ekrwVarJ.X(eksq.a, "BugleConversation");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 724, "ConversationListItemData.java")).q("currentSelfId is null");
            return Optional.empty();
        }
        Optional map = Optional.ofNullable(((bbdl) this.o.b()).e(f())).map(new Function() { // from class: badq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((axcy) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map.isEmpty()) {
            ekrw ekrwVarJ2 = g.j();
            ekrwVarJ2.X(eksq.a, "BugleConversation");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 738, "ConversationListItemData.java")).q("subId is not present");
        }
        return map;
    }

    @Override // defpackage.bajb
    public final boolean A() {
        if (this.d.f() == 4) {
            return false;
        }
        return bajh.d(this.d.o(), this.d.g());
    }

    @Override // defpackage.bajb
    public final boolean B() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(52, "read");
        return bbtkVar.aa;
    }

    final boolean C() {
        return d() == 2;
    }

    @Override // defpackage.bajf
    public final boolean D() {
        if (((bvut) this.i.b()).g()) {
            bbtk bbtkVar = this.d;
            bbtkVar.aA(13, "etouffee_default");
            if (bbtkVar.n != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bajf
    public final int a() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(29, "join_state");
        return bbtkVar.D;
    }

    @Override // defpackage.bajb
    public final int b() {
        return this.d.g();
    }

    public final int c() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(22, "participant_count");
        return bbtkVar.w;
    }

    @Override // defpackage.bajf
    public final int d() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(31, "send_mode");
        return bbtkVar.F;
    }

    @Override // defpackage.bajf
    public final long e() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(28, "rcs_session_id");
        return bbtkVar.C;
    }

    @Override // defpackage.bajf
    public final SelfIdentityId f() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(20, "current_self_id");
        return aofa.c(bbtkVar.u);
    }

    public final bajg g() {
        return new bajg(c() == 2 ? null : Integer.valueOf(((crlw) this.h.b()).g().a), this.d.l(), this.d.m());
    }

    @Override // defpackage.bajf
    public final MessageUsageStatisticsData h(elny elnyVar, DeviceData deviceData, long j) {
        elnw elnwVar;
        elnu elnuVar;
        elrz elrzVarD;
        eieu eieuVarK = eiiy.k("ConversationListItemData::createMessageUsageStatisticsData");
        try {
            int iE = E();
            if (((Boolean) ((cczi) MessageUsageStatisticsData.b.get()).e()).booleanValue()) {
                elnwVar = elnw.FIRST_ATTEMPT_TO_SEND;
            } else {
                int iB = b();
                elnwVar = (iB == 6 || iB == 7 || iB == 8 || iB == 19 || iB == 9) ? elnw.RESEND_ATTEMPT : elnw.FIRST_ATTEMPT_TO_SEND;
            }
            elnw elnwVar2 = elnwVar;
            elnm elnmVar = elnm.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
            eloe eloeVar = e() != -1 ? eloe.WAS_RCS_CONVERSATION : eloe.HAS_ALWAYS_BEEN_XMS_CONVERSATION;
            if (E() != 0) {
                elnuVar = elnu.GROUP_CONVERSATION;
            } else if (d() == 1) {
                elnuVar = elnu.CONVERSATION_SET_TO_XMS_ONLY;
            } else {
                Optional optionalT = T();
                if (!optionalT.isEmpty()) {
                    if (((dggw) this.l.b()).w(((Integer) optionalT.get()).intValue())) {
                        Optional optionalK = k();
                        elnuVar = (!optionalK.isEmpty() && this.b.a((alqm) optionalK.get()).g()) ? C() ? elnu.CONVERSATION_LATCHED_TO_XMS : elnu.OTHER_REASON : elnu.RECEIVER_NOT_AVAILABLE;
                    }
                }
                elnuVar = elnu.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
            }
            elnu elnuVar2 = elnuVar;
            elwm elwmVar = (elwm) elwq.a.createBuilder();
            Optional optionalT2 = T();
            if (optionalT2.filter(new Predicate() { // from class: badk
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
                    return ((Integer) obj).intValue() == -1;
                }
            }).isPresent()) {
                ekrw ekrwVarJ = g.j();
                ekrwVarJ.X(eksq.a, "BugleConversation");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getRcsReadinessConditions", 712, "ConversationListItemData.java")).q("Unexpected default subId in rcs readiness conditions");
                elrzVarD = this.k.d();
            } else {
                Optional optionalFilter = optionalT2.filter(new Predicate() { // from class: badl
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
                        return ((Integer) obj).intValue() >= 0;
                    }
                });
                final cjpo cjpoVar = this.k;
                cjpoVar.getClass();
                elrzVarD = (elrz) optionalFilter.map(new Function() { // from class: badm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return cjpoVar.e(((Integer) obj).intValue());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: badn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        elry elryVar = (elry) elrz.a.createBuilder();
                        elryVar.copyOnWrite();
                        elrz elrzVar = (elrz) elryVar.instance;
                        elrzVar.f = 1;
                        elrzVar.b |= 16;
                        return (elrz) elryVar.build();
                    }
                });
            }
            elwmVar.copyOnWrite();
            elwq elwqVar = (elwq) elwmVar.instance;
            elrzVarD.getClass();
            elwqVar.c = elrzVarD;
            elwqVar.b |= 1;
            elke elkeVarA = ajhe.a(Integer.valueOf(E()));
            elwmVar.copyOnWrite();
            elwq elwqVar2 = (elwq) elwmVar.instance;
            elwqVar2.d = elkeVarA.f;
            elwqVar2.b = 8 | elwqVar2.b;
            int i = d() == 1 ? 3 : 2;
            elwmVar.copyOnWrite();
            elwq elwqVar3 = (elwq) elwmVar.instance;
            elwqVar3.e = i - 1;
            elwqVar3.b |= 16;
            int i2 = true != C() ? 2 : 3;
            elwmVar.copyOnWrite();
            elwq elwqVar4 = (elwq) elwmVar.instance;
            elwqVar4.f = i2 - 1;
            elwqVar4.b |= 32;
            MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl(elnyVar, deviceData, iE, elnwVar2, elnmVar, eloeVar, elnuVar2, (elwq) elwmVar.build(), ((chza) this.j.a()).d().N, j);
            eieuVarK.close();
            return messageUsageStatisticsDataImpl;
        } finally {
        }
    }

    @Override // defpackage.bajf
    public final MessageIdType i() {
        return this.d.i();
    }

    @Override // defpackage.bajf
    public final cnqj j() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(1, "sms_thread_id");
        return bbtkVar.b;
    }

    @Override // defpackage.bajb
    public final Optional k() {
        return Optional.ofNullable(this.d.m()).map(new Function() { // from class: bads
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                badt badtVar = this.a;
                return ((alrj) badtVar.a.b()).u(ejwk.b((String) obj), badtVar.F());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final Boolean l() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            k().ifPresent(new Consumer() { // from class: bado
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    atomicBoolean.set(((alqm) obj).z());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    public final Boolean m() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((aqbh) this.m.b()).a()) {
            k().ifPresent(new Consumer() { // from class: badp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    atomicBoolean.set(((alqm) obj).B());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    @Override // defpackage.bajf
    public final String n() {
        return (((aquo) this.p.b()).a() && ((ccwh) this.q.b()).a(this.d.m(), this.d.k())) ? ccwh.a.toString() : I() == akbl.c ? cdmj.a.toString() : this.d.k();
    }

    @Override // defpackage.bajb
    public final String o() {
        return (I() == akbl.c && bvdi.b(E())) ? this.n.getString(R.string.unapproved_group_conversation_name) : this.d.l();
    }

    public final String p() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(18, "participant_lookup_key");
        return bbtkVar.s;
    }

    @Override // defpackage.bajb
    public final String q() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(7, "preview_content_type");
        return bbtkVar.h;
    }

    @Override // defpackage.bajf
    public final String r() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(37, "rcs_group_id");
        return bbtkVar.L;
    }

    @Override // defpackage.bajf
    public final String s() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(61, "first_name");
        String str = bbtkVar.aj;
        bbtk bbtkVar2 = this.d;
        bbtkVar2.aA(60, "full_name");
        String str2 = bbtkVar2.ai;
        bbtk bbtkVar3 = this.d;
        bbtkVar3.aA(59, "display_destination");
        return this.c.a(str, str2, bbtkVar3.ah);
    }

    public final String t() {
        if (this.d.aG("SNIPPET_TO_USE")) {
            return this.d.az("SNIPPET_TO_USE");
        }
        bbtk bbtkVar = this.d;
        bbtkVar.aA(4, "snippet_text");
        return bbtkVar.e;
    }

    @Override // defpackage.bajf
    public final String u(String str) {
        return (!y() && b() == 210) ? str : t();
    }

    public final boolean v() {
        return !bbbd.n(this.d.m());
    }

    public final boolean w() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            k().ifPresent(new Consumer() { // from class: badr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    atomicBoolean.set(((alqm) obj).z());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return v() && !atomicBoolean.get();
    }

    @Override // defpackage.bajf
    public final boolean x() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(23, "notification_enabled");
        return bbtkVar.x;
    }

    @Override // defpackage.bajb
    public final boolean y() {
        return this.d.o();
    }

    public final boolean z() {
        bbtk bbtkVar = this.d;
        bbtkVar.aA(32, "IS_ENTERPRISE");
        return bbtkVar.G;
    }
}
