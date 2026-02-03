package defpackage;

import android.content.Context;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvev implements dvdf, dvfo, dvfp {
    public final dvfq a;
    public final Context b;
    public final dcdt c;
    public final dvfn d;
    public final dvcy e;
    public final dvfc f;
    private final Map g = new LinkedHashMap();
    private final Object h = new Object();

    public dvev(dvfq dvfqVar, Context context, dvfn dvfnVar, dvcy dvcyVar, dcdt dcdtVar, dvfc dvfcVar) {
        this.a = dvfqVar;
        this.b = context;
        this.d = dvfnVar;
        this.e = dvcyVar;
        this.c = dcdtVar;
        this.f = dvfcVar;
    }

    public static boolean o(dvfi dvfiVar) {
        dvfh dvfhVar = dvfiVar.c;
        if (dvfhVar == null) {
            dvfhVar = dvfh.a;
        }
        return !dvfhVar.equals(dvfh.a);
    }

    public static boolean p(dvfi dvfiVar) {
        return !dvfi.a.equals(dvfiVar);
    }

    public static boolean q(dvfi dvfiVar, dvde dvdeVar) {
        eucu eucuVar = dvfiVar.b;
        if (eucuVar == null) {
            eucuVar = eucu.a;
        }
        efwh efwhVarA = dvgy.a(eucuVar);
        if (efwhVarA != null) {
            return ((dvda) dvdeVar).a || !efwhVarA.e;
        }
        return false;
    }

    private final ListenableFuture r() {
        eiju eijuVarG = eiju.g(s());
        eooz eoozVar = new eooz() { // from class: dveb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dvfi dvfiVar = (dvfi) obj;
                return dvev.p(dvfiVar) ? eork.i(dvfiVar) : this.a.l();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.i(eoozVar, eoqgVar).h(new ejvr() { // from class: dvec
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eucu eucuVar = ((dvfi) obj).b;
                return eucuVar == null ? eucu.a : eucuVar;
            }
        }, eoqgVar);
    }

    private final ListenableFuture s() {
        return eiju.g(this.e.a()).f(IOException.class, new eooz() { // from class: dvdy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                IOException iOException = (IOException) obj;
                if (ejxy.b(iOException) instanceof FileNotFoundException) {
                    return this.a.l();
                }
                throw iOException;
            }
        }, eoqg.a);
    }

    private final ListenableFuture t(byte[] bArr, eudh eudhVar) {
        efvr efvrVar = (efvr) efvt.a.createBuilder();
        efvrVar.copyOnWrite();
        efvt efvtVar = (efvt) efvrVar.instance;
        evsx evsxVar = efvtVar.b;
        if (!evsxVar.c()) {
            efvtVar.b = evsn.mutableCopy(evsxVar);
        }
        dvfq dvfqVar = this.a;
        efvtVar.b.h(2);
        eudhVar.copyOnWrite();
        eudi eudiVar = (eudi) eudhVar.instance;
        efvt efvtVar2 = (efvt) efvrVar.build();
        eudi eudiVar2 = eudi.a;
        efvtVar2.getClass();
        eudiVar.f = efvtVar2;
        eudiVar.b |= 4;
        evqs evqsVarX = evqs.x(bArr);
        eudhVar.copyOnWrite();
        ((eudi) eudhVar.instance).d = evqsVarX;
        eudhVar.copyOnWrite();
        ((eudi) eudhVar.instance).c = 2;
        dvfw dvfwVar = (dvfw) dvfqVar;
        return eika.k(drgi.a(((ddsw) dvfwVar.a).b(3, ((eudi) eudhVar.build()).toByteArray(), new SyncOptions(), dvfwVar.b, true, 15901)), new eooz() { // from class: dvft
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                evrr evrrVar = evrr.a;
                evuq evuqVar = evuq.a;
                evrr evrrVar2 = evrr.a;
                return eork.i((eudk) evsn.parseFrom(eudk.a, (byte[]) obj, evrrVar2));
            }
        }, eoqg.a);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture a() {
        ListenableFuture listenableFutureR = r();
        ejvr ejvrVar = new ejvr() { // from class: dvdn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eucu eucuVar = (eucu) obj;
                ejwl.m(eucuVar.b.size() == 1, "Cache must be initialized with data for exactly one person ('me') before updates!");
                efvz efvzVar = ((euda) eucuVar.b.get(0)).c;
                if (efvzVar == null) {
                    efvzVar = efvz.a;
                }
                return efvzVar.f;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eiju.g(eiju.g(eika.j(listenableFutureR, ejvrVar, eoqgVar)).h(new ejvr() { // from class: dveu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                eudl eudlVar = (eudl) eudm.a.createBuilder();
                eudg eudgVar = eudg.PROFILE;
                eudlVar.copyOnWrite();
                ((eudm) eudlVar.instance).f = eudgVar.a();
                evrv evrvVar = (evrv) evrw.a.createBuilder();
                evrvVar.a("person.photo");
                eudlVar.copyOnWrite();
                eudm eudmVar = (eudm) eudlVar.instance;
                evrw evrwVar = (evrw) evrvVar.build();
                evrwVar.getClass();
                eudmVar.e = evrwVar;
                eudmVar.b |= 2;
                eudlVar.copyOnWrite();
                ((eudm) eudlVar.instance).c = "me";
                eudlVar.copyOnWrite();
                ((eudm) eudlVar.instance).g = false;
                efvy efvyVar = (efvy) efvz.a.createBuilder();
                efvyVar.copyOnWrite();
                efvz efvzVar = (efvz) efvyVar.instance;
                efvzVar.b |= 1;
                efvzVar.c = "me";
                efvyVar.copyOnWrite();
                efvz efvzVar2 = (efvz) efvyVar.instance;
                str.getClass();
                efvzVar2.b |= 4;
                efvzVar2.f = str;
                eudlVar.copyOnWrite();
                eudm eudmVar2 = (eudm) eudlVar.instance;
                efvz efvzVar3 = (efvz) efvyVar.build();
                efvzVar3.getClass();
                eudmVar2.d = efvzVar3;
                eudmVar2.b |= 1;
                return (eudm) eudlVar.build();
            }
        }, eoqgVar).i(new eooz() { // from class: dvdl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                byte[] byteArray = ((eudm) obj).toByteArray();
                SyncOptions syncOptions = new SyncOptions();
                final dvev dvevVar = this.a;
                dvfw dvfwVar = (dvfw) dvevVar.a;
                ListenableFuture listenableFutureA = drgi.a(dvfwVar.a.a(2, byteArray, syncOptions, dvfwVar.b));
                eooz eoozVar = new eooz() { // from class: dvfs
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        evrr evrrVar = evrr.a;
                        evuq evuqVar = evuq.a;
                        evrr evrrVar2 = evrr.a;
                        return eork.i((eudo) evsn.parseFrom(eudo.a, (byte[]) obj2, evrrVar2));
                    }
                };
                eoqg eoqgVar2 = eoqg.a;
                return eika.f(eika.k(listenableFutureA, eoozVar, eoqgVar2), dcff.class, new eooz() { // from class: dvem
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final dcff dcffVar = (dcff) obj2;
                        int i = dcffVar.a.g;
                        dvev dvevVar2 = dvevVar;
                        if (i != 38006 && (i != 7 || dvevVar2.c.h(dvevVar2.b, 202100000) == 0)) {
                            return eork.h(dcffVar);
                        }
                        eiju eijuVarG = eiju.g(dvevVar2.l());
                        eooz eoozVar2 = new eooz() { // from class: dveg
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return eork.h(dcffVar);
                            }
                        };
                        eoqg eoqgVar3 = eoqg.a;
                        return eijuVarG.f(Exception.class, eoozVar2, eoqgVar3).i(new eooz() { // from class: dveh
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return eork.h(new dvdh(dcffVar));
                            }
                        }, eoqgVar3);
                    }
                }, eoqgVar2);
            }
        }, eoqgVar).h(new ejvr() { // from class: dvdm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                euda eudaVar = ((eudo) obj).b;
                if (eudaVar == null) {
                    eudaVar = euda.a;
                }
                efwh efwhVarB = dvgy.b(eudaVar);
                if (efwhVarB == null) {
                    return euci.a;
                }
                euch euchVar = (euch) euci.a.createBuilder();
                String str = efwhVarB.d;
                euchVar.copyOnWrite();
                euci euciVar = (euci) euchVar.instance;
                str.getClass();
                euciVar.b = str;
                return (euci) euchVar.build();
            }
        }, eoqgVar)).f(Exception.class, new eooz() { // from class: dvdr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, eoqgVar).h(new ejvr() { // from class: dvds
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (euci) obj;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture b() {
        eiju eijuVarG = eiju.g(s());
        ejvr ejvrVar = new ejvr() { // from class: dvdk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvfi dvfiVar = (dvfi) obj;
                if (!dvev.p(dvfiVar)) {
                    return this.a.j();
                }
                eucu eucuVar = dvfiVar.b;
                if (eucuVar == null) {
                    eucuVar = eucu.a;
                }
                return ejwi.j(eucuVar);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eiju.g(eijuVarG.h(ejvrVar, eoqgVar)).f(Exception.class, new eooz() { // from class: dvdt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, eoqgVar).h(new ejvr() { // from class: dvee
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                ejwiVar.g();
                return ejwiVar;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture c(final dvde dvdeVar, final int i) {
        eiju eijuVarG = eiju.g(s());
        eooz eoozVar = new eooz() { // from class: dvdv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dvfi dvfiVar = (dvfi) obj;
                boolean zP = dvev.p(dvfiVar);
                final dvev dvevVar = this.a;
                if (!zP || !dvev.o(dvfiVar)) {
                    return eork.i(dvevVar.j());
                }
                dvfn dvfnVar = dvevVar.d;
                dvfh dvfhVar = dvfiVar.c;
                if (dvfhVar == null) {
                    dvfhVar = dvfh.a;
                }
                int i2 = i;
                final dvde dvdeVar2 = dvdeVar;
                eiju eijuVarG2 = eiju.g(dvfnVar.a(dvfhVar, i2));
                dver dverVar = new dver();
                eoqg eoqgVar = eoqg.a;
                return eijuVarG2.h(dverVar, eoqgVar).e(Exception.class, new ejvr() { // from class: dvdp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ejud.a;
                    }
                }, eoqgVar).i(new eooz() { // from class: dvdq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws IOException {
                        ejwi ejwiVar = (ejwi) obj2;
                        if (!ejwiVar.g()) {
                            return eork.i(dvevVar.j());
                        }
                        if (dvev.q(dvfiVar, dvdeVar2)) {
                            return eork.i(ejwiVar);
                        }
                        dvfx.a((InputStream) ejwiVar.c());
                        return eork.h(new dvdi());
                    }
                }, eoqgVar);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.i(eoozVar, eoqgVar).f(Exception.class, new eooz() { // from class: dvdw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, eoqgVar).h(new ejvr() { // from class: dvdx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                ejwiVar.g();
                return ejwiVar;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture d() {
        eiju eijuVarG = eiju.g(r());
        eooz eoozVar = new eooz() { // from class: dved
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.f(Exception.class, eoozVar, eoqgVar).h(new ejvr() { // from class: dvef
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (eucu) obj;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture e(final dvde dvdeVar, final int i) {
        eiju eijuVarG = eiju.g(s());
        eooz eoozVar = new eooz() { // from class: dvej
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dvfi dvfiVar = (dvfi) obj;
                boolean zP = dvev.p(dvfiVar);
                final dvev dvevVar = this.a;
                final dvde dvdeVar2 = dvdeVar;
                final int i2 = i;
                if (!zP || !dvev.o(dvfiVar)) {
                    return dvevVar.k(dvdeVar2, i2);
                }
                dvfn dvfnVar = dvevVar.d;
                dvfh dvfhVar = dvfiVar.c;
                if (dvfhVar == null) {
                    dvfhVar = dvfh.a;
                }
                eiju eijuVarG2 = eiju.g(dvfnVar.a(dvfhVar, i2));
                dver dverVar = new dver();
                eoqg eoqgVar = eoqg.a;
                return eijuVarG2.h(dverVar, eoqgVar).e(Exception.class, new ejvr() { // from class: dves
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ejud.a;
                    }
                }, eoqgVar).i(new eooz() { // from class: dvet
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws IOException {
                        ejwi ejwiVar = (ejwi) obj2;
                        boolean zG = ejwiVar.g();
                        dvde dvdeVar3 = dvdeVar2;
                        if (!zG) {
                            return dvevVar.k(dvdeVar3, i2);
                        }
                        if (dvev.q(dvfiVar, dvdeVar3)) {
                            return eork.i((InputStream) ejwiVar.c());
                        }
                        dvfx.a((InputStream) ejwiVar.c());
                        return eork.h(new dvdi());
                    }
                }, eoqgVar);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.i(eoozVar, eoqgVar).f(Exception.class, new eooz() { // from class: dvek
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        }, eoqgVar).h(new ejvr() { // from class: dvel
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (InputStream) obj;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture f(byte[] bArr, eudi eudiVar) {
        eudh eudhVar = (eudh) eudi.a.createBuilder();
        if ((eudiVar.b & 1) != 0) {
            eudc eudcVar = eudiVar.e;
            if (eudcVar == null) {
                eudcVar = eudc.a;
            }
            eudhVar.copyOnWrite();
            eudi eudiVar2 = (eudi) eudhVar.instance;
            eudcVar.getClass();
            eudiVar2.e = eudcVar;
            eudiVar2.b |= 1;
        }
        eiju eijuVarG = eiju.g(t(bArr, eudhVar));
        eooz eoozVar = new eooz() { // from class: dveo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.f(Exception.class, eoozVar, eoqgVar).h(new ejvr() { // from class: dvep
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (eudk) obj;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dvdf
    public final void g(dvdd dvddVar, Executor executor) {
        executor.getClass();
        synchronized (this.h) {
            this.g.put(dvddVar, executor);
        }
    }

    @Override // defpackage.dvdf
    public final void h(dvdd dvddVar) {
        synchronized (this.h) {
            this.g.remove(dvddVar);
        }
    }

    @Override // defpackage.dvdf
    public final ListenableFuture i(byte[] bArr) {
        eudh eudhVar = (eudh) eudi.a.createBuilder();
        eudhVar.copyOnWrite();
        ((eudi) eudhVar.instance).g = 2;
        eiju eijuVarG = eiju.g(t(bArr, eudhVar));
        eooz eoozVar = new eooz() { // from class: dvdz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                throw ((Exception) obj);
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarG.f(Exception.class, eoozVar, eoqgVar).h(new ejvr() { // from class: dvea
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (eudk) obj;
            }
        }, eoqgVar);
    }

    public final ejwi j() {
        this.a.a();
        return ejud.a;
    }

    public final ListenableFuture k(final dvde dvdeVar, final int i) {
        return eika.k(l(), new eooz() { // from class: dvdu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dvfi dvfiVar = (dvfi) obj;
                if (!dvev.q(dvfiVar, dvdeVar)) {
                    return eork.h(new dvdi());
                }
                dvev dvevVar = this.a;
                dvfh dvfhVar = dvfiVar.c;
                if (dvfhVar == null) {
                    dvfhVar = dvfh.a;
                }
                return dvevVar.d.a(dvfhVar, i);
            }
        }, eoqg.a);
    }

    public final ListenableFuture l() {
        return eika.k(this.a.a(), new eooz() { // from class: dvei
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dvev dvevVar = this.a;
                final eucu eucuVar = (eucu) obj;
                return eika.k(dvevVar.e.a(), new eooz() { // from class: dvdo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dvfi dvfiVar = (dvfi) obj2;
                        fbfs fbfsVar = fbfr.a.get();
                        dvev dvevVar2 = dvevVar;
                        if (fbfsVar.c(dvevVar2.b) && eucuVar.b.size() > 0) {
                            eucu eucuVar2 = dvfiVar.b;
                            if (eucuVar2 == null) {
                                eucuVar2 = eucu.a;
                            }
                            if (eucuVar2.b.size() == 0) {
                                dvfc dvfcVar = dvevVar2.f;
                                dvfcVar.a.a.b(dvfcVar.b);
                                return dvevVar2.e.a();
                            }
                        }
                        return eork.i(dvfiVar);
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dvfo
    public final void m() {
        ekgp ekgpVarJ;
        synchronized (this.h) {
            ekgpVarJ = ekgp.j(this.g);
        }
        ekqg ekqgVarListIterator = ekgpVarJ.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            Executor executor = (Executor) entry.getValue();
            final dvdd dvddVar = (dvdd) entry.getKey();
            dvddVar.getClass();
            executor.execute(eiid.k(new Runnable() { // from class: dveq
                @Override // java.lang.Runnable
                public final void run() {
                    dvddVar.a();
                }
            }));
        }
    }

    @Override // defpackage.dvfp
    public final void n() {
        ekgp ekgpVarJ;
        synchronized (this.h) {
            ekgpVarJ = ekgp.j(this.g);
        }
        ekqg ekqgVarListIterator = ekgpVarJ.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            Executor executor = (Executor) entry.getValue();
            final dvdd dvddVar = (dvdd) entry.getKey();
            dvddVar.getClass();
            executor.execute(eiid.k(new Runnable() { // from class: dven
                @Override // java.lang.Runnable
                public final void run() {
                    dvddVar.b();
                }
            }));
        }
    }
}
