package defpackage;

import android.content.Context;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mno extends mly {
    public final mol[] d;
    public int e;

    public mno(Context context, boolean z) {
        super(context, z);
        this.d = new mol[2];
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void c() {
        this.e = 0;
        super.c();
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void d(may mayVar, maz mazVar, long j) {
        mee.c(this.e < 2);
        super.d(mayVar, mazVar, j);
        int i = this.e;
        this.e = i + 1;
        Deque deque = this.a.b;
        maz mazVar2 = deque.isEmpty() ? null : (maz) deque.getLast();
        mol[] molVarArr = this.d;
        mee.f(mazVar2);
        molVarArr[i] = new mol(mazVar2, j);
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void j() {
        for (int i = 0; i < this.e; i++) {
            super.f(this.d[i].a);
        }
        this.e = 0;
        super.j();
    }

    public final void l(long j) {
        int i = this.e;
        if (i >= 2) {
            mol[] molVarArr = this.d;
            mol molVar = molVarArr[1];
            if (j < molVar.b) {
                return;
            }
            mol molVar2 = molVarArr[0];
            molVarArr[0] = molVar;
            this.e = i - 1;
            super.f(molVar2.a);
        }
    }

    public final boolean m() {
        return this.e == 0;
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void f(maz mazVar) {
    }
}
