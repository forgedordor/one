package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgl extends ekbn {
    final /* synthetic */ Map.Entry a;

    public ekgl(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.ekbn, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return new ekph(this.a.getValue());
    }
}
