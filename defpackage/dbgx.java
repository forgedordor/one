package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgx implements dbgu {
    private final Context a;

    public dbgx(Context context) {
        this.a = context;
    }

    @Override // defpackage.dbgu
    public final dbgt a(String str, dbgp dbgpVar, dbgs dbgsVar) {
        if (new dbgp().equals(dbgpVar)) {
            return new dbgw(this.a, str, dbgsVar);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(dbgpVar.toString()));
    }
}
