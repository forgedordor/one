package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jr extends nl {
    public boolean a;
    public boolean b;
    final /* synthetic */ jz c;
    public kj d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(jz jzVar, Window.Callback callback) {
        super(callback);
        this.c = jzVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            jz jzVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            im imVarB = jzVar.b();
            if (imVarB == null || !imVarB.onKeyShortcut(keyCode, keyEvent)) {
                jx jxVar = jzVar.E;
                if (jxVar == null || !jzVar.Q(jxVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (jzVar.E == null) {
                        jx jxVarP = jzVar.P(0);
                        jzVar.M(jxVarP, keyEvent);
                        boolean zQ = jzVar.Q(jxVarP, keyEvent.getKeyCode(), keyEvent);
                        jxVarP.k = false;
                        if (!zQ) {
                        }
                    }
                    return false;
                }
                jx jxVar2 = jzVar.E;
                if (jxVar2 != null) {
                    jxVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof oc)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        kj kjVar = this.d;
        if (kjVar != null) {
            if (i == 0) {
                view = new View(kjVar.a.a.b());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        im imVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (imVarB = this.c.b()) != null) {
            imVarB.dispatchMenuVisibilityChanged(true);
        }
        return true;
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        jz jzVar = this.c;
        if (i == 108) {
            im imVarB = jzVar.b();
            if (imVarB != null) {
                imVarB.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            jx jxVarP = jzVar.P(0);
            if (jxVarP.m) {
                jzVar.C(jxVarP, false);
            }
        }
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        oc ocVar = menu instanceof oc ? (oc) menu : null;
        if (i == 0) {
            if (ocVar == null) {
                return false;
            }
            i = 0;
        }
        if (ocVar != null) {
            ocVar.k = true;
        }
        kj kjVar = this.d;
        if (kjVar != null && i == 0) {
            kk kkVar = kjVar.a;
            if (!kkVar.c) {
                kkVar.a.n();
                kkVar.c = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (ocVar != null) {
            ocVar.k = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        oc ocVar = this.c.P(0).h;
        if (ocVar != null) {
            super.onProvideKeyboardShortcuts(list, ocVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.nl, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        iz izVar;
        iz izVar2;
        jz jzVar = this.c;
        if (!jzVar.w || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        Context context = jzVar.k;
        ne neVar = new ne(context, callback);
        nb nbVar = jzVar.r;
        if (nbVar != null) {
            nbVar.f();
        }
        jo joVar = new jo(jzVar, neVar);
        im imVarB = jzVar.b();
        if (imVarB != null) {
            jzVar.r = imVarB.startActionMode(joVar);
            if (jzVar.r != null && (izVar2 = jzVar.n) != null) {
                izVar2.hd();
            }
        }
        if (jzVar.r == null) {
            jzVar.E();
            nb nbVar2 = jzVar.r;
            if (nbVar2 != null) {
                nbVar2.f();
            }
            if (jzVar.s == null) {
                if (jzVar.C) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        aer aerVar = new aer(context, 0);
                        aerVar.getTheme().setTo(themeNewTheme);
                        context = aerVar;
                    }
                    jzVar.s = new ActionBarContextView(context);
                    jzVar.t = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    jzVar.t.setWindowLayoutType(2);
                    jzVar.t.setContentView(jzVar.s);
                    jzVar.t.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    jzVar.s.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    jzVar.t.setHeight(-2);
                    jzVar.u = new jj(jzVar);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) jzVar.y.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(jzVar.u());
                        jzVar.s = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (jzVar.s != null) {
                jzVar.E();
                jzVar.s.i();
                nd ndVar = new nd(jzVar.s.getContext(), jzVar.s, joVar);
                if (joVar.c(ndVar, ndVar.a)) {
                    ndVar.g();
                    jzVar.s.h(ndVar);
                    jzVar.r = ndVar;
                    if (jzVar.N()) {
                        jzVar.s.setAlpha(0.0f);
                        lfn lfnVarE = ley.e(jzVar.s);
                        lfnVarE.b(1.0f);
                        jzVar.v = lfnVarE;
                        jzVar.v.d(new jk(jzVar));
                    } else {
                        jzVar.s.setAlpha(1.0f);
                        jzVar.s.setVisibility(0);
                        if (jzVar.s.getParent() instanceof View) {
                            View view = (View) jzVar.s.getParent();
                            int[] iArr = ley.a;
                            lel.c(view);
                        }
                    }
                    if (jzVar.t != null) {
                        jzVar.l.getDecorView().post(jzVar.u);
                    }
                } else {
                    jzVar.r = null;
                }
            }
            if (jzVar.r != null && (izVar = jzVar.n) != null) {
                izVar.hd();
            }
            jzVar.I();
        }
        jzVar.I();
        nb nbVar3 = jzVar.r;
        if (nbVar3 != null) {
            return neVar.e(nbVar3);
        }
        return null;
    }
}
