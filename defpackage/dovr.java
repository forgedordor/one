package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovr implements dpxr {
    public static final /* synthetic */ fdeh[] a;
    private fdlr E;
    public final Activity b;
    public final fdjx c;
    public final fdjx d;
    public final dpir e;
    public final dotu f;
    public final fdae g;
    public final dotc h;
    public final boolean i;
    public final boolean j;
    public boolean m;
    public boolean n;
    public final fdcz o;
    private final fdjx p;
    private final Optional q;
    private final boolean r;
    private final fctc u;
    public final dovi k = new dovi(this);
    private final dovj s = new dovj(this);
    private final TextView.OnEditorActionListener t = new TextView.OnEditorActionListener() { // from class: doux
        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            dpxz dpxzVarD;
            if (i != 3) {
                return false;
            }
            dovr dovrVar = this.a;
            EditText editText = dovrVar.h.h;
            Editable text = editText.getText();
            text.getClass();
            Boolean bool = null;
            if (true == fdgn.H(text)) {
                text = null;
            }
            if (text == null) {
                return false;
            }
            dpyb dpybVarD = dovrVar.d();
            if (dpybVarD != null && (dpxzVarD = dpybVarD.d()) != null) {
                dovrVar.e.g(editText, false);
                dovrVar.i();
                dovrVar.n(dpxzVarD, text);
                bool = true;
            }
            if (bool == null) {
                return false;
            }
            bool.booleanValue();
            return true;
        }
    };
    private final fctc v = fctd.a(new fdae() { // from class: douz
        @Override // defpackage.fdae
        public final Object invoke() {
            return this.a.b.getString(R.string.search_icon_content_description);
        }
    });
    private final fctc w = fctd.a(new fdae() { // from class: dova
        @Override // defpackage.fdae
        public final Object invoke() {
            return this.a.b.getString(R.string.search_back_icon_content_description);
        }
    });
    private final fctc x = fctd.a(new fdae() { // from class: dovb
        @Override // defpackage.fdae
        public final Object invoke() {
            Drawable drawable = this.a.b.getDrawable(R.drawable.quantum_gm_ic_search_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final fctc y = fctd.a(new fdae() { // from class: dovc
        @Override // defpackage.fdae
        public final Object invoke() {
            Drawable drawable = this.a.b.getDrawable(R.drawable.quantum_ic_arrow_back_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final fctc z = fctd.a(new fdae() { // from class: dovd
        @Override // defpackage.fdae
        public final Object invoke() {
            Drawable drawable = this.a.b.getDrawable(R.drawable.quantum_ic_arrow_forward_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    private final fctc A = fctd.a(new fdae() { // from class: dove
        @Override // defpackage.fdae
        public final Object invoke() {
            Drawable drawable = this.a.b.getDrawable(R.drawable.quantum_ic_close_vd_theme_24);
            drawable.getClass();
            return drawable;
        }
    });
    public final fctc l = fctd.a(new fdae() { // from class: dovf
        @Override // defpackage.fdae
        public final Object invoke() throws Resources.NotFoundException {
            final dovr dovrVar = this.a;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(dovrVar.b, R.anim.panel_appearance);
            animationLoadAnimation.getClass();
            animationLoadAnimation.setAnimationListener(new dpck(new fdap() { // from class: douq
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((Animation) obj).getClass();
                    dovrVar.h.n.setVisibility(0);
                    return fctx.a;
                }
            }, null, 6));
            return animationLoadAnimation;
        }
    });
    private final fctc B = fctd.a(new fdae() { // from class: dour
        @Override // defpackage.fdae
        public final Object invoke() throws Resources.NotFoundException {
            final dovr dovrVar = this.a;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(dovrVar.b, R.anim.panel_disappearance);
            animationLoadAnimation.getClass();
            animationLoadAnimation.setAnimationListener(new dpck(null, new fdap() { // from class: dous
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((Animation) obj).getClass();
                    dovrVar.h.n.setVisibility(8);
                    return fctx.a;
                }
            }, 5));
            return animationLoadAnimation;
        }
    });
    private final fdcz C = new dovm(dovh.a, this);
    private final fdcz D = new dovn(dovg.a, this);

    static {
        fdbv fdbvVar = new fdbv(dovr.class, "startIconState", "getStartIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$StartIconState;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dovr.class, "endIconState", "getEndIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$EndIconState;", 0), new fdbv(dovr.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0)};
    }

    public dovr(Activity activity, fdjx fdjxVar, fdjx fdjxVar2, fdjx fdjxVar3, dpir dpirVar, Optional optional, final dowi dowiVar, Optional optional2, dotu dotuVar, fdae fdaeVar, dotc dotcVar, boolean z, boolean z2) {
        this.b = activity;
        this.p = fdjxVar;
        this.c = fdjxVar2;
        this.d = fdjxVar3;
        this.e = dpirVar;
        this.q = optional;
        this.f = dotuVar;
        this.g = fdaeVar;
        this.h = dotcVar;
        this.i = z;
        this.r = z2;
        this.j = ((Boolean) fdct.a(optional2, false)).booleanValue();
        this.u = fctd.a(new fdae() { // from class: douy
            @Override // defpackage.fdae
            public final Object invoke() {
                dovr dovrVar = this;
                dovk dovkVar = new dovk(dovrVar);
                dovl dovlVar = new dovl(dovrVar);
                dowi dowiVar2 = dowiVar;
                dpzn dpznVar = (dpzn) dowiVar2.a.b();
                dngc dngcVar = (dngc) dowiVar2.b.b();
                dngcVar.getClass();
                return new dowh(dpznVar, dngcVar, dovkVar, dovlVar);
            }
        });
        l(a());
        k(u());
        this.o = new dovo(this);
    }

    static /* synthetic */ void t(dovr dovrVar, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = dovrVar.h.h.getText();
        }
        if ((i & 2) != 0) {
            z = dovrVar.h.h.hasFocus();
        }
        dovrVar.p((charSequence.length() <= 0 && !z) ? dovh.a : dovh.b);
        dovrVar.D.d(a[1], charSequence.length() > 0 ? dovg.b : dovg.a);
    }

    private final dovg u() {
        return (dovg) this.D.c(a[1]);
    }

    private final void v() {
        final EditText editText = this.h.h;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: douv
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                dpyb dpybVarAV;
                fdap fdapVarE;
                dovr dovrVar = this.a;
                if (z) {
                    dpxo dpxoVarC = dovrVar.c();
                    if (dpxoVarC != null) {
                        dpxo.bR(dpxoVarC);
                    }
                    ((dpuq) ((fdbs) dovrVar.g).a()).c(dpuv.b);
                    dovrVar.e.h(dovrVar.h.h, true);
                    dpyb dpybVarD = dovrVar.d();
                    if (dpybVarD != null) {
                        Editable text = editText.getText();
                        text.getClass();
                        dovrVar.r(dpybVarD, text);
                    }
                } else {
                    ((dpuq) ((fdbs) dovrVar.g).a()).c(dpuv.a);
                    dovrVar.i();
                }
                dovr.t(dovrVar, null, z, 1);
                dpxo dpxoVarC2 = dovrVar.c();
                dpxs dpxsVar = dpxoVarC2 instanceof dpxs ? (dpxs) dpxoVarC2 : null;
                if (dpxsVar == null || (dpybVarAV = dpxsVar.aV()) == null || (fdapVarE = dpybVarAV.e()) == null) {
                    return;
                }
                fdapVarE.invoke(Boolean.valueOf(z));
            }
        });
        editText.addTextChangedListener(this.s);
        editText.setOnEditorActionListener(this.t);
        this.n = true;
    }

    private final void w(boolean z) {
        dotc dotcVar = this.h;
        ComposeView composeView = dotcVar.i;
        if ((composeView == null || composeView.getVisibility() != 0) && !((Boolean) fdct.a(this.q, false)).booleanValue()) {
            dotcVar.g.setVisibility(true != z ? 4 : 0);
        } else {
            dotcVar.g.setVisibility(0);
            dotcVar.h.setVisibility(true != z ? 8 : 0);
            dotcVar.f.setVisibility((!z || u() == dovg.a) ? 8 : 0);
        }
        dotcVar.e.setVisibility(true == z ? 0 : 8);
    }

    public final dovh a() {
        return (dovh) this.C.c(a[0]);
    }

    public final dowh b() {
        return (dowh) this.u.a();
    }

    public final dpxo c() {
        return (dpxo) this.o.c(a[2]);
    }

    public final dpyb d() {
        dpxo dpxoVarC = c();
        if (dpxoVarC == null) {
            return null;
        }
        if (dpxoVarC instanceof dpxs) {
            return ((dpxs) dpxoVarC).aV();
        }
        throw new IllegalStateException(a.h(dpxoVarC, "Active screen ", " is not searchable"));
    }

    public final void e() {
        if (this.n) {
            return;
        }
        v();
        l(dovh.a);
    }

    public final void f(boolean z) {
        EditText editText = this.h.h;
        if (z) {
            editText.clearFocus();
        }
        editText.getText().clear();
    }

    public final void g() {
        this.f.b.a(true);
        EditText editText = this.h.h;
        editText.getText().clear();
        this.e.g(editText, true);
        dpyb dpybVarD = d();
        if (dpybVarD != null) {
            h(dpybVarD);
        }
    }

    public final void h(dpyb dpybVar) {
        p(dovh.a);
        i();
        dpxz dpxzVarD = dpybVar.d();
        if (dpxzVarD != null) {
            dpxzVarD.a();
        }
    }

    public final void i() {
        RecyclerView recyclerView = this.h.n;
        if (recyclerView.getVisibility() == 0) {
            recyclerView.startAnimation((Animation) this.B.a());
        }
    }

    public final void j(dpxo dpxoVar) {
        dpyb dpybVarAV = null;
        if (dpxoVar != null && (dpxoVar instanceof dpxs)) {
            dpybVarAV = ((dpxs) dpxoVar).aV();
        }
        if (dpybVarAV == null) {
            w(false);
            if (this.r && this.n) {
                q();
                return;
            }
            return;
        }
        EditText editText = this.h.h;
        editText.setHint(editText.getResources().getString(dpybVarAV.a()));
        dpybVarAV.f();
        w(true);
        if (!this.r || this.n) {
            return;
        }
        v();
    }

    public final void k(dovg dovgVar) {
        int i;
        AppCompatImageView appCompatImageView = this.h.f;
        int iOrdinal = dovgVar.ordinal();
        if (iOrdinal == 0) {
            i = 8;
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            appCompatImageView.setImageDrawable((Drawable) this.A.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: douw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dovr dovrVar = this.a;
                    dovrVar.f(false);
                    dovrVar.h.h.requestFocus();
                }
            });
            i = 0;
        }
        appCompatImageView.setVisibility(i);
    }

    public final void l(dovh dovhVar) {
        AppCompatImageView appCompatImageView = this.h.e;
        int iOrdinal = dovhVar.ordinal();
        if (iOrdinal == 0) {
            appCompatImageView.setImageDrawable((Drawable) this.x.a());
            appCompatImageView.setContentDescription((String) this.v.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: douu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dovr dovrVar = this.a;
                    dovrVar.f.b.a(true);
                    dovrVar.h.h.requestFocus();
                }
            });
        } else {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            appCompatImageView.setImageDrawable(dphw.g(appCompatImageView) ? (Drawable) this.z.a() : (Drawable) this.y.a());
            appCompatImageView.setContentDescription((String) this.w.a());
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: dout
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.g();
                }
            });
        }
    }

    @Override // defpackage.dpxr
    public final void m(String str) {
        dpir dpirVar = this.e;
        if (dpirVar.f() == dpjd.a) {
            dpirVar.g(this.h.h, true);
        }
        o(str);
        this.f.b.a(true);
        i();
    }

    public final void n(dpxz dpxzVar, CharSequence charSequence) {
        dpxzVar.c(charSequence.toString());
        p(dovh.b);
    }

    public final void o(String str) {
        EditText editText = this.h.h;
        editText.setText(str.concat(" "));
        editText.setSelection(editText.length());
    }

    public final void p(dovh dovhVar) {
        this.C.d(a[0], dovhVar);
    }

    public final void q() {
        EditText editText = this.h.h;
        editText.setOnFocusChangeListener(null);
        editText.removeTextChangedListener(this.s);
        editText.setOnEditorActionListener(null);
        this.n = false;
    }

    public final void r(dpyb dpybVar, CharSequence charSequence) {
        fdlr fdlrVar = this.E;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.E = fdil.d(this.p, null, null, new dovq(this, charSequence, dpybVar, null), 3);
    }
}
