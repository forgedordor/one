package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvlk extends cvmn implements cvlj {
    public final fcsu b;
    public final cvmj c;

    /* JADX WARN: Type inference failed for: r21v0, types: [eygg, java.lang.Object] */
    public cvlk(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        cvmk cvmkVar = (cvmk) fcsuVar2.b();
        ComposeMessageView composeMessageView = (ComposeMessageView) cvmkVar.a.b();
        composeMessageView.getClass();
        fcsu fcsuVar3 = cvmkVar.b;
        fcsu fcsuVar4 = cvmkVar.c;
        fcsu fcsuVar5 = cvmkVar.d;
        fcsu fcsuVar6 = cvmkVar.e;
        fcsu fcsuVar7 = cvmkVar.f;
        fcsu fcsuVar8 = cvmkVar.g;
        fcsu fcsuVar9 = cvmkVar.h;
        fcsu fcsuVar10 = cvmkVar.i;
        fcsu fcsuVar11 = cvmkVar.j;
        fcsu fcsuVar12 = cvmkVar.k;
        fcsu fcsuVar13 = cvmkVar.l;
        fcsu fcsuVar14 = cvmkVar.m;
        fcsu fcsuVar15 = cvmkVar.n;
        fcsu fcsuVar16 = cvmkVar.o;
        fcsu fcsuVar17 = cvmkVar.p;
        fcsu fcsuVar18 = cvmkVar.q;
        fcsu fcsuVar19 = cvmkVar.r;
        fcsu fcsuVar20 = cvmkVar.s;
        fcsu fcsuVar21 = cvmkVar.t;
        fcsu fcsuVar22 = cvmkVar.u;
        fcsu fcsuVar23 = cvmkVar.v;
        fcsu fcsuVar24 = cvmkVar.w;
        fcsu fcsuVar25 = cvmkVar.x;
        fcsu fcsuVar26 = cvmkVar.y;
        fcsu fcsuVar27 = cvmkVar.z;
        fcsu fcsuVar28 = cvmkVar.A;
        Context context = (Context) cvmkVar.B.b();
        context.getClass();
        fcsu fcsuVar29 = cvmkVar.C;
        ?? B = cvmkVar.D.b();
        B.getClass();
        fcsu fcsuVar30 = cvmkVar.E;
        fcsu fcsuVar31 = cvmkVar.F;
        fcsu fcsuVar32 = cvmkVar.G;
        fcsu fcsuVar33 = cvmkVar.H;
        fcsu fcsuVar34 = cvmkVar.I;
        fcsu fcsuVar35 = cvmkVar.J;
        fcsu fcsuVar36 = cvmkVar.K;
        fcsu fcsuVar37 = cvmkVar.L;
        fcsu fcsuVar38 = cvmkVar.M;
        fcsu fcsuVar39 = cvmkVar.N;
        fcsu fcsuVar40 = cvmkVar.O;
        ((awij) cvmkVar.P.b()).getClass();
        fcsu fcsuVar41 = cvmkVar.Q;
        fcsu fcsuVar42 = cvmkVar.R;
        final cvmj cvmjVar = new cvmj(composeMessageView, fcsuVar3, fcsuVar5, fcsuVar6, fcsuVar9, fcsuVar10, fcsuVar11, fcsuVar16, fcsuVar17, fcsuVar18, fcsuVar20, fcsuVar21, fcsuVar22, fcsuVar23, fcsuVar25, fcsuVar27, fcsuVar28, context, B, fcsuVar30, fcsuVar33, fcsuVar34, fcsuVar36, fcsuVar37, fcsuVar38, cvmkVar.S, cvmkVar.T);
        this.c = cvmjVar;
        if (cvmjVar.ab.isInEditMode()) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) cvmjVar.ab.findViewById(R.id.compose_message_container);
        linearLayout.removeView(cvmjVar.ab.findViewById(R.id.send_message_button_container));
        LayoutInflater.from(cvmjVar.k).inflate(R.layout.send_button, (ViewGroup) linearLayout, true);
        cvlh cvlhVar = (cvlh) cvmjVar.I.b();
        cvlk cvlkVarG = cvmjVar.g();
        daoe daoeVar = (daoe) cvlhVar.a.b();
        daoeVar.getClass();
        cvle cvleVar = (cvle) cvlhVar.b.b();
        cvleVar.getClass();
        cogw cogwVar = (cogw) cvlhVar.c.b();
        cogwVar.getClass();
        cvob cvobVar = (cvob) cvlhVar.d.b();
        cvobVar.getClass();
        cden cdenVar = (cden) cvlhVar.e.b();
        cdenVar.getClass();
        ((Optional) cvlhVar.f.b()).getClass();
        fcsu fcsuVar43 = cvlhVar.g;
        cvmjVar.l = new cvlg(daoeVar, cvleVar, cogwVar, cvobVar, cdenVar, cvlkVarG);
        cvmjVar.m = (PlainTextEditText) cvmjVar.ab.findViewById(R.id.compose_message_text);
        cvmjVar.p();
        cvmjVar.m.setMaxLines(1);
        cvmjVar.m.setEllipsize(TextUtils.TruncateAt.END);
        if (!cvmjVar.A()) {
            cvmjVar.m.setShowSoftInputOnFocus(false);
        }
        if (!cvmjVar.A()) {
            cvmjVar.m.setOnEditorActionListener(new eigd((eigp) cvmjVar.O.b(), cvmjVar.g(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 704, "ComposeMessageViewPeer composeEditText onEditorAction"));
        }
        cvmjVar.m.addTextChangedListener(new eigi((eigp) cvmjVar.O.b(), cvmjVar.g(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 711, "ComposeMessageViewPeer composeEditText textWatcher"));
        if (!cvmjVar.A()) {
            PlainTextEditText plainTextEditText = cvmjVar.m;
            final eigp eigpVar = (eigp) cvmjVar.O.b();
            final View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: cvln
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    cvmj cvmjVar2 = cvmjVar;
                    PlainTextEditText plainTextEditText2 = cvmjVar2.m;
                    if (view == plainTextEditText2 && z) {
                        cvmjVar2.o = plainTextEditText2;
                    }
                }
            };
            final int i = 718;
            final String str = "ComposeMessageViewPeer composeEditText onFocusChange";
            plainTextEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: eigh
                public final /* synthetic */ String c = "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate";
                public final /* synthetic */ String d = "doAfterInflate";

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    if (eidc.v()) {
                        onFocusChangeListener2.onFocusChange(view, z);
                        return;
                    }
                    String str2 = str;
                    int i2 = i;
                    String str3 = this.d;
                    eieh eiehVarC = eigpVar.c(str2, this.c, str3, i2);
                    try {
                        onFocusChangeListener2.onFocusChange(view, z);
                        eiehVarC.close();
                    } catch (Throwable th) {
                        try {
                            eiehVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        }
        cvmjVar.m.setOnClickListener(new eifs((eigp) cvmjVar.O.b(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 733, "ComposeMessageViewPeer composeEditText onClick", new View.OnClickListener() { // from class: cvlo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                throw null;
            }
        }));
        cvmjVar.m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((cmum) cvmjVar.J.b()).a(-1).d())});
        cvmjVar.o = cvmjVar.m;
        boolean zA = cvmjVar.A();
        babw babwVar = cvmjVar.x;
        PlainTextEditText plainTextEditText2 = cvmjVar.m;
        cvmf cvmfVar = new cvmf(cvmjVar, babwVar, plainTextEditText2);
        if (!zA) {
            plainTextEditText2.f(cvmfVar, cvlj.sA);
        }
        cvmjVar.n = (PlainTextEditText) cvmjVar.ab.findViewById(R.id.compose_subject_text);
        cvmjVar.n.addTextChangedListener(new eigi((eigp) cvmjVar.O.b(), cvmjVar.g(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 762, "ComposeMessageViewPeer composeSubject textWatcher"));
        cvmjVar.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(((cmum) cvmjVar.J.b()).a(-1).c())});
        if (!cvmjVar.A()) {
            PlainTextEditText plainTextEditText3 = cvmjVar.n;
            final eigp eigpVar2 = (eigp) cvmjVar.O.b();
            final View.OnFocusChangeListener onFocusChangeListener2 = new View.OnFocusChangeListener() { // from class: cvlp
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    cvmj cvmjVar2 = cvmjVar;
                    PlainTextEditText plainTextEditText4 = cvmjVar2.n;
                    if (view == plainTextEditText4 && z) {
                        cvmjVar2.o = plainTextEditText4;
                    }
                }
            };
            final int i2 = 777;
            final String str2 = "ComposeMessageViewPeer composeSubjectText onFocusChange";
            plainTextEditText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: eigh
                public final /* synthetic */ String c = "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate";
                public final /* synthetic */ String d = "doAfterInflate";

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    View.OnFocusChangeListener onFocusChangeListener22 = onFocusChangeListener2;
                    if (eidc.v()) {
                        onFocusChangeListener22.onFocusChange(view, z);
                        return;
                    }
                    String str22 = str2;
                    int i22 = i2;
                    String str3 = this.d;
                    eieh eiehVarC = eigpVar2.c(str22, this.c, str3, i22);
                    try {
                        onFocusChangeListener22.onFocusChange(view, z);
                        eiehVarC.close();
                    } catch (Throwable th) {
                        try {
                            eiehVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        }
        if (!zA) {
            cvmjVar.n.f(cvmfVar, cvlj.sA);
        }
        cvmjVar.v = (ImageButton) cvmjVar.ab.findViewById(R.id.delete_subject_button);
        cvmjVar.v.setOnClickListener(new eifs((eigp) cvmjVar.O.b(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 811, "ComposeMessageViewPeer deleteSubjectButton onClick", new View.OnClickListener() { // from class: cvlq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cvmj cvmjVar2 = cvmjVar;
                bagr bagrVar = (bagr) cvmjVar2.x.a();
                bagrVar.s(null);
                bagrVar.i = false;
                cvmjVar2.n.setText((CharSequence) null);
                cvmjVar2.r(false);
                cvmjVar2.m();
                cvmjVar2.A = false;
            }
        }));
        cvmjVar.u = cvmjVar.ab.findViewById(R.id.subject_view);
        int iB = eehg.b(cvmjVar.n, R.attr.colorOnSurfaceVariant);
        cvmjVar.n.setHintTextColor(iB);
        cvmjVar.v.getDrawable().setTint(iB);
        cvmjVar.m.setHintTextColor(iB);
        cvmjVar.t = (AsyncImageView) cvmjVar.ab.findViewById(R.id.send_message_button_icon);
        cvmjVar.s = cvmjVar.ab.findViewById(R.id.send_message_button_container);
        eign eignVar = new eign((eigp) cvmjVar.O.b(), "com/google/android/apps/messaging/ui/conversation/ComposeMessageViewPeerDelegate", "doAfterInflate", 838, "Send Message Long Click", new View.OnLongClickListener() { // from class: cvlr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                cqce cqceVar = cvmj.a;
                einf.g(new uhq(), view);
                return true;
            }
        });
        cvmg cvmgVar = new cvmg(cvmjVar);
        if (!cvmjVar.f().p()) {
            boolean z = cvmjVar.F;
        }
        cvoa cvoaVar = (cvoa) cvmjVar.M.b();
        ComposeMessageView composeMessageView2 = cvmjVar.ab;
        babw babwVar2 = cvmjVar.x;
        cvnw cvnwVar = (cvnw) cvoaVar.a.b();
        cvnwVar.getClass();
        Context context2 = (Context) cvoaVar.b.b();
        context2.getClass();
        Vibrator vibrator = (Vibrator) cvoaVar.c.b();
        vibrator.getClass();
        cssf cssfVar = (cssf) cvoaVar.d.b();
        cssfVar.getClass();
        fcsu fcsuVar44 = cvoaVar.e;
        fcsu fcsuVar45 = cvoaVar.f;
        composeMessageView2.getClass();
        babwVar2.getClass();
        cvmjVar.f = new cvnz(cvnwVar, context2, vibrator, cssfVar, fcsuVar44, fcsuVar45, composeMessageView2, babwVar2);
        cvmjVar.B = true;
        cvmjVar.e = (AttachmentsContainer) cvmjVar.ab.findViewById(R.id.attachments_container);
        final cvhs cvhsVarH = cvmjVar.e.H();
        cvlk cvlkVarG2 = cvmjVar.g();
        ImageView imageView = (ImageView) cvlkVarG2.j(R.id.compress_info_image_view);
        imageView.getClass();
        cvhsVarH.e = imageView;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(cvhsVarH.j).inflate(R.layout.mms_compress_tooltip_content, (ViewGroup) null);
        cvhsVarH.h = new dajw(frameLayout, 1, cvhsVarH.e, 3);
        cvhsVarH.e.getDrawingRect(new Rect());
        cvhsVarH.h.a.setTranslationY(frameLayout.getResources().getDimension(R.dimen.compress_info_tooltip_y_offset));
        cvhsVarH.h.a.i = (int) cvhsVarH.j.getResources().getDimension(R.dimen.tooltip_max_width);
        LinearLayout linearLayout2 = (LinearLayout) cvlkVarG2.j(R.id.compose_message_container);
        linearLayout2.getClass();
        cvhsVarH.f = linearLayout2;
        cvhsVarH.f.addOnLayoutChangeListener(new cvhq(cvhsVarH));
        if (((cpch) cvhsVarH.k.b()).g()) {
            cvhsVarH.e.setColorFilter(cvhsVarH.j.getColor(R.color.white));
        } else {
            cvhsVarH.e.setColorFilter(cvhsVarH.j.getColor(R.color.google_grey600));
        }
        cvhsVarH.e.setOnClickListener(new View.OnClickListener() { // from class: cvhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cvhs cvhsVar = cvhsVarH;
                if (cvhsVar.h.d()) {
                    return;
                }
                cvhsVar.h.c();
            }
        });
        cvhsVarH.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cvhm
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                cvhs cvhsVar = cvhsVarH;
                if (cvhsVar.h.d()) {
                    dajw dajwVar = cvhsVar.h;
                    ImageView imageView2 = cvhsVar.e;
                    dajv dajvVar = dajwVar.a;
                    dajvVar.g = imageView2;
                    dajvVar.d();
                    dajvVar.e();
                }
            }
        });
        cvmjVar.q = (TextView) cvmjVar.ab.findViewById(R.id.char_counter);
        cvmjVar.r = (TextView) cvmjVar.ab.findViewById(R.id.message_indicator);
        cvmjVar.h = (ConstraintLayout) cvmjVar.ab.findViewById(R.id.message_compose_view_container_with_c2o);
        cvmjVar.i = (ViewGroup) cvmjVar.ab.findViewById(R.id.compose_message_box_linear_layout);
        einm einmVar = (einm) cvmjVar.W.b();
        einm.d(cvmjVar.t, "Send Button");
        einmVar.b(cvmjVar.t, new uhp());
        cvmjVar.t.setOnLongClickListener(eignVar);
        cvmjVar.t.setAccessibilityDelegate(cvmgVar);
        if (((apui) cvmjVar.aa.b()).a()) {
            cvmjVar.t.setBackground(null);
        }
        cvla cvlaVar = (cvla) cvmjVar.R.b();
        ComposeMessageView composeMessageView3 = cvmjVar.ab;
        Context context3 = (Context) cvlaVar.a.b();
        context3.getClass();
        eigp eigpVar3 = (eigp) cvlaVar.b.b();
        eigpVar3.getClass();
        Optional optional = (Optional) cvlaVar.c.b();
        optional.getClass();
        fcsu fcsuVar46 = cvlaVar.d;
        fcsu fcsuVar47 = cvlaVar.e;
        composeMessageView3.getClass();
        cvmjVar.g = new cvkz(context3, eigpVar3, optional, fcsuVar46, fcsuVar47, composeMessageView3, cvlaVar.f, cvlaVar.g);
        if (crbf.d()) {
            cvkz cvkzVar = cvmjVar.g;
            if (!((Boolean) crbf.aV.e()).booleanValue()) {
                cvkzVar.d();
            }
            if (cvkzVar.e != null) {
                cvkzVar.k.l(R.id.magic_button, 8);
                if (cvkzVar.e.getVisibility() == 0) {
                    cvkzVar.e.setVisibility(8);
                }
            }
        }
        cvmjVar.p = ((Optional) cvmjVar.S.b()).map(new Function() { // from class: cvls
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cvmj cvmjVar2 = cvmjVar;
                aihj aihjVar = (aihj) obj;
                ViewStub viewStub = (ViewStub) cvmjVar2.ab.findViewById(R.id.scheduled_send_compose_label_stub);
                AsyncImageView asyncImageView = cvmjVar2.t;
                viewStub.getClass();
                asyncImageView.getClass();
                fcsu fcsuVar48 = aihjVar.g;
                fcsu fcsuVar49 = aihjVar.f;
                fcsu fcsuVar50 = aihjVar.e;
                fcsu fcsuVar51 = aihjVar.d;
                fcsu fcsuVar52 = aihjVar.c;
                fcsu fcsuVar53 = aihjVar.b;
                fcsu fcsuVar54 = aihjVar.a;
                return new aihk();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cvmjVar.q(cvkg.a(cvmjVar.h, 10));
        cvmjVar.o();
        cvmjVar.b = (CheckBox) cvmjVar.ab.findViewById(R.id.priority_checkbox);
        cvmjVar.c = (TextView) cvmjVar.ab.findViewById(R.id.priority_text);
        cvmjVar.d = (LinearLayout) cvmjVar.ab.findViewById(R.id.priority_checkbox_container);
        cvmjVar.d.setOnClickListener(new View.OnClickListener() { // from class: cvlt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cvmjVar.b.toggle();
            }
        });
        cvmjVar.b.setClickable(false);
        cvmjVar.b.setOnCheckedChangeListener(cvmjVar.g());
        cvmjVar.w = new cpdw(cvmjVar.ab, R.id.reply_snippet_stub, R.id.reply_snippet_inflated);
        cvmjVar.y = ((Optional) cvmjVar.X.b()).map(new Function() { // from class: cvlu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ahsu) obj).a(cvmjVar.w);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.bago
    public final void a() {
        throw null;
    }

    @Override // defpackage.bago
    public final void b(bagr bagrVar, int i) {
        eieu eieuVarK = eiiy.k("ComposeMessageViewPeer::onDraftChanged");
        try {
            this.c.b(bagrVar, i);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cvlj
    public final String c() {
        this.c.e();
        return null;
    }

    @Override // defpackage.bago
    public final void d(bagr bagrVar) {
        this.c.d(bagrVar);
    }

    @Override // defpackage.cvlj
    public final void e(String str) {
        this.c.m.setHint(str);
    }

    @Override // defpackage.cvlj
    public final void f(boolean z) {
        this.c.z = z;
    }

    @Override // defpackage.cvlj
    public final void g(boolean z) throws Resources.NotFoundException {
        cvmj cvmjVar = this.c;
        if (!z) {
            final cvhs cvhsVarH = cvmjVar.e.H();
            if (cvhsVarH.h != null && cvhsVarH.m != 3) {
                cvhsVarH.a();
                cvhsVarH.e.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable() { // from class: cvho
                    @Override // java.lang.Runnable
                    public final void run() {
                        cvhsVarH.m = 3;
                    }
                }).withEndAction(new Runnable() { // from class: cvhp
                    @Override // java.lang.Runnable
                    public final void run() {
                        cvhs cvhsVar = cvhsVarH;
                        cvhsVar.e.setVisibility(8);
                        cvhsVar.m = 1;
                    }
                });
            }
        }
        cvmjVar.r.setVisibility(true != z ? 8 : 0);
        Context context = cvmjVar.k;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_bottom);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_with_indicator_padding_top);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_without_indicator_padding);
        AsyncImageView asyncImageView = cvmjVar.t;
        int paddingStart = asyncImageView.getPaddingStart();
        if (true != z) {
            dimensionPixelSize2 = dimensionPixelSize3;
        }
        int paddingEnd = cvmjVar.t.getPaddingEnd();
        if (true != z) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        asyncImageView.setPaddingRelative(paddingStart, dimensionPixelSize2, paddingEnd, dimensionPixelSize);
    }

    @Override // defpackage.cvlj
    public final boolean h() {
        cvmj cvmjVar = this.c;
        if (cvmjVar.x.g()) {
            return !TextUtils.isEmpty(cvmjVar.h()) || cvmjVar.y() || cvmjVar.w();
        }
        return false;
    }

    @Override // defpackage.cvlj
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cvtk
    public final View j(int i) {
        return this.c.ab.findViewById(i);
    }

    public final cvkf k() {
        return this.c.g.i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c.onCheckedChanged(compoundButton, z);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.c.onEditorAction(textView, i, keyEvent);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.c.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
