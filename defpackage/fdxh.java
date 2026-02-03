package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxh extends fdum implements fdvc {
    public fdxh(int i) {
        super(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
        h(Integer.valueOf(i));
    }

    @Override // defpackage.fdvc
    public final /* bridge */ /* synthetic */ Object c() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) i()).intValue());
        }
        return numValueOf;
    }

    public final void p(int i) {
        synchronized (this) {
            h(Integer.valueOf(((Number) i()).intValue() + i));
        }
    }
}
