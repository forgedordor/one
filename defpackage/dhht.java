package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhht implements Runnable {
    final /* synthetic */ dhhv a;

    public dhht(dhhv dhhvVar) {
        this.a = dhhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhja.c("Retrying all", new Object[0]);
        Iterator it = this.a.a.values().iterator();
        if (it.hasNext()) {
            dhhu dhhuVar = (dhhu) it.next();
            Object obj = dhhuVar.a;
            dhhs dhhsVar = dhhuVar.b;
            dhja.c("Retrying element: %s", null);
            throw null;
        }
    }
}
