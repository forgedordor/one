package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdn implements cmom {
    public static final eksp a = eksp.c("BugleConversation");
    public final cmsm b;
    public final bwln c;
    public final bwem d;
    public final eosc e;
    public final dfpv f;
    public final fcsu g;
    public final fcsu h;
    private final ataj i;
    private final alrj j;
    private final eosc k;

    public bwdn(cmsm cmsmVar, bwln bwlnVar, bwem bwemVar, ataj atajVar, alrj alrjVar, dfpv dfpvVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.b = cmsmVar;
        this.c = bwlnVar;
        this.d = bwemVar;
        this.i = atajVar;
        this.j = alrjVar;
        this.f = dfpvVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.e = eoscVar;
        this.k = eoscVar2;
    }

    @Override // defpackage.cmom
    public final eiju a(final MessageCoreData messageCoreData, asrg asrgVar) {
        ejwl.b(messageCoreData.cB(), "Location information message should not be encrypted");
        final LocationInformation locationInformationC = cmsm.c(messageCoreData);
        if (locationInformationC == null) {
            throw new IllegalArgumentException("The messages has no location information attachment");
        }
        final ekgb ekgbVarZ = this.j.z(asrgVar);
        eiju eijuVarH = eijx.h(new eooy() { // from class: bwdk
            @Override // defpackage.eooy
            public final ListenableFuture a() throws XmlPullParserException, IllegalStateException, DOMException, IOException, IllegalArgumentException {
                String strW;
                final bwdn bwdnVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                LocationInformation locationInformation = locationInformationC;
                final basd basdVarF = messageCoreData2.F();
                final eyga eygaVarAc = messageCoreData2.ac();
                if (!messageCoreData2.cB()) {
                    cmsm cmsmVar = bwdnVar.b;
                    basd basdVarF2 = messageCoreData2.F();
                    return eijx.e(new ChatMessage(ChatMessage.Type.LOCATION, cmsmVar.d(messageCoreData2, locationInformation), basd.e(basdVarF2)));
                }
                final aubq aubqVarW = messageCoreData2.w();
                Optional optionalJ = ((dggz) bwdnVar.g.b()).j(((dggl) bwdnVar.h.b()).a(aubqVarW.d));
                if (optionalJ.isEmpty()) {
                    ((eksl) ((eksl) bwdn.a.i()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedLocationConverter", "getLocalPublicUserEntity", 162, "EncryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in EncryptedLocationConverter to empty.");
                    strW = "";
                } else {
                    strW = ((dgiq) optionalJ.get()).m().w();
                }
                final ekgb ekgbVar = ekgbVarZ;
                final byte[] bArrA = bwdnVar.f.a(strW, locationInformation);
                eiju eijuVarE = eijx.e(aubqVarW.d);
                final bwln bwlnVar = bwdnVar.c;
                bwlnVar.getClass();
                eooz eoozVar = new eooz() { // from class: bwdi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return bwlnVar.a((String) obj);
                    }
                };
                eosc eoscVar = bwdnVar.e;
                return eijuVarE.i(eoozVar, eoscVar).i(new eooz() { // from class: bwdj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return bwdnVar.d.b(bArrA, (String) obj, aubqVarW, basdVarF, ekgbVar, "application/vnd.gsma.rcspushlocation+xml", false, elss.LOCATION, false, eygaVarAc);
                    }
                }, eoscVar);
            }
        }, this.e);
        ejvr ejvrVar = new ejvr() { // from class: bwdl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ataj.a((ChatMessage) obj);
            }
        };
        eosc eoscVar = this.k;
        return eijuVarH.h(ejvrVar, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: bwdm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = bwdn.a;
                throw new cmph((IllegalStateException) obj);
            }
        }, eoscVar);
    }

    @Override // defpackage.cmom
    public final boolean b(MessageCoreData messageCoreData) {
        return this.b.b(messageCoreData);
    }
}
