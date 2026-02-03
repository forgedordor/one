package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafa extends wg {
    private final rbv a;
    private int b;
    private float c;
    private boolean d = false;

    public dafa(rbv rbvVar) {
        this.a = rbvVar;
        c();
    }

    private final void c() {
        this.b = 0;
        this.c = 0.0f;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.d) {
            return;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.b;
        if (i3 < 5) {
            float f = i3;
            int i4 = i3 + 1;
            this.b = i4;
            this.c = ((f * this.c) + iAbs) / i4;
        } else {
            float f2 = this.c;
            this.c = (f2 - (f2 / 5.0f)) + (iAbs / 5);
        }
        rbv rbvVar = this.a;
        if (rbvVar.u()) {
            if (this.c < 60.0f) {
                rbvVar.r();
            }
        } else if (this.c > 120.0f) {
            rbvVar.q();
        }
    }

    @Override // defpackage.wg
    public final void b(RecyclerView recyclerView, int i) {
        this.d = i == 1;
        rbv rbvVar = this.a;
        if (rbvVar.u()) {
            if (i == 1 || i == 0) {
                rbvVar.r();
                c();
            }
        }
    }
}
