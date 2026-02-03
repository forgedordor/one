package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqc extends icr implements jfy {
    public fdae a;
    public ept b;
    public dwm c;
    public boolean d;
    public boolean e;
    private jry f;
    private final fdap g = new fdap() { // from class: epw
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            eoi eoiVar = (eoi) this.a.a.invoke();
            int iB = eoiVar.b();
            int i = 0;
            while (true) {
                if (i >= iB) {
                    i = -1;
                    break;
                }
                if (fdbq.f(eoiVar.d(i), obj)) {
                    break;
                }
                i++;
            }
            return Integer.valueOf(i);
        }
    };
    private fdap h;

    public eqc(fdae fdaeVar, ept eptVar, dwm dwmVar, boolean z, boolean z2) {
        this.a = fdaeVar;
        this.b = eptVar;
        this.c = dwmVar;
        this.d = z;
        this.e = z2;
        a();
    }

    public final void a() {
        this.f = new jry(new fdae() { // from class: epx
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.b.b());
            }
        }, new fdae() { // from class: epy
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.b.a());
            }
        }, this.e);
        this.h = this.d ? new fdap() { // from class: epz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                eqc eqcVar = this.a;
                eoi eoiVar = (eoi) eqcVar.a.invoke();
                if (iIntValue < 0 || iIntValue >= eoiVar.b()) {
                    ebs.c("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + eoiVar.b() + ')');
                }
                fdil.d(eqcVar.E(), null, null, new eqb(eqcVar, iIntValue, null), 3);
                return true;
            }
        } : null;
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        jtk.L(jtoVar);
        jtoVar.e(jte.L, this.g);
        if (this.c == dwm.a) {
            jry jryVar = this.f;
            if (jryVar == null) {
                fdbq.c("scrollAxisRange");
                jryVar = null;
            }
            jtk.A(jtoVar, jryVar);
        } else {
            jry jryVar2 = this.f;
            if (jryVar2 == null) {
                fdbq.c("scrollAxisRange");
                jryVar2 = null;
            }
            jtk.m(jtoVar, jryVar2);
        }
        fdap fdapVar = this.h;
        if (fdapVar != null) {
            jtoVar.e(jsa.f, new jrn(null, fdapVar));
        }
        jtoVar.e(jsa.B, new jrn(null, new jtj(new fdae() { // from class: eqa
            @Override // defpackage.fdae
            public final Object invoke() {
                eqc eqcVar = this.a;
                return Float.valueOf(eqcVar.b.d() - eqcVar.b.c());
            }
        })));
        jro jroVarE = this.b.e();
        jtn jtnVar = jte.f;
        fdeh fdehVar = jtk.a[22];
        jtnVar.a(jtoVar, jroVarE);
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }
}
