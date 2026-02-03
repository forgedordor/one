package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class civt extends fcyz implements fdat {
    int a;
    final /* synthetic */ civx b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civt(civx civxVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = civxVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((civt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmpv cmpvVar = (cmpv) this.b.o.b();
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            obj = cmpvVar.a(messageCoreData, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ekrw ekrwVarH = civx.a.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.f, this.c.F());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor$sendBestEffortDeliveryReport$1", "invokeSuspend", 1407, "IncomingRcsMessageProcessor.kt")).q("Best-effort delivery report sent");
        } else {
            ekrw ekrwVarJ = civx.a.j();
            ekrwVarJ.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.X(cqnc.f, this.c.F());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor$sendBestEffortDeliveryReport$1", "invokeSuspend", 1412, "IncomingRcsMessageProcessor.kt")).q("Failed to send best-effort delivery report");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new civt(this.b, this.c, fcxyVar);
    }
}
