package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpq extends ekep {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ekpr b;

    public ekpq(ekpr ekprVar, Map.Entry entry) {
        this.a = entry;
        this.b = ekprVar;
    }

    @Override // defpackage.ekep
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.ekep, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return ekqd.a((Collection) this.a.getValue(), this.b.a.g);
    }

    @Override // defpackage.ekep, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }
}
