package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgfj implements ebqw {
    private final dgfg a;

    public dgfj(dgfg dgfgVar) {
        this.a = dgfgVar;
    }

    @Override // defpackage.ebqw
    public final void a(String str, Throwable th) {
        Object[] objArr = {th.getMessage()};
        dgfg dgfgVar = this.a;
        dhja.h(dgfgVar.m, "Transport error while receiving a message: %s", objArr);
        Bundle bundle = new Bundle();
        bundle.putString("transport_id", str);
        bundle.putSerializable("transport_error_cause", th);
        dgfgVar.s(5, bundle);
    }
}
