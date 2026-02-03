package defpackage;

import android.R;
import com.google.android.apps.messaging.joinvialink.JoinViaLinkActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adjz implements efzm {
    final /* synthetic */ adka a;

    public adjz(adka adkaVar) {
        this.a = adkaVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        ((eksl) adka.a.h()).q("Attempted to launch join by link.");
        JoinViaLinkActivity joinViaLinkActivity = this.a.b;
        abl.a(joinViaLinkActivity);
        efwo efwoVarA = efzkVar.a();
        adkl adklVar = new adkl();
        eyhj.e(adklVar);
        ehok.b(adklVar, efwoVarA);
        cg cgVar = new cg(joinViaLinkActivity.a());
        cgVar.D(R.id.content, adklVar);
        cgVar.p(adklVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.a.c.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
