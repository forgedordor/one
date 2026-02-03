package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agct implements afyw {
    private final Context a;

    public agct(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agcs agcsVar = (agcs) afzvVar;
        Activity activityA = daiy.a(this.a);
        if (activityA == null) {
            throw new IllegalArgumentException("ExitRenameGroupNavigationHandler must be created with an activity context.");
        }
        if (agcsVar.b) {
            einf.e(new agfe(agcsVar.a), activityA);
        } else {
            einf.e(agfd.a, activityA);
        }
        return fctx.a;
    }
}
