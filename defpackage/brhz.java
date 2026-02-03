package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brhz implements Supplier {
    final /* synthetic */ bria a;

    public brhz(bria briaVar) {
        this.a = briaVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bria briaVar = this.a;
        Instant instant = briaVar.a;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            return null;
        }
        return Long.valueOf(barq.a(briaVar.a));
    }
}
