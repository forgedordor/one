package defpackage;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuq {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public cujq c;
    public ViewTreeObserver d;
    private final daoe e;

    public cyuq(ea eaVar, daoe daoeVar, tlt tltVar, cujr cujrVar) {
        this.e = daoeVar;
        eaVar.P().c(new cyup(this, eaVar, cujrVar, tltVar, daoeVar));
    }

    public final void a(dany danyVar) {
        this.a.add(danyVar);
        this.e.d.add(danyVar);
    }

    public final void b(danz danzVar) {
        this.b.add(danzVar);
        this.e.b(danzVar);
    }
}
