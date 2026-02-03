package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjnz extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ cjob c;
    final /* synthetic */ aubq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjnz(ConversationIdType conversationIdType, cjob cjobVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = conversationIdType;
        this.c = cjobVar;
        this.d = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjnz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = cjob.a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/rcs/participant/ConversationDraftingUpdater$scheduleIsOnlineCheck$1$1", "invokeSuspend", 169, "ConversationDraftingUpdater.kt")).t("Scheduling is online check for conversationId %s", this.b.a());
            awjh awjhVar = (awjh) this.c.e.b();
            aubq aubqVar = this.d;
            this.a = 1;
            obj = awjhVar.c(aubqVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cjob cjobVar = this.c;
        cjof cjofVar = (cjof) cjog.a.createBuilder();
        ConversationIdType conversationIdType = this.b;
        cjofVar.copyOnWrite();
        cjog cjogVar = (cjog) cjofVar.instance;
        cjogVar.b |= 2;
        cjogVar.d = conversationIdType.a;
        awky awkyVarB = awjj.b((awjl) obj);
        cjofVar.copyOnWrite();
        cjog cjogVar2 = (cjog) cjofVar.instance;
        cjogVar2.c = awkyVarB;
        cjogVar2.b |= 1;
        cjog cjogVar3 = (cjog) cjofVar.build();
        caxr caxrVar = new caxr();
        Object objB = cjobVar.k.a.b();
        objB.getClass();
        Duration durationOfSeconds = Duration.ofSeconds(((Number) objB).longValue());
        durationOfSeconds.getClass();
        caxrVar.c = durationOfSeconds;
        ((cazj) cjobVar.i.a.b()).a(cbcu.g("conversation_latcher", cjogVar3, caxrVar.a()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjnz(this.b, this.c, this.d, fcxyVar);
    }
}
