package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgv {
    public static final float a(fcyh fcyhVar) {
        icv icvVar = (icv) fcyhVar.get(icv.b);
        float fA = icvVar != null ? icvVar.a() : 1.0f;
        if (fA < 0.0f) {
            dgd.b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r26v1, types: [fdap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(final defpackage.deb r21, final defpackage.ddw r22, long r23, final defpackage.fdap r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgv.b(deb, ddw, long, fdap, fcxy):java.lang.Object");
    }

    public static final Object c(float f, float f2, float f3, ddz ddzVar, final fdat fdatVar, fcxy fcxyVar) throws Throwable {
        final dib dibVar = diu.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        fdap fdapVar = dibVar.a;
        deh dehVarC = (deh) fdapVar.invoke(f6);
        if (dehVarC == null) {
            dehVarC = ((deh) fdapVar.invoke(f4)).c();
        }
        deh dehVar = dehVarC;
        Object objB = b(new deb(dibVar, f4, dehVar, 56), new dgw(ddzVar, dibVar, f4, f5, dehVar), Long.MIN_VALUE, new fdap() { // from class: dgq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ddy ddyVar = (ddy) obj;
                fdatVar.a(ddyVar.a(), dibVar.b.invoke(ddyVar.c));
                return fctx.a;
            }
        }, fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }

    public static final Object d(deb debVar, Object obj, ddz ddzVar, boolean z, fdap fdapVar, fcxy fcxyVar) throws Throwable {
        Object objB = b(debVar, new dgw(ddzVar, debVar.e, debVar.a(), obj, debVar.a), z ? debVar.b : Long.MIN_VALUE, fdapVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    public static final void e(ddy ddyVar, long j, float f, ddw ddwVar, deb debVar, fdap fdapVar) {
        long jA = f == 0.0f ? ddwVar.a() : (long) ((j - ddyVar.a) / f);
        ddyVar.d = j;
        ddyVar.b.b(ddwVar.c(jA));
        ddyVar.c = ddwVar.b(jA);
        if (ddwVar.d(jA)) {
            ddyVar.e = ddyVar.d;
            ddyVar.e();
        }
        f(ddyVar, debVar);
        fdapVar.invoke(ddyVar);
    }

    public static final void f(ddy ddyVar, deb debVar) {
        debVar.c(ddyVar.a());
        deh dehVar = debVar.a;
        deh dehVar2 = ddyVar.c;
        int iB = dehVar.b();
        for (int i = 0; i < iB; i++) {
            dehVar.e(i, dehVar2.a(i));
        }
        debVar.c = ddyVar.e;
        debVar.b = ddyVar.d;
        debVar.d = ddyVar.d();
    }

    public static final Object g(deb debVar, dep depVar, boolean z, fdap fdapVar, fcxy fcxyVar) throws Throwable {
        Object objB = b(debVar, new deo(depVar, debVar.e, debVar.a(), debVar.a), z ? debVar.b : Long.MIN_VALUE, fdapVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    public static /* synthetic */ Object h(float f, float f2, ddz ddzVar, fdat fdatVar, fcxy fcxyVar, int i) {
        if ((i & 8) != 0) {
            ddzVar = dea.b(0.0f, 0.0f, null, 7);
        }
        return c(f, f2, 0.0f, ddzVar, fdatVar, fcxyVar);
    }

    public static /* synthetic */ Object j(deb debVar, Object obj, ddz ddzVar, boolean z, fdap fdapVar, fcxy fcxyVar, int i) {
        if ((i & 2) != 0) {
            ddzVar = dea.b(0.0f, 0.0f, null, 7);
        }
        ddz ddzVar2 = ddzVar;
        boolean z2 = ((i & 4) == 0) & z;
        if ((i & 8) != 0) {
            fdapVar = new fdap() { // from class: dgt
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return fctx.a;
                }
            };
        }
        return d(debVar, obj, ddzVar2, z2, fdapVar, fcxyVar);
    }

    private static final Object k(ddw ddwVar, final fdap fdapVar, fcxy fcxyVar) {
        return ddwVar.e() ? dfe.a(fdapVar, fcxyVar) : hos.c(new fdap() { // from class: dgr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                l.longValue();
                return fdapVar.invoke(l);
            }
        }, fcxyVar);
    }
}
