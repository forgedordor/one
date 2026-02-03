package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddp {
    public final deb a;
    public final deh b;
    public final deh c;
    public deh d;
    public deh e;
    public final dib f;
    private final Object g;
    private final hox h;
    private final hox i;
    private final dgc j;
    private final dgi k;

    public ddp(Object obj, dib dibVar, Object obj2) {
        this.f = dibVar;
        this.g = obj2;
        this.a = new deb(dibVar, obj, null, 60);
        hsi hsiVar = hsi.a;
        this.h = new hpl(false, hsiVar);
        this.i = new hpl(obj, hsiVar);
        this.j = new dgc();
        this.k = new dgi(obj2, 3);
        deh dehVarA = a();
        deh dehVar = dehVarA instanceof ded ? ddq.e : dehVarA instanceof dee ? ddq.f : dehVarA instanceof def ? ddq.g : ddq.h;
        this.b = dehVar;
        deh dehVarA2 = a();
        deh dehVar2 = dehVarA2 instanceof ded ? ddq.a : dehVarA2 instanceof dee ? ddq.b : dehVarA2 instanceof def ? ddq.c : ddq.d;
        this.c = dehVar2;
        this.d = dehVar;
        this.e = dehVar2;
    }

    public static /* synthetic */ Object k(ddp ddpVar, Object obj, ddz ddzVar, fdap fdapVar, fcxy fcxyVar, int i) {
        if ((i & 2) != 0) {
            ddzVar = ddpVar.k;
        }
        ddz ddzVar2 = ddzVar;
        Object objInvoke = (i & 4) != 0 ? ddpVar.f.b.invoke(ddpVar.a()) : null;
        fdap fdapVar2 = (i & 8) != 0 ? null : fdapVar;
        Object objD = ddpVar.d();
        dib dibVar = ddpVar.f;
        return fdjy.a(new dgb(dfx.a, ddpVar.j, new ddm(ddpVar, objInvoke, new dgw(ddzVar2, dibVar, objD, obj, (deh) dibVar.a.invoke(objInvoke)), ddpVar.a.b, fdapVar2, null), null), fcxyVar);
    }

    public final deh a() {
        return this.a.a;
    }

    public final Object b(Object obj) {
        if (fdbq.f(this.d, this.b) && fdbq.f(this.e, this.c)) {
            return obj;
        }
        dib dibVar = this.f;
        deh dehVar = (deh) dibVar.a.invoke(obj);
        int iB = dehVar.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (dehVar.a(i) < this.d.a(i) || dehVar.a(i) > this.e.a(i)) {
                dehVar.e(i, fddu.e(dehVar.a(i), this.d.a(i), this.e.a(i)));
                z = true;
            }
        }
        return z ? dibVar.b.invoke(dehVar) : obj;
    }

    public final Object c() {
        return this.i.a();
    }

    public final Object d() {
        return this.a.a();
    }

    public final Object e(Object obj, fcxy fcxyVar) {
        Object objA = fdjy.a(new dgb(dfx.a, this.j, new ddn(this, obj, null), null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object f(fcxy fcxyVar) {
        Object objA = fdjy.a(new dgb(dfx.a, this.j, new ddo(this, null), null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void g() {
        deb debVar = this.a;
        debVar.a.d();
        debVar.b = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.i.b(obj);
    }

    public final boolean j() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public /* synthetic */ ddp(Object obj, dib dibVar, Object obj2, int i) {
        this(obj, dibVar, (i & 4) != 0 ? null : obj2);
    }
}
