package defpackage;

import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnhd implements Supplier {
    final /* synthetic */ cnar a;

    public cnhd(cnar cnarVar) {
        this.a = cnarVar;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() throws cnfx {
        cnar cnarVar = cnar.c;
        cnar cnarVar2 = this.a;
        Objects.toString(cnarVar2);
        throw new cnfx("Sync did not resolve loading endpoint. SyncResult: ".concat(String.valueOf(cnarVar2)), cnarVar == cnarVar2);
    }
}
