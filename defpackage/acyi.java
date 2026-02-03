package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyi implements adaq {
    private cpdw a;
    private final arpr b;

    public acyi(arpr arprVar) {
        this.b = arprVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        this.a.g(adaoVar.b());
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.a = new cpdw(view, R.id.snooze_notification_icon, R.id.snooze_notification_icon, R.layout.snooze_notification_icon_view);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        if (!this.b.a()) {
            adanVar.m(8);
        } else if (acyxVar.z() == cgrc.d || acyxVar.z() == cgrc.e) {
            adanVar.m(0);
        } else {
            adanVar.m(8);
        }
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return adaoVar2.b() != adaoVar.b();
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
