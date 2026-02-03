package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvop implements dviq, dvir, dvix, dvkc, dvkb {
    public final Context a;
    public final dvqa b;
    public final eosc c;
    public final Executor d;
    public final dvrd e;
    public final dvyx f;
    public final Random i;
    public final dvpm j;
    public dvip n;
    public dvin o;
    public dviy p;
    public final Map q;
    LruCache r;
    private final dvlj u;
    private HashSet v;
    private final HashSet w;
    private BroadcastReceiver y;
    public final Object g = new Object();
    public final Object h = new Object();
    final Map k = new HashMap();
    final Map l = new HashMap();
    public final Handler m = new Handler(Looper.getMainLooper());
    private final HashMap x = new HashMap();
    final Map s = new HashMap();
    public final Runnable t = new dvoo(this);

    public dvop(Context context, dvqa dvqaVar, dvrd dvrdVar, dvlj dvljVar, Map map, dvyx dvyxVar) {
        this.r = null;
        this.a = context;
        this.b = dvqaVar;
        this.e = dvrdVar;
        this.u = dvljVar;
        eosc eoscVar = dvie.b().a;
        this.c = eoscVar;
        this.f = dvyxVar;
        new HashMap();
        this.w = new HashSet();
        this.q = map;
        this.d = new eoss(eoscVar);
        this.i = new Random();
        this.j = new dvpm();
        int iA = (int) fbfm.a.get().a();
        if (iA > 0) {
            this.r = new LruCache(iA);
        }
    }

    private final dvmi A(dwje dwjeVar) {
        dwws dwwsVarL = l(dwjeVar);
        dvin dvinVar = this.o;
        dviy dviyVar = this.p;
        Map map = this.q;
        dvlj dvljVar = this.u;
        return dvmi.a(this.a, dwjeVar, this.b, this, this, dwwsVarL, dvinVar, dviyVar, dvljVar, this, this, map);
    }

    public static dwpo j(dwpo dwpoVar, dwaz dwazVar, long j) {
        byte[] bArr;
        int length;
        dwpn dwpnVarG = dwpoVar.g();
        dvhn.a();
        dwpnVarG.h(System.currentTimeMillis() + j);
        dwpnVarG.c(true);
        if (!TextUtils.isEmpty(dwazVar.l())) {
            dwpnVarG.p(dwazVar.l());
        }
        if (z(dwpoVar.j(), dwazVar)) {
            dwpnVarG.j((String) dwazVar.d().c());
            dwpnVarG.k(true);
        } else if (dwazVar.g().g() && (length = (bArr = (byte[]) dwazVar.g().c()).length) > 0) {
            dwpnVarG.i(BitmapFactory.decodeByteArray(bArr, 0, length));
        }
        if (!dwazVar.j().isEmpty()) {
            dwpnVarG.b(dwazVar.j());
        }
        if (dwazVar.f().g()) {
            dwpnVarG.o(((Long) dwazVar.f().c()).longValue());
        }
        return dwpnVarG.a();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public static boolean z(ejwi ejwiVar, dwaz dwazVar) {
        if (!dwazVar.d().g()) {
            return false;
        }
        if (!ejwiVar.g()) {
            return true;
        }
        ?? C = dwazVar.d().c();
        return (TextUtils.isEmpty(C) || ((String) C).equals(ejwiVar.c())) ? false : true;
    }

    @Override // defpackage.dviq
    public final dwwy a(dwje dwjeVar, dwpx dwpxVar) {
        return m(dwjeVar, dwpxVar, new ejwm() { // from class: dvog
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dvhn.a();
                return System.currentTimeMillis() > ((dwpo) obj).b();
            }
        }, new ejwm() { // from class: dvoh
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwpo) obj).e() == -1;
            }
        });
    }

    @Override // defpackage.dviq
    public final ejwi b(dwje dwjeVar, ejwi ejwiVar) {
        if (fbel.b() && ejwiVar.g() && ((dwpo) ejwiVar.c()).h().e() == dwpu.ONE_TO_ONE && !dvju.b((dwpo) ejwiVar.c())) {
            dvyx dvyxVar = this.f;
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(92);
            dwhpVarR.f(701);
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.d(((dwpo) ejwiVar.c()).h());
            dvyxVar.b(dwhpVarR.a());
            dvip dvipVar = this.n;
            dwpk dwpkVarC = ((dwpo) ejwiVar.c()).h().c();
            dvli dvliVar = (dvli) dvipVar;
            ejwi ejwiVarU = dvliVar.d(dwjeVar).u(dwpkVarC);
            if (ejwiVarU.g()) {
                dvliVar.c(dwjeVar, dwpkVarC, ejwiVarU, new ejwm() { // from class: dvla
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj) {
                        dvhn.a();
                        return System.currentTimeMillis() > ((dwpf) obj).a();
                    }
                });
            }
            if (ejwiVarU.g()) {
                dwpn dwpnVarG = ((dwpo) ejwiVar.c()).g();
                if (((dwpf) ejwiVarU.c()).i().g() && ejwk.c((String) ((dwpo) ejwiVar.c()).l().f())) {
                    dwpnVarG.p((String) ((dwpf) ejwiVarU.c()).i().c());
                }
                if (((dwpf) ejwiVarU.c()).g().g() && ejwk.c((String) ((dwpo) ejwiVar.c()).j().f())) {
                    dwpnVarG.j((String) ((dwpf) ejwiVarU.c()).g().c());
                }
                dwpo dwpoVarA = dwpnVarG.a();
                if (!dvju.b(dwpoVarA)) {
                    dwhp dwhpVarR2 = dwhq.r();
                    dwhpVarR2.g(92);
                    dwhpVarR2.f(702);
                    dwhpVarR2.n(dwjeVar.c().f());
                    dwhpVarR2.o(dwjeVar.d().E());
                    dwhpVarR2.d(((dwpo) ejwiVar.c()).h());
                    dvyxVar.b(dwhpVarR2.a());
                }
                return ejwi.j(dwpoVarA);
            }
            dvhv.c("LiMsgController", "conversation profile fallback failed because other participant is not found");
        }
        return ejwiVar;
    }

    @Override // defpackage.dviq
    public final synchronized void c(List list) {
        HashSet hashSet = this.w;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.addAll(list);
        if (zIsEmpty) {
            this.m.post(new dvoa(this));
        }
    }

    @Override // defpackage.dviq
    public final synchronized void d(dwje dwjeVar) {
        HashMap map = this.x;
        int iIntValue = (map.containsKey(dwjeVar) ? ((Integer) map.get(dwjeVar)).intValue() : 0) + 1;
        if (iIntValue == 1) {
            dvhv.a("LiMsgController", "BindV2 start for ".concat(((dwiq) dwjeVar.c().f()).a));
            v(dwjeVar);
        } else {
            dvhv.a("LiMsgController", "BindV2 ignore start for ".concat(((dwiq) dwjeVar.c().f()).a));
        }
        map.put(dwjeVar, Integer.valueOf(iIntValue));
    }

    @Override // defpackage.dviq
    public final synchronized void e(final dwje dwjeVar) {
        this.m.postDelayed(new Runnable() { // from class: dvoe
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y(dwjeVar);
            }
        }, fbef.a.get().a());
    }

    @Override // defpackage.dviq
    public final synchronized void f(List list) {
        HashSet hashSet = this.v;
        if (hashSet != null && !hashSet.isEmpty()) {
            this.v.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A((dwje) it.next()).c();
            }
            if (this.v.isEmpty()) {
                this.m.removeCallbacks(this.t);
                BroadcastReceiver broadcastReceiver = this.y;
                if (broadcastReceiver != null) {
                    this.a.unregisterReceiver(broadcastReceiver);
                    this.y = null;
                    return;
                }
            }
            return;
        }
        dvhv.a("LiMsgController", "No accounts with open bind channel");
    }

    @Override // defpackage.dviq
    public final dwqw g(dwpx dwpxVar, dwqo dwqoVar, String str, ejwi ejwiVar, ekgp ekgpVar) {
        dwqk dwqkVarT = dwqw.t();
        String string = UUID.randomUUID().toString();
        dvhn.a();
        dwqkVarT.j(String.format("%s%s-%s", "", string, Long.valueOf(System.currentTimeMillis())));
        dwnp dwnpVar = (dwnp) dwqkVarT;
        dwnpVar.e = 2;
        dwqkVarT.k(dwqq.OUTGOING_PENDING_SEND);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dvhn.a();
        dwqkVarT.n(timeUnit.toMicros(System.currentTimeMillis()));
        dwqkVarT.e(dwpxVar);
        dwnpVar.b = dwqoVar;
        dwqkVarT.f(str);
        dwnpVar.a = dwpxVar.a();
        dwqkVarT.c(192);
        dwqkVarT.r();
        dwqkVarT.l(ekgpVar);
        dwqkVarT.o((String) ((ejwt) ejwiVar).a);
        return dwqkVarT.a();
    }

    @Override // defpackage.dvix
    public final void h(int i) {
        dvpm dvpmVar = this.j;
        if (dvpmVar.c == i) {
            return;
        }
        dvpmVar.c = i;
        dvpmVar.a();
    }

    @Override // defpackage.dvkc
    public final void i(final dwje dwjeVar, final dwpx dwpxVar, final dwaz dwazVar) {
        l(dwjeVar).q(dwpxVar).k(new dwwx() { // from class: dvmj
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (!ejwiVar.g()) {
                    dvhv.c("LiMsgController", "Profile changes received for non-existent conversation.");
                    return;
                }
                final dwaz dwazVar2 = dwazVar;
                final dwpo dwpoVar = (dwpo) ejwiVar.c();
                if (dwazVar2.f().g() && dwpoVar.f() > ((Long) dwazVar2.f().c()).longValue()) {
                    dvhv.c("LiMsgController", "Profile changes received that were older than current conversation.");
                    return;
                }
                dwpx dwpxVar2 = dwpxVar;
                final dwje dwjeVar2 = dwjeVar;
                final dvop dvopVar = this.a;
                dvhv.a("LiMsgController", "Profile changes: " + dwazVar2.toString() + " for conversation: " + dwpxVar2.toString());
                dvopVar.c.submit(new Runnable() { // from class: dvnx
                    @Override // java.lang.Runnable
                    public final void run() {
                        int iC = (int) fbfm.c();
                        dvop dvopVar2 = dvopVar;
                        long jNextInt = dvopVar2.i.nextInt(iC) + fbfm.b();
                        dwpo dwpoVar2 = dwpoVar;
                        dwaz dwazVar3 = dwazVar2;
                        dwje dwjeVar3 = dwjeVar2;
                        dwpo dwpoVarJ = dvop.j(dwpoVar2, dwazVar3, jNextInt);
                        dvopVar2.l(dwjeVar3).ak(dwpoVarJ);
                        dwna dwnaVar = (dwna) dwpoVarJ;
                        if (dwpoVar2.j().equals(dwnaVar.c) && dwnaVar.d.g()) {
                            return;
                        }
                        dvopVar2.n(dwjeVar3, dwpoVarJ);
                    }
                });
            }
        });
    }

    public final dwpo k(dwje dwjeVar, dwpx dwpxVar, ejwi ejwiVar, ejwm ejwmVar, ejwm ejwmVar2) {
        dwpo dwpoVarA;
        boolean zA;
        if (ejwiVar.g()) {
            dwpoVarA = (dwpo) ejwiVar.c();
            zA = ejwmVar.a((dwpo) ejwiVar.c());
        } else {
            dwpn dwpnVarR = dwpo.r();
            dwpnVarR.f(dwpxVar);
            dwpnVarR.h(-1L);
            dwpnVarR.b(new HashMap());
            dwpnVarR.c(dwpxVar.e() == dwpu.ONE_TO_ONE);
            dwpoVarA = dwpnVarR.a();
            zA = false;
        }
        boolean zA2 = ejwmVar2.a(dwpoVarA);
        ListenableFuture listenableFutureI = eork.i(dwpoVarA);
        if (zA) {
            listenableFutureI = r(dwjeVar, dwpoVarA, false);
        } else if (dwpoVarA.q() && !dwpoVarA.i().g()) {
            listenableFutureI = n(dwjeVar, dwpoVarA);
        }
        if (zA2) {
            eork.b(listenableFutureI).b(new eooy() { // from class: dvnz
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eork.i(false);
                }
            }, this.c);
        }
        return dwpoVarA;
    }

    public final dwws l(dwje dwjeVar) {
        return this.e.b(dwjeVar);
    }

    public final dwwy m(final dwje dwjeVar, final dwpx dwpxVar, final ejwm ejwmVar, final ejwm ejwmVar2) {
        return dwwr.d(l(dwjeVar).q(dwpxVar), new ejvr() { // from class: dvmm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.k(dwjeVar, dwpxVar, (ejwi) obj, ejwmVar, ejwmVar2);
            }
        });
    }

    public final ListenableFuture n(final dwje dwjeVar, final dwpo dwpoVar) {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFutureF;
        if (!dwpoVar.j().g()) {
            return eork.i(dwpoVar);
        }
        final Pair pairCreate = Pair.create(dwjeVar, Pair.create(dwpoVar.h(), dwpoVar.j().c()));
        synchronized (this.h) {
            Map map = this.l;
            listenableFuture = (ListenableFuture) map.get(pairCreate);
            if (listenableFuture == null) {
                dvyx dvyxVar = this.f;
                dwhp dwhpVarR = dwhq.r();
                dwhpVarR.g(37);
                dwhpVarR.n(dwjeVar.c().f());
                dwhpVarR.o(dwjeVar.d().E());
                dwhpVarR.d(dwpoVar.h());
                dvyxVar.b(dwhpVarR.a());
                if (dwpoVar.j().g()) {
                    ListenableFuture listenableFutureSubmit = this.c.submit(new dvjl(this.a, (String) dwpoVar.j().c()));
                    dvon dvonVar = new dvon(this, dwjeVar, dwpoVar);
                    eoqg eoqgVar = eoqg.a;
                    eork.r(listenableFutureSubmit, dvonVar, eoqgVar);
                    listenableFutureF = eooq.f(listenableFutureSubmit, new ejvr() { // from class: dvmx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dwpo dwpoVarA;
                            dvop dvopVar = this.a;
                            dwpo dwpoVar2 = dwpoVar;
                            dwje dwjeVar2 = dwjeVar;
                            Bitmap bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                                dwpn dwpnVarG = dwpoVar2.g();
                                dwpnVarG.k(false);
                                dwpnVarG.i(bitmap);
                                dwpoVarA = dwpnVarG.a();
                                dvyx dvyxVar2 = dvopVar.f;
                                dwhp dwhpVarR2 = dwhq.r();
                                dwhpVarR2.g(38);
                                dwhpVarR2.n(dwjeVar2.c().f());
                                dwhpVarR2.o(dwjeVar2.d().E());
                                dwhpVarR2.d(dwpoVar2.h());
                                dvyxVar2.b(dwhpVarR2.a());
                            } else {
                                dwpn dwpnVarG2 = dwpoVar2.g();
                                dwpnVarG2.k(true);
                                dwpoVarA = dwpnVarG2.a();
                                dvyx dvyxVar3 = dvopVar.f;
                                dwhp dwhpVarR3 = dwhq.r();
                                dwhpVarR3.g(39);
                                dwhpVarR3.n(dwjeVar2.c().f());
                                dwhpVarR3.o(dwjeVar2.d().E());
                                dwhpVarR3.d(dwpoVar2.h());
                                dvyxVar3.b(dwhpVarR3.a());
                            }
                            dvopVar.l(dwjeVar2).ak(dwpoVarA);
                            return dwpoVarA;
                        }
                    }, eoqgVar);
                } else {
                    listenableFutureF = eork.i(dwpoVar);
                }
                listenableFuture = listenableFutureF;
                map.put(pairCreate, listenableFuture);
                listenableFuture.b(new Runnable() { // from class: dvny
                    @Override // java.lang.Runnable
                    public final void run() {
                        dvop dvopVar = this.a;
                        Object obj = dvopVar.h;
                        Pair pair = pairCreate;
                        synchronized (obj) {
                            dvopVar.l.remove(pair);
                        }
                    }
                }, eoqg.a);
            } else {
                dvhv.a("LiMsgController", "conversationSync or conversationImageFetch already pending for conversation");
            }
        }
        return listenableFuture;
    }

    public final ListenableFuture o(dwje dwjeVar, dwpx dwpxVar) {
        dwwy dwwyVarM;
        synchronized (this) {
            Pair pairCreate = Pair.create(dwjeVar, dwpxVar);
            LruCache lruCache = this.r;
            dwwyVarM = lruCache == null ? null : (dwwy) lruCache.get(pairCreate);
            if (dwwyVarM == null) {
                ejwr ejwrVar = ejwr.ALWAYS_FALSE;
                dwwyVarM = m(dwjeVar, dwpxVar, ejwrVar, ejwrVar);
                LruCache lruCache2 = this.r;
                if (lruCache2 != null) {
                    lruCache2.put(pairCreate, dwwyVarM);
                }
            }
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        dwwyVarM.k(new dwwx() { // from class: dvmp
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                settableFutureCreate.set((dwpo) obj);
            }
        });
        return settableFutureCreate;
    }

    public final ListenableFuture p(dwje dwjeVar, dwpx dwpxVar) {
        dvrd dvrdVar = this.e;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        dvrdVar.b(dwjeVar).an(dwpxVar, dwqv.e).k(new dwwx() { // from class: dvmu
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                settableFutureCreate.set(Boolean.valueOf(((ekgb) obj).isEmpty()));
            }
        });
        return settableFutureCreate;
    }

    public final ListenableFuture q(final dwje dwjeVar, final dwqw dwqwVar, final boolean z) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.d.execute(new Runnable() { // from class: dvoc
            @Override // java.lang.Runnable
            public final void run() {
                dvop dvopVar = this.a;
                dwje dwjeVar2 = dwjeVar;
                dwqw dwqwVar2 = dwqwVar;
                dwqk dwqkVarG = dwqwVar2.g();
                boolean z2 = z;
                dwqkVarG.k(z2 ? dwqq.LOCAL : dwqq.OUTGOING_SENDING);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dvhn.a();
                dwqkVarG.n(timeUnit.toMicros(System.currentTimeMillis() + (z2 ? 0L : fbel.a.get().c())));
                dwqw dwqwVarA = dwqkVarG.a();
                try {
                    dvopVar.l(dwjeVar2).V(dwqwVarA);
                    if (!z2) {
                        dvopVar.t(dwqwVar2, true);
                    }
                    settableFutureCreate.set(dwqwVarA);
                } catch (Throwable th) {
                    if (!z2) {
                        dvopVar.t(dwqwVar2, false);
                    }
                    throw th;
                }
            }
        });
        return settableFutureCreate;
    }

    public final ListenableFuture r(final dwje dwjeVar, final dwpo dwpoVar, final boolean z) {
        ListenableFuture listenableFuture;
        synchronized (this.g) {
            final Pair pairCreate = Pair.create(dwjeVar, dwpoVar.h());
            Map map = this.k;
            listenableFuture = (ListenableFuture) map.get(pairCreate);
            if (listenableFuture == null) {
                dvxe dvxeVarC = dvxf.c();
                ((dvxa) dvxeVarC).a = "sync conversation profile";
                dvxeVarC.b(dvxj.g);
                final dvxf dvxfVarA = dvxeVarC.a();
                final ListenableFuture listenableFutureN = eork.n(new eooy() { // from class: dvnv
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        dwpo dwpoVar2 = dwpoVar;
                        dwpx dwpxVarH = dwpoVar2.h();
                        evqs evqsVarN = dwpoVar2.n();
                        if (dwpxVarH.e() != dwpu.GROUP) {
                            dvqb dvqbVar = new dvqb();
                            dvqbVar.b = 1;
                            return eork.i(dvqbVar.a());
                        }
                        dvop dvopVar = this.a;
                        dvxf dvxfVar = dvxfVarA;
                        dwje dwjeVar2 = dwjeVar;
                        dwdo dwdoVar = (dwdo) dvopVar.b;
                        dwcm dwcmVar = dwdoVar.a;
                        return dwcmVar.b(UUID.randomUUID(), new dwfj(dwdoVar.b, dwjeVar2, dwpxVarH, evqsVarN), dwcmVar.d.b(), dwjeVar2, dvxfVar, true);
                    }
                }, this.c);
                eorg eorgVarB = eork.b(listenableFutureN);
                Callable callable = new Callable() { // from class: dvnw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int iC = (int) fbfm.c();
                        ListenableFuture listenableFuture2 = listenableFutureN;
                        dvop dvopVar = this.a;
                        int iNextInt = dvopVar.i.nextInt(iC);
                        long jB = fbfm.b();
                        dvqp dvqpVar = (dvqp) eork.q(listenableFuture2);
                        long jNextInt = r3.nextInt(iNextInt) + jB;
                        int iB = dvqpVar.b() - 1;
                        dwpo dwpoVar2 = dwpoVar;
                        if (iB != 1) {
                            dvhv.e("LiMsgController", "Conversation profile is not supported.");
                            dwpn dwpnVarG = dwpoVar2.g();
                            dvhn.a();
                            dwpnVarG.h(System.currentTimeMillis() + jNextInt);
                            return dwpnVarG.a();
                        }
                        if (!dvqpVar.a().g()) {
                            dvhv.c("LiMsgController", "Got empty conversation profile.");
                            return dwpoVar2;
                        }
                        dwje dwjeVar2 = dwjeVar;
                        dwpo dwpoVarJ = dvop.j(dwpoVar2, (dwaz) dvqpVar.a().c(), jNextInt);
                        dvopVar.l(dwjeVar2).ak(dwpoVarJ);
                        if (!((dwac) dvqpVar.a().c()).e.g()) {
                            return dwpoVarJ;
                        }
                        dvopVar.l(dwjeVar2).C(((dwna) dwpoVarJ).a, ((dvzz) ((dwac) dvqpVar.a().c()).e.c()).a);
                        return dwpoVarJ;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                ListenableFuture listenableFutureA = eorgVarB.a(callable, eoqgVar);
                map.put(pairCreate, listenableFutureA);
                listenableFutureA.b(new Runnable() { // from class: dvnb
                    @Override // java.lang.Runnable
                    public final void run() {
                        dvop dvopVar = this.a;
                        Object obj = dvopVar.g;
                        Pair pair = pairCreate;
                        synchronized (obj) {
                            dvopVar.k.remove(pair);
                        }
                    }
                }, eoqgVar);
                listenableFuture = listenableFutureA;
            }
        }
        return eooq.g(listenableFuture, new eooz() { // from class: dvnc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dwpo dwpoVar2 = (dwpo) obj;
                if (!dwpoVar.j().equals(dwpoVar2.j()) || !dwpoVar2.i().g()) {
                    boolean z2 = z;
                    ListenableFuture listenableFutureN2 = this.a.n(dwjeVar, dwpoVar2);
                    if (z2) {
                        return listenableFutureN2;
                    }
                }
                return eork.i(dwpoVar2);
            }
        }, eoqg.a);
    }

    public final synchronized void s() {
        if (!this.v.isEmpty()) {
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                A((dwje) it.next()).m();
            }
        }
    }

    public final void t(dwqw dwqwVar, boolean z) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(true != z ? 60 : 59);
        dwhpVarR.p(dwqwVar.r());
        dwhpVarR.d(dwqwVar.f());
        this.f.b(dwhpVarR.a());
    }

    public final synchronized void u(long j) {
        try {
            try {
                dvia.b();
                dvxe dvxeVarC = dvxf.c();
                ((dvxa) dvxeVarC).a = "Resend Delivery Receipts";
                dvxeVarC.b(dvxj.g);
                final dvxf dvxfVarA = dvxeVarC.a();
                Iterator it = this.w.iterator();
                while (it.hasNext()) {
                    final dwje dwjeVar = (dwje) it.next();
                    dwws dwwsVarL = l(dwjeVar);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    dvhn.a();
                    final ekgp ekgpVarB = dwwsVarL.B(timeUnit.toMicros(System.currentTimeMillis() - j));
                    ekqg ekqgVarListIterator = ekgpVarB.keySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        final dwpx dwpxVar = (dwpx) ekqgVarListIterator.next();
                        ListenableFuture listenableFutureO = o(dwjeVar, dwpxVar);
                        eooz eoozVar = new eooz() { // from class: dvnh
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                dwpo dwpoVar = (dwpo) obj;
                                evqs evqsVarN = dwpoVar == null ? evqs.b : dwpoVar.n();
                                dvop dvopVar = this.a;
                                dvxf dvxfVar = dvxfVarA;
                                ekgp ekgpVar = ekgpVarB;
                                dwpx dwpxVar2 = dwpxVar;
                                return dvopVar.b.b(dwjeVar, dwpxVar2, evqsVarN, (List) ekgpVar.get(dwpxVar2), dvxfVar);
                            }
                        };
                        eosc eoscVar = this.c;
                        eork.d(eooq.g(listenableFutureO, eoozVar, eoscVar)).a(new Callable() { // from class: dvni
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekgp ekgpVar = ekgpVarB;
                                this.a.l(dwjeVar).I((List) ekgpVar.get(dwpxVar));
                                return null;
                            }
                        }, eoscVar);
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void v(dwje dwjeVar) {
        dvhv.a("LiMsgController", "BindV2 startMessaging() called manually for ".concat(((dwiq) dwjeVar.c().f()).a));
        w(ekgb.r(dwjeVar));
    }

    public final synchronized void w(List list) {
        HashSet hashSet = this.v;
        if (hashSet == null) {
            this.v = new HashSet(list);
        } else {
            hashSet.addAll(list);
        }
        Handler handler = this.m;
        Runnable runnable = this.t;
        handler.removeCallbacks(runnable);
        runnable.run();
        if (this.y == null) {
            this.y = new dvom(this);
            this.a.registerReceiver(this.y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final synchronized void x(dwje dwjeVar) {
        dvhv.a("LiMsgController", "BindV2 stopMessaging() called manually for ".concat(((dwiq) dwjeVar.c().f()).a));
        f(ekgb.r(dwjeVar));
    }

    public final synchronized void y(dwje dwjeVar) {
        HashMap map = this.x;
        int iIntValue = (map.containsKey(dwjeVar) ? ((Integer) map.get(dwjeVar)).intValue() : 0) - 1;
        if (iIntValue <= 0) {
            if (iIntValue < 0) {
                dvhv.c("LiMsgController", "unpaired call to stopMessagingCounted!");
            }
            dvhv.a("LiMsgController", "BindV2 stop for ".concat(((dwiq) dwjeVar.c().f()).a));
            x(dwjeVar);
        } else {
            dvhv.a("LiMsgController", "BindV2 ignore stop for ".concat(((dwiq) dwjeVar.c().f()).a));
        }
        map.put(dwjeVar, Integer.valueOf(iIntValue));
    }
}
