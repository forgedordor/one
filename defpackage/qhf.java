package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhf extends qgy {
    public qhf(qhp qhpVar) {
        super(qhpVar);
    }

    @Override // defpackage.qhb
    public final boolean b(qjn qjnVar) {
        int i = qjnVar.l.j;
        if (i != 3) {
            return Build.VERSION.SDK_INT >= 30 && i == 6;
        }
        return true;
    }

    @Override // defpackage.qgy
    protected final int d() {
        return 7;
    }

    @Override // defpackage.qgy
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        qgj qgjVar = (qgj) obj;
        qgjVar.getClass();
        return !qgjVar.a || qgjVar.c;
    }
}
