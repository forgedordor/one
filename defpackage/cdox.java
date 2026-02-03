package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdox extends fcyz implements fdat {
    final /* synthetic */ cdpb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdox(cdpb cdpbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cdpbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdox) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = cdpb.a.h();
        ekrwVarH.X(eksq.a, "BugleTrustedContacts");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "TrustedContactsSyncManager");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager", "logListenerRegistered", 107, "TrustedContactsSyncManager.kt")).q("Successfully registered the listener.");
        ((ains) this.a.h.b()).c("Bugle.Kids.AllowlistUpdate.Listener.Registered");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdox(this.a, fcxyVar);
    }
}
