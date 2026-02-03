package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjn {
    public static final fcyh a(fcyh fcyhVar, fcyh fcyhVar2) {
        return !e(fcyhVar2) ? fcyhVar.plus(fcyhVar2) : d(fcyhVar, fcyhVar2, false);
    }

    public static final fcyh b(fdjx fdjxVar, fcyh fcyhVar) {
        fcyh fcyhVarD = d(fdjxVar.hE(), fcyhVar, true);
        fcyh fcyhVarPlus = fdkb.a ? fcyhVarD.plus(new fdju(fdkb.c.incrementAndGet())) : fcyhVarD;
        fdjq fdjqVar = fdkq.a;
        return (fcyhVarD == fdjqVar || fcyhVarD.get(fcya.k) != null) ? fcyhVarPlus : fcyhVarPlus.plus(fdjqVar);
    }

    public static final fdnc c(fcxy fcxyVar, fcyh fcyhVar, Object obj) {
        fdnc fdncVar = null;
        if (!(fcxyVar instanceof fcyw)) {
            return null;
        }
        if (fcyhVar.get(fdnd.a) != null) {
            fcyw fcywVarDJ = (fcyw) fcxyVar;
            while (true) {
                if ((fcywVarDJ instanceof fdkm) || (fcywVarDJ = fcywVarDJ.dJ()) == null) {
                    break;
                }
                if (fcywVarDJ instanceof fdnc) {
                    fdncVar = (fdnc) fcywVarDJ;
                    break;
                }
            }
            if (fdncVar != null) {
                fdncVar.f(fcyhVar, obj);
            }
        }
        return fdncVar;
    }

    private static final fcyh d(fcyh fcyhVar, fcyh fcyhVar2, final boolean z) {
        boolean zE = e(fcyhVar);
        boolean zE2 = e(fcyhVar2);
        if (!zE && !zE2) {
            return fcyhVar.plus(fcyhVar2);
        }
        final fdci fdciVar = new fdci();
        fdciVar.a = fcyhVar2;
        fcyi fcyiVar = fcyi.a;
        fcyh fcyhVar3 = (fcyh) fcyhVar.fold(fcyiVar, new fdat() { // from class: fdjl
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                fcyh fcyhVar4 = (fcyh) obj;
                fcyf fcyfVar = (fcyf) obj2;
                if (!(fcyfVar instanceof eiiv)) {
                    return fcyhVar4.plus(fcyfVar);
                }
                fdci fdciVar2 = fdciVar;
                fcyf fcyfVar2 = ((fcyh) fdciVar2.a).get(fcyfVar.getKey());
                if (fcyfVar2 == null) {
                    return fcyhVar4.plus(z ? ((eiiv) fcyfVar).c() : (eiiv) fcyfVar);
                }
                fdciVar2.a = ((fcyh) fdciVar2.a).minusKey(fcyfVar.getKey());
                eiiv eiivVar = (eiiv) fcyfVar;
                eiit eiitVar = eidc.b().e;
                boolean z2 = eiitVar != null ? eiitVar.b : true;
                boolean zE3 = eiitVar != null ? eiitVar.e() : false;
                boolean z3 = eidc.a || eiivVar.c;
                boolean z4 = !z2 || zE3 || eiivVar.d || eiivVar.f.e();
                eiiv eiivVar2 = (eiiv) fcyfVar2.get(eiiv.a);
                if (eiivVar2 != null) {
                    z3 = z3 || eiivVar2.c || eiivVar2.e;
                    z4 = (z4 || eiivVar2.d) && !eiivVar2.e;
                }
                return fcyhVar4.plus(new eiiv(eiivVar.b, z3 || eiivVar.e, z4 && !eiivVar.e, false));
            }
        });
        if (zE2) {
            fdciVar.a = ((fcyh) fdciVar.a).fold(fcyiVar, new fdat() { // from class: fdjm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    fcyh fcyhVar4 = (fcyh) obj;
                    fcyf fcyfVar = (fcyf) obj2;
                    return fcyfVar instanceof eiiv ? fcyhVar4.plus(((eiiv) fcyfVar).c()) : fcyhVar4.plus(fcyfVar);
                }
            });
        }
        return fcyhVar3.plus((fcyh) fdciVar.a);
    }

    private static final boolean e(fcyh fcyhVar) {
        return ((Boolean) fcyhVar.fold(false, new fdat() { // from class: fdjk
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                fcyf fcyfVar = (fcyf) obj2;
                boolean z = true;
                if (!((Boolean) obj).booleanValue() && !(fcyfVar instanceof eiiv)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }
}
