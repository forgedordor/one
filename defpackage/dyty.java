package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyty {
    private static final String a = String.valueOf(dyty.class.getName()).concat(".SELECTED_ACCOUNT_ID");
    private final dytx b;

    public dyty(dytx dytxVar) {
        this.b = dytxVar;
    }

    public final void a(Bundle bundle) {
        ((dyrq) this.b).a.b = bundle.getString(a);
    }

    public final void b(Bundle bundle) {
        dyrq dyrqVar = (dyrq) this.b;
        Object objA = dyrqVar.b.a();
        if (objA == null) {
            bundle.remove(a);
        } else {
            bundle.putString(a, ((dyrm) dyrqVar.f).a.b(objA));
        }
    }
}
