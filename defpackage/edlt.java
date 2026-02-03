package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edlt {
    public final edgv a;
    public final edgi b;
    private final eosc i;
    private final edhj j;
    private final exwf k;
    private final exwf l;
    private final edlq m;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final lvy e = new lvy();
    private int n = 0;
    private boolean o = false;
    public boolean f = false;
    public boolean g = true;
    public int h = 0;

    public edlt(eosc eoscVar, edhj edhjVar, edgi edgiVar, edgv edgvVar, edlp edlpVar, int i, ejwi ejwiVar, exwf exwfVar, exwf exwfVar2) {
        this.i = eoscVar;
        this.j = edhjVar;
        this.b = edgiVar;
        this.a = edgvVar;
        this.k = exwfVar;
        this.l = exwfVar2;
        int i2 = i - 1;
        if (i2 == 0) {
            this.m = new edlq(edlpVar.a, edlpVar.b, edlpVar.c, ejud.a, false);
        } else if (i2 == 1) {
            this.m = new edlq(edlpVar.a, edlpVar.b, edlpVar.c, ejud.a, true);
        } else {
            this.m = new edlq(edlpVar.a, edlpVar.b, edlpVar.c, ejwi.j(ejwiVar.c()), false);
        }
    }

    public final void a(int i) {
        synchronized (this) {
            this.n = Math.max(i, this.n);
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
                if (!this.o && this.n > this.c.size()) {
                    this.o = true;
                    boolean zD = d();
                    if (zD) {
                        this.h++;
                    }
                    edhi edhiVarA = this.j.a(zD ? this.l : this.k);
                    edhiVarA.d();
                    final edlq edlqVar = this.m;
                    if (edlqVar.g) {
                        etwn etwnVar = (etwn) etwo.a.createBuilder();
                        etul etulVar = edlqVar.c;
                        etwnVar.copyOnWrite();
                        etwo etwoVar = (etwo) etwnVar.instance;
                        etulVar.getClass();
                        etwoVar.e = etulVar;
                        etwoVar.b |= 1;
                        etwv etwvVar = (etwv) etww.a.createBuilder();
                        etwvVar.copyOnWrite();
                        etww etwwVar = (etww) etwvVar.instance;
                        etwwVar.b |= 1;
                        etwwVar.c = zD;
                        etwnVar.copyOnWrite();
                        etwo etwoVar2 = (etwo) etwnVar.instance;
                        etww etwwVar2 = (etww) etwvVar.build();
                        etwwVar2.getClass();
                        etwoVar2.g = etwwVar2;
                        etwoVar2.b |= 4;
                        if (edlqVar.f.g()) {
                            Object objC = edlqVar.f.c();
                            etwnVar.copyOnWrite();
                            etwo etwoVar3 = (etwo) etwnVar.instance;
                            etwoVar3.b |= 2;
                            etwoVar3.f = (String) objC;
                        }
                        if (edlqVar.e.g()) {
                            Object objC2 = edlqVar.e.c();
                            etwnVar.copyOnWrite();
                            etwo etwoVar4 = (etwo) etwnVar.instance;
                            etwoVar4.c = 3;
                            etwoVar4.d = objC2;
                        } else if (edlqVar.d) {
                            etwnVar.copyOnWrite();
                            etwo etwoVar5 = (etwo) etwnVar.instance;
                            etwoVar5.c = 4;
                            etwoVar5.d = true;
                        }
                        listenableFutureG = eooq.g(eoqt.t(edlqVar.a.j((etwo) etwnVar.build())), new eooz() { // from class: edlo
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                etwq etwqVar = (etwq) obj;
                                etwy etwyVar = etwqVar.b;
                                if (etwyVar == null) {
                                    etwyVar = etwy.a;
                                }
                                ejwi ejwiVarJ = (etwyVar.b & 1) != 0 ? ejwi.j(etwyVar.c) : ejud.a;
                                edlq edlqVar2 = edlqVar;
                                edlqVar2.f = ejwiVarJ;
                                int i = etwyVar.b;
                                edlqVar2.g = 1 == (i & 1);
                                edlqVar2.e = (i & 2) != 0 ? ejwi.j(etwyVar.d) : ejud.a;
                                return eork.i(etwqVar);
                            }
                        }, edlqVar.b);
                    } else {
                        listenableFutureG = eork.h(new IllegalStateException("No more photo pages."));
                    }
                    eork.r(listenableFutureG, new edlr(this, edhiVarA, zD), this.i);
                }
            }
        }
    }

    public final void c() {
        this.f = false;
        b();
    }

    public final boolean d() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iA = etwt.a(((etwu) it.next()).e);
            if (iA != 0 && iA == 2) {
                i++;
            }
        }
        return i < 20;
    }
}
