package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dalj {
    private static final cqce c = cqce.g("Bugle", "ChangeDefaultSmsAppHelper");
    public final Context a;
    public final crnp b;
    private final dakl d;

    public dalj(Context context, crnp crnpVar, dakl daklVar) {
        this.a = context;
        this.b = crnpVar;
        this.d = daklVar;
    }

    public final void a() {
        Context context = this.a;
        crnp crnpVar = this.b;
        boolean zE = crnpVar.e();
        boolean zJ = craf.j(context);
        boolean zD = crnpVar.d();
        if (!zE) {
            this.d.p(R.string.sms_disabled);
        } else if (!zJ) {
            this.d.p(R.string.sms_disallowed_message);
        } else if (!zD) {
            this.d.p(R.string.requires_default_sms_app);
        }
        cqbd cqbdVarE = c.e();
        cqbdVarE.I("Unsatisfied action condition.");
        cqbdVarE.B("isSmsCapable", zE);
        cqbdVarE.B("isSmsAllowedForUser", zJ);
        cqbdVarE.B("isDefaultSmsApp", zD);
        cqbdVarE.r();
    }
}
