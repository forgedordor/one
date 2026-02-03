package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afll extends fcyz implements fdat {
    public afll(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new afll((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = afln.a.h();
        ekrwVarH.X(eksq.a, "BugleMessageDetails");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/messagedetails/screen/MessageDetailsScreenUiAdapter$createUiDataFlow$1", "invokeSuspend", 117, "MessageDetailsScreenUiAdapter.kt")).q("Collected TopbarUiData");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afll(fcxyVar);
    }
}
