package com.google.android.libraries.stitch.debug.poke.stetho;

import android.app.Application;
import android.content.Context;
import defpackage.ecad;
import defpackage.ecae;
import defpackage.ecaf;
import defpackage.ecap;
import defpackage.ecaq;
import defpackage.rzf;
import defpackage.rzg;
import defpackage.rzi;
import defpackage.rzl;
import defpackage.rzm;
import defpackage.sae;
import defpackage.sah;
import defpackage.saj;
import defpackage.sam;
import defpackage.sas;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class StethoInitializer implements ecae {
    @Override // defpackage.ecae
    public final void a(Context context) {
        ecaq ecaqVar = ecaf.a;
        if (ecad.b) {
            rzi rziVar = new rzi(context);
            rziVar.b = new ecap(context);
            rzf rzfVar = new rzf(rziVar);
            Context context2 = rzfVar.b;
            sah sahVar = sah.a;
            Application application = (Application) context2.getApplicationContext();
            if (sahVar.d == null) {
                sae saeVar = new sae(application, sahVar);
                saeVar.a.registerActivityLifecycleCallbacks(saeVar.c);
                sahVar.d = saeVar;
            } else {
                rzl.d("Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!");
            }
            sam samVar = new sam("stetho_" + rzm.a() + "_devtools_remote", new saj(new rzg(rzfVar)));
            new sas("StethoListener-".concat(samVar.a), samVar).start();
        }
    }
}
