package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class env implements Comparator {
    final /* synthetic */ eqr a;

    public env(eqr eqrVar) {
        this.a = eqrVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object objH = ((eou) obj).h();
        eqr eqrVar = this.a;
        return fcxl.a(Integer.valueOf(eqrVar.a(objH)), Integer.valueOf(eqrVar.a(((eou) obj2).h())));
    }
}
