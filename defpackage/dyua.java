package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyua {
    public abstract dyud a();

    public abstract void b(dyuc dyucVar);

    public final void c(final dyub dyubVar) {
        b(new dyuc() { // from class: dytz
            @Override // defpackage.dyuc
            public final ListenableFuture a(ejwi ejwiVar) {
                dyubVar.a(ejwiVar);
                return eork.i(true);
            }
        });
    }
}
