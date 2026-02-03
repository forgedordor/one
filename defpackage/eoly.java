package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoly extends ekep {
    final /* synthetic */ Map.Entry a;

    public eoly(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.ekep
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.ekep, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekep, java.util.Map.Entry
    public final Object setValue(Object obj) {
        getKey();
        obj.getClass();
        return this.a.setValue(obj);
    }
}
