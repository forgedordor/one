package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxp {
    private final add a;

    public daxp(add addVar) {
        addVar.getClass();
        this.a = addVar;
    }

    public final void a(daxo daxoVar, egbs egbsVar) {
        daxoVar.getClass();
        Intent intentPutExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", daxoVar.d).putExtra("extra.accountName", egbsVar.g);
        intentPutExtra.getClass();
        int iOrdinal = daxoVar.ordinal();
        if (iOrdinal == 0) {
            intentPutExtra.putExtra("extra.screen.cau", "true");
            intentPutExtra.putExtra("extra.screen.hostId", "amo").getClass();
        } else if (iOrdinal == 1) {
            intentPutExtra.putExtra("extra.screen.cau", "true");
            intentPutExtra.putExtra("extra.screen.hostId", "am").getClass();
        } else if (iOrdinal == 2) {
            intentPutExtra.putExtra("extra.screen.source", "messages_onboarding").getClass();
        }
        this.a.c(intentPutExtra);
    }
}
