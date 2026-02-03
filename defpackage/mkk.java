package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkk implements mom {
    public final may a;
    public final mkh b;
    public final mou c;
    public EGLDisplay e;
    public EGLSurface f;
    private final mml g;
    private boolean i;
    private mag l;
    private final mnf n;
    private int m = -1;
    private final SparseArray h = new SparseArray();
    public final mok d = new mok(false, 1);
    private final mfh j = new mfh(1);
    private final mfh k = new mfh(1);

    public mkk(Context context, may mayVar, ExecutorService executorService, final mnf mnfVar, mml mmlVar) {
        this.n = mnfVar;
        this.g = mmlVar;
        this.a = mayVar;
        this.b = new mkh(context);
        mou mouVar = new mou(executorService, false, new mos() { // from class: mke
            @Override // defpackage.mos
            public final void a(mcw mcwVar) {
                mnfVar.a.o(mcwVar);
            }
        });
        this.c = mouVar;
        mouVar.d(new mot() { // from class: mkf
            @Override // defpackage.mot
            public final void a() {
                mkk mkkVar = this.a;
                mkkVar.e = mev.h();
                mkkVar.f = mev.j(mkkVar.a.a(mkkVar.e, 2, mev.a), mkkVar.e);
            }
        });
    }

    private final synchronized ekgb g() {
        if (this.d.a() == 0) {
            int i = ekgb.d;
            return ekoe.a;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 >= sparseArray.size()) {
                ekfw ekfwVar = new ekfw();
                mki mkiVar = (mki) ((mkj) sparseArray.get(this.m)).a.element();
                ekfwVar.h(mkiVar);
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (sparseArray.keyAt(i3) != this.m) {
                        mkj mkjVar = (mkj) sparseArray.valueAt(i3);
                        Queue queue = mkjVar.a;
                        if (queue.size() == 1 && !mkjVar.b) {
                            int i4 = ekgb.d;
                            return ekoe.a;
                        }
                        Iterator it = queue.iterator();
                        mki mkiVar2 = null;
                        long j = Long.MAX_VALUE;
                        while (it.hasNext()) {
                            mki mkiVar3 = (mki) it.next();
                            long j2 = mkiVar3.b.b;
                            long j3 = mkiVar.b.b;
                            long jAbs = Math.abs(j2 - j3);
                            if (jAbs < j) {
                                mkiVar2 = mkiVar3;
                            }
                            if (jAbs < j) {
                                j = jAbs;
                            }
                            if (j2 > j3 || (!it.hasNext() && mkjVar.b)) {
                                mee.f(mkiVar2);
                                ekfwVar.h(mkiVar2);
                                break;
                            }
                        }
                    }
                }
                ekgb ekgbVarG = ekfwVar.g();
                if (((ekoe) ekgbVarG).c == sparseArray.size()) {
                    return ekgbVarG;
                }
                return ekoe.a;
            }
            if (((mkj) sparseArray.valueAt(i2)).a.isEmpty()) {
                int i5 = ekgb.d;
                return ekoe.a;
            }
            i2++;
        }
    }

    private final synchronized void h() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i < sparseArray.size()) {
                if (sparseArray.keyAt(i) != this.m) {
                    i((mkj) sparseArray.valueAt(i));
                }
                i++;
            }
        }
    }

    private final synchronized void i(mkj mkjVar) {
        mkj mkjVar2 = (mkj) this.h.get(this.m);
        Queue queue = mkjVar2.a;
        if (queue.isEmpty() && mkjVar2.b) {
            j(mkjVar, mkjVar.a.size());
            return;
        }
        mki mkiVar = (mki) queue.peek();
        final long j = mkiVar != null ? mkiVar.b.b : -9223372036854775807L;
        j(mkjVar, Math.max(ekis.b(ekis.d(mkjVar.a, new ejwm() { // from class: mkg
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((mki) obj).b.b <= j;
            }
        })) - 1, 0));
    }

    private final synchronized void j(mkj mkjVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mki mkiVar = (mki) mkjVar.a.remove();
            mmm mmmVar = mkiVar.a;
            final long j = mkiVar.b.b;
            final mlx mlxVar = (mlx) mmmVar;
            ((mlx) mmmVar).f.d(new mot() { // from class: mlv
                @Override // defpackage.mot
                public final void a() {
                    mlx mlxVar2 = mlxVar;
                    mee.c(mlxVar2.m != null);
                    while (true) {
                        mok mokVar = mlxVar2.j;
                        if (mokVar.a() >= mokVar.c) {
                            return;
                        }
                        long j2 = j;
                        mfh mfhVar = mlxVar2.k;
                        if (mfhVar.a() > j2) {
                            return;
                        }
                        mokVar.f();
                        mfhVar.b();
                        mev.p(mlxVar2.l.b());
                        mlxVar2.p.c();
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a() {
        ekgb ekgbVarG = g();
        if (!ekgbVarG.isEmpty()) {
            mki mkiVar = (mki) ekgbVarG.get(this.m);
            ekfw ekfwVar = new ekfw();
            int i = 0;
            for (int i2 = 0; i2 < ((ekoe) ekgbVarG).c; i2++) {
                maz mazVar = ((mki) ekgbVarG.get(i2)).b.a;
                ekfwVar.h(new mft(mazVar.d, mazVar.e));
            }
            mft mftVar = (mft) ekfwVar.g().get(0);
            mok mokVar = this.d;
            mokVar.d(this.a, mftVar.c, mftVar.d);
            mol molVar = mkiVar.b;
            mfh mfhVar = this.j;
            maz mazVarB = mokVar.b();
            long j = molVar.b;
            mfhVar.c(j);
            mkh mkhVar = this.b;
            if (mkhVar.c == null) {
                try {
                    mkhVar.c = new met(mkhVar.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                    mkhVar.c.k(mev.C());
                    mkhVar.c.g("uTexTransformationMatrix", mev.B());
                } catch (IOException e) {
                    throw new mcw(e);
                }
            }
            int i3 = mazVarB.c;
            int i4 = mazVarB.d;
            int i5 = mazVarB.e;
            mev.u(i3, i4, i5);
            mnl mnlVar = mkhVar.b;
            mnlVar.j = new mft(i4, i5);
            mev.o();
            met metVar = mkhVar.c;
            mee.f(metVar);
            metVar.j();
            int i6 = 3042;
            GLES20.glEnable(3042);
            int i7 = 1;
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            mev.m();
            int i8 = ((ekoe) ekgbVarG).c - 1;
            while (i8 >= 0) {
                mki mkiVar2 = (mki) ekgbVarG.get(i8);
                met metVar2 = mkhVar.c;
                mee.f(metVar2);
                maz mazVar2 = mkiVar2.b.a;
                metVar2.i("uTexSampler", mazVar2.b, i);
                mft mftVar2 = new mft(mazVar2.d, mazVar2.e);
                mbx mbxVar = mkiVar2.c;
                float[] fArr = mnlVar.b;
                mev.w(fArr);
                float[] fArr2 = mnlVar.a;
                mev.w(fArr2);
                float[] fArr3 = mnlVar.e;
                mev.w(fArr3);
                int i9 = i6;
                float[] fArr4 = mnlVar.c;
                mev.w(fArr4);
                int i10 = i7;
                float[] fArr5 = mnlVar.d;
                mev.w(fArr5);
                float[] fArr6 = mnlVar.f;
                mev.w(fArr6);
                ekgb ekgbVar = ekgbVarG;
                float[] fArr7 = mnlVar.g;
                mev.w(fArr7);
                mkh mkhVar2 = mkhVar;
                float[] fArr8 = mnlVar.h;
                mev.w(fArr8);
                float[] fArr9 = mnlVar.i;
                mev.w(fArr9);
                Pair pair = mbx.a;
                int i11 = i8;
                maz mazVar3 = mazVarB;
                long j2 = j;
                Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
                mee.g(mnlVar.j);
                int i12 = mftVar2.c;
                float f = mnlVar.j.c;
                float f2 = mftVar2.d;
                float f3 = i12;
                Matrix.scaleM(fArr, 0, f3 / f, f2 / r6.d, 1.0f);
                Pair pair2 = mbx.c;
                Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
                Matrix.invertM(fArr5, 0, fArr4, 0);
                Pair pair3 = mbx.b;
                Matrix.translateM(fArr3, 0, -((Float) pair3.first).floatValue(), -((Float) pair3.second).floatValue(), 0.0f);
                Matrix.rotateM(fArr6, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(fArr7, 0, f2 / f3, 1.0f, 1.0f);
                Matrix.invertM(fArr8, 0, fArr7, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr2, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr4, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr3, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr5, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr7, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr6, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr8, 0);
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr4, 0);
                metVar2.g("uTransformationMatrix", fArr9);
                metVar2.f("uAlphaScale", 1.0f);
                metVar2.d();
                GLES20.glDrawArrays(5, 0, 4);
                mev.m();
                i8 = i11 - 1;
                i = 0;
                i6 = i9;
                i7 = i10;
                ekgbVarG = ekgbVar;
                mkhVar = mkhVar2;
                mazVarB = mazVar3;
                j = j2;
            }
            maz mazVar4 = mazVarB;
            long j3 = j;
            GLES20.glDisable(i6);
            mev.m();
            this.k.c(mev.e());
            mnk mnkVar = ((mmx) this.g).a;
            mee.c(!mnkVar.i);
            int i13 = mjr.a;
            mnkVar.e.add(new mol(mazVar4, j3));
            mnkVar.f.put(mazVar4.b, new mnh(this, j3));
            mnkVar.p();
            mkj mkjVar = (mkj) this.h.get(this.m);
            j(mkjVar, i7);
            h();
            if (this.i && mkjVar.a.isEmpty()) {
                this.n.a();
            }
        }
    }

    @Override // defpackage.mom
    public final synchronized void b(int i, mmm mmmVar, maz mazVar, mag magVar, long j) {
        SparseArray sparseArray = this.h;
        mee.c(mgb.U(sparseArray, i));
        mkj mkjVar = (mkj) sparseArray.get(i);
        mee.c(!mkjVar.b);
        if (this.l == null) {
            this.l = magVar;
        }
        mee.d(this.l.equals(magVar), "Mixing different ColorInfos is not supported.");
        mkjVar.a.add(new mki(mmmVar, new mol(mazVar, j), new mct()));
        if (i == this.m) {
            h();
        } else {
            i(mkjVar);
        }
        this.c.d(new mkd(this));
    }

    @Override // defpackage.mom
    public final synchronized void c(int i) {
        SparseArray sparseArray = this.h;
        mee.c(!mgb.U(sparseArray, i));
        sparseArray.put(i, new mkj());
        if (this.m == -1) {
            this.m = i;
        }
    }

    @Override // defpackage.mom
    public final synchronized void d() {
        try {
            this.c.c(new mot() { // from class: mkc
                @Override // defpackage.mot
                public final void a() {
                    mkk mkkVar = this.a;
                    try {
                        try {
                            met metVar = mkkVar.b.c;
                            if (metVar != null) {
                                metVar.e();
                            }
                        } catch (meu e) {
                            mff.d("CompositorGlProgram", "Error releasing GL Program", e);
                        }
                        mkkVar.d.c();
                        mev.s(mkkVar.e, mkkVar.f);
                    } catch (meu e2) {
                        mff.d("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final synchronized void e(long j) {
        while (true) {
            mok mokVar = this.d;
            if (mokVar.a() >= mokVar.c) {
                break;
            }
            mfh mfhVar = this.j;
            if (mfhVar.a() > j) {
                break;
            }
            mokVar.f();
            mfhVar.b();
            mev.p(this.k.b());
        }
        a();
    }

    @Override // defpackage.mom
    public final synchronized void f(int i) {
        SparseArray sparseArray = this.h;
        mee.c(mgb.U(sparseArray, i));
        boolean z = false;
        mee.c(this.m != -1);
        ((mkj) sparseArray.get(i)).b = true;
        int i2 = 0;
        while (true) {
            if (i2 >= sparseArray.size()) {
                z = true;
                break;
            } else if (!((mkj) sparseArray.valueAt(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        this.i = z;
        if (((mkj) sparseArray.get(this.m)).a.isEmpty()) {
            if (i == this.m) {
                h();
            }
            if (z) {
                this.n.a();
                return;
            }
        }
        if (i == this.m || ((mkj) sparseArray.get(i)).a.size() != 1) {
            return;
        }
        this.c.d(new mkd(this));
    }
}
