package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebxl extends ConstraintLayout implements ebwv {
    public final StickerSearchView d;
    public final ViewPager e;
    public RecyclerView f;
    public ProgressBar g;
    public ImageView h;
    public TextView i;
    public final ebxc j;
    public final ebxr k;
    public final ebxh l;
    private final Toolbar m;
    private final ViewFlipper n;
    private final TabLayout o;
    private MenuItem p;
    private final boolean q;
    private int r;
    private ebww s;

    public ebxl(Context context, ebxh ebxhVar) throws Resources.NotFoundException {
        super(context);
        this.r = -16777216;
        this.l = ebxhVar;
        setId(R.id.sticker_gallery_view);
        ebun ebunVarB = ((ebuo) getContext().getApplicationContext()).b();
        inflate(getContext(), R.layout.sticker_gallery_layout, this);
        this.k = ebunVarB.a();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.m = toolbar;
        toolbar.t(new View.OnClickListener() { // from class: ebxd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebxh ebxhVar2;
                ebxl ebxlVar = this.a;
                if (ebxlVar.e() || (ebxhVar2 = ebxlVar.l) == null) {
                    return;
                }
                ebxhVar2.B();
            }
        });
        StickerSearchView stickerSearchView = (StickerSearchView) findViewById(R.id.search_view);
        this.d = stickerSearchView;
        stickerSearchView.setVisibility(8);
        this.n = (ViewFlipper) findViewById(R.id.view_flipper);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.e = viewPager;
        ebxc ebxcVar = new ebxc(viewPager, ebxhVar);
        this.j = ebxcVar;
        viewPager.j(ebxcVar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.o = tabLayout;
        tabLayout.u(viewPager);
        int iB = eryr.b(ebunVarB.i().b);
        boolean z = iB == 0 || iB != 5;
        this.q = z;
        if (z) {
            toolbar.o(R.menu.sticker_gallery_search_menu);
            MenuItem menuItemFindItem = toolbar.h().findItem(R.id.action_search);
            this.p = menuItemFindItem;
            menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ebxg
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ebxl ebxlVar = this.a;
                    ebxlVar.d();
                    ebxlVar.d.requestFocus();
                    eryy eryyVar = eryy.SEARCH_ICON;
                    erza erzaVar = (erza) erzb.a.createBuilder();
                    erzaVar.copyOnWrite();
                    ((erzb) erzaVar.instance).b = eryz.a(20);
                    erzaVar.copyOnWrite();
                    ((erzb) erzaVar.instance).e = eryyVar.a();
                    ((ebxs) ebxlVar.k).f((erzb) erzaVar.build());
                    return true;
                }
            });
            this.f = (RecyclerView) findViewById(R.id.search_recycler_view);
            this.g = (ProgressBar) findViewById(R.id.search_progress_bar);
            this.h = (ImageView) findViewById(R.id.search_no_result_image);
            this.i = (TextView) findViewById(R.id.search_no_result_text);
            ebwr ebwrVar = new ebwr(ebxhVar);
            ebww ebwwVar = new ebww(ebunVarB, ebwrVar, this, ebxhVar);
            this.s = ebwwVar;
            stickerSearchView.d = ebwwVar;
            RecyclerView recyclerView = this.f;
            getContext();
            Context context2 = getContext();
            Resources resources = context2.getResources();
            recyclerView.ao(new GridLayoutManager(ebve.a(context2.getResources().getDisplayMetrics().widthPixels, resources.getDimension(R.dimen.search_sticker_icon_size), resources.getDimension(R.dimen.search_item_margin), resources.getDimension(R.dimen.search_view_padding_lr))));
            this.f.am(null);
            this.f.al(ebwrVar);
        }
        if (ebxhVar.H()) {
            toolbar.r(R.drawable.quantum_ic_arrow_back_black_24);
        }
        if (ebxhVar.G()) {
            int color = getContext().getColor(R.color.theme_color_dark_mode);
            int color2 = getContext().getColor(R.color.white);
            int color3 = getContext().getColor(R.color.sticker_gallery_tab_text_color_dark_mode);
            int color4 = getContext().getColor(R.color.sticker_gallery_tab_selected_color_dark_mode);
            int dimension = (int) getResources().getDimension(R.dimen.sticker_shadow_height_dark_mode);
            int color5 = getContext().getColor(R.color.sticker_shadow_color_dark_mode);
            this.r = color2;
            toolbar.e().mutate().setTint(color2);
            if (z) {
                this.p.getIcon().mutate().setTint(color2);
                stickerSearchView.b.getDrawable().mutate().setTint(color2);
            }
            tabLayout.setBackgroundColor(color);
            tabLayout.t(TabLayout.c(color3, color4));
            tabLayout.q(color4);
            View viewFindViewById = findViewById(R.id.view_pager_shadow);
            au auVar = (au) viewFindViewById.getLayoutParams();
            auVar.height = dimension;
            viewFindViewById.setLayoutParams(auVar);
            viewFindViewById.setBackgroundColor(color5);
            View viewFindViewById2 = findViewById(R.id.toolbar_shadow);
            au auVar2 = (au) viewFindViewById2.getLayoutParams();
            auVar2.height = dimension;
            viewFindViewById2.setLayoutParams(auVar2);
            viewFindViewById2.setBackgroundColor(color5);
            this.g.getIndeterminateDrawable().setColorFilter(getContext().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
            this.i.setTextColor(getContext().getColor(R.color.search_not_result_text_color_dark_mode));
        }
    }

    @Override // defpackage.ebwv
    public final void a() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }

    @Override // defpackage.ebwv
    public final void b(String str) {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.i.setText(getContext().getString(R.string.search_no_result_text, str));
        this.h.setVisibility(0);
        this.i.setVisibility(0);
    }

    public final void c() {
        StickerSearchView stickerSearchView = this.d;
        if (stickerSearchView.getVisibility() == 8) {
            return;
        }
        this.n.showPrevious();
        stickerSearchView.setVisibility(8);
        stickerSearchView.a.setText("");
        stickerSearchView.a.clearFocus();
        if (!this.l.H()) {
            Toolbar toolbar = this.m;
            toolbar.r(R.drawable.quantum_ic_close_black_24);
            if (this.r != -16777216) {
                toolbar.e().mutate().setTint(this.r);
            }
        }
        this.p.setVisible(true);
        ebww ebwwVar = this.s;
        if (ebwwVar != null) {
            ebwwVar.a();
            ebwwVar.a.a();
        }
    }

    public final void d() {
        StickerSearchView stickerSearchView = this.d;
        if (stickerSearchView.getVisibility() == 0) {
            return;
        }
        this.n.showNext();
        stickerSearchView.setVisibility(0);
        a();
        if (!this.l.H()) {
            Toolbar toolbar = this.m;
            toolbar.r(R.drawable.quantum_ic_arrow_back_black_24);
            if (this.r != -16777216) {
                toolbar.e().mutate().setTint(this.r);
            }
        }
        this.p.setVisible(false);
        ((ebxs) this.k).g(8);
    }

    public final boolean e() {
        if (this.d.getVisibility() != 0) {
            return false;
        }
        c();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.q || Build.VERSION.SDK_INT < 27) {
            return;
        }
        this.f.setSystemUiVisibility(1280);
        this.e.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebxe
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                this.a.j.a = windowInsets;
                return windowInsets;
            }
        });
        this.f.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebxf
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws Resources.NotFoundException {
                ebxl ebxlVar = this.a;
                int dimensionPixelSize = ebxlVar.getResources().getDimensionPixelSize(R.dimen.search_view_padding_lr);
                view.setPadding(dimensionPixelSize, ebxlVar.getResources().getDimensionPixelOffset(R.dimen.search_view_padding_top), dimensionPixelSize, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ebww ebwwVar = this.s;
        if (ebwwVar != null) {
            ebwwVar.a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ebxk ebxkVar = (ebxk) parcelable;
        super.onRestoreInstanceState(ebxkVar.getSuperState());
        if (ebxkVar.a) {
            d();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ebxk ebxkVar = new ebxk(super.onSaveInstanceState());
        ebxkVar.a = this.d.getVisibility() == 0;
        return ebxkVar;
    }
}
