package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyq implements adaq {
    private cpdw a;

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        this.a.g(adaoVar.f());
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.a = new cpdw(view, R.id.work_profile_icon, R.id.work_profile_icon, R.layout.work_profile_icon);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        adanVar.q(true != acyxVar.ac() ? 8 : 0);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return adaoVar2.f() != adaoVar.f();
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
