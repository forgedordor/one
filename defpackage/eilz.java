package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eilz extends eimo {
    public final eiii a;
    public final SparseArray b;
    public final boolean c;
    public final float d;

    public eilz(eiii eiiiVar, SparseArray sparseArray, boolean z, float f) {
        this.a = eiiiVar;
        this.b = sparseArray;
        this.c = z;
        this.d = f;
    }

    @Override // defpackage.eimo
    public final float a() {
        return this.d;
    }

    @Override // defpackage.eimo
    public final SparseArray b() {
        return this.b;
    }

    @Override // defpackage.eimo
    public final eiii c() {
        return this.a;
    }

    @Override // defpackage.eimo
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eimo) {
            eimo eimoVar = (eimo) obj;
            if (this.a.equals(eimoVar.c()) && this.b.equals(eimoVar.b()) && this.c == eimoVar.d() && Float.floatToIntBits(this.d) == Float.floatToIntBits(eimoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        SparseArray sparseArray = this.b;
        return "TraceRecordWithMetadata{traceRecord=" + this.a.toString() + ", spanExtras=" + sparseArray.toString() + ", isPartialTrace=" + this.c + ", traceSamplingRate=" + this.d + "}";
    }
}
