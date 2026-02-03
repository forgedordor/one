package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgi {
    public static ListenableFuture a(defn defnVar) {
        final drgh drghVar = new drgh(defnVar);
        defnVar.o(eoqg.a, new defb() { // from class: drgg
            @Override // defpackage.defb
            public final void a(defn defnVar2) {
                boolean z = ((defv) defnVar2).d;
                drgh drghVar2 = drghVar;
                if (z) {
                    drghVar2.cancel(false);
                    return;
                }
                if (defnVar2.m()) {
                    drghVar2.set(defnVar2.i());
                    return;
                }
                Exception excH = defnVar2.h();
                if (excH == null) {
                    throw new IllegalStateException();
                }
                drghVar2.setException(excH);
            }
        });
        return drghVar;
    }
}
