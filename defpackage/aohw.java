package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aohw {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final Context d;

    public aohw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Context context) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = context;
    }

    public final void a(int i, alqm alqmVar) {
        ((crqu) this.a.b()).a(i).l(this.d.getString(R.string.mms_phone_number_pref_key), alqmVar.j());
        ((ayge) this.b.b()).b().K();
        ((ayqf) this.c.b()).a(i).s();
    }
}
