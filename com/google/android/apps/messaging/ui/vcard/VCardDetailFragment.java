package com.google.android.apps.messaging.ui.vcard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;
import defpackage.avbr;
import defpackage.babw;
import defpackage.baiy;
import defpackage.baiz;
import defpackage.bajq;
import defpackage.bajr;
import defpackage.cpbh;
import defpackage.cqaz;
import defpackage.cqca;
import defpackage.dakl;
import defpackage.dakn;
import defpackage.dakp;
import defpackage.dakt;
import defpackage.ejwl;
import defpackage.ekrd;
import defpackage.ekrq;
import defpackage.eksq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VCardDetailFragment extends dakn implements bajq, cpbh {
    public final babw a = new babw();
    public avbr ag;
    public dakl ah;
    private dakp ai;
    public ExpandableListView b;
    public Uri c;
    public Uri d;
    public baiz e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqaz.l(this.c);
        View viewInflate = layoutInflater.inflate(R.layout.vcard_detail_fragment, viewGroup, false);
        viewInflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dakq
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                return windowInsets;
            }
        });
        ExpandableListView expandableListView = (ExpandableListView) viewInflate.findViewById(R.id.list);
        this.b = expandableListView;
        expandableListView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dakr
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                VCardDetailFragment vCardDetailFragment = this.a;
                ExpandableListView expandableListView2 = vCardDetailFragment.b;
                expandableListView2.setIndicatorBounds(expandableListView2.getWidth() - vCardDetailFragment.B().getDimensionPixelSize(R.dimen.vcard_detail_group_indicator_width), vCardDetailFragment.b.getWidth());
            }
        });
        this.b.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: daks
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView2, View view, int i, int i2, long j) {
                return this.a.p(view);
            }
        });
        baiy baiyVarA = this.e.a(this.c);
        baiyVarA.c = this;
        this.a.c(baiyVarA);
        return viewInflate;
    }

    @Override // defpackage.bajq
    public final void a(bajr bajrVar) {
        this.a.d();
        this.ah.i(R.string.failed_loading_vcard);
        G().finish();
    }

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_add_contact) {
            return false;
        }
        babw babwVar = this.a;
        babwVar.d();
        new dakt(this, ((baiy) babwVar.a()).o()).e(new Void[0]);
        return true;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.vcard_detail_fragment_menu_m2, menu);
        babw babwVar = this.a;
        MenuItem menuItemFindItem = menu.findItem(R.id.action_add_contact);
        boolean z = false;
        if (babwVar.g() && ((baiy) babwVar.a()).q()) {
            z = true;
        }
        menuItemFindItem.setVisible(z);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        babw babwVar = this.a;
        if (babwVar.g()) {
            babwVar.f();
        }
        this.b.setAdapter((ExpandableListAdapter) null);
    }

    @Override // defpackage.bajq
    public final void b(bajr bajrVar) {
        ejwl.a(true);
        this.a.d();
        baiy baiyVar = (baiy) bajrVar;
        ejwl.a(baiyVar.q());
        dakp dakpVar = new dakp(G(), baiyVar.p(), this, this.b);
        this.ai = dakpVar;
        this.b.setAdapter(dakpVar);
        if (this.ai.getGroupCount() == 1) {
            this.b.expandGroup(0);
        }
        G().invalidateOptionsMenu();
    }

    @Override // defpackage.cpbh
    public final void c(bajr bajrVar) {
        try {
            Intent intentC = bajrVar.c();
            if (intentC != null) {
                aQ(intentC);
            }
        } catch (Exception e) {
            ekrd ekrdVar = (ekrd) cqca.a.g();
            ekrdVar.X(eksq.a, "Bugle");
            ekrdVar.Y(ekrq.a);
            ((ekrd) ((ekrd) ekrdVar.g(e)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", 223, "LogUtil.java")).t("%s", "VCardDetailFragment: fail to start activity");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
    }

    public final /* synthetic */ boolean p(View view) {
        Intent intentC;
        if ((view instanceof VCardAttachmentView) && (intentC = ((bajr) ((VCardAttachmentView) view).d.a()).c()) != null) {
            try {
                aQ(intentC);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.cpbh
    public final void d() {
    }
}
