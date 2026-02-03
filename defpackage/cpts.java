package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpts extends cpnl implements cptm {
    public static final /* synthetic */ int e = 0;
    private static final Map f;
    public final MessageCoreData b;
    public final apom c;
    public final bojh d;
    private final eksp g;
    private final cehg h;
    private final cqmz i;
    private final List j;
    private final List k;
    private final ekgp l;
    private final List m;
    private final bnar n;
    private final aqeg o;
    private Optional p;
    private final bpvd q;
    private final ParticipantsTable.BindData r;
    private final ParticipantsTable.BindData s;

    static {
        ekgi ekgiVar = new ekgi();
        int i = 0;
        for (cptl cptlVar : cptl.values()) {
            ekgiVar.i(cptlVar, Integer.valueOf(i));
            i++;
        }
        f = ekgiVar.c();
    }

    public cpts(fcsu fcsuVar, cehg cehgVar, cqmz cqmzVar, apom apomVar, aqeg aqegVar, cprt cprtVar, bnar bnarVar) {
        super(fcsuVar);
        this.g = eksp.c("BugleCms");
        this.p = Optional.empty();
        this.h = cehgVar;
        this.i = cqmzVar;
        this.r = cprtVar.e();
        this.s = cprtVar.d();
        this.b = cprtVar.a();
        this.d = cprtVar.b();
        this.q = cprtVar.c();
        this.j = cprtVar.f();
        this.k = cprtVar.h();
        this.l = cprtVar.i();
        this.m = cprtVar.g();
        this.c = apomVar;
        this.o = aqegVar;
        this.n = bnarVar;
    }

    public static int c(cptl cptlVar) {
        Integer num = (Integer) f.get(cptlVar);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.cptm
    public final eqnu a(cptl cptlVar) {
        ejwl.l(!ecem.g());
        int i = cptr.a[cptlVar.ordinal()];
        if (i == 1) {
            if (this.c.a() && cpyl.a()) {
                return d();
            }
            return null;
        }
        if (i == 2) {
            return e();
        }
        if (i != 3) {
            return null;
        }
        return f();
    }

    @Override // defpackage.cptm
    public final void b(cpti cptiVar) {
        this.p = Optional.of(cptiVar);
    }

    public final eqnu d() {
        final epjd epjdVar = (epjd) epjf.a.createBuilder();
        Map.EL.forEach(this.l, new BiConsumer() { // from class: cptq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i = cpts.e;
                String strName = ((epjl) obj).name();
                epjdVar.a(strName, (evqs) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        epkg epkgVar = (epkg) epkh.a.createBuilder();
        l(((epjf) epjdVar.build()).toByteArray(), this.n, epkgVar);
        eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
        String str = cptl.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.d;
        eqntVar.copyOnWrite();
        eqnu eqnuVar = (eqnu) eqntVar.instance;
        str.getClass();
        eqnuVar.f = str;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        evqs byteString = ((epkh) epkgVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        eqntVar.copyOnWrite();
        eqnu eqnuVar2 = (eqnu) eqntVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        eqnuVar2.g = evqeVar;
        eqnuVar2.b |= 1;
        return (eqnu) eqntVar.build();
    }

    public final eqnu e() {
        epkt epktVar = (epkt) epku.a.createBuilder();
        MessageCoreData messageCoreData = this.b;
        eplg eplgVarA = cptt.a(messageCoreData.k());
        if (eplgVarA != null) {
            epktVar.copyOnWrite();
            ((epku) epktVar.instance).b = eplgVarA.a();
        }
        boolean zCN = messageCoreData.cN();
        epktVar.copyOnWrite();
        ((epku) epktVar.instance).d = zCN;
        boolean zCM = messageCoreData.cM();
        epktVar.copyOnWrite();
        ((epku) epktVar.instance).c = zCM;
        epkg epkgVar = (epkg) epkh.a.createBuilder();
        l(((epku) epktVar.build()).toByteArray(), this.n, epkgVar);
        eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
        String str = cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.d;
        eqntVar.copyOnWrite();
        eqnu eqnuVar = (eqnu) eqntVar.instance;
        str.getClass();
        eqnuVar.f = str;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        evqs byteString = ((epkh) epkgVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        eqntVar.copyOnWrite();
        eqnu eqnuVar2 = (eqnu) eqntVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        eqnuVar2.g = evqeVar;
        eqnuVar2.b |= 1;
        return (eqnu) eqntVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eqnu f() {
        evqs evqsVarW;
        Optional optionalAe;
        Optional optionalOf;
        ejwl.l(!ecem.g());
        eple epleVar = (eple) eplf.a.createBuilder();
        bojh bojhVar = this.d;
        if (bojhVar != null) {
            String strS = bojhVar.S();
            if (TextUtils.isEmpty(strS)) {
                k(bojhVar.C().a(), 2);
            } else {
                epleVar.copyOnWrite();
                eplf eplfVar = (eplf) epleVar.instance;
                strS.getClass();
                eplfVar.c = strS;
            }
        }
        MessageCoreData messageCoreData = this.b;
        if (messageCoreData.C() != null) {
            for (ezds ezdsVar : this.m) {
                eplc eplcVar = (eplc) epld.a.createBuilder();
                eplcVar.copyOnWrite();
                epld epldVar = (epld) eplcVar.instance;
                ezdsVar.getClass();
                epldVar.d = ezdsVar;
                epldVar.b |= 1;
                eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                if (eyzyVarB == null) {
                    eyzyVarB = eyzy.UNRECOGNIZED;
                }
                eplcVar.copyOnWrite();
                ((epld) eplcVar.instance).c = eyzyVarB.a();
                epleVar.copyOnWrite();
                eplf eplfVar2 = (eplf) epleVar.instance;
                epld epldVar2 = (epld) eplcVar.build();
                epldVar2.getClass();
                evtg evtgVar = eplfVar2.q;
                if (!evtgVar.c()) {
                    eplfVar2.q = evsn.mutableCopy(evtgVar);
                }
                eplfVar2.q.add(epldVar2);
            }
            ejwl.l(!ecem.g());
            eplm eplmVar = (eplm) epln.a.createBuilder();
            List list = this.k;
            eplmVar.copyOnWrite();
            epln eplnVar = (epln) eplmVar.instance;
            evsx evsxVar = eplnVar.b;
            if (!evsxVar.c()) {
                eplnVar.b = evsn.mutableCopy(evsxVar);
            }
            evpz.addAll(list, eplnVar.b);
            epln eplnVar2 = (epln) eplmVar.build();
            epleVar.copyOnWrite();
            eplf eplfVar3 = (eplf) epleVar.instance;
            eplnVar2.getClass();
            eplfVar3.o = eplnVar2;
            eplfVar3.b |= 4;
            Iterable iterable = (Iterable) Collection.EL.stream(this.j).map(new Function() { // from class: cpto
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
                    int i = cpts.e;
                    epkq epkqVar = (epkq) epkr.a.createBuilder();
                    String strSerializeProperties = conversationSuggestion.serializeProperties();
                    if (strSerializeProperties != null) {
                        epkqVar.copyOnWrite();
                        ((epkr) epkqVar.instance).c = strSerializeProperties;
                    }
                    epks epksVar = (epks) ((ekod) cptt.i).d.get(Integer.valueOf(conversationSuggestion.getSuggestionType()));
                    if (epksVar != null) {
                        epkqVar.copyOnWrite();
                        ((epkr) epkqVar.instance).b = epksVar.a();
                    }
                    return (epkr) epkqVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: cptp
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            epleVar.copyOnWrite();
            eplf eplfVar4 = (eplf) epleVar.instance;
            evtg evtgVar2 = eplfVar4.r;
            if (!evtgVar2.c()) {
                eplfVar4.r = evsn.mutableCopy(evtgVar2);
            }
            evpz.addAll(iterable, eplfVar4.r);
        }
        ParticipantsTable.BindData bindData = this.r;
        if (bindData != null) {
            String strL = bindData.L();
            if (TextUtils.isEmpty(strL)) {
                k(bindData.R(), 1);
            } else {
                epleVar.copyOnWrite();
                eplf eplfVar5 = (eplf) epleVar.instance;
                strL.getClass();
                eplfVar5.e = strL;
            }
        }
        ParticipantsTable.BindData bindData2 = this.s;
        if (bindData2 != null) {
            String strL2 = bindData2.L();
            if (TextUtils.isEmpty(strL2)) {
                k(bindData2.R(), 1);
            } else {
                epleVar.copyOnWrite();
                eplf eplfVar6 = (eplf) epleVar.instance;
                strL2.getClass();
                eplfVar6.f = strL2;
            }
        }
        String strAv = messageCoreData.av();
        if (strAv != null) {
            epleVar.copyOnWrite();
            ((eplf) epleVar.instance).g = strAv;
        }
        String strAw = messageCoreData.aw();
        eplo eploVar = (eplo) eplp.a.createBuilder();
        if (messageCoreData.d() == 2) {
            String strAu = messageCoreData.au();
            if (!TextUtils.isEmpty(strAu)) {
                eploVar.copyOnWrite();
                eplp eplpVar = (eplp) eploVar.instance;
                strAu.getClass();
                eplpVar.c = strAu;
            }
        }
        if (TextUtils.isEmpty(strAw)) {
            int iD = messageCoreData.d();
            if ((iD == 1 || iD == 2 || iD == 3) && bojhVar != null) {
                String strA = chxq.a(messageCoreData, bojhVar.ad(), bojhVar);
                eploVar.copyOnWrite();
                eplp eplpVar2 = (eplp) eploVar.instance;
                strA.getClass();
                eplpVar2.b = strA;
                eplp eplpVar3 = (eplp) eploVar.build();
                epleVar.copyOnWrite();
                eplf eplfVar7 = (eplf) epleVar.instance;
                eplpVar3.getClass();
                eplfVar7.s = eplpVar3;
                eplfVar7.b |= 8;
            }
        } else {
            eploVar.copyOnWrite();
            eplp eplpVar4 = (eplp) eploVar.instance;
            strAw.getClass();
            eplpVar4.b = strAw;
            eplp eplpVar5 = (eplp) eploVar.build();
            epleVar.copyOnWrite();
            eplf eplfVar8 = (eplf) epleVar.instance;
            eplpVar5.getClass();
            eplfVar8.s = eplpVar5;
            eplfVar8.b |= 8;
        }
        epll epllVarC = cptt.c(messageCoreData.b());
        if (epllVarC != null) {
            epleVar.copyOnWrite();
            ((eplf) epleVar.instance).k = epllVarC.a();
        }
        int iJ = messageCoreData.j();
        String strAC = messageCoreData.aC();
        epkv epkvVar = (epkv) epkw.a.createBuilder();
        epkvVar.copyOnWrite();
        ((epkw) epkvVar.instance).b = iJ;
        if (strAC != null) {
            epkvVar.copyOnWrite();
            ((epkw) epkvVar.instance).c = strAC;
        }
        epkw epkwVar = (epkw) epkvVar.build();
        epleVar.copyOnWrite();
        eplf eplfVar9 = (eplf) epleVar.instance;
        epkwVar.getClass();
        eplfVar9.n = epkwVar;
        eplfVar9.b |= 2;
        long jO = messageCoreData.o();
        epleVar.copyOnWrite();
        ((eplf) epleVar.instance).h = jO;
        long jR = messageCoreData.r();
        epleVar.copyOnWrite();
        ((eplf) epleVar.instance).i = jR;
        eplh eplhVarB = cptt.b(messageCoreData.d());
        if (eplhVarB != null) {
            epleVar.copyOnWrite();
            ((eplf) epleVar.instance).j = eplhVarB.a();
        }
        String strAj = messageCoreData.aj();
        String strAi = messageCoreData.ai();
        epko epkoVar = (epko) epkp.a.createBuilder();
        if (strAj != null) {
            epkoVar.copyOnWrite();
            ((epkp) epkoVar.instance).b = strAj;
        }
        if (strAi != null) {
            epkoVar.copyOnWrite();
            ((epkp) epkoVar.instance).c = strAi;
        }
        epkp epkpVar = (epkp) epkoVar.build();
        epleVar.copyOnWrite();
        eplf eplfVar10 = (eplf) epleVar.instance;
        epkpVar.getClass();
        eplfVar10.m = epkpVar;
        eplfVar10.b |= 1;
        epkx epkxVar = (epkx) ((ekod) cptt.g).d.get(Integer.valueOf(messageCoreData.g()));
        if (epkxVar != null) {
            epleVar.copyOnWrite();
            ((eplf) epleVar.instance).l = epkxVar.a();
        }
        if (byed.g(messageCoreData.k())) {
            eplg eplgVarA = cptt.a(messageCoreData.k());
            if (eplgVarA != null && cptr.b[eplgVarA.ordinal()] == 1) {
                epls eplsVar = (epls) eplt.a.createBuilder();
                String strMo280do = messageCoreData.mo280do(1);
                eplsVar.copyOnWrite();
                ((eplt) eplsVar.instance).b = strMo280do;
                optionalOf = Optional.of((eplt) eplsVar.build());
            } else {
                optionalOf = Optional.empty();
            }
            if (optionalOf.isPresent()) {
                Object obj = optionalOf.get();
                epleVar.copyOnWrite();
                eplf eplfVar11 = (eplf) epleVar.instance;
                eplfVar11.t = (eplt) obj;
                eplfVar11.b |= 16;
            }
        } else {
            List<MessagePartCoreData> listM = messageCoreData.M();
            if (!listM.isEmpty()) {
                ejwl.l(!ecem.g());
                ArrayList arrayList = new ArrayList();
                for (MessagePartCoreData messagePartCoreData : listM) {
                    ejwl.l(!ecem.g());
                    epli epliVar = (epli) eplj.a.createBuilder();
                    String strW = messagePartCoreData.W();
                    if (strW != null) {
                        epliVar.copyOnWrite();
                        ((eplj) epliVar.instance).d = strW;
                    }
                    eplk eplkVar = (this.o.a() && messagePartCoreData.bo()) ? eplk.RCS_LOCATION : messagePartCoreData.bj() ? eplk.IMAGE : messagePartCoreData.bv() ? eplk.TEXT : messagePartCoreData.bx() ? eplk.VIDEO : messagePartCoreData.aY() ? eplk.AUDIO : (le.u(messagePartCoreData.R()) || le.y(messagePartCoreData.R())) ? eplk.ATTACHMENT : messagePartCoreData.bk() ? eplk.LOCATION : messagePartCoreData.bq() ? eplk.RICH_CARD : eplk.PART_TYPE_UNKNOWN;
                    epliVar.copyOnWrite();
                    ((eplj) epliVar.instance).e = eplkVar.a();
                    switch (cptr.c[eplkVar.ordinal()]) {
                        case 1:
                            ejwl.l(!ecem.g());
                            eplq eplqVar = (eplq) eplr.a.createBuilder();
                            String strAb = messagePartCoreData.ab();
                            if (strAb != null) {
                                eplqVar.copyOnWrite();
                                ((eplr) eplqVar.instance).c = strAb;
                            }
                            ejwl.l(!ecem.g());
                            epky epkyVar = (epky) epkz.a.createBuilder();
                            bpvd bpvdVar = this.q;
                            if (bpvdVar != null) {
                                String strS2 = bpvdVar.s();
                                if (strS2 != null) {
                                    epkyVar.copyOnWrite();
                                    ((epkz) epkyVar.instance).b = strS2;
                                }
                                String strR = bpvdVar.r();
                                if (strR != null) {
                                    epkyVar.copyOnWrite();
                                    ((epkz) epkyVar.instance).d = strR;
                                }
                                String strO = bpvdVar.o();
                                if (strO != null) {
                                    epkyVar.copyOnWrite();
                                    ((epkz) epkyVar.instance).e = strO;
                                }
                                String strQ = bpvdVar.q();
                                if (strQ != null) {
                                    epkyVar.copyOnWrite();
                                    ((epkz) epkyVar.instance).f = strQ;
                                }
                                String strP = bpvdVar.p();
                                if (strP != null) {
                                    epkyVar.copyOnWrite();
                                    ((epkz) epkyVar.instance).g = strP;
                                }
                                long jK = bpvdVar.k();
                                epkyVar.copyOnWrite();
                                ((epkz) epkyVar.instance).c = jK;
                            }
                            epkz epkzVar = (epkz) epkyVar.build();
                            eplqVar.copyOnWrite();
                            eplr eplrVar = (eplr) eplqVar.instance;
                            epkzVar.getClass();
                            eplrVar.d = epkzVar;
                            eplrVar.b |= 1;
                            eplr eplrVar2 = (eplr) eplqVar.build();
                            epliVar.copyOnWrite();
                            eplj epljVar = (eplj) epliVar.instance;
                            eplrVar2.getClass();
                            epljVar.c = eplrVar2;
                            epljVar.b = 3;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            Optional optional = this.p;
                            ejwl.l(!ecem.g());
                            epkl epklVar = (epkl) epkm.a.createBuilder();
                            Uri uriT = messagePartCoreData.t();
                            if (uriT != null) {
                                try {
                                    long jA = this.i.a(uriT);
                                    epklVar.copyOnWrite();
                                    ((epkm) epklVar.instance).e = jA;
                                } catch (SecurityException e2) {
                                    ((eksl) ((eksl) ((eksl) this.g.j()).g(e2)).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsObjectBuilderImpl", "getAttachmentModelPartFromData", (char) 694, "CmsObjectBuilderImpl.java")).q("Unable to access URI");
                                }
                            }
                            if (eplkVar.equals(eplk.IMAGE)) {
                                if (optional.isPresent()) {
                                    cpti cptiVar = (cpti) optional.get();
                                    if (cptiVar.a().containsKey(messagePartCoreData.W())) {
                                        cptk cptkVar = (cptk) cptiVar.a().get(messagePartCoreData.W());
                                        cptkVar.getClass();
                                        evqsVarW = cptkVar.a();
                                    } else {
                                        evqsVarW = null;
                                    }
                                } else {
                                    evqsVarW = this.h.w(messagePartCoreData);
                                }
                                if (evqsVarW != null) {
                                    epklVar.copyOnWrite();
                                    ((epkm) epklVar.instance).i = evqsVarW;
                                    int i = cptr.d[this.h.x.ordinal()];
                                    epkn epknVar = i != 1 ? i != 2 ? i != 3 ? epkn.ATTACHMENT_TYPE_UNKNOWN : epkn.IMAGE_WEBP : epkn.IMAGE_JPEG : epkn.IMAGE_PNG;
                                    epklVar.copyOnWrite();
                                    ((epkm) epklVar.instance).j = epknVar.a();
                                }
                            }
                            String strR2 = messagePartCoreData.R();
                            if (strR2 != null) {
                                epkn epknVar2 = (epkn) ((ekod) cptt.h).d.get(strR2);
                                if (epknVar2 == null) {
                                    epknVar2 = epkn.ATTACHMENT_TYPE_UNKNOWN;
                                }
                                epklVar.copyOnWrite();
                                ((epkm) epklVar.instance).f = epknVar2.a();
                            }
                            String strP2 = messagePartCoreData.P();
                            if (!TextUtils.isEmpty(strP2)) {
                                epklVar.copyOnWrite();
                                epkm epkmVar = (epkm) epklVar.instance;
                                strP2.getClass();
                                epkmVar.d = strP2;
                            }
                            byte[] bArrBD = messagePartCoreData.bD();
                            if (bArrBD != null) {
                                evqs evqsVarX = evqs.x(bArrBD);
                                epklVar.copyOnWrite();
                                ((epkm) epklVar.instance).b = evqsVarX;
                            }
                            String strO2 = messagePartCoreData.O();
                            if (!TextUtils.isEmpty(strO2)) {
                                epklVar.copyOnWrite();
                                epkm epkmVar2 = (epkm) epklVar.instance;
                                strO2.getClass();
                                epkmVar2.g = strO2;
                            }
                            byte[] bArrBC = messagePartCoreData.bC();
                            if (bArrBC != null) {
                                evqs evqsVarX2 = evqs.x(bArrBC);
                                epklVar.copyOnWrite();
                                ((epkm) epklVar.instance).c = evqsVarX2;
                            }
                            String strU = messagePartCoreData.U();
                            if (strU != null) {
                                epklVar.copyOnWrite();
                                ((epkm) epklVar.instance).h = strU;
                            }
                            long jK2 = messagePartCoreData.k();
                            epklVar.copyOnWrite();
                            ((epkm) epklVar.instance).m = jK2;
                            long jC = messagePartCoreData.c();
                            long jB = messagePartCoreData.b();
                            epklVar.copyOnWrite();
                            ((epkm) epklVar.instance).l = jC;
                            epklVar.copyOnWrite();
                            ((epkm) epklVar.instance).k = jB;
                            epkm epkmVar3 = (epkm) epklVar.build();
                            epliVar.copyOnWrite();
                            eplj epljVar2 = (eplj) epliVar.instance;
                            epkmVar3.getClass();
                            epljVar2.c = epkmVar3;
                            epljVar2.b = 4;
                            break;
                        case 7:
                        case 8:
                            epla eplaVar = (epla) eplb.a.createBuilder();
                            LocationInformation locationInformationI = messagePartCoreData.I();
                            if (locationInformationI != null) {
                                double d = locationInformationI.d;
                                eplaVar.copyOnWrite();
                                ((eplb) eplaVar.instance).b = d;
                                double d2 = locationInformationI.c;
                                eplaVar.copyOnWrite();
                                ((eplb) eplaVar.instance).c = d2;
                                String str = locationInformationI.a;
                                if (str != null) {
                                    eplaVar.copyOnWrite();
                                    ((eplb) eplaVar.instance).d = str;
                                }
                            }
                            eplb eplbVar = (eplb) eplaVar.build();
                            epliVar.copyOnWrite();
                            eplj epljVar3 = (eplj) epliVar.instance;
                            eplbVar.getClass();
                            epljVar3.c = eplbVar;
                            epljVar3.b = 5;
                            break;
                    }
                    arrayList.add((eplj) epliVar.build());
                }
                epleVar.copyOnWrite();
                eplf eplfVar12 = (eplf) epleVar.instance;
                evtg evtgVar3 = eplfVar12.p;
                if (!evtgVar3.c()) {
                    eplfVar12.p = evsn.mutableCopy(evtgVar3);
                }
                evpz.addAll(arrayList, eplfVar12.p);
            }
        }
        MessageCoreData messageCoreData2 = this.b;
        boolean zCF = messageCoreData2.cF();
        epleVar.copyOnWrite();
        ((eplf) epleVar.instance).u = zCF;
        String strD = basd.d(messageCoreData2.F());
        if (strD != null) {
            epleVar.copyOnWrite();
            eplf eplfVar13 = (eplf) epleVar.instance;
            eplfVar13.b |= 32;
            eplfVar13.v = strD;
        }
        if (((Boolean) ((cczi) cpyl.V.get()).e()).booleanValue() && (optionalAe = messageCoreData2.ae()) != null && optionalAe.isPresent()) {
            String string = ((UUID) optionalAe.get()).toString();
            epleVar.copyOnWrite();
            eplf eplfVar14 = (eplf) epleVar.instance;
            string.getClass();
            eplfVar14.x = string;
        }
        String strD2 = basd.d(messageCoreData2.E());
        if (!ejwk.c(strD2)) {
            epleVar.copyOnWrite();
            eplf eplfVar15 = (eplf) epleVar.instance;
            strD2.getClass();
            eplfVar15.b |= 64;
            eplfVar15.w = strD2;
        }
        eplf eplfVar16 = (eplf) epleVar.build();
        epkg epkgVar = (epkg) epkh.a.createBuilder();
        l(eplfVar16.toByteArray(), this.n, epkgVar);
        eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
        String str2 = cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.d;
        eqntVar.copyOnWrite();
        eqnu eqnuVar = (eqnu) eqntVar.instance;
        str2.getClass();
        eqnuVar.f = str2;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        evqs byteString = ((epkh) epkgVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        eqntVar.copyOnWrite();
        eqnu eqnuVar2 = (eqnu) eqntVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        eqnuVar2.g = evqeVar;
        eqnuVar2.b = 1 | eqnuVar2.b;
        return (eqnu) eqntVar.build();
    }
}
