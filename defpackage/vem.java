package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vem extends fcyz implements fdat {
    final /* synthetic */ vdy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vem(vdy vdyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vdyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vem) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) veo.a.i().h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$2", "invokeSuspend", 90, "ActionsUiAdapterImpl.kt")).t("Flow for %s did not emit within timeout. Initial null ActionUiData will be used until it emits.", this.a.getClass().getSimpleName());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vem(this.a, fcxyVar);
    }
}
