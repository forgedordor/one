package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brie extends dqpg {
    public Instant a;
    public ejqq b;

    public brie() {
        super(briz.a().M());
        this.a = Instant.EPOCH;
    }

    public final bria a(Supplier supplier) {
        bria briaVar = (bria) supplier.get();
        briaVar.aD(aB());
        ejqq ejqqVar = this.b;
        if (ejqqVar == null) {
            throw new IllegalStateException("field features cannot be null");
        }
        briaVar.a = this.a;
        briaVar.b = ejqqVar;
        briaVar.cM = aC();
        return briaVar;
    }

    public final void b(Instant instant) {
        aE(0);
        this.a = instant;
    }

    public final void c(ejqq ejqqVar) {
        aE(1);
        this.b = ejqqVar;
    }
}
