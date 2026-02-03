package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.multishare.MultiShareActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aflx {
    public final MultiShareActivity a;
    public final fcsu b;
    private final fcsu c;

    public aflx(MultiShareActivity multiShareActivity, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = multiShareActivity;
        this.c = fcsuVar;
        this.b = fcsuVar2;
        egap egapVarE = egaq.e(multiShareActivity);
        egapVarE.d(egkc.class);
        egapVarE.d(eghx.class);
        Bundle extras = multiShareActivity.getIntent().getExtras();
        extras = extras == null ? new Bundle() : extras;
        vwp.b(extras, vwo.b);
        ((efxf) fcsuVar.b()).e(new aflw(this, extras));
        ((efxf) fcsuVar.b()).g(egapVarE.a());
    }
}
