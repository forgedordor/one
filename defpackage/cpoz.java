package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpoz extends cpnl {
    private static final ekgp f;
    public final alrj c;
    private final chvp g;
    private final chwq h;
    private final cmqj i;
    private final List j;
    private final ParticipantsTable.BindData k;
    private final bojh l;
    private final MessageCoreData m;
    private final boolean n;
    private final long o;
    private final ekgp p;
    private final ains q;
    private final bnar r;
    private final fcsu s;
    private final aqfr t;
    private static final cqce d = cqce.g("BugleCms", "CmsConversationBuilderImpl");
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl");
    public static final ejxr b = cdag.v("cms_include_conversation_metadata_fields");

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(bvdk.UNARCHIVED, epjs.ACTIVE);
        ekgiVar.i(bvdk.ARCHIVED, epjs.ARCHIVED);
        ekgiVar.i(bvdk.KEEP_ARCHIVED, epjs.KEEP_ARCHIVED);
        ekgiVar.i(bvdk.SPAM_FOLDER, epjs.SPAM_FOLDER);
        ekgiVar.i(bvdk.BLOCKED_FOLDER, epjs.BLOCKED_FOLDER);
        ekgiVar.i(bvdk.CROSS_COUNTRY_FOLDER, epjs.CROSS_COUNTRY_FOLDER);
        f = ekgiVar.c();
    }

    public cpoz(fcsu fcsuVar, chvp chvpVar, chwq chwqVar, cmqj cmqjVar, ains ainsVar, alrj alrjVar, fcsu fcsuVar2, aqfr aqfrVar, cppb cppbVar, bnar bnarVar) {
        super(fcsuVar);
        this.g = chvpVar;
        this.h = chwqVar;
        this.i = cmqjVar;
        this.l = cppbVar.c();
        this.j = cppbVar.e();
        this.k = cppbVar.d();
        this.m = cppbVar.b();
        this.n = cppbVar.g();
        this.c = alrjVar;
        this.s = fcsuVar2;
        this.q = ainsVar;
        this.o = cppbVar.a();
        this.p = cppbVar.f();
        this.t = aqfrVar;
        this.r = bnarVar;
    }

    private final String e(List list) {
        String str = (String) Collection.EL.stream(list).map(new Function() { // from class: cpov
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String strT;
                alqm alqmVarQ;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                cczv cczvVar = alvx.a;
                if (((Boolean) new alut().get()).booleanValue()) {
                    alqmVarQ = this.a.c.q(bindData);
                    strT = alqmVarQ.o();
                } else {
                    strT = bindData.T();
                    alqmVarQ = null;
                }
                if (TextUtils.isEmpty(strT) || (((Boolean) new alut().get()).booleanValue() && alqmVarQ != null && alqmVarQ.D())) {
                    strT = bindData.V();
                }
                if (ejwk.c(strT)) {
                    throw new cpoy();
                }
                return strT;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).sorted().collect(Collectors.joining(","));
        byte[] bArr = new byte[16];
        int i = elcz.a;
        elcx.a.c(str, StandardCharsets.UTF_8).h(bArr);
        return eldz.h.f().j(bArr);
    }

    private final String f() {
        bojh bojhVar = this.l;
        if (bojhVar.k() != 2) {
            return e(this.j);
        }
        String strAd = bojhVar.ad();
        if (ejwk.c(bojhVar.ae())) {
            throw new cpyw(String.format("Conversation RCS Group id is null or empty! ConversationId is: [%s]", bojhVar.C()));
        }
        String strAe = bojhVar.ae();
        strAe.getClass();
        return strAe.concat(ejwk.b(strAd));
    }

    private final void g(eqjt eqjtVar) {
        Optional optionalEmpty = Optional.empty();
        try {
            epka epkaVar = (epka) epkb.a.createBuilder();
            evvp evvpVarC = evxc.c(this.o);
            epkaVar.copyOnWrite();
            epkb epkbVar = (epkb) epkaVar.instance;
            evvpVarC.getClass();
            epkbVar.c = evvpVarC;
            epkbVar.b |= 1;
            optionalEmpty = Optional.of((epkb) epkaVar.build());
        } catch (IllegalArgumentException e2) {
            cqbd cqbdVarE = d.e();
            cqbdVarE.z("latestIncomingReadMessageTimestampMs", this.o);
            cqbdVarE.I("Ignored invalid timestamp from BugleDb.");
            cqbdVarE.s(e2);
        }
        if (optionalEmpty.isPresent()) {
            byte[] byteArray = ((evpz) optionalEmpty.get()).toByteArray();
            epkg epkgVar = (epkg) epkh.a.createBuilder();
            l(byteArray, this.r, epkgVar);
            eqjtVar.a("most_recent_read_message_time_phone", ((epkh) epkgVar.build()).toByteString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(eqjt eqjtVar, EnumSet enumSet, boolean z) {
        epkf epkfVar;
        String strO;
        cmtz cmtzVarK;
        epkd epkdVar;
        if (enumSet.contains(cpot.FREQUENTLY_CHANGED_PART)) {
            evqd evqdVar = (evqd) evqe.a.createBuilder();
            evqdVar.copyOnWrite();
            ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
            epju epjuVar = (epju) epjv.a.createBuilder();
            epkc epkcVar = (epkc) epkd.a.createBuilder();
            MessageCoreData messageCoreData = this.m;
            if (messageCoreData == null) {
                epkdVar = (epkd) epkcVar.build();
            } else {
                List list = this.j;
                final String strAB = messageCoreData.aB();
                Optional optionalFindFirst = Collection.EL.stream(list).filter(new Predicate() { // from class: cpox
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
                        ejxr ejxrVar = cpoz.b;
                        return ((ParticipantsTable.BindData) obj).R().equals(strAB);
                    }
                }).findFirst();
                if (optionalFindFirst.isPresent()) {
                    String strP = ((ParticipantsTable.BindData) optionalFindFirst.get()).P();
                    String strQ = ((ParticipantsTable.BindData) optionalFindFirst.get()).Q();
                    cczv cczvVar = alvx.a;
                    String string = ((Boolean) new alut().get()).booleanValue() ? this.c.t((ParticipantsTable.BindData) optionalFindFirst.get()).F().toString() : ((ParticipantsTable.BindData) optionalFindFirst.get()).O();
                    if (strP != null) {
                        epkcVar.copyOnWrite();
                        epkd epkdVar2 = (epkd) epkcVar.instance;
                        epkdVar2.b = 1;
                        epkdVar2.c = strP;
                    } else if (strQ != null) {
                        epkcVar.copyOnWrite();
                        epkd epkdVar3 = (epkd) epkcVar.instance;
                        epkdVar3.b = 1;
                        epkdVar3.c = strQ;
                    } else if (string != null) {
                        epkcVar.copyOnWrite();
                        epkd epkdVar4 = (epkd) epkcVar.instance;
                        epkdVar4.b = 1;
                        epkdVar4.c = string;
                    }
                }
                bojh bojhVar = this.l;
                String strAh = bojhVar.ah();
                if (strAh != null) {
                    epkcVar.copyOnWrite();
                    ((epkd) epkcVar.instance).d = strAh;
                }
                String strAc = bojhVar.ac();
                if (strAc == null) {
                    strAc = "unknown/unknown";
                }
                int i = le.f(strAc) ? 8 : le.j(strAc) ? 6 : le.s(strAc) ? 11 : le.m(strAc) ? 4 : le.z(strAc) ? 9 : le.y(strAc) ? 10 : le.w(strAc) ? 3 : byed.g(messageCoreData.k()) ? 12 : 2;
                epkcVar.copyOnWrite();
                ((epkd) epkcVar.instance).f = i - 2;
                boolean z2 = !messageCoreData.cK();
                epkcVar.copyOnWrite();
                ((epkd) epkcVar.instance).e = z2;
                epkdVar = (epkd) epkcVar.build();
            }
            epjuVar.copyOnWrite();
            epjv epjvVar = (epjv) epjuVar.instance;
            epkdVar.getClass();
            epjvVar.c = epkdVar;
            epjvVar.b |= 1;
            boolean z3 = this.n;
            epjuVar.copyOnWrite();
            ((epjv) epjuVar.instance).d = z3;
            bojh bojhVar2 = this.l;
            String strAi = bojhVar2.ai();
            if (strAi != null) {
                epjuVar.copyOnWrite();
                ((epjv) epjuVar.instance).g = strAi;
            }
            epjs epjsVar = (epjs) f.getOrDefault(bojhVar2.G(), epjs.ACTIVE);
            if (cpyl.a() && ((Boolean) ((cczi) b.get()).e()).booleanValue()) {
                eqjtVar.a("metadata_conversation_status", evqs.A(String.valueOf(epjsVar.a())));
            }
            epjuVar.copyOnWrite();
            ((epjv) epjuVar.instance).e = epjsVar.a();
            long jX = bojhVar2.x();
            epjuVar.copyOnWrite();
            ((epjv) epjuVar.instance).f = jX;
            byte[] byteArray = ((epjv) epjuVar.build()).toByteArray();
            epkg epkgVar = (epkg) epkh.a.createBuilder();
            l(byteArray, this.r, epkgVar);
            evqs byteString = ((epkh) epkgVar.build()).toByteString();
            evqdVar.copyOnWrite();
            ((evqe) evqdVar.instance).c = byteString;
            eqjtVar.copyOnWrite();
            eqjv eqjvVar = (eqjv) eqjtVar.instance;
            evqe evqeVar = (evqe) evqdVar.build();
            eqjv eqjvVar2 = eqjv.a;
            evqeVar.getClass();
            eqjvVar.h = evqeVar;
            eqjvVar.b |= 2;
            bvdk bvdkVarG = bojhVar2.G();
            int i2 = (bvdkVarG == bvdk.ARCHIVED || bvdkVarG == bvdk.KEEP_ARCHIVED || bvdkVarG == bvdk.SPAM_FOLDER || bvdkVarG == bvdk.BLOCKED_FOLDER || bvdkVarG == bvdk.CROSS_COUNTRY_FOLDER) ? 4 : 3;
            eqjtVar.copyOnWrite();
            ((eqjv) eqjtVar.instance).f = i2 - 2;
        }
        if (enumSet.contains(cpot.RARELY_CHANGED_PART)) {
            evqd evqdVar2 = (evqd) evqe.a.createBuilder();
            evqdVar2.copyOnWrite();
            ((evqe) evqdVar2.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
            epjw epjwVar = (epjw) epjx.a.createBuilder();
            ekfw ekfwVar = new ekfw();
            List<ParticipantsTable.BindData> list2 = this.j;
            for (ParticipantsTable.BindData bindData : list2) {
                String strL = bindData.L();
                if (TextUtils.isEmpty(strL)) {
                    k(bindData.R(), 1);
                } else {
                    ekfwVar.h(strL);
                }
            }
            if (z) {
                bojh bojhVar3 = this.l;
                if (bojhVar3.k() != 2) {
                    String strS = bojhVar3.S();
                    String strR = bojhVar3.R();
                    ejwl.a(!TextUtils.isEmpty(strS));
                    String strE = e(list2);
                    strS.getClass();
                    if (strS.startsWith("cms:")) {
                        if (!TextUtils.isEmpty(strR) && !strR.equals(strE)) {
                            throw new cpzg(strE, strR);
                        }
                        this.q.c("Bugle.Cms.UpdateConversation.Participants.Match.Count");
                    } else {
                        if (!strE.equals(strS)) {
                            throw new cpzf(strS, strE);
                        }
                        this.q.c("Bugle.Cms.UpdateConversation.Participants.Match.Count");
                    }
                }
            }
            ekgb ekgbVarG = ekfwVar.g();
            epjwVar.copyOnWrite();
            epjx epjxVar = (epjx) epjwVar.instance;
            evtg evtgVar = epjxVar.g;
            if (!evtgVar.c()) {
                epjxVar.g = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(ekgbVarG, epjxVar.g);
            bojh bojhVar4 = this.l;
            String strY = bojhVar4.Y();
            if (!TextUtils.isEmpty(strY)) {
                epjwVar.copyOnWrite();
                epjx epjxVar2 = (epjx) epjwVar.instance;
                strY.getClass();
                epjxVar2.c = strY;
            }
            dggw dggwVar = (dggw) this.s.b();
            ParticipantsTable.BindData bindData2 = this.k;
            int i3 = (!bvdi.d(bojhVar4.k()) || dggwVar.w(bindData2 == null ? -1 : bindData2.r())) ? 2 : 3;
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).d = epjz.a(i3);
            epke epkeVar = (epke) epkf.a.createBuilder();
            if (bindData2 == null) {
                epkfVar = (epkf) epkeVar.build();
            } else {
                int iR = bindData2.r();
                epkeVar.copyOnWrite();
                ((epkf) epkeVar.instance).b = iR;
                epkfVar = (epkf) epkeVar.build();
            }
            epjwVar.copyOnWrite();
            epjx epjxVar3 = (epjx) epjwVar.instance;
            epkfVar.getClass();
            epjxVar3.e = epkfVar;
            epjxVar3.b |= 1;
            epjn epjnVar = (epjn) ((epjm) epjn.a.createBuilder()).build();
            epjwVar.copyOnWrite();
            epjx epjxVar4 = (epjx) epjwVar.instance;
            epjnVar.getClass();
            epjxVar4.f = epjnVar;
            epjxVar4.b |= 2;
            boolean z4 = bojhVar4.H() == bvdp.NAME_IS_AUTOMATIC;
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).i = z4;
            boolean zAn = bojhVar4.an();
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).h = zAn;
            if (bindData2 != null) {
                String strL2 = bindData2.L();
                if (TextUtils.isEmpty(strL2)) {
                    k(bindData2.R(), 1);
                } else {
                    epjwVar.copyOnWrite();
                    epjx epjxVar5 = (epjx) epjwVar.instance;
                    strL2.getClass();
                    epjxVar5.j = strL2;
                }
            }
            if (bojhVar4.k() == 2) {
                if (((Boolean) avos.a.e()).booleanValue()) {
                    strO = this.h.o(bojhVar4.C());
                } else {
                    cnqj cnqjVarN = bojhVar4.N();
                    cmqj cmqjVar = this.i;
                    String strD = cmqjVar.D(cnqjVarN);
                    if (strD != null) {
                        alqm alqmVar = (alqm) cmqjVar.U(strD).get(0);
                        if (((Boolean) ((cczi) chwq.a.get()).e()).booleanValue()) {
                            chvp chvpVar = this.g;
                            cczv cczvVar2 = alvx.a;
                            cmtzVarK = chvpVar.e(cnqjVarN, alqmVar.k(((Boolean) new alvr().get()).booleanValue()), "", null);
                        } else {
                            chwq chwqVar = this.h;
                            cczv cczvVar3 = alvx.a;
                            cmtzVarK = chwqVar.k(cnqjVarN, alqmVar.k(((Boolean) new alvr().get()).booleanValue()), "", null);
                        }
                        strO = cmtzVarK.e;
                    } else {
                        strO = null;
                    }
                }
                Optional optionalOfNullable = Optional.ofNullable(ejwk.a(strO));
                if (optionalOfNullable.isPresent()) {
                    String str = (String) optionalOfNullable.get();
                    epjwVar.copyOnWrite();
                    ((epjx) epjwVar.instance).k = str;
                }
                if (cpyl.a() && ((Boolean) ((cczi) cpxw.e.get()).e()).booleanValue() && !TextUtils.isEmpty(bojhVar4.af())) {
                    String strAf = bojhVar4.af();
                    strAf.getClass();
                    epjwVar.copyOnWrite();
                    ((epjx) epjwVar.instance).m = strAf;
                }
                if (cpyl.a() && ((Boolean) ((cczi) cpxw.h.get()).e()).booleanValue()) {
                    long j = bojhVar4.L().a;
                    epjwVar.copyOnWrite();
                    ((epjx) epjwVar.instance).n = j;
                }
                if (cpyl.a() && ((Boolean) ((cczi) cpxw.i.get()).e()).booleanValue()) {
                    int iA = bojhVar4.A().a();
                    epjwVar.copyOnWrite();
                    ((epjx) epjwVar.instance).o = iA;
                }
                if (cpyl.a() && ((Boolean) ((cczi) cpyl.v.get()).e()).booleanValue() && bojhVar4.ad() != null) {
                    String strAd = bojhVar4.ad();
                    strAd.getClass();
                    epjwVar.copyOnWrite();
                    ((epjx) epjwVar.instance).l = strAd;
                }
            }
            epjq epjqVar = (epjq) ((ekod) cptt.d).d.get(Integer.valueOf(bojhVar4.n()));
            if (epjqVar == null) {
                epjqVar = epjq.UNKNOWN_CONVERSATION_JOIN_STATE;
            }
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).p = epjqVar.a();
            epjt epjtVar = (epjt) ((ekod) cptt.c).d.get(Integer.valueOf(bojhVar4.k()));
            if (epjtVar == null) {
                epjtVar = epjt.UNKNOWN_CONVERSATION_TYPE;
            }
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).q = epjtVar.a();
            epjr epjrVar = (epjr) ((ekod) cptt.e).d.get(Integer.valueOf(bojhVar4.r()));
            if (epjrVar == null) {
                epjrVar = epjr.CONVERSATION_SEND_MODE_AUTO;
            }
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).r = epjrVar.a();
            boolean zAp = bojhVar4.ap();
            epjwVar.copyOnWrite();
            ((epjx) epjwVar.instance).s = zAp;
            if (cpyl.a() && ((Boolean) ((cczi) b.get()).e()).booleanValue()) {
                eqjtVar.a("read_only_status", evqs.A(String.valueOf(epjz.a(i3))));
                eqjtVar.a("join_state", evqs.A(String.valueOf(epjqVar.a())));
                eqjtVar.a("conversation_type", evqs.A(String.valueOf(epjtVar.a())));
                eqjtVar.a("send_mode", evqs.A(String.valueOf(epjrVar.a())));
            }
            if (this.t.a()) {
                epjy epjyVar = (epjy) ((ekod) cptt.k).d.get(bojhVar4.M());
                if (epjyVar == null) {
                    epjyVar = epjy.STATUS_UNKNOWN_MMS_GROUP_UPGRADE_STATUS;
                }
                epjwVar.copyOnWrite();
                ((epjx) epjwVar.instance).t = epjyVar.a();
            }
            byte[] byteArray2 = ((epjx) epjwVar.build()).toByteArray();
            epkg epkgVar2 = (epkg) epkh.a.createBuilder();
            l(byteArray2, this.r, epkgVar2);
            evqs byteString2 = ((epkh) epkgVar2.build()).toByteString();
            evqdVar2.copyOnWrite();
            ((evqe) evqdVar2.instance).c = byteString2;
            eqjtVar.copyOnWrite();
            eqjv eqjvVar3 = (eqjv) eqjtVar.instance;
            evqe evqeVar2 = (evqe) evqdVar2.build();
            eqjv eqjvVar4 = eqjv.a;
            evqeVar2.getClass();
            eqjvVar3.i = evqeVar2;
            eqjvVar3.b |= 4;
        }
        if (enumSet.contains(cpot.ADDITIONAL_FIELDS_PART)) {
            final epjd epjdVar = (epjd) epjf.a.createBuilder();
            Map.EL.forEach(this.p, new BiConsumer() { // from class: cpow
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ejxr ejxrVar = cpoz.b;
                    String strName = ((epjl) obj).name();
                    epjdVar.a(strName, (evqs) obj2);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            epkg epkgVar3 = (epkg) epkh.a.createBuilder();
            l(((epjf) epjdVar.build()).toByteArray(), this.r, epkgVar3);
            eqjtVar.a("additional_fields", ((epkh) epkgVar3.build()).toByteString());
        }
    }

    private final void i(eqjt eqjtVar) {
        String strF = f();
        bojh bojhVar = this.l;
        String strR = bojhVar.R();
        if (!strF.equals(strR)) {
            if (bojhVar.k() != 2 && !TextUtils.isEmpty(strR)) {
                throw new cpzg(strF, strR);
            }
            ekrw ekrwVarH = e.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl", "maybeRenewCmsCorrelationId", 262, "CmsConversationBuilderImpl.java")).I("Re-populate cms correlation id for conversation %s. Previous correlation_id = %s, new correlation_id = %s", ((eqjv) eqjtVar.instance).c, strR, strF);
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.j(strF);
            boteVar.f(bojhVar.C());
        }
        eqjtVar.copyOnWrite();
        eqjv eqjvVar = (eqjv) eqjtVar.instance;
        eqjv eqjvVar2 = eqjv.a;
        strF.getClass();
        eqjvVar.d = strF;
    }

    public final eqjv c() {
        cqaz.h();
        eqjt eqjtVar = (eqjt) eqjv.a.createBuilder();
        bojh bojhVar = this.l;
        String strS = bojhVar.S();
        if (!TextUtils.isEmpty(strS)) {
            eqjtVar.copyOnWrite();
            eqjv eqjvVar = (eqjv) eqjtVar.instance;
            strS.getClass();
            eqjvVar.c = strS;
        } else if (this.t.a()) {
            String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
            ekrw ekrwVarE = e.e();
            ekrwVarE.X(eksq.a, "BugleCms");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl", "buildCmsConversation", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "CmsConversationBuilderImpl.java");
            String strA = bojhVar.C().a();
            String strConcat = "cms:".concat(strValueOf);
            ekrdVar.D("Use UUID = %s for conversation = %s", strConcat, strA);
            eqjtVar.copyOnWrite();
            ((eqjv) eqjtVar.instance).c = strConcat;
        } else {
            String strF = f();
            eqjtVar.copyOnWrite();
            eqjv eqjvVar2 = (eqjv) eqjtVar.instance;
            strF.getClass();
            eqjvVar2.c = strF;
        }
        if (this.t.a()) {
            i(eqjtVar);
        }
        g(eqjtVar);
        h(eqjtVar, EnumSet.allOf(cpot.class), false);
        return (eqjv) eqjtVar.build();
    }

    public final eqjv d(EnumSet enumSet) {
        cqaz.h();
        ejwl.b(!enumSet.isEmpty(), "updateType should be specified.");
        eqjt eqjtVar = (eqjt) eqjv.a.createBuilder();
        String strS = this.l.S();
        if (!TextUtils.isEmpty(strS)) {
            eqjtVar.copyOnWrite();
            eqjv eqjvVar = (eqjv) eqjtVar.instance;
            strS.getClass();
            eqjvVar.c = strS;
        }
        if (this.t.a()) {
            i(eqjtVar);
        }
        g(eqjtVar);
        h(eqjtVar, enumSet, true);
        return (eqjv) eqjtVar.build();
    }
}
