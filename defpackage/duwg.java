package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwg implements dtpd {
    public final ekgb a;
    public final ekgb b;
    public final ecev c;
    public final ejxr d;
    public final boolean e;
    private final String f;

    public duwg(duwf duwfVar) {
        this.a = duwfVar.a;
        this.b = duwfVar.b;
        this.c = duwfVar.c;
        this.f = duwfVar.d;
        this.d = duwfVar.e;
        this.e = duwfVar.f;
    }

    public static ListenableFuture b(final dtns dtnsVar, final ekgb ekgbVar) {
        return dvat.c(ekgbVar).a(new Callable() { // from class: duvv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekhv ekhvVar = new ekhv();
                int i = 0;
                while (true) {
                    ekgb ekgbVar2 = ekgbVar;
                    if (i >= ((ekoe) ekgbVar2).c) {
                        dtnr dtnrVar = (dtnr) dtnsVar.toBuilder();
                        dtnrVar.copyOnWrite();
                        ((dtns) dtnrVar.instance).g = dtns.emptyProtobufList();
                        ekhx ekhxVarG = ekhvVar.g();
                        dtnrVar.copyOnWrite();
                        dtns dtnsVar2 = (dtns) dtnrVar.instance;
                        dtnsVar2.a();
                        evpz.addAll(ekhxVarG, dtnsVar2.g);
                        return (dtns) dtnrVar.build();
                    }
                    ekhvVar.j((Iterable) eork.q((ListenableFuture) ekgbVar2.get(i)));
                    i++;
                }
            }
        }, eoqg.a);
    }

    @Override // defpackage.dtpd
    public final ListenableFuture a(final dtsl dtslVar) {
        durt.b("%s: Refresh file groups config with MDD", "FilteringPopulator");
        dtpz dtpzVarF = dtqa.f();
        dtpzVarF.b(this.f);
        dvaq dvaqVarE = dvaq.e(dtslVar.e(dtpzVarF.a()));
        eooz eoozVar = new eooz() { // from class: duvu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duwg duwgVar = this.a;
                dtma dtmaVar = (dtma) obj;
                if (dtmaVar == null || dtmaVar.h.size() == 0) {
                    durt.b("%s: All slices file group unavailable or empty.", "FilteringPopulator");
                    return eork.i(null);
                }
                try {
                    final dtns dtnsVar = (dtns) duwgVar.c.c(Uri.parse(((dtlw) dtmaVar.h.get(0)).d), echg.b(dtns.a));
                    evtg evtgVar = dtnsVar.g;
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    ekgb ekgbVar = duwgVar.a;
                    int size = ekgbVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        try {
                            ekfwVar.h(((duwe) ekgbVar.get(i2)).a(evtgVar));
                        } catch (Exception e) {
                            durt.k(e, "%s: Failed to apply filter", "FilteringPopulator");
                            return eork.h(e);
                        }
                    }
                    final dtsl dtslVar2 = dtslVar;
                    final ekgb ekgbVarG = ekfwVar.g();
                    return eika.k(duwgVar.d.get(), new eooz() { // from class: duwb
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Object objF;
                            List<Account> list = (List) obj2;
                            int i3 = ekgb.d;
                            ekfw ekfwVar2 = new ekfw();
                            dtns dtnsVar2 = dtnsVar;
                            final dtsl dtslVar3 = dtslVar2;
                            ekgb ekgbVar2 = ekgbVarG;
                            duwg duwgVar2 = duwgVar;
                            if (duwgVar2.e) {
                                dvaq dvaqVarE2 = dvaq.e(duwg.b(dtnsVar2, ekgbVar2));
                                eooz eoozVar2 = new eooz() { // from class: duvw
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        dtmj dtmjVar = new dtmj();
                                        dtmjVar.c((dtns) obj3);
                                        return dtslVar3.a(dtmjVar.a());
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                ekfwVar2.h(dvaqVarE2.g(eoozVar2, eoqgVar).f(new ejvr() { // from class: duvx
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        if (((Boolean) obj3).booleanValue()) {
                                            durt.b("%s: Added public filegroup to MDD", "FilteringPopulator");
                                            return null;
                                        }
                                        durt.b("%s: Didn't add public filegroup to MDD", "FilteringPopulator");
                                        return null;
                                    }
                                }, eoqgVar));
                            }
                            for (final Account account : list) {
                                ekfw ekfwVar3 = new ekfw();
                                ekgb ekgbVar3 = duwgVar2.b;
                                int size2 = ekgbVar3.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    try {
                                        ekfwVar3.h(((duwd) ekgbVar3.get(i4)).a());
                                    } catch (Exception e2) {
                                        durt.k(e2, "%s: Failed to apply filter", "FilteringPopulator");
                                        objF = eork.h(e2);
                                    }
                                }
                                ekfwVar3.j(ekgbVar2);
                                dvaq dvaqVarE3 = dvaq.e(duwg.b(dtnsVar2, ekfwVar3.g()));
                                eooz eoozVar3 = new eooz() { // from class: duvz
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        dtmj dtmjVar = new dtmj();
                                        dtmjVar.b(ejwi.j(account));
                                        dtmjVar.c((dtns) obj3);
                                        return dtslVar3.a(dtmjVar.a());
                                    }
                                };
                                eoqg eoqgVar2 = eoqg.a;
                                objF = dvaqVarE3.g(eoozVar3, eoqgVar2).f(new ejvr() { // from class: duwa
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        if (((Boolean) obj3).booleanValue()) {
                                            durt.b("%s: Added file group to MDD", "FilteringPopulator");
                                            return null;
                                        }
                                        durt.b("%s: Didn't add file group to MDD", "FilteringPopulator");
                                        return null;
                                    }
                                }, eoqgVar2);
                                ekfwVar2.h(objF);
                            }
                            return dvat.c(ekfwVar2.g()).a(new Callable() { // from class: duvy
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, eoqg.a);
                        }
                    }, eoqg.a);
                } catch (IOException e2) {
                    durt.k(e2, "%s: Failed to read file using mobstore and parsing to proto", "FilteringPopulator");
                    return eork.h(e2);
                }
            }
        };
        eoqg eoqgVar = eoqg.a;
        dvaq dvaqVarG = dvaqVarE.g(eoozVar, eoqgVar);
        eika.l(dvaqVarG, new duwc(), eoqgVar);
        return dvaqVarG;
    }
}
