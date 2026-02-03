package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyd implements adaq {
    private cpdw a;

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        this.a.g(true != adaoVar.Z() ? 8 : 0);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.a = new cpdw(view, R.id.pin_to_top_view_stub, R.id.pin_to_top);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        adanVar.k(acyxVar.af());
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return adaoVar.Z() != adaoVar2.Z();
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
