package defpackage;

import android.R;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aflw implements efzm {
    final /* synthetic */ aflx a;
    private final Bundle b;

    public aflw(aflx aflxVar, Bundle bundle) {
        this.a = aflxVar;
        this.b = bundle;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        efwo efwoVarA = efzkVar.a();
        afmb afmbVar = new afmb();
        eyhj.e(afmbVar);
        ehok.b(afmbVar, efwoVarA);
        Bundle bundle = afmbVar.m;
        bundle.getClass();
        bundle.putAll(this.b);
        cg cgVar = new cg(this.a.a.a());
        cgVar.s(R.id.content, afmbVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((abxv) this.a.b.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
