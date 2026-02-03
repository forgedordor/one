package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdd implements afyw {
    private final Context a;
    private final avmp b;

    public agdd(Context context, avmp avmpVar) {
        avmpVar.getClass();
        this.a = context;
        this.b = avmpVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agdb agdbVar = (agdb) afzvVar;
        Activity activityA = daiy.a(this.a);
        if (activityA == null) {
            throw new IllegalArgumentException("HomeNavigationHandler must be created with an activity context.");
        }
        avmp avmpVar = this.b;
        agdc agdcVar = agdbVar.a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("via_share_intent", true);
        avmpVar.l(activityA, bundle);
        activityA.finish();
        return fctx.a;
    }
}
