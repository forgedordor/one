package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feza {
    private feyq a;
    private String b;
    private feyl c;
    private fezf d;
    private Map e;

    public feza() {
        this.e = new LinkedHashMap();
        this.b = "GET";
        this.c = new feyl();
    }

    public final fezb a() {
        Map mapUnmodifiableMap;
        feyq feyqVar = this.a;
        if (feyqVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.b;
        feyn feynVarB = this.c.b();
        fezf fezfVar = this.d;
        Map map = this.e;
        byte[] bArr = fezr.a;
        map.getClass();
        if (map.isEmpty()) {
            mapUnmodifiableMap = fcvp.a;
        } else {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
            mapUnmodifiableMap.getClass();
        }
        return new fezb(feyqVar, str, feynVarB, fezfVar, mapUnmodifiableMap);
    }

    public final void b(String str, String str2) {
        this.c.e(str, str2);
    }

    public final void c(String str, String str2) {
        str2.getClass();
        this.c.d(str, str2);
    }

    public final void d(feyn feynVar) {
        this.c = feynVar.e();
    }

    public final void e(String str, fezf fezfVar) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (fezfVar == null) {
            if (fdbq.f(str, "POST") || fdbq.f(str, "PUT") || fdbq.f(str, "PATCH") || fdbq.f(str, "PROPPATCH") || fdbq.f(str, "REPORT")) {
                throw new IllegalArgumentException(a.a(str, "method ", " must have a request body."));
            }
        } else if (!ffaz.a(str)) {
            throw new IllegalArgumentException(a.a(str, "method ", " must not have a request body."));
        }
        this.b = str;
        this.d = fezfVar;
    }

    public final void f(String str) {
        this.c.f(str);
    }

    public final void g(Class cls, Object obj) {
        cls.getClass();
        if (obj == null) {
            this.e.remove(cls);
            return;
        }
        if (this.e.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        Map map = this.e;
        Object objCast = cls.cast(obj);
        objCast.getClass();
        map.put(cls, objCast);
    }

    public final void h(feyq feyqVar) {
        feyqVar.getClass();
        this.a = feyqVar;
    }

    public feza(fezb fezbVar) {
        Map mapM;
        this.e = new LinkedHashMap();
        this.a = fezbVar.a;
        this.b = fezbVar.b;
        this.d = fezbVar.d;
        if (fezbVar.e.isEmpty()) {
            mapM = new LinkedHashMap();
        } else {
            mapM = fcwa.m(fezbVar.e);
        }
        this.e = mapM;
        this.c = fezbVar.c.e();
    }
}
