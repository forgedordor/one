package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eemb extends eeqd {
    final /* synthetic */ eemd a;

    public eemb(eemd eemdVar) {
        this.a = eemdVar;
    }

    @Override // defpackage.eeqd
    public final void a(int i) {
        eemd eemdVar = this.a;
        eemdVar.d = true;
        eemc eemcVar = (eemc) eemdVar.e.get();
        if (eemcVar != null) {
            eemcVar.e();
        }
    }

    @Override // defpackage.eeqd
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        eemd eemdVar = this.a;
        eemdVar.d = true;
        eemc eemcVar = (eemc) eemdVar.e.get();
        if (eemcVar != null) {
            eemcVar.e();
        }
    }
}
