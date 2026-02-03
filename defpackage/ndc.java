package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndc extends mpc implements Handler.Callback {
    private final ndb j;
    private final Handler k;
    private final nql l;
    private nqk m;
    private boolean n;
    private boolean o;
    private long p;
    private mbt q;
    private long r;
    private final mrk s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndc(mrk mrkVar, Looper looper) {
        Handler handler;
        super(5);
        ndb ndbVar = ndb.a;
        mee.f(mrkVar);
        this.s = mrkVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = mgb.a;
            handler = new Handler(looper, this);
        }
        this.k = handler;
        this.j = ndbVar;
        this.l = new nql();
        this.r = -9223372036854775807L;
    }

    private final long W(long j) {
        mee.c(j != -9223372036854775807L);
        mee.c(this.r != -9223372036854775807L);
        return j - this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(defpackage.mbt r7, java.util.List r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            int r1 = r7.a()
            if (r0 >= r1) goto L4f
            mbs r1 = r7.b(r0)
            mau r1 = r1.a()
            if (r1 == 0) goto L45
            ndb r2 = r6.j
            boolean r3 = r2.b(r1)
            if (r3 == 0) goto L45
            nqk r1 = r2.a(r1)
            mbs r2 = r7.b(r0)
            byte[] r2 = r2.c()
            defpackage.mee.f(r2)
            nql r3 = r6.l
            r3.eP()
            int r4 = r2.length
            r3.h(r4)
            java.nio.ByteBuffer r4 = r3.d
            java.lang.String r5 = defpackage.mgb.a
            r4.put(r2)
            r3.i()
            mbt r1 = r1.a(r3)
            if (r1 == 0) goto L4c
            r6.X(r1, r8)
            goto L4c
        L45:
            mbs r1 = r7.b(r0)
            r8.add(r1)
        L4c:
            int r0 = r0 + 1
            goto L1
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndc.X(mbt, java.util.List):void");
    }

    private final void Y(final mbt mbtVar) throws CloneNotSupportedException {
        final mrk mrkVar = this.s;
        mrn mrnVar = mrkVar.a;
        mbq mbqVar = new mbq(mrnVar.B);
        for (int i = 0; i < mbtVar.a(); i++) {
            mbtVar.b(i).b(mbqVar);
        }
        mrnVar.B = new mbr(mbqVar);
        mbr mbrVarAc = mrnVar.ac();
        if (!mbrVarAc.equals(mrnVar.s)) {
            mrnVar.s = mbrVarAc;
            mrnVar.h.d(14, new mez() { // from class: mre
                @Override // defpackage.mez
                public final void a(Object obj) {
                    ((mce) obj).j(mrkVar.a.s);
                }
            });
        }
        mfc mfcVar = mrnVar.h;
        mfcVar.d(28, new mez() { // from class: mrf
            @Override // defpackage.mez
            public final void a(Object obj) {
                int i2 = mrk.b;
                ((mce) obj).k(mbtVar);
            }
        });
        mfcVar.c();
    }

    @Override // defpackage.mpc
    protected final void B(mau[] mauVarArr, long j, long j2, nen nenVar) {
        this.m = this.j.a(mauVarArr[0]);
        mbt mbtVar = this.q;
        if (mbtVar != null) {
            long j3 = this.r;
            long j4 = mbtVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                mbtVar = new mbt(j5, mbtVar.a);
            }
            this.q = mbtVar;
        }
        this.r = j2;
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "MetadataRenderer";
    }

    @Override // defpackage.mth
    public final void S(long j, long j2) throws CloneNotSupportedException {
        boolean z;
        do {
            z = false;
            if (!this.n && this.q == null) {
                nql nqlVar = this.l;
                nqlVar.eP();
                msa msaVarJ = j();
                int iC = c(msaVarJ, nqlVar, 0);
                if (iC == -4) {
                    if (nqlVar.eS()) {
                        this.n = true;
                    } else if (nqlVar.f >= this.f) {
                        nqlVar.h = this.p;
                        nqlVar.i();
                        nqk nqkVar = this.m;
                        String str = mgb.a;
                        mbt mbtVarA = nqkVar.a(nqlVar);
                        if (mbtVarA != null) {
                            List arrayList = new ArrayList(mbtVarA.a());
                            X(mbtVarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.q = new mbt(W(nqlVar.f), (mbs[]) arrayList.toArray(new mbs[0]));
                            }
                        }
                    }
                } else if (iC == -5) {
                    mau mauVar = msaVarJ.b;
                    mee.f(mauVar);
                    this.p = mauVar.t;
                }
            }
            mbt mbtVar = this.q;
            if (mbtVar != null) {
                if (mbtVar.b <= W(j)) {
                    mbt mbtVar2 = this.q;
                    Handler handler = this.k;
                    if (handler != null) {
                        handler.obtainMessage(1, mbtVar2).sendToTarget();
                    } else {
                        Y(mbtVar2);
                    }
                    this.q = null;
                    z = true;
                }
            }
            if (this.n && this.q == null) {
                this.o = true;
            }
        } while (z);
    }

    @Override // defpackage.mth
    public final boolean T() {
        return this.o;
    }

    @Override // defpackage.mth
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) {
        if (this.j.b(mauVar)) {
            return mti.a(mauVar.O == 0 ? 4 : 2);
        }
        return mti.a(0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws CloneNotSupportedException {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        Y((mbt) message.obj);
        return true;
    }

    @Override // defpackage.mpc
    protected final void u() {
        this.q = null;
        this.m = null;
        this.r = -9223372036854775807L;
    }

    @Override // defpackage.mpc
    protected final void w(long j, boolean z) {
        this.q = null;
        this.n = false;
        this.o = false;
    }
}
