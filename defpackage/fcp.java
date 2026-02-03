package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcp implements dyb {
    private final /* synthetic */ dyb a;
    private final hsf b;
    private final hsf c;

    public fcp(dyb dybVar, final fcu fcuVar) {
        this.a = dybVar;
        fdae fdaeVar = new fdae() { // from class: fcn
            @Override // defpackage.fdae
            public final Object invoke() {
                fcu fcuVar2 = fcuVar;
                return Boolean.valueOf(fcuVar2.b() < fcuVar2.a());
            }
        };
        hxn hxnVar = hrp.a;
        this.b = new hnt(fdaeVar, null);
        this.c = new hnt(new fdae() { // from class: fco
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(fcuVar.b() > 0.0f);
            }
        }, null);
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.dyb
    public final Object e(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        return this.a.e(dodVar, fdatVar, fcxyVar);
    }

    @Override // defpackage.dyb
    public final boolean g() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean h() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.a.i();
    }
}
