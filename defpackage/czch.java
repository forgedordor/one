package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czch extends czci implements ejbz, czcu, czcm, xp {
    public final GifBrowserActivity a;
    public final eosc b;
    public final fcsu c;
    public final ejca d;
    public final ejby e;
    public final fcsu f;
    public final daoe g;
    public final czcl h;
    public czcj i;
    public czck j;
    public RecyclerView k;
    public RecyclerView l;
    public ProgressBar m;
    public iv n;
    public ImageView o;
    public ImageView p;
    public BugleSearchView q;
    public String r;
    public boolean s;
    public String t;
    private final eosc w;
    private final cqbm x;
    public int u = 1;
    private boolean y = true;

    public czch(GifBrowserActivity gifBrowserActivity, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, ejca ejcaVar, ejby ejbyVar, fcsu fcsuVar2, cqbm cqbmVar, daoe daoeVar, czcl czclVar) {
        this.a = gifBrowserActivity;
        this.b = eoscVar;
        this.w = eoscVar2;
        this.c = fcsuVar;
        this.d = ejcaVar;
        this.e = ejbyVar;
        this.f = fcsuVar2;
        this.x = cqbmVar;
        this.g = daoeVar;
        this.h = czclVar;
    }

    public static int c(Configuration configuration) {
        return configuration.orientation == 2 ? 3 : 2;
    }

    private final boolean o(String str) {
        g(true);
        this.t = str;
        if (!TextUtils.isEmpty(str) || !((Boolean) ccze.d.e()).booleanValue()) {
            k(this.t);
            return true;
        }
        f();
        k(null);
        return false;
    }

    @Override // defpackage.xp
    public final void a(String str) {
        BugleSearchView bugleSearchView;
        if (o(str)) {
            this.e.a(str);
        }
        ImageView imageView = this.o;
        if (imageView != null && (bugleSearchView = this.q) != null) {
            imageView.setVisibility(true != TextUtils.isEmpty(bugleSearchView.getQuery().toString()) ? 0 : 8);
        }
        if (this.u != 4 || this.y) {
            this.y = false;
            this.u = 4;
            ((ajhd) this.c.b()).ag(3, this.u, 1);
        }
    }

    @Override // defpackage.xp
    public final void b(String str) {
        if (o(str)) {
            this.e.b(str);
        }
        this.g.e(this.a, this.q);
    }

    public final void d(String str) {
        g(true);
        if (this.q != null) {
            h(true);
        }
        if (TextUtils.isEmpty(str)) {
            f();
        } else {
            this.u = 3;
            this.t = str;
            j();
            this.e.b(str);
        }
        k(str);
    }

    public final void e(emsh emshVar) {
        GifBrowserActivity gifBrowserActivity = this.a;
        gifBrowserActivity.ae(emshVar);
        gifBrowserActivity.finish();
    }

    public final void f() {
        this.u = 2;
        eork.r(this.b.submit(new Callable() { // from class: czby
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqoj cqojVar = (cqoj) this.a.f.b();
                eieu eieuVarK = eiiy.k("GifDatabaseOperations#getRecentGifs");
                try {
                    cqaz.h();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = btfy.a;
                    btft btftVar = new btft(btfy.a);
                    btftVar.A("getRecentGifs");
                    btftVar.k(new btfw((btfx) new Function() { // from class: cqoh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btfx btfxVar = (btfx) obj;
                            btfxVar.ap(new dqpn("recent_gifs.content_uri", 6));
                            return btfxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new btfx())));
                    btftVar.c(new btfq(btfy.b.g, false));
                    btfc btfcVar = (btfc) btftVar.b().p();
                    while (btfcVar.moveToNext()) {
                        try {
                            final btei bteiVar = (btei) btfcVar.cQ();
                            if (bxlf.h(bteiVar.k(), cqojVar.a).exists()) {
                                arrayList.add((btei) btfcVar.cQ());
                            } else {
                                eieu eieuVarK2 = eiiy.k("GifDatabaseOperations#deleteRecentGif");
                                try {
                                    btfm btfmVar = new btfm();
                                    btfmVar.f("deleteRecentGif");
                                    btfmVar.a(new Function() { // from class: cqoe
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            btfx btfxVar = (btfx) obj;
                                            btfxVar.b(bteiVar.m());
                                            return btfxVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    btfmVar.d();
                                    eieuVarK2.close();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                    btfcVar.close();
                    eieuVarK.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), auwc.a(new czcf(this)), this.w);
    }

    public final void g(boolean z) {
        this.m.setVisibility(true != z ? 8 : 0);
    }

    public final void h(boolean z) {
        BugleSearchView bugleSearchView = this.q;
        if (bugleSearchView == null) {
            return;
        }
        bugleSearchView.setOnQueryTextListener(true == z ? null : this);
        if (z) {
            bugleSearchView.setQuery(null, false);
        }
        bugleSearchView.setIconified(z);
    }

    public final void i() {
        d(this.j.a.b(1).b);
        ((ajhd) this.c.b()).ag(6, this.u, n());
    }

    public final void j() {
        if ((((Boolean) ccze.d.e()).booleanValue() && this.u == 2) || ((Boolean) czcz.a.e()).booleanValue()) {
            return;
        }
        eork.r(((cqey) this.x.a()).i(), auwc.a(new czcg(this)), this.w);
    }

    public final boolean k(String str) {
        czck czckVar = this.j;
        Integer num = (Integer) czckVar.a.a.get(ejwk.b(str).toLowerCase(Locale.US));
        int iIntValue = num != null ? num.intValue() : -1;
        int i = czckVar.d;
        if (iIntValue != i) {
            if (i >= 0) {
                czckVar.q(i);
            }
            czckVar.d = iIntValue;
            if (iIntValue >= 0) {
                czckVar.q(iIntValue);
            }
        }
        boolean z = czckVar.d >= 0;
        this.l.aj(this.j.d);
        return z;
    }

    public final int n() {
        czck czckVar = this.j;
        if (czckVar == null || this.u != 3) {
            return 1;
        }
        return czckVar.l();
    }
}
