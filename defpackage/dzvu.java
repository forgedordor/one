package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzvu {
    private final diep a;
    private final boolean b;

    public dzvu(diep diepVar, ejwi ejwiVar) {
        this.a = diepVar;
        this.b = ejwiVar.g();
    }

    public final dzvr a(fcsu fcsuVar) {
        if (this.b) {
            fcsuVar = new fcsu() { // from class: dzvt
                @Override // defpackage.fcsu
                public final Object b() {
                    return Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                }
            };
        }
        return new dzvr(fcsuVar, this.a);
    }

    public final dzvr b(final int i) {
        return a(new fcsu() { // from class: dzvs
            @Override // defpackage.fcsu
            public final Object b() {
                return Integer.valueOf(i);
            }
        });
    }
}
