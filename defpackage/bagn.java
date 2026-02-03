package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bagn extends ArrayList implements bago {
    @Override // defpackage.bago
    public final void a() {
        ejwl.l(ecem.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((bago) get(i)).a();
        }
    }

    @Override // defpackage.bago
    public final void b(bagr bagrVar, int i) {
        ejwl.l(ecem.g());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            bago bagoVar = (bago) get(i2);
            eieu eieuVarK = eiiy.k("DraftMessageDataEventDispatcher#onDraftChanged");
            try {
                bagoVar.b(bagrVar, i);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.bago
    public final void d(bagr bagrVar) {
        ejwl.l(ecem.g());
        int size = size();
        for (int i = 0; i < size; i++) {
            ((bago) get(i)).d(bagrVar);
        }
    }
}
