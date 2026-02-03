package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import defpackage.a;
import defpackage.ahib;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.cyuv;
import defpackage.cyuw;
import defpackage.cyuy;
import defpackage.cyuz;
import defpackage.dakl;
import defpackage.ea;
import defpackage.ecem;
import defpackage.ehlc;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehns;
import defpackage.ehnv;
import defpackage.ehnw;
import defpackage.ehnz;
import defpackage.ehog;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifl;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiik;
import defpackage.eiiy;
import defpackage.eyhj;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.eyig;
import defpackage.lvc;
import defpackage.lvn;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Compose2oFragment extends cyuz implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private cyuw d;
    private Context e;

    @Deprecated
    public Compose2oFragment() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cyuw.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cyuw cyuwVarH = H();
            cyuwVarH.a = (CoordinatorLayout) layoutInflater.inflate(R.layout.compose2o_grid_view_m2, viewGroup, false);
            cyuwVarH.b = cyuwVarH.a.findViewById(R.id.compose2o_shadow);
            cyuwVarH.c = (ContentGridView) cyuwVarH.a.findViewById(R.id.c2o_content_grid);
            cyuwVarH.c.y(new cyuv(cyuwVarH));
            cyuwVarH.e.z();
            cyuwVarH.c.ao(new ContentGridLayoutManager());
            cyuy cyuyVar = cyuwVarH.c.ab;
            cyuwVarH.a();
            cyuwVarH.a.setVisibility(8);
            cyuwVarH.a.setSystemUiVisibility(1280);
            cyuwVarH.a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: cyut
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(0, 0, 0, 0);
                    return windowInsets;
                }
            });
            cyuwVarH.c.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: cyuu
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int systemWindowInsetBottom = windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0;
                    Compose2oFragment compose2oFragment = cyuwVarH.e;
                    view.setPadding(0, compose2oFragment.B().getDimensionPixelSize(R.dimen.c2o_padding_top), 0, compose2oFragment.B().getDimensionPixelSize(R.dimen.c2o_padding_bottom) + systemWindowInsetBottom);
                    return windowInsets;
                }
            });
            CoordinatorLayout coordinatorLayout = cyuwVarH.a;
            eidc.q();
            return coordinatorLayout;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cyuw H() {
        cyuw cyuwVar = this.d;
        if (cyuwVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyuwVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.c.f();
        try {
            aW(i, i2, intent);
            H();
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyuz, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.c.b();
        try {
            aY();
            H();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            be();
            H();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            H();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyuz
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.cyuz, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/c2o/Compose2oFragment", 86, Compose2oFragment.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/c2o/Compose2oFragment", 91, Compose2oFragment.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahng ahngVar = ahknVar.b;
                            Optional.of((Class) ahngVar.oK.b());
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof Compose2oFragment)) {
                                throw new IllegalStateException(a.M(eaVar, cyuw.class));
                            }
                            ahnh ahnhVar = ahknVar.a;
                            this.d = new cyuw((Compose2oFragment) eaVar, (dakl) ahnhVar.BK.b());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } catch (Throwable th3) {
            try {
                eidc.q();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            H();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bk(bundle);
            H();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            H();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bm();
            H();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cyuw cyuwVarH = H();
        if (!(cyuwVarH.d && configuration.orientation == 1) && (cyuwVarH.d || configuration.orientation != 2)) {
            return;
        }
        cyuwVarH.a();
    }

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        H();
    }

    @Override // defpackage.cyuz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
