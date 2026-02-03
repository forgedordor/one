package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.util.Log;
import defpackage.dcfm;
import defpackage.dcfq;
import defpackage.dclg;
import defpackage.dclh;
import defpackage.ddci;
import defpackage.dddd;
import defpackage.dddj;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OnPipClickListener extends SimpleGoogleHelpCallbacks {
    private final WeakReference a;
    boolean isToggling;

    OnPipClickListener(Activity activity, boolean z) {
        this.a = new WeakReference(activity);
        this.isToggling = z;
    }

    public ddci createGoogleHelpLauncher(Activity activity) {
        return new ddci(activity);
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public void onPipClick() {
        if (this.isToggling) {
            Log.d("gH_OnPipClickListener", "Double click gets discarded.");
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            Log.d("gH_OnPipClickListener", "Calling activity is null. Pip click discarded.");
            return;
        }
        this.isToggling = true;
        Object obj = createGoogleHelpLauncher(activity).b.get();
        Activity activity2 = ((dddj) obj).a;
        dclh.m(activity2);
        dcfq dcfqVar = ((dcfm) obj).k;
        dddd ddddVar = new dddd(dcfqVar, new WeakReference(activity2));
        dcfqVar.b(ddddVar);
        dclg.b(ddddVar);
    }

    public OnPipClickListener(WeakReference<Activity> weakReference) {
        this.a = weakReference;
    }
}
