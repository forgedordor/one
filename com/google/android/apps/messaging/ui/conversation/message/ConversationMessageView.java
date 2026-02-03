package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import defpackage.afhk;
import defpackage.ajhd;
import defpackage.axjx;
import defpackage.baea;
import defpackage.baeb;
import defpackage.baha;
import defpackage.baui;
import defpackage.bvur;
import defpackage.ccze;
import defpackage.cczi;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cmvy;
import defpackage.cogw;
import defpackage.cpbb;
import defpackage.cpdv;
import defpackage.cpdw;
import defpackage.cpga;
import defpackage.cqei;
import defpackage.cqmb;
import defpackage.cssx;
import defpackage.cvjl;
import defpackage.cvuk;
import defpackage.cwkj;
import defpackage.cwkk;
import defpackage.cwkr;
import defpackage.cwkt;
import defpackage.cwla;
import defpackage.cwlb;
import defpackage.cwlc;
import defpackage.cwls;
import defpackage.cwly;
import defpackage.cwmn;
import defpackage.czwc;
import defpackage.czwt;
import defpackage.dajd;
import defpackage.dakl;
import defpackage.ejxr;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eksq;
import defpackage.elrk;
import defpackage.eosc;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.fdbq;
import defpackage.stu;
import defpackage.upn;
import defpackage.wb;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageView extends cwly implements View.OnClickListener, View.OnLongClickListener, cpbb, cvuk, cwlc {
    private static final eksp B = eksp.c("BugleMessageView");
    public static final cczv a = cdag.p(143245445);
    public static final ejxr b;
    public static final cczv c;
    public eygg A;
    private cpdw C;
    private ContactIconView D;
    private cpdw E;
    private cpdw F;
    private ViewGroup G;
    private cpdw H;
    private final List I;
    private cwmn J;
    private View.OnClickListener K;
    private View.OnLongClickListener L;
    public baea d;
    public cpdw e;
    public ConversationMessageBubbleView f;
    public TextView g;
    public TextView h;
    public cpdw i;
    public cwla j;
    public final int k;
    public cwkt l;
    public cwkj m;
    public cqei n;
    public cssx o;
    public cwlb p;
    public baeb q;
    public cogw r;
    public Optional s;
    public eygg t;
    public fcsu u;
    public fcsu v;
    public cwls w;
    public cwkk x;
    public ekgb y;
    public eygg z;

    static {
        cdag.m(cdag.b, "use_default_sender_color_in_group", false);
        b = cdag.w(204810985, "skip_chat_api_flag_check_on_get_progress");
        c = cdag.m(cdag.b, "log_message_view_measure_and_layout_results", false);
    }

    public ConversationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new ArrayList();
        Optional.empty();
        this.k = (int) getResources().getDimension(R.dimen.message_margin_default);
        setWillNotDraw(false);
    }

    protected final int a() {
        if (this.E.i() && baha.a(this.d)) {
            return ((BadgesRecyclerView) this.E.b()).getMeasuredHeight();
        }
        return 0;
    }

    protected final int b() {
        if (this.E.i()) {
            return ((BadgesRecyclerView) this.E.b()).getMeasuredWidth();
        }
        return 0;
    }

    protected final int c() {
        return this.f.getMeasuredHeight();
    }

    protected final int d() {
        View childAt = p() ? ((MessageAttachmentsView) this.C.b()).c.getChildAt(0) : null;
        if (childAt != null) {
            return childAt.getMeasuredWidth();
        }
        return 0;
    }

    protected final int e() {
        return this.D.getMeasuredHeight();
    }

    protected final int f() {
        return this.D.getMeasuredWidth();
    }

    protected final int g() {
        if (!p()) {
            return 0;
        }
        return ((MessageAttachmentsView) this.C.b()).c.getChildAt(r0.getChildCount() - 1).getMeasuredWidth();
    }

    protected final int h() {
        int measuredWidth = this.f.a.getMeasuredWidth();
        return ((measuredWidth == 0 || this.f.a.getVisibility() != 0) && p()) ? ((MessageAttachmentsView) this.C.b()).c.getMeasuredWidth() : measuredWidth;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (((Boolean) ccze.aa.e()).booleanValue()) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    protected final int i() {
        return this.g.getVisibility();
    }

    protected final int j() {
        ConversationMessageMetadataView conversationMessageMetadataView = ((cwkr) this.A.b()).a;
        if (conversationMessageMetadataView == null) {
            fdbq.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        TextView textView = conversationMessageMetadataView.d;
        if (!((Boolean) ConversationMessageMetadataView.a.e()).booleanValue()) {
            return conversationMessageMetadataView.getLayoutParams().height;
        }
        if (conversationMessageMetadataView.e) {
            return conversationMessageMetadataView.getMeasuredHeight();
        }
        return 0;
    }

    public final int k() {
        if (this.h.isShown()) {
            return this.h.getMeasuredHeight();
        }
        return 0;
    }

    protected final int l() {
        return this.g.getMeasuredHeight();
    }

    protected final void m(int i, int i2) {
        if (this.e.i()) {
            ((ImageView) this.e.b()).measure(i, i2);
        }
    }

    public final void n(float f) {
        TextView textView = this.g;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    public final boolean o() {
        baea baeaVar = this.d;
        if (MessageData.cR(baeaVar.e()) || baha.a(baeaVar)) {
            return false;
        }
        RepliedToDataAdapter repliedToDataAdapter = baeaVar.v;
        return baeaVar.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final cwla cwlaVar = (cwla) this.J;
        cwlaVar.c = new cvuk() { // from class: cwkx
        };
        ((Optional) cwlaVar.a.b()).ifPresent(new Consumer() { // from class: cwky
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvul) obj).h(cwlaVar.c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.t.b()).ifPresent(new Consumer() { // from class: cwll
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvul) obj).h(this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        if (this.J.a(view) && (onClickListener = this.K) != null) {
            onClickListener.onClick(view);
            return;
        }
        Object tag = view.getTag();
        if (!(tag instanceof MessagePartData)) {
            callOnClick();
        } else {
            this.n.i(view);
            r((MessagePartCoreData) tag, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        final cwla cwlaVar = (cwla) this.J;
        ((Optional) cwlaVar.a.b()).ifPresent(new Consumer() { // from class: cwku
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvul) obj).i(cwlaVar.c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.t.b()).ifPresent(new Consumer() { // from class: cwlf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cvul) obj).i(this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r5v25, types: [eygg, java.lang.Object] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Optional optional = (Optional) this.x.a.b();
        optional.getClass();
        this.m = new cwkj(optional, this);
        this.d = this.q.a();
        ContactIconView contactIconView = (ContactIconView) findViewById(R.id.contact_icon);
        this.D = contactIconView;
        contactIconView.setOnLongClickListener(new View.OnLongClickListener() { // from class: cwln
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.a.performLongClick();
                return true;
            }
        });
        this.D.q = elrk.BIZINFO_SOURCE_CONVERSATION_AVATAR;
        this.f = (ConversationMessageBubbleView) findViewById(R.id.message_content);
        this.C = new cpdw(this.f, R.id.message_attachments_view_stub, R.id.message_attachments, new cpdv() { // from class: cwlo
            @Override // defpackage.cpdv
            public final void a(Object obj) {
                MessageAttachmentsView messageAttachmentsView = (MessageAttachmentsView) obj;
                ConversationMessageView conversationMessageView = this.a;
                baea baeaVar = conversationMessageView.d;
                messageAttachmentsView.a = baeaVar;
                ConversationMessageView conversationMessageView2 = messageAttachmentsView.b;
                if (conversationMessageView2 != null) {
                    ConversationMessageTransferView conversationMessageTransferView = messageAttachmentsView.d;
                    conversationMessageTransferView.b = conversationMessageView2;
                    conversationMessageTransferView.a(baeaVar);
                }
                messageAttachmentsView.b = conversationMessageView;
                MessageAttachmentContainer messageAttachmentContainer = messageAttachmentsView.c;
                messageAttachmentContainer.a = conversationMessageView;
                for (int i = 0; i < messageAttachmentContainer.getChildCount(); i++) {
                    cqaz.k(messageAttachmentContainer.getChildAt(i) instanceof ViewGroup);
                    ViewGroup viewGroup = (ViewGroup) messageAttachmentContainer.getChildAt(i);
                    if (viewGroup.getChildAt(0) instanceof cpba) {
                        ((cpba) viewGroup.getChildAt(0)).a(conversationMessageView);
                    }
                }
                ConversationMessageTransferView conversationMessageTransferView2 = messageAttachmentsView.d;
                conversationMessageTransferView2.b = conversationMessageView;
                conversationMessageTransferView2.a(messageAttachmentsView.a);
            }
        });
        this.G = (ViewGroup) findViewById(R.id.message_text_and_info);
        this.h = (TextView) findViewById(R.id.message_sender_name);
        cwkr cwkrVar = (cwkr) this.A.b();
        cwkrVar.a = (ConversationMessageMetadataView) findViewById(R.id.message_metadata);
        ConversationMessageMetadataView conversationMessageMetadataView = cwkrVar.a;
        if (conversationMessageMetadataView == null) {
            fdbq.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.setVisibility(0);
        this.g = (TextView) findViewById(R.id.message_separator);
        this.E = new cpdw(this, R.id.message_badges, R.id.message_badges_inflated, new cpdv() { // from class: cwlp
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
            
                r6 = j$.util.Optional.of(new defpackage.uei(4, r7));
             */
            @Override // defpackage.cpdv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwlp.a(java.lang.Object):void");
            }
        });
        this.o.b();
        this.H = new cpdw(this.f, R.id.message_link_preview_view_stub, R.id.message_link_preview_view, new cpdv() { // from class: cwlq
            @Override // defpackage.cpdv
            public final void a(Object obj) {
                ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) obj;
                ConversationMessageView conversationMessageView = this.a;
                conversationMessageLinkPreviewView.b = conversationMessageView;
                conversationMessageLinkPreviewView.c = conversationMessageView.f;
            }
        });
        this.F = new cpdw(this, R.id.reply_snippet, R.id.reply_snippet_bubble_inflated);
        cwlb cwlbVar = this.p;
        fcsu fcsuVar = cwlbVar.a;
        ViewGroup viewGroup = this.G;
        cpdw cpdwVar = this.H;
        cpdw cpdwVar2 = this.F;
        baea baeaVar = this.d;
        ((Context) fcsuVar.b()).getClass();
        ((Optional) cwlbVar.b.b()).getClass();
        ((cqmb) cwlbVar.c.b()).getClass();
        ((Optional) cwlbVar.d.b()).getClass();
        cssx cssxVar = (cssx) cwlbVar.e.b();
        cssxVar.getClass();
        ((dajd) cwlbVar.f.b()).getClass();
        ((axjx) cwlbVar.g.b()).getClass();
        ((eosc) cwlbVar.h.b()).getClass();
        ((cvjl) cwlbVar.i.b()).getClass();
        ((upn) cwlbVar.j.b()).getClass();
        ((ajhd) cwlbVar.k.b()).getClass();
        ((cmvy) cwlbVar.l.b()).getClass();
        ((bvur) cwlbVar.m.b()).getClass();
        ?? B2 = cwlbVar.n.b();
        B2.getClass();
        fcsu fcsuVar2 = cwlbVar.o;
        ((afhk) cwlbVar.p.b()).getClass();
        fcsu fcsuVar3 = cwlbVar.q;
        fcsu fcsuVar4 = cwlbVar.r;
        fcsu fcsuVar5 = cwlbVar.s;
        fcsu fcsuVar6 = cwlbVar.t;
        ((Optional) cwlbVar.u.b()).getClass();
        ((cogw) cwlbVar.v.b()).getClass();
        ((Optional) cwlbVar.w.b()).getClass();
        viewGroup.getClass();
        cpdwVar.getClass();
        baeaVar.getClass();
        cwla cwlaVar = new cwla(cssxVar, B2, fcsuVar5, this, viewGroup, cpdwVar2);
        this.j = cwlaVar;
        this.J = cwlaVar;
        if (!((Boolean) czwc.a.e()).booleanValue() || czwc.b()) {
            this.e = new cpdw(this, R.id.reminder_icon, R.id.reminder_icon_inflated);
        } else {
            this.s.isPresent();
            Object obj = this.s.get();
            cpdw cpdwVar3 = new cpdw(this, R.id.reminder_icon, R.id.reminder_icon_inflated, R.layout.reminder_icon_view);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) cpdwVar3.b();
            String str = true != ((czwt) obj).b.g() ? "reminder_animation_light_forward.json" : "reminder_animation_dark_forward.json";
            lottieAnimationView.g(str);
            ekrw ekrwVarE = czwt.a.e();
            ekrwVarE.X(eksq.a, "ReminderAnimation");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/reminder/animation/ReminderAnimatedViewPresenterImpl", "setupAnimatedReminderView", 42, "ReminderAnimatedViewPresenterImpl.java")).t("Setting up animation view %s", str);
            this.e = cpdwVar3;
        }
        ((Optional) this.u.b()).ifPresent(new Consumer() { // from class: cwlh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                ((cvun) obj2).a(this.a.g, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.u.b()).ifPresent(new Consumer() { // from class: cwli
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                ((cvun) obj2).a(this.a.h, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.i = new cpdw(this, R.id.reply_button, R.id.reply_button_inflated);
        ((Optional) this.v.b()).map(new Function() { // from class: cwlr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cpdw cpdwVar4 = this.a.i;
                cpdwVar4.getClass();
                ((eijm) ((ahsn) obj2).a.b()).getClass();
                return new ahso(cpdwVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cpdw cpdwVar4 = this.i;
        cpdwVar4.getClass();
        if (cpdwVar4.i()) {
            cpdwVar4.getClass();
            ((ComposeView) cpdwVar4.b()).setVisibility(8);
        }
        if (((Boolean) ((cczi) stu.a.get()).e()).booleanValue()) {
            dakl.g(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        baea baeaVar = this.d;
        int iE = baeaVar.e();
        int iN = baeaVar.c.n();
        int iB = baeaVar.b();
        if ((iE == 8 || iE == 19) && iN == 0 && !baui.q(iB) && !baui.u(iB)) {
            ekrg ekrgVar = cpga.a;
            if (cpga.g(getContext()) && motionEvent.getAction() == 0) {
                float fAbs = Math.abs((getMeasuredWidth() / 2) - motionEvent.getX());
                int iMin = Math.min(getBottom(), ((View) getParent()).getHeight()) - Math.max(getTop(), 0);
                float fAbs2 = Math.abs(((iMin / 2) + (r1 - getTop())) - motionEvent.getY());
                if (fAbs <= 1.0f && fAbs2 <= 1.0f) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        int i5;
        int measuredWidth;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iA;
        int i13;
        int iG;
        int i14;
        int dimensionPixelSize;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        final boolean z2;
        final int i35;
        final int i36;
        int i37;
        final int i38;
        int i39;
        int i40;
        int iG2;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int iB;
        int i48;
        int dimensionPixelSize2;
        int iA2;
        int i49;
        int iD;
        int dimensionPixelSize3;
        cwls cwlsVar = this.w;
        int measuredWidth2 = this.f.getMeasuredWidth();
        int iC = c();
        int iF = f();
        int iE = e();
        int measuredWidth3 = this.g.getMeasuredWidth();
        int iL = l();
        int measuredWidth4 = this.e.i() ? ((ImageView) this.e.b()).getMeasuredWidth() : 0;
        int measuredHeight = this.e.i() ? ((ImageView) this.e.b()).getMeasuredHeight() : 0;
        ConversationMessageMetadataView conversationMessageMetadataView = ((cwkr) this.A.b()).a;
        if (conversationMessageMetadataView == null) {
            fdbq.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        int measuredWidth5 = conversationMessageMetadataView.getMeasuredWidth();
        int iJ = j();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i50 = this.k;
        cpdw cpdwVar = this.i;
        if (cpdwVar == null || !cpdwVar.i()) {
            i5 = measuredWidth2;
            measuredWidth = 0;
        } else {
            measuredWidth = ((ComposeView) cpdwVar.b()).getMeasuredWidth();
            i5 = measuredWidth2;
        }
        cpdw cpdwVar2 = this.i;
        int measuredHeight2 = (cpdwVar2 == null || !cpdwVar2.i()) ? 0 : ((ComposeView) cpdwVar2.b()).getMeasuredHeight();
        final int i51 = i3 - i;
        int iK = k();
        int paddingTop = getPaddingTop();
        Resources resources = getResources();
        Optional optional = cwlsVar.a;
        optional.isPresent();
        optional.get();
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_message);
        optional.isPresent();
        optional.get();
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_bottom);
        if (i() == 0) {
            int i52 = i51 / 2;
            int i53 = measuredWidth3 / 2;
            i7 = iL + paddingTop;
            int i54 = i52 + i53;
            i6 = dimensionPixelSize5;
            i9 = i52 - i53;
            i8 = i54;
        } else {
            i6 = dimensionPixelSize5;
            i7 = paddingTop;
            i8 = 0;
            i9 = 0;
        }
        int i55 = measuredWidth4;
        int i56 = i7 + iC;
        int i57 = measuredWidth;
        int i58 = i56 - i6;
        int i59 = i58 - measuredHeight;
        if (q()) {
            int i60 = paddingStart + iF;
            if (o()) {
                i39 = i50 + i60;
                i40 = i39 + i5;
                iG2 = p() ? g() + i39 + dimensionPixelSize4 : i40 + dimensionPixelSize4;
                i41 = iG2 + i55;
                i42 = 0;
                paddingStart = 0;
                i60 = 0;
                i43 = 0;
            } else {
                i39 = i50 + i60;
                i40 = i39 + i5;
                int i61 = i56 - iE;
                if (i61 < i7) {
                    i42 = i7 + iE;
                    i43 = i7;
                } else {
                    i43 = i61;
                    i42 = i56;
                }
                iG2 = p() ? i39 + g() + dimensionPixelSize4 : i40 + dimensionPixelSize4;
                i41 = iG2 + i55;
            }
            if (o() || a() == 0) {
                i44 = i42;
                i45 = iJ;
                i46 = paddingStart;
                i47 = i60;
                iB = 0;
                i48 = 0;
                dimensionPixelSize2 = 0;
                iA2 = 0;
            } else {
                i44 = i42;
                wb wbVar = ((RecyclerView) this.E.b()).o;
                wbVar.getClass();
                i45 = iJ;
                int iH = h();
                i46 = paddingStart;
                i47 = i60;
                int i62 = 0;
                int i63 = 0;
                while (i62 < wbVar.as()) {
                    View viewAE = wbVar.aE(i62);
                    viewAE.getClass();
                    int iBr = i63 + wb.br(viewAE);
                    if (iBr > iH) {
                        break;
                    }
                    i62++;
                    i63 = iBr;
                }
                if (i63 != 0) {
                    i48 = (iH + i39) - i63;
                    iB = b() + i48;
                    dimensionPixelSize2 = i56 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                    iA2 = a() + dimensionPixelSize2;
                } else if (b() != 0) {
                    i48 = i39;
                    iB = b() + i48;
                    dimensionPixelSize2 = i56 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                    iA2 = a() + dimensionPixelSize2;
                } else {
                    i63 = 0;
                    i48 = (iH + i39) - i63;
                    iB = b() + i48;
                    dimensionPixelSize2 = i56 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                    iA2 = a() + dimensionPixelSize2;
                }
            }
            int i64 = i39 + measuredWidth5;
            int i65 = iA2 != 0 ? iA2 : i56;
            int i66 = i65 + i45;
            int iH2 = h();
            int iA3 = cwls.a(this, i7, i56, measuredHeight2, iK);
            int i67 = measuredHeight2 + iA3;
            if (p()) {
                iD = i39 + d();
                i49 = i67;
                dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i49 = i67;
                iD = i39 + iH2;
                dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            i15 = iD + dimensionPixelSize3;
            int i68 = i40;
            i31 = i15 + i57;
            i34 = i68;
            int i69 = i46;
            i18 = iA2;
            i25 = i69;
            i16 = iB;
            i19 = iG2;
            i20 = i66;
            i21 = i65;
            i22 = i47;
            i23 = i44;
            i26 = dimensionPixelSize2;
            i28 = i39;
            i29 = i41;
            i27 = i64;
            i32 = iA3;
            i17 = i48;
            i33 = i28;
            i24 = i43;
            i30 = i49;
        } else {
            int i70 = i51 - paddingEnd;
            int i71 = i70 - i5;
            if (a() != 0) {
                int iB2 = i70 - b();
                int dimensionPixelSize6 = i56 - resources.getDimensionPixelSize(R.dimen.badge_overlap_message_bubble);
                iA = a() + dimensionPixelSize6;
                i12 = dimensionPixelSize6;
                i11 = iB2;
                i10 = i70;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                iA = 0;
            }
            int i72 = i70 - measuredWidth5;
            int i73 = iA != 0 ? iA : i56;
            int i74 = i73 + iJ;
            if (p()) {
                int iG3 = ((i70 - g()) - i55) - dimensionPixelSize4;
                iG = (i70 - g()) - dimensionPixelSize4;
                i13 = iG3;
            } else {
                i13 = (i71 - i55) - dimensionPixelSize4;
                iG = i71 - dimensionPixelSize4;
            }
            int iA4 = cwls.a(this, i7, i56, measuredHeight2, iK);
            int i75 = measuredHeight2 + iA4;
            if (p()) {
                i14 = i75;
                dimensionPixelSize = (i70 - d()) - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            } else {
                i14 = i75;
                dimensionPixelSize = i71 - resources.getDimensionPixelSize(R.dimen.reply_button_horizontal_margin);
            }
            i15 = dimensionPixelSize - i57;
            i16 = i10;
            i17 = i11;
            i18 = iA;
            i19 = i13;
            i20 = i74;
            i21 = i73;
            i22 = 0;
            i23 = 0;
            i24 = 0;
            i25 = 0;
            i26 = i12;
            i27 = i70;
            i28 = i72;
            i29 = iG;
            i30 = i14;
            i31 = dimensionPixelSize;
            i32 = iA4;
            i33 = i71;
            i34 = i27;
        }
        Rect rect = new Rect(i9, paddingTop, i8, i7);
        Rect rect2 = new Rect(i25, i24, i22, i23);
        Rect rect3 = new Rect(i33, i7, i34, i56);
        Rect rect4 = new Rect(i19, i59, i29, i58);
        Rect rect5 = new Rect(i28, i21, i27, i20);
        Rect rect6 = new Rect(i17, i26, i16, i18);
        final Rect rect7 = new Rect(i15, i32, i31, i30);
        ContactIconView contactIconView = this.D;
        int i76 = 8;
        if (rect2.top != rect2.bottom && rect2.left != rect2.right) {
            i76 = 0;
        }
        contactIconView.setVisibility(i76);
        int i77 = rect.left;
        int i78 = rect.right;
        int i79 = rect.top;
        int i80 = rect.bottom;
        int i81 = rect2.left;
        int i82 = rect2.right;
        int i83 = rect2.top;
        int i84 = rect2.bottom;
        int i85 = rect3.left;
        int i86 = i51 - i85;
        int i87 = rect3.right;
        int i88 = i51 - i87;
        int i89 = rect3.top;
        int i90 = rect3.bottom;
        int i91 = rect5.left;
        int i92 = rect5.right;
        int i93 = rect5.top;
        int i94 = rect5.bottom;
        int i95 = rect6.left;
        int i96 = rect6.right;
        int i97 = rect6.top;
        int i98 = rect6.bottom;
        boolean z3 = getLayoutDirection() == 1;
        if (z3) {
            this.D.layout(i51 - i82, i83, i51 - i81, i84);
            this.f.layout(i88, i89, i86, i90);
            ((cwkr) this.A.b()).a(i51 - i92, i93, i51 - i91, i94);
        } else {
            this.D.layout(i81, i83, i82, i84);
            this.f.layout(i85, i89, i87, i90);
            ((cwkr) this.A.b()).a(i91, i93, i92, i94);
        }
        BadgesRecyclerView badgesRecyclerView = (BadgesRecyclerView) this.E.b();
        badgesRecyclerView.setClipToOutline(true);
        badgesRecyclerView.H().a.setOnTouchListener(new View.OnTouchListener() { // from class: ueu
            /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                /*
                    r3 = this;
                    int r5 = r5.getAction()
                    r0 = 0
                    r1 = 1
                    if (r5 == 0) goto L19
                    if (r5 == r1) goto L11
                    r2 = 2
                    if (r5 == r2) goto L19
                    r1 = 3
                    if (r5 == r1) goto L11
                    goto L20
                L11:
                    android.view.ViewParent r4 = r4.getParent()
                    r4.requestDisallowInterceptTouchEvent(r0)
                    goto L20
                L19:
                    android.view.ViewParent r4 = r4.getParent()
                    r4.requestDisallowInterceptTouchEvent(r1)
                L20:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ueu.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        int iMax = Math.max(getPaddingStart(), i95);
        int iMin = Math.min(i51 - getPaddingEnd(), i96);
        if (z3) {
            int i99 = iMin - iMax;
            int i100 = i51 - iMax;
            int i101 = i100 - i99;
            iMin = i100;
            iMax = i101;
        }
        badgesRecyclerView.layout(iMax, i97, iMin, i98);
        final int i102 = rect4.left;
        final int i103 = rect4.right;
        final int i104 = rect4.top;
        final int i105 = rect4.bottom;
        this.s.isPresent();
        Resources resources2 = getResources();
        this.s.get();
        int dimensionPixelSize7 = resources2.getDimensionPixelSize(R.dimen.reminder_icon_padding_to_message);
        if (p() && (this.d.T() || !TextUtils.isEmpty(((cmvy) this.z.b()).c(getResources(), this.d.w())) || this.d.ar())) {
            int measuredWidth6 = this.f.a.getMeasuredWidth();
            int iAbs = Math.abs(i103 - i102);
            if (z3) {
                int iAbs2 = Math.abs(i88 - i86);
                if (q()) {
                    i36 = (i88 + (iAbs2 - measuredWidth6)) - dimensionPixelSize7;
                    i38 = i36 - iAbs;
                } else {
                    i37 = i88 + measuredWidth6 + dimensionPixelSize7;
                    i36 = i37 + iAbs;
                    i38 = i37;
                }
            } else if (q()) {
                i37 = measuredWidth6 + i85 + dimensionPixelSize7;
                i36 = i37 + iAbs;
                i38 = i37;
            } else {
                i36 = (i87 - measuredWidth6) - dimensionPixelSize7;
                i38 = i36 - iAbs;
            }
            this.e.d(new Consumer() { // from class: cwlj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczv cczvVar = ConversationMessageView.a;
                    ((ImageView) obj).layout(i38, i104, i36, i105);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            z2 = z3;
            i35 = i51;
        } else {
            cpdw cpdwVar3 = this.e;
            final boolean z4 = z3;
            Consumer consumer = new Consumer() { // from class: cwlk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ImageView imageView = (ImageView) obj;
                    cczv cczvVar = ConversationMessageView.a;
                    int i106 = i51;
                    int i107 = i103;
                    int i108 = i102;
                    boolean z5 = z4;
                    int i109 = z5 ? i106 - i107 : i108;
                    if (z5) {
                        i107 = i106 - i108;
                    }
                    imageView.layout(i109, i104, i107, i105);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            z2 = z4;
            i35 = i51;
            cpdwVar3.d(consumer);
        }
        this.g.layout(i77, i79, i78, i80);
        cpdw cpdwVar4 = this.i;
        if (cpdwVar4 != null) {
            cpdwVar4.d(new Consumer() { // from class: cwlg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ComposeView composeView = (ComposeView) obj;
                    cczv cczvVar = ConversationMessageView.a;
                    int i106 = i35;
                    Rect rect8 = rect7;
                    boolean z5 = z2;
                    composeView.layout(z5 ? i106 - rect8.right : rect8.left, rect8.top, z5 ? i106 - rect8.left : rect8.right, rect8.bottom);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }
        if (((Boolean) c.e()).booleanValue()) {
            ((eksl) ((eksl) B.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onLayout", 727, "ConversationMessageView.java")).K("ConversationMessageView{%s}.onLayout: contentStart=%s, contentEnd=%s, contentTop=%s, contentBottom=%s", this.d.r(), Integer.valueOf(i85), Integer.valueOf(i87), Integer.valueOf(i89), Integer.valueOf(i90));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.J.a(view)) {
            View.OnLongClickListener onLongClickListener = this.L;
            return onLongClickListener != null ? onLongClickListener.onLongClick(view) : performLongClick();
        }
        Object tag = view.getTag();
        if (tag instanceof MessagePartData) {
            this.n.i(view);
            r((MessagePartCoreData) tag, true);
            return false;
        }
        if (((Boolean) a.e()).booleanValue()) {
            return performLongClick();
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        cwls cwlsVar = this.w;
        int size = View.MeasureSpec.getSize(i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_message_contact_icon_size);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        Optional optional = cwlsVar.a;
        optional.isPresent();
        optional.get();
        View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.reminder_icon_size), 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.D.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        m(iMakeMeasureSpec3, iMakeMeasureSpec3);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.message_margin_default);
        float f = f();
        int iMin = Math.min((((size - ((int) (f + f))) - dimensionPixelSize2) - getPaddingStart()) - getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.message_bubble_max_width));
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        this.f.measure(iMakeMeasureSpec4, iMakeMeasureSpec);
        this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        ConversationMessageMetadataView conversationMessageMetadataView = ((cwkr) this.A.b()).a;
        if (conversationMessageMetadataView == null) {
            fdbq.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.measure(iMakeMeasureSpec4, iMakeMeasureSpec);
        if (this.E.i()) {
            ((BadgesRecyclerView) this.E.b()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        cpdw cpdwVar = this.i;
        if (cpdwVar != null && cpdwVar.i()) {
            ((ComposeView) cpdwVar.b()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        cpdw cpdwVar2 = this.C;
        if (cpdwVar2 != null && cpdwVar2.i()) {
            int paddingStart = (iMin - ((MessageAttachmentsView) cpdwVar2.b()).getPaddingStart()) - ((MessageAttachmentsView) this.C.b()).getPaddingEnd();
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(paddingStart, 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.audio_attachment_view_playback_height), 1073741824));
            }
        }
        int paddingTop = getPaddingTop() + Math.max(e(), c() + j() + a()) + (i() == 0 ? l() : 0) + getPaddingBottom();
        setMeasuredDimension(size, paddingTop);
        if (((Boolean) c.e()).booleanValue()) {
            ((eksl) ((eksl) B.h()).h("com/google/android/apps/messaging/ui/conversation/message/ConversationMessageView", "onMeasure", 378, "ConversationMessageView.java")).I("ConversationMessageView{%s}.onMeasure: %s x %s", this.d.r(), Integer.valueOf(size), Integer.valueOf(paddingTop));
        }
    }

    protected final boolean p() {
        return this.C.i() && ((MessageAttachmentsView) this.C.b()).c.getChildCount() > 0;
    }

    protected final boolean q() {
        return this.d.Z();
    }

    public final void r(MessagePartCoreData messagePartCoreData, boolean z) {
        if (messagePartCoreData != null) {
            throw null;
        }
        TextView textView = ((cwla) this.J).b;
        if (textView == null) {
            return;
        }
        if (z) {
            onLongClick(textView);
        } else {
            onClick(textView);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.K = onClickListener;
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.L = onLongClickListener;
    }
}
