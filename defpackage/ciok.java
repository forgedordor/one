package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciok {
    public final fcsu a;
    private final aimb b;

    public ciok(aimb aimbVar, fcsu fcsuVar) {
        aimbVar.getClass();
        fcsuVar.getClass();
        this.b = aimbVar;
        this.a = fcsuVar;
    }

    public final void a(encn encnVar) {
        ailn ailnVarA = this.b.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.MMS_GROUP_UPGRADE_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cg = encnVar;
        ellhVar.h |= 131072;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MMS_GROUP_UPGRADE_EVENTS);
    }

    public final void b(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        enbz enbzVar = (enbz) encn.b.createBuilder();
        enbzVar.getClass();
        enuu.b(((aika) this.a.b()).b(conversationIdType), enbzVar);
        enuu.c(3, enbzVar);
        enuu.e(3, enbzVar);
        enuu.d(3, enbzVar);
        a(enuu.a(enbzVar));
    }

    public final void c(ConversationIdType conversationIdType, int i, int i2, int i3) {
        enbz enbzVar = (enbz) encn.b.createBuilder();
        enbzVar.getClass();
        enuu.b(((aika) this.a.b()).b(conversationIdType), enbzVar);
        enuu.c(8, enbzVar);
        enuu.g(enbzVar);
        enbzVar.copyOnWrite();
        encn encnVar = (encn) enbzVar.instance;
        encnVar.n = i - 1;
        encnVar.c |= 256;
        encb encbVar = (encb) encc.a.createBuilder();
        encbVar.getClass();
        int iA = cnma.a(i2);
        encbVar.copyOnWrite();
        encc enccVar = (encc) encbVar.instance;
        enccVar.c = iA - 1;
        enccVar.b |= 1;
        int iA2 = cnma.a(i2 - i3);
        encbVar.copyOnWrite();
        encc enccVar2 = (encc) encbVar.instance;
        enccVar2.d = iA2 - 1;
        enccVar2.b |= 4;
        evsn evsnVarBuild = encbVar.build();
        evsnVarBuild.getClass();
        enbzVar.copyOnWrite();
        encn encnVar2 = (encn) enbzVar.instance;
        encnVar2.m = (encc) evsnVarBuild;
        encnVar2.c |= 128;
        a(enuu.a(enbzVar));
    }
}
