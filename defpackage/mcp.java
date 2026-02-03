package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcp {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public ekgb i;
    public ekgb j;
    public ekgb k;
    public int l;
    public int m;
    public ekgb n;
    public mco o;
    public ekgb p;
    public boolean q;
    public int r;
    public boolean s;
    public HashMap t;
    public HashSet u;

    public mcp() {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.b = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        this.f = Alert.DURATION_SHOW_INDEFINITELY;
        this.g = true;
        this.h = true;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.i = ekgbVar;
        this.j = ekgbVar;
        this.k = ekgbVar;
        this.l = Alert.DURATION_SHOW_INDEFINITELY;
        this.m = Alert.DURATION_SHOW_INDEFINITELY;
        this.n = ekgbVar;
        this.o = mco.a;
        this.p = ekgbVar;
        this.q = true;
        this.r = 0;
        this.s = false;
        this.t = new HashMap();
        this.u = new HashSet();
    }

    public mcq a() {
        return new mcq(this);
    }

    public final void b(mcq mcqVar) {
        this.a = mcqVar.a;
        this.b = mcqVar.b;
        this.c = mcqVar.c;
        this.d = mcqVar.d;
        int i = mcqVar.e;
        int i2 = mcqVar.f;
        int i3 = mcqVar.g;
        int i4 = mcqVar.h;
        this.e = mcqVar.i;
        this.f = mcqVar.j;
        this.g = mcqVar.k;
        this.h = mcqVar.l;
        this.i = mcqVar.m;
        this.j = mcqVar.n;
        int i5 = mcqVar.o;
        this.k = mcqVar.p;
        int i6 = mcqVar.q;
        this.l = mcqVar.r;
        this.m = mcqVar.s;
        this.n = mcqVar.t;
        this.o = mcqVar.u;
        this.p = mcqVar.v;
        int i7 = mcqVar.w;
        this.q = mcqVar.x;
        this.r = mcqVar.y;
        boolean z = mcqVar.z;
        boolean z2 = mcqVar.A;
        boolean z3 = mcqVar.B;
        this.s = mcqVar.C;
        this.u = new HashSet(mcqVar.E);
        this.t = new HashMap(mcqVar.D);
    }

    public final void c(int i) {
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            if (((mcn) it.next()).a() == i) {
                it.remove();
            }
        }
    }

    public final void d(Set set) {
        this.u.clear();
        this.u.addAll(set);
    }

    public final void e(int i, boolean z) {
        if (z) {
            this.u.add(Integer.valueOf(i));
        } else {
            this.u.remove(Integer.valueOf(i));
        }
    }

    protected mcp(mcq mcqVar) {
        b(mcqVar);
    }
}
