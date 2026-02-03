package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import defpackage.aao;
import defpackage.eehg;
import defpackage.eejp;
import defpackage.eelg;
import defpackage.eemh;
import defpackage.eemj;
import defpackage.eemm;
import defpackage.eemo;
import defpackage.eemt;
import defpackage.eemy;
import defpackage.eene;
import defpackage.eeqg;
import defpackage.eeqx;
import defpackage.eeqz;
import defpackage.eera;
import defpackage.eerp;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eexh;
import defpackage.ktx;
import defpackage.kty;
import defpackage.ku;
import defpackage.kw;
import defpackage.kzs;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SearchView extends FrameLayout implements ktx, eemt {
    private Map A;
    private int B;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final LinearLayout j;
    public final EditText k;
    public final ImageButton l;
    public final View m;
    public final TouchObserverFrameLayout n;
    public SearchBar o;
    public boolean p;
    public boolean q;
    private final boolean r;
    private final eerp s;
    private final eemy t;
    private final boolean u;
    private final eejp v;
    private final Set w;
    private int x;
    private boolean y;
    private final int z;

    /* compiled from: PG */
    public static class Behavior extends kty<SearchView> {
        public Behavior() {
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            SearchView searchView = (SearchView) view;
            if (searchView.o == null && (view2 instanceof SearchBar)) {
                searchView.k((SearchBar) view2);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private final void o() throws Resources.NotFoundException {
        float dimension;
        SearchBar searchBar = this.o;
        if (searchBar != null) {
            eesc eescVar = searchBar.K;
            dimension = eescVar != null ? eescVar.v() : searchBar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        p(dimension);
    }

    private final void p(float f) {
        View view;
        eejp eejpVar = this.v;
        if (eejpVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(eejpVar.b(this.z, f));
    }

    private final void q(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    q((ViewGroup) childAt, z);
                } else if (z) {
                    this.A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.A;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.A.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void r() {
        ImageButton imageButtonB = eemj.b(this.g);
        if (imageButtonB == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableA = kzs.a(imageButtonB.getDrawable());
        if (drawableA instanceof kw) {
            ((kw) drawableA).setProgress(i);
        }
        if (drawableA instanceof eelg) {
            ((eelg) drawableA).a(i);
        }
    }

    private final boolean s() {
        int i = this.B;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void t(int i, boolean z) {
        int i2 = this.B;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == i) {
            return;
        }
        if (z) {
            v(i);
        }
        this.B = i;
        Iterator it = new LinkedHashSet(this.w).iterator();
        while (it.hasNext()) {
            ((eera) it.next()).a();
        }
        u(i);
        SearchBar searchBar = this.o;
        if (searchBar == null || i != 2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private final void u(int i) {
        if (this.o == null || !this.u) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.t.a();
        } else if (i == 2) {
            this.t.b();
        }
    }

    private final void v(int i) {
        if (i == 4) {
            h(true);
        } else if (i == 2) {
            h(false);
        }
    }

    @Override // defpackage.eemt
    public final void G(aao aaoVar) {
        SearchBar searchBar;
        if (s() || (searchBar = this.o) == null) {
            return;
        }
        searchBar.K(this.k.getText().toString());
        eerp eerpVar = this.s;
        SearchBar searchBar2 = eerpVar.g;
        eene eeneVar = eerpVar.e;
        eeneVar.e = aaoVar;
        float f = aaoVar.a;
        View view = eeneVar.a;
        eeneVar.g = eemo.e(view);
        if (searchBar2 != null) {
            eeneVar.h = eemo.d(view, searchBar2);
        }
        eeneVar.f = f;
    }

    @Override // defpackage.eemt
    public final void I(aao aaoVar) {
        if (s() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        eerp eerpVar = this.s;
        float f = aaoVar.b;
        if (f > 0.0f) {
            eene eeneVar = eerpVar.e;
            SearchBar searchBar = eerpVar.g;
            eeneVar.h(aaoVar, searchBar, searchBar.H());
            AnimatorSet animatorSet = eerpVar.f;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
                return;
            }
            SearchView searchView = eerpVar.a;
            if (searchView.m()) {
                searchView.d();
            }
            if (searchView.p) {
                eerpVar.f = eerpVar.a(false);
                eerpVar.f.start();
                eerpVar.f.pause();
            }
        }
    }

    @Override // defpackage.ktx
    public final kty a() {
        return new Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.r) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    protected int b() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public final Editable c() {
        return this.k.getText();
    }

    public final void d() {
        this.k.post(new Runnable() { // from class: eeqw
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText = this.a.k;
                editText.clearFocus();
                InputMethodManager inputMethodManagerF = eemo.f(editText);
                if (inputMethodManagerF != null) {
                    inputMethodManagerF.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        });
    }

    public final void e() {
        int i = this.B;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        SearchBar searchBar = this.o;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.s.e();
            return;
        }
        this.o.K(this.k.getText().toString());
        SearchBar searchBar2 = this.o;
        final eerp eerpVar = this.s;
        eerpVar.getClass();
        searchBar2.post(new Runnable() { // from class: eeqm
            @Override // java.lang.Runnable
            public final void run() {
                eerpVar.e();
            }
        });
    }

    public final void f() {
        this.k.postDelayed(new Runnable() { // from class: eeqo
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText = this.a.k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                eemo.f(editText).showSoftInput(editText, 1);
            }
        }, 100L);
    }

    public final void g() {
        if (this.y) {
            f();
        }
    }

    public final void h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.A = new HashMap(viewGroup.getChildCount());
        }
        q(viewGroup, z);
        if (z) {
            return;
        }
        this.A = null;
    }

    public final void i(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void j(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(true != z ? 8 : 0);
        r();
        t(z ? 4 : 2, z2 != z);
    }

    public final void k(SearchBar searchBar) throws Resources.NotFoundException {
        this.o = searchBar;
        this.s.g = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: eeqr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: eeqs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.l();
                        }
                    });
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(kzs.a(materialToolbar.e()) instanceof kw)) {
            int iB = b();
            if (this.o == null) {
                materialToolbar.r(iB);
            } else {
                Drawable drawableMutate = ku.a(getContext(), iB).mutate();
                Integer num = materialToolbar.D;
                if (num != null) {
                    drawableMutate.setTint(num.intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.s(new eelg(this.o.e(), drawableMutate));
                r();
            }
        }
        o();
        u(this.B);
    }

    public final void l() {
        int i = this.B;
        if (i == 0) {
            throw null;
        }
        if (i == 4 || i == 3) {
            return;
        }
        final eerp eerpVar = this.s;
        if (eerpVar.g == null) {
            final SearchView searchView = eerpVar.a;
            if (searchView.m()) {
                searchView.postDelayed(new Runnable() { // from class: eerh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g();
                    }
                }, 150L);
            }
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = eerpVar.b;
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new Runnable() { // from class: eeri
                @Override // java.lang.Runnable
                public final void run() {
                    eerp eerpVar2 = eerpVar;
                    eerpVar2.b.setTranslationY(r1.getHeight());
                    AnimatorSet animatorSetD = eerpVar2.d(true);
                    animatorSetD.addListener(new eerm(eerpVar2));
                    animatorSetD.start();
                }
            });
            return;
        }
        SearchView searchView2 = eerpVar.a;
        if (searchView2.m()) {
            searchView2.g();
        }
        searchView2.n(3);
        Toolbar toolbar = eerpVar.c;
        Menu menuH = toolbar.h();
        if (menuH != null) {
            menuH.clear();
        }
        int i2 = eerpVar.g.J;
        if (i2 == -1 || !searchView2.q) {
            toolbar.setVisibility(8);
        } else {
            toolbar.o(i2);
            ActionMenuView actionMenuViewA = eemj.a(toolbar);
            if (actionMenuViewA != null) {
                for (int i3 = 0; i3 < actionMenuViewA.getChildCount(); i3++) {
                    View childAt = actionMenuViewA.getChildAt(i3);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        EditText editText = eerpVar.d;
        editText.setText(eerpVar.g.J());
        editText.setSelection(editText.getText().length());
        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = eerpVar.b;
        clippableRoundedCornerLayout2.setVisibility(4);
        clippableRoundedCornerLayout2.post(new Runnable() { // from class: eere
            @Override // java.lang.Runnable
            public final void run() {
                eerp eerpVar2 = eerpVar;
                AnimatorSet animatorSetC = eerpVar2.c(true);
                animatorSetC.addListener(new eerk(eerpVar2));
                animatorSetC.start();
            }
        });
    }

    public final boolean m() {
        return this.x == 48;
    }

    public final void n(int i) {
        t(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eesd.c(this);
        int i = this.B;
        v(i);
        u(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h(false);
        this.t.b();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.x = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eeqz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eeqz eeqzVar = (eeqz) parcelable;
        super.onRestoreInstanceState(eeqzVar.d);
        this.k.setText(eeqzVar.a);
        j(eeqzVar.b == 0);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        eeqz eeqzVar = new eeqz(super.onSaveInstanceState());
        Editable editableC = c();
        eeqzVar.a = editableC == null ? null : editableC.toString();
        eeqzVar.b = this.b.getVisibility();
        return eeqzVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        p(f);
    }

    @Override // defpackage.eemt
    public final void x() {
        if (s() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        eerp eerpVar = this.s;
        eerpVar.e.f(eerpVar.g);
        AnimatorSet animatorSet = eerpVar.f;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        eerpVar.f = null;
    }

    @Override // defpackage.eemt
    public final void z() {
        if (s()) {
            return;
        }
        eerp eerpVar = this.s;
        eene eeneVar = eerpVar.e;
        aao aaoVarC = eeneVar.c();
        if (Build.VERSION.SDK_INT < 34 || this.o == null || aaoVarC == null) {
            e();
            return;
        }
        long totalDuration = eerpVar.e().getTotalDuration();
        AnimatorSet animatorSetE = eeneVar.e(eerpVar.g);
        animatorSetE.setDuration(totalDuration);
        animatorSetE.start();
        eeneVar.g();
        if (eerpVar.f != null) {
            eerpVar.b(false).start();
            eerpVar.f.resume();
        }
        eerpVar.f = null;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2;
        super(eexh.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.t = new eemy(this, this);
        this.w = new LinkedHashSet();
        this.x = 16;
        this.B = 2;
        Context context2 = getContext();
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eeqg.b, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.z = typedArrayA.getColor(11, 0);
        int resourceId = typedArrayA.getResourceId(16, -1);
        int resourceId2 = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(3);
        String string2 = typedArrayA.getString(4);
        String string3 = typedArrayA.getString(24);
        boolean z = typedArrayA.getBoolean(27, false);
        this.p = typedArrayA.getBoolean(8, true);
        this.q = typedArrayA.getBoolean(7, true);
        boolean z2 = typedArrayA.getBoolean(17, false);
        this.y = typedArrayA.getBoolean(9, true);
        this.u = typedArrayA.getBoolean(10, true);
        typedArrayA.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.r = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = viewFindViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.e = frameLayout;
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        this.h = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        TextView textView = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = textView;
        this.j = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.m = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.s = new eerp(this);
        this.v = new eejp(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new View.OnTouchListener() { // from class: eeqt
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        o();
        if (resourceId != -1) {
            i2 = 0;
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        } else {
            i2 = 0;
        }
        textView.setText(string3);
        textView.setVisibility(true != TextUtils.isEmpty(string3) ? i2 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.s(null);
        } else {
            materialToolbar.t(new View.OnClickListener() { // from class: eeqv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e();
                }
            });
            if (z) {
                kw kwVar = new kw(getContext());
                kwVar.a(eehg.b(this, R.attr.colorOnSurface));
                materialToolbar.s(kwVar);
            }
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: eeqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView searchView = this.a;
                searchView.k.setText("");
                searchView.g();
            }
        });
        editText.addTextChangedListener(new eeqx(this));
        touchObserverFrameLayout.a = new View.OnTouchListener() { // from class: eequ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                SearchView searchView = this.a;
                if (!searchView.m()) {
                    return false;
                }
                searchView.d();
                return false;
            }
        };
        eemo.i(materialToolbar, new eemm() { // from class: eeqp
            @Override // defpackage.eemm
            public final void a(View view, lgt lgtVar, eemn eemnVar) {
                MaterialToolbar materialToolbar2 = this.a.g;
                boolean zK = eemo.k(materialToolbar2);
                int i3 = zK ? eemnVar.c : eemnVar.a;
                int i4 = zK ? eemnVar.a : eemnVar.c;
                kzc kzcVarF = lgtVar.f(647);
                materialToolbar2.setPadding(i3 + kzcVarF.b, eemnVar.b, i4 + kzcVarF.d, eemnVar.d);
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i3 = marginLayoutParams.leftMargin;
        final int i4 = marginLayoutParams.rightMargin;
        ldn ldnVar = new ldn() { // from class: eeql
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(647);
                int i5 = kzcVarF.b;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i3 + i5;
                marginLayoutParams2.rightMargin = i4 + kzcVarF.d;
                return lgtVar;
            }
        };
        int[] iArr = ley.a;
        len.k(viewFindViewById2, ldnVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        i(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : i2);
        len.k(viewFindViewById, new ldn() { // from class: eeqq
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                int i5 = lgtVar.f(647).c;
                SearchView searchView = this.a;
                searchView.i(i5);
                searchView.d.setVisibility(i5 <= 0 ? 8 : 0);
                return lgtVar;
            }
        });
    }
}
