package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahen extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public ahen(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ahen ahenVar = new ahen((fcxy) obj3);
        ahenVar.a = (ahes) obj;
        ahenVar.b = zBooleanValue;
        return ahenVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        if (!this.b || obj2 == null) {
            return null;
        }
        ekrw ekrwVarH = aher.a.h();
        ekrwVarH.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$uiData$2$1", "invokeSuspend", 89, "SendingAsUiAdapterImpl.kt")).q("User has draft text/attachments, showing sending as UI...");
        return obj2;
    }
}
