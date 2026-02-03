package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ehkk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdy implements efzm {
    final /* synthetic */ ehkk a;

    public ehdy(ehkk ehkkVar) {
        this.a = ehkkVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) throws IOException {
        final efwo efwoVarA = efzkVar.a();
        eieu eieuVarJ = eiiy.j("AccountChanged: UserConfigurationCommitter.commitOnAccountChange", eiey.a);
        final ehkk ehkkVar = this.a;
        try {
            efwoVarA.getClass();
            ListenableFuture listenableFutureB = ehkkVar.d.b(eiid.c(new eooy() { // from class: ehkj
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final ehkk ehkkVar2 = ehkkVar;
                    efwo efwoVar = efwoVarA;
                    if (fdbq.f(efwoVar, ehkkVar2.e)) {
                        return eork.i(null);
                    }
                    ehkkVar2.e = efwoVar;
                    ehkk.a aVar = (ehkk.a) ehlh.a(ehkkVar2.a, ehkk.a.class, efwoVar);
                    final ListenableFuture listenableFutureC = ehkkVar2.b.c(efwoVar);
                    final List listC = aVar.gl().c();
                    final List listC2 = aVar.gk().c();
                    List listB = fcva.b(listenableFutureC);
                    List listAh = fcva.ah(listC, listC2);
                    ArrayList arrayList = new ArrayList(fcva.p(listAh, 10));
                    Iterator it = listAh.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ehew) it.next()).b);
                    }
                    return eika.a(fcva.ah(listB, arrayList)).b(eiid.c(new eooy() { // from class: ehkh
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            ekeh<ehew> ekehVarB = ekeh.b(listC, listC2);
                            final ArrayList arrayList2 = new ArrayList(fcva.p(ekehVarB, 10));
                            for (ehew ehewVar : ekehVarB) {
                                ListenableFuture listenableFuture = listenableFutureC;
                                ehkk ehkkVar3 = ehkkVar2;
                                Object objQ = eork.q(ehewVar.b);
                                objQ.getClass();
                                arrayList2.add(ehkkVar3.a((dzzs) objQ, ehewVar.c, ehkkVar3.c.a(((egbe) eork.q(listenableFuture)).b()), ehewVar.a));
                            }
                            return eika.a(arrayList2).b(new eooy() { // from class: ehki
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    return eork.e(arrayList2);
                                }
                            }, eoqg.a);
                        }
                    }), eoqg.a);
                }
            }), eoqg.a);
            listenableFutureB.getClass();
            eieuVarJ.b(listenableFutureB);
            fczl.a(eieuVarJ, null);
            egoc.c(listenableFutureB, "Failed to commit to configuration for account %s", efwoVarA);
        } finally {
        }
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
    }
}
