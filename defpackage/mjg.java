package defpackage;

import java.util.Deque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mjg implements mmk {
    protected final mok a;
    private mmi d = new mje();
    public mmj b = new mjf();
    public mmh c = new mmh() { // from class: mjc
        @Override // defpackage.mmh
        public final void a(mcw mcwVar) {
            mff.d("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", mcwVar);
        }
    };
    private Executor e = eoqg.a;
    private int f = -1;
    private int g = -1;

    public mjg(boolean z, int i) {
        this.a = new mok(z, i);
    }

    public abstract mft a(int i, int i2);

    public abstract void b(int i, long j);

    @Override // defpackage.mmk
    public void c() {
        mok mokVar = this.a;
        mokVar.e();
        this.d.w();
        for (int i = 0; i < mokVar.c; i++) {
            this.d.c();
        }
    }

    @Override // defpackage.mmk
    public void d(may mayVar, maz mazVar, long j) {
        try {
            int i = this.f;
            int i2 = mazVar.d;
            if (i != i2 || this.g != mazVar.e || !this.a.g()) {
                this.f = i2;
                int i3 = mazVar.e;
                this.g = i3;
                mft mftVarA = a(i2, i3);
                this.a.d(mayVar, mftVarA.c, mftVarA.d);
            }
            maz mazVarB = this.a.b();
            mev.u(mazVarB.c, mazVarB.d, mazVarB.e);
            if (k()) {
                mev.o();
            }
            b(mazVar.b, j);
            this.d.b(mazVar);
            this.b.x(mazVarB, j);
        } catch (mcw | meu e) {
            this.e.execute(new Runnable() { // from class: mjd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.a(mcw.a(e));
                }
            });
        }
    }

    @Override // defpackage.mmk
    public void e() throws mcw {
        try {
            this.a.c();
        } catch (meu e) {
            throw new mcw(e);
        }
    }

    @Override // defpackage.mmk
    public void f(maz mazVar) {
        mok mokVar = this.a;
        Deque deque = mokVar.b;
        if (deque.contains(mazVar)) {
            mee.c(deque.contains(mazVar));
            deque.remove(mazVar);
            mokVar.a.add(mazVar);
            this.d.c();
        }
    }

    @Override // defpackage.mmk
    public final void g(Executor executor, mmh mmhVar) {
        this.e = executor;
        this.c = mmhVar;
    }

    @Override // defpackage.mmk
    public final void h(mmi mmiVar) {
        this.d = mmiVar;
        for (int i = 0; i < this.a.a(); i++) {
            mmiVar.c();
        }
    }

    @Override // defpackage.mmk
    public final void i(mmj mmjVar) {
        this.b = mmjVar;
    }

    @Override // defpackage.mmk
    public void j() {
        this.b.a();
    }

    public boolean k() {
        return true;
    }
}
