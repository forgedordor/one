package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rta implements Cloneable {
    private int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Drawable o;
    public int p;
    public Resources.Theme t;
    public boolean u;
    public boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float b = 1.0f;
    public rha c = rha.e;
    public rbh d = rbh.NORMAL;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public res l = ruo.b;
    public boolean n = true;
    public rex q = new rex();
    public Map r = new ruv();
    public Class s = Object.class;
    public boolean v = true;

    private final rta a(rok rokVar, rfb rfbVar) {
        return c(rokVar, rfbVar, false);
    }

    private final rta b(rok rokVar, rfb rfbVar) {
        return c(rokVar, rfbVar, true);
    }

    private final rta c(rok rokVar, rfb rfbVar, boolean z) {
        rta rtaVarAb = z ? ab(rokVar, rfbVar) : O(rokVar, rfbVar);
        rtaVarAb.v = true;
        return rtaVarAb;
    }

    private static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public rta A() {
        return ab(rok.d, new rnx());
    }

    public rta B(Class cls) {
        if (this.u) {
            return clone().B(cls);
        }
        rvi.f(cls);
        this.s = cls;
        this.a |= 4096;
        ah();
        return this;
    }

    public rta C() {
        return V(ron.d, false);
    }

    public rta D(rha rhaVar) {
        if (this.u) {
            return clone().D(rhaVar);
        }
        rvi.f(rhaVar);
        this.c = rhaVar;
        this.a |= 4;
        ah();
        return this;
    }

    public rta E() {
        if (this.u) {
            return clone().E();
        }
        this.r.clear();
        int i = this.a;
        this.m = false;
        this.n = false;
        this.a = (i & (-133121)) | 65536;
        this.v = true;
        ah();
        return this;
    }

    public rta F(rok rokVar) {
        rew rewVar = rok.h;
        rvi.f(rokVar);
        return V(rewVar, rokVar);
    }

    public rta G(int i) {
        if (this.u) {
            return clone().G(i);
        }
        this.f = i;
        int i2 = this.a | 32;
        this.e = null;
        this.a = i2 & (-17);
        ah();
        return this;
    }

    public rta H(Drawable drawable) {
        if (this.u) {
            return clone().H(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.f = 0;
        this.a = i & (-33);
        ah();
        return this;
    }

    public rta I(Drawable drawable) {
        if (this.u) {
            return clone().I(drawable);
        }
        this.o = drawable;
        int i = this.a | 8192;
        this.p = 0;
        this.a = i & (-16385);
        ah();
        return this;
    }

    public rta J() {
        return b(rok.c, new ros());
    }

    public rta K(long j) {
        return V(rpy.a, Long.valueOf(j));
    }

    public rta L() {
        return O(rok.e, new rnv());
    }

    public rta M() {
        return a(rok.d, new rnw());
    }

    public rta N() {
        return a(rok.c, new ros());
    }

    final rta O(rok rokVar, rfb rfbVar) {
        if (this.u) {
            return clone().O(rokVar, rfbVar);
        }
        F(rokVar);
        return aa(rfbVar, false);
    }

    public rta P(int i) {
        return Q(i, i);
    }

    public rta Q(int i, int i2) {
        if (this.u) {
            return clone().Q(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        ah();
        return this;
    }

    public rta R(int i) {
        if (this.u) {
            return clone().R(i);
        }
        this.h = i;
        int i2 = this.a | 128;
        this.g = null;
        this.a = i2 & (-65);
        ah();
        return this;
    }

    public rta S(Drawable drawable) {
        if (this.u) {
            return clone().S(drawable);
        }
        this.g = drawable;
        int i = this.a | 64;
        this.h = 0;
        this.a = i & (-129);
        ah();
        return this;
    }

    public rta T(rbh rbhVar) {
        if (this.u) {
            return clone().T(rbhVar);
        }
        rvi.f(rbhVar);
        this.d = rbhVar;
        this.a |= 8;
        ah();
        return this;
    }

    final rta U(rew rewVar) {
        if (this.u) {
            return clone().U(rewVar);
        }
        this.q.b.remove(rewVar);
        ah();
        return this;
    }

    public rta V(rew rewVar, Object obj) {
        if (this.u) {
            return clone().V(rewVar, obj);
        }
        rvi.f(rewVar);
        rvi.f(obj);
        this.q.d(rewVar, obj);
        ah();
        return this;
    }

    public rta W(res resVar) {
        if (this.u) {
            return clone().W(resVar);
        }
        rvi.f(resVar);
        this.l = resVar;
        this.a |= 1024;
        ah();
        return this;
    }

    public rta X(Resources.Theme theme) {
        if (this.u) {
            return clone().X(theme);
        }
        this.t = theme;
        if (theme != null) {
            this.a |= 32768;
            return V(rqk.a, theme);
        }
        this.a &= -32769;
        return U(rqk.a);
    }

    public rta Y(rfb rfbVar) {
        return aa(rfbVar, true);
    }

    public rta Z(rfb... rfbVarArr) {
        int length = rfbVarArr.length;
        if (length > 1) {
            return aa(new ret(rfbVarArr), true);
        }
        if (length == 1) {
            return Y(rfbVarArr[0]);
        }
        ah();
        return this;
    }

    final rta aa(rfb rfbVar, boolean z) {
        if (this.u) {
            return clone().aa(rfbVar, z);
        }
        roq roqVar = new roq(rfbVar, z);
        ac(Bitmap.class, rfbVar, z);
        ac(Drawable.class, roqVar, z);
        ac(BitmapDrawable.class, roqVar, z);
        ac(rqs.class, new rqv(rfbVar), z);
        ah();
        return this;
    }

    final rta ab(rok rokVar, rfb rfbVar) {
        if (this.u) {
            return clone().ab(rokVar, rfbVar);
        }
        F(rokVar);
        return Y(rfbVar);
    }

    final rta ac(Class cls, rfb rfbVar, boolean z) {
        if (this.u) {
            return clone().ac(cls, rfbVar, z);
        }
        rvi.f(cls);
        rvi.f(rfbVar);
        this.r.put(cls, rfbVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.v = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        ah();
        return this;
    }

    public final boolean ad(int i) {
        return d(this.a, i);
    }

    public final boolean ae() {
        return rvk.p(this.k, this.j);
    }

    public rta af() {
        if (this.u) {
            return clone().af();
        }
        this.z = false;
        this.a |= 524288;
        ah();
        return this;
    }

    public rta ag() {
        if (this.u) {
            return clone().ag();
        }
        this.w = true;
        this.a |= 1048576;
        ah();
        return this;
    }

    protected final void ah() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public rta ai() {
        if (this.u) {
            return clone().ai();
        }
        this.i = false;
        this.a |= 256;
        ah();
        return this;
    }

    public void aj() {
        this.x = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof rta) {
            rta rtaVar = (rta) obj;
            if (Float.compare(rtaVar.b, this.b) == 0 && this.f == rtaVar.f && rvk.l(this.e, rtaVar.e) && this.h == rtaVar.h && rvk.l(this.g, rtaVar.g)) {
                int i = rtaVar.p;
                if (rvk.l(this.o, rtaVar.o) && this.i == rtaVar.i && this.j == rtaVar.j && this.k == rtaVar.k && this.m == rtaVar.m && this.n == rtaVar.n) {
                    boolean z = rtaVar.y;
                    boolean z2 = rtaVar.z;
                    if (this.c.equals(rtaVar.c) && this.d == rtaVar.d && this.q.equals(rtaVar.q) && this.r.equals(rtaVar.r) && this.s.equals(rtaVar.s) && rvk.l(this.l, rtaVar.l) && rvk.l(this.t, rtaVar.t)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        float f = this.b;
        char[] cArr = rvk.a;
        return rvk.f(this.t, rvk.f(this.l, rvk.f(this.s, rvk.f(this.r, rvk.f(this.q, rvk.f(this.d, rvk.f(this.c, rvk.e(0, rvk.e(0, rvk.e(this.n ? 1 : 0, rvk.e(this.m ? 1 : 0, rvk.e(this.k, rvk.e(this.j, rvk.e(this.i ? 1 : 0, rvk.f(this.o, rvk.e(0, rvk.f(this.g, rvk.e(this.h, rvk.f(this.e, rvk.e(this.f, rvk.e(Float.floatToIntBits(f), 17)))))))))))))))))))));
    }

    public rta q(rta rtaVar) {
        if (this.u) {
            return clone().q(rtaVar);
        }
        int i = rtaVar.a;
        if (d(i, 2)) {
            this.b = rtaVar.b;
        }
        if (d(i, 262144)) {
            boolean z = rtaVar.y;
            this.y = false;
        }
        if (d(i, 1048576)) {
            this.w = rtaVar.w;
        }
        if (d(i, 4)) {
            this.c = rtaVar.c;
        }
        if (d(i, 8)) {
            this.d = rtaVar.d;
        }
        if (d(i, 16)) {
            this.e = rtaVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (d(rtaVar.a, 32)) {
            this.f = rtaVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (d(rtaVar.a, 64)) {
            this.g = rtaVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (d(rtaVar.a, 128)) {
            this.h = rtaVar.h;
            this.g = null;
            this.a &= -65;
        }
        int i2 = rtaVar.a;
        if (d(i2, 256)) {
            this.i = rtaVar.i;
        }
        if (d(i2, 512)) {
            this.k = rtaVar.k;
            this.j = rtaVar.j;
        }
        if (d(i2, 1024)) {
            this.l = rtaVar.l;
        }
        if (d(i2, 4096)) {
            this.s = rtaVar.s;
        }
        if (d(i2, 8192)) {
            this.o = rtaVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (d(rtaVar.a, 16384)) {
            int i3 = rtaVar.p;
            this.p = 0;
            this.o = null;
            this.a &= -8193;
        }
        int i4 = rtaVar.a;
        if (d(i4, 32768)) {
            this.t = rtaVar.t;
        }
        if (d(i4, 65536)) {
            this.n = rtaVar.n;
        }
        if (d(i4, 131072)) {
            this.m = rtaVar.m;
        }
        if (d(i4, 2048)) {
            this.r.putAll(rtaVar.r);
            this.v = rtaVar.v;
        }
        if (d(rtaVar.a, 524288)) {
            boolean z2 = rtaVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.r.clear();
            int i5 = this.a;
            this.m = false;
            this.a = i5 & (-133121);
            this.v = true;
        }
        this.a |= rtaVar.a;
        this.q.c(rtaVar.q);
        ah();
        return this;
    }

    @Override // 
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public rta clone() {
        try {
            rta rtaVar = (rta) super.clone();
            rex rexVar = new rex();
            rtaVar.q = rexVar;
            rexVar.c(this.q);
            ruv ruvVar = new ruv();
            rtaVar.r = ruvVar;
            ruvVar.putAll(this.r);
            rtaVar.x = false;
            rtaVar.u = false;
            return rtaVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public rta x() {
        if (this.x && !this.u) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.u = true;
        aj();
        return this;
    }

    public final rta y() {
        return ab(rok.e, new rnv());
    }

    public rta z() {
        return b(rok.d, new rnw());
    }
}
