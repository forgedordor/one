package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ven extends fcyz implements fdau {
    /* synthetic */ Object a;

    public ven(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ven venVar = new ven((fcxy) obj3);
        venVar.a = (Throwable) obj2;
        return venVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) ((ekrd) veo.a.i()).g((Throwable) this.a).h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$3", "invokeSuspend", 99, "ActionsUiAdapterImpl.kt")).q("Ignoring exception from Action flow to avoid breaking all actions.");
        return fctx.a;
    }
}
