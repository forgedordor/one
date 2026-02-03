package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemy {
    private final eemt a;
    private final View b;
    private final eemv c;

    public eemy(eemt eemtVar, View view) {
        this.c = Build.VERSION.SDK_INT >= 34 ? new eemx() : Build.VERSION.SDK_INT >= 33 ? new eemv() : null;
        this.a = eemtVar;
        this.b = view;
    }

    public final void a() {
        eemv eemvVar = this.c;
        if (eemvVar != null) {
            eemvVar.b(this.a, this.b, false);
        }
    }

    public final void b() {
        eemv eemvVar = this.c;
        if (eemvVar != null) {
            eemvVar.c(this.b);
        }
    }
}
