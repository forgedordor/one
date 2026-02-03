package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eilu implements eigy, ehdd {
    private final ArrayDeque a = new ArrayDeque(20);

    @Override // defpackage.eigy
    public final void b(eiii eiiiVar, SparseArray sparseArray) {
        ArrayDeque arrayDeque = this.a;
        synchronized (arrayDeque) {
            if (arrayDeque.size() == 20) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(eiiiVar);
        }
    }
}
