package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aatu implements egps<Void, Void> {
    final /* synthetic */ aatv a;

    public aatu(aatv aatvVar) {
        this.a = aatvVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aatv aatvVar = this.a;
        aatvVar.b();
        aatvVar.s.setEnabled(false);
        einf.f(new aatd(true), (ea) aatvVar.b.b());
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        aatv aatvVar = this.a;
        ((dakl) aatvVar.e.b()).i(R.string.donation_flow_complete);
        Bundle extras = ((eg) aatvVar.c.b()).getIntent().getExtras();
        extras.getClass();
        if (extras.containsKey("EXTRA_LISTENER_KEY")) {
            Map map = (Map) ((eyig) aatvVar.k).a;
            String string = extras.getString("EXTRA_LISTENER_KEY");
            string.getClass();
            aaro aaroVar = (aaro) map.get(string);
            aaroVar.getClass();
            aaroVar.a();
        }
        einf.f(new aata(4), (ea) aatvVar.b.b());
        ((aasf) aatvVar.j.b()).b(2);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        aatv aatvVar = this.a;
        aatvVar.a();
        aatvVar.s.setEnabled(true);
        aatv.a.s("#donateCallback: failed to donate messages", th);
        einf.f(new aatd(false), (ea) aatvVar.b.b());
        ((dakl) aatvVar.e.b()).i(R.string.donation_donate_error);
        ((aasf) aatvVar.j.b()).b(3);
    }
}
