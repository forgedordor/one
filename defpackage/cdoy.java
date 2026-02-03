package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdoy extends fcyz implements fdat {
    final /* synthetic */ cdpb a;
    final /* synthetic */ Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoy(cdpb cdpbVar, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cdpbVar;
        this.b = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdoy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarJ = cdpb.a.j();
        ekrwVarJ.X(eksq.a, "BugleTrustedContacts");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(this.b);
        ekrdVar.X(cqnc.S, "TrustedContactsSyncManager");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager", "logListenerNotRegistered", 118, "TrustedContactsSyncManager.kt")).q("Failed to register the listener.");
        ((ains) this.a.h.b()).c("Bugle.Kids.AllowlistUpdate.Listener.FailedToBeRegistered");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdoy(this.a, this.b, fcxyVar);
    }
}
