package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrs implements hsf {
    public final hsf a;
    private final fdjc b = new fdjd();
    private final hox c;
    private final hox d;
    private final hsf e;

    public qrs() {
        hsi hsiVar = hsi.a;
        this.c = new hpl(null, hsiVar);
        this.d = new hpl(null, hsiVar);
        fdae fdaeVar = new fdae() { // from class: qro
            @Override // defpackage.fdae
            public final Object invoke() {
                qrs qrsVar = this.a;
                boolean z = false;
                if (qrsVar.a() == null && qrsVar.c() == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar, null);
        this.e = new hnt(new fdae() { // from class: qrp
            @Override // defpackage.fdae
            public final Object invoke() {
                qrs qrsVar = this.a;
                boolean z = true;
                if (qrsVar.a() == null && qrsVar.c() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        new hnt(new fdae() { // from class: qrq
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.c() != null);
            }
        }, null);
        this.a = new hnt(new fdae() { // from class: qrr
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.a() != null);
            }
        }, null);
    }

    @Override // defpackage.hsf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qnm a() {
        return (qnm) this.c.a();
    }

    public final Throwable c() {
        return (Throwable) this.d.a();
    }

    public final synchronized void d(qnm qnmVar) {
        qnmVar.getClass();
        if (f()) {
            return;
        }
        this.c.b(qnmVar);
        ((fdme) this.b).R(qnmVar);
    }

    public final synchronized void e(Throwable th) {
        if (f()) {
            return;
        }
        this.d.b(th);
        this.b.a(th);
    }

    public final boolean f() {
        return ((Boolean) this.e.a()).booleanValue();
    }
}
