package defpackage;

import com.google.android.gms.wearable.internal.AbstractWearableCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
class deto extends AbstractWearableCallbacks {
    private dcgq a;

    public deto(dcgq dcgqVar) {
        this.a = dcgqVar;
    }

    public final void a(Object obj) {
        dcgq dcgqVar = this.a;
        if (dcgqVar != null) {
            dcgqVar.c(obj);
            this.a = null;
        }
    }
}
