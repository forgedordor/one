package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chru extends fcyz implements fdat {
    int a;
    Object b;
    final /* synthetic */ aujb c;
    final /* synthetic */ evuh d;
    final /* synthetic */ aubq e;
    final /* synthetic */ BugleConversationId f;
    final /* synthetic */ ekgb g;
    final /* synthetic */ aufx h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chru(fcxy fcxyVar, aujb aujbVar, evuh evuhVar, aubq aubqVar, BugleConversationId bugleConversationId, ekgb ekgbVar, aufx aufxVar) {
        super(2, fcxyVar);
        this.c = aujbVar;
        this.d = evuhVar;
        this.e = aubqVar;
        this.f = bugleConversationId;
        this.g = ekgbVar;
        this.h = aufxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aujb aujbVar;
        Object obj2;
        aujb aujbVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            try {
                if (i == 0) {
                    fctl.b(obj);
                    ((ekrd) aujb.a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$2", "invokeSuspend$$forInline", 186, "RcsProtoMessageSenderHandler.kt")).q("Preparing to send RCS proto message based on pre-fetched conversation properties.");
                    aujb aujbVar3 = this.c;
                    BugleConversationId bugleConversationId = this.f;
                    this.i = aujbVar3;
                    this.b = aujbVar3;
                    this.a = 1;
                    obj = aujbVar3.c(bugleConversationId, this);
                    if (obj != fcylVar) {
                        aujbVar = aujbVar3;
                        obj2 = aujbVar3;
                    }
                    return fcylVar;
                }
                if (i != 1) {
                    aujbVar2 = (aujb) this.i;
                    fctl.b(obj);
                    return aujbVar2.b((chvf) obj, null);
                }
                Object obj3 = this.b;
                aujb aujbVar4 = (aujb) this.i;
                fctl.b(obj);
                aujbVar = aujbVar4;
                obj2 = obj3;
                ajts ajtsVar = (ajts) obj;
                ekgb ekgbVar = this.g;
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
                Iterator<E> it = ekgbVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ResolvedRecipient) it.next()).g());
                }
                asrg asrgVarA = ((aujb) obj2).a(ajtsVar, ekfv.a(arrayList));
                efnn efnnVar = aujbVar.e;
                evuh evuhVar = this.d;
                Class<?> cls = evuhVar.getClass();
                int i2 = fdcj.a;
                chfd chfdVar = new chfd(evuhVar, new fdbi(chrh.class), efnnVar.b(new fdbi(cls)).b);
                aubq aubqVar = this.e;
                aufx aufxVar = this.h;
                this.i = aujbVar;
                this.b = null;
                this.a = 2;
                obj = aujbVar.g(chfdVar, asrgVarA, aubqVar, aufxVar, true, this);
                if (obj != fcylVar) {
                    aujbVar2 = aujbVar;
                    return aujbVar2.b((chvf) obj, null);
                }
                return fcylVar;
            } catch (Exception e) {
                ((ekrd) ((ekrd) aujb.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$2", "invokeSuspend$$forInline", 232, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                return cbcw.k();
            }
        } catch (Exception e2) {
            ((ekrd) ((ekrd) aujb.a.j()).g(e2).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$2", "invokeSuspend$$forInline", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
            return cbcw.k();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chru chruVar = new chru(fcxyVar, this.c, this.d, this.e, this.f, this.g, this.h);
        chruVar.i = obj;
        return chruVar;
    }
}
