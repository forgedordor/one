package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzy extends dwav {
    private ekgb a;

    @Override // defpackage.dwav
    public final dwaw a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return new dvzz(ekgbVar);
        }
        throw new IllegalStateException("Missing required properties: contactIds");
    }

    @Override // defpackage.dwav
    public final void b(List list) {
        this.a = ekgb.n(list);
    }
}
