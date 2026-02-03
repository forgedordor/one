package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebvv extends FrameLayout implements ebxi {
    public final ebvr a;
    public final ebxh b;
    private final ebun c;
    private final ProgressBar d;
    private ListenableFuture e;
    private final ebvu f;
    private final RecyclerView g;

    public ebvv(Context context, ebxh ebxhVar) throws Resources.NotFoundException {
        super(context);
        this.b = ebxhVar;
        setId(R.id.browse_sticker_packs_view);
        ebun ebunVarB = ((ebuo) getContext().getApplicationContext()).b();
        this.c = ebunVarB;
        inflate(getContext(), R.layout.browse_sticker_packs_layout, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = progressBar;
        ebvr ebvrVar = new ebvr(ebunVarB, (AccessibilityManager) getContext().getSystemService("accessibility"), ebunVarB.n(), ebxhVar);
        this.a = ebvrVar;
        getContext();
        Context context2 = getContext();
        Resources resources = context2.getResources();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Math.max(ebve.a(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.browse_sticker_icon_size), resources.getDimension(R.dimen.browse_item_margin_lr), resources.getDimension(R.dimen.browse_view_padding_lr)), resources.getInteger(R.integer.browse_min_sticker_pack_per_row)));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.browse_recycler_view);
        this.g = recyclerView;
        recyclerView.ao(gridLayoutManager);
        recyclerView.al(ebvrVar);
        ebvu ebvuVar = new ebvu(ebvrVar);
        this.f = ebvuVar;
        ebunVarB.j(ebvuVar);
        if (ebxhVar.G()) {
            progressBar.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        }
    }

    public final void a() {
        this.d.setVisibility(8);
    }

    @Override // defpackage.ebxi
    public final void b() {
        ((ebxs) this.c.a()).g(6);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT < 27) {
            return windowInsets;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.setSystemUiVisibility(1280);
        recyclerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebvs
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) throws Resources.NotFoundException {
                ebvv ebvvVar = this.a;
                int dimensionPixelSize = ebvvVar.getResources().getDimensionPixelSize(R.dimen.browse_view_padding_lr);
                view.setPadding(dimensionPixelSize, ebvvVar.getResources().getDimensionPixelOffset(R.dimen.browse_view_padding_top), dimensionPixelSize, windowInsets2.getSystemWindowInsetBottom());
                return windowInsets2;
            }
        });
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListenableFuture listenableFutureD = this.c.d();
        this.e = listenableFutureD;
        eork.r(listenableFutureD, new ebvt(this), ebvf.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.cancel(true);
        this.c.l(this.f);
    }

    @Override // defpackage.ebxi
    public final void c() {
    }
}
