package com.google.android.libraries.messaging.lighter.ui.conversation;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebViewHeader;
import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import com.google.android.libraries.messaging.lighter.ui.statusbar.TextStatusBarHolderView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import defpackage.dvhv;
import defpackage.dwng;
import defpackage.dwqa;
import defpackage.dwqf;
import defpackage.dwqs;
import defpackage.dwxl;
import defpackage.dwxm;
import defpackage.dwyf;
import defpackage.dwyh;
import defpackage.dwyo;
import defpackage.dwyy;
import defpackage.dwzn;
import defpackage.dxaw;
import defpackage.dxbd;
import defpackage.dxbl;
import defpackage.dxbr;
import defpackage.dxdy;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.fbfm;
import defpackage.ley;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationView extends FrameLayout implements dwzn {
    public final MessageListView a;
    private final LinearLayout b;
    private final AppBarLayout c;
    private dxbd d;
    private final dwyy e;
    private final CoordinatorLayout f;
    private final ViewGroup g;
    private final OverlayView h;
    private final LighterWebView i;
    private final int j;
    private dwxl k;
    private dwyf l;
    private String m;
    private String n;
    private final TextStatusBarHolderView o;
    private final TextStatusBarHolderView p;

    public ConversationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* synthetic */ void a(Object obj) {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: dxay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getContext();
            }
        });
        this.l = ((dxaw) obj).e;
    }

    @Override // defpackage.dwzn
    public final View b() {
        return this.c;
    }

    @Override // defpackage.dwzn
    public final View c() {
        return this.b;
    }

    @Override // defpackage.dwzn
    public final dwyy d() {
        return this.e;
    }

    @Override // defpackage.dwzn
    public final dxbd e() {
        return this.d;
    }

    @Override // defpackage.dwzn
    public final LighterWebView f() {
        return this.i;
    }

    @Override // defpackage.dwzn
    public final OverlayView g() {
        return this.h;
    }

    @Override // defpackage.dwzn
    public final String h() {
        return this.n;
    }

    @Override // defpackage.dwzn
    public final String i() {
        return this.m;
    }

    @Override // defpackage.dwzn
    public final void j(dxdy dxdyVar) {
        TextStatusBarHolderView textStatusBarHolderView = this.p;
        dxdy dxdyVar2 = textStatusBarHolderView.a;
        if (dxdyVar2 != null && dxdyVar2.equals(dxdyVar) && textStatusBarHolderView.b()) {
            textStatusBarHolderView.removeView((View) textStatusBarHolderView.a);
            textStatusBarHolderView.a = null;
        }
    }

    @Override // defpackage.dwzn
    public final void k() {
        int[] iArr = ley.a;
        this.b.setImportantForAccessibility(0);
        this.h.setVisibility(8);
    }

    @Override // defpackage.dwzn
    public final void l(dwxl dwxlVar) {
        this.k = dwxlVar;
    }

    @Override // defpackage.dwzn
    public final void m(String str) {
        this.n = str;
    }

    @Override // defpackage.dwzn
    public final void n(String str) {
        this.m = str;
    }

    @Override // defpackage.dwzn
    public final boolean o() {
        return this.p.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [ejwi] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v25, types: [ejwi] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        String string;
        final ejud ejudVar;
        boolean z;
        JSONException jSONException;
        ejud ejudVar2;
        ejud ejudVar3;
        ejud ejudVarL = ejud.a;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.m = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD");
            this.n = (String) bundle.get("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE");
            Parcelable parcelable2 = bundle.getParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW");
            z = bundle.getBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY");
            string = bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL");
            try {
                ejud ejudVarC = bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER") ? dwqa.c(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER"))) : ejudVarL;
                try {
                    ejudVar3 = ejudVarC;
                    if (bundle.containsKey("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")) {
                        ejudVarL = dwqs.l(new JSONObject(bundle.getString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER")));
                        ejudVar3 = ejudVarC;
                    }
                } catch (JSONException e) {
                    jSONException = e;
                    ejudVar2 = ejudVarC;
                    dvhv.d("ConversationView", "Fail to convert customized web view or reaction overlay header to json", jSONException);
                    ejudVar3 = ejudVar2;
                    ejudVar = ejudVarL;
                    parcelable = parcelable2;
                    ejudVarL = ejudVar3;
                    super.onRestoreInstanceState(parcelable);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (JSONException e2) {
                jSONException = e2;
                ejudVar2 = ejudVarL;
            }
            ejudVar = ejudVarL;
            parcelable = parcelable2;
            ejudVarL = ejudVar3;
        } else {
            string = null;
            ejudVar = ejudVarL;
            z = false;
        }
        super.onRestoreInstanceState(parcelable);
        if (z || string == null) {
            return;
        }
        if (!ejudVarL.g()) {
            this.i.d(string, ejud.a, this.b);
            return;
        }
        final LighterWebView lighterWebView = this.i;
        Object objC = ejudVarL.c();
        final LinearLayout linearLayout = this.b;
        final dwxl dwxlVar = this.k;
        final OverlayView overlayView = this.h;
        final boolean z2 = findViewById(R.id.app_bar).getHeight() == findViewById(R.id.app_bar).getBottom();
        final dwyf dwyfVar = this.l;
        dxbr dxbrVar = new dxbr(lighterWebView, ejwi.i(dwyfVar));
        WebView webView = lighterWebView.a;
        webView.setWebViewClient(dxbrVar);
        dwng dwngVar = (dwng) objC;
        webView.loadUrl(dwngVar.b);
        linearLayout.setVisibility(8);
        lighterWebView.setVisibility(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new dxbl(lighterWebView, new Runnable() { // from class: dxbp
            @Override // java.lang.Runnable
            public final void run() {
                lighterWebView.c(ejud.a, linearLayout);
                final ejwi ejwiVar = ejudVar;
                if (ejwiVar.g()) {
                    final OverlayView overlayView2 = overlayView;
                    boolean z3 = z2;
                    final dwxl dwxlVar2 = dwxlVar;
                    overlayView2.b((dwqs) ejwiVar.c(), z3);
                    Object objC2 = ejwiVar.c();
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dxbn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ejwi ejwiVar2 = ejwiVar;
                            if (((dwnv) ejwiVar2.c()).a.g()) {
                                dwxlVar2.a((dwjr) ((dwnv) ejwiVar2.c()).a.c());
                            }
                            overlayView2.setVisibility(8);
                        }
                    };
                    ImageView imageView = overlayView2.c;
                    if (OverlayView.c(imageView)) {
                        imageView.setOnClickListener(onClickListener);
                    }
                    if (((dwnv) objC2).h) {
                        overlayView2.setOnClickListener(onClickListener);
                        MaterialCardView materialCardView = overlayView2.b;
                        materialCardView.setClickable(false);
                        materialCardView.setOnClickListener(null);
                    } else {
                        overlayView2.b.setClickable(false);
                        overlayView2.setOnClickListener(null);
                    }
                    if (((dwnv) ejwiVar.c()).h) {
                        overlayView2.postDelayed(new Runnable() { // from class: dxdp
                            @Override // java.lang.Runnable
                            public final void run() {
                                overlayView2.requestFocus();
                            }
                        }, 100L);
                    } else {
                        overlayView2.requestFocus();
                        overlayView2.sendAccessibilityEvent(32768);
                    }
                    overlayView2.postDelayed(new Runnable() { // from class: dxbo
                        @Override // java.lang.Runnable
                        public final void run() {
                            overlayView2.setVisibility(8);
                        }
                    }, TimeUnit.SECONDS.toMillis(((dwnv) ejwiVar.c()).e));
                }
                dwyf dwyfVar2 = dwyfVar;
                if (dwyfVar2 != null) {
                    ((dxba) dwyfVar2).d(126);
                }
            }
        }), "LighterEmbeddedWebBridge");
        lighterWebView.b.setVisibility(8);
        dwqs dwqsVar = dwngVar.a;
        boolean zG = dwqsVar.g().g();
        LighterWebViewHeader lighterWebViewHeader = lighterWebView.c;
        if (zG) {
            Object objC2 = dwqsVar.g().c();
            ImageView imageView = lighterWebViewHeader.a;
            dwqf dwqfVar = (dwqf) objC2;
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(dwqfVar.e(), 0, dwqfVar.e().length));
            imageView.setContentDescription(dwqfVar.d());
        }
        if (dwqsVar.e().g()) {
            lighterWebViewHeader.b.setText(dwqsVar.e().c());
        }
        lighterWebViewHeader.setVisibility(0);
        LighterWebViewHeader.a(lighterWebViewHeader.a, dwqsVar.g().g());
        LighterWebViewHeader.a(lighterWebViewHeader.b, dwqsVar.e().g());
        LighterWebViewHeader.a(lighterWebViewHeader.c, dwqsVar.c().g());
        lighterWebView.d = ejwi.j(objC);
        lighterWebView.e = ejudVar;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() throws JSONException {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.libraries.messaging.lighter.ui.conversation.STATE_CONVERSATION_VIEW", parcelableOnSaveInstanceState);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.MESSAGE_CALLBACK_PAYLOAD", this.m);
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.PREFILL_SUGGESTION_TEXT_MESSAGE", this.n);
        bundle.putBoolean("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_VISIBILITY", findViewById(R.id.lighter_web_view_body).getVisibility() == 0);
        LighterWebView lighterWebView = this.i;
        bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.WEB_VIEW_URL", lighterWebView.a.getUrl());
        if (lighterWebView.d.g()) {
            ejwi ejwiVarD = dwqa.d((dwqa) lighterWebView.d.c());
            if (ejwiVarD.g()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.CUSTOMIZED_WEB_VIEW_HEADER", ((JSONObject) ejwiVarD.c()).toString());
            }
        }
        if (lighterWebView.e.g()) {
            ejwi ejwiVarM = ((dwqs) lighterWebView.e.c()).m();
            if (ejwiVarM.g()) {
                bundle.putString("com.google.android.libraries.messaging.lighter.ui.conversation.REACTION_OVERLAY_HEADER", ((JSONObject) ejwiVarM.c()).toString());
            }
        }
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Object obj = this.e;
        MessageListView messageListView = this.a;
        int iComputeVerticalScrollRange = messageListView.computeVerticalScrollRange();
        int height = (i2 - ((View) obj).getHeight()) - this.j;
        TextStatusBarHolderView textStatusBarHolderView = this.o;
        if (textStatusBarHolderView.b()) {
            height -= textStatusBarHolderView.getHeight();
        }
        if (o()) {
            height -= this.p.getHeight();
        }
        if (height < iComputeVerticalScrollRange + dwyo.a(getContext(), 30.0f)) {
            this.c.n(false, true);
            messageListView.setNestedScrollingEnabled(true);
        } else {
            this.c.n(true, true);
            messageListView.setNestedScrollingEnabled(false);
        }
    }

    @Override // defpackage.dwzn
    public final MessageListView p() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwzn
    public final void q(dxdy dxdyVar) {
        TextStatusBarHolderView textStatusBarHolderView = this.p;
        if (textStatusBarHolderView.b()) {
            return;
        }
        textStatusBarHolderView.a = dxdyVar;
        View view = (View) dxdyVar;
        view.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        textStatusBarHolderView.addView(view, layoutParams);
    }

    public ConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationView(Context context, AttributeSet attributeSet, int i) {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        this.k = dwxm.a;
        inflate(getContext(), R.layout.conversation_view_layout, this);
        this.b = (LinearLayout) findViewById(R.id.conversation_body);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_body);
        this.f = coordinatorLayout;
        this.d = (dxbd) findViewById(R.id.conversation_header);
        this.a = (MessageListView) findViewById(R.id.messages_list);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        this.c = appBarLayout;
        this.o = (TextStatusBarHolderView) findViewById(R.id.top_status_bar_holder);
        this.p = (TextStatusBarHolderView) findViewById(R.id.bottom_status_bar_holder);
        this.e = (dwyy) findViewById(R.id.compose_view);
        this.g = (ViewGroup) findViewById(R.id.composer_entrypoint_view);
        OverlayView overlayView = (OverlayView) findViewById(R.id.conv_overlay_view);
        this.h = overlayView;
        this.j = getResources().getDimensionPixelSize(R.dimen.header_expanded_height);
        coordinatorLayout.setOnTouchListener(new View.OnTouchListener() { // from class: dxaz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        overlayView.setVisibility(8);
        this.i = (LighterWebView) findViewById(R.id.lighter_web_view_body);
        appBarLayout.n(true, false);
        appBarLayout.j(this.d);
    }
}
