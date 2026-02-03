package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eefb extends kc {
    @Override // defpackage.kc, defpackage.dn
    public Dialog gK(Bundle bundle) {
        return new eefa(z(), this.b);
    }

    @Override // defpackage.dn
    public void hh() {
        Dialog dialog = this.d;
        if (dialog instanceof eefa) {
            boolean z = ((eefa) dialog).a().u;
        }
        super.hh();
    }
}
