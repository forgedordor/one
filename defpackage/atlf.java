package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atlf implements Supplier {
    final /* synthetic */ atlg a;

    public atlf(atlg atlgVar) {
        this.a = atlgVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        atlg atlgVar = this.a;
        athh athhVar = atlgVar.a;
        if (athhVar == null || athhVar.equals(null)) {
            return null;
        }
        return athg.b(atlgVar.a);
    }
}
