package defpackage;

import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjf implements ehay {
    final /* synthetic */ cyjg a;

    public cyjf(cyjg cyjgVar) {
        this.a = cyjgVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        cqca.p("Bugle", th, "Failed to get registration state");
        AlertDialog alertDialog = this.a.g;
        if (alertDialog != null) {
            alertDialog.setMessage("Status: Failed");
        }
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        AlertDialog alertDialog = this.a.g;
        if (alertDialog != null) {
            alertDialog.setMessage("Status: ".concat(str));
        }
    }
}
