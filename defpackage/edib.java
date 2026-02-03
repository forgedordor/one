package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edib implements edhx {
    public final edgi a;
    public final edgv b;
    private final eosc h;
    private final edhj i;
    private final edhv j;
    public final lvy c = new lvy();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private int k = 0;
    private boolean l = false;
    public boolean f = false;
    public boolean g = true;

    public edib(eosc eoscVar, edhj edhjVar, edgi edgiVar, edgv edgvVar, edhw edhwVar, long j) {
        this.h = eoscVar;
        this.i = edhjVar;
        this.a = edgiVar;
        this.b = edgvVar;
        edgc edgcVar = (edgc) edhwVar.a.b();
        edgcVar.getClass();
        eosc eoscVar2 = (eosc) edhwVar.b.b();
        eoscVar2.getClass();
        etul etulVar = (etul) edhwVar.c.b();
        etulVar.getClass();
        ettv ettvVar = (ettv) edhwVar.d.b();
        ettvVar.getClass();
        this.j = new edhv(edgcVar, eoscVar2, etulVar, ettvVar, j);
    }

    @Override // defpackage.edhx
    public final lvv a() {
        return this.c;
    }

    @Override // defpackage.edhx
    public final void b(int i) {
        synchronized (this) {
            this.k = Math.max(i, this.k);
        }
        d();
    }

    @Override // defpackage.edhx
    public final void c() {
        this.f = false;
        d();
    }

    public final void d() {
        ListenableFuture listenableFutureG;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.g) {
                if (!this.l && this.k > this.d.size()) {
                    this.l = true;
                    edhi edhiVarA = this.i.a(exwf.OBAKE_ART_COLLECTION_PHOTOS);
                    edhiVarA.d();
                    final edhv edhvVar = this.j;
                    if (edhvVar.f) {
                        etut etutVar = (etut) etuu.a.createBuilder();
                        etul etulVar = edhvVar.c;
                        etutVar.copyOnWrite();
                        etuu etuuVar = (etuu) etutVar.instance;
                        etuuVar.c = etulVar;
                        etuuVar.b = 1 | etuuVar.b;
                        long j = edhvVar.g;
                        etutVar.copyOnWrite();
                        etuu etuuVar2 = (etuu) etutVar.instance;
                        etuuVar2.b |= 2;
                        etuuVar2.d = j;
                        etutVar.copyOnWrite();
                        etuu etuuVar3 = (etuu) etutVar.instance;
                        etuuVar3.b |= 8;
                        etuuVar3.f = 100;
                        ettv ettvVar = edhvVar.d;
                        if (!ettvVar.equals(ettv.a)) {
                            etutVar.copyOnWrite();
                            etuu etuuVar4 = (etuu) etutVar.instance;
                            etuuVar4.g = ettvVar;
                            etuuVar4.b |= 16;
                        }
                        if (edhvVar.e.g()) {
                            Object objC = edhvVar.e.c();
                            etutVar.copyOnWrite();
                            etuu etuuVar5 = (etuu) etutVar.instance;
                            etuuVar5.b |= 4;
                            etuuVar5.e = (evqs) objC;
                        }
                        listenableFutureG = eooq.g(eoqt.t(edhvVar.a.b((etuu) etutVar.build())), new eooz() { // from class: edhu
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                etuw etuwVar = (etuw) obj;
                                int i = etuwVar.b & 4;
                                boolean z = i != 0;
                                edhv edhvVar2 = edhvVar;
                                edhvVar2.f = z;
                                edhvVar2.e = i != 0 ? ejwi.j(etuwVar.d) : ejud.a;
                                return eork.i(etuwVar);
                            }
                        }, edhvVar.b);
                    } else {
                        listenableFutureG = eork.h(new IllegalStateException("No more collection pages."));
                    }
                    eork.r(listenableFutureG, new edia(this, edhiVarA), this.h);
                }
            }
        }
    }
}
