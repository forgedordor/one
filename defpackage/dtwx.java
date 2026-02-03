package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtwx implements dtws {
    public final dtsl a;
    private final Context b;
    private final Executor c;
    private final ekgb d;

    public dtwx(Context context, Executor executor, dtsl dtslVar, ekgb ekgbVar) {
        this.b = context;
        this.c = executor;
        this.a = dtslVar;
        this.d = ekgbVar;
    }

    @Override // defpackage.dtws
    public final ListenableFuture a() {
        return this.a.b();
    }

    @Override // defpackage.dtws
    public final ListenableFuture b(dtma dtmaVar) {
        dtoy dtoyVarN = dtoz.n();
        dtoyVarN.c(dtmaVar.c);
        dtoyVarN.b(dtnd.a);
        if ((dtmaVar.b & 4) != 0) {
            String str = dtmaVar.e;
            Account account = null;
            if (!str.isEmpty()) {
                int iIndexOf = str.indexOf(":");
                if (iIndexOf < 0) {
                    durt.h("%s: Unable to parse Account with string = '%s'", "AccountUtil", str);
                } else {
                    String strSubstring = str.substring(0, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (dtvy.b(strSubstring2) && dtvy.b(strSubstring)) {
                        account = new Account(strSubstring2, strSubstring);
                    } else {
                        durt.i("%s: Unable to create Account with name = '%s', type = '%s'", "AccountUtil", strSubstring2, strSubstring);
                    }
                }
            }
            ((dtmm) dtoyVarN).a = ejwi.i(account);
        }
        return this.a.d(dtoyVarN.a());
    }

    @Override // defpackage.dtws
    public final ListenableFuture c(final String str) {
        dtqb dtqbVarI = dtqc.i();
        dtqbVarI.b(true);
        return eika.j(this.a.f(dtqbVarI.c()), new ejvr() { // from class: dtwu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                ArrayList arrayList = new ArrayList();
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    String str2 = str;
                    dtma dtmaVar = (dtma) ekgbVar.get(i);
                    if (!dtmaVar.c.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US)) && !dtmaVar.e.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US)) && !dtmaVar.j.toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US))) {
                        Iterator<E> it = dtmaVar.k.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((String) it.next()).toLowerCase(Locale.US).contains(str2.toLowerCase(Locale.US))) {
                                arrayList.add(dtmaVar);
                                break;
                            }
                        }
                    } else {
                        arrayList.add(dtmaVar);
                    }
                }
                Collections.sort(arrayList, new Comparator() { // from class: dtww
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        dtma dtmaVar2 = (dtma) obj2;
                        dtma dtmaVar3 = (dtma) obj3;
                        return ekdr.b.c(dtmaVar2.c, dtmaVar3.c).c(dtmaVar2.e, dtmaVar3.e).c(dtmaVar2.j, dtmaVar3.j).b(dtmaVar2.f, dtmaVar3.f).a();
                    }
                });
                return ekgb.n(arrayList);
            }
        }, this.c);
    }

    @Override // defpackage.dtws
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.d;
            if (i >= ((ekoe) ekgbVar).c) {
                return dvat.c(arrayList).a(new Callable() { // from class: dtwv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, this.c);
            }
            arrayList.add(((dtpd) ekgbVar.get(i)).a(this.a));
            i++;
        }
    }

    @Override // defpackage.dtws
    public final ListenableFuture e() {
        final dtsl dtslVar = this.a;
        final Context context = this.b;
        final Executor executor = this.c;
        return eika.i(new eooy() { // from class: dtwl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                String strK = dtslVar.k();
                ekrg ekrgVar = dtwr.a;
                ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "logDebugInfo", 27, "DebugUtil.java")).q("MDD Lib dump:");
                int i = 0;
                while (i <= strK.length() / 4000) {
                    int i2 = i * 4000;
                    i++;
                    ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "logDebugInfo", 33, "DebugUtil.java")).t("%s", strK.substring(i2, Math.min(strK.length(), i * 4000)));
                }
                final Executor executor2 = executor;
                final Context context2 = context;
                return dvaq.e(dtwr.a("MDD.WIFI.CHARGING.PERIODIC.TASK", context2, executor2)).g(new eooz() { // from class: dtwo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return dtwr.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", context2, executor2);
                    }
                }, executor2).g(new eooz() { // from class: dtwp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return dtwr.a("MDD.CHARGING.PERIODIC.TASK", context2, executor2);
                    }
                }, executor2).g(new eooz() { // from class: dtwq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return dtwr.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", context2, executor2);
                    }
                }, executor2);
            }
        }, executor);
    }

    @Override // defpackage.dtws
    public final ListenableFuture f(final String str) {
        return eika.i(new eooy() { // from class: dtwt
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.a.g(str);
            }
        }, this.c);
    }
}
