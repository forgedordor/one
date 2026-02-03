package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xpc extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ xph d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpc(xph xphVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = xphVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        xpc xpcVar = new xpc(this.d, (fcxy) obj4);
        xpcVar.a = (ajlk) obj;
        xpcVar.b = (aojm) obj2;
        xpcVar.c = zBooleanValue;
        return xpcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r5 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        if (!r5.p() || r5.c() != ajlj.ONE_ON_ONE || obj2 != aojm.ELIGIBLE || z) {
            return null;
        }
        ekrw ekrwVarH = xph.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl$flow$1", "invokeSuspend", 79, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Showing sticky toolstone for manual satellite connection.");
        return (dlls) this.d.i.a();
    }
}
