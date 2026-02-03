package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eily extends eimn {
    public SparseArray a;
    private eiii b;
    private boolean c;
    private float d;
    private byte e;

    @Override // defpackage.eimn
    public final eimo a() {
        eiii eiiiVar;
        SparseArray sparseArray;
        if (this.e == 3 && (eiiiVar = this.b) != null && (sparseArray = this.a) != null) {
            return new eilz(eiiiVar, sparseArray, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" traceRecord");
        }
        if (this.a == null) {
            sb.append(" spanExtras");
        }
        if ((this.e & 1) == 0) {
            sb.append(" isPartialTrace");
        }
        if ((this.e & 2) == 0) {
            sb.append(" traceSamplingRate");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eimn
    public final void b(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.eimn
    public final void c(eiii eiiiVar) {
        if (eiiiVar == null) {
            throw new NullPointerException("Null traceRecord");
        }
        this.b = eiiiVar;
    }

    @Override // defpackage.eimn
    public final void d(float f) {
        this.d = f;
        this.e = (byte) (this.e | 2);
    }
}
