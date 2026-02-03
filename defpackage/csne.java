package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.util.spam.spatula.safetycoremissing.SafetycoreInstallRedirectActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csne extends cghe {
    public final Context a;
    public final fcsu b;
    private final fdjx c;

    public csne(Context context, fcsu fcsuVar, fdjx fdjxVar) {
        context.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fdjxVar;
    }

    @Override // defpackage.cghe
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new csnc(this, null));
    }

    @Override // defpackage.cgiw
    public final cgkq c() {
        return new csnd();
    }

    @Override // defpackage.cgiw
    public final cglf d() {
        return cglf.NT_SAFETYCORE_MISSING;
    }

    @Override // defpackage.cgiw
    public final eiju e() {
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final String g() {
        return "recommendation";
    }

    public final Intent h() {
        return new Intent(this.a, (Class<?>) SafetycoreInstallRedirectActivity.class);
    }
}
