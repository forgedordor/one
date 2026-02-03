package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdz implements cmpl {
    private static final cqce k = cqce.g("BugleE2eeEtouffee", "EncryptedRcsFileTransferDetailsConverter");
    public final bwln a;
    public final alrj b;
    public final fcsu c;
    public final bwkc d;
    public final bwjw e;
    public final fcsu f;
    public final efob g;
    public final fcsu h;
    public final fcsu i;
    public final eosc j;
    private final ataj l;
    private final atal m = new atal();
    private final eosc n;
    private final fcsu o;
    private final aptx p;
    private final aqvb q;
    private final aqzt r;

    public bwdz(bwln bwlnVar, ataj atajVar, alrj alrjVar, fcsu fcsuVar, bwkc bwkcVar, bwjw bwjwVar, fcsu fcsuVar2, efob efobVar, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5, aptx aptxVar, aqvb aqvbVar, aqzt aqztVar) {
        this.a = bwlnVar;
        this.l = atajVar;
        this.b = alrjVar;
        this.c = fcsuVar;
        this.d = bwkcVar;
        this.e = bwjwVar;
        this.f = fcsuVar2;
        this.g = efobVar;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.n = eoscVar;
        this.j = eoscVar2;
        this.o = fcsuVar5;
        this.p = aptxVar;
        this.q = aqvbVar;
        this.r = aqztVar;
    }

    private final eiju c(MessageCoreData messageCoreData) {
        final aubq aubqVarW = messageCoreData.w();
        return eijx.h(new eooy() { // from class: bwdt
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.a.a(aubqVarW.d);
            }
        }, this.n);
    }

    private final eyfp d(MessageCoreData messageCoreData, boolean z) {
        eyfn eyfnVarF;
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        messagePartCoreDataH.getClass();
        athh athhVarZ = messagePartCoreDataH.z();
        if (this.p.a() && athhVarZ != null) {
            aqvb aqvbVar = this.q;
            eyfn eyfnVarG = null;
            if (aqvbVar.a()) {
                cbtf cbtfVarD = ((atjz) this.o.b()).d(athhVarZ);
                if (cbtfVarD instanceof cbte) {
                    eyfnVarF = ((cbte) cbtfVarD).a;
                } else {
                    if (cbtfVarD != null) {
                        ((bwey) this.i.b()).e(messageCoreData.E(), 6);
                        throw new IllegalArgumentException("Scytale file transfer encryption metadata expected, but found another encryption protocol instead.");
                    }
                    eyfnVarF = null;
                }
            } else {
                eyfnVarF = ((atjz) this.o.b()).f(athhVarZ);
            }
            if (eyfnVarF == null) {
                ((bwey) this.i.b()).e(messageCoreData.E(), 6);
                throw new IllegalArgumentException("The etouffee metadata was missing.");
            }
            if (!z) {
                eyfo eyfoVar = (eyfo) eyfp.a.createBuilder();
                eyfoVar.copyOnWrite();
                eyfp eyfpVar = (eyfp) eyfoVar.instance;
                eyfpVar.d = eyfnVarF;
                eyfpVar.b |= 2;
                return (eyfp) eyfoVar.build();
            }
            if (aqvbVar.a()) {
                cbtf cbtfVarE = ((atjz) this.o.b()).e(athhVarZ);
                if (cbtfVarE instanceof cbte) {
                    eyfnVarG = ((cbte) cbtfVarE).a;
                }
            } else {
                eyfnVarG = ((atjz) this.o.b()).g(athhVarZ);
            }
            if (eyfnVarG == null) {
                ekrd ekrdVarK = k.k();
                ekrdVarK.X(coie.j, athhVarZ);
                ((ekrd) ekrdVarK.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsFileTransferDetailsConverter", "buildFileTransferWithoutChatMessageContent", 412, "EncryptedRcsFileTransferDetailsConverter.java")).q("Encryption metadata for thumbnail was missing.");
                eyfo eyfoVar2 = (eyfo) eyfp.a.createBuilder();
                eyfoVar2.copyOnWrite();
                eyfp eyfpVar2 = (eyfp) eyfoVar2.instance;
                eyfpVar2.d = eyfnVarF;
                eyfpVar2.b |= 2;
                return (eyfp) eyfoVar2.build();
            }
            eyfo eyfoVar3 = (eyfo) eyfp.a.createBuilder();
            eyfoVar3.copyOnWrite();
            eyfp eyfpVar3 = (eyfp) eyfoVar3.instance;
            eyfpVar3.d = eyfnVarF;
            eyfpVar3.b |= 2;
            eyfoVar3.copyOnWrite();
            eyfp eyfpVar4 = (eyfp) eyfoVar3.instance;
            eyfpVar4.c = eyfnVarG;
            eyfpVar4.b |= 1;
            return (eyfp) eyfoVar3.build();
        }
        final basd basdVarE = messageCoreData.E();
        bpil bpilVarA = bpio.a();
        bpilVarA.A("getEtouffeeMessageByRcsId3");
        bpilVarA.c(new Function() { // from class: bwdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpin bpinVar = (bpin) obj;
                bpinVar.b(basdVarE);
                return bpinVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bphn bphnVar = (bphn) bpilVarA.b().p();
        try {
            if (!bphnVar.moveToFirst()) {
                ((bwey) this.i.b()).e(messageCoreData.E(), 6);
                throw new IllegalArgumentException("The etouffee metadata was missing.");
            }
            if (bphnVar.isClosed() || bphnVar.isBeforeFirst() || bphnVar.isAfterLast()) {
                throw new IllegalArgumentException("Invalid cursor while reading etouffee metadata.");
            }
            eyfo eyfoVar4 = (eyfo) eyfp.a.createBuilder();
            byte[] bArrL = bphnVar.l();
            if (bArrL == null) {
                ((bwey) this.i.b()).e(bphnVar.f(), 7);
                throw new IllegalArgumentException("The etouffee metadata is missing the attachment one time media key.");
            }
            byte[] bArrK = bphnVar.k();
            if (bArrK == null) {
                ((bwey) this.i.b()).e(bphnVar.f(), 8);
                throw new IllegalArgumentException("The etouffee metadata is missing attachment digest.");
            }
            eyfn eyfnVar = eyfn.a;
            eyfm eyfmVar = (eyfm) eyfnVar.createBuilder();
            evqs evqsVarX = evqs.x(bArrL);
            eyfmVar.copyOnWrite();
            eyfn eyfnVar2 = (eyfn) eyfmVar.instance;
            eyfnVar2.b |= 1;
            eyfnVar2.c = evqsVarX;
            evqs evqsVarX2 = evqs.x(bArrK);
            eyfmVar.copyOnWrite();
            eyfn eyfnVar3 = (eyfn) eyfmVar.instance;
            eyfnVar3.b |= 2;
            eyfnVar3.d = evqsVarX2;
            int iC = bphnVar.c();
            eyfmVar.copyOnWrite();
            eyfn eyfnVar4 = (eyfn) eyfmVar.instance;
            eyfnVar4.b |= 4;
            eyfnVar4.e = iC;
            String strI = bphnVar.i();
            if (strI == null) {
                ((bwey) this.i.b()).e(bphnVar.f(), 9);
                throw new IllegalArgumentException("The etouffee metadata is missing the name of the attachment.");
            }
            String strH = bphnVar.h();
            if (strH == null) {
                ((bwey) this.i.b()).e(bphnVar.f(), 10);
                throw new IllegalArgumentException("The etouffee metadata is missing the content type of the attachment.");
            }
            eyfmVar.copyOnWrite();
            eyfn eyfnVar5 = (eyfn) eyfmVar.instance;
            eyfnVar5.b = 8 | eyfnVar5.b;
            eyfnVar5.f = strI;
            atal atalVar = this.m;
            aubx aubxVar = (aubx) atalVar.fH().fM(ContentType.e(strH));
            eyfmVar.copyOnWrite();
            eyfn eyfnVar6 = (eyfn) eyfmVar.instance;
            aubxVar.getClass();
            eyfnVar6.g = aubxVar;
            eyfnVar6.b |= 16;
            eyfoVar4.copyOnWrite();
            eyfp eyfpVar5 = (eyfp) eyfoVar4.instance;
            eyfn eyfnVar7 = (eyfn) eyfmVar.build();
            eyfnVar7.getClass();
            eyfpVar5.d = eyfnVar7;
            eyfpVar5.b |= 2;
            byte[] bArrN = bphnVar.n();
            byte[] bArrM = bphnVar.m();
            if (bArrN != null && bArrM != null) {
                eyfm eyfmVar2 = (eyfm) eyfnVar.createBuilder();
                evqs evqsVarX3 = evqs.x(bArrN);
                eyfmVar2.copyOnWrite();
                eyfn eyfnVar8 = (eyfn) eyfmVar2.instance;
                eyfnVar8.b |= 1;
                eyfnVar8.c = evqsVarX3;
                evqs evqsVarX4 = evqs.x(bArrM);
                eyfmVar2.copyOnWrite();
                eyfn eyfnVar9 = (eyfn) eyfmVar2.instance;
                eyfnVar9.b |= 2;
                eyfnVar9.d = evqsVarX4;
                int iE = bphnVar.e();
                eyfmVar2.copyOnWrite();
                eyfn eyfnVar10 = (eyfn) eyfmVar2.instance;
                eyfnVar10.b |= 4;
                eyfnVar10.e = iE;
                String strJ = bphnVar.j();
                if (strJ == null) {
                    ((bwey) this.i.b()).e(bphnVar.f(), 11);
                    throw new IllegalArgumentException("The etouffee metadata is missing the content type of the thumbnail.");
                }
                aubx aubxVar2 = (aubx) atalVar.fH().fM(ContentType.e(strJ));
                eyfmVar2.copyOnWrite();
                eyfn eyfnVar11 = (eyfn) eyfmVar2.instance;
                aubxVar2.getClass();
                eyfnVar11.g = aubxVar2;
                eyfnVar11.b |= 16;
                eyfoVar4.copyOnWrite();
                eyfp eyfpVar6 = (eyfp) eyfoVar4.instance;
                eyfn eyfnVar12 = (eyfn) eyfmVar2.build();
                eyfnVar12.getClass();
                eyfpVar6.c = eyfnVar12;
                eyfpVar6.b |= 1;
            }
            eyfp eyfpVar7 = (eyfp) eyfoVar4.build();
            bphnVar.close();
            return eyfpVar7;
        } catch (Throwable th) {
            try {
                bphnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju a(aucl auclVar, final MessageCoreData messageCoreData, final asrg asrgVar, Optional optional, Optional optional2) {
        final eiju eijuVar = (eiju) optional.orElse(c(messageCoreData));
        final eiju eijuVar2 = (eiju) optional2.orElse(eijx.e(d(messageCoreData, (auclVar.b & 2) != 0)));
        return eijx.k(eijuVar, eijuVar2).b(new eooy() { // from class: bwds
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final bwdz bwdzVar = this.a;
                ((ains) bwdzVar.h.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", cmoj.a(3));
                bwey bweyVar = (bwey) bwdzVar.i.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                basd basdVarF = messageCoreData2.F();
                if (bweyVar.c.a()) {
                    ((cbqh) bweyVar.b.b()).c(basdVarF, basd.a, 12, 11, 1);
                } else {
                    bweyVar.f(basdVarF, basd.a, 12, 11, 1);
                }
                final asrg asrgVar2 = asrgVar;
                final eiju eijuVar3 = eijuVar;
                final eiju eijuVar4 = eijuVar2;
                return ((bwbn) bwdzVar.c.b()).b(messageCoreData2.w().d).i(new eooz() { // from class: bwdp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eyga eygaVarAc;
                        ekot ekotVarC;
                        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                        eyfp eyfpVar = (eyfp) eork.q(eijuVar4);
                        String str = (String) eork.q(eijuVar3);
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        basd basdVarF2 = messageCoreData3.F();
                        if (messageCoreData3.ac() != null) {
                            eygaVarAc = messageCoreData3.ac();
                            eygaVarAc.getClass();
                        } else {
                            eygaVarAc = eyga.a;
                        }
                        asrg asrgVar3 = asrgVar2;
                        eyfw eyfwVar = (eyfw) eyfx.a.createBuilder();
                        eyfwVar.copyOnWrite();
                        eyfx eyfxVar = (eyfx) eyfwVar.instance;
                        eyfxVar.b |= 1;
                        eyfxVar.c = "application/vnd.gsma.rcs-ft-http+xml";
                        eyfwVar.copyOnWrite();
                        eyfx eyfxVar2 = (eyfx) eyfwVar.instance;
                        str.getClass();
                        eyfxVar2.b |= 2;
                        eyfxVar2.d = str;
                        evqs byteString = eyfpVar.toByteString();
                        eyfwVar.copyOnWrite();
                        eyfx eyfxVar3 = (eyfx) eyfwVar.instance;
                        eyfxVar3.b |= 4;
                        eyfxVar3.e = byteString;
                        eyfwVar.copyOnWrite();
                        eyfx eyfxVar4 = (eyfx) eyfwVar.instance;
                        eygaVarAc.getClass();
                        eyfxVar4.f = eygaVarAc;
                        eyfxVar4.b |= 8;
                        eyfx eyfxVar5 = (eyfx) eyfwVar.build();
                        boolean z = bwbv.h() && asrgVar3.d();
                        bwdz bwdzVar2 = bwdzVar;
                        if (z) {
                            Stream stream = Collection.EL.stream(asrgVar3.c());
                            final alrj alrjVar = bwdzVar2.b;
                            alrjVar.getClass();
                            Stream map = stream.map(new Function() { // from class: bwdr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return alrjVar.b((aubq) obj2);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            ekotVarC = bwdzVar2.e.c((ekgb) map.collect(ekcv.a), true);
                        } else {
                            ekotVarC = bwdzVar2.e.c(bwdzVar2.b.y(((bakt) bwdzVar2.f.b()).K(messageCoreData3.A())), false);
                        }
                        return eijx.e(bwdzVar2.d.c(eyfxVar5, basdVarF2, str, ekotVarC, false, z, elss.ATTACHMENT, nativeMessageEncryptorV2));
                    }
                }, bwdzVar.j);
            }
        }, this.j);
    }

    @Override // defpackage.cmpl
    public final eiju b(final aucl auclVar, final MessageCoreData messageCoreData, final asrg asrgVar) {
        if (this.r.a()) {
            aucj aucjVar = auclVar.c;
            if (aucjVar == null) {
                aucjVar = aucj.a;
            }
            if ((aucjVar.b & 4) != 0) {
                MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
                messagePartCoreDataH.getClass();
                athh athhVarZ = messagePartCoreDataH.z();
                ekrd ekrdVarH = k.h();
                ekrdVarH.X(coie.j, athhVarZ);
                ((ekrd) ekrdVarH.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedRcsFileTransferDetailsConverter", "toChatMessageContent", 148, "EncryptedRcsFileTransferDetailsConverter.java")).q("Pre-serialized XML was provided, using it directly.");
                aubs aubsVar = (aubs) aubt.a.createBuilder();
                aubv aubvVar = (aubv) aubx.a.createBuilder();
                aubvVar.copyOnWrite();
                aubx aubxVar = (aubx) aubvVar.instance;
                aubxVar.b |= 1;
                aubxVar.c = "application";
                aubvVar.copyOnWrite();
                aubx aubxVar2 = (aubx) aubvVar.instance;
                aubxVar2.b |= 2;
                aubxVar2.d = "vnd.gsma.rcs-ft-http+xml";
                aubsVar.copyOnWrite();
                aubt aubtVar = (aubt) aubsVar.instance;
                aubx aubxVar3 = (aubx) aubvVar.build();
                aubxVar3.getClass();
                aubtVar.c = aubxVar3;
                aubtVar.b |= 1;
                aucj aucjVar2 = auclVar.c;
                if (aucjVar2 == null) {
                    aucjVar2 = aucj.a;
                }
                evqs evqsVar = aucjVar2.h;
                aubsVar.copyOnWrite();
                aubt aubtVar2 = (aubt) aubsVar.instance;
                evqsVar.getClass();
                aubtVar2.b |= 2;
                aubtVar2.d = evqsVar;
                return eijx.e((aubt) aubsVar.build());
            }
        }
        final eiju eijuVarC = c(messageCoreData);
        final eiju eijuVarE = eijx.e(d(messageCoreData, (auclVar.b & 2) != 0));
        eiju eijuVarH = eijx.h(new eooy() { // from class: bwdu
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.a(auclVar, messageCoreData, asrgVar, Optional.of(eijuVarC), Optional.of(eijuVarE));
            }
        }, this.j);
        eooz eoozVar = new eooz() { // from class: bwdv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eyfr eyfrVar = (eyfr) obj;
                final bwdz bwdzVar = this.a;
                final aucl auclVar2 = auclVar;
                final MessageCoreData messageCoreData2 = messageCoreData;
                return eijx.h(new eooy() { // from class: bwdq
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        atam atamVar = new atam();
                        aucl auclVar3 = auclVar2;
                        aucj aucjVar3 = auclVar3.c;
                        if (aucjVar3 == null) {
                            aucjVar3 = aucj.a;
                        }
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        efir efirVarC = ((FileInformation) atamVar.fM(aucjVar3)).c();
                        efirVarC.e("encrypted_file");
                        ContentType contentType = bvug.a;
                        efirVarC.c(contentType);
                        MessagePartCoreData messagePartCoreDataH2 = messageCoreData3.H();
                        if (messagePartCoreDataH2 != null && messagePartCoreDataH2.aY()) {
                            efirVarC.b(Duration.ofMillis(messagePartCoreDataH2.k()));
                        }
                        efho efhoVar = new efho();
                        efhoVar.c(efirVarC.i());
                        if ((auclVar3.b & 2) != 0) {
                            aucj aucjVar4 = auclVar3.d;
                            if (aucjVar4 == null) {
                                aucjVar4 = aucj.a;
                            }
                            efir efirVarC2 = ((FileInformation) atamVar.fM(aucjVar4)).c();
                            efirVarC2.c(contentType);
                            efhoVar.e(efirVarC2.i());
                        }
                        eyfr eyfrVar2 = eyfrVar;
                        bwdz bwdzVar2 = bwdzVar;
                        efhoVar.b(eyfrVar2.toByteString());
                        efnd efndVarB = bwdzVar2.g.b(FileTransferInformation.class).b(efhoVar.a());
                        ChatMessage.Type type = ChatMessage.Type.FILE_TRANSFER;
                        byte[] bArrI = efndVarB.b().I();
                        String str = messageCoreData3.F().b;
                        str.getClass();
                        return eijx.e(new ChatMessage(type, bArrI, str));
                    }
                }, bwdzVar.j);
            }
        };
        eosc eoscVar = this.n;
        return eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: bwdw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ataj.a((ChatMessage) obj);
            }
        }, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: bwdx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new cmph((IllegalStateException) obj);
            }
        }, eoscVar);
    }
}
