package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qma implements qab {
    final qhx a;
    final qjo b;
    public final qmg c;

    static {
        qas.d("WMFgUpdater");
    }

    public qma(WorkDatabase workDatabase, qhx qhxVar, qmg qmgVar) {
        this.a = qhxVar;
        this.c = qmgVar;
        this.b = workDatabase.D();
    }
}
