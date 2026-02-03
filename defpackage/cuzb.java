package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuzb implements efzm {
    final /* synthetic */ cuzc a;
    private final fcsu b;

    public cuzb(cuzc cuzcVar, fcsu fcsuVar) {
        this.a = cuzcVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        efwo efwoVarA = efzkVar.a();
        culx culxVar = new culx();
        eyhj.e(culxVar);
        ehok.b(culxVar, efwoVarA);
        cg cgVar = new cg(this.a.a.a());
        cgVar.D(R.id.fragment_container, culxVar);
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
