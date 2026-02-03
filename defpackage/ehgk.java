package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehgk {
    public final String a;
    public final dzzs b;
    public final SettableFuture c = SettableFuture.create();
    public final egpe d;
    final /* synthetic */ ehgl e;

    public ehgk(final ehgl ehglVar, String str, dzzs dzzsVar) {
        this.e = ehglVar;
        this.a = str;
        this.b = dzzsVar;
        this.d = new egpe(new eooy() { // from class: ehgh
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ehgl ehglVar2 = ehglVar;
                ehgc ehgcVar = ehglVar2.e;
                eafm eafmVar = ehglVar2.d.f;
                ehgk ehgkVar = this;
                ListenableFuture listenableFutureB = eafmVar.a(ehgcVar.a(ehgkVar.a)).e ? ((eaaa) ehglVar2.a.b()).b(ehgkVar.b) : ((eaaa) ehglVar2.a.b()).a(ehgkVar.b.c);
                final fdap fdapVar = new fdap() { // from class: ehgi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eaab eaabVar = (eaab) obj;
                        eaabVar.getClass();
                        if (eaabVar.a == 29501) {
                            return null;
                        }
                        throw eaabVar;
                    }
                };
                return eika.e(listenableFutureB, eaab.class, new ejvr() { // from class: ehgj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        fdapVar.invoke(obj);
                        return null;
                    }
                }, eoqg.a);
            }
        }, ehglVar.c);
    }
}
