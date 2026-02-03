package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwt extends ebzt {
    final /* synthetic */ ehww a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehwt(ehww ehwwVar) {
        super("forceWakeup");
        this.a = ehwwVar;
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        try {
            eieu eieuVarK = eiiy.k("forceWakeup");
            try {
                ListenableFuture listenableFutureB = ((ehym) this.a.a.b()).b();
                eieuVarK.b(listenableFutureB);
                ((eooi) listenableFutureB).q();
                eieuVarK.close();
                return "Done.\n";
            } finally {
            }
        } catch (InterruptedException | ExecutionException e) {
            return "Error: ".concat(String.valueOf(e.toString()));
        }
    }
}
