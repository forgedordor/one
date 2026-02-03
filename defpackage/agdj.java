package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdj implements afyw {
    private static final eksp a = eksp.c("BugleLinkify");
    private final Context b;
    private final cmwe c;
    private final dakl d;

    public agdj(Context context, cmwe cmweVar, dakl daklVar) {
        daklVar.getClass();
        this.b = context;
        this.c = cmweVar;
        this.d = daklVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Uri uri = ((agdi) afzvVar).a;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (this.c.a()) {
            intent.addFlags(4096);
        }
        Context context = this.b;
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        ((eksl) a.h()).t("Navigating to uri: %s", cqcv.d(uri));
        this.d.o(context, intent);
        return fctx.a;
    }
}
