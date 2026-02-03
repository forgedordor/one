package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aces extends fcyz implements fdat {
    final /* synthetic */ acex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aces(acex acexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = acexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aces) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = acex.a.h();
        ekrwVarH.X(eksq.a, "BugleAccountSignOut");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/gaia/signoutaccount/screen/SignOutAccountScreenUiAdapterImpl$onNegativeClick$1", "invokeSuspend", 99, "SignOutAccountScreenUiAdapterImpl.kt")).q("User clicked negative button on sign out screen");
        acex acexVar = this.a;
        ((ains) ((acei) acexVar.f.b()).b.b()).c("Bugle.SignOutAccount.BacksOutOfSignOutFlow.Count");
        acexVar.e.h(agbf.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aces(this.a, fcxyVar);
    }
}
