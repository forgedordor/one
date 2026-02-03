package defpackage;

import android.R;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cthx implements efzm {
    final /* synthetic */ cthy a;
    private final Bundle b;

    public cthx(cthy cthyVar, Bundle bundle) {
        this.a = cthyVar;
        this.b = bundle;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        ctig ctigVarA = ctig.a(efzkVar.a());
        ctigVarA.at(this.b);
        cg cgVar = new cg(this.a.a.a());
        cgVar.s(R.id.content, ctigVarA);
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
