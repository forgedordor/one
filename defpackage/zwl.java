package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwl extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ zwo c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ cljh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwl(boolean z, zwo zwoVar, ConversationIdType conversationIdType, cljh cljhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = zwoVar;
        this.d = conversationIdType;
        this.e = cljhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zwl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (this.b) {
                ((cliy) this.c.b.b()).i();
            }
            eiju eijuVarB = this.c.h.i().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final zwo zwoVar = this.c;
        final ConversationIdType conversationIdType = this.d;
        final cljh cljhVar = this.e;
        final ekgb ekgbVar = (ekgb) obj;
        zwoVar.g.d("SatelliteToolstoneUpdater#handleSatelliteConnectionStateChange", new Runnable() { // from class: zwk
            @Override // java.lang.Runnable
            public final void run() {
                MessageIdType messageIdTypeC;
                ekrg ekrgVar = zwo.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater$handleSatelliteConnectionStateChange$1", "invokeSuspend$lambda$0", 79, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#handleConnectionTypeChange executing...");
                ekgb ekgbVar2 = ekgbVar;
                if (ekgbVar2.size() == 1) {
                    ekgbVar2.getClass();
                    if (alpd.a(((ResolvedRecipient) fcva.X(ekgbVar2)).g().n()) || alpd.b(((ResolvedRecipient) fcva.X(ekgbVar2)).g().n())) {
                        return;
                    }
                }
                cljh cljhVar2 = cljhVar;
                ConversationIdType conversationIdType2 = conversationIdType;
                zwo zwoVar2 = zwoVar;
                fcsu fcsuVar = zwoVar2.e;
                MessageCoreData messageCoreDataR = ((baxe) fcsuVar.b()).r(conversationIdType2);
                int iOrdinal = cljhVar2.ordinal();
                if (iOrdinal == 1) {
                    ekgbVar2.getClass();
                    if (messageCoreDataR == null) {
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleSatellite");
                        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "insertToolstone", 120, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#onSatellite executing ...");
                        int i2 = 251;
                        if (ekgbVar2.size() == 1 && ((ResolvedRecipient) fcva.X(ekgbVar2)).g().u()) {
                            i2 = 239;
                        }
                        MessageCoreData messageCoreDataO = ((baxe) fcsuVar.b()).o(conversationIdType2);
                        if (messageCoreDataO == null || (messageIdTypeC = messageCoreDataO.C()) == null) {
                            messageIdTypeC = bary.a;
                        }
                        cpdn cpdnVar = (cpdn) zwoVar2.d.b();
                        messageIdTypeC.getClass();
                        cpdnVar.d(conversationIdType2, messageIdTypeC, i2);
                        ekrw ekrwVarH3 = ekrgVar.h();
                        ekrwVarH3.X(ekrzVar, "BugleSatellite");
                        ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "insertToolstone", 134, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#onSatellite toolstone updated.");
                    }
                } else if (iOrdinal != 2) {
                    ekrw ekrwVarH4 = ekrgVar.h();
                    ekrwVarH4.X(ekrzVar, "BugleSatellite");
                    ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "removeToolstone", 143, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#offSatellite executing...");
                    if (messageCoreDataR != null) {
                        if (((baxe) fcsuVar.b()).s(conversationIdType2) == null) {
                            ekrw ekrwVarJ = ekrgVar.j();
                            ekrwVarJ.X(ekrzVar, "BugleSatellite");
                            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "removeToolstone", 152, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#offSatellite not removing toolstone because there are no other visible messages");
                        } else {
                            cpdn cpdnVar2 = (cpdn) zwoVar2.d.b();
                            MessageIdType messageIdTypeC2 = messageCoreDataR.C();
                            messageIdTypeC2.getClass();
                            cpdnVar2.b(messageIdTypeC2);
                            ekrw ekrwVarH5 = ekrgVar.h();
                            ekrwVarH5.X(ekrzVar, "BugleSatellite");
                            ((ekrd) ekrwVarH5.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "removeToolstone", 158, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#offSatellite Toolstone deleted.");
                        }
                    }
                }
                ekrw ekrwVarH6 = ekrgVar.h();
                ekrwVarH6.X(ekrzVar, "BugleSatellite");
                ((ekrd) ekrwVarH6.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater$handleSatelliteConnectionStateChange$1", "invokeSuspend$lambda$0", 109, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#handleConnectionTypeChange executed.");
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zwl(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
