package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xrn extends fcyz implements fdat {
    int a;
    final /* synthetic */ xrp b;
    final /* synthetic */ xsi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrn(xrp xrpVar, xsi xsiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xrpVar;
        this.c = xsiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xrn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xrp xrpVar = this.b;
            xsi xsiVar = this.c;
            xsc xscVarB = xrpVar.b();
            this.a = 1;
            ((ekrd) xsc.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker", "updateSelectedTheme$third_party_java_src_android_app_bugle_phone_java_com_google_android_apps_messaging_conversation2_customthemes_theme_tracker_AUTO_DEPS_ORIGINAL", 122, "SelectedThemeTracker.kt")).t("Update selected theme to theme id: %s", xsiVar != null ? new Integer(xsiVar.a) : null);
            eiju eijuVarU = xscVarB.c.u(xscVarB.b, new xsb(xsiVar, xscVarB));
            eijuVarU.getClass();
            Object objC = fdxs.c(eijuVarU, this);
            if (objC != obj2) {
                objC = fctx.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xrn(this.b, this.c, fcxyVar);
    }
}
