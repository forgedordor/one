package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwo implements lvh {
    private final lww a;

    public lwo(lww lwwVar) {
        this.a = lwwVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar != lva.ON_CREATE) {
            Objects.toString(lvaVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(lvaVar.toString()));
        }
        lvjVar.P().d(this);
        this.a.b();
    }
}
