package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndm extends ngq {
    private final long d;
    private final long f;
    private final boolean g;
    private final ArrayList h;
    private final mck i;
    private ndk j;
    private ndl k;
    private long l;
    private long m;

    public ndm(ndj ndjVar) {
        super(ndjVar.a);
        this.d = ndjVar.b;
        this.f = ndjVar.c;
        this.g = ndjVar.d;
        this.h = new ArrayList();
        this.i = new mck();
    }

    private final void E(mcl mclVar) {
        long j;
        mck mckVar = this.i;
        int i = 0;
        mclVar.p(0, mckVar);
        long j2 = mckVar.p;
        if (this.j == null || this.h.isEmpty()) {
            j = this.d;
            long j3 = this.f;
            this.l = j2 + j;
            this.m = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ndi) arrayList.get(i2)).m(this.l, this.m);
            }
            j = j3;
        } else {
            j = this.l - j2;
            if (this.f != Long.MIN_VALUE) {
                j = this.m - j2;
            }
        }
        try {
            ndk ndkVar = new ndk(mclVar, j, j);
            this.j = ndkVar;
            l(ndkVar);
        } catch (ndl e) {
            this.k = e;
            while (true) {
                ArrayList arrayList2 = this.h;
                if (i >= arrayList2.size()) {
                    return;
                }
                ((ndi) arrayList2.get(i)).d = this.k;
                i++;
            }
        }
    }

    @Override // defpackage.ndq, defpackage.ndd
    protected final void n() {
        super.n();
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.ndq, defpackage.nep
    public final void t() throws ndl {
        ndl ndlVar = this.k;
        if (ndlVar != null) {
            throw ndlVar;
        }
        super.t();
    }

    @Override // defpackage.ngq
    protected final void u(mcl mclVar) {
        if (this.k != null) {
            return;
        }
        E(mclVar);
    }

    @Override // defpackage.ngq, defpackage.nep
    public final void v(nel nelVar) {
        ArrayList arrayList = this.h;
        mee.c(arrayList.remove(nelVar));
        this.e.v(((ndi) nelVar).a);
        if (arrayList.isEmpty()) {
            ndk ndkVar = this.j;
            mee.f(ndkVar);
            E(ndkVar.b);
        }
    }

    @Override // defpackage.ngq, defpackage.nep
    public final nel w(nen nenVar, niu niuVar, long j) {
        ndi ndiVar = new ndi(this.e.w(nenVar, niuVar, j), this.g, this.l, this.m);
        this.h.add(ndiVar);
        return ndiVar;
    }
}
