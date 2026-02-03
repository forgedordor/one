package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmj implements bayb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener");
    private final bwmm b;
    private final fcsu c;

    public bwmj(bwmm bwmmVar, fcsu fcsuVar) {
        this.b = bwmmVar;
        this.c = fcsuVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [alqm, java.lang.Object] */
    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        String strAm = messageCoreData.am();
        Optional optionalAh = messageCoreData.ah();
        if (messageCoreData.cB()) {
            try {
                String strAB = messageCoreData.aB();
                if (strAB != null) {
                    ((cazj) this.b.a.b()).e("downgrade_on_unencrypted_message", strAB);
                    return;
                }
                return;
            } catch (IndexOutOfBoundsException unused) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 70, "DowngradeOnUnencryptedMessageListener.java")).q("Nothing to cancel in DowngradeOnUnencryptedMessageQueue");
                return;
            }
        }
        if (messageCoreData.cF() || strAm == null) {
            return;
        }
        if (efne.b.h(strAm) || efne.e.h(strAm) || efne.c.h(strAm)) {
            bwmk bwmkVar = (bwmk) bwml.a.createBuilder();
            String string = messageCoreData.A().toString();
            bwmkVar.copyOnWrite();
            bwml bwmlVar = (bwml) bwmkVar.instance;
            string.getClass();
            bwmlVar.c = string;
            long jR = messageCoreData.r();
            bwmkVar.copyOnWrite();
            ((bwml) bwmkVar.instance).d = jR;
            aubq aubqVarW = messageCoreData.w();
            bwmkVar.copyOnWrite();
            bwml bwmlVar2 = (bwml) bwmkVar.instance;
            aubqVarW.getClass();
            bwmlVar2.h = aubqVarW;
            bwmlVar2.b |= 2;
            String str = messageCoreData.F().b;
            if (str != null) {
                bwmkVar.copyOnWrite();
                ((bwml) bwmkVar.instance).e = str;
            }
            String strValueOf = String.valueOf(String.valueOf(messageCoreData.A()));
            if (!optionalAh.isPresent() || !optionalAh.get().e().isPresent()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 95, "DowngradeOnUnencryptedMessageListener.java")).q("SenderIdentity not found. Unable to downgrade.");
                ((ains) this.c.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", bwvi.SKIP_DOWNGRADE_DUE_TO_MISSING_SENDER_IDENTITY.u);
                return;
            }
            String strConcat = "etouffee-downgrade-conversation-".concat(strValueOf);
            aubq aubqVar = (aubq) optionalAh.get().e().get();
            String str2 = aubqVar.d;
            bwmkVar.copyOnWrite();
            bwml bwmlVar3 = (bwml) bwmkVar.instance;
            bwmlVar3.g = aubqVar;
            bwmlVar3.b |= 1;
            bwmkVar.copyOnWrite();
            bwml bwmlVar4 = (bwml) bwmkVar.instance;
            str2.getClass();
            bwmlVar4.f = str2;
            bwml bwmlVar5 = (bwml) bwmkVar.build();
            String str3 = strConcat + "-" + messageCoreData.aB();
            bwmm bwmmVar = this.b;
            caxr caxrVar = new caxr();
            caxrVar.b = str3;
            caxrVar.d = str3;
            ((cazj) bwmmVar.a.b()).g(cbcu.g("downgrade_on_unencrypted_message", bwmlVar5, caxrVar.a()));
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) {
    }
}
