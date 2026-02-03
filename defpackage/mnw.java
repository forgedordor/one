package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnw implements mmk {
    private final met b;
    private final boolean c;
    private boolean g;
    private maz h;
    private maz i;
    private maz j;
    private float k;
    private float l;
    private float m;
    private float n;
    private mft o;
    private mft p;
    private mft q;
    private final mmq r;
    private mnr s;
    private mmi d = new mnu();
    private mmj e = new mnv();
    public mmh a = new mmh() { // from class: mnt
        @Override // defpackage.mmh
        public final void a(mcw mcwVar) {
        }
    };
    private Executor f = eoqg.a;

    public mnw(Context context, boolean z, mmq mmqVar) throws mcw {
        this.c = z;
        this.r = mmqVar;
        maz mazVar = maz.a;
        this.j = mazVar;
        this.i = mazVar;
        this.h = mazVar;
        mft mftVar = mft.b;
        this.p = mftVar;
        this.q = mftVar;
        this.o = mftVar;
        this.s = null;
        try {
            this.b = new met(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_separable_convolution_es2.glsl");
        } catch (IOException | meu e) {
            throw new mcw(e);
        }
    }

    private final maz a(may mayVar, maz mazVar, mft mftVar) {
        int i = mftVar.c;
        if (i == mazVar.d && mftVar.d == mazVar.e) {
            return mazVar;
        }
        mazVar.a();
        int i2 = mftVar.d;
        return mayVar.d(mev.c(i, i2, this.c), i, i2);
    }

    private final void b(int i, boolean z) {
        int i2 = z ? this.p.c : this.q.d;
        met metVar = this.b;
        metVar.j();
        metVar.i("uTexSampler", i, 0);
        metVar.h("uIsHorizontal", z ? 1 : 0);
        float f = i2;
        metVar.f("uSourceTexelSize", 1.0f / f);
        metVar.f("uSourceFullSize", f);
        metVar.f("uConvStartTexels", this.m);
        metVar.f("uConvWidthTexels", this.n);
        metVar.f("uFunctionLookupStepSize", this.k);
        metVar.g("uFunctionLookupCenter", new float[]{this.l, 0.5f});
        metVar.i("uFunctionLookupSampler", this.j.b, 1);
        metVar.d();
        GLES20.glDrawArrays(5, 0, 4);
        mev.m();
    }

    @Override // defpackage.mmk
    public final void c() {
        this.g = false;
        this.d.w();
        this.d.c();
    }

    @Override // defpackage.mmk
    public final void d(may mayVar, maz mazVar, long j) {
        int i;
        int i2;
        float fSin;
        mee.d(!this.g, "The shader program does not currently accept input frames. Release prior output frames first.");
        try {
            mft mftVar = new mft(mazVar.d, mazVar.e);
            mmq mmqVar = this.r;
            mft mftVar2 = new mft(mmqVar.a, mmqVar.b);
            int i3 = mftVar.c;
            int i4 = mftVar.d;
            float fD = mmr.d(i3, i4, mftVar2.c, mftVar2.d);
            mmqVar.c = fD;
            this.o = new mft(Math.round(i3 * fD), Math.round(i4 * mmqVar.c));
            mnr mnrVar = new mnr(Math.min(mmqVar.c, 1.0f));
            if (!mnrVar.equals(this.s)) {
                int iCeil = (int) Math.ceil((mjq.a(mnrVar) * 5.0f) + 10.0f);
                float f = iCeil;
                this.k = 1.0f / (f / 5.0f);
                FloatBuffer floatBufferAllocate = FloatBuffer.allocate(iCeil);
                float fA = mnrVar.a();
                int i5 = 0;
                int i6 = 0;
                while (i5 < iCeil) {
                    int i7 = i5 - 5;
                    float f2 = (i7 * 0.2f) + fA;
                    if (i7 < 0 || i5 > iCeil - 5) {
                        i2 = iCeil;
                    } else {
                        float f3 = f2 * mnrVar.a;
                        i2 = iCeil;
                        if (Math.abs(f3) < 1.0E-5d) {
                            fSin = 1.0f;
                        } else if (Math.abs(f3) <= 3.0f) {
                            double d = f3;
                            double d2 = 3.141592653589793d * d;
                            fSin = (float) (((Math.sin(d2) * 3.0d) * Math.sin(d2 / 3.0d)) / ((9.869604401089358d * d) * d));
                        }
                        floatBufferAllocate.put(i6, fSin);
                        i5++;
                        i6++;
                        iCeil = i2;
                    }
                    fSin = 0.0f;
                    floatBufferAllocate.put(i6, fSin);
                    i5++;
                    i6++;
                    iCeil = i2;
                }
                int i8 = iCeil;
                this.l = (-(fA - 1.1f)) / (f * 0.2f);
                this.m = mnrVar.a();
                this.n = mjq.a(mnrVar);
                maz mazVar2 = this.j;
                if (mazVar2 != maz.a) {
                    i = i8;
                    if (mazVar2.d != i) {
                    }
                    mev.l(3553, this.j.b, 9729);
                    GLES20.glTexImage2D(3553, 0, 33325, i, 1, 0, 6403, 5126, floatBufferAllocate);
                    mev.m();
                    this.s = mnrVar;
                } else {
                    i = i8;
                }
                mazVar2.a();
                this.j = new maz(mev.d(), -1, i, 1);
                mev.l(3553, this.j.b, 9729);
                GLES20.glTexImage2D(3553, 0, 33325, i, 1, 0, 6403, 5126, floatBufferAllocate);
                mev.m();
                this.s = mnrVar;
            }
            if (!mftVar.equals(this.p)) {
                met metVar = this.b;
                metVar.k(mev.C());
                float[] fArrB = mev.B();
                metVar.g("uTransformationMatrix", fArrB);
                metVar.g("uTexTransformationMatrix", fArrB);
                mft mftVar3 = new mft(this.o.c, i4);
                this.q = mftVar3;
                this.i = a(mayVar, this.i, mftVar3);
                this.h = a(mayVar, this.h, this.o);
                this.p = mftVar;
            }
            this.g = true;
            maz mazVar3 = this.i;
            mev.u(mazVar3.c, mazVar3.d, mazVar3.e);
            mev.o();
            b(mazVar.b, true);
            maz mazVar4 = this.h;
            mev.u(mazVar4.c, mazVar4.d, mazVar4.e);
            mev.o();
            b(this.i.b, false);
            GLES20.glDrawArrays(5, 0, 4);
            mev.m();
            this.d.b(mazVar);
            this.e.x(this.h, j);
        } catch (meu e) {
            this.f.execute(new Runnable() { // from class: mns
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a(mcw.a(e));
                }
            });
        }
    }

    @Override // defpackage.mmk
    public final void e() throws mcw {
        try {
            this.h.a();
            this.i.a();
            this.j.a();
            this.b.e();
        } catch (meu e) {
            throw new mcw(e);
        }
    }

    @Override // defpackage.mmk
    public final void f(maz mazVar) {
        this.g = false;
        this.d.c();
    }

    @Override // defpackage.mmk
    public final void g(Executor executor, mmh mmhVar) {
        this.f = executor;
        this.a = mmhVar;
    }

    @Override // defpackage.mmk
    public final void h(mmi mmiVar) {
        this.d = mmiVar;
        if (this.g) {
            return;
        }
        mmiVar.c();
    }

    @Override // defpackage.mmk
    public final void i(mmj mmjVar) {
        this.e = mmjVar;
    }

    @Override // defpackage.mmk
    public final void j() {
        this.e.a();
    }
}
