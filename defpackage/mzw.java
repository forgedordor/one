package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzw {
    public final Set a = new HashSet();
    public mzp b;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Exception exc, boolean z) {
        this.b = null;
        Set set = this.a;
        ekgb ekgbVarN = ekgb.n(set);
        set.clear();
        int size = ekgbVarN.size();
        for (int i = 0; i < size; i++) {
            mzp mzpVar = (mzp) ekgbVarN.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            mzpVar.g(exc, i2);
        }
    }

    public final void b(mzp mzpVar) {
        this.a.add(mzpVar);
        if (this.b != null) {
            return;
        }
        this.b = mzpVar;
        mzpVar.i();
    }
}
