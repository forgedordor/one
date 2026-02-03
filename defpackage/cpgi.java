package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpgi extends fcyz implements fdat {
    final /* synthetic */ cpgj a;
    final /* synthetic */ elki b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ elka d;
    final /* synthetic */ bvdk e;
    final /* synthetic */ bvdk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpgi(cpgj cpgjVar, elki elkiVar, ConversationIdType conversationIdType, elka elkaVar, bvdk bvdkVar, bvdk bvdkVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cpgjVar;
        this.b = elkiVar;
        this.c = conversationIdType;
        this.d = elkaVar;
        this.e = bvdkVar;
        this.f = bvdkVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpgi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cpgj cpgjVar = this.a;
        fcsu fcsuVar = cpgjVar.d;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return fctx.a;
        }
        elkh elkhVar = (elkh) this.b.toBuilder();
        long jB = ((aika) cpgjVar.c.b()).b(this.c);
        elkhVar.copyOnWrite();
        elki elkiVar = (elki) elkhVar.instance;
        elkiVar.b |= 65536;
        elkiVar.r = jB;
        elkhVar.copyOnWrite();
        elki elkiVar2 = (elki) elkhVar.instance;
        elkiVar2.e = 2;
        elkiVar2.b |= 1;
        elka elkaVar = this.d;
        elkhVar.copyOnWrite();
        elki elkiVar3 = (elki) elkhVar.instance;
        elkiVar3.f = elkaVar.u;
        elkiVar3.b = 2 | elkiVar3.b;
        int iH = bvdk.h(this.e);
        elkhVar.copyOnWrite();
        elki elkiVar4 = (elki) elkhVar.instance;
        elkiVar4.C = emtx.a(iH);
        elkiVar4.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        int iH2 = bvdk.h(this.f);
        elkhVar.copyOnWrite();
        elki elkiVar5 = (elki) elkhVar.instance;
        elkiVar5.D = emtx.a(iH2);
        elkiVar5.b |= 536870912;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONVERSATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elki elkiVar6 = (elki) elkhVar.build();
        elkiVar6.getClass();
        ellhVar2.m = elkiVar6;
        ellhVar2.b |= 8;
        ekrd ekrdVar = (ekrd) cpgj.a.h();
        ekrdVar.X(new ekrz("ConversationOrigin", elka.class, false, false), elkaVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/archive/ArchiveEventLogger$logConversationArchived$1", "invokeSuspend", 68, "ArchiveEventLogger.kt")).q("ConversationArchived");
        ((aimb) cpgjVar.b.b()).a().j(ellgVar, aioj.LOG_SPEC_ARCHIVE_STATUS_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpgi(this.a, this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
