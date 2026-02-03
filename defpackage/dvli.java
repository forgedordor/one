package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvli implements dvip {
    public final dvyx a;
    public final dwdh f;
    private final Context g;
    private final dvrd i;
    public final Object b = new Object();
    private final Object j = new Object();
    final Map d = new HashMap();
    final Map e = new HashMap();
    private final eosc h = dvie.b().a;
    public final Random c = new Random();

    public dvli(Context context, dvrd dvrdVar, dwdh dwdhVar, dvyx dvyxVar) {
        this.g = context;
        this.i = dvrdVar;
        this.f = dwdhVar;
        this.a = dvyxVar;
    }

    @Override // defpackage.dvip
    public final dwwy a(dwje dwjeVar, dwpk dwpkVar) {
        return e(dwjeVar, dwpkVar, new ejwm() { // from class: dvlg
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dvhn.a();
                return System.currentTimeMillis() > ((dwpf) obj).a();
            }
        });
    }

    @Override // defpackage.dvip
    public final void b(final dwje dwjeVar, final dwpf dwpfVar) {
        if (dwpfVar.g().g()) {
            dvyx dvyxVar = this.a;
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(37);
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.c(dwpfVar.d());
            dvyxVar.b(dwhpVarR.a());
            ListenableFuture listenableFutureSubmit = this.h.submit(new dvjl(this.g, (String) dwpfVar.g().c()));
            dvlh dvlhVar = new dvlh(this, dwjeVar, dwpfVar);
            eoqg eoqgVar = eoqg.a;
            eork.r(listenableFutureSubmit, dvlhVar, eoqgVar);
            eooq.f(listenableFutureSubmit, new ejvr() { // from class: dvlb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dwpf dwpfVarA;
                    dvli dvliVar = this.a;
                    dwpf dwpfVar2 = dwpfVar;
                    dwje dwjeVar2 = dwjeVar;
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        dwpe dwpeVarC = dwpfVar2.c();
                        dwpeVarC.h(false);
                        dwpeVarC.f(bitmap);
                        dwpfVarA = dwpeVarC.a();
                        dvyx dvyxVar2 = dvliVar.a;
                        dwhp dwhpVarR2 = dwhq.r();
                        dwhpVarR2.g(38);
                        dwhpVarR2.n(dwjeVar2.c().f());
                        dwhpVarR2.o(dwjeVar2.d().E());
                        dwhpVarR2.c(dwpfVar2.d());
                        dvyxVar2.b(dwhpVarR2.a());
                    } else {
                        dwpe dwpeVarC2 = dwpfVar2.c();
                        dwpeVarC2.h(true);
                        dwpfVarA = dwpeVarC2.a();
                        dvyx dvyxVar3 = dvliVar.a;
                        dwhp dwhpVarR3 = dwhq.r();
                        dwhpVarR3.g(39);
                        dwhpVarR3.n(dwjeVar2.c().f());
                        dwhpVarR3.o(dwjeVar2.d().E());
                        dwhpVarR3.c(dwpfVar2.d());
                        dvyxVar3.b(dwhpVarR3.a());
                    }
                    dvliVar.d(dwjeVar2).aj(dwpfVarA);
                    return dwpfVarA;
                }
            }, eoqgVar);
        }
    }

    public final dwpf c(final dwje dwjeVar, final dwpk dwpkVar, ejwi ejwiVar, ejwm ejwmVar) {
        final ListenableFuture listenableFutureSubmit;
        if (!ejwiVar.g()) {
            dwpe dwpeVarK = dwpf.k();
            dwpeVarK.c(dwpkVar);
            dwpeVarK.e(-1L);
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            dwpeVarK.j(ekgbVar);
            dwpeVarK.m(ekgbVar);
            ejwiVar = ejwi.j(dwpeVarK.a());
        }
        boolean zA = ejwmVar.a((dwpf) ejwiVar.c());
        dvhv.a("LitContactCtrlr", a.r(zA, "shouldUpdateContact "));
        final dwpf dwpfVar = (dwpf) ejwiVar.c();
        if (zA) {
            synchronized (this.b) {
                Map map = this.d;
                listenableFutureSubmit = (ListenableFuture) map.get(Pair.create(dwjeVar, dwpkVar));
                if (listenableFutureSubmit == null || listenableFutureSubmit.isDone()) {
                    dvhv.a("LitContactCtrlr", "sync contact profile");
                    dvxe dvxeVarC = dvxf.c();
                    ((dvxa) dvxeVarC).a = "sync contact profile";
                    dvxeVarC.b(dvxj.g);
                    final dvxf dvxfVarA = dvxeVarC.a();
                    final ListenableFuture listenableFutureN = eork.n(new eooy() { // from class: dvld
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            dwdh dwdhVar = this.a.f;
                            Context context = dwdhVar.b;
                            dwje dwjeVar2 = dwjeVar;
                            dwpk dwpkVarD = dwpfVar.d();
                            UUID uuidRandomUUID = UUID.randomUUID();
                            dwfj dwfjVar = new dwfj(context, dwjeVar2, dwpkVarD);
                            dwcm dwcmVar = dwdhVar.a;
                            return dwcmVar.b(uuidRandomUUID, dwfjVar, dwcmVar.d.b(), dwjeVar2, dvxfVarA, true);
                        }
                    }, this.h);
                    eorg eorgVarB = eork.b(listenableFutureN);
                    Callable callable = new Callable() { // from class: dvle
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v19, types: [dwpy, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte[] bArr;
                            int length;
                            long jB = fbfm.b();
                            int iC = (int) fbfm.c();
                            dvhv.a("LitContactCtrlr", "maybeApplyUpdateAndSaveSyncedContact called");
                            dvqp dvqpVar = (dvqp) eork.q(listenableFutureN);
                            dvhn.a();
                            dvli dvliVar = this.a;
                            long jCurrentTimeMillis = System.currentTimeMillis() + dvliVar.c.nextInt(iC) + jB;
                            int iB = dvqpVar.b() - 1;
                            dwpf dwpfVar2 = dwpfVar;
                            if (iB != 1) {
                                dvhv.e("LitContactCtrlr", "contact profile is not supported.");
                                dwpe dwpeVarC = dwpfVar2.c();
                                dwpeVarC.e(jCurrentTimeMillis);
                                return dwpeVarC.a();
                            }
                            dvhv.a("LitContactCtrlr", "Got contact profile");
                            if (!dvqpVar.a().g()) {
                                dvhv.c("LitContactCtrlr", "Got empty contact profile.");
                                return dwpfVar2;
                            }
                            final dwpe dwpeVarK2 = dwpf.k();
                            dwpeVarK2.c(dwpfVar2.d());
                            dwpeVarK2.k(((dwac) dvqpVar.a().c()).a);
                            dwpeVarK2.e(jCurrentTimeMillis);
                            dwpeVarK2.j(((dwac) dvqpVar.a().c()).f);
                            dwpeVarK2.m(((dwac) dvqpVar.a().c()).g);
                            if (((dwac) dvqpVar.a().c()).b.g()) {
                                dwpeVarK2.b((String) ((dwac) dvqpVar.a().c()).b.c());
                            }
                            if (((dwac) dvqpVar.a().c()).h.g()) {
                                dwpeVarK2.i((dwqj) ((dwac) dvqpVar.a().c()).h.c());
                            }
                            if (((dwac) dvqpVar.a().c()).c.g()) {
                                dwpeVarK2.g((String) ((dwac) dvqpVar.a().c()).c.c());
                                dvhx.b(dwpfVar2.f(), new lbz() { // from class: dvkz
                                    @Override // defpackage.lbz
                                    public final void accept(Object obj) {
                                        dwpeVarK2.f((Bitmap) obj);
                                    }
                                });
                                if (!dwpfVar2.g().equals(((dwac) dvqpVar.a().c()).c)) {
                                    dwpeVarK2.h(true);
                                }
                            } else if (((dwac) dvqpVar.a().c()).d.g() && (length = (bArr = (byte[]) ((dwac) dvqpVar.a().c()).d.c()).length) > 0) {
                                dwpeVarK2.f(BitmapFactory.decodeByteArray(bArr, 0, length));
                            }
                            ejwi ejwiVar2 = ((dwac) dvqpVar.a().c()).i;
                            if (ejwiVar2.g()) {
                                dwpeVarK2.d(ejwiVar2.c());
                            }
                            dwje dwjeVar2 = dwjeVar;
                            dwpf dwpfVarA = dwpeVarK2.a();
                            dvliVar.d(dwjeVar2).aj(dwpfVarA);
                            return dwpfVarA;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    listenableFutureSubmit = eooq.f(eorgVarB.a(callable, eoqgVar), new ejvr() { // from class: dvlf
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dwpf dwpfVar2 = (dwpf) obj;
                            if (dwpfVar.g().equals(dwpfVar2.g()) && dwpfVar2.f().g()) {
                                return dwpfVar2;
                            }
                            this.a.b(dwjeVar, dwpfVar2);
                            return dwpfVar2;
                        }
                    }, eoqgVar);
                    map.put(Pair.create(dwjeVar, dwpkVar), listenableFutureSubmit);
                } else {
                    dvhv.a("LitContactCtrlr", "ContactSync already pending for contact");
                }
            }
        } else {
            listenableFutureSubmit = null;
            if (dwpfVar.j() && dwpfVar.g().g()) {
                dvhv.a("LitContactCtrlr", "refetch profile image");
                synchronized (this.j) {
                    Map map2 = this.e;
                    listenableFutureSubmit = (ListenableFuture) map2.get(Pair.create(dwjeVar, dwpfVar.d()));
                    if (listenableFutureSubmit == null || listenableFutureSubmit.isDone() || listenableFutureSubmit.isCancelled()) {
                        listenableFutureSubmit = this.h.submit(new Callable() { // from class: dvky
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dvli dvliVar = this.a;
                                dwje dwjeVar2 = dwjeVar;
                                dwpf dwpfVar2 = dwpfVar;
                                dvliVar.b(dwjeVar2, dwpfVar2);
                                return dwpfVar2;
                            }
                        });
                        map2.put(Pair.create(dwjeVar, dwpfVar.d()), listenableFutureSubmit);
                    } else {
                        dvhv.a("LitContactCtrlr", "contactSync or contactImageFetch already pending for contact");
                    }
                }
            }
        }
        if (listenableFutureSubmit != null) {
            this.h.submit(new Runnable() { // from class: dvkx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    dwje dwjeVar2 = dwjeVar;
                    dvli dvliVar = this.a;
                    ListenableFuture listenableFuture = listenableFutureSubmit;
                    dwpk dwpkVar2 = dwpkVar;
                    try {
                        synchronized (dvliVar.b) {
                            dvliVar.d.remove(Pair.create(dwjeVar2, dwpkVar2));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        dvhv.d("LitContactCtrlr", "Failed to sync contact profile", e);
                    }
                }
            });
        }
        return dwpfVar;
    }

    public final dwws d(dwje dwjeVar) {
        return this.i.b(dwjeVar);
    }

    public final dwwy e(final dwje dwjeVar, final dwpk dwpkVar, final ejwm ejwmVar) {
        dvhv.a("LitContactCtrlr", "getContactAndMaybeSync called");
        return dwwr.d(d(dwjeVar).p(dwpkVar), new ejvr() { // from class: dvkw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.c(dwjeVar, dwpkVar, (ejwi) obj, ejwmVar);
            }
        });
    }
}
