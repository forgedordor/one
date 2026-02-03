package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edlj {
    public final edgi a;
    public final edgv b;
    private final edlh h;
    private final eosc i;
    private final edhj j;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final lvy e = new lvy();
    private int k = 0;
    private boolean l = false;
    public boolean f = false;
    public boolean g = true;

    public edlj(edlh edlhVar, eosc eoscVar, edhj edhjVar, edgi edgiVar, edgv edgvVar) {
        this.h = edlhVar;
        this.i = eoscVar;
        this.j = edhjVar;
        this.a = edgiVar;
        this.b = edgvVar;
    }

    public final void a(int i) {
        synchronized (this) {
            this.k = Math.max(i, this.k);
        }
        b();
    }

    public final void b() {
        ListenableFuture listenableFutureG;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.g) {
                if (!this.l && this.k > this.c.size()) {
                    this.l = true;
                    edhi edhiVarA = this.j.a(exwf.OBAKE_GOOGLE_PHOTOS_CLUSTER_SUGGESTIONS);
                    edhiVarA.d();
                    final edlh edlhVar = this.h;
                    if (edlhVar.e) {
                        etwj etwjVar = (etwj) etwk.a.createBuilder();
                        etul etulVar = edlhVar.c;
                        etwjVar.copyOnWrite();
                        etwk etwkVar = (etwk) etwjVar.instance;
                        etulVar.getClass();
                        etwkVar.c = etulVar;
                        etwkVar.b = 1 | etwkVar.b;
                        if (edlhVar.d.g()) {
                            Object objC = edlhVar.d.c();
                            etwjVar.copyOnWrite();
                            etwk etwkVar2 = (etwk) etwjVar.instance;
                            etwkVar2.b |= 2;
                            etwkVar2.d = (String) objC;
                        }
                        listenableFutureG = eooq.g(eoqt.t(edlhVar.a.i((etwk) etwjVar.build())), new eooz() { // from class: edlg
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                etwm etwmVar = (etwm) obj;
                                etud etudVar = etwmVar.b;
                                if (etudVar == null) {
                                    etudVar = etud.a;
                                }
                                ejwi ejwiVarJ = (etudVar.b & 1) != 0 ? ejwi.j(etudVar.c) : ejud.a;
                                edlh edlhVar2 = edlhVar;
                                edlhVar2.d = ejwiVarJ;
                                edlhVar2.e = 1 == (etudVar.b & 1);
                                return eork.i(etwmVar);
                            }
                        }, edlhVar.b);
                    } else {
                        listenableFutureG = eork.h(new IllegalStateException("No more cluster pages."));
                    }
                    eork.r(listenableFutureG, new edli(this, edhiVarA), this.i);
                }
            }
        }
    }

    public final void c() {
        this.f = false;
        b();
    }
}
