package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysf implements ehay {
    final /* synthetic */ cysg a;

    public cysf(cysg cysgVar) {
        this.a = cysgVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ekrw ekrwVarI = cysg.a.i();
        ekrwVarI.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsFailure", (char) 472, "GaiaPairingSettingsFragmentPeer.java")).q("Error retrieving Gaia device pairing settings");
        cysg cysgVar = this.a;
        cysgVar.c(true);
        cysgVar.d();
        ((ains) cysgVar.l.b()).e("Bugle.Gaia.Pairing.Loading.Count", 2);
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        int i2;
        int i3;
        bvpq bvpqVar = (bvpq) obj;
        bvlj bvljVar = bvpqVar.a;
        cysg cysgVar = this.a;
        if (bvljVar.c) {
            ekrw ekrwVarH = cysg.a.h();
            ekrwVarH.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsSuccess", 416, "GaiaPairingSettingsFragmentPeer.java")).q("Gaia device pairing is enabled for the current account");
        } else {
            ekrw ekrwVarH2 = cysg.a.h();
            ekrwVarH2.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsSuccess", 418, "GaiaPairingSettingsFragmentPeer.java")).q("Gaia device pairing is disabled for the current account");
            if (!bvpqVar.b.a.isEmpty()) {
                cysgVar.d();
            }
        }
        cyrn cyrnVar = cysgVar.c;
        ea eaVarH = cyrnVar.I().h("gaia_pairing_reset_primary");
        if (eaVarH == null) {
            efwo efwoVar = cysgVar.b;
            efwoVar.getClass();
            cyrj cyrjVar = new cyrj();
            eyhj.e(cyrjVar);
            ehok.b(cyrjVar, efwoVar);
            if (bvpqVar.d.equals(bvpr.c)) {
                cg cgVar = new cg(cyrnVar.I());
                cgVar.t(R.id.reset_primary_fragment_container, cyrjVar, "gaia_pairing_reset_primary");
                cgVar.c();
            }
        } else if (bvpqVar.d.equals(bvpr.b)) {
            cg cgVar2 = new cg(cyrnVar.I());
            cgVar2.o(eaVarH);
            cgVar2.c();
        }
        cysgVar.r = bvpqVar.c;
        cyrg cyrgVar = cysgVar.s;
        List list = cysgVar.r;
        list.getClass();
        cyrgVar.g = list;
        cyrgVar.p();
        boolean zEquals = bvpqVar.d.equals(bvpr.c);
        int size = cysgVar.r.size();
        View viewFindViewById = cyrnVar.N().findViewById(R.id.instruction_list_container);
        View viewFindViewById2 = cyrnVar.N().findViewById(R.id.instruction_list);
        View viewFindViewById3 = cyrnVar.N().findViewById(R.id.instruction_list_title_container);
        Button button = (Button) cyrnVar.N().findViewById(R.id.instruction_list_title);
        ImageView imageView = (ImageView) cyrnVar.N().findViewById(R.id.instruction_list_indicator);
        if (size == 0) {
            imageView.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
            imageView.setImageTintList(ColorStateList.valueOf(eehg.b(imageView, R.attr.colorPrimary)));
            viewFindViewById2.setVisibility(0);
            button.setTextColor(eehg.b(button, R.attr.colorPrimary));
            viewFindViewById3.setContentDescription(cysgVar.g.getResources().getString(R.string.instruction_how_to_pair_expanded_content_description));
            viewFindViewById.setBackgroundResource(true != ((asgq) cysgVar.o.b()).a() ? R.drawable.highlighted_list_background : R.drawable.highlighted_list_background_coolranch);
            i = 0;
        } else {
            imageView.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            i = 0;
            imageView.setImageTintList(ColorStateList.valueOf(eehg.b(imageView, R.attr.colorOnBackground)));
            viewFindViewById2.setVisibility(8);
            button.setTextColor(eehg.b(button, R.attr.colorOnBackground));
            viewFindViewById3.setContentDescription(cysgVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
            viewFindViewById.setBackgroundResource(true != ((asgq) cysgVar.o.b()).a() ? R.drawable.non_highlighted_list_background : R.drawable.non_highlighted_list_background_coolranch);
        }
        if (zEquals) {
            imageView.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            viewFindViewById2.setVisibility(8);
            viewFindViewById3.setContentDescription(cysgVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
        }
        int size2 = cysgVar.r.size();
        View viewFindViewById4 = cyrnVar.N().findViewById(R.id.gaia_paired_desktop_list_container);
        View viewFindViewById5 = cyrnVar.N().findViewById(R.id.paired_desktops_list_title_container);
        Button button2 = (Button) cyrnVar.N().findViewById(R.id.paired_desktops_list_title);
        Context context = cysgVar.g;
        Resources resources = context.getResources();
        Integer numValueOf = Integer.valueOf(size2);
        Object[] objArr = new Object[1];
        objArr[i] = numValueOf;
        button2.setText(resources.getString(R.string.paired_desktops_title, objArr));
        View viewFindViewById6 = cyrnVar.N().findViewById(R.id.gaia_paired_desktop_item_list_layout);
        ImageView imageView2 = (ImageView) cyrnVar.N().findViewById(R.id.paired_desktops_list_indicator);
        TextView textView = (TextView) cyrnVar.N().findViewById(R.id.no_paired_devices_text);
        if (size2 > 0) {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
            imageView2.setImageTintList(ColorStateList.valueOf(eehg.b(imageView2, R.attr.colorPrimary)));
            viewFindViewById6.setVisibility(i);
            textView.setVisibility(8);
            button2.setTextColor(eehg.b(button2, R.attr.colorPrimary));
            viewFindViewById4.setBackgroundResource(true != ((asgq) cysgVar.o.b()).a() ? R.drawable.paired_desktops_background : R.drawable.paired_desktops_background_coolranch);
            viewFindViewById5.setContentDescription(context.getResources().getString(R.string.paired_desktops_expanded_content_description, numValueOf));
            i2 = 0;
        } else {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            imageView2.setImageTintList(ColorStateList.valueOf(eehg.b(imageView2, R.attr.colorOnBackground)));
            viewFindViewById6.setVisibility(8);
            button2.setTextColor(eehg.b(button2, R.attr.colorOnBackground));
            viewFindViewById4.setBackgroundResource(true != ((asgq) cysgVar.o.b()).a() ? R.drawable.non_highlighted_list_background : R.drawable.non_highlighted_list_background_coolranch);
            i2 = 0;
            viewFindViewById5.setContentDescription(context.getResources().getString(R.string.paired_desktops_collapsed_content_description, numValueOf));
        }
        if (zEquals) {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            i3 = 8;
            viewFindViewById6.setVisibility(8);
        } else {
            i3 = 8;
        }
        int size3 = cysgVar.r.size();
        View viewFindViewById7 = cyrnVar.N().findViewById(R.id.unpair_all_devices_button_container);
        if (size3 != 0) {
            i3 = i2;
        }
        viewFindViewById7.setVisibility(i3);
        bvmq bvmqVar = bvpqVar.b;
        Toolbar toolbarFb = ((GaiaDittoActivity) cyrnVar.fg()).fb();
        toolbarFb.getClass();
        Bitmap bitmap = bvmqVar.b;
        if (bitmap != null) {
            ehqs.a(context).c().g(bitmap).R(R.drawable.gm_filled_account_circle_vd_theme_24).A().w(new cyse(toolbarFb));
        }
        MenuItem menuItemFindItem = toolbarFb.h().findItem(R.id.avatar);
        String str = bvmqVar.a;
        menuItemFindItem.setTitle(str);
        toolbarFb.h().findItem(R.id.avatar).setTooltipText(str);
        cysgVar.c(cysgVar.r.isEmpty());
        ((ains) cysgVar.l.b()).e("Bugle.Gaia.Pairing.Loading.Count", 1);
    }
}
