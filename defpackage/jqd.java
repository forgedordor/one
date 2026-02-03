package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqd {
    public final fdae a;
    public ihu b;
    public fdae c;
    public fdae d;
    public fdae e;
    public fdae f;
    public fdae g;

    public jqd() {
        this(null, 127);
    }

    public static final void a(Menu menu, jqc jqcVar) {
        int i;
        jqc jqcVar2 = jqc.a;
        int iOrdinal = jqcVar.ordinal();
        if (iOrdinal == 0) {
            i = R.string.copy;
        } else if (iOrdinal == 1) {
            i = R.string.paste;
        } else if (iOrdinal == 2) {
            i = R.string.cut;
        } else if (iOrdinal == 3) {
            i = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new fctg();
            }
            i = Build.VERSION.SDK_INT <= 26 ? com.google.android.apps.messaging.R.string.autofill : R.string.autofill;
        }
        menu.add(0, jqcVar.f, jqcVar.g, i).setShowAsAction(1);
    }

    public static final void b(Menu menu, jqc jqcVar, fdae fdaeVar) {
        if (fdaeVar != null && menu.findItem(jqcVar.f) == null) {
            a(menu, jqcVar);
        } else if (fdaeVar == null) {
            int i = jqcVar.f;
            if (menu.findItem(i) != null) {
                menu.removeItem(i);
            }
        }
    }

    public /* synthetic */ jqd(fdae fdaeVar, int i) {
        ihu ihuVar = ihu.a;
        this.a = 1 == (i & 1) ? null : fdaeVar;
        this.b = ihuVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
