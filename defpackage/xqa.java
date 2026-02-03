package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqa extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ xqi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqa(xqi xqiVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xqiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        xqa xqaVar = new xqa(this.c, (fcxy) obj3);
        xqaVar.a = zBooleanValue;
        xqaVar.b = zBooleanValue2;
        return xqaVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        if (z) {
            ekrw ekrwVarE = xqi.a.e();
            ekrwVarE.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl$createUiData$1", "invokeSuspend", 91, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Scam alert card created.");
            return z2 ? (dlax) this.c.j.a() : (dlax) this.c.i.a();
        }
        ekrw ekrwVarE2 = xqi.a.e();
        ekrwVarE2.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl$createUiData$1", "invokeSuspend", 95, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Scam alert card not shown because not eligible.");
        return null;
    }
}
