package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xrm extends fcyz implements fdat {
    int a;
    final /* synthetic */ xrp b;
    final /* synthetic */ xsi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrm(xrp xrpVar, xsi xsiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xrpVar;
        this.c = xsiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xrm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xrp xrpVar = this.b;
            xsi xsiVar = this.c;
            this.a = 1;
            ((ekrd) xrp.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl", "updateSelectedTheme$third_party_java_src_android_app_bugle_phone_java_com_google_android_apps_messaging_conversation2_customthemes_ui_adapter_impl_AUTO_DEPS_ORIGINAL", 83, "CustomThemesSelectionUiAdapterImpl.kt")).t("Update selected theme to theme id: %s", xsiVar != null ? new Integer(xsiVar.a) : null);
            eiju eijuVarU = xrpVar.f.u(xrpVar.b, new xro(xsiVar, xrpVar));
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
        return new xrm(this.b, this.c, fcxyVar);
    }
}
