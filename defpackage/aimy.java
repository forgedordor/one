package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aimy {
    final /* synthetic */ eosd a;
    final /* synthetic */ ainw b;

    public aimy(eosd eosdVar, ainw ainwVar) {
        this.a = eosdVar;
        this.b = ainwVar;
    }

    public final dbzq a(dbyl dbylVar) {
        dbzq dbzqVar = new dbzq(dbylVar, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
        dbzqVar.i(this.b.a());
        dbzqVar.h(this.a, aimz.a);
        return dbzqVar;
    }
}
