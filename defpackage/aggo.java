package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggo implements afyw {
    private static final eksp a = eksp.c("Bugle");
    private final Context b;
    private final cmwe c;
    private final dakl d;

    public aggo(Context context, cmwe cmweVar, dakl daklVar) {
        daklVar.getClass();
        this.b = context;
        this.c = cmweVar;
        this.d = daklVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Intent intentA = cwsu.a("android.intent.action.VIEW", ((aggn) afzvVar).a, null);
        intentA.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (this.c.a()) {
            intentA.addFlags(4096);
        }
        ((eksl) a.h()).q("Navigating to calendar");
        this.d.o(this.b, intentA);
        return fctx.a;
    }
}
