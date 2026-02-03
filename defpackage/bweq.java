package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bweq implements cmpo {
    public static final cqce a = cqce.g("BugleRcs", "EncryptedRcsMessageReceiptConverter");
    public final bwem b;
    public final alrj c;
    private final cmst d;
    private final bwln e;
    private final ataj f;
    private final atal g = new atal();
    private final eosc h;

    public bweq(cmst cmstVar, bwln bwlnVar, bwem bwemVar, ataj atajVar, alrj alrjVar, eosc eoscVar) {
        this.d = cmstVar;
        this.e = bwlnVar;
        this.b = bwemVar;
        this.f = atajVar;
        this.c = alrjVar;
        this.h = eoscVar;
    }

    @Override // defpackage.cmpo
    public final aubt a(auhk auhkVar, basd basdVar, Instant instant) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Sending IMDN plaintext receipt because the message is missing");
        cqbdVarC.h(basdVar);
        cqbdVarC.r();
        return this.d.a(auhkVar, basdVar, instant);
    }

    @Override // defpackage.cmpo
    public final eiju b(final basd basdVar, final eyga eygaVar, final Instant instant, final aubq aubqVar, final asrg asrgVar) {
        eyfs eyfsVar = (eyfs) eyfv.a.createBuilder();
        String strE = basd.e(basdVar);
        eyfsVar.copyOnWrite();
        eyfv eyfvVar = (eyfv) eyfsVar.instance;
        eyfvVar.b |= 1;
        eyfvVar.c = strE;
        eyfu eyfuVar = eyfu.READ;
        eyfsVar.copyOnWrite();
        eyfv eyfvVar2 = (eyfv) eyfsVar.instance;
        eyfvVar2.d = eyfuVar.f;
        eyfvVar2.b |= 2;
        final byte[] byteArray = ((eyfv) eyfsVar.build()).toByteArray();
        eiju eijuVarA = this.e.a(aubqVar.d);
        eooz eoozVar = new eooz() { // from class: bwen
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bweq bweqVar = this.a;
                final String str = (String) obj;
                final aubq aubqVar2 = aubqVar;
                final basd basdVar2 = basdVar;
                eyga eygaVar2 = eygaVar;
                final Instant instant2 = instant;
                asrg asrgVar2 = asrgVar;
                final byte[] bArr = byteArray;
                if (!bwbv.h() || !asrgVar2.d()) {
                    return bweqVar.b.b(bArr, str, aubqVar2, basdVar2, ekgb.r(bweqVar.c.b(asrgVar2.a())), "application/vnd.google.rcs.success", true, elss.READ_REPORT, false, eygaVar2);
                }
                ekgb ekgbVarZ = bweqVar.c.z(asrgVar2);
                boolean z = true;
                if (((ekoe) ekgbVarZ).c == 1) {
                    final bwem bwemVar = bweqVar.b;
                    final alqm alqmVar = (alqm) ekgbVarZ.get(0);
                    eieu eieuVarK = eiiy.k("EtouffeeMessageConverter#encryptDisplayReceiptInXmlFormat");
                    if (eygaVar2 == null) {
                        try {
                            eygaVar2 = eyga.a;
                        } finally {
                        }
                    }
                    final eyga eygaVar3 = eygaVar2;
                    eiju eijuVarF = bwemVar.c(ekgb.r(alqmVar), true).i(new eooz() { // from class: bwee
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final ekot ekotVar = (ekot) obj2;
                            final bwem bwemVar2 = bwemVar;
                            eiju eijuVarB = ((bwbn) bwemVar2.b.b()).b(aubqVar2.d);
                            final String str2 = str;
                            final byte[] bArr2 = bArr;
                            final eyga eygaVar4 = eygaVar3;
                            final basd basdVar3 = basdVar2;
                            final Instant instant3 = instant2;
                            return eijuVarB.h(new ejvr() { // from class: bwec
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj3;
                                    eyfw eyfwVar = (eyfw) eyfx.a.createBuilder();
                                    eyfwVar.copyOnWrite();
                                    eyfx eyfxVar = (eyfx) eyfwVar.instance;
                                    String str3 = str2;
                                    str3.getClass();
                                    eyfxVar.b |= 2;
                                    eyfxVar.d = str3;
                                    eyfwVar.copyOnWrite();
                                    eyfx eyfxVar2 = (eyfx) eyfwVar.instance;
                                    eyfxVar2.b |= 1;
                                    eyfxVar2.c = "application/vnd.google.rcs.success";
                                    evqs evqsVarX = evqs.x(bArr2);
                                    eyfwVar.copyOnWrite();
                                    eyfx eyfxVar3 = (eyfx) eyfwVar.instance;
                                    eyfxVar3.b |= 4;
                                    eyfxVar3.e = evqsVarX;
                                    eyfwVar.copyOnWrite();
                                    eyfx eyfxVar4 = (eyfx) eyfwVar.instance;
                                    eyga eygaVar5 = eygaVar4;
                                    eygaVar5.getClass();
                                    eyfxVar4.f = eygaVar5;
                                    eyfxVar4.b |= 8;
                                    eyfx eyfxVar5 = (eyfx) eyfwVar.build();
                                    elss elssVar = elss.READ_REPORT;
                                    bwem bwemVar3 = bwemVar2;
                                    eyfr eyfrVarC = bwemVar3.h.c(eyfxVar5, basdVar3, str3, ekotVar, true, false, elssVar, nativeMessageEncryptorV2);
                                    basd basdVarA = bwemVar3.j.a();
                                    efia efiaVar = new efia();
                                    efiaVar.a = (dflp) bwemVar3.l.b();
                                    efkk efkkVar = efkk.DISPLAY;
                                    efiaVar.l(efkkVar);
                                    efiaVar.i(basdVarA.f());
                                    efiaVar.j(efkkVar.f);
                                    efiaVar.k(instant3);
                                    efiaVar.g(eyfrVarC.toByteString());
                                    try {
                                        return new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ((efmy) bwemVar3.k.b(efiaVar.m())).a.I(), basdVarA.f());
                                    } catch (efoc e) {
                                        throw new cmph(e);
                                    }
                                }
                            }, bwemVar2.e);
                        }
                    }, bwemVar.e).f(Throwable.class, new eooz() { // from class: bwef
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            cqbd cqbdVarE = bwem.a.e();
                            cqbdVarE.I("Failed to create encrypted display IMDN in XML extension format.");
                            cqbdVarE.M("remote messaging identity destination", alqmVar.toString());
                            cqbdVarE.A("rcsMessageId", basdVar2);
                            cqbdVarE.r();
                            return eijx.d((Throwable) obj2);
                        }
                    }, bwemVar.f);
                    eieuVarK.b(eijuVarF);
                    eieuVarK.close();
                    return eijuVarF;
                }
                cqbd cqbdVarE = bweq.a.e();
                cqbdVarE.I("Trying to encrypt IMDN display to multiple recipients in etouffee group message.");
                cqbdVarE.I("{");
                ekqh it = ekgbVarZ.iterator();
                while (it.hasNext()) {
                    alqm alqmVar2 = (alqm) it.next();
                    if (!z) {
                        cqbdVarE.v(", ");
                    }
                    cqbdVarE.p(alqmVar2);
                    cqbdVarE.v(cqbdVarE);
                    z = false;
                }
                cqbdVarE.v("}");
                cqbdVarE.r();
                throw new IllegalStateException("Cannot encrypt IMDN display receipt to multiple recipients in group messaging.");
            }
        };
        eosc eoscVar = this.h;
        return eijuVarA.i(eoozVar, eoscVar).h(new ejvr() { // from class: bweo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ataj.a((ChatMessage) obj);
            }
        }, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: bwep
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new cmph((IllegalStateException) obj);
            }
        }, eoscVar);
    }

    @Override // defpackage.cmpo
    public final eiju c(auhk auhkVar, MessageCoreData messageCoreData, asrg asrgVar) {
        ejwl.b(messageCoreData.cB(), "Message receipt should not be encrypted");
        int iOrdinal = auhkVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if (!asrgVar.d() || bwbv.h()) {
                    return b(messageCoreData.F(), messageCoreData.ac(), Instant.ofEpochMilli(messageCoreData.r()), messageCoreData.w(), asrgVar);
                }
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Sending IMDN plaintext display receipt for an etouffee group message");
                cqbdVarE.d(messageCoreData.C());
                cqbdVarE.h(messageCoreData.F());
                cqbdVarE.r();
                return this.d.c(auhk.DISPLAYED, messageCoreData, asrgVar);
            }
            if (iOrdinal != 3) {
                return eijx.d(new IllegalArgumentException("Encrypted message receipts not supported to type " + auhkVar.e));
            }
        }
        if (messageCoreData.an() == null) {
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Sending IMDN plaintext delivery receipt for an etouffee 1 to 1 message");
            cqbdVarE2.d(messageCoreData.C());
            cqbdVarE2.h(messageCoreData.F());
            cqbdVarE2.r();
            return this.d.c(auhkVar, messageCoreData, asrgVar);
        }
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        aubx aubxVar = (aubx) this.g.fH().fM(ContentType.e(messageCoreData.an()));
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar.c = aubxVar;
        aubtVar.b |= 1;
        evqs evqsVarX = evqs.x(messageCoreData.dm());
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubtVar2.b = 2 | aubtVar2.b;
        aubtVar2.d = evqsVarX;
        return eijx.e((aubt) aubsVar.build());
    }
}
