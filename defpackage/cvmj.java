package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvmj implements TextView.OnEditorActionListener, TextWatcher, CompoundButton.OnCheckedChangeListener, bago, cvtk {
    public static final cqce a = cqce.g("Bugle", "ComposeMessageView");
    public boolean A;
    public boolean B;
    public boolean C;
    public final Optional D;
    public Boolean E;
    public final boolean F;
    public final fcsu G;
    public final fcsu H;
    public final fcsu I;
    public final fcsu J;
    public final fcsu K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    public final fcsu O;
    public final fcsu P;
    public final fcsu Q;
    public final fcsu R;
    public final fcsu S;
    public final fcsu T;
    public final eygg U;
    public final fcsu V;
    public final fcsu W;
    public final fcsu X;
    public final fcsu Y;
    public final fcsu Z;
    public final fcsu aa;
    public final ComposeMessageView ab;
    public final fcsu ac;
    public cvuk ad;
    public final Runnable ae;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final View.OnLayoutChangeListener aj;
    public CheckBox b;
    public TextView c;
    public LinearLayout d;
    public AttachmentsContainer e;
    public cvnz f;
    public cvkz g;

    @Deprecated
    ConstraintLayout h;
    public ViewGroup i;
    public cvtm j;
    public final Context k;
    public cvlg l;
    public PlainTextEditText m;
    public PlainTextEditText n;
    public EditText o;
    public TextView q;
    public TextView r;
    public View s;
    public AsyncImageView t;
    public View u;
    public ImageButton v;
    public cpdw w;
    public final babw x;
    public Optional y;
    public boolean z;
    private long af = 0;
    public Optional p = Optional.empty();

    public cvmj(ComposeMessageView composeMessageView, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, Context context, eygg eyggVar, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24) {
        Optional.empty();
        Optional.empty();
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = Optional.empty();
        this.F = true;
        Optional.empty();
        this.ae = new cvmi(this);
        this.ab = composeMessageView;
        this.ag = fcsuVar;
        this.G = fcsuVar2;
        this.H = fcsuVar3;
        this.I = fcsuVar4;
        this.J = fcsuVar5;
        this.K = fcsuVar6;
        this.L = fcsuVar7;
        this.M = fcsuVar8;
        this.N = fcsuVar9;
        this.O = fcsuVar10;
        this.P = fcsuVar11;
        this.Q = fcsuVar12;
        this.R = fcsuVar13;
        this.S = fcsuVar14;
        this.ah = fcsuVar15;
        this.T = fcsuVar16;
        this.k = context;
        this.U = eyggVar;
        this.V = fcsuVar17;
        this.W = fcsuVar18;
        this.ai = fcsuVar19;
        this.X = fcsuVar20;
        this.Y = fcsuVar21;
        this.Z = fcsuVar22;
        this.aa = fcsuVar23;
        this.ac = fcsuVar24;
        this.x = new babw();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: cvll
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, final int i2, int i3, int i4, int i5, final int i6, int i7, int i8) {
                final cvmj cvmjVar = this.a;
                cvmjVar.ab.post(new Runnable() { // from class: cvma
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9;
                        int i10;
                        cvmj cvmjVar2 = cvmjVar;
                        babw babwVar = cvmjVar2.x;
                        if (babwVar.g()) {
                            int i11 = i6;
                            int i12 = i2;
                            if (i12 <= 0 && i11 > 0) {
                                cvmj.a.q("Hiding attachment container and subject view.");
                                cvhs cvhsVarH = cvmjVar2.e.H();
                                if (cvhsVarH.i.getVisibility() != 8 && (i10 = cvhsVarH.l) != 4 && i10 != 5) {
                                    ImageView imageView = cvhsVarH.e;
                                    if (imageView != null) {
                                        imageView.setVisibility(8);
                                        cvhsVarH.a();
                                    }
                                    cvhsVarH.b(cvhsVarH.c, 0);
                                }
                                if (cvmjVar2.n.hasFocus()) {
                                    cvmjVar2.m();
                                    return;
                                } else {
                                    cvmjVar2.l();
                                    return;
                                }
                            }
                            if (i11 > cvmjVar2.c() || i12 <= cvmjVar2.c()) {
                                return;
                            }
                            if (cvmjVar2.z()) {
                                cvmj.a.q("Showing subject view.");
                                cvmjVar2.s(false);
                            }
                            if (babwVar.g() && bajk.a((bagr) babwVar.a())) {
                                cvmj.a.q("Showing attachment container.");
                                cvhs cvhsVarH2 = cvmjVar2.e.H();
                                AttachmentsContainer attachmentsContainer = cvhsVarH2.i;
                                if (attachmentsContainer.getVisibility() == 0 && ((i9 = cvhsVarH2.l) == 2 || i9 == 3)) {
                                    return;
                                }
                                attachmentsContainer.setVisibility(0);
                                cvhsVarH2.b(0, cvhsVarH2.c);
                            }
                        }
                    }
                });
            }
        };
        this.aj = onLayoutChangeListener;
        composeMessageView.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    private final cukf C() {
        Context context = this.k;
        if (context instanceof cukf) {
            return (cukf) context;
        }
        return null;
    }

    private final boolean D() {
        return this.s.getVisibility() == 0 && !this.z;
    }

    public final boolean A() {
        return ((Boolean) ccze.n.e()).booleanValue() && ((Boolean) ccze.ac.e()).booleanValue() && ((Optional) this.ai.b()).isPresent();
    }

    @Deprecated
    public final void B(int i) {
        eieu eieuVarK = eiiy.k("ComposeMessageViewPeerDelegate::processOutgoingMessageInternal");
        try {
            fhaz fhazVarA = cqdr.a();
            if (i == 1) {
                fcsu fcsuVar = this.Y;
                ((cmxn) fcsuVar.b()).d(cmxm.SEND_BUTTON_ACCURATE, fhazVarA.b);
                ((cmxn) fcsuVar.b()).d(cmxm.NOTIFICATION, fhazVarA.b);
            }
            bagr bagrVar = (bagr) this.x.a();
            if (!A()) {
                Optional optional = this.D;
                if (optional.isEmpty()) {
                    bagrVar.g = Optional.empty();
                } else {
                    bagrVar.g = Optional.of("\n".concat((String) optional.get()));
                }
            }
            a.p(a.J(bagrVar.c, "UI initiated outgoing message processing in conversation "));
            throw null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bago
    public final void a() {
        throw null;
    }

    @Override // defpackage.bago
    public final void b(bagr bagrVar, int i) {
        LinearLayout linearLayout;
        babw babwVar = this.x;
        babwVar.e(bagrVar);
        String strD = bagrVar.d();
        String strC = bagrVar.c();
        boolean z = bagrVar.i;
        if (z || !TextUtils.isEmpty(strD)) {
            this.A = true;
        }
        if (!TextUtils.equals(strD, i())) {
            this.n.setText(strD);
            this.n.setSelection(i().length());
        }
        if (z != v() && (linearLayout = this.d) != null && linearLayout.getVisibility() == 0) {
            r(z);
        }
        if (!TextUtils.equals(strC, this.m.getText())) {
            this.m.setText(strC);
            PlainTextEditText plainTextEditText = this.m;
            plainTextEditText.setSelection(plainTextEditText.getText().length());
        }
        if ((i & 1) == 1) {
            throw null;
        }
        if ((i & 8) == 8) {
            cmuh cmuhVarF = f();
            this.m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(cmuhVarF.d())});
            this.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(cmuhVarF.c())});
            if (cmuhVarF.w()) {
                this.v.setContentDescription(this.k.getString(R.string.delete_subject_and_reset_message_priority_content_description));
            } else {
                this.v.setContentDescription(this.k.getString(R.string.delete_subject_content_description));
            }
            DesugarArrays.stream(this.m.getFilters()).filter(new Predicate() { // from class: cvlx
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    cqce cqceVar = cvmj.a;
                    return ((InputFilter) obj) instanceof InputFilter.LengthFilter;
                }
            }).map(new Function() { // from class: cvly
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = cvmj.a;
                    return (InputFilter.LengthFilter) ((InputFilter) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cvlz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((InputFilter.LengthFilter) obj).getMax());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).min(Comparator.CC.naturalOrder());
        }
        t();
    }

    public final int c() {
        babw babwVar = this.x;
        int i = 0;
        if (babwVar.g() && bajk.a((bagr) babwVar.a())) {
            i = this.e.H().c;
        }
        return z() ? i + this.u.getMeasuredHeight() : i;
    }

    @Override // defpackage.bago
    public final void d(bagr bagrVar) {
        this.x.e(bagrVar);
        throw null;
    }

    final baim e() {
        if (((Boolean) ((cczi) uuj.a.get()).e()).booleanValue()) {
            cqbd cqbdVarD = bagr.b.d();
            cqbdVarD.I("getSelfId");
            cqbdVarD.A("selfId", null);
            cqbdVarD.r();
        }
        A();
        return null;
    }

    public final cmuh f() {
        babw babwVar = this.x;
        int iO = -1;
        if (babwVar != null && babwVar.g()) {
            iO = ((bagr) babwVar.a()).o();
        }
        return ((cmum) this.J.b()).a(iO);
    }

    public final cvlk g() {
        return this.ab.H();
    }

    final CharSequence h() {
        return this.m.getText();
    }

    final CharSequence i() {
        return this.n.getText();
    }

    @Override // defpackage.cvtk
    public final View j(int i) {
        throw null;
    }

    public final void k() {
        this.p.ifPresent(new Consumer() { // from class: cvmb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void l() {
        this.u.setVisibility(8);
    }

    public final void m() {
        l();
        this.m.requestFocus();
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            this.t.setBackground(drawable);
        }
    }

    final void o() {
        CheckBox checkBox;
        int iB;
        Drawable drawable;
        if (this.c == null || (checkBox = this.b) == null) {
            return;
        }
        if (checkBox.isChecked()) {
            iB = eehg.b(this.c, R.attr.colorActiveComposeIcon);
            drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_grey600_24);
        } else {
            iB = eehg.b(this.c, R.attr.colorInactiveComposeIcon);
            drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_outline_blank_grey600_24);
        }
        this.c.setTextColor(iB);
        this.b.setButtonDrawable(cqsu.i(this.k, drawable, iB));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        cukf cukfVarC = C();
        if (cukfVarC != null && cukfVarC.isDestroyed()) {
            a.q("got onTextChanged after onDestroy");
        } else {
            o();
            t();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        B(true != x() ? 1 : 2);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cvkf cvkfVar;
        babw babwVar = this.x;
        cukf cukfVarC = C();
        if (babwVar.g()) {
            if (cukfVarC != null && cukfVarC.isDestroyed()) {
                a.q("got onTextChanged after onDestroy");
                return;
            }
            Runnable runnable = this.ae;
            ecem.f(runnable);
            if (charSequence.length() > 0 && i2 != i3) {
                ekrw ekrwVarG = uoi.a.g();
                ekrwVarG.X(eksq.a, "Bugle");
                throw null;
            }
            if (charSequence.length() > 0 || i2 != i3) {
                t();
            }
            if (charSequence.length() > 0) {
                cvkz cvkzVar = this.g;
                PlainTextEditText plainTextEditText = cvkzVar.c.H().c.m;
                if (plainTextEditText.getWidth() != 0 && (cvkfVar = cvkzVar.h) != null && ((cvkv) cvkfVar).d.getVisibility() == 0 && plainTextEditText.getPaint().measureText(plainTextEditText.getText(), 0, plainTextEditText.getText().length()) >= plainTextEditText.getWidth() * ((Float) cvkz.a.e()).floatValue() && cvkzVar.o) {
                    cvkzVar.l.l(R.id.compress_info_image_view, cvkzVar.d.getVisibility());
                    TransitionManager.beginDelayedTransition(cvkzVar.a(), cvkzVar.m);
                    cvkzVar.l.b(cvkzVar.a());
                }
                if (crbf.d() && ((crqx) this.ag.b()).j()) {
                    cvkz cvkzVar2 = this.g;
                    if (cvkzVar2.e != null) {
                        Optional optional = cvkzVar2.b;
                        if (optional.isPresent()) {
                            Object tag = cvkzVar2.e.getTag(R.id.magic_compose_entrypoint_drawable_tag);
                            if (tag == null || ((Integer) tag).intValue() != R.drawable.gs_pen_spark_vd_theme_24) {
                                cvkzVar2.e.setTag(R.id.magic_compose_entrypoint_drawable_tag, Integer.valueOf(R.drawable.gs_pen_spark_vd_theme_24));
                                cvkzVar2.b(cvkzVar2.e, R.drawable.gs_pen_spark_vd_theme_24, R.string.magic_rewrite_label);
                            }
                        }
                    }
                }
                if (this.m.getMaxLines() == 1) {
                    this.m.setMaxLines(this.ab.getResources().getInteger(R.integer.compose_message_view_max_lines));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(h())) {
                if (crbf.d() && ((crqx) this.ag.b()).j() && (((Boolean) crbf.bd.e()).booleanValue() || !((aqab) this.ac.b()).a())) {
                    cvkz cvkzVar3 = this.g;
                    if (cvkzVar3.e != null) {
                        Optional optional2 = cvkzVar3.b;
                        if (optional2.isPresent()) {
                            Object tag2 = cvkzVar3.e.getTag(R.id.magic_compose_entrypoint_drawable_tag);
                            if (tag2 == null || ((Integer) tag2).intValue() != R.drawable.messages_spark_outlined) {
                                cvkzVar3.e.setTag(R.id.magic_compose_entrypoint_drawable_tag, Integer.valueOf(R.drawable.messages_spark_outlined));
                                cvkzVar3.b(cvkzVar3.e, R.drawable.messages_spark_outlined, R.string.suggested_text_label);
                            }
                        }
                    }
                }
                if (i2 > i3 && i3 == 0) {
                    if (this.C) {
                        this.C = false;
                    } else {
                        long jA = this.af;
                        if (jA == 0) {
                            jA = fazq.a();
                            this.af = jA;
                        }
                        ecem.d(runnable, jA);
                    }
                }
                this.g.c();
                this.m.setMaxLines(1);
            }
        }
    }

    public final void p() {
        fcsu fcsuVar = this.ah;
        ((Optional) fcsuVar.b()).ifPresent(new Consumer() { // from class: cvmc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvun) obj).a(this.a.m, R.dimen.conversation_compose2o_send_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) fcsuVar.b()).ifPresent(new Consumer() { // from class: cvme
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvun) obj).a(this.a.n, R.dimen.conversation_compose2o_subject_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void q(int i) {
        LayerDrawable layerDrawable = (LayerDrawable) this.i.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColor(i);
        layerDrawable.getDrawable(0).setAlpha(0);
    }

    final void r(boolean z) {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    final void s(boolean z) {
        LinearLayout linearLayout;
        if (this.u.getVisibility() == 0 || !u()) {
            return;
        }
        this.u.setVisibility(0);
        if (f().w() && (linearLayout = this.d) != null && linearLayout.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        if (z && this.n.requestFocus() && cpga.g(this.k)) {
            this.ab.getHandler().postDelayed(new cvmh(this), 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvmj.t():void");
    }

    final boolean u() {
        return !((dakl) this.P.b()).l() || c() < this.ab.getTop();
    }

    final boolean v() {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    final boolean w() {
        babw babwVar = this.x;
        return babwVar.g() && bajk.a((bagr) babwVar.a());
    }

    final boolean x() {
        return ((Boolean) clpp.a.e()).booleanValue() && this.p.flatMap(new Function() { // from class: cvmd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.ofNullable(null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).isPresent();
    }

    final boolean y() {
        return TextUtils.getTrimmedLength(i()) > 0;
    }

    final boolean z() {
        if (TextUtils.isEmpty(i()) && !v()) {
            if (!this.A) {
                return false;
            }
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
