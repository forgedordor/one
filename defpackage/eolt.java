package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eolt extends ekep {
    final /* synthetic */ Map.Entry a;

    public eolt(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.ekep
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.ekep, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new eoma((List) this.a.getValue());
    }

    @Override // defpackage.ekep, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }
}
