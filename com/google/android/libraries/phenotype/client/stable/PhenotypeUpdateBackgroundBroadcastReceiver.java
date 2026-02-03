package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.dzyn;
import defpackage.eadk;
import defpackage.eadt;
import defpackage.ejvr;
import defpackage.ejwl;
import defpackage.eooq;
import defpackage.eooz;
import defpackage.eoqt;
import defpackage.eryd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.a(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            final dzyn dzynVarA = dzyn.a(context);
            if (dzynVarA == null) {
                dzyn.g();
                ejwl.l(false);
                return;
            }
            Map mapA = eadk.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            final eadk eadkVar = (eadk) mapA.get(stringExtra);
            if (eadkVar == null || !eadkVar.b.equals(eryd.FILE)) {
                Log.i("PhenotypeBackgroundRecv", a.a(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final eoqt eoqtVarU = ((eoqt) eooq.g(eoqt.t(eooq.f(eoqt.t(eadt.a(dzynVarA).a()), new ejvr() { // from class: eadr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = eadt.a;
                    eabe eabeVar = eabe.a;
                    evub evubVar = ((eabk) obj).b;
                    String str = stringExtra;
                    if (evubVar.containsKey(str)) {
                        eabeVar = (eabe) evubVar.get(str);
                    }
                    return eabeVar.c;
                }
            }, dzynVarA.e())), new eooz() { // from class: eael
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String string;
                    List listR = (List) obj;
                    final eadk eadkVar2 = eadkVar;
                    if (!eadkVar2.e) {
                        listR = ekgb.r("");
                    }
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    Iterator it = listR.iterator();
                    while (true) {
                        final dzyn dzynVar = dzynVarA;
                        if (!it.hasNext()) {
                            return eork.a(ekfwVar.g()).a(new Callable() { // from class: eaek
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, dzynVar.e());
                        }
                        String str = stringExtra;
                        final String str2 = (String) it.next();
                        eacy eacyVar = eaeo.b;
                        if (eacyVar == null || !eacyVar.a(str, str2)) {
                            final eafa eafaVar = new eafa(dzynVar, str, str2, eadkVar2.c);
                            if (eadkVar2.d) {
                                Context context2 = dzynVar.d;
                                string = eaeh.a(context2).getString(eadkVar2.a, "");
                            } else {
                                string = str2;
                            }
                            final ListenableFuture listenableFutureA = eafaVar.a(string);
                            ekfwVar.h(eooq.g(eooq.g(eoqt.t(listenableFutureA), new eooz() { // from class: eaei
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return eafaVar.b((eafc) obj2);
                                }
                            }, dzynVar.e()), new eooz() { // from class: eaej
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final eafc eafcVar = (eafc) eork.q(listenableFutureA);
                                    if (eafcVar.c.isEmpty()) {
                                        return eorv.a;
                                    }
                                    final String str3 = str2;
                                    final eadk eadkVar3 = eadkVar2;
                                    final dzyn dzynVar2 = dzynVar;
                                    eoqt eoqtVarT = eoqt.t(eadt.a(dzynVar2).a());
                                    final String str4 = eadkVar3.a;
                                    return eooq.g(eoqt.t(eooq.f(eoqtVarT, new ejvr() { // from class: eads
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            int i2 = eadt.a;
                                            String str5 = str4;
                                            eabe eabeVar = eabe.a;
                                            str5.getClass();
                                            evub evubVar = ((eabk) obj3).b;
                                            if (evubVar.containsKey(str5)) {
                                                eabeVar = (eabe) evubVar.get(str5);
                                            }
                                            return eabeVar.d;
                                        }
                                    }, dzynVar2.e())), new eooz() { // from class: eaen
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            String str5 = str3;
                                            if (!((String) obj3).equals(str5)) {
                                                return eorv.a;
                                            }
                                            eacy eacyVar2 = eaeo.b;
                                            if (eacyVar2 != null && eacyVar2.a(eadkVar3.a, str5)) {
                                                return eorv.a;
                                            }
                                            return dzynVar2.b().a(eafcVar.c);
                                        }
                                    }, dzynVar2.e());
                                }
                            }, dzynVar.e()));
                        }
                    }
                }
            }, dzynVarA.e())).u(25L, TimeUnit.SECONDS, dzynVarA.e());
            eoqtVarU.b(new Runnable() { // from class: eaem
                @Override // java.lang.Runnable
                public final void run() {
                    eoqt eoqtVar = eoqtVarU;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            eork.q(eoqtVar);
                            Log.i("PhenotypeBackgroundRecv", a.v(str, "Successfully updated snapshot for "));
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.v(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, dzynVarA.e());
        }
    }
}
