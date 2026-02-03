package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxy implements dfxx {
    private final dgtg b;
    private dgis c;

    public dfxy(Context context, dgtg dgtgVar) {
        this.b = dgtgVar;
        dhka.i(context);
        dhka.i(context);
    }

    @Override // defpackage.dfxx
    public final int a() {
        dgis dgisVar = this.c;
        if (dgisVar != null) {
            return dgisVar.c();
        }
        return 0;
    }

    @Override // defpackage.dfxx
    @Deprecated
    public final String b() {
        return (String) this.b.c().orElse(null);
    }

    @Override // defpackage.dfxx
    public final String c() {
        dgis dgisVar = this.c;
        if (dgisVar != null) {
            return dgisVar.n();
        }
        return null;
    }

    @Override // defpackage.dfxx
    public final String d() {
        dgis dgisVar = this.c;
        if (dgisVar != null) {
            return dgisVar.q();
        }
        return null;
    }

    @Override // defpackage.dfxx
    public final void e(dgis dgisVar) {
        this.c = dgisVar;
    }

    @Override // defpackage.dfxx
    public final boolean f() {
        dgis dgisVar = this.c;
        return dgisVar != null && dgisVar.C();
    }
}
