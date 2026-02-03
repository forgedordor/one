package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class egvo extends fdbo implements fdap {
    public egvo(Object obj) {
        super(1, obj, egvq.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Callable callable = (Callable) obj;
        callable.getClass();
        egvq egvqVar = (egvq) this.g;
        int i = egvq.b;
        return egvqVar.a(callable);
    }
}
