package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfo extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xfx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfo(fcxy fcxyVar, xfx xfxVar) {
        super(3, fcxyVar);
        this.c = xfxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xfo xfoVar = new xfo((fcxy) obj3, this.c);
        xfoVar.d = (fdpm) obj;
        xfoVar.b = obj2;
        return xfoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r9 = this.d;
            Boolean bool = (Boolean) this.b;
            boolean zBooleanValue = bool.booleanValue();
            ekrw ekrwVarH = xfx.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter$createUiData$$inlined$flatMapLatest$1", "invokeSuspend", 121, "CameraGalleryInputUiAdapter.kt")).t("CameraGalleryInputUiAdapter shouldShow %s", bool);
            if (zBooleanValue) {
                xfx xfxVar = this.c;
                fdpuVar = new xfs(xfxVar.l, xfxVar);
            } else {
                fdpuVar = new fdpu(null);
            }
            this.a = 1;
            if (fdpy.c(r9, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
