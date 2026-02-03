package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aflm extends fcyz implements fdat {
    public aflm(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new aflm((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = afln.a.h();
        ekrwVarH.X(eksq.a, "BugleMessageDetails");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/messagedetails/screen/MessageDetailsScreenUiAdapter$createUiDataFlow$2", "invokeSuspend", 122, "MessageDetailsScreenUiAdapter.kt")).q("Collected MessageBubbleUiData");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aflm(fcxyVar);
    }
}
