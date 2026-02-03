package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcg implements eora {
    final /* synthetic */ czch a;

    public czcg(czch czchVar) {
        this.a = czchVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        final czch czchVar = this.a;
        czchVar.h(true);
        if (czchVar.n == null) {
            eeji eejiVar = new eeji(czchVar.a);
            eejiVar.u(R.string.c2o_gif_no_connection_alert_title);
            eejiVar.k(R.string.c2o_gif_no_connection_alert_message);
            eejiVar.r(R.string.c2o_gif_error_alert_ok, new DialogInterface.OnClickListener() { // from class: czbz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    czchVar.e(emsh.UNKNOWN_CLOSING_SOURCE);
                }
            });
            eejiVar.p(new DialogInterface.OnCancelListener() { // from class: czca
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    czchVar.e(emsh.UNKNOWN_CLOSING_SOURCE);
                }
            });
            czchVar.n = eejiVar.create();
        }
        if (!czchVar.n.isShowing()) {
            czchVar.n.show();
        }
        czchVar.a.af(emsl.FAILED_TO_LOAD);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
