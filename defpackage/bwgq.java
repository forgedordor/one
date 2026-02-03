package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.HandleReceiptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.RecreateFtdSessionResult;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgq extends cayv {
    private final Context a;
    private final bwgg b;
    private final fcsu c;
    private final cgbn d;
    private final fcsu e;

    public bwgq(Context context, bwgg bwggVar, fcsu fcsuVar, cgbn cgbnVar, fcsu fcsuVar2) {
        this.a = context;
        this.b = bwggVar;
        this.c = fcsuVar;
        this.d = cgbnVar;
        this.e = fcsuVar2;
    }

    private final aubq k(String str) {
        cczv cczvVar = alvx.a;
        if (((Boolean) new alvv().get()).booleanValue()) {
            return ((asqx) this.e.b()).a(str, false);
        }
        return null;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(5);
        caxzVarL.f(pza.b);
        caxzVarL.g(60000L);
        caxzVarL.b(caze.FOREGROUND_SERVICE);
        ((caxk) caxzVarL).b = this.d.c(this.a.getString(R.string.ftd_handler_notification_text));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("FtdHandlerWorkItem");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ewti.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ewti ewtiVar = (ewti) evuhVar;
        if (bwbv.e()) {
            final bwgp bwgpVar = (bwgp) this.c.b();
            eyfr eyfrVar = ewtiVar.c;
            if (eyfrVar == null) {
                eyfrVar = eyfr.a;
            }
            final aubq aubqVarK = k(ewtiVar.d);
            final aubq aubqVarK2 = k(ewtiVar.e);
            final String str = ewtiVar.d;
            final String str2 = ewtiVar.e;
            final String str3 = eyfrVar.d;
            try {
                final ReceiptInfo receiptInfoA = bwjh.a(eyfrVar.c);
                cqce cqceVar = bwgp.a;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Received SIGNAL_FTD");
                cqbdVarC.A("remoteRegistrationId", cqcv.b(str3));
                cqbdVarC.A("rcsMessageId", receiptInfoA.getMessageId());
                cqbdVarC.A("reason", receiptInfoA.getError());
                cqbdVarC.r();
                if (bwbv.g() && receiptInfoA.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                    cqceVar.p("FTD is due to OTK not meant for me. Ignore it.");
                    ((ains) bwgpVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 19);
                    return eijx.e(cbcw.i());
                }
                bwgpVar.n.b();
                final Scope scopeCreate = Scope.create(bwgpVar.e.b());
                eiju eijuVarI = ((bwbn) bwgpVar.d.b()).b(bwgp.a(aubqVarK, str)).i(new eooz() { // from class: bwgk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eiju eijuVarH;
                        aubq aubqVar = aubqVarK;
                        final bwgp bwgpVar2 = bwgpVar;
                        bwla bwlaVar = bwgpVar2.c;
                        String str4 = str;
                        final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                        final Instant instantF = bwgpVar2.f.f();
                        bwkz bwkzVarA = bwlaVar.a(bwgp.a(aubqVar, str4));
                        final aubq aubqVar2 = aubqVarK2;
                        final String str5 = str2;
                        String strA = bwgp.a(aubqVar2, str5);
                        final String str6 = str3;
                        UserDevice userDevice = new UserDevice(strA, str6);
                        final Scope scope = scopeCreate;
                        final ReceiptInfo receiptInfo = receiptInfoA;
                        if (((HandleReceiptResult) bwlb.a(nativeMessageEncryptorV2.handleReceiptV2(scope, userDevice, receiptInfo))).getReceiptIsVerifiedFtd()) {
                            eijuVarH = eiju.g(bwkzVarA.c(ekjz.c(new UserDevices(bwgp.a(aubqVar2, str5), ekjz.c(str6))))).h(new ejvr() { // from class: bwgj
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return new bwas(!((RecreateFtdSessionResult) bwlb.a(nativeMessageEncryptorV2.recreateFtdSession(scope, r4, receiptInfo))).getCanReencryptMessageId().isEmpty(), Optional.of(evqs.x(((PrekeyBundle) ekis.l((Iterable) bwlb.a((StatusOr) obj2))).getIdentityKey())));
                                }
                            }, bwgpVar2.k);
                        } else {
                            ((ains) bwgpVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                            eijuVarH = eijx.d(new fbtf(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                        }
                        return eijuVarH.h(new ejvr() { // from class: bwgn
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                bwgo bwgoVar = (bwgo) obj2;
                                if (!bwgoVar.b()) {
                                    bwgp.a.r("SIGNAL_FTD FTD was processed but was not successful.");
                                    return cbcw.i();
                                }
                                final String str7 = str6;
                                final String str8 = str5;
                                final aubq aubqVar3 = aubqVar2;
                                final bwgp bwgpVar3 = bwgpVar2;
                                if (bwgoVar.a().isEmpty()) {
                                    cqbd cqbdVarE = bwgp.a.e();
                                    cqbdVarE.I("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
                                    cqbdVarE.A("remoteUserId", cqcv.b(bwgp.a(aubqVar3, str8)));
                                    cqbdVarE.A("remoteRegistrationId", cqcv.b(str7));
                                    cqbdVarE.r();
                                } else {
                                    bwgpVar3.j.d(aubqVar3, str8, str7, (evqs) bwgoVar.a().get(), instantF);
                                }
                                basd basdVarA = basd.a(receiptInfo.getMessageId());
                                final MessageCoreData messageCoreDataX = ((baxe) bwgpVar3.i.b()).x(basdVarA);
                                if (messageCoreDataX == null) {
                                    cqbd cqbdVarE2 = bwgp.a.e();
                                    cqbdVarE2.I("Message not found");
                                    cqbdVarE2.h(basdVarA);
                                    cqbdVarE2.r();
                                    ((ains) bwgpVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                } else {
                                    bwgpVar3.m.d("copyMessageAsANewHiddenOne", new Runnable() { // from class: bwgi
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final MessageCoreData messageCoreData = messageCoreDataX;
                                            MessagesTable.BindData bindDataB = MessagesTable.b(messageCoreData.C());
                                            bwgp bwgpVar4 = bwgpVar3;
                                            if (bindDataB == null) {
                                                ((ains) bwgpVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                                cqbd cqbdVarE3 = bwgp.a.e();
                                                cqbdVarE3.I("Message did not exist. FTD can't be handled.");
                                                cqbdVarE3.h(messageCoreData.F());
                                                cqbdVarE3.r();
                                                return;
                                            }
                                            bajf bajfVarA = ((axgh) bwgpVar4.g.b()).a(messageCoreData.A());
                                            if (bajfVarA == null) {
                                                ((ains) bwgpVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                                                cqbd cqbdVarE4 = bwgp.a.e();
                                                cqbdVarE4.I("Conversation does not exist. FTD can't be handled.");
                                                cqbdVarE4.h(messageCoreData.F());
                                                cqbdVarE4.c(messageCoreData.A());
                                                cqbdVarE4.r();
                                                return;
                                            }
                                            cogw cogwVar = bwgpVar4.f;
                                            if (cogwVar.f().toEpochMilli() - bindDataB.x() >= ((Long) bvur.c.e()).longValue()) {
                                                ((ains) bwgpVar4.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                                                ekrw ekrwVarJ = bwgp.b.j();
                                                ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
                                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandlerV2", "copyMessageAsANewHiddenOne", 441, "FtdHandlerV2.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.F().f(), messageCoreData.A().a());
                                                return;
                                            }
                                            bquu bquuVarK = bindDataB.K();
                                            if (bajfVarA.E() == 2) {
                                                String str9 = str8;
                                                aubq aubqVar4 = aubqVar3;
                                                fcsu fcsuVar = bwgpVar4.h;
                                                String strA2 = bwgp.a(aubqVar4, str9);
                                                String strM = ((bbca) fcsuVar.b()).m(strA2);
                                                if (TextUtils.isEmpty(strM)) {
                                                    cqbd cqbdVarE5 = bwgp.a.e();
                                                    cqbdVarE5.I("Participant is missing for a message.");
                                                    cqbdVarE5.h(messageCoreData.F());
                                                    cqbdVarE5.c(messageCoreData.A());
                                                    cqbdVarE5.M("remoteUserIdFtdSender", strA2);
                                                    cqbdVarE5.r();
                                                    return;
                                                }
                                                bquuVarK.u(strM);
                                                if (bwbv.e()) {
                                                    basd basdVarF = messageCoreData.F();
                                                    cqce cqceVar2 = bwmz.a;
                                                    cqbd cqbdVarC2 = cqceVar2.c();
                                                    cqbdVarC2.I("Add custom headers");
                                                    cqbdVarC2.h(basdVarF);
                                                    cqbdVarC2.r();
                                                    if (!basdVarF.i()) {
                                                        String str10 = str7;
                                                        civc civcVarA = civc.a();
                                                        civa civaVar = civa.ETOUFFEE_NAMESPACE;
                                                        civcVarA.e(civaVar, "recipient", strA2);
                                                        civcVarA.e(civaVar, "registration", str10);
                                                        if (bquuVarK.R.i()) {
                                                            cqceVar2.m("Set original RCS message Id");
                                                            bquuVarK.L(basdVarF);
                                                        }
                                                        if (!bquuVarK.R.equals(messageCoreData.E())) {
                                                            throw new IllegalStateException("RCS message Ids do not match.");
                                                        }
                                                        bquuVarK.q(civcVarA.c());
                                                    }
                                                } else {
                                                    bwgp.a.p("Does not add custom headers.");
                                                }
                                            }
                                            bquuVarK.j(null);
                                            bquuVarK.i(null);
                                            bquuVarK.r(Optional.empty());
                                            bquuVarK.af(baro.a);
                                            bquuVarK.x(Optional.of(UUID.randomUUID()));
                                            bquuVarK.W(bwgpVar4.p.a());
                                            bquuVarK.aq(4);
                                            bquuVarK.V(-1L);
                                            bquuVarK.w(true);
                                            bquuVarK.ah(messageCoreData.q() + 1);
                                            bquuVarK.J(messageCoreData.D().c() ? messageCoreData.C() : messageCoreData.D());
                                            bquuVarK.ae(cogwVar.f().toEpochMilli());
                                            MessagesTable.BindData bindDataC = bquuVarK.c();
                                            bsje bsjeVarC = PartsTable.c();
                                            bsjeVarC.A("copyMessageAsANewHiddenOne-parts");
                                            bsjeVarC.h(new Function() { // from class: bwgh
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    bsjl bsjlVar = (bsjl) obj3;
                                                    bsjlVar.n(messageCoreData.C());
                                                    return bsjlVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                                            while (bsgtVar.moveToNext()) {
                                                try {
                                                    bscl bsclVarX = ((PartsTable.BindData) bsgtVar.cQ()).x();
                                                    bsclVarX.J(bindDataC.E());
                                                    bsclVarX.d();
                                                } catch (Throwable th) {
                                                    try {
                                                        bsgtVar.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            }
                                            bsgtVar.close();
                                        }
                                    });
                                    ((ains) bwgpVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
                                    bwgpVar3.l.a().z();
                                }
                                return cbcw.i();
                            }
                        }, bwgpVar2.k);
                    }
                }, bwgpVar.k);
                ejvr ejvrVar = new ejvr() { // from class: bwgl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        fbtf fbtfVar = (fbtf) obj;
                        bwgp.a.s("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", fbtfVar);
                        ((ains) bwgpVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                        Status status = fbtfVar.a;
                        if (status != null) {
                            Status.Code code = Status.Code.OK;
                            int iOrdinal = status.getCode().ordinal();
                            if (iOrdinal == 1 || iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 10 || iOrdinal == 13 || iOrdinal == 14) {
                                return cbcw.m();
                            }
                        }
                        return cbcw.k();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarI.e(fbtf.class, ejvrVar, eoqgVar).e(bwlo.class, new ejvr() { // from class: bwgm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        bwgp.a.r("Skipped processing an FTD because Etouffee is not provisioned.");
                        ((ains) bwgpVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                        return cbcw.k();
                    }
                }, eoqgVar);
            } catch (evtj e) {
                ((ains) bwgpVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
                cqbd cqbdVarE = bwgp.a.e();
                cqbdVarE.I("Received SIGNAL_FTD, Error while processing proto.");
                cqbdVarE.M("remoteRegistrationId", str3);
                cqbdVarE.s(e);
                return eijx.e(cbcw.k());
            }
        }
        final bwgg bwggVar = this.b;
        eyfr eyfrVar2 = ewtiVar.c;
        if (eyfrVar2 == null) {
            eyfrVar2 = eyfr.a;
        }
        aubq aubqVarK3 = k(ewtiVar.d);
        final aubq aubqVarK4 = k(ewtiVar.e);
        String str4 = ewtiVar.d;
        final String str5 = ewtiVar.e;
        final String str6 = eyfrVar2.d;
        try {
            final ReceiptInfo receiptInfoA2 = bwjh.a(eyfrVar2.c);
            cqce cqceVar2 = bwgg.a;
            cqbd cqbdVarC2 = cqceVar2.c();
            cqbdVarC2.I("Received SIGNAL_FTD");
            cqbdVarC2.A("remoteRegistrationId", cqcv.b(str6));
            cqbdVarC2.A("rcsMessageId", receiptInfoA2.getMessageId());
            cqbdVarC2.r();
            if (bwbv.g() && receiptInfoA2.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                cqceVar2.p("FTD is due to OTK not meant for me. Ignore it.");
                return eijx.e(cbcw.i());
            }
            cogw cogwVar = bwggVar.f;
            bwla bwlaVar = bwggVar.c;
            final Instant instantF = cogwVar.f();
            final bwkz bwkzVarA = bwlaVar.a(bwgg.a(aubqVarK3, str4));
            bwggVar.n.b();
            final Scope scopeCreate2 = Scope.create(bwggVar.e.b());
            final eiju eijuVarB = ((bwbn) bwggVar.d.b()).b(bwgg.a(aubqVarK3, str4));
            eooz eoozVar = new eooz() { // from class: bwgd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    aubq aubqVar = aubqVarK4;
                    String str7 = str5;
                    String strA = bwgg.a(aubqVar, str7);
                    String str8 = str6;
                    if (((HandleReceiptResult) bwlb.a(((NativeMessageEncryptorV2) obj).handleReceipt(scopeCreate2, new UserDevice(strA, str8), receiptInfoA2))).getReceiptIsVerifiedFtd()) {
                        return bwkzVarA.c(ekjz.c(new UserDevices(bwgg.a(aubqVar, str7), ekjz.c(str8))));
                    }
                    ((ains) bwggVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                    return eijx.d(new fbtf(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                }
            };
            eosc eoscVar = bwggVar.k;
            final eiju eijuVarI2 = eijuVarB.i(eoozVar, eoscVar);
            eiju eijuVarH = eijx.m(eijuVarI2, eijuVarB).a(new Callable() { // from class: bwge
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) eork.q(eijuVarB);
                    return new bwat(!((RecreateFtdSessionResult) bwlb.a(nativeMessageEncryptorV2.recreateFtdSession(scopeCreate2, r1, receiptInfoA2))).getCanReencryptMessageId().isEmpty(), Optional.of(evqs.x(((PrekeyBundle) ekis.l((Iterable) bwlb.a((StatusOr) eork.q(eijuVarI2)))).getIdentityKey())));
                }
            }, eoscVar).h(new ejvr() { // from class: bwga
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bwgf bwgfVar = (bwgf) obj;
                    if (!bwgfVar.b()) {
                        bwgg.a.r("SIGNAL_FTD FTD was processed but was not successful.");
                        return cbcw.i();
                    }
                    String str7 = str6;
                    final String str8 = str5;
                    final aubq aubqVar = aubqVarK4;
                    final bwgg bwggVar2 = bwggVar;
                    if (bwgfVar.a().isEmpty()) {
                        cqbd cqbdVarE2 = bwgg.a.e();
                        cqbdVarE2.I("FTD handler did not provide a new identity. It's an FTD from an existing identity.");
                        cqbdVarE2.A("remoteUserId", cqcv.b(bwgg.a(aubqVar, str8)));
                        cqbdVarE2.A("remoteRegistrationId", cqcv.b(str7));
                        cqbdVarE2.r();
                    } else {
                        bwggVar2.j.d(aubqVar, str8, str7, (evqs) bwgfVar.a().get(), instantF);
                    }
                    basd basdVarA = basd.a(receiptInfoA2.getMessageId());
                    final MessageCoreData messageCoreDataX = ((baxe) bwggVar2.i.b()).x(basdVarA);
                    if (messageCoreDataX == null) {
                        cqbd cqbdVarE3 = bwgg.a.e();
                        cqbdVarE3.I("Message not found");
                        cqbdVarE3.h(basdVarA);
                        cqbdVarE3.r();
                        ((ains) bwggVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                    } else {
                        bwggVar2.m.d("copyMessageAsANewHiddenOne", new Runnable() { // from class: bwfz
                            @Override // java.lang.Runnable
                            public final void run() {
                                final MessageCoreData messageCoreData = messageCoreDataX;
                                MessagesTable.BindData bindDataB = MessagesTable.b(messageCoreData.C());
                                bwgg bwggVar3 = bwggVar2;
                                if (bindDataB == null) {
                                    ((ains) bwggVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 14);
                                    cqbd cqbdVarE4 = bwgg.a.e();
                                    cqbdVarE4.I("Message did not exist. FTD can't be handled.");
                                    cqbdVarE4.h(messageCoreData.F());
                                    cqbdVarE4.r();
                                    return;
                                }
                                bajf bajfVarA = ((axgh) bwggVar3.g.b()).a(messageCoreData.A());
                                if (bajfVarA == null) {
                                    ((ains) bwggVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 15);
                                    cqbd cqbdVarE5 = bwgg.a.e();
                                    cqbdVarE5.I("Conversation does not exist. FTD can't be handled.");
                                    cqbdVarE5.h(messageCoreData.F());
                                    cqbdVarE5.c(messageCoreData.A());
                                    cqbdVarE5.r();
                                    return;
                                }
                                cogw cogwVar2 = bwggVar3.f;
                                if (cogwVar2.f().toEpochMilli() - bindDataB.x() >= ((Long) bvur.c.e()).longValue()) {
                                    ((ains) bwggVar3.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 20);
                                    ekrw ekrwVarJ = bwgg.b.j();
                                    ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
                                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/FtdHandler", "copyMessageAsANewHiddenOne", 415, "FtdHandler.java")).D("FTD ignored because the original message is old. RCS messageId: %s, conversationId: %s", messageCoreData.F().f(), messageCoreData.A().a());
                                    return;
                                }
                                bquu bquuVarK = bindDataB.K();
                                if (bajfVarA.E() == 2) {
                                    String str9 = str8;
                                    aubq aubqVar2 = aubqVar;
                                    fcsu fcsuVar = bwggVar3.h;
                                    String strA = bwgg.a(aubqVar2, str9);
                                    String strM = ((bbca) fcsuVar.b()).m(strA);
                                    if (TextUtils.isEmpty(strM)) {
                                        cqbd cqbdVarE6 = bwgg.a.e();
                                        cqbdVarE6.I("Participant is missing for a message.");
                                        cqbdVarE6.h(messageCoreData.F());
                                        cqbdVarE6.c(messageCoreData.A());
                                        cqbdVarE6.M("remoteUserIdFtdSender", strA);
                                        cqbdVarE6.r();
                                        return;
                                    }
                                    bquuVarK.u(strM);
                                    if (bwbv.d()) {
                                        basd basdVarF = messageCoreData.F();
                                        cqbd cqbdVarC3 = bwmz.a.c();
                                        cqbdVarC3.I("Add custom headers");
                                        cqbdVarC3.h(basdVarF);
                                        cqbdVarC3.r();
                                        if (!basdVarF.i()) {
                                            String str10 = basdVarF.b;
                                            civc civcVarA = civc.a();
                                            civa civaVar = civa.ETOUFFEE_NAMESPACE;
                                            str10.getClass();
                                            civcVarA.e(civaVar, "original-message-id", str10);
                                            civcVarA.e(civaVar, "recipient", strA);
                                            bquuVarK.q(civcVarA.c());
                                        }
                                    } else {
                                        bwgg.a.p("Does not add custom headers.");
                                    }
                                }
                                bquuVarK.j(null);
                                bquuVarK.i(null);
                                bquuVarK.r(Optional.empty());
                                bquuVarK.af(baro.a);
                                bquuVarK.x(Optional.of(UUID.randomUUID()));
                                bquuVarK.W(bwggVar3.p.a());
                                bquuVarK.aq(4);
                                bquuVarK.V(-1L);
                                bquuVarK.w(true);
                                bquuVarK.ah(messageCoreData.q() + 1);
                                bquuVarK.J(messageCoreData.D().c() ? messageCoreData.C() : messageCoreData.D());
                                bquuVarK.ae(cogwVar2.f().toEpochMilli());
                                MessagesTable.BindData bindDataC = bquuVarK.c();
                                bsje bsjeVarC = PartsTable.c();
                                bsjeVarC.A("copyMessageAsANewHiddenOne");
                                bsjeVarC.h(new Function() { // from class: bwfy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bsjl bsjlVar = (bsjl) obj2;
                                        bsjlVar.n(messageCoreData.C());
                                        return bsjlVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                                while (bsgtVar.moveToNext()) {
                                    try {
                                        bscl bsclVarX = ((PartsTable.BindData) bsgtVar.cQ()).x();
                                        bsclVarX.J(bindDataC.E());
                                        bsclVarX.b(new Supplier() { // from class: bsci
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return new bsch();
                                            }
                                        }).B();
                                    } catch (Throwable th) {
                                        try {
                                            bsgtVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                bsgtVar.close();
                            }
                        });
                        ((ains) bwggVar2.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 3);
                        bwggVar2.l.a().z();
                    }
                    return cbcw.i();
                }
            }, eoscVar);
            ejvr ejvrVar2 = new ejvr() { // from class: bwgb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    fbtf fbtfVar = (fbtf) obj;
                    bwgg.a.s("Failed to process SIGNAL_FAILURE: ProcessDeliverReceipt failed.", fbtfVar);
                    ((ains) bwggVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 17);
                    Status status = fbtfVar.a;
                    if (status != null) {
                        Status.Code code = Status.Code.OK;
                        int iOrdinal = status.getCode().ordinal();
                        if (iOrdinal == 1 || iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 10 || iOrdinal == 13 || iOrdinal == 14) {
                            return cbcw.m();
                        }
                    }
                    return cbcw.k();
                }
            };
            eoqg eoqgVar2 = eoqg.a;
            return eijuVarH.e(fbtf.class, ejvrVar2, eoqgVar2).e(bwlo.class, new ejvr() { // from class: bwgc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bwgg.a.r("Skipped processing an FTD because Etouffee is not provisioned.");
                    ((ains) bwggVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 13);
                    return cbcw.k();
                }
            }, eoqgVar2);
        } catch (evtj e2) {
            ((ains) bwggVar.o.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
            cqbd cqbdVarE2 = bwgg.a.e();
            cqbdVarE2.I("Received SIGNAL_FTD, Error while processing proto.");
            cqbdVarE2.M("remoteRegistrationId", str6);
            cqbdVarE2.s(e2);
            return eijx.e(cbcw.k());
        }
    }
}
