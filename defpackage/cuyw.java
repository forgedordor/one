package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuyw implements efzm {
    final /* synthetic */ cuyx a;
    private final fcsu b;

    public cuyw(cuyx cuyxVar, fcsu fcsuVar) {
        this.a = cuyxVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        cg cgVar = new cg(this.a.a.a());
        efwo efwoVarA = efzkVar.a();
        cuot cuotVar = new cuot();
        eyhj.e(cuotVar);
        ehok.b(cuotVar, efwoVarA);
        cgVar.x(R.id.fragment_container, cuotVar, "ChatIdentitySettingsSelectionFragmentPeer");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.b.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
