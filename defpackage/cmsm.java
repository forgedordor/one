package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsm implements cmom {
    private static final eksp d = eksp.c("BugleConversation");
    public final efob a;
    public final atak b;
    public final cogw c;
    private final dfpv e;
    private final eosc f;
    private final fcsu g;
    private final fcsu h;

    public cmsm(efob efobVar, atak atakVar, cogw cogwVar, dfpv dfpvVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = efobVar;
        this.b = atakVar;
        this.c = cogwVar;
        this.e = dfpvVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.f = eoscVar;
    }

    public static LocationInformation c(MessageCoreData messageCoreData) {
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        if (messagePartCoreDataH == null) {
            return null;
        }
        return messagePartCoreDataH.I();
    }

    @Override // defpackage.cmom
    public final eiju a(final MessageCoreData messageCoreData, asrg asrgVar) {
        final LocationInformation locationInformationC = c(messageCoreData);
        if (locationInformationC != null) {
            return eijx.e(messageCoreData.w().d).i(new eooz() { // from class: cmsl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String strE = basd.e(messageCoreData.F());
                    efhv efhvVar = new efhv();
                    efhvVar.b("tel:".concat(String.valueOf((String) obj)));
                    LocationInformation locationInformation = locationInformationC;
                    efhvVar.f(locationInformation.d);
                    efhvVar.g(locationInformation.c);
                    efhvVar.h(locationInformation.e);
                    efhvVar.c(Instant.ofEpochMilli(locationInformation.f));
                    efhvVar.e(locationInformation.a);
                    efhvVar.d(strE);
                    cmsm cmsmVar = this.a;
                    efhvVar.i(cmsmVar.c.f());
                    try {
                        return eijx.e((aubt) cmsmVar.b.fM(cmsmVar.a.b(com.google.android.rcs.client.messaging.data.LocationInformation.class).b(efhvVar.j())));
                    } catch (efoc e) {
                        throw new cmph(e);
                    }
                }
            }, this.f);
        }
        throw new IllegalArgumentException("The messages has no location information attachment");
    }

    @Override // defpackage.cmom
    public final boolean b(MessageCoreData messageCoreData) {
        return c(messageCoreData) != null;
    }

    public final byte[] d(MessageCoreData messageCoreData, LocationInformation locationInformation) {
        String strW;
        Optional optionalJ = ((dggz) this.g.b()).j(((dggl) this.h.b()).a(messageCoreData.w().d));
        if (optionalJ.isEmpty()) {
            ((eksl) ((eksl) d.i()).h("com/google/android/apps/messaging/shared/sms/UnencryptedLocationConverter", "getLocalPublicUserEntity", 165, "UnencryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in UnencryptedLocationConverter to empty.");
            strW = "";
        } else {
            strW = ((dgiq) optionalJ.get()).m().w();
        }
        return this.e.a(strW, locationInformation);
    }
}
