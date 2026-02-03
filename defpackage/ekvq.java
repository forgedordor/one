package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvq implements Callable {
    final /* synthetic */ Callable a;
    final /* synthetic */ ekvr b;

    public ekvq(ekvr ekvrVar, Callable callable) {
        this.a = callable;
        this.b = ekvrVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ekvt ekvtVarA = this.b.a();
        try {
            Object objCall = this.a.call();
            ekvv.b(ekvtVarA, false);
            return objCall;
        } catch (Throwable th) {
            ekvv.b(ekvtVarA, true);
            throw th;
        }
    }
}
