package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaMetadataRetriever;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drqt implements AutoCloseable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController");
    public float A;
    public final drqr B;
    public final int C;
    private final eosc D;
    private final int E;
    private final drrr F;
    private final drtj G;
    private final View.OnClickListener H;
    public final Context b;
    public final drqr c;
    public final drrl d;
    public final boolean e;
    public final boolean f;
    public final ekgb g;
    public final AtomicReference h;
    public final ekgb i;
    public final Optional j;
    public final droc k;
    public final droa l;
    public final AtomicBoolean m;
    public final boolean n;
    public final Optional o;
    public final Optional p;
    public int q;
    public int r;
    public final drrs s;
    public final drsj t;
    public boolean u;
    public boolean v;
    public final RecyclerView w;
    public final EmojiPickerBodyRecyclerView x;
    public drrb y;
    public drpv z;

    static {
        ejxk.b(',');
    }

    public drqt(RecyclerView recyclerView, EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, drqr drqrVar, drrl drrlVar, drqx drqxVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.m = new AtomicBoolean(false);
        this.q = -1;
        this.r = 1;
        this.A = 1.0f;
        drqm drqmVar = new drqm(this);
        this.B = drqmVar;
        this.G = new drqn(this);
        this.H = new View.OnClickListener() { // from class: drqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                druo.a(view.getContext()).d(view);
                if (!(view instanceof CustomImageView)) {
                    ((ekrd) ((ekrd) drqt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "<init>", 312, "EmojiPickerController.java")).t("Clicked view is not CustomImageView: %s", view);
                    return;
                }
                drqt drqtVar = this.a;
                drtm drtmVar = ((CustomImageView) view).a;
                ekgb ekgbVar = ((drqm) drqtVar.B).a.g;
                if (((ekoe) ekgbVar).c <= 0) {
                    return;
                }
                throw null;
            }
        };
        if (drrlVar.a() < 0.0f && drrlVar.g() == 0) {
            throw new IllegalArgumentException("Must provide either row count or row height.");
        }
        if (((drrlVar.a() <= 0.0f || drrlVar.f() != 0) ? drrlVar.f() : ((int) Math.ceil(drrlVar.a())) * drrlVar.c()) <= 0) {
            throw new IllegalArgumentException("Invalid pool size.");
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(emojiPickerBodyRecyclerView.getContext(), R.style.EmojiPicker);
        this.b = contextThemeWrapper;
        this.c = drqrVar;
        this.d = drrlVar;
        this.w = recyclerView;
        this.x = emojiPickerBodyRecyclerView;
        drqxVar.d();
        this.D = drqxVar.d();
        this.o = drqxVar.e();
        this.p = drqxVar.f();
        drqxVar.h();
        this.n = true;
        drrlVar.o();
        this.E = (drrlVar.a() <= 0.0f || drrlVar.d() != 0) ? drrlVar.d() : ((int) Math.floor(drrlVar.a())) * drrlVar.c();
        drrlVar.p();
        this.e = drrlVar.i();
        drqxVar.i();
        this.f = true;
        drqxVar.a();
        drob drobVarA = drqxVar.a();
        this.k = drobVarA;
        this.l = drobVarA.a();
        drrlVar.u();
        boolean zK = drrlVar.k();
        drrlVar.v();
        drrj drrjVar = new drrj(contextThemeWrapper, zK);
        this.s = drrjVar;
        drrjVar.c = new View.OnClickListener() { // from class: drqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                drti drtiVar = ((EmojiView) view).c;
                drqt drqtVar = ((drqm) this.a.B).a;
                boolean z = false;
                if (drqtVar.n) {
                    ekgb ekgbVar = drqtVar.g;
                    for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
                        ((dros) ekgbVar.get(i)).d(drsy.a(drtiVar.b));
                    }
                }
                if (drqtVar.f && drqtVar.k.d(drtiVar.b)) {
                    z = true;
                }
                drpv drpvVar = drqtVar.z;
                if (drpvVar != null) {
                    drpvVar.I(drtiVar, z);
                }
                drqr drqrVar2 = drqtVar.c;
                if (drqrVar2 != null) {
                    drqrVar2.b(drtiVar);
                }
                drqtVar.s.b();
            }
        };
        this.t = drsl.instance.j;
        ekgb ekgbVarC = drqxVar.c();
        if (ekgbVarC == null || ekgbVarC.isEmpty()) {
            drqxVar.b();
            ekgbVarC = ekgb.r(new drpa(contextThemeWrapper, new drqd(emojiPickerBodyRecyclerView)));
        }
        this.g = ekgbVarC;
        atomicReference.set((dros) ekgbVarC.get(0));
        final ekfw ekfwVar = new ekfw();
        Optional optionalG = drqxVar.g();
        this.j = optionalG;
        optionalG.ifPresent(new Consumer() { // from class: drqj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekfwVar.h((drsd) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.i = ekfwVar.g();
        drqxVar.j();
        drqxVar.b();
        int iC = drrlVar.c();
        int iC2 = drrlVar.c();
        int iF = drrlVar.f();
        wi wiVar = new wi();
        wiVar.f(drpb.a, iC2);
        wiVar.f(drrn.a, iF);
        drpc drpcVar = new drpc(iC, wiVar, drqmVar);
        emojiPickerBodyRecyclerView.getContext();
        EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(drpcVar.a);
        emojiPickerLayoutManager.g = new drpw(emojiPickerBodyRecyclerView, drpcVar);
        emojiPickerBodyRecyclerView.ao(emojiPickerLayoutManager);
        emojiPickerBodyRecyclerView.am(null);
        emojiPickerBodyRecyclerView.ap(drpcVar.b);
        emojiPickerBodyRecyclerView.an(0);
        emojiPickerBodyRecyclerView.G = null;
        emojiPickerBodyRecyclerView.ac = new drpx(drpcVar.c);
        emojiPickerBodyRecyclerView.y(emojiPickerBodyRecyclerView.ac);
        emojiPickerBodyRecyclerView.ak(new drqs(this, emojiPickerBodyRecyclerView));
        drrlVar.r();
        this.C = 1;
        drrlVar.q();
        recyclerView.ao(new LinearLayoutManager(0));
        recyclerView.ak(new drqs(this, recyclerView));
        for (int i = 0; i < recyclerView.e(); i++) {
            recyclerView.ae(i);
        }
        drrr drrrVar = new drrr(drrlVar);
        this.F = drrrVar;
        if (this.C == 1) {
            recyclerView.v(drrrVar);
        }
    }

    public static final int g(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final dros a() {
        ekgb ekgbVar = this.g;
        if (ekgbVar.isEmpty()) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "findNextEmojiProvider", 1113, "EmojiPickerController.java")).q("No recent emoji providers available. ");
            return null;
        }
        int i = ((ekoe) ekgbVar).c;
        if (i == 1) {
            return null;
        }
        return (dros) ekgbVar.get((ekgbVar.indexOf(this.h.get()) + 1) % i);
    }

    public final void b() throws Exception {
        drrs drrsVar = this.s;
        if (drrsVar != null) {
            drrsVar.a();
        }
        RecyclerView recyclerView = this.w;
        recyclerView.al(null);
        this.y = null;
        while (recyclerView.e() > 0) {
            recyclerView.ae(0);
        }
        recyclerView.ao(null);
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.x;
        emojiPickerBodyRecyclerView.C();
        emojiPickerBodyRecyclerView.ac = null;
        emojiPickerBodyRecyclerView.al(null);
        while (emojiPickerBodyRecyclerView.e() > 0) {
            emojiPickerBodyRecyclerView.ae(0);
        }
        this.z = null;
        try {
            ekqh it = this.g.iterator();
            while (it.hasNext()) {
                AutoCloseable autoCloseable = (dros) it.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !executorService.isTerminated()) {
                        executorService.shutdown();
                        boolean zAwaitTermination = false;
                        boolean z = false;
                        while (!zAwaitTermination) {
                            try {
                                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        throw new IllegalArgumentException();
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
            this.j.isPresent();
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onDeactivate", (char) 593, "EmojiPickerController.java")).q("error when closing RecentItemProvider or ItemProvider");
        }
    }

    public final void c(drrc drrcVar) {
        drrb drrbVar = this.y;
        if (drrbVar != null) {
            drrbVar.a = drrcVar;
            drrbVar.p();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        b();
    }

    public final void d() {
        if (this.z == null) {
            return;
        }
        eork.r(drsa.c(this.l, (dros) this.h.get(), this.t, this.E, this.e, this.o), new drqo(this), drlv.b);
    }

    public final void e(int i, int i2) {
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.x;
        if (emojiPickerBodyRecyclerView != null) {
            if (i < 0) {
                ((ekrd) EmojiPickerBodyRecyclerView.ab.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 136, "EmojiPickerBodyRecyclerView.java")).r("Invalid categoryIndex: %s", i);
            } else {
                vo voVar = emojiPickerBodyRecyclerView.n;
                boolean z = voVar instanceof drpv;
                wb wbVar = emojiPickerBodyRecyclerView.o;
                if (z && (wbVar instanceof GridLayoutManager)) {
                    drpv drpvVar = (drpv) voVar;
                    if (i >= drpvVar.H()) {
                        ((ekrd) EmojiPickerBodyRecyclerView.ab.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 145, "EmojiPickerBodyRecyclerView.java")).u("Invalid categoryIndex: %s out of %s", i, drpvVar.H());
                    } else {
                        ((GridLayoutManager) wbVar).ab(drpvVar.G(i), 0);
                        emojiPickerBodyRecyclerView.ad = i;
                    }
                }
            }
        }
        this.B.c(i, i2);
    }

    public final drpv f() {
        drpv drpvVar = this.z;
        if (drpvVar != null) {
            return drpvVar;
        }
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "getBodyAdapter", 719, "EmojiPickerController.java")).q("getBodyAdapter(), loading emojis. ");
        Context context = this.b;
        drrl drrlVar = this.d;
        ekgb ekgbVar = this.i;
        drrlVar.x();
        ekfw ekfwVar = new ekfw();
        int[] iArr = drmh.b;
        for (int i = 0; i < 10; i++) {
            ekfwVar.h(context.getString(iArr[i]));
        }
        int i2 = ((ekoe) ekgbVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ekfwVar.h(((droy) ekgbVar.get(i3)).c());
        }
        ekgb ekgbVarG = ekfwVar.g();
        drtj drtjVar = this.G;
        droc drocVar = this.k;
        droa droaVar = this.l;
        this.j.isPresent();
        drpv drpvVar2 = new drpv(context, drrlVar, ekgbVarG, drtjVar, drocVar, droaVar, new ejxr() { // from class: drpy
            @Override // defpackage.ejxr
            public final Object get() {
                dros drosVar = (dros) this.a.h.get();
                if (drosVar != null) {
                    return drosVar.c();
                }
                return null;
            }
        }, new ejxr() { // from class: drpz
            @Override // defpackage.ejxr
            public final Object get() {
                dros drosVarA = this.a.a();
                if (drosVarA != null) {
                    return drosVarA.c();
                }
                return null;
            }
        }, new Runnable() { // from class: drqa
            @Override // java.lang.Runnable
            public final void run() {
                final drqt drqtVar = this.a;
                drqtVar.j.ifPresent(new Consumer() { // from class: drqk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        drqt drqtVar2 = drqtVar;
                        AtomicBoolean atomicBoolean = drqtVar2.m;
                        drsd drsdVar = (drsd) obj;
                        int i4 = drqtVar2.r;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            eork.r(drsdVar.e(), new drqq(drqtVar2, drsdVar, i4), drlv.b);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, new Runnable() { // from class: drqb
            @Override // java.lang.Runnable
            public final void run() {
                drqt drqtVar = this.a;
                dros drosVarA = drqtVar.a();
                if (drosVarA == null) {
                    ((ekrd) ((ekrd) drqt.a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onSwitchRecentCategory", 1087, "EmojiPickerController.java")).q("next emoji provider is not available. ");
                } else {
                    drqtVar.h.set(drosVarA);
                    drqtVar.d();
                }
            }
        }, this.H);
        drpvVar2.B(true);
        this.v = true;
        drmh drmhVar = drmh.c;
        if (drmhVar == null) {
            synchronized (drmh.class) {
                drmhVar = drmh.c;
                if (drmhVar == null) {
                    drmhVar = new drmh();
                    drmh.c = drmhVar;
                }
            }
        }
        Context context2 = this.b;
        eosc eoscVar = this.D;
        drsj drsjVar = this.t;
        droa droaVar2 = this.l;
        AtomicReference atomicReference = this.h;
        ListenableFuture listenableFutureB = drmhVar.b(context2, eoscVar, drsjVar);
        ListenableFuture listenableFutureC = drsa.c(droaVar2, (dros) atomicReference.get(), drsjVar, this.E, this.e, this.o);
        boolean z = this.f;
        ListenableFuture listenableFutureB2 = eorv.a;
        if (z) {
            listenableFutureB2 = this.k.b();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureB);
        arrayList.add(listenableFutureC);
        arrayList.add(listenableFutureB2);
        eorg eorgVarA = eork.a(arrayList);
        Callable callable = new Callable() { // from class: drqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekrg ekrgVar = drqt.a;
                return null;
            }
        };
        drlv drlvVar = drlv.b;
        eork.r(eorgVarA.a(callable, drlvVar), new drqp(this, listenableFutureB, listenableFutureC, drpvVar2), drlvVar);
        this.z = drpvVar2;
        return drpvVar2;
    }
}
