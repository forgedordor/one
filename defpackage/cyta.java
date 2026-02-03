package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyta {
    public final avmp a;
    public final fcsu b;
    public final fcsu c;

    public cyta(avmp avmpVar, fcsu fcsuVar, fcsu fcsuVar2) {
        avmpVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = avmpVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final void a(Context context, int i) throws IOException {
        Intent intentA = aiiw.c(context, GaiaPairingVerificationActivity.class, "android.intent.action.VIEW").a();
        intentA.getClass();
        intentA.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        intentA.putExtra("prompt_launch_source", i);
        eiid.o(context, intentA);
        ((ains) this.b.b()).e("Bugle.Gaia.Verification.Prompt.Launched", 2);
    }
}
