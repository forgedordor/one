package defpackage;

import android.app.Activity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehor {
    private final eg a;
    private final Set b;
    private boolean c = false;

    public ehor(Activity activity, Set set) {
        this.a = (eg) activity;
        this.b = set;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        ekqg ekqgVarListIterator = ((ekon) this.b).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            this.a.P().c((lvi) ekqgVarListIterator.next());
        }
        this.c = true;
    }
}
