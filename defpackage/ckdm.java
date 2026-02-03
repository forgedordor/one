package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdm extends fcyz implements fdat {
    final /* synthetic */ ckdn a;
    final /* synthetic */ ckdv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckdm(fcxy fcxyVar, ckdn ckdnVar, ckdv ckdvVar) {
        super(2, fcxyVar);
        this.a = ckdnVar;
        this.b = ckdvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckdm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ckdv ckdvVar = this.b;
        boolean z = ckdvVar.d != null;
        if (!z) {
            ekrw ekrwVarF = ckdn.a.f();
            ekrwVarF.X(eksq.a, "BugleRcsEdits");
            ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/shared/rcsedit/analytics/transport/ClearcutIncomingEditsTransportLogger", "buildMessageEditInfo", 49, "ClearcutIncomingEditsTransportLogger.kt")).q("ClearcutIncomingEditsTransportLogger.buildMessageEditInfo with no editedMessageIdHeader");
        }
        boolean z2 = ckdvVar.e != null;
        if (!z2) {
            ekrw ekrwVarF2 = ckdn.a.f();
            ekrwVarF2.X(eksq.a, "BugleRcsEdits");
            ((ekrd) ekrwVarF2.h("com/google/android/apps/messaging/shared/rcsedit/analytics/transport/ClearcutIncomingEditsTransportLogger", "buildMessageEditInfo", 57, "ClearcutIncomingEditsTransportLogger.kt")).q("ClearcutIncomingEditsTransportLogger.buildMessageEditInfo with no editedAtTimestampHeader");
        }
        ckdn ckdnVar = this.a;
        long j = ckdvVar.a;
        emvv emvvVar = (emvv) emvw.a.createBuilder();
        emvvVar.getClass();
        enui.b(ckdvVar.b != null, emvvVar);
        enui.c(evxd.a(ckdvVar.c), emvvVar);
        emvx emvxVar = (emvx) emvy.a.createBuilder();
        emvxVar.getClass();
        enuj.c(z, emvxVar);
        enuj.b(z2, emvxVar);
        enuj.d(ckdvVar.f, emvxVar);
        enui.d(enuj.a(emvxVar), emvvVar);
        aiqx.b(ckdnVar.c, j, 4, null, null, null, null, enui.a(emvvVar), null, 188);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckdm ckdmVar = new ckdm(fcxyVar, this.a, this.b);
        ckdmVar.c = obj;
        return ckdmVar;
    }
}
