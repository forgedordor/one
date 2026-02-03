package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekht implements Serializable {
    private final ekgb a;

    public ekht(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    Object readResolve() {
        ekgb ekgbVar = this.a;
        return ekgbVar.isEmpty() ? ekhu.a : ekjz.h(ekgbVar, ekgb.r(eknz.a)) ? ekhu.b : new ekhu(ekgbVar);
    }
}
