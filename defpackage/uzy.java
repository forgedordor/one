package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzy extends fcyz implements fdap {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    Object i;
    Object j;
    Object k;
    Object l;
    int m;
    final /* synthetic */ boolean n;
    final /* synthetic */ vae o;
    final /* synthetic */ boolean p;
    final /* synthetic */ boolean q;
    final /* synthetic */ boolean r;
    final /* synthetic */ boolean s;
    final /* synthetic */ boolean t;
    final /* synthetic */ boolean u;
    final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzy(boolean z, vae vaeVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.n = z;
        this.o = vaeVar;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        fcyl fcylVar = fcyl.a;
        if (this.m != 0) {
            z8 = this.h;
            z7 = this.g;
            z6 = this.f;
            z5 = this.e;
            z4 = this.d;
            z3 = this.c;
            z2 = this.b;
            z = this.a;
            Object obj6 = this.l;
            obj2 = this.k;
            obj3 = this.j;
            Object obj7 = this.i;
            fctl.b(obj);
            obj5 = obj6;
            obj4 = obj7;
        } else {
            fctl.b(obj);
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.MAGIC_COMPOSE_DISPLAY;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            z = this.n;
            vae vaeVar = this.o;
            z2 = this.p;
            z3 = this.q;
            z4 = this.r;
            z5 = this.s;
            z6 = this.t;
            z7 = this.u;
            boolean z9 = this.v;
            ensp enspVar = (ensp) enss.a.createBuilder();
            enspVar.getClass();
            entp entpVar = new entp(enspVar);
            ensp enspVar2 = entpVar.a;
            enspVar2.copyOnWrite();
            enss enssVar = (enss) enspVar2.instance;
            enssVar.b |= 2;
            enssVar.d = z;
            cmfo cmfoVar = (cmfo) vaeVar.c.b();
            this.i = entpVar;
            this.j = entpVar;
            this.k = entpVar;
            this.l = ellgVar;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            this.h = z9;
            this.m = 1;
            obj = cmfoVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z8 = z9;
            obj2 = entpVar;
            obj3 = obj2;
            obj5 = ellgVar;
            obj4 = entpVar;
        }
        boolean z10 = ((cwtl) obj).c;
        ensp enspVar3 = ((entp) obj2).a;
        enspVar3.copyOnWrite();
        enss enssVar2 = (enss) enspVar3.instance;
        enss enssVar3 = enss.a;
        enssVar2.b |= 4;
        enssVar2.e = z10;
        if (!z) {
            ensq ensqVar = (ensq) ensr.a.createBuilder();
            ensqVar.getClass();
            ensqVar.copyOnWrite();
            ensr ensrVar = (ensr) ensqVar.instance;
            ensrVar.b |= 1;
            ensrVar.c = z3;
            ensqVar.copyOnWrite();
            ensr ensrVar2 = (ensr) ensqVar.instance;
            ensrVar2.b |= 4;
            ensrVar2.d = z4;
            ensqVar.copyOnWrite();
            ensr ensrVar3 = (ensr) ensqVar.instance;
            ensrVar3.b |= 8;
            ensrVar3.e = z5;
            boolean z11 = z6 || z7;
            ensqVar.copyOnWrite();
            ensr ensrVar4 = (ensr) ensqVar.instance;
            ensrVar4.b |= 16;
            ensrVar4.f = z11;
            if (z2 && z8) {
                ensqVar.copyOnWrite();
                ensr ensrVar5 = (ensr) ensqVar.instance;
                ensrVar5.b |= 32;
                ensrVar5.g = true;
            }
            evsn evsnVarBuild = ensqVar.build();
            evsnVarBuild.getClass();
            ensp enspVar4 = ((entp) obj3).a;
            enspVar4.copyOnWrite();
            enss enssVar4 = (enss) enspVar4.instance;
            enssVar4.c = (ensr) evsnVarBuild;
            enssVar4.b |= 1;
        }
        if (z2) {
            boolean zO = vae.o();
            ensp enspVar5 = ((entp) obj3).a;
            enspVar5.copyOnWrite();
            enss enssVar5 = (enss) enspVar5.instance;
            enssVar5.b |= 8;
            enssVar5.f = zO;
        }
        evsn evsnVarBuild2 = ((entp) obj4).a.build();
        evsnVarBuild2.getClass();
        ((evsf) obj5).copyOnWrite();
        ellh ellhVar2 = (ellh) ((ellg) obj5).instance;
        ellh ellhVar3 = ellh.a;
        ellhVar2.bF = (enss) evsnVarBuild2;
        ellhVar2.g |= 262144;
        return obj5;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new uzy(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (fcxy) obj).b(fctx.a);
    }
}
