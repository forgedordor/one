package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwx implements actm {
    public final eg a;
    public final fcsu b;

    public cwwx(eg egVar, fcsu fcsuVar) {
        this.a = egVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.actm
    public final void a(egpr egprVar, View view) {
        eg egVar = this.a;
        adci.a(egVar, egVar.getString(R.string.google_tos_banner_dismissed_snackbar_text), egVar.getString(R.string.google_tos_banner_dismissed_snackbar_action_text), new View.OnClickListener() { // from class: cwww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws IOException {
                cwwx cwwxVar = this.a;
                aijh aijhVar = (aijh) cwwxVar.b.b();
                eg egVar2 = cwwxVar.a;
                eiid.o(egVar2, aijhVar.n(egVar2));
            }
        });
    }
}
