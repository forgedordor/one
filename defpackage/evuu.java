package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuu extends evql {
    final evuw a;
    evqn b = b();
    final /* synthetic */ evuy c;

    public evuu(evuy evuyVar) {
        this.c = evuyVar;
        this.a = new evuw(evuyVar);
    }

    private final evqn b() {
        evuw evuwVar = this.a;
        if (evuwVar.hasNext()) {
            return evuwVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.evqn
    public final byte a() {
        evqn evqnVar = this.b;
        if (evqnVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = evqnVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
