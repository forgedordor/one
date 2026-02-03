package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donc {
    public static final doin a(domz domzVar) {
        int iOrdinal = domzVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return doin.a;
            }
            if (iOrdinal == 2) {
                return doin.b;
            }
            if (iOrdinal == 3) {
                return doin.c;
            }
            if (iOrdinal == 4) {
                return doin.d;
            }
            if (iOrdinal != 5) {
                throw new fctg();
            }
        }
        Class<?> cls = domzVar.getClass();
        int i = fdcj.a;
        fdbi fdbiVar = new fdbi(cls);
        fdbiVar.toString();
        throw new IllegalStateException("Unknown media quality in serialized media: ".concat(fdbiVar.toString()));
    }

    public static final void b(dond dondVar, dona donaVar) {
        String str = donaVar.d;
        str.getClass();
        dondVar.j(dogi.c(str));
        domz domzVarB = domz.b(donaVar.c);
        if (domzVarB == null) {
            domzVarB = domz.UNRECOGNIZED;
        }
        domzVarB.getClass();
        dondVar.o(a(domzVarB));
        String str2 = donaVar.e;
        str2.getClass();
        dondVar.u(str2);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(donaVar.f);
        if (true == mapUnmodifiableMap.isEmpty()) {
            mapUnmodifiableMap = null;
        }
        dondVar.k(mapUnmodifiableMap);
        dondVar.r(donaVar.i);
    }

    public static final void c(dond dondVar, donb donbVar, fdat fdatVar) {
        evtg evtgVar = donbVar.b;
        evtgVar.getClass();
        Object objX = fcva.X(evtgVar);
        objX.getClass();
        fdatVar.a(dondVar, objX);
    }

    public static final void d(dong dongVar, dona donaVar) {
        b(dongVar, donaVar);
        dongVar.v(donaVar.g);
        dongVar.l(donaVar.h);
    }

    public static final donb e(List list) {
        domw domwVar = (domw) donb.a.createBuilder();
        domwVar.getClass();
        DesugarCollections.unmodifiableList(((donb) domwVar.instance).b).getClass();
        domwVar.copyOnWrite();
        donb donbVar = (donb) domwVar.instance;
        evtg evtgVar = donbVar.b;
        if (!evtgVar.c()) {
            donbVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(list, donbVar.b);
        evsn evsnVarBuild = domwVar.build();
        evsnVarBuild.getClass();
        return (donb) evsnVarBuild;
    }
}
