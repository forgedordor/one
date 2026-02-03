package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzf {
    public static final hzg a() {
        return (hzg) hzt.b.a();
    }

    public static final hzg b(hzg hzgVar) {
        if (hzgVar instanceof ibb) {
            ibb ibbVar = (ibb) hzgVar;
            if (ibbVar.n == hxr.a()) {
                ibbVar.l = null;
                return hzgVar;
            }
        }
        if (hzgVar instanceof ibc) {
            ibc ibcVar = (ibc) hzgVar;
            if (ibcVar.b == hxr.a()) {
                ibcVar.a = null;
                return hzgVar;
            }
        }
        hzg hzgVarA = hzt.a(hzgVar, null, false);
        hzgVarA.w();
        return hzgVarA;
    }

    public static final void c() {
        hzt.b().e();
    }

    public static final Object d(fdap fdapVar, fdae fdaeVar) {
        hzg ibbVar;
        if (fdapVar == null) {
            return fdaeVar.invoke();
        }
        hzg hzgVar = (hzg) hzt.b.a();
        if (hzgVar instanceof ibb) {
            ibb ibbVar2 = (ibb) hzgVar;
            if (ibbVar2.n == hxr.a()) {
                fdap fdapVar2 = ibbVar2.l;
                fdap fdapVar3 = ibbVar2.m;
                try {
                    ibbVar2.l = hzt.p(fdapVar, fdapVar2, true);
                    ibbVar2.m = hzt.q(null, fdapVar3);
                    return fdaeVar.invoke();
                } finally {
                    ibbVar2.l = fdapVar2;
                    ibbVar2.m = fdapVar3;
                }
            }
        }
        if (hzgVar == null || (hzgVar instanceof hza)) {
            ibbVar = new ibb(hzgVar instanceof hza ? (hza) hzgVar : null, fdapVar, null, true, false);
        } else {
            ibbVar = hzgVar.b(fdapVar);
        }
        try {
            hzg hzgVarW = ibbVar.w();
            try {
                Object objInvoke = fdaeVar.invoke();
                hzg.E(hzgVarW);
                return objInvoke;
            } catch (Throwable th) {
                hzg.E(hzgVarW);
                throw th;
            }
        } finally {
            ibbVar.d();
        }
    }

    public static final void e(hzg hzgVar, hzg hzgVar2, fdap fdapVar) {
        if (hzgVar != hzgVar2) {
            hzg.E(hzgVar);
            hzgVar2.d();
        } else if (hzgVar instanceof ibb) {
            ((ibb) hzgVar).l = fdapVar;
        } else if (hzgVar instanceof ibc) {
            ((ibc) hzgVar).a = fdapVar;
        } else {
            Objects.toString(hzgVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(hzgVar)));
        }
    }

    public static final void f() {
        boolean z;
        synchronized (hzt.c) {
            cva cvaVar = hzt.i.d;
            z = false;
            if (cvaVar != null) {
                if (cvaVar.l()) {
                    z = true;
                }
            }
        }
        if (z) {
            hzt.r();
        }
    }

    public static final hza g(fdap fdapVar, fdap fdapVar2) {
        hza hzaVarA;
        hzg hzgVarB = hzt.b();
        hza hzaVar = hzgVarB instanceof hza ? (hza) hzgVarB : null;
        if (hzaVar == null || (hzaVarA = hzaVar.a(fdapVar, fdapVar2)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return hzaVarA;
    }

    public static final hzg h(fdap fdapVar) {
        return hzt.b().b(fdapVar);
    }

    public static final hze i(fdat fdatVar) {
        hzt.m(hzt.a);
        synchronized (hzt.c) {
            hzt.g = fcva.ai(hzt.g, fdatVar);
        }
        return new hze(fdatVar);
    }
}
