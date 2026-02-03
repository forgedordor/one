package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dpxs extends dpxo {
    public dpxr ba;

    public dpxs(int i, dpxp dpxpVar) {
        super(Integer.valueOf(i), dpxpVar);
    }

    public abstract dpyb aV();

    public final dpxr bT() {
        dpxr dpxrVar = this.ba;
        if (dpxrVar != null) {
            return dpxrVar;
        }
        toString();
        throw new IllegalStateException(toString().concat(" hasn't been bound to a search handler"));
    }

    protected final String bU() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle.getString("search");
        }
        return null;
    }

    @Override // defpackage.dpxo
    public final void gy() {
        dpyb dpybVarAV;
        dpxz dpxzVarD;
        dpxo.bR(this);
        if (this.Q == null || (dpybVarAV = aV()) == null || (dpxzVarD = dpybVarAV.d()) == null) {
            return;
        }
        dpxzVarD.a();
    }
}
