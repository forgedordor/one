package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/ChatApiSender");
    public static final chvf b = chvf.j(0, 0).a();
    public final eosc c;
    public final eosc d;
    public final auau e;
    public final fcsu f;
    public final fcsu g;
    public final atau h;
    public final fcsu i;
    public final atak j;
    public final cmxn k;
    public final cqdr l;
    private final asre m;
    private final atah n;
    private final asry o;

    public cmnp(asre asreVar, auau auauVar, atah atahVar, asry asryVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, atau atauVar, cqdr cqdrVar, atak atakVar, cmxn cmxnVar) {
        this.m = asreVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = auauVar;
        this.n = atahVar;
        this.o = asryVar;
        this.f = fcsuVar;
        this.i = fcsuVar2;
        this.g = fcsuVar3;
        this.h = atauVar;
        this.l = cqdrVar;
        this.j = atakVar;
        this.k = cmxnVar;
    }

    public static boolean j(MessageCoreData messageCoreData, cmom cmomVar) {
        return cmomVar.b(messageCoreData);
    }

    public static chvf k(Exception exc, basd basdVar, int i) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleRcs");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(exc);
        ekrdVar.X(cqnc.f, basdVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToMessageStatusPlusUri", 1204, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", cmno.a(i));
        enxi enxiVar = exc instanceof cmph ? enxi.CHAT_API_SERIALIZATION_ERROR : enxi.CHAT_API_GENERIC_TRANSPORT_ERROR;
        chve chveVarJ = chvf.j(3, 10003);
        chveVarJ.b(1);
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = 1;
        enxwVar.b |= 4;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.f = enxiVar.D;
        enxwVar2.b |= 8;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b = 1 | enxuVar.b;
        ((chue) chveVarJ).d = (enxu) enxtVar.build();
        return chveVarJ.a();
    }

    public static chwo l(Exception exc, basd basdVar, int i) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleRcs");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(exc);
        ekrdVar.X(cqnc.f, basdVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToInvocationResultAndDiagnostics", 1232, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", cmno.a(i));
        chwo chwoVar = new chwo();
        chwoVar.a = false;
        enxi enxiVar = exc instanceof cmph ? enxi.CHAT_API_SERIALIZATION_ERROR : enxi.CHAT_API_GENERIC_TRANSPORT_ERROR;
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = 1;
        enxwVar.b |= 4;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.f = enxiVar.D;
        enxwVar2.b |= 8;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        chwoVar.b = (enxu) enxtVar.build();
        return chwoVar;
    }

    public static boolean p(MessageCoreData messageCoreData) {
        return (TextUtils.isEmpty(messageCoreData.az()) || messageCoreData.cr()) ? false : true;
    }

    private final enxu q(aubl aublVar) {
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = 1;
        enxwVar.b |= 4;
        aubi aubiVarB = aubi.b(aublVar.d);
        if (aubiVarB == null) {
            aubiVarB = aubi.UNKNOWN_CAUSE;
        }
        enxi enxiVar = (enxi) this.n.fM(aubiVarB);
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.f = enxiVar.D;
        enxwVar2.b |= 8;
        asry asryVar = this.o;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        enxk enxkVar = (enxk) asryVar.fM(aubkVarB);
        enxvVar.copyOnWrite();
        enxw enxwVar3 = (enxw) enxvVar.instance;
        enxwVar3.g = enxkVar.f;
        enxwVar3.b |= 16;
        enxw enxwVar4 = (enxw) enxvVar.build();
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxwVar4.getClass();
        enxuVar.c = enxwVar4;
        enxuVar.b |= 1;
        return (enxu) enxtVar.build();
    }

    public final auib a(MessageCoreData messageCoreData) {
        return (auib) this.h.fM((fhaz) Optional.ofNullable(messageCoreData.aJ()).orElse(cqdr.a()));
    }

    public final chvf b(augz augzVar) {
        aubl aublVar = augzVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubi aubiVarB = aubi.b(aublVar.d);
        if (aubiVarB == null) {
            aubiVarB = aubi.UNKNOWN_CAUSE;
        }
        aubl aublVar2 = augzVar.c;
        if (aublVar2 == null) {
            aublVar2 = aubl.a;
        }
        aubk aubkVarB = aubk.b(aublVar2.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        int i = aubiVarB.v;
        int iOrdinal = aubkVarB.ordinal();
        if (iOrdinal == 1) {
            return chvf.j(0, i).a();
        }
        if (iOrdinal == 2) {
            return chvf.j(-1, i).a();
        }
        if (iOrdinal == 3) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "responseToMessageStatusPlusUri", 1267, "ChatApiSender.java")).q("ChatAPI response returned transient failure, setting message send status to AUTO_RETRY");
            chve chveVarJ = chvf.j(1, i);
            chveVarJ.b(1);
            aubl aublVar3 = augzVar.c;
            if (aublVar3 == null) {
                aublVar3 = aubl.a;
            }
            ((chue) chveVarJ).d = q(aublVar3);
            augm augmVar = augzVar.g;
            if (augmVar == null) {
                augmVar = augm.a;
            }
            chveVarJ.c(augmVar);
            return chveVarJ.a();
        }
        if (iOrdinal != 4) {
            chve chveVarJ2 = chvf.j(3, i);
            chveVarJ2.b(1);
            return chveVarJ2.a();
        }
        chve chveVarJ3 = chvf.j(3, i);
        chveVarJ3.b(1);
        aubl aublVar4 = augzVar.c;
        if (aublVar4 == null) {
            aublVar4 = aubl.a;
        }
        ((chue) chveVarJ3).d = q(aublVar4);
        augm augmVar2 = augzVar.g;
        if (augmVar2 == null) {
            augmVar2 = augm.a;
        }
        chveVarJ3.c(augmVar2);
        return chveVarJ3.a();
    }

    public final eiju c(final MessageCoreData messageCoreData, basd basdVar, aubt aubtVar, eyga eygaVar, asrg asrgVar, auhf auhfVar, aufx aufxVar) {
        return e(basdVar, aubtVar, eygaVar, asrgVar, auhfVar, aufxVar, (aubq) messageCoreData.ag().orElseThrow(new Supplier() { // from class: cmmt
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = cmnp.a;
                return new cmnn(messageCoreData.ao());
            }
        }));
    }

    public final eiju d(basd basdVar, asrg asrgVar, auhk auhkVar, Instant instant, cmpo cmpoVar, aufx aufxVar, aubq aubqVar) {
        eieu eieuVarK = eiiy.k("ChatApiSender::sendMessageReceiptForUnsavedMessage");
        try {
            eiju eijuVarI = i(basdVar, asrgVar, auhkVar, instant, cmpoVar, aufxVar, aubqVar, eyga.a);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eiju e(final basd basdVar, aubt aubtVar, eyga eygaVar, asrg asrgVar, auhf auhfVar, aufx aufxVar, aubq aubqVar) {
        final Optional optionalEmpty;
        aubq aubqVarA;
        aubp aubpVar = aubp.PHONE;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.m(aubpVar.equals(aubpVarB), "Only phone identity supported.");
        if ((auhfVar.b & 4) != 0) {
            auib auibVar = auhfVar.g;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            optionalEmpty = Optional.of(auibVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        if (asrgVar.d()) {
            aubqVarA = asrgVar.b().d;
            if (aubqVarA == null) {
                aubqVarA = aubq.a;
            }
        } else {
            aubqVarA = asrgVar.a();
        }
        String strA = asrgVar.d() ? asrgVar.b().c : asrd.a(aubqVarA);
        auhe auheVar = (auhe) auhfVar.toBuilder();
        auheVar.copyOnWrite();
        auhf auhfVar2 = (auhf) auheVar.instance;
        strA.getClass();
        auhfVar2.b |= 2;
        auhfVar2.f = strA;
        auheVar.copyOnWrite();
        auhf auhfVar3 = (auhf) auheVar.instance;
        aubqVar.getClass();
        auhfVar3.i = aubqVar;
        auhfVar3.b |= 16;
        auheVar.copyOnWrite();
        auhf auhfVar4 = (auhf) auheVar.instance;
        aubqVarA.getClass();
        auhfVar4.h = aubqVarA;
        auhfVar4.b |= 8;
        auhf auhfVar5 = (auhf) auheVar.build();
        final augv augvVar = (augv) augw.a.createBuilder();
        augvVar.copyOnWrite();
        augw augwVar = (augw) augvVar.instance;
        aubqVar.getClass();
        augwVar.c = aubqVar;
        augwVar.b |= 1;
        augvVar.copyOnWrite();
        augw augwVar2 = (augw) augvVar.instance;
        aubqVarA.getClass();
        augwVar2.d = aubqVarA;
        augwVar2.b |= 2;
        String strE = basd.e(basdVar);
        augvVar.copyOnWrite();
        augw augwVar3 = (augw) augvVar.instance;
        augwVar3.b |= 32;
        augwVar3.h = strE;
        augvVar.copyOnWrite();
        augw augwVar4 = (augw) augvVar.instance;
        strA.getClass();
        augwVar4.b |= 64;
        augwVar4.i = strA;
        augvVar.copyOnWrite();
        augw augwVar5 = (augw) augvVar.instance;
        aubtVar.getClass();
        augwVar5.k = aubtVar;
        augwVar5.b |= 256;
        augvVar.copyOnWrite();
        augw augwVar6 = (augw) augvVar.instance;
        eygaVar.getClass();
        augwVar6.j = eygaVar;
        augwVar6.b |= 128;
        evqs byteString = auhfVar5.toByteString();
        augvVar.copyOnWrite();
        augw augwVar7 = (augw) augvVar.instance;
        augwVar7.b |= 512;
        augwVar7.l = byteString;
        augvVar.copyOnWrite();
        augw augwVar8 = (augw) augvVar.instance;
        aufxVar.getClass();
        augwVar8.m = aufxVar;
        augwVar8.b |= 1024;
        if (asrgVar.d() && asrgVar.b) {
            aubq aubqVar2 = (aubq) asrgVar.c().get(0);
            augvVar.copyOnWrite();
            augw augwVar9 = (augw) augvVar.instance;
            aubqVar2.getClass();
            augwVar9.e = aubqVar2;
            augwVar9.b |= 4;
        }
        optionalEmpty.ifPresent(new Consumer() { // from class: cmni
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                augv augvVar2 = augvVar;
                auib auibVar2 = (auib) obj;
                augvVar2.copyOnWrite();
                augw augwVar10 = (augw) augvVar2.instance;
                augw augwVar11 = augw.a;
                auibVar2.getClass();
                augwVar10.n = auibVar2;
                augwVar10.b |= 2048;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((assc) this.g.b()).c(optionalEmpty, basdVar);
        eieu eieuVarK = eiiy.k("ChatApiSender::sendChatMessage::OutgoingChatApi::sendMessage");
        try {
            eiju eijuVarE = this.m.e((augw) augvVar.build());
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE.h(new ejvr() { // from class: cmms
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    augz augzVar = (augz) obj;
                    ((assc) this.a.g.b()).d(optionalEmpty, basdVar);
                    return augzVar;
                }
            }, this.c);
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju f(final MessageCoreData messageCoreData, final asrg asrgVar, cmpl cmplVar, final ejvr ejvrVar, aucl auclVar, final aufx aufxVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ChatApiSender::sendFileTransferDetails");
        try {
            if (auclVar == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.f, messageCoreData.F());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendFileTransferDetailsNotTraced", 815, "ChatApiSender.java")).q("Missing file upload result while attempting to send file transfer details");
                chve chveVarJ = chvf.j(3, 10003);
                chveVarJ.b(1);
                enxt enxtVar = (enxt) enxu.a.createBuilder();
                enxv enxvVar = (enxv) enxw.a.createBuilder();
                enxvVar.copyOnWrite();
                enxw enxwVar = (enxw) enxvVar.instance;
                enxwVar.e = 1;
                enxwVar.b = 4 | enxwVar.b;
                enxi enxiVar = enxi.CHAT_API_INVALID_FILE_UPLOAD_RESULT;
                enxvVar.copyOnWrite();
                enxw enxwVar2 = (enxw) enxvVar.instance;
                enxwVar2.f = enxiVar.D;
                enxwVar2.b |= 8;
                enxtVar.copyOnWrite();
                enxu enxuVar = (enxu) enxtVar.instance;
                enxw enxwVar3 = (enxw) enxvVar.build();
                enxwVar3.getClass();
                enxuVar.c = enxwVar3;
                enxuVar.b = 1 | enxuVar.b;
                ((chue) chveVarJ).d = (enxu) enxtVar.build();
                eijuVarE = eijx.e(chveVarJ.a());
            } else {
                final basd basdVarF = messageCoreData.F();
                auhe auheVar = (auhe) auhf.a.createBuilder();
                String strF = basdVarF.f();
                auheVar.copyOnWrite();
                auhf auhfVar = (auhf) auheVar.instance;
                auhfVar.b |= 1;
                auhfVar.e = strF;
                auha auhaVar = (auha) auhb.a.createBuilder();
                boolean zD = asrgVar.d();
                auhaVar.copyOnWrite();
                auhb auhbVar = (auhb) auhaVar.instance;
                auhbVar.b |= 2;
                auhbVar.d = zD;
                evvp evvpVarC = evxc.c(messageCoreData.r());
                auhaVar.copyOnWrite();
                auhb auhbVar2 = (auhb) auhaVar.instance;
                evvpVarC.getClass();
                auhbVar2.c = evvpVarC;
                auhbVar2.b = 1 | auhbVar2.b;
                auheVar.copyOnWrite();
                auhf auhfVar2 = (auhf) auheVar.instance;
                auhb auhbVar3 = (auhb) auhaVar.build();
                auhbVar3.getClass();
                auhfVar2.d = auhbVar3;
                auhfVar2.c = 4;
                auib auibVarA = a(messageCoreData);
                auheVar.copyOnWrite();
                auhf auhfVar3 = (auhf) auheVar.instance;
                auibVarA.getClass();
                auhfVar3.g = auibVarA;
                auhfVar3.b = 4 | auhfVar3.b;
                final auhf auhfVar4 = (auhf) auheVar.build();
                try {
                    eiju eijuVarB = cmplVar.b(auclVar, messageCoreData, asrgVar);
                    eooz eoozVar = new eooz() { // from class: cmnb
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            ejvr ejvrVar2 = ejvrVar;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            aubt aubtVar = (aubt) obj;
                            return this.a.c(messageCoreData2, messageCoreData2.F(), aubtVar, (eyga) ejvrVar2.apply(messageCoreData2), asrgVar, auhfVar4, aufxVar);
                        }
                    };
                    eosc eoscVar = this.c;
                    eijuVarE = eijuVarB.i(eoozVar, eoscVar).h(new cmnk(this), eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmnc
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return cmnp.k((IllegalArgumentException) obj, basdVarF, 3);
                        }
                    }, eoscVar);
                } catch (IllegalArgumentException e) {
                    eijuVarE = eijx.e(k(e, basdVarF, 3));
                }
            }
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    public final eiju g(final MessageCoreData messageCoreData, final asrg asrgVar, cmom cmomVar, final ejvr ejvrVar, final aufx aufxVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ChatApiSender::sendLocationInformationNotTraced");
        try {
            if (j(messageCoreData, cmomVar)) {
                final basd basdVarF = messageCoreData.F();
                auhe auheVar = (auhe) auhf.a.createBuilder();
                String strF = basdVarF.f();
                auheVar.copyOnWrite();
                auhf auhfVar = (auhf) auheVar.instance;
                auhfVar.b |= 1;
                auhfVar.e = strF;
                auhc auhcVar = (auhc) auhd.a.createBuilder();
                boolean zD = asrgVar.d();
                auhcVar.copyOnWrite();
                auhd auhdVar = (auhd) auhcVar.instance;
                auhdVar.b |= 2;
                auhdVar.d = zD;
                evvp evvpVarC = evxc.c(messageCoreData.r());
                auhcVar.copyOnWrite();
                auhd auhdVar2 = (auhd) auhcVar.instance;
                evvpVarC.getClass();
                auhdVar2.c = evvpVarC;
                auhdVar2.b |= 1;
                auheVar.copyOnWrite();
                auhf auhfVar2 = (auhf) auheVar.instance;
                auhd auhdVar3 = (auhd) auhcVar.build();
                auhdVar3.getClass();
                auhfVar2.d = auhdVar3;
                auhfVar2.c = 3;
                auib auibVarA = a(messageCoreData);
                auheVar.copyOnWrite();
                auhf auhfVar3 = (auhf) auheVar.instance;
                auibVarA.getClass();
                auhfVar3.g = auibVarA;
                auhfVar3.b |= 4;
                final auhf auhfVar4 = (auhf) auheVar.build();
                try {
                    eiju eijuVarA = cmomVar.a(messageCoreData, asrgVar);
                    eooz eoozVar = new eooz() { // from class: cmmz
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            ejvr ejvrVar2 = ejvrVar;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            aubt aubtVar = (aubt) obj;
                            return this.a.c(messageCoreData2, messageCoreData2.F(), aubtVar, (eyga) ejvrVar2.apply(messageCoreData2), asrgVar, auhfVar4, aufxVar);
                        }
                    };
                    eosc eoscVar = this.c;
                    eijuVarE = eijuVarA.i(eoozVar, eoscVar).h(new cmnk(this), eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmna
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return cmnp.k((IllegalArgumentException) obj, basdVarF, 2);
                        }
                    }, eoscVar);
                } catch (IllegalArgumentException e) {
                    eijuVarE = eijx.e(k(e, basdVarF, 2));
                }
            } else {
                eijuVarE = eijx.e(b);
            }
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    public final eiju h(final MessageCoreData messageCoreData, final asrg asrgVar, final auhk auhkVar, cmpo cmpoVar, final ejvr ejvrVar, final aufx aufxVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ChatApiSender::sendMessageReceipt");
        try {
            final basd basdVarF = messageCoreData.F();
            try {
                eiju eijuVarC = cmpoVar.c(auhkVar, messageCoreData, asrgVar);
                eooz eoozVar = new eooz() { // from class: cmne
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ejvr ejvrVar2 = ejvrVar;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        aubt aubtVar = (aubt) obj;
                        eyga eygaVar = (eyga) ejvrVar2.apply(messageCoreData2);
                        final cmnp cmnpVar = this.a;
                        basd basdVarA = cmnpVar.e.a();
                        ekrw ekrwVarH = cmnp.a.h();
                        ekrwVarH.X(eksq.a, "BugleRcs");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrz ekrzVar = cqnc.f;
                        final basd basdVar = basdVarF;
                        ekrdVar.X(ekrzVar, basdVar);
                        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 1050, "ChatApiSender.java");
                        String strF = basdVarA.f();
                        auhk auhkVar2 = auhkVar;
                        ekrdVar2.D("Generated new RCS Message ID %s for outgoing report type: %s", strF, auhkVar2.name());
                        boolean zEquals = Objects.equals(auhkVar2, auhk.DELIVERY);
                        asrg asrgVar2 = asrgVar;
                        aufx aufxVar2 = aufxVar;
                        if (zEquals) {
                            ((asrx) cmnpVar.f.b()).a(basdVar, basdVarA);
                        }
                        auhe auheVar = (auhe) auhf.a.createBuilder();
                        String strF2 = basdVarA.f();
                        auheVar.copyOnWrite();
                        auhf auhfVar = (auhf) auheVar.instance;
                        auhfVar.b |= 1;
                        auhfVar.e = strF2;
                        auhi auhiVar = (auhi) auhl.a.createBuilder();
                        String strF3 = basdVar.f();
                        auhiVar.copyOnWrite();
                        auhl auhlVar = (auhl) auhiVar.instance;
                        auhlVar.b |= 1;
                        auhlVar.c = strF3;
                        auhiVar.copyOnWrite();
                        auhl auhlVar2 = (auhl) auhiVar.instance;
                        auhlVar2.d = auhkVar2.e;
                        auhlVar2.b |= 2;
                        auheVar.copyOnWrite();
                        auhf auhfVar2 = (auhf) auheVar.instance;
                        auhl auhlVar3 = (auhl) auhiVar.build();
                        auhlVar3.getClass();
                        auhfVar2.d = auhlVar3;
                        auhfVar2.c = 5;
                        auib auibVar = (auib) cmnpVar.h.fM(cqdr.a());
                        auheVar.copyOnWrite();
                        auhf auhfVar3 = (auhf) auheVar.instance;
                        auibVar.getClass();
                        auhfVar3.g = auibVar;
                        auhfVar3.b |= 4;
                        cmnpVar.k.c(basdVar.f(), auibVar.c);
                        try {
                            eiju eijuVarC2 = cmnpVar.c(messageCoreData2, basdVarA, aubtVar, eygaVar, asrgVar2, (auhf) auheVar.build(), aufxVar2);
                            ejvr ejvrVar3 = new ejvr() { // from class: cmmx
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return cmnpVar.m((augz) obj2, 4);
                                }
                            };
                            eosc eoscVar = cmnpVar.c;
                            return eijuVarC2.h(ejvrVar3, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmmy
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return cmnp.l((IllegalArgumentException) obj2, basdVar, 4);
                                }
                            }, eoscVar);
                        } catch (IllegalArgumentException e) {
                            return eijx.e(cmnp.l(e, basdVar, 4));
                        }
                    }
                };
                eosc eoscVar = this.c;
                eijuVarE = eijuVarC.i(eoozVar, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmnf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cmnp.l((IllegalArgumentException) obj, basdVarF, 4);
                    }
                }, eoscVar);
            } catch (IllegalArgumentException e) {
                eijuVarE = eijx.e(l(e, basdVarF, 4));
            }
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    public final eiju i(final basd basdVar, asrg asrgVar, auhk auhkVar, Instant instant, cmpo cmpoVar, aufx aufxVar, aubq aubqVar, eyga eygaVar) {
        try {
            aubt aubtVarA = cmpoVar.a(auhkVar, basdVar, instant);
            basd basdVarA = this.e.a();
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleRcs");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.f, basdVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 1106, "ChatApiSender.java")).D("Generated new RCS Message ID %s for outgoing report type: %s", basdVarA.f(), auhkVar.name());
            if (auhk.DELIVERY.equals(auhkVar)) {
                ((asrx) this.f.b()).a(basdVar, basdVarA);
            }
            auhe auheVar = (auhe) auhf.a.createBuilder();
            String strF = basdVarA.f();
            auheVar.copyOnWrite();
            auhf auhfVar = (auhf) auheVar.instance;
            auhfVar.b |= 1;
            auhfVar.e = strF;
            auhi auhiVar = (auhi) auhl.a.createBuilder();
            String strF2 = basdVar.f();
            auhiVar.copyOnWrite();
            auhl auhlVar = (auhl) auhiVar.instance;
            auhlVar.b |= 1;
            auhlVar.c = strF2;
            auhiVar.copyOnWrite();
            auhl auhlVar2 = (auhl) auhiVar.instance;
            auhlVar2.d = auhkVar.e;
            auhlVar2.b |= 2;
            auheVar.copyOnWrite();
            auhf auhfVar2 = (auhf) auheVar.instance;
            auhl auhlVar3 = (auhl) auhiVar.build();
            auhlVar3.getClass();
            auhfVar2.d = auhlVar3;
            auhfVar2.c = 5;
            auib auibVar = (auib) this.h.fM(cqdr.a());
            auheVar.copyOnWrite();
            auhf auhfVar3 = (auhf) auheVar.instance;
            auibVar.getClass();
            auhfVar3.g = auibVar;
            auhfVar3.b |= 4;
            this.k.c(basdVar.f(), auibVar.c);
            try {
                eiju eijuVarE = e(basdVarA, aubtVarA, eygaVar, asrgVar, (auhf) auheVar.build(), aufxVar, aubqVar);
                ejvr ejvrVar = new ejvr() { // from class: cmmu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return this.a.m((augz) obj, 4);
                    }
                };
                eosc eoscVar = this.c;
                return eijuVarE.h(ejvrVar, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmmv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cmnp.l((IllegalArgumentException) obj, basdVar, 4);
                    }
                }, eoscVar);
            } catch (IllegalArgumentException e) {
                return eijx.e(l(e, basdVar, 4));
            }
        } catch (IllegalArgumentException e2) {
            return eijx.e(l(e2, basdVar, 4));
        }
    }

    public final chwo m(augz augzVar, int i) {
        chwo chwoVar = new chwo();
        elpg elpgVar = augzVar.h;
        if (elpgVar == null) {
            elpgVar = elpg.b;
        }
        enyw enywVarB = enyw.b(elpgVar.Y);
        if (enywVarB == null) {
            enywVarB = enyw.UNKNOWN_RCS_TYPE;
        }
        chwoVar.c = enywVarB;
        chwoVar.b = enxu.a;
        aubl aublVar = augzVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        int iOrdinal = aubkVarB.ordinal();
        if (iOrdinal == 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "responseToInvocationResultAndDiagnostics", 1302, "ChatApiSender.java");
            aubl aublVar2 = augzVar.c;
            if (aublVar2 == null) {
                aublVar2 = aubl.a;
            }
            aubk aubkVarB2 = aubk.b(aublVar2.c);
            if (aubkVarB2 == null) {
                aubkVarB2 = aubk.UNKNOWN_STATUS;
            }
            ekrdVar.D("Received unknown status: %s while sending message. MessageType=%s", aubkVarB2.name(), cmno.a(i));
        } else {
            if (iOrdinal == 1 || iOrdinal == 2) {
                chwoVar.a = true;
                return chwoVar;
            }
            if (iOrdinal != 3 && iOrdinal != 4) {
                return chwoVar;
            }
        }
        aubl aublVar3 = augzVar.c;
        if (aublVar3 == null) {
            aublVar3 = aubl.a;
        }
        chwoVar.b = q(aublVar3);
        chwoVar.a = false;
        return chwoVar;
    }

    public final eiju n(final MessageCoreData messageCoreData, eiju eijuVar, final asrg asrgVar, final ejvr ejvrVar, final aufx aufxVar, final basd basdVar, final auhf auhfVar, final int i) {
        eooz eoozVar = new eooz() { // from class: cmnj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejvr ejvrVar2 = ejvrVar;
                MessageCoreData messageCoreData2 = messageCoreData;
                aubt aubtVar = (aubt) obj;
                return this.a.c(messageCoreData2, messageCoreData2.F(), aubtVar, (eyga) ejvrVar2.apply(messageCoreData2), asrgVar, auhfVar, aufxVar);
            }
        };
        eosc eoscVar = this.c;
        return eijuVar.i(eoozVar, eoscVar).h(new cmnk(this), eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cmnl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cmnp.k((IllegalArgumentException) obj, basdVar, i);
            }
        }, eoscVar);
    }

    public final eiju o(MessageCoreData messageCoreData, asrg asrgVar, cmpn cmpnVar, ejvr ejvrVar, aufx aufxVar) {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ChatApiSender::sendBasicText");
        try {
            if (p(messageCoreData)) {
                basd basdVarF = messageCoreData.F();
                auhe auheVar = (auhe) auhf.a.createBuilder();
                String strF = basdVarF.f();
                auheVar.copyOnWrite();
                auhf auhfVar = (auhf) auheVar.instance;
                auhfVar.b |= 1;
                auhfVar.e = strF;
                augt augtVar = (augt) augu.a.createBuilder();
                boolean zD = asrgVar.d();
                augtVar.copyOnWrite();
                augu auguVar = (augu) augtVar.instance;
                auguVar.b |= 2;
                auguVar.d = zD;
                evvp evvpVarC = evxc.c(messageCoreData.r());
                augtVar.copyOnWrite();
                augu auguVar2 = (augu) augtVar.instance;
                evvpVarC.getClass();
                auguVar2.c = evvpVarC;
                auguVar2.b |= 1;
                auheVar.copyOnWrite();
                auhf auhfVar2 = (auhf) auheVar.instance;
                augu auguVar3 = (augu) augtVar.build();
                auguVar3.getClass();
                auhfVar2.d = auguVar3;
                auhfVar2.c = 2;
                auib auibVarA = a(messageCoreData);
                auheVar.copyOnWrite();
                auhf auhfVar3 = (auhf) auheVar.instance;
                auibVarA.getClass();
                auhfVar3.g = auibVarA;
                auhfVar3.b |= 4;
                try {
                    eijuVarE = n(messageCoreData, cmpnVar.d(messageCoreData, asrgVar), asrgVar, ejvrVar, aufxVar, basdVarF, (auhf) auheVar.build(), 1);
                } catch (IllegalArgumentException e) {
                    eijuVarE = eijx.e(k(e, basdVarF, 1));
                }
            } else {
                eijuVarE = eijx.e(b);
            }
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }
}
