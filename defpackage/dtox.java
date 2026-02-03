package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtox extends Exception {
    public final dtow a;
    public final int b;

    public dtox(dtov dtovVar) {
        super(dtovVar.b, dtovVar.c);
        this.a = dtovVar.a;
        this.b = dtovVar.d;
    }

    public static dtov a() {
        dtov dtovVar = new dtov();
        dtovVar.d = 2;
        return dtovVar;
    }

    public static ListenableFuture b(ListenableFuture listenableFuture, final dtow dtowVar, final String str) {
        return eika.f(listenableFuture, Throwable.class, new eooz() { // from class: dtou
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtov dtovVarA = dtox.a();
                dtovVarA.a = dtowVar;
                dtovVarA.b = str;
                dtovVarA.c = (Throwable) obj;
                return eork.h(dtovVarA.a());
            }
        }, eoqg.a);
    }
}
