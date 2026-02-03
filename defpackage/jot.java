package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jot {
    public static final fdae a(final jgl jglVar, lvc lvcVar) {
        if (lvcVar.a().compareTo(lvb.a) <= 0) {
            throw new IllegalStateException(a.j(lvcVar, jglVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
        }
        lvh lvhVar = new lvh() { // from class: jor
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                if (lvaVar == lva.ON_DESTROY) {
                    jglVar.f();
                }
            }
        };
        lvcVar.c(lvhVar);
        return new jos(lvcVar, lvhVar);
    }
}
