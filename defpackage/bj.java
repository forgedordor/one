package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bj extends bh {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private bg aj = this.j;
    public int ai = 0;

    public bj() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        ArrayList arrayList = this.q;
        arrayList.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        arrayList.add(this.aj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[ORIG_RETURN, RETURN] */
    @Override // defpackage.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bg u(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.ai
            if (r3 == 0) goto L18
            goto L1b
        L14:
            int r3 = r2.ai
            if (r3 != r0) goto L1b
        L18:
            bg r3 = r2.aj
            return r3
        L1b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj.u(int):bg");
    }

    @Override // defpackage.bh
    public final void y(bc bcVar) {
        bh bhVar = this.r;
        if (bhVar == null) {
            return;
        }
        bg bgVarU = bhVar.u(2);
        bg bgVarU2 = bhVar.u(4);
        if (this.ai == 0) {
            bgVarU = bhVar.u(3);
            bgVarU2 = bhVar.u(5);
        }
        if (this.ag != -1) {
            bcVar.g(bc.c(bcVar, bcVar.e(this.aj), bcVar.e(bgVarU), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            bcVar.g(bc.c(bcVar, bcVar.e(this.aj), bcVar.e(bgVarU2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            be beVarE = bcVar.e(this.aj);
            be beVarE2 = bcVar.e(bgVarU);
            be beVarE3 = bcVar.e(bgVarU2);
            float f = this.af;
            az azVarA = bcVar.a();
            ay ayVar = azVarA.d;
            ayVar.f(beVarE, -1.0f);
            ayVar.f(beVarE2, 1.0f - f);
            ayVar.f(beVarE3, f);
            bcVar.g(azVarA);
        }
    }

    @Override // defpackage.bh
    public final void z() {
        if (this.r == null) {
            return;
        }
        int iP = bc.p(this.aj);
        if (this.ai == 1) {
            this.w = iP;
            this.x = 0;
            k(this.r.d());
            q(0);
            return;
        }
        this.w = 0;
        this.x = iP;
        q(this.r.h());
        k(0);
    }
}
