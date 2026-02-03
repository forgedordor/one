package com.google.android.libraries.stickers.packdetails;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.ebun;
import defpackage.ebvd;
import defpackage.ebve;
import defpackage.ebxs;
import defpackage.ebyn;
import defpackage.ebys;
import defpackage.ebyu;
import defpackage.ebyv;
import defpackage.eryr;
import defpackage.etyb;
import defpackage.etyu;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.iy;
import defpackage.raw;
import defpackage.rbv;
import defpackage.rqi;
import defpackage.rtj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PackDetailsActivity extends iy implements ebyu {
    private int n;
    private ebyv o;

    @Override // defpackage.ebyu
    public final boolean B() {
        return ebvd.a(this.n);
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        this.n = getIntent().getIntExtra("theme_mode", 0);
        if (B()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalStateException("Missing extras. Did you launch the activity using PackDetailsActivity#launchActivity()?");
        }
        try {
            final etyu etyuVar = (etyu) evsn.parseFrom(etyu.a, extras.getByteArray("sticker_pack"));
            ebyv ebyvVar = new ebyv(this, this);
            this.o = ebyvVar;
            setContentView(ebyvVar);
            final ebyv ebyvVar2 = this.o;
            ebyvVar2.m = etyuVar;
            ebun ebunVar = ebyvVar2.d;
            ebyvVar2.p = ebunVar.m(etyuVar.b);
            ebyvVar2.b();
            ebyvVar2.f.setText(etyuVar.e);
            ebyvVar2.g.setText(etyuVar.g);
            ebyvVar2.h.setText(etyuVar.f);
            int iB = eryr.b(ebunVar.i().b);
            ebyvVar2.n = new ebyn(etyuVar, iB == 0 || iB != 5, ebyvVar2.o);
            RecyclerView recyclerView = ebyvVar2.j;
            recyclerView.al(ebyvVar2.n);
            ImageView imageView = ebyvVar2.e;
            Resources resources = imageView.getContext().getResources();
            rbv rbvVarE = raw.e(ebyvVar2);
            etyb etybVar = etyuVar.d;
            if (etybVar == null) {
                etybVar = etyb.a;
            }
            rbvVarE.i(etybVar.c).q(new rtj().H(ebve.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), imageView, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rqi.b()).v(imageView);
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ebys(ebyvVar2));
            ebyvVar2.i.setOnClickListener(new View.OnClickListener() { // from class: ebyo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebyv ebyvVar3 = ebyvVar2;
                    ebyvVar3.i.setClickable(false);
                    boolean z = !ebyvVar3.p;
                    ebyvVar3.p = z;
                    etyu etyuVar2 = etyuVar;
                    ebun ebunVar2 = ebyvVar3.d;
                    ebyvVar3.k = ebunVar2.g(etyuVar2.b, z);
                    eork.r(ebyvVar3.k, new ebyt(ebyvVar3, view), ebvf.a);
                    ebunVar2.a().a(etyuVar2.b, eryy.PACK_DETAIL, ebyvVar3.p);
                }
            });
            if (ebyvVar2.isAttachedToWindow()) {
                ((ebxs) ebunVar.a()).h(etyuVar.b);
            }
            if (Build.VERSION.SDK_INT < 27) {
                return;
            }
            ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebyj
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return windowInsets;
                }
            });
            this.o.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebyk
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
        } catch (evtj e) {
            throw new RuntimeException("Failed to parse sticker pack from intent.", e);
        }
    }
}
