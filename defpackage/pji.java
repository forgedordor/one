package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pji {
    public final pjb a;
    public boolean d;
    public Bundle e;
    public boolean f;
    private final fdae h;
    public final pjj b = new pjj();
    public final Map c = new LinkedHashMap();
    public boolean g = true;

    public pji(pjb pjbVar, fdae fdaeVar) {
        this.a = pjbVar;
        this.h = fdaeVar;
    }

    public final void a() {
        pjb pjbVar = this.a;
        if (pjbVar.P().a() != lvb.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.d) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.invoke();
        pjbVar.P().c(new lvh() { // from class: pjh
            @Override // defpackage.lvh
            public final void gL(lvj lvjVar, lva lvaVar) {
                boolean z;
                pji pjiVar = this.a;
                if (lvaVar == lva.ON_START) {
                    z = true;
                } else if (lvaVar != lva.ON_STOP) {
                    return;
                } else {
                    z = false;
                }
                pjiVar.g = z;
            }
        });
        this.d = true;
    }
}
