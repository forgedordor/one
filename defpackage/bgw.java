package defpackage;

import android.util.Range;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgw extends bkl {
    private final bin a;
    private final bmm b;

    public bgw(bin binVar, bmm bmmVar) {
        super(binVar);
        this.a = binVar;
        this.b = bmmVar;
    }

    @Override // defpackage.bkl, defpackage.ayx
    public final ListenableFuture h(boolean z) {
        return !bov.a(this.b, 6) ? new bql(new IllegalStateException("Torch is not supported")) : this.a.h(z);
    }

    @Override // defpackage.bkl, defpackage.ayx
    public final ListenableFuture i(float f) {
        bmm bmmVar = this.b;
        if (!bov.a(bmmVar, 0)) {
            return new bql(new IllegalStateException("Zoom is not supported"));
        }
        if (bmmVar == null) {
            return this.a.i(f);
        }
        Range rangeA = bmmVar.a();
        if (rangeA == null) {
            return this.a.i(f);
        }
        if (f <= 1.0f && f >= 0.0f) {
            return this.a.j(bgy.y(f, ((Float) rangeA.getLower()).floatValue(), ((Float) rangeA.getUpper()).floatValue()));
        }
        return new bql(new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]"));
    }

    @Override // defpackage.bkl, defpackage.ayx
    public final ListenableFuture j(float f) {
        Range rangeA;
        bmm bmmVar = this.b;
        if (!bov.a(bmmVar, 0)) {
            return new bql(new IllegalStateException("Zoom is not supported"));
        }
        if (bmmVar == null || (rangeA = bmmVar.a()) == null || (f >= ((Float) rangeA.getLower()).floatValue() && f <= ((Float) rangeA.getUpper()).floatValue())) {
            return this.a.j(f);
        }
        return new bql(new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + rangeA.getLower() + " , " + rangeA.getUpper() + "]"));
    }

    @Override // defpackage.bkl, defpackage.ayx
    public final ListenableFuture k(azy azyVar) {
        bmm bmmVar = this.b;
        if (bmmVar != null) {
            azx azxVar = new azx(azyVar);
            boolean z = false;
            boolean z2 = true;
            if (!azyVar.a.isEmpty() && !bov.a(bmmVar, 1, 2)) {
                azxVar.b(1);
                z = true;
            }
            if (azyVar.b.isEmpty() || bov.a(bmmVar, 3)) {
                z2 = z;
            } else {
                azxVar.b(2);
            }
            if (!azyVar.c.isEmpty() && !bov.a(bmmVar, 4)) {
                azxVar.b(4);
            } else if (z2) {
            }
            azy azyVar2 = new azy(azxVar);
            azyVar = (azyVar2.a.isEmpty() && azyVar2.b.isEmpty() && azyVar2.c.isEmpty()) ? null : new azy(azxVar);
        }
        return azyVar == null ? new bql(new IllegalStateException("FocusMetering is not supported")) : this.a.k(azyVar);
    }
}
