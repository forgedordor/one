package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ycs extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ yek e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycs(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ycs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fduf fdufVar;
        yek yekVar;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.d;
        try {
            if (r1 != 0) {
                ?? r0 = this.c;
                Object obj2 = this.b;
                ?? r5 = this.a;
                fctl.b(obj);
                fdufVar = r0;
                r1 = obj2;
                yekVar = r5;
            } else {
                fctl.b(obj);
                yek yekVar2 = this.e;
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h("PagedMessageListUiAdapterImpl.SpatulaSettingsStartup");
                ((ekrd) yek.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$2", "invokeSuspend", 199, "PagedMessageListUiAdapterImpl.kt")).q("Updating spatula settings");
                fduf fdufVar2 = yekVar2.I;
                csmf csmfVar = (csmf) yekVar2.D.b();
                efwo efwoVar = yekVar2.B;
                this.a = yekVar2;
                this.b = eieuVarH;
                this.c = fdufVar2;
                this.d = 1;
                Object objC = csmfVar.c(efwoVar, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                fdufVar = fdufVar2;
                obj = objC;
                r1 = eieuVarH;
                yekVar = yekVar2;
            }
            fdufVar.f(Boolean.valueOf(((csmb) obj).a));
            ((ekrd) yek.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$2", "invokeSuspend", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "PagedMessageListUiAdapterImpl.kt")).t("Spatula settings updated to %s", yekVar.I.c());
            fczl.a(r1, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ycs(this.e, fcxyVar);
    }
}
