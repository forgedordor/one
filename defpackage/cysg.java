package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer");
    public final efwo b;
    public final cyrn c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final Context g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public cyrg s;
    private final fcsu t;
    public List r = new ArrayList();
    public final egps p = new cysc(this);
    public final egps q = new cysd(this);

    public cysg(efwo efwoVar, cyrn cyrnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.b = efwoVar;
        this.c = cyrnVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = cyrnVar.A();
        this.t = fcsuVar4;
        this.h = fcsuVar6;
        this.i = fcsuVar5;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
        this.o = fcsuVar12;
    }

    public final void a(List list) {
        ((egpr) this.d.b()).h(new egpq(((bvmu) this.f.b()).b(list)), new egpo(Integer.valueOf(list.size())), this.p);
    }

    public final void b() {
        this.c.fg().finish();
        ((aijh) this.t.b()).A(this.g, this.b);
    }

    public final void c(boolean z) {
        Button button = (Button) this.c.N().findViewById(R.id.switch_to_qr_button);
        if (z) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
    }

    public final void d() {
        cyrn cyrnVar = this.c;
        final Snackbar snackbarQ = Snackbar.q(cyrnVar.fg().getWindow().getDecorView().getRootView(), cyrnVar.Y(R.string.cannot_enable_gaia_error), -2);
        snackbarQ.s(cyrnVar.Y(R.string.dismiss_action_text), new View.OnClickListener() { // from class: cyry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                snackbarQ.e();
            }
        });
        snackbarQ.u(4);
        snackbarQ.i();
    }
}
