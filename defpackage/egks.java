package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import defpackage.egky;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egks {
    public final efzn a;
    public final ehac b;
    public final egbf c;
    final egky d;
    public final egky.a e;
    public final egac f;
    public final efzm g = new egkr(this);
    private final dydh h;

    /* JADX WARN: Type inference failed for: r1v17, types: [dxyj, java.lang.Object] */
    public egks(egkq egkqVar, efzn efznVar, ehac ehacVar, egbf egbfVar, ehrb ehrbVar, dycy dycyVar, dyjb dyjbVar, egac egacVar, ejwi ejwiVar, egky egkyVar, egky.a aVar, eglf eglfVar, ScheduledExecutorService scheduledExecutorService, dtah dtahVar) {
        dydi dydiVar;
        dxxk dxxkVar;
        dycy dycyVar2;
        dyif dyifVar;
        dywb dywbVar;
        dyib dyibVar;
        dxyj dxyjVar;
        ExecutorService executorService;
        dtah dtahVar2;
        dyyb dyybVar;
        this.a = efznVar;
        this.b = ehacVar;
        this.c = egbfVar;
        this.f = egacVar;
        this.d = egkyVar;
        this.e = aVar;
        egli egliVar = new egli(ejwiVar);
        dydi dydiVar2 = egkyVar.c;
        Context contextZ = egkqVar.z();
        dydl dydlVar = new dydl();
        Context applicationContext = contextZ.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("Null applicationContext");
        }
        dydlVar.b = applicationContext;
        dydlVar.f = dyif.a().a();
        dydlVar.h = dyib.c().a();
        dydlVar.n = new dyda();
        dydlVar.d = egliVar;
        if (dydiVar2 == null) {
            throw new NullPointerException("Null accountsModel");
        }
        dydlVar.c = dydiVar2;
        dydlVar.e = dycyVar;
        dyih dyihVar = new dyih(eglfVar.b(dydiVar2));
        dyihVar.c = dyjbVar;
        dydlVar.f = dyihVar.a();
        dydlVar.j = egkp.a(ehrbVar, egkqVar, egliVar);
        dydlVar.g = new dywa(egliVar, egkqVar.z());
        dydlVar.h = eglfVar.a();
        dydlVar.a = scheduledExecutorService;
        if (dtahVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        dydlVar.m = dtahVar;
        ThreadFactory threadFactoryA = dyql.a();
        ExecutorService executorService2 = dydlVar.l;
        if (!(executorService2 == null ? ejud.a : ejwi.j(executorService2)).g()) {
            ExecutorService executorServiceNewCachedThreadPool = dydlVar.a;
            executorServiceNewCachedThreadPool = executorServiceNewCachedThreadPool == null ? Executors.newCachedThreadPool(threadFactoryA) : executorServiceNewCachedThreadPool;
            if (executorServiceNewCachedThreadPool == null) {
                throw new NullPointerException("Null backgroundExecutor");
            }
            dydlVar.l = executorServiceNewCachedThreadPool;
        }
        if (dydlVar.a == null) {
            dydlVar.a = Executors.newSingleThreadScheduledExecutor(threadFactoryA);
        }
        if (!dydlVar.e().g()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        }
        dydlVar.k = dydlVar.e().c();
        dycy dycyVar3 = dydlVar.e;
        if (!(dycyVar3 == null ? ejud.a : ejwi.j(dycyVar3)).g()) {
            dxxk dxxkVarB = dydlVar.b();
            dydlVar.d();
            final dycz dyczVar = new dycz(dxxkVarB, ejud.a);
            dydj dydjVar = new dydj();
            dydjVar.c = new dycw() { // from class: dydb
                @Override // defpackage.dycw, defpackage.dxxj
                public final void a(View view, Object obj) {
                    Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                    intent.addFlags(32768);
                    intent.addFlags(524288);
                    view.getContext().startActivity(intent);
                }
            };
            dydjVar.b = new dycw() { // from class: dydc
                @Override // defpackage.dycw, defpackage.dxxj
                public final void a(View view, Object obj) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, (Class<?>) AddAccountActivity.class));
                }
            };
            dydjVar.a = new dycw() { // from class: dydd
                @Override // defpackage.dycw, defpackage.dxxj
                public final void a(View view, Object obj) {
                    if (obj == null) {
                        Log.d(dycz.a, "showMyAccount called with null account");
                        return;
                    }
                    dxxk dxxkVar2 = dyczVar.b;
                    if (!dxxkVar2.g(obj)) {
                        Log.i(dycz.a, "showMyAccount called with non-Gaia account");
                        return;
                    }
                    String strC = dxxkVar2.c(obj);
                    etzr etzrVar = (etzr) etzt.a.createBuilder();
                    int i = etzq.HOME_SCREEN.rz;
                    etzrVar.copyOnWrite();
                    etzt etztVar = (etzt) etzrVar.instance;
                    etztVar.b |= 1;
                    etztVar.c = i;
                    dyat.b(view, strC, (etzt) etzrVar.build());
                }
            };
            dydlVar.e = dydjVar.a();
        }
        dydlVar.c().a.b = ((dyii) dydlVar.d()).a;
        dydlVar.d();
        dtah dtahVar3 = dydlVar.m;
        if (dtahVar3 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(dtahVar3 instanceof dtag)) {
            dydlVar.n = new dyye(dydlVar.b(), dydlVar.c(), dtahVar3, (ejxr) dydlVar.q.d(new ejxr() { // from class: dyde
                @Override // defpackage.ejxr
                public final Object get() {
                    return new ejxr() { // from class: dydf
                        @Override // defpackage.ejxr
                        public final Object get() {
                            return null;
                        }
                    };
                }
            }));
        }
        if (dydlVar.o == null) {
            dydlVar.o = new dywf(dydlVar.a(), dydlVar.a);
        }
        dyih dyihVar2 = new dyih(dydlVar.d());
        if (!((dyii) dydlVar.d()).h.g()) {
            dydlVar.f();
            Context contextA = dydlVar.a();
            dxxk dxxkVarB2 = dydlVar.b();
            dydlVar.d();
            dyihVar2.f = ejwi.j(new dykq(contextA, dxxkVarB2, ejud.a));
        }
        if (!((dyii) dydlVar.d()).i.g()) {
            dydlVar.f();
            if (fbgh.a.get().c(dydlVar.a())) {
                dyihVar2.g = ejwi.j(new dyjt(dydlVar.b(), dydlVar.a(), dydlVar.o, dydlVar.p));
            }
        }
        if (!((dyii) dydlVar.d()).d.g()) {
            dyihVar2.b = ejwi.j(new dyne());
        }
        if (fbgh.a.get().b(dydlVar.a())) {
            dyihVar2.c(true);
        }
        dydlVar.f = dyihVar2.a();
        Context context = dydlVar.b;
        if (context != null && (dydiVar = dydlVar.c) != null && (dxxkVar = dydlVar.d) != null && (dycyVar2 = dydlVar.e) != null && (dyifVar = dydlVar.f) != null && (dywbVar = dydlVar.g) != null && (dyibVar = dydlVar.h) != null && (dxyjVar = dydlVar.k) != null && (executorService = dydlVar.l) != null && (dtahVar2 = dydlVar.m) != null && (dyybVar = dydlVar.n) != null) {
            this.h = new dydm(context, dydiVar, dxxkVar, dycyVar2, dyifVar, dywbVar, dyibVar, dydlVar.i, dydlVar.j, dxyjVar, executorService, dtahVar2, dyybVar, dydlVar.o, dydlVar.p, dydlVar.q);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dydlVar.b == null) {
            sb.append(" applicationContext");
        }
        if (dydlVar.c == null) {
            sb.append(" accountsModel");
        }
        if (dydlVar.d == null) {
            sb.append(" accountConverter");
        }
        if (dydlVar.e == null) {
            sb.append(" clickListeners");
        }
        if (dydlVar.f == null) {
            sb.append(" features");
        }
        if (dydlVar.g == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (dydlVar.h == null) {
            sb.append(" configuration");
        }
        if (dydlVar.k == null) {
            sb.append(" avatarImageLoader");
        }
        if (dydlVar.l == null) {
            sb.append(" backgroundExecutor");
        }
        if (dydlVar.m == null) {
            sb.append(" vePrimitives");
        }
        if (dydlVar.n == null) {
            sb.append(" visualElements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static dydh a(fr frVar) {
        egkq egkqVar = (egkq) frVar.h("$TikTok$NonAccountScopedOGAccountMenuManagerProviderFragment");
        if (egkqVar == null) {
            egkqVar = new egkq();
            eyhj.e(egkqVar);
            cg cgVar = new cg(frVar);
            cgVar.u(egkqVar, "$TikTok$NonAccountScopedOGAccountMenuManagerProviderFragment");
            cgVar.c();
        }
        return egkqVar.H().h;
    }
}
