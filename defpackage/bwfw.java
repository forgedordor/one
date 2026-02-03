package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfw implements atyq, cbty {
    public static final eksp a = eksp.c("BugleDataModel");
    public final atak b;
    public final bwip c;
    public final bwiq d;
    public final atzx e;
    public final bvur f;
    public final ains g;
    public final fcsu h;
    public final fcsu i;
    public final eosc j;
    public final eosc k;
    public final fcsu l;

    public bwfw(atak atakVar, bwip bwipVar, bwiq bwiqVar, atzx atzxVar, bvur bvurVar, ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3) {
        this.b = atakVar;
        this.c = bwipVar;
        this.d = bwiqVar;
        this.e = atzxVar;
        this.f = bvurVar;
        this.g = ainsVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = eoscVar;
        this.k = eoscVar2;
        this.l = fcsuVar3;
    }

    @Override // defpackage.atyq
    public final eiju a(final atys atysVar) {
        eieu eieuVarK = eiiy.k("EncryptedSinglePartIncomingChatMessageProcessor::process");
        try {
            aufh aufhVar = ((atuy) atysVar).a;
            ejwl.a((aufhVar.c & 64) != 0);
            final aubq aubqVar = aufhVar.h;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            eooy eooyVar = new eooy() { // from class: bwfs
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return ((bvut) this.a.i.b()).e(aubqVar.d);
                }
            };
            eosc eoscVar = this.k;
            eiju eijuVarI = eijx.h(eooyVar, eoscVar).i(new eooz() { // from class: bwft
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    efnd efndVar;
                    eiju eijuVarE;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final bwfw bwfwVar = this.a;
                    final atys atysVar2 = atysVar;
                    final efnd efndVar2 = (efnd) bwfwVar.b.fH().fM(atysVar2.e());
                    atuy atuyVar = (atuy) atysVar2;
                    aufh aufhVar2 = atuyVar.a;
                    basd basdVarA = basd.a(aufhVar2.j);
                    eksp ekspVar = bwfw.a;
                    eksl ekslVar = (eksl) ekspVar.h();
                    ekslVar.X(cqnc.f, basdVarA);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 142, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).t("Processing incoming message with contentType: %s.", efndVar2.a().c());
                    boolean z = bwbt.c() && zBooleanValue;
                    aubp aubpVar = aubp.GROUP;
                    aubq aubqVar2 = aufhVar2.f;
                    if (aubqVar2 == null) {
                        aubqVar2 = aubq.a;
                    }
                    aubp aubpVarB = aubp.b(aubqVar2.c);
                    if (aubpVarB == null) {
                        aubpVarB = aubp.UNKNOWN_TYPE;
                    }
                    boolean zEquals = aubpVar.equals(aubpVarB);
                    boolean zG = bwbv.g();
                    if (!z || (!(zG && zEquals) && zEquals)) {
                        efndVar = efndVar2;
                    } else {
                        ains ainsVar = bwfwVar.g;
                        ContentType contentTypeA = efndVar2.a();
                        int i = dfqb.g.g(contentTypeA) ? 2 : dfqb.i.g(contentTypeA) ? 4 : dfqb.h.g(contentTypeA) ? 3 : 1;
                        if (i != 1) {
                            ainsVar.e("Bugle.Etouffee.Encryption.LegacyE2eeContentTypesUsage", i - 1);
                        }
                        if (dfqb.c(efndVar2.a())) {
                            if (zEquals) {
                                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 154, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Received an unexpected FTD in a group.");
                                ((bwey) bwfwVar.h.b()).c(basdVarA, 46);
                                return eijx.e(atav.FAIL_NO_RETRY);
                            }
                            ainsVar.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 2);
                            ejwl.a((aufhVar2.c & 64) != 0);
                            final aubq aubqVar3 = aufhVar2.h;
                            if (aubqVar3 == null) {
                                aubqVar3 = aubq.a;
                            }
                            String str = aubqVar3.d;
                            int length = str.length();
                            int iCharCount = 0;
                            while (iCharCount < length) {
                                int iCodePointAt = str.codePointAt(iCharCount);
                                if (!Character.isWhitespace(iCodePointAt)) {
                                    cmoi cmoiVar = (cmoi) bwfwVar.l.b();
                                    eosc eoscVar2 = bwfwVar.j;
                                    eooz eoozVar = new eooz() { // from class: bwfu
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            final bwfw bwfwVar2 = bwfwVar;
                                            final atys atysVar3 = atysVar2;
                                            final efnd efndVar3 = efndVar2;
                                            final aubq aubqVar4 = aubqVar3;
                                            return eijx.g(new Callable() { // from class: bwfv
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    efnd efndVar4 = efndVar3;
                                                    String strD = efndVar4.b().D(StandardCharsets.US_ASCII);
                                                    String string = efndVar4.a().toString();
                                                    aufh aufhVar3 = ((atuy) atysVar3).a;
                                                    aubq aubqVar5 = aufhVar3.d;
                                                    bwiq bwiqVar = bwfwVar2.d;
                                                    aubq aubqVar6 = aubqVar4;
                                                    if (aubqVar5 == null) {
                                                        aubqVar5 = aubq.a;
                                                    }
                                                    boolean zA = false;
                                                    if (dfqb.d(string)) {
                                                        try {
                                                            eyfr eyfrVarA = bwir.a(strD);
                                                            if (eyfrVarA.d.isEmpty()) {
                                                                ((ains) bwiqVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 8);
                                                                throw new IllegalStateException("Empty senderDeviceIds retrieved while decrypting");
                                                            }
                                                            try {
                                                                basd basdVarA2 = basd.a(bwjh.a(eyfrVarA.c).getMessageId());
                                                                bwey bweyVar = bwiqVar.c;
                                                                if (bweyVar.c.a()) {
                                                                    ((cbqh) bweyVar.b.b()).c(basdVarA2, basd.a, 10, 3, 1);
                                                                } else {
                                                                    bweyVar.f(basdVarA2, basd.a, 10, 3, 1);
                                                                }
                                                                zA = bwiqVar.a(eyfrVarA, basdVarA2, aubqVar5, aubqVar6);
                                                            } catch (evtj e) {
                                                                ((ains) bwiqVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 9);
                                                                bwiq.a.o("Invalid receipt message", e);
                                                            }
                                                        } catch (evtj e2) {
                                                            ((ains) bwiqVar.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 7);
                                                            cqbd cqbdVarE = bwiq.a.e();
                                                            cqbdVarE.I("Failed to parse the MessageEnvelope.");
                                                            cqbdVarE.A("errorMessage", e2.getMessage());
                                                            cqbdVarE.r();
                                                            throw new IllegalArgumentException(e2);
                                                        }
                                                    }
                                                    basd basdVarA3 = basd.a(aufhVar3.j);
                                                    String str2 = aufhVar3.k;
                                                    if (zA) {
                                                        eksl ekslVar2 = (eksl) bwfw.a.h();
                                                        ekslVar2.X(cqnc.f, basdVarA3);
                                                        ekslVar2.X(cqnc.s, barn.b(str2));
                                                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 305, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message has been scheduled for resending. (The RCS message ID included with this log is for the FTD receipt.)");
                                                        return atav.SUCCESS;
                                                    }
                                                    eksl ekslVar3 = (eksl) bwfw.a.j();
                                                    ekslVar3.X(cqnc.f, basdVarA3);
                                                    ekslVar3.X(cqnc.s, barn.b(str2));
                                                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 316, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message will not be resent. (The RCS message ID included with this log is for the FTD receipt.)");
                                                    return atav.FAIL_NO_RETRY;
                                                }
                                            }, bwfwVar2.j);
                                        }
                                    };
                                    eoscVar2.getClass();
                                    return cmoiVar.b(basdVarA).i(eoozVar, eoscVar2);
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                            ainsVar.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 4);
                            return eijx.e(atav.FAIL_RETRY);
                        }
                        if (dfqb.a(efndVar2.a())) {
                            final bwip bwipVar = bwfwVar.c;
                            aubx aubxVar = atysVar2.e().c;
                            if (aubxVar == null) {
                                aubxVar = aubx.a;
                            }
                            atal atalVar = bwipVar.d;
                            if (!dfqb.a((ContentType) atalVar.fM(aubxVar))) {
                                cqbd cqbdVarE = bwip.a.e();
                                cqbdVarE.I("Ignoring an incoming message with unexpected MIME type");
                                cqbdVarE.h(basd.a(aufhVar2.j));
                                aubx aubxVar2 = atysVar2.e().c;
                                if (aubxVar2 == null) {
                                    aubxVar2 = aubx.a;
                                }
                                cqbdVarE.A("contentType", atalVar.fM(aubxVar2));
                                cqbdVarE.r();
                                return eijx.e(atav.FAIL_NO_RETRY);
                            }
                            if (!bwipVar.j(aufhVar2)) {
                                ekrd ekrdVarK = bwip.a.k();
                                ekrdVarK.X(cqnc.e, aufhVar2.j);
                                ((ekrd) ekrdVarK.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IncomingEncryptedMessageProcessor", "processFullyEncryptedMessage", 204, "IncomingEncryptedMessageProcessor.java")).q("Skipping processing message because missing required group or destination token.");
                                return eijx.e(atav.FAIL_NO_RETRY);
                            }
                            eiju eijuVarD = bwip.d(aufhVar2);
                            eooz eoozVar2 = new eooz() { // from class: bwhn
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return ((bwbn) bwipVar.b.b()).b((String) obj2);
                                }
                            };
                            eosc eoscVar3 = bwipVar.k;
                            final eiju eijuVarI2 = eijuVarD.i(eoozVar2, eoscVar3);
                            return eijuVarI2.i(new eooz() { // from class: bwho
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final bwip bwipVar2 = bwipVar;
                                    final atys atysVar3 = atysVar2;
                                    final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj2;
                                    eieu eieuVarK2 = eiiy.k("IncomingEncryptedMessageProcessor::decryptChatMessage");
                                    try {
                                        final chxo chxoVarB = bwipVar2.b(atysVar3);
                                        eiju eijuVarD2 = bwip.d(((atuy) atysVar3).a);
                                        final bwln bwlnVar = bwipVar2.c;
                                        bwlnVar.getClass();
                                        eooz eoozVar3 = new eooz() { // from class: bwhv
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj3) {
                                                return bwlnVar.a((String) obj3);
                                            }
                                        };
                                        eosc eoscVar4 = bwipVar2.k;
                                        eiju eijuVarE2 = eijuVarD2.i(eoozVar3, eoscVar4).i(new eooz() { // from class: bwhw
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj3) {
                                                atys atysVar4 = atysVar3;
                                                eyfr eyfrVarA = bwir.a(atysVar4.e().d.E());
                                                bwip bwipVar3 = bwipVar2;
                                                bwkb bwkbVarA = bwipVar3.l.a((String) obj3, eyfrVarA, chxoVarB, nativeMessageEncryptorV2);
                                                bwipVar3.h(bwkbVarA, basd.a(((atuy) atysVar4).a.j));
                                                return eijx.e(bwkbVarA);
                                            }
                                        }, bwipVar2.j).e(evtj.class, new ejvr() { // from class: bwhy
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj3) {
                                                cqbd cqbdVarE2 = bwip.a.e();
                                                cqbdVarE2.I("Unable to parse the incoming chat message content as a MessageEnvelope.");
                                                cqbdVarE2.A("errorMessage", ((evtj) obj3).getMessage());
                                                cqbdVarE2.r();
                                                return bwkb.e(bwbw.INVALID_PROTOCOL_BUFFER);
                                            }
                                        }, eoscVar4).e(IllegalArgumentException.class, new ejvr() { // from class: bwhz
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj3) {
                                                cqbd cqbdVarE2 = bwip.a.e();
                                                cqbdVarE2.I("Incoming chat message is not base 64 encoded.");
                                                cqbdVarE2.A("errorMessage", ((IllegalArgumentException) obj3).getMessage());
                                                cqbdVarE2.r();
                                                return bwkb.e(bwbw.INVALID_PROTOCOL_BUFFER);
                                            }
                                        }, eoscVar4);
                                        eieuVarK2.b(eijuVarE2);
                                        eieuVarK2.close();
                                        return eijuVarE2;
                                    } catch (Throwable th) {
                                        try {
                                            eieuVarK2.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, eoscVar3).e(IllegalStateException.class, new ejvr() { // from class: bwhp
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    bwip.g((IllegalStateException) obj2);
                                    return bwkb.e(bwbw.ENCRYPTOR_NOT_FOUND);
                                }
                            }, eoscVar3).e(bwlo.class, new ejvr() { // from class: bwhq
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    bwip.g((bwlo) obj2);
                                    return bwkb.e(bwbw.ENCRYPTOR_NOT_FOUND);
                                }
                            }, eoscVar3).i(new eooz() { // from class: bwhr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return bwipVar.e(atysVar2, (bwkb) obj2, eijuVarI2);
                                }
                            }, eoscVar3).e(bwnp.class, new ejvr() { // from class: bwhs
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    bwip.a.s("Group retry message gets into an invalid state.", (bwnp) obj2);
                                    return atav.FAIL_NO_RETRY;
                                }
                            }, eoscVar3);
                        }
                        efndVar = efndVar2;
                        if (efne.d.equals(efndVar.a())) {
                            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processInternal", 176, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("IMDN message bypassed its processor. Dropping IMDN message.");
                            return eijx.e(atav.FAIL_NO_RETRY);
                        }
                        ContentType contentType = efne.b;
                        if (contentType.g(efndVar.a())) {
                            bwip bwipVar2 = bwfwVar.c;
                            efnd efndVar3 = (efnd) bwipVar2.m.fH().fM(atysVar2.e());
                            if (!efndVar3.a().g(contentType)) {
                                bwip.a.p("Incoming message is not a file transfer.");
                                eijuVarE = eijx.e(bwap.a);
                            } else if (bwipVar2.j(aufhVar2)) {
                                try {
                                    AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) efnf.c(efndVar3);
                                    Optional optional = autoValue_FileTransferInformation.c;
                                    if (optional.isEmpty()) {
                                        bwip.a.p("File transfer message does not contain the encrypted-data extension.");
                                        FileInformation fileInformation = autoValue_FileTransferInformation.a;
                                        if (bvug.a((String) fileInformation.h().orElse(null), fileInformation.b().toString())) {
                                            bwipVar2.i.e("Bugle.Etouffee.FileTransfer.Format", cmoj.a(4));
                                            bwipVar2.n.c(basd.a(atuyVar.a.j), 36);
                                        } else {
                                            bwipVar2.i.e("Bugle.Etouffee.FileTransfer.Format", cmoj.a(5));
                                        }
                                        eijuVarE = eijx.e(bwap.a);
                                    } else {
                                        cqbd cqbdVarC = bwip.a.c();
                                        cqbdVarC.I("Processing file transfer with encrypted data extension");
                                        cqbdVarC.h(basd.a(atuyVar.a.j));
                                        cqbdVarC.r();
                                        eiju eijuVarC = bwipVar2.c(atysVar2, (evqs) optional.get());
                                        bwim bwimVar = new bwim();
                                        eosc eoscVar4 = bwipVar2.k;
                                        eijuVarE = eijuVarC.h(bwimVar, eoscVar4).e(bwnp.class, new ejvr() { // from class: bwin
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj2) {
                                                bwip.a.s("Group retry message gets into an invalid state.", (bwnp) obj2);
                                                return bwar.a(atav.FAIL_NO_RETRY);
                                            }
                                        }, eoscVar4);
                                    }
                                } catch (efoc e) {
                                    basd basdVarA2 = basd.a(atuyVar.a.j);
                                    cqbd cqbdVarE2 = bwip.a.e();
                                    cqbdVarE2.I("Failed to deserialize contents of a file transfer message.");
                                    cqbdVarE2.h(basdVarA2);
                                    cqbdVarE2.s(e);
                                    bwipVar2.n.c(basdVarA2, 27);
                                    eijuVarE = eijx.e(bwar.a(atav.FAIL_NO_RETRY));
                                }
                            } else {
                                ekrd ekrdVarK2 = bwip.a.k();
                                ekrdVarK2.X(cqnc.e, aufhVar2.j);
                                ((ekrd) ekrdVarK2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IncomingEncryptedMessageProcessor", "processFileTransferMessageWithEncryptedData", 286, "IncomingEncryptedMessageProcessor.java")).q("Skipping processing message because missing required group or destination token.");
                                eijuVarE = eijx.e(bwar.a(atav.FAIL_NO_RETRY));
                            }
                            return eijuVarE.i(new eooz() { // from class: bwfr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    bwjy bwjyVar = (bwjy) obj2;
                                    if (bwjyVar.b() == 1) {
                                        return eijx.e(bwjyVar.a());
                                    }
                                    return bwfwVar.e.a(atysVar2);
                                }
                            }, bwfwVar.k);
                        }
                    }
                    if (bwfwVar.f.g() && bwis.a(efndVar.a().toString())) {
                        bwfwVar.c(basdVarA, atysVar2, zBooleanValue, zG);
                    } else if (bwis.a(efndVar.a().toString())) {
                        bwfwVar.c(basdVarA, atysVar2, zBooleanValue, zG);
                        atzx atzxVar = bwfwVar.e;
                        atal atalVar2 = new atal();
                        aubs aubsVar = (aubs) atysVar2.e().toBuilder();
                        aubx aubxVar3 = (aubx) atalVar2.fH().fM(efne.e);
                        aubsVar.copyOnWrite();
                        aubt aubtVar = (aubt) aubsVar.instance;
                        aubxVar3.getClass();
                        aubtVar.c = aubxVar3;
                        aubtVar.b |= 1;
                        aubt aubtVar2 = (aubt) aubsVar.build();
                        atyr atyrVarC = atys.c();
                        aufe aufeVar = (aufe) aufhVar2.toBuilder();
                        aufeVar.copyOnWrite();
                        ((aufh) aufeVar.instance).m = aufh.emptyProtobufList();
                        aufeVar.c(aubtVar2);
                        atyrVarC.c((aufh) aufeVar.build());
                        atyrVarC.b(0);
                        return atzxVar.a(atyrVarC.d());
                    }
                    return bwfwVar.e.a(atysVar2);
                }
            }, eoscVar);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbty
    public final eiju b(FileTransferInformation fileTransferInformation, atys atysVar) {
        return a(atysVar);
    }

    public final void c(basd basdVar, atys atysVar, boolean z, boolean z2) {
        aufh aufhVar = ((atuy) atysVar).a;
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar = aufhVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        boolean zEquals = aubpVar.equals(aubpVarB);
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.f, basdVar);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "logHandlingAsUnencryptedMessage", 223, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).J("[Chat API] Incoming Etouffee message, but Message will be processed as a basic text. isReceiveEtouffeeEnabled: %b, isE2eeProvisioned: %b, inGroup: %b, isGroupEtouffeeEnabled: %b.", Boolean.valueOf(bwbt.c()), Boolean.valueOf(z), Boolean.valueOf(zEquals), Boolean.valueOf(z2));
        if (zEquals && !z2) {
            ((bwey) this.h.b()).c(basdVar, 45);
            return;
        }
        if (!bwbt.c()) {
            ((bwey) this.h.b()).c(basdVar, 15);
            this.g.e("Bugle.Etouffee.DecryptionAborted.Reason", bwbw.ETOUFFEE_DISABLED.y);
        } else {
            if (z) {
                return;
            }
            ((bwey) this.h.b()).c(basdVar, 17);
        }
    }

    @Override // defpackage.cbty
    public final /* synthetic */ Object d(FileTransferInformation fileTransferInformation, atys atysVar, fcxy fcxyVar) {
        return cbtw.b(this, fileTransferInformation, atysVar, fcxyVar);
    }

    @Override // defpackage.cbty
    public final boolean e(FileTransferInformation fileTransferInformation) {
        return ((AutoValue_FileTransferInformation) fileTransferInformation).c.isPresent();
    }
}
