package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diby implements dibx {
    private boolean a;

    public final void c(dicy dicyVar) {
        boolean z;
        Log.v("AppIntegCallbackExt", "#onVoicePlateStateChanged()");
        int iA = dicx.a(dicyVar.b);
        if (iA != 0 && iA == 2) {
            if (this.a) {
                return;
            } else {
                z = true;
            }
        } else if (!this.a) {
            return;
        } else {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.dibx
    public final void a() {
    }

    @Override // defpackage.dibx
    public final void b() {
    }
}
