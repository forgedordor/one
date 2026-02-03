package defpackage;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebwj extends ConstraintLayout implements ebxi, ebwn {
    public final ebun d;
    public final RecyclerView e;
    public final ImageView f;
    public final View g;
    public final ebwd h;
    private final ebwo i;
    private final TextView j;
    private final ImageButton k;
    private final ebwi l;
    private final ebxh m;

    public ebwj(Context context, ebxh ebxhVar) {
        super(context);
        this.m = ebxhVar;
        setId(R.id.favorites_sticker_packs_view);
        ebun ebunVarB = ((ebuo) getContext().getApplicationContext()).b();
        this.d = ebunVarB;
        this.i = new ebwo(ebunVarB);
        inflate(getContext(), R.layout.favorite_sticker_packs_layout, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.favorites_recycler_view);
        this.e = recyclerView;
        this.f = (ImageView) findViewById(R.id.empty_favorites_image);
        this.j = (TextView) findViewById(R.id.empty_favorites_text);
        View viewFindViewById = findViewById(R.id.favorites_prompt);
        this.g = viewFindViewById;
        ImageButton imageButton = (ImageButton) findViewById(R.id.favorites_prompt_close_button);
        this.k = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: ebwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebwj ebwjVar = this.a;
                ebwjVar.d.o().c(false);
                ebwjVar.e(true);
            }
        });
        ebwd ebwdVar = new ebwd(ebunVarB, ebxhVar);
        this.h = ebwdVar;
        getContext();
        recyclerView.ao(new LinearLayoutManager());
        recyclerView.al(ebwdVar);
        ebwdVar.A(new ebwg(this));
        ebwi ebwiVar = new ebwi(ebwdVar);
        this.l = ebwiVar;
        ebunVarB.j(ebwiVar);
        if (ebxhVar.G()) {
            int color = getContext().getColor(R.color.white);
            TextView textView = (TextView) findViewById(R.id.favorites_prompt_text);
            TextView textView2 = (TextView) findViewById(R.id.empty_favorites_text);
            viewFindViewById.setBackground(getResources().getDrawable(R.drawable.favorites_prompt_background_dark_mode));
            imageButton.getDrawable().mutate().setTint(color);
            textView.setTextColor(color);
            textView2.setTextColor(color);
        }
    }

    private final void g() {
        if (this.g.getVisibility() != 0 || this.d.o().e()) {
            return;
        }
        e(false);
    }

    @Override // defpackage.ebxi
    public final void b() {
        g();
        ((ebxs) this.d.a()).g(7);
    }

    @Override // defpackage.ebxi
    public final void c() {
        ebwd ebwdVar = this.h;
        Set set = ebwdVar.f;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ebwdVar.l((String) it.next());
        }
        set.clear();
        g();
    }

    public final void d() {
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void e(boolean z) {
        View view = this.g;
        if (view.getVisibility() == 8) {
            return;
        }
        this.k.setClickable(false);
        if (!z) {
            view.setVisibility(8);
        } else {
            view.setVisibility(4);
            this.e.animate().translationY(-view.getHeight()).setDuration(300L).setListener(new ebwh(this));
        }
    }

    public final void f() {
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        e(false);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        RecyclerView recyclerView = this.e;
        recyclerView.setSystemUiVisibility(1280);
        recyclerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebwe
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                view.setPadding(0, this.a.getResources().getDimensionPixelSize(R.dimen.favorites_view_padding_top), 0, windowInsets2.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ebwo ebwoVar = this.i;
        ebwoVar.b = this;
        ebun ebunVar = ebwoVar.a;
        eosc eoscVarH = ebunVar.h();
        final ebvk ebvkVarO = ebunVar.o();
        ebwoVar.c = eoscVarH.submit(new Callable() { // from class: ebwk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ebvkVarO.e());
            }
        });
        ListenableFuture listenableFuture = ebwoVar.c;
        ebwl ebwlVar = new ebwl(ebwoVar);
        ebvf ebvfVar = ebvf.a;
        eork.r(listenableFuture, ebwlVar, ebvfVar);
        ebwoVar.d = ebunVar.b();
        eork.r(ebwoVar.d, new ebwm(ebwoVar), ebvfVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ebwo ebwoVar = this.i;
        ebwoVar.b = null;
        ListenableFuture listenableFuture = ebwoVar.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        ListenableFuture listenableFuture2 = ebwoVar.d;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(true);
        }
        this.d.l(this.l);
        ebwd ebwdVar = this.h;
        Iterator it = ebwdVar.h.values().iterator();
        while (it.hasNext()) {
            ((ListenableFuture) it.next()).cancel(true);
        }
        Iterator it2 = ebwdVar.i.values().iterator();
        while (it2.hasNext()) {
            ((ListenableFuture) it2.next()).cancel(true);
        }
    }
}
