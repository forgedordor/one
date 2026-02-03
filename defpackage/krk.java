package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krk {
    public krz a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public final HashMap r;
    kqm s;

    public krk() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
    }

    public final void a(krk krkVar) {
        if (krkVar == null) {
            return;
        }
        this.f = krkVar.f;
        this.g = krkVar.g;
        this.h = krkVar.h;
        this.i = krkVar.i;
        this.j = krkVar.j;
        this.k = krkVar.k;
        this.l = krkVar.l;
        this.m = krkVar.m;
        this.n = krkVar.n;
        this.o = krkVar.o;
        this.p = krkVar.p;
        this.q = krkVar.q;
        this.s = krkVar.s;
        HashMap map = this.r;
        map.clear();
        for (kqk kqkVar : krkVar.r.values()) {
            map.put(kqkVar.a, new kqk(kqkVar));
        }
    }

    public krk(krk krkVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = krkVar.a;
        this.b = krkVar.b;
        this.c = krkVar.c;
        this.d = krkVar.d;
        this.e = krkVar.e;
        a(krkVar);
    }

    public krk(krz krzVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = krzVar;
    }
}
