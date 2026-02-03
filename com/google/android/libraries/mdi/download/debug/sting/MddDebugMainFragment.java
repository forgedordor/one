package com.google.android.libraries.mdi.download.debug.sting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import defpackage.cg;
import defpackage.dtws;
import defpackage.dtxj;
import defpackage.dtyf;
import defpackage.dtyj;
import defpackage.dtyk;
import defpackage.dtyl;
import defpackage.dtym;
import defpackage.dtyn;
import defpackage.dtyo;
import defpackage.dtyt;
import defpackage.dtyv;
import defpackage.ejtj;
import defpackage.ekrd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugMainFragment extends dtyt {
    public dtws a;
    private dtym b;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dtyn dtynVar = this.b.b;
        View viewInflate = layoutInflater.inflate(R.layout.mdd_debug_container_fragment, viewGroup, false);
        if (bundle == null) {
            try {
                dtyv dtyvVar = new dtyv();
                cg cgVar = new cg(((dtyo) dtynVar).b.I());
                cgVar.s(R.id.file_group_list_container, dtyvVar);
                cgVar.c();
            } catch (RuntimeException e) {
                ((ekrd) ((ekrd) ((ekrd) dtyo.a.j()).g(e)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentUiProviderImpl", "setupView", '5', "MddDebugMainFragmentUiProviderImpl.java")).q("Unable to add list fragment");
            }
        }
        Button button = (Button) viewInflate.findViewById(R.id.clear_storage);
        dtyf dtyfVar = ((dtyo) dtynVar).c;
        dtyk dtykVarC = dtyl.c();
        ((dtxj) dtykVarC).a = "MDD.DEBUG.CLEAR_ACTION";
        final dtyl dtylVarA = dtykVarC.a();
        final dtyj dtyjVar = (dtyj) dtyfVar;
        button.setOnClickListener(new View.OnClickListener() { // from class: dtyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
            }
        });
        Button button2 = (Button) viewInflate.findViewById(R.id.refresh_file_groups);
        dtyk dtykVarC2 = dtyl.c();
        ((dtxj) dtykVarC2).a = "MDD.DEBUG.REFRESH_ACTION";
        final dtyl dtylVarA2 = dtykVarC2.a();
        button2.setOnClickListener(new View.OnClickListener() { // from class: dtyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA2;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
            }
        });
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        dtyn dtynVar = this.b.b;
        SubMenu subMenuAddSubMenu = menu.addSubMenu("Run MDD Task...");
        MenuItem menuItemAdd = subMenuAddSubMenu.add("Maintenance Task");
        dtyf dtyfVar = ((dtyo) dtynVar).c;
        dtyk dtykVarC = dtyl.c();
        dtxj dtxjVar = (dtxj) dtykVarC;
        dtxjVar.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dtxjVar.b = "MDD.MAINTENANCE.PERIODIC.GCM.TASK";
        final dtyl dtylVarA = dtykVarC.a();
        final dtyj dtyjVar = (dtyj) dtyfVar;
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dtyg
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
                return true;
            }
        });
        MenuItem menuItemAdd2 = subMenuAddSubMenu.add("Charging Task");
        dtyk dtykVarC2 = dtyl.c();
        dtxj dtxjVar2 = (dtxj) dtykVarC2;
        dtxjVar2.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dtxjVar2.b = "MDD.CHARGING.PERIODIC.TASK";
        final dtyl dtylVarA2 = dtykVarC2.a();
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dtyg
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA2;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
                return true;
            }
        });
        MenuItem menuItemAdd3 = subMenuAddSubMenu.add("Cellular Charging Task");
        dtyk dtykVarC3 = dtyl.c();
        dtxj dtxjVar3 = (dtxj) dtykVarC3;
        dtxjVar3.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dtxjVar3.b = "MDD.CELLULAR.CHARGING.PERIODIC.TASK";
        final dtyl dtylVarA3 = dtykVarC3.a();
        menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dtyg
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA3;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
                return true;
            }
        });
        MenuItem menuItemAdd4 = subMenuAddSubMenu.add("Wifi Charging Task");
        dtyk dtykVarC4 = dtyl.c();
        dtxj dtxjVar4 = (dtxj) dtykVarC4;
        dtxjVar4.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dtxjVar4.b = "MDD.WIFI.CHARGING.PERIODIC.TASK";
        final dtyl dtylVarA4 = dtykVarC4.a();
        menuItemAdd4.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dtyg
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dtyj dtyjVar2 = dtyjVar;
                ejtj ejtjVar = dtyjVar2.c;
                dtyl dtylVar = dtylVarA4;
                ejtjVar.c(ejtj.a(dtyjVar2.a(dtylVar)), dtyjVar2.d, dtylVar);
                return true;
            }
        });
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
        dtyj dtyjVar = new dtyj(this, this.a);
        dtym dtymVar = new dtym(new dtyo(this, dtyjVar), dtyjVar);
        this.b = dtymVar;
        dtyj dtyjVar2 = (dtyj) dtymVar.a;
        dtyjVar2.c = ejtj.b(dtyjVar2.b);
        dtyjVar2.c.d(R.id.main_fragment_action_callback, dtyjVar2.d);
    }
}
