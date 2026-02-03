package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzq implements dtpd {
    public final Executor a;
    public final ewut b;
    public final ejxr c;
    public final ejxr d;
    public final dvad e;
    public final ejya f;
    public final dtpi g;
    private final Context h;
    private final duvl i;
    private final dvap j = new dvap();

    public duzq(duzp duzpVar) {
        this.h = duzpVar.a;
        this.a = duzpVar.c;
        this.b = duzpVar.b;
        duvk duvkVar = duzpVar.j;
        dtpi dtpiVar = duzpVar.h;
        this.i = new duvl(duvkVar, dtpiVar);
        this.c = duzpVar.d;
        this.e = duzpVar.g;
        this.d = duzpVar.f;
        this.f = duzpVar.i;
        this.g = dtpiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ListenableFuture c(ekgp ekgpVar, ewut ewutVar) {
        ejwi ejwiVarI = ejwi.i((drdm) ekgpVar.get(ewutVar));
        if (!ejwiVarI.g() || ((drdm) ejwiVarI.c()).b().isEmpty()) {
            return eorv.a;
        }
        return eork.h(((ekoe) ((drdm) ejwiVarI.c()).b()).c == 1 ? (Throwable) ((drdm) ejwiVarI.c()).b().get(0) : dtmi.a(((drdm) ejwiVarI.c()).b(), "Multiple Geller sync failures", new Object[0]));
    }

    @Override // defpackage.dtpd
    public final ListenableFuture a(dtsl dtslVar) {
        return this.j.b(new eooy() { // from class: duzl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                duzp.c().booleanValue();
                final duzq duzqVar = this.a;
                ewut ewutVar = duzqVar.b;
                durt.c("%s: Starting GDD Sync for corpus: %s", "GddFileGroupPopulator", ewutVar.name());
                dvad dvadVar = duzqVar.e;
                ejud ejudVar = ejud.a;
                ekgp ekgpVar = dvadVar.a;
                return eika.k(!ekgpVar.containsKey(ewutVar) ? eork.i(ejudVar) : eika.j(((duyk) ekgpVar.get(ewutVar)).a(ejudVar), new ejvr() { // from class: duzy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        if (ekgbVar.isEmpty()) {
                            return ejud.a;
                        }
                        String str = ((dtpy) ekgbVar.get(0)).e;
                        return str.isEmpty() ? ejud.a : ejwi.j(str);
                    }
                }, dvadVar.b), new eooz() { // from class: duyx
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ejwi ejwiVar = (ejwi) obj;
                        boolean zG = ejwiVar.g();
                        final duzq duzqVar2 = duzqVar;
                        if (!zG) {
                            durt.c("%s: Empty configuration id found for corpus %s, skipping sync", "GddFileGroupPopulator", duzqVar2.b.name());
                            return eorv.a;
                        }
                        final ewut ewutVar2 = duzqVar2.b;
                        final String str = (String) ejwiVar.c();
                        final ListenableFuture listenableFutureB = duzqVar2.b(cdvb.a(), dtow.GDD_INVALID_ACCOUNT, ewutVar2, str);
                        final ListenableFuture listenableFutureB2 = duzqVar2.b(!duzqVar2.g.H() ? eork.i(ejud.a) : eork.i(ejud.a), dtow.GDD_FAIL_TO_RETRIEVE_ZWIEBACK_TOKEN, ewutVar2, str);
                        dvas dvasVarD = dvat.d(listenableFutureB, listenableFutureB2);
                        eooy eooyVar = new eooy() { // from class: duzb
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                List list = (List) eork.q(listenableFutureB);
                                final ejwi ejwiVar2 = (ejwi) eork.q(listenableFutureB2);
                                boolean zIsEmpty = list.isEmpty();
                                final ewut ewutVar3 = ewutVar2;
                                final String str2 = str;
                                if (zIsEmpty) {
                                    durt.p("%s: Account was not provided, skipping private sync for corpus: %s, configuration: %s", "GddFileGroupPopulator", ewutVar3.name(), str2);
                                    return eorv.a;
                                }
                                ListenableFuture listenableFutureG = eorv.a;
                                final ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (true) {
                                    final duzq duzqVar3 = duzqVar2;
                                    if (!it.hasNext()) {
                                        return dvat.a(arrayList).b(new eooy() { // from class: duzk
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                return dtmi.b(arrayList, "Private sync failure", new Object[0]);
                                            }
                                        }, duzqVar3.a);
                                    }
                                    final Account account = (Account) it.next();
                                    dvaq dvaqVarA = dvar.a(listenableFutureG);
                                    eooz eoozVar = new eooz() { // from class: duzi
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            return duzqVar3.b(eijx.d(new IllegalStateException("OAuth not supported")), dtow.GDD_INVALID_AUTH_TOKEN, ewutVar3, str2);
                                        }
                                    };
                                    Executor executor = duzqVar3.a;
                                    listenableFutureG = dvaqVarA.g(eoozVar, executor).g(new eooz() { // from class: duzj
                                        /* JADX WARN: Type inference failed for: r4v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            final String str3 = (String) obj2;
                                            final ewut ewutVar4 = ewutVar3;
                                            String strName = ewutVar4.name();
                                            final Account account2 = account;
                                            durt.d("%s: Performing private sync for corpus: %s, account: %s", "GddFileGroupPopulator", strName, account2.name);
                                            final duzq duzqVar4 = duzqVar3;
                                            final ejxm ejxmVarC = ejxm.c(duzqVar4.f);
                                            dvaq dvaqVarE = dvaq.e(duzqVar4.c.get());
                                            final ejwi ejwiVar3 = ejwiVar2;
                                            eooz eoozVar2 = new eooz() { // from class: duzm
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    drcw drcwVar = (drcw) obj3;
                                                    String str4 = (String) ejwiVar3.f();
                                                    ekph ekphVar = new ekph(ewutVar4);
                                                    return drcwVar.a(null, str4, account2, str3, ekphVar, ewvn.PERIODIC, 4, ejud.a);
                                                }
                                            };
                                            Executor executor2 = duzqVar4.a;
                                            dvaq dvaqVarG = dvaqVarE.g(eoozVar2, executor2).g(new eooz() { // from class: duzn
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    ekgp ekgpVar2 = (ekgp) obj3;
                                                    ejxmVarC.a(TimeUnit.MILLISECONDS);
                                                    String str4 = account2.name;
                                                    drdt.a(ekgpVar2);
                                                    return duzq.c(ekgpVar2, ewutVar4);
                                                }
                                            }, executor2);
                                            final String str4 = str2;
                                            return duzqVar4.b(dvaqVarG.g(new eooz() { // from class: duyy
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    ewut ewutVar5 = ewutVar4;
                                                    String strName2 = ewutVar5.name();
                                                    String str5 = str4;
                                                    durt.d("%s: GDD Private Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", strName2, str5);
                                                    duzqVar4.d(2015, ewutVar5, str5);
                                                    return eorv.a;
                                                }
                                            }, executor2), dtow.GDD_FAIL_IN_SYNC_RUNNER_PRIVATE, ewutVar4, str4);
                                        }
                                    }, executor);
                                    arrayList.add(listenableFutureG);
                                }
                            }
                        };
                        Executor executor = duzqVar2.a;
                        final ListenableFuture listenableFutureB3 = dvasVarD.b(eooyVar, executor);
                        final dvaq dvaqVarG = dvar.a(listenableFutureB3).g(new eooz() { // from class: duzc
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return listenableFutureB2;
                            }
                        }, executor).g(new eooz() { // from class: duzd
                            /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final ejwi ejwiVar2 = (ejwi) obj2;
                                duzp.b().booleanValue();
                                final ewut ewutVar3 = ewutVar2;
                                durt.c("%s: Performing public sync for corpus: %s", "GddFileGroupPopulator", ewutVar3.name());
                                final duzq duzqVar3 = duzqVar2;
                                Object obj3 = ((ejxw) duzqVar3.d).a;
                                final ejxm ejxmVarC = ejxm.c(duzqVar3.f);
                                final String str2 = (String) obj3;
                                dvaq dvaqVarE = dvaq.e(duzqVar3.c.get());
                                eooz eoozVar = new eooz() { // from class: duzf
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj4) {
                                        return ((drcw) obj4).a(str2, (String) ejwiVar2.f(), null, null, new ekph(ewutVar3), ewvn.PERIODIC, 3, ejud.a);
                                    }
                                };
                                Executor executor2 = duzqVar3.a;
                                dvaq dvaqVarG2 = dvaqVarE.g(eoozVar, executor2).g(new eooz() { // from class: duzg
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj4) {
                                        ekgp ekgpVar2 = (ekgp) obj4;
                                        ejxmVarC.a(TimeUnit.MILLISECONDS);
                                        drdt.a(ekgpVar2);
                                        return duzq.c(ekgpVar2, ewutVar3);
                                    }
                                }, executor2);
                                final String str3 = str;
                                return duzqVar3.b(dvaqVarG2.g(new eooz() { // from class: duzh
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj4) {
                                        ewut ewutVar4 = ewutVar3;
                                        String strName = ewutVar4.name();
                                        String str4 = str3;
                                        durt.d("%s: GDD Public Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", strName, str4);
                                        duzqVar3.d(2014, ewutVar4, str4);
                                        return eorv.a;
                                    }
                                }, executor2), dtow.GDD_FAIL_IN_SYNC_RUNNER_PUBLIC, ewutVar3, str3);
                            }
                        }, executor);
                        return dvaq.e(dvat.b(dvaqVarG, listenableFutureB3).b(new eooy() { // from class: duze
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return dvaq.e(eork.f(dvaqVarG, listenableFutureB3));
                            }
                        }, executor)).g(new eooz() { // from class: duza
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return eorv.a;
                            }
                        }, executor);
                    }
                }, duzqVar.a);
            }
        }, this.a);
    }

    public final ListenableFuture b(ListenableFuture listenableFuture, final dtow dtowVar, final ewut ewutVar, final String str) {
        return eika.f(listenableFuture, Exception.class, new eooz() { // from class: duyz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtov dtovVarA = dtox.a();
                dtow dtowVar2 = dtowVar;
                dtovVarA.a = dtowVar2;
                dtovVarA.c = (Exception) obj;
                dtovVarA.b = String.format("refresh failed [%s]", dtowVar2.name());
                dtox dtoxVarA = dtovVarA.a();
                String stackTraceString = Log.isLoggable("MDD", 6) ? Log.getStackTraceString(dtoxVarA) : "";
                String str2 = str;
                ewut ewutVar2 = ewutVar;
                duzq duzqVar = this.a;
                durt.i("%s: GDD Sync failed for corpus: %s, configuration: %s\n%s", "GddFileGroupPopulator", ewutVar2.name(), str2, stackTraceString);
                duzqVar.d(eokq.b(dtoxVarA.a.aF), ewutVar2, str2);
                return eork.h(dtoxVarA);
            }
        }, this.a);
    }

    public final void d(int i, ewut ewutVar, String str) {
        String packageName = this.h.getPackageName();
        String strName = ewutVar.name();
        duvl duvlVar = this.i;
        long jK = duvlVar.a.k();
        if (durt.a(jK)) {
            eoiu eoiuVar = (eoiu) eoiv.a.createBuilder();
            eoiuVar.copyOnWrite();
            eoiv eoivVar = (eoiv) eoiuVar.instance;
            eoivVar.b |= 524288;
            eoivVar.f = jK;
            eoji eojiVar = (eoji) eojj.a.createBuilder();
            eojiVar.copyOnWrite();
            eojj eojjVar = (eojj) eojiVar.instance;
            eojjVar.c = eokq.a(i);
            eojjVar.b |= 1;
            eojiVar.copyOnWrite();
            eojj eojjVar2 = (eojj) eojiVar.instance;
            eojjVar2.b |= 2;
            eojjVar2.d = str;
            eojiVar.copyOnWrite();
            eojj eojjVar3 = (eojj) eojiVar.instance;
            packageName.getClass();
            eojjVar3.b |= 4;
            eojjVar3.e = packageName;
            eojiVar.copyOnWrite();
            eojj eojjVar4 = (eojj) eojiVar.instance;
            strName.getClass();
            eojjVar4.b |= 8;
            eojjVar4.f = strName;
            eojj eojjVar5 = (eojj) eojiVar.build();
            eoiuVar.copyOnWrite();
            eoiv eoivVar2 = (eoiv) eoiuVar.instance;
            eojjVar5.getClass();
            eoivVar2.t = eojjVar5;
            eoivVar2.d |= 32;
            duvlVar.b.a((eoiv) eoiuVar.build(), eokk.a(1105));
        }
    }
}
