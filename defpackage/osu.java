package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osu {
    public final Object a;
    public final ouv b;
    public final oph c;
    public final oph d;
    public final fdpl e = owq.a(new osq(this, null));
    private final fdap f;

    public osu(fdap fdapVar, Object obj, ouv ouvVar) {
        this.f = fdapVar;
        this.a = obj;
        this.b = ouvVar;
        byte[] bArr = null;
        this.c = new oph(bArr);
        this.d = new oph(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.owd r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.osr
            if (r0 == 0) goto L13
            r0 = r6
            osr r0 = (defpackage.osr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            osr r0 = new osr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fdap r6 = r4.f
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 == r1) goto L8e
        L40:
            owd r6 = (defpackage.owd) r6
            boolean r0 = r6 instanceof defpackage.opd
            if (r0 == 0) goto L50
            r0 = r6
            opd r0 = (defpackage.opd) r0
            ouv r1 = r4.b
            int r1 = r1.a
            r0.a(r1)
        L50:
            if (r6 == r5) goto L86
            oss r0 = new oss
            r0.<init>(r4)
            r6.f(r0)
            if (r5 == 0) goto L67
            ost r0 = new ost
            r0.<init>(r4)
            r1 = r5
            owd r1 = (defpackage.owd) r1
            r1.g(r0)
        L67:
            if (r5 == 0) goto L6e
            owd r5 = (defpackage.owd) r5
            r5.e()
        L6e:
            r5 = 3
            boolean r0 = defpackage.ovs.a(r5)
            if (r0 == 0) goto L85
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Generated new PagingSource "
            java.lang.String r0 = r1.concat(r0)
            defpackage.ovs.b(r5, r0)
        L85:
            return r6
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osu.a(owd, fcxy):java.lang.Object");
    }

    public final void b() {
        this.c.a(false);
    }

    public final void c() {
        this.c.a(true);
    }
}
