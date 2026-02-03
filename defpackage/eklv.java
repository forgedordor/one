package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklv extends ekbn {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ ekma b;

    public eklv(Map.Entry entry, ekma ekmaVar) {
        this.a = entry;
        this.b = ekmaVar;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
