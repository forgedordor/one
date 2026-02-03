package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eduo extends edtq {
    private static final ekrg ar = ekrg.c("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment");
    public dsvh ag;
    public ejwi ah;
    public edgm ai;
    public String aj;
    public edtv ak;
    public MaterialToolbar al;
    public TabLayout am;
    public dtak an;
    public boolean ao = false;
    public edtm ap;
    public List aq;
    private dtak as;
    private pph at;
    private ViewPager au;
    public eduu b;
    public edgl c;
    public dswb d;
    public dsvx e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        this.aq = this.ak.a();
        if (B().getConfiguration().getLayoutDirection() != 0) {
            this.aq = ekjz.f(this.aq);
        }
        if (edtm.a(this.m.getString("SuggestionTabsFragmentMode")) == edtm.ONLY_SHOW_DEVICE_PHOTOS) {
            i = true != fbgv.i() ? R.layout.photo_picker_suggestion_tabs_device_only : R.layout.photo_picker_suggestion_tabs_device_only_art_styles;
            i2 = 110514;
        } else {
            i = true != fbgv.i() ? R.layout.photo_picker_suggestion_tabs_fragment : R.layout.photo_picker_suggestion_tabs_fragment_art_styles;
            i2 = 110512;
        }
        View viewInflate = layoutInflater.inflate(i, viewGroup, false);
        this.e.b(viewInflate, this.d.a(i2));
        ley.r(viewInflate, Y(R.string.op3_change_profile_picture));
        len.k(viewInflate, new ldn() { // from class: edug
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.leftMargin = kzcVarF.b;
                marginLayoutParams.bottomMargin = kzcVarF.e;
                marginLayoutParams.rightMargin = kzcVarF.d;
                marginLayoutParams.topMargin = kzcVarF.c;
                view.setLayoutParams(marginLayoutParams);
                return lgt.a;
            }
        });
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) throws Resources.NotFoundException {
        super.ae(bundle);
        this.b.k(this);
        this.al = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_toolbar);
        if (fbgv.n()) {
            this.al.w(G().getIntent().getIntExtra("photo_picker_suggestion_tabs_title_string", R.string.op3_change_profile_picture));
        }
        this.as = new dtak(this.e.b(this.al, this.d.a(92715)));
        this.al.t(new View.OnClickListener() { // from class: eduf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.l();
            }
        });
        dtak dtakVar = new dtak(this.as.a(Integer.valueOf(R.id.photo_picker_overflow_menu), this.d.a(89755)));
        this.an = dtakVar;
        dtakVar.a(Integer.valueOf(R.id.photo_picker_past_profile_photos_menu_item), this.d.a(89753));
        this.an.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.d.a(89747));
        this.an.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.d.a(89742));
        this.al.o(R.menu.photo_picker_common_menu);
        this.al.x = new zh() { // from class: eduh
            @Override // defpackage.zh
            public final boolean a(MenuItem menuItem) {
                eduo eduoVar = this.a;
                eduoVar.al.B();
                dsvh dsvhVar = eduoVar.ag;
                dsvg dsvgVarE = dsvg.e();
                dtak dtakVar2 = eduoVar.an;
                int i = ((of) menuItem).a;
                dsvhVar.b(dsvgVarE, dtakVar2.b(Integer.valueOf(i)));
                if (i == R.id.photo_picker_past_profile_photos_menu_item) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(String.format("https://accounts.google.com/AccountChooser?Email=%s&continue=", eduoVar.ah.c())).concat(String.valueOf(Uri.encode("https://myaccount.google.com/profile-picture/past-photos?interop=standalone&opts=ppo")))));
                    if (!eduoVar.ai.a(intent)) {
                        return true;
                    }
                    eduoVar.aQ(intent);
                    return true;
                }
                if (i == R.id.photo_picker_help_menu_item) {
                    eduoVar.c.b(eduoVar.aj);
                    return false;
                }
                if (i != R.id.photo_picker_send_feedback_menu_item) {
                    return false;
                }
                eduoVar.c.a();
                return true;
            }
        };
        int i = 0;
        if (fbgv.n()) {
            this.al.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        } else {
            this.al.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        }
        edtm edtmVarA = edtm.a(this.m.getString("SuggestionTabsFragmentMode"));
        this.ap = edtmVarA;
        if (edtmVarA == edtm.ONLY_SHOW_DEVICE_PHOTOS) {
            this.Q.findViewById(R.id.photo_picker_device_photos_grid).setPadding(0, 0, 0, 0);
            ((DevicePhotosFragment) I().g(R.id.photo_picker_suggestion_tabs_device_photos_only_fragment)).p();
            return;
        }
        ViewPager viewPager = (ViewPager) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_pager);
        this.au = viewPager;
        viewPager.j(new edun(this, I()));
        TabLayout tabLayout = (TabLayout) this.Q.findViewById(R.id.photo_picker_suggestion_tabs_tabs);
        this.am = tabLayout;
        tabLayout.u(this.au);
        if (fbgs.c()) {
            this.am.s(2);
        }
        ColorStateList colorStateList = this.am.l;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: edud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.ao = true;
            }
        };
        for (edtu edtuVar : this.aq) {
            TabLayout tabLayout2 = this.am;
            final edtt edttVarE = edtuVar.e();
            eeve eeveVarD = tabLayout2.d(ekis.a(this.aq, new ejwm() { // from class: edui
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return ((edtu) obj).e() == edttVarE;
                }
            }));
            edtuVar.d().a(z(), eeveVarD, colorStateList);
            this.e.b(eeveVarD.i, this.d.a(edtuVar.b()));
            eeveVarD.i.setOnClickListener(onClickListener);
        }
        this.am.f(new edul(this));
        if (bundle == null) {
            int iA = ekis.a(this.aq, new ejwm() { // from class: edue
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return ((edtu) obj).c() == this.a.ap;
                }
            });
            if (iA == -1) {
                ((ekrd) ((ekrd) ar.j()).h("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment", "onActivityCreated", 236, "SuggestionTabsV2Fragment.java")).t("attempted to start in mode %s, but the tab was missing.", this.ap);
            } else {
                i = iA;
            }
            TabLayout tabLayout3 = this.am;
            tabLayout3.l(tabLayout3.d(i));
        }
        this.at = new edum(this);
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        if (this.ap != edtm.ONLY_SHOW_DEVICE_PHOTOS) {
            this.au.i(this.at);
        }
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        if (this.ap != edtm.ONLY_SHOW_DEVICE_PHOTOS) {
            this.au.d(this.at);
        }
    }

    @Override // defpackage.edtq, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        eygl.a(this);
    }
}
