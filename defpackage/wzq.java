package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzq extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public wzq(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wzq wzqVar = new wzq((fcxy) obj3);
        wzqVar.a = zBooleanValue;
        wzqVar.b = (vzy) obj2;
        return wzqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ekrw ekrwVarH = xac.a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$enabledFlow$3", "invokeSuspend", 111, "SendButtonUiAdapterImpl.kt")).G("SendButtonUiAdapterImpl.enabledFlow sendingInProgress %s, disabledReason %s", z, obj2);
        boolean z2 = false;
        if (!z && obj2 == null) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
