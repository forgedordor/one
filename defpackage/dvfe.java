package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfe implements dvdg {
    public final ecil a;
    public final dvfk b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Context e;
    private final Executor f;
    private final ecev g;
    private final ecjl h;
    private final dvdj i;
    private final diep j;
    private final String k;
    private final dcdt l;
    private final deae m;

    public dvfe(Context context, Executor executor, String str, ecev ecevVar, ecjl ecjlVar, dvfk dvfkVar, dvdj dvdjVar, diep diepVar, dcdt dcdtVar, ecil ecilVar, deae deaeVar) {
        this.e = context;
        this.f = executor;
        this.g = ecevVar;
        this.h = ecjlVar;
        this.b = dvfkVar;
        this.i = dvdjVar;
        this.j = diepVar;
        this.k = str;
        this.l = dcdtVar;
        this.a = ecilVar;
        this.m = deaeVar;
    }

    @Override // defpackage.dvdg
    public final dvdf a(Account account) {
        dvdf dvdfVar;
        synchronized (this.c) {
            Map map = this.d;
            if (!map.containsKey(account)) {
                Context context = this.e;
                Pattern pattern = ecfb.a;
                ecfa ecfaVar = new ecfa(context);
                ecfaVar.a = "com.google.android.gms";
                ecfaVar.e("managed");
                ecfaVar.f("mdisync");
                ecfaVar.c(account);
                ecfaVar.g("profilesync/public/profile_info.pb");
                Uri uriA = ecfaVar.a();
                ecjl ecjlVar = this.h;
                ecji ecjiVarH = ecjj.h();
                ((echz) ecjiVarH).a = new ecib(this.a);
                ecjiVarH.e(dvfi.a);
                ecjiVarH.f(uriA);
                dvcy dvcyVar = new dvcy(ecjlVar.a(ecjiVarH.a()));
                dvfn dvfnVar = new dvfn(this.f, this.g);
                final AtomicReference atomicReference = new AtomicReference(new dvfo() { // from class: dvey
                    @Override // defpackage.dvfo
                    public final void m() {
                    }
                });
                final AtomicReference atomicReference2 = new AtomicReference(new dvfp() { // from class: dvez
                    @Override // defpackage.dvfp
                    public final void n() {
                    }
                });
                ejxr ejxrVar = new ejxr() { // from class: dvfa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return (dvfo) atomicReference.get();
                    }
                };
                ejxr ejxrVar2 = new ejxr() { // from class: dvfb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return (dvfp) atomicReference2.get();
                    }
                };
                ddsw ddswVar = new ddsw(context, new ddsn(account, eonx.a));
                String str = this.k;
                dvfw dvfwVar = new dvfw(context, ddswVar, str, account, ejxrVar, ejxrVar2);
                account = account;
                if (this.i.a(context)) {
                    dvcw.d(context.getApplicationContext(), str);
                    final diep diepVar = this.j;
                    ListenableFuture listenableFutureA = drgi.a(this.m.a());
                    ejvr ejvrVar = new ejvr() { // from class: dvex
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            String str2;
                            PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) obj;
                            return (pseudonymousIdToken == null || (str2 = pseudonymousIdToken.a) == null) ? "" : str2;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    ListenableFuture listenableFutureF = eooq.f(eooq.f(listenableFutureA, ejvrVar, eoqgVar), new ejvr() { // from class: dtmf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return new dtme(diepVar);
                        }
                    }, eoqgVar);
                    this.b.getClass();
                    ejwi.j(listenableFutureF);
                } else {
                    dvcw.d(context.getApplicationContext(), str);
                    diep diepVar2 = this.j;
                    account.toString();
                    ejwi.j(new dtme(diepVar2));
                }
                final dvfk dvfkVar = this.b;
                dvfkVar.getClass();
                ejxr ejxrVar3 = new ejxr() { // from class: dvew
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new dvfj(dvfkVar.a);
                    }
                };
                new dtmd();
                dvcw.d(context.getApplicationContext(), str);
                new dvfl(ejxrVar3);
                dvev dvevVar = new dvev(dvfwVar, context, dvfnVar, dvcyVar, this.l, new dvfc(this, uriA));
                dvevVar.g(new dvfd(this, uriA), eoqg.a);
                atomicReference.set(dvevVar);
                atomicReference2.set(dvevVar);
                map.put(account, dvevVar);
            }
            dvdfVar = (dvdf) map.get(account);
        }
        return dvdfVar;
    }
}
