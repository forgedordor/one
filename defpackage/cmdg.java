package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmdg extends fcyz implements fdat {
    final /* synthetic */ cmdi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmdg(cmdi cmdiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmdiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmdg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = cmdi.a.h();
        ekrwVarH.X(eksq.a, "BugleNotifications");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper$refreshNotifications$1$1", "invokeSuspend", 88, "ScreenDetectionHelper.kt")).q("Refreshing notification for ScreenDetectionHelper");
        cmdi cmdiVar = this.a;
        eieu eieuVarH = eiiy.h("ScreenDetectionHelper.refreshNotifications.notificationDirector");
        try {
            ((cgpi) cmdiVar.c.b()).c();
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmdg(this.a, fcxyVar);
    }
}
