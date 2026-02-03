package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgsb extends fgrw {
    public fgsb(String str) {
        this.a = str;
    }

    static boolean p(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() + (-1)) == ' ';
    }

    @Override // defpackage.fgry
    public String a() {
        return "#text";
    }

    @Override // defpackage.fgry
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public fgsb d() {
        return (fgsb) super.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // defpackage.fgry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Appendable r10, int r11, defpackage.fgrl r12) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r12.c
            fgry r0 = r9.k
            boolean r1 = r0 instanceof defpackage.fgrs
            if (r1 == 0) goto Lc
            r1 = r0
            fgrs r1 = (defpackage.fgrs) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r0 = defpackage.fgrs.I(r0)
            r6 = r0 ^ 1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            fgsl r4 = r1.e
            boolean r5 = r4.d
            if (r5 != 0) goto L21
            boolean r4 = r4.e
            if (r4 == 0) goto L23
        L21:
            r4 = r2
            goto L24
        L23:
            r4 = r3
        L24:
            if (r0 != 0) goto La0
            if (r4 == 0) goto L2c
            int r0 = r9.l
            if (r0 == 0) goto L32
        L2c:
            fgry r0 = r9.k
            boolean r0 = r0 instanceof defpackage.fgrm
            if (r0 == 0) goto L34
        L32:
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            if (r4 == 0) goto L3e
            fgry r4 = r9.P()
            if (r4 != 0) goto L3e
            goto L3f
        L3e:
            r2 = r3
        L3f:
            fgry r3 = r9.P()
            fgry r4 = r9.Q()
            boolean r5 = r9.h()
            boolean r7 = r3 instanceof defpackage.fgrs
            if (r7 == 0) goto L58
            r7 = r3
            fgrs r7 = (defpackage.fgrs) r7
            boolean r7 = r7.J(r12)
            if (r7 != 0) goto L77
        L58:
            boolean r7 = r3 instanceof defpackage.fgsb
            if (r7 == 0) goto L64
            fgsb r3 = (defpackage.fgsb) r3
            boolean r3 = r3.h()
            if (r3 != 0) goto L77
        L64:
            boolean r3 = r4 instanceof defpackage.fgrs
            if (r3 == 0) goto L7b
            r3 = r4
            fgrs r3 = (defpackage.fgrs) r3
            boolean r3 = r3.H()
            if (r3 != 0) goto L77
            boolean r3 = r4.Z()
            if (r3 == 0) goto L7b
        L77:
            if (r5 != 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            int r3 = r9.l
            if (r3 != 0) goto L8a
            if (r1 == 0) goto L9d
            fgsl r1 = r1.e
            boolean r1 = r1.e
            if (r1 == 0) goto L9d
            if (r5 != 0) goto L9d
            goto L9a
        L8a:
            if (r3 <= 0) goto L9d
            if (r4 == 0) goto L9d
            java.lang.String r1 = r4.n()
            java.lang.String r3 = "br"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L9d
        L9a:
            Y(r10, r11, r12)
        L9d:
            r7 = r0
            r8 = r2
            goto La2
        La0:
            r7 = r3
            r8 = r7
        La2:
            java.lang.String r3 = r9.m()
            r5 = 0
            r2 = r10
            r4 = r12
            defpackage.fgru.a(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsb.e(java.lang.Appendable, int, fgrl):void");
    }

    public final boolean h() {
        return fgre.h(m());
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ int hP() {
        return 0;
    }

    @Override // defpackage.fgry
    public final String toString() {
        return hQ();
    }

    @Override // defpackage.fgrw, defpackage.fgry
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // defpackage.fgry
    public void f(Appendable appendable, int i, fgrl fgrlVar) {
    }
}
