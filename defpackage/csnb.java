package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnb {
    public static final Intent a;
    public final Context b;
    public final fcsu c;

    static {
        Intent intent = new Intent("android.intent.action.VIEW");
        Object objE = crtr.I.e();
        objE.getClass();
        intent.setData(Uri.parse((String) objE));
        intent.setPackage("com.android.vending");
        intent.addFlags(268468224);
        a = intent;
    }

    public csnb(Context context, fcsu fcsuVar) {
        context.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = fcsuVar;
    }
}
