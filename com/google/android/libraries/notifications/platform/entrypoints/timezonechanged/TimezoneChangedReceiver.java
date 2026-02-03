package com.google.android.libraries.notifications.platform.entrypoints.timezonechanged;

import android.content.Context;
import defpackage.dxhk;
import defpackage.dxhl;
import defpackage.dxkg;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TimezoneChangedReceiver extends dxhk {
    @Override // defpackage.dxhk
    public final dxhl a(Context context) {
        fcsu fcsuVar = (fcsu) dxkg.a(context).fH().get("timezonechanged");
        dxhl dxhlVar = fcsuVar != null ? (dxhl) fcsuVar.b() : null;
        if (dxhlVar != null) {
            return dxhlVar;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
