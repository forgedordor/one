package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.dzyn;
import defpackage.eadt;
import defpackage.ejvr;
import defpackage.eooh;
import defpackage.eooq;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eoqt;
import defpackage.eork;
import defpackage.eorv;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                final String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.a(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                dzyn.g();
                final dzyn dzynVarA = dzyn.a(context);
                if (dzynVarA == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                ListenableFuture listenableFutureG = string != null ? eooq.g(eoqt.t(eadt.a(dzynVarA).b(new ejvr() { // from class: eado
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        int i = eadt.a;
                        eabj eabjVar = (eabj) eabk.a.createBuilder();
                        for (Map.Entry entry : DesugarCollections.unmodifiableMap(((eabk) obj).b).entrySet()) {
                            String str = string;
                            eabe eabeVar = (eabe) entry.getValue();
                            eabd eabdVar = (eabd) eabe.a.createBuilder();
                            if (!eabeVar.d.equals(str)) {
                                String str2 = eabeVar.d;
                                eabdVar.copyOnWrite();
                                eabe eabeVar2 = (eabe) eabdVar.instance;
                                str2.getClass();
                                eabeVar2.b |= 1;
                                eabeVar2.d = str2;
                            }
                            for (String str3 : eabeVar.c) {
                                if (!str3.equals(str)) {
                                    eabdVar.a(str3);
                                }
                            }
                            eabjVar.a((String) entry.getKey(), (eabe) eabdVar.build());
                        }
                        return (eabk) eabjVar.build();
                    }
                }, dzynVarA.e())), new eooz() { // from class: eadp
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        int i = eadt.a;
                        int i2 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        Context context2 = dzynVarA.d;
                        ekfwVar.h(context2);
                        int i3 = dqyw.a;
                        ekfwVar.h(dqyw.a(context2));
                        ekgb ekgbVarG = ekfwVar.g();
                        int i4 = ((ekoe) ekgbVarG).c;
                        boolean zB = true;
                        for (int i5 = 0; i5 < i4; i5++) {
                            String str = string;
                            File file = new File(String.valueOf(((Context) ekgbVarG.get(i5)).getFilesDir()) + "/phenotype/shared/" + str);
                            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                            if (file.exists()) {
                                zB = eadt.b(file);
                            }
                        }
                        return zB ? eorv.a : eork.h(new IOException("Unable to remove snapshots for removed user"));
                    }
                }, dzynVarA.e()) : eorv.a;
                ejvr ejvrVar = new ejvr() { // from class: eabf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
                    }
                };
                eoqg eoqgVar = eoqg.a;
                listenableFutureArr[0] = eooh.f(listenableFutureG, IOException.class, ejvrVar, eoqgVar);
                listenableFutureArr[1] = string != null ? dzynVarA.e().submit(new Runnable() { // from class: eabg
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedPreferences sharedPreferencesA = eaeh.a(context);
                        SharedPreferences.Editor editorEdit = null;
                        for (Map.Entry<String, ?> entry : sharedPreferencesA.getAll().entrySet()) {
                            if (entry.getValue() instanceof String) {
                                if (entry.getValue().equals(string)) {
                                    if (editorEdit == null) {
                                        editorEdit = sharedPreferencesA.edit();
                                    }
                                    editorEdit.remove(entry.getKey());
                                }
                            }
                        }
                        if (editorEdit != null) {
                            editorEdit.commit();
                        }
                    }
                }) : eorv.a;
                eork.b(listenableFutureArr).a(new Callable() { // from class: eabh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        pendingResultGoAsync.finish();
                        return null;
                    }
                }, eoqgVar);
            }
        }
    }
}
