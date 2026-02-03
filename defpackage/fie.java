package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fie implements fjz {
    private final ctq a;
    private final List b;
    private final int c;
    private final int d;
    private final boolean e;
    private final fil f;

    public fie(ctq ctqVar, List list, int i, int i2, boolean z, fil filVar) {
        this.a = ctqVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = filVar;
        if (list.size() > 1) {
            return;
        }
        ebs.d("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static final void n(cun cunVar, fil filVar, fij fijVar, int i, int i2) {
        fil filVarC = filVar.c ? fijVar.c(i2, i) : fijVar.c(i, i2);
        if (i > i2) {
            Objects.toString(filVarC);
            ebs.d("minOffset should be less than or equal to maxOffset: ".concat(filVarC.toString()));
        }
        cunVar.g(fijVar.a, filVarC);
    }

    private final int p(long j) {
        try {
            return this.a.b(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(a.u(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int q(int i, boolean z) {
        int iO = o() - 1;
        int i2 = z;
        if (iO != 1) {
            i2 = (iO == 2 || z == 0) ? 1 : 0;
        }
        return (i - (i2 ^ 1)) / 2;
    }

    @Override // defpackage.fjz
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fjz
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.fjz
    public final int c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // defpackage.fjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctu d(final defpackage.fil r9) {
        /*
            r8 = this;
            fik r0 = r9.a
            fik r1 = r9.b
            long r2 = r0.b
            long r4 = r1.b
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L32
            boolean r4 = r9.c
            if (r4 == 0) goto L17
            int r1 = r1.a
            int r0 = r0.a
            if (r0 >= r1) goto L2d
            goto L1d
        L17:
            int r1 = r1.a
            int r0 = r0.a
            if (r0 <= r1) goto L2d
        L1d:
            java.util.Objects.toString(r9)
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = "unexpectedly miss-crossed selection: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.ebs.d(r0)
        L2d:
            ctu r9 = defpackage.ctv.b(r2, r9)
            return r9
        L32:
            int r2 = defpackage.ctv.a
            cun r2 = new cun
            r3 = 0
            r2.<init>(r3)
            boolean r3 = r9.c
            r4 = 1
            if (r4 == r3) goto L41
            r5 = r0
            goto L42
        L41:
            r5 = r1
        L42:
            fij r6 = r8.g()
            fij r7 = r8.g()
            int r7 = r7.a()
            int r5 = r5.a
            n(r2, r9, r6, r5, r7)
            fid r5 = new fid
            r5.<init>()
            r8.k(r5)
            if (r4 == r3) goto L5e
            r0 = r1
        L5e:
            fij r1 = r8.h()
            r3 = 0
            int r0 = r0.a
            n(r2, r9, r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fie.d(fil):ctu");
    }

    @Override // defpackage.fjz
    public final fij e() {
        return this.e ? i() : f();
    }

    @Override // defpackage.fjz
    public final fij f() {
        return (fij) this.b.get(q(this.d, false));
    }

    @Override // defpackage.fjz
    public final fij g() {
        return o() == 1 ? f() : i();
    }

    public final fij h() {
        return o() == 1 ? i() : f();
    }

    @Override // defpackage.fjz
    public final fij i() {
        return (fij) this.b.get(q(this.c, true));
    }

    @Override // defpackage.fjz
    public final fil j() {
        return this.f;
    }

    @Override // defpackage.fjz
    public final void k(fdap fdapVar) {
        int iP = p(g().a);
        int iP2 = p(h().a);
        int i = iP + 1;
        if (i < iP2) {
            while (i < iP2) {
                fdapVar.invoke(this.b.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.fjz
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.fjz
    public final boolean m(fjz fjzVar) {
        if (this.f == null || fjzVar == null || !(fjzVar instanceof fie)) {
            return true;
        }
        fie fieVar = (fie) fjzVar;
        if (this.e != fieVar.e || this.c != fieVar.c || this.d != fieVar.d || b() != fieVar.b()) {
            return true;
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((fij) list.get(i)).e((fij) fieVar.b.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fjz
    public final int o() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return ((fij) this.b.get(i / 2)).f();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append((Object) fhz.a(o()));
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            fij fijVar = (fij) list.get(i);
            if (!z) {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(fijVar);
            sb2.append(sb3.toString());
            z = false;
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
