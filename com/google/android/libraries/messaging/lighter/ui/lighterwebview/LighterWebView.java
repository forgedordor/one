package com.google.android.libraries.messaging.lighter.ui.lighterwebview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import defpackage.dwye;
import defpackage.dxbq;
import defpackage.ejud;
import defpackage.ejwi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LighterWebView extends LinearLayout implements dwye {
    public final WebView a;
    public final Toolbar b;
    public final LighterWebViewHeader c;
    public ejwi d;
    public ejwi e;

    public LighterWebView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public final Boolean b(WebView webView, String str) {
        if (!str.startsWith("tel:")) {
            webView.loadUrl(str);
            return false;
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(str));
        getContext().startActivity(intent);
        return true;
    }

    public final void c(ejwi ejwiVar, View view) {
        view.setVisibility(0);
        if (ejwiVar.g()) {
            ((OverlayView) ejwiVar.c()).setVisibility(0);
        }
        setVisibility(8);
        ejud ejudVar = ejud.a;
        this.d = ejudVar;
        this.e = ejudVar;
    }

    public final void d(String str, final ejwi ejwiVar, final View view) {
        ejud ejudVar = ejud.a;
        dxbq dxbqVar = new dxbq(this, ejudVar);
        WebView webView = this.a;
        webView.setWebViewClient(dxbqVar);
        webView.loadUrl(str);
        if (ejwiVar.g()) {
            ((OverlayView) ejwiVar.c()).setVisibility(8);
        }
        view.setVisibility(8);
        Toolbar toolbar = this.b;
        toolbar.t(new View.OnClickListener() { // from class: dxbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.c(ejwiVar, view);
            }
        });
        setVisibility(0);
        webView.getSettings().setJavaScriptEnabled(true);
        this.c.setVisibility(8);
        toolbar.setVisibility(0);
        this.d = ejudVar;
        this.e = ejudVar;
    }

    public LighterWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LighterWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ejud ejudVar = ejud.a;
        this.d = ejudVar;
        this.e = ejudVar;
        inflate(getContext(), R.layout.web_view_layout, this);
        this.a = (WebView) findViewById(R.id.web_view);
        this.b = (Toolbar) findViewById(R.id.toolbar_web);
        this.c = (LighterWebViewHeader) findViewById(R.id.custom_header);
    }
}
