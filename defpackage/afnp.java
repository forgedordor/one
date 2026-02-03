package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afnp implements afnm {
    public final fcsu a;
    public final asgv b;
    public final fduf c;
    public final dloh d;
    public final afob e;
    private final Context f;
    private final fdjx g;
    private final afns h;
    private final afus i;

    public afnp(Context context, fdjx fdjxVar, afus afusVar, afob afobVar, fcsu fcsuVar, asgv asgvVar) {
        context.getClass();
        fdjxVar.getClass();
        afusVar.getClass();
        afobVar.getClass();
        fcsuVar.getClass();
        this.f = context;
        this.g = fdjxVar;
        this.i = afusVar;
        this.e = afobVar;
        this.a = fcsuVar;
        this.b = asgvVar;
        this.c = fdvf.a(false);
        String string = context.getString(R.string.multi_share_edit_message_top_app_bar_title);
        string.getClass();
        dlnp dlnpVar = new dlnp(string, null, null, false, null, null, null, 254);
        String string2 = context.getString(R.string.action_back);
        string2.getClass();
        dloh dlohVar = new dloh(dlnpVar, new dihq(string2, djrr.q, false, false, false, false, null, false, null, new fdae() { // from class: afnn
            @Override // defpackage.fdae
            public final Object invoke() {
                afnp afnpVar = this.a;
                afxx.d((afxx) afnpVar.a.b(), 12, 0, 0, 6);
                afnpVar.c.f(false);
                return fctx.a;
            }
        }, 1020), null, false, false, null, null, 116);
        this.d = dlohVar;
        this.h = new afns(false, fcvo.a, afobVar.a(), dlohVar, new afnr(asgvVar.a()));
    }

    @Override // defpackage.afnm
    public final fdvc a() {
        return fdtg.b(new fdua(this.c, this.i.a, new afno(this, null)), this.g, fdur.a(0L, 3), this.h);
    }

    @Override // defpackage.afnm
    public final void b() {
        this.c.f(true);
    }
}
