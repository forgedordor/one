package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdvo {
    private int a;
    private fdxh b;
    public fdvq[] d;
    public int e;

    public final fdvc b() {
        fdxh fdxhVar;
        synchronized (this) {
            fdxhVar = this.b;
            if (fdxhVar == null) {
                fdxhVar = new fdxh(this.e);
                this.b = fdxhVar;
            }
        }
        return fdxhVar;
    }

    protected abstract fdvq j();

    protected abstract fdvq[] m();

    protected final fdvq n() {
        fdvq fdvqVarJ;
        fdxh fdxhVar;
        synchronized (this) {
            fdvq[] fdvqVarArrM = this.d;
            if (fdvqVarArrM == null) {
                fdvqVarArrM = m();
                this.d = fdvqVarArrM;
            } else {
                int i = this.e;
                int length = fdvqVarArrM.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(fdvqVarArrM, length + length);
                    objArrCopyOf.getClass();
                    fdvqVarArrM = (fdvq[]) objArrCopyOf;
                    this.d = fdvqVarArrM;
                }
            }
            int i2 = this.a;
            do {
                fdvqVarJ = fdvqVarArrM[i2];
                if (fdvqVarJ == null) {
                    fdvqVarJ = j();
                    fdvqVarArrM[i2] = fdvqVarJ;
                }
                i2++;
                if (i2 >= fdvqVarArrM.length) {
                    i2 = 0;
                }
            } while (!fdvqVarJ.a(this));
            this.a = i2;
            this.e++;
            fdxhVar = this.b;
        }
        if (fdxhVar != null) {
            fdxhVar.p(1);
        }
        return fdvqVarJ;
    }

    protected final void o(fdvq fdvqVar) {
        fdxh fdxhVar;
        int i;
        fcxy[] fcxyVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            fdxhVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            fdvqVar.getClass();
            fcxyVarArrB = fdvqVar.b(this);
        }
        for (fcxy fcxyVar : fcxyVarArrB) {
            if (fcxyVar != null) {
                fcxyVar.w(fctx.a);
            }
        }
        if (fdxhVar != null) {
            fdxhVar.p(-1);
        }
    }
}
