package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class csvk implements eooz {
    public final /* synthetic */ csvt a;

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        final Exception exc = (Exception) obj;
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        if (!((Boolean) csvt.b.e()).booleanValue() || (exc instanceof CancellationException)) {
            return eijx.d(exc);
        }
        csvt csvtVar = this.a;
        return csvtVar.e.b(exc).i(new eooz() { // from class: csvq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                cqce cqceVar = csvt.a;
                return eijx.d(exc);
            }
        }, csvtVar.d);
    }
}
