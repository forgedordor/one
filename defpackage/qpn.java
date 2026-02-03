package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpn implements qpi, qpq {
    private final boolean b;
    private final qof c;
    private final qqi d;
    private boolean e;
    private final Path a = new Path();
    private final qox f = new qox();

    public qpn(qof qofVar, quh quhVar, qub qubVar) {
        this.b = qubVar.b;
        this.c = qofVar;
        qqi qqiVarA = qubVar.a.a();
        this.d = qqiVarA;
        quhVar.k(qqiVarA);
        qqiVarA.h(this);
    }

    @Override // defpackage.qpq
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // defpackage.qoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r7 >= r1) goto L36
            java.lang.Object r1 = r6.get(r7)
            qoy r1 = (defpackage.qoy) r1
            boolean r2 = r1 instanceof defpackage.qpp
            if (r2 == 0) goto L23
            r2 = r1
            qpp r2 = (defpackage.qpp) r2
            int r3 = r2.e
            r4 = 1
            if (r3 != r4) goto L23
            qox r1 = r5.f
            r1.a(r2)
            r2.a(r5)
            goto L33
        L23:
            boolean r2 = r1 instanceof defpackage.qpm
            if (r2 == 0) goto L33
            if (r0 != 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2e:
            qpm r1 = (defpackage.qpm) r1
            r0.add(r1)
        L33:
            int r7 = r7 + 1
            goto L2
        L36:
            qqi r6 = r5.d
            r6.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpn.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.qoy
    public final String g() {
        throw null;
    }

    @Override // defpackage.qpi
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) this.d.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.b(path);
        this.e = true;
        return path;
    }
}
