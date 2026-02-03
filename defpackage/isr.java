package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isr extends isl {
    public irs b;
    public final /* synthetic */ iss c;
    public int d = 1;

    public isr(iss issVar) {
        this.c = issVar;
    }

    public final void a(irs irsVar, boolean z) {
        List list = irsVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ise) list.get(i)).c()) {
                c(irsVar);
                return;
            }
        }
        ivy ivyVar = this.a;
        if (ivyVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        isy.a(irsVar, ivyVar.j(0L), new iso(this, this.c), false);
        if (this.d == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ise) list.get(i2)).b();
                }
            }
            irn irnVar = irsVar.b;
            if (irnVar != null) {
                irnVar.c = !r3.b;
            }
        }
    }

    public final void b() {
        this.d = 1;
        this.c.b = false;
        this.b = null;
    }

    public final void c(irs irsVar) {
        if (this.d == 2) {
            ivy ivyVar = this.a;
            if (ivyVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            isy.a(irsVar, ivyVar.j(0L), new isq(this.c), true);
        }
        this.d = 3;
    }
}
