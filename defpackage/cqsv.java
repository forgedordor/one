package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqsv implements Supplier {
    public final /* synthetic */ emke a;

    public /* synthetic */ cqsv(emke emkeVar) {
        this.a = emkeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return (emki) this.a.build();
    }
}
