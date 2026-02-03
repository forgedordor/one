package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssa extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ ssb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssa(MessageCoreData messageCoreData, ssb ssbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = messageCoreData;
        this.e = ssbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ssa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fdep fdepVar;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            Object obj3 = this.b;
            obj2 = this.a;
            fctl.b(obj);
            fdepVar = obj3;
        } else {
            fctl.b(obj);
            fdeq fdeqVar = new fdeq(fcva.ax(this.d.M()), true, new fdap() { // from class: sry
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj4;
                    boolean z = false;
                    if (messagePartCoreData.aY() && messagePartCoreData.t() != null && (messagePartCoreData.J().b & 2) == 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            ssb ssbVar = this.e;
            fdep fdepVar2 = new fdep(fdeqVar);
            obj2 = ssbVar;
            fdepVar = fdepVar2;
        }
        while (fdepVar.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) fdepVar.next();
            ((ekrd) ssb.a.h().h("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener$queueForAmplitude$1", "invokeSuspend", 96, "AmplitudeTriggerListener.kt")).t("Triggering automatic AudioLevels calculation of message part %s.", messagePartCoreData.W());
            ssb ssbVar2 = (ssb) obj2;
            fcyh fcyhVarA = eicg.a(ssbVar2.b);
            srz srzVar = new srz(null, messagePartCoreData, ssbVar2);
            this.a = obj2;
            this.b = fdepVar;
            this.c = 1;
            if (fdin.a(fcyhVarA, srzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ssa(this.d, this.e, fcxyVar);
    }
}
