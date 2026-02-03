package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import defpackage.ehol;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrn extends cysn implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    private cysg a;
    private boolean ah;
    private Context d;
    private final lvn e = new lvn(this);
    private final eino ag = new eino();

    @Deprecated
    public cyrn() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cysg.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cysg cysgVarH = H();
            fcsu fcsuVar = cysgVarH.j;
            ehac ehacVar = (ehac) fcsuVar.b();
            cdku cdkuVar = (cdku) cysgVarH.n.b();
            efwo efwoVar = cysgVarH.b;
            ehacVar.a(new cdks(cdkuVar, efwoVar), new cysa(cysgVarH));
            ((ehac) fcsuVar.b()).a(((egbf) cysgVarH.k.b()).a(efwoVar), new cysb(cysgVarH));
            View viewInflate = layoutInflater.inflate(true != ((asgq) cysgVarH.o.b()).a() ? R.layout.gaia_pairing_settings_fragment_v2 : R.layout.gaia_pairing_settings_fragment_coolranch, viewGroup, false);
            cyrn cyrnVar = cysgVarH.c;
            View viewFindViewById = cyrnVar.fg().findViewById(android.R.id.content);
            ldn ldnVar = new ldn() { // from class: cyrp
                @Override // defpackage.ldn
                public final lgt ez(View view, lgt lgtVar) {
                    kzc kzcVarF = lgtVar.f(519);
                    view.setPadding(kzcVarF.b, 0, kzcVarF.d, 0);
                    return lgtVar;
                }
            };
            int[] iArr = ley.a;
            len.k(viewFindViewById, ldnVar);
            len.k((LinearLayout) viewInflate.findViewById(R.id.switch_to_qr_button_wrapper), new ldn() { // from class: cyrq
                @Override // defpackage.ldn
                public final lgt ez(View view, lgt lgtVar) {
                    view.setPadding(0, 0, 0, lgtVar.f(519).e);
                    return lgtVar;
                }
            });
            final GaiaDittoActivity gaiaDittoActivity = (GaiaDittoActivity) cyrnVar.fg();
            im imVarK = gaiaDittoActivity.k();
            imVarK.getClass();
            cukg.a(imVarK, null);
            imVarK.setDisplayHomeAsUpEnabled(true);
            Toolbar toolbarFb = gaiaDittoActivity.fb();
            toolbarFb.getClass();
            toolbarFb.t(new View.OnClickListener() { // from class: cyro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gaiaDittoActivity.c().d();
                }
            });
            cyrnVar.av(true);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.gaia_paired_desktop_list);
            recyclerView.aK();
            recyclerView.am(null);
            Context context = cysgVarH.g;
            recyclerView.ao(new LinearLayoutManager());
            recyclerView.al(cysgVarH.s);
            final View viewFindViewById2 = viewInflate.findViewById(R.id.instruction_list_title_container);
            Button button = (Button) viewInflate.findViewById(R.id.instruction_list_title);
            final View viewFindViewById3 = viewInflate.findViewById(R.id.instruction_list);
            final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.instruction_list_indicator);
            ((TextView) viewInflate.findViewById(R.id.instruction_list_item_text_two)).setText(Html.fromHtml(context.getResources().getString(R.string.instruction_access_url_text_rebrand, bvfd.i.e()), 63));
            button.setOnClickListener(new View.OnClickListener() { // from class: cyrx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    View view2 = viewFindViewById3;
                    int visibility = view2.getVisibility();
                    cysg cysgVar = cysgVarH;
                    ImageView imageView2 = imageView;
                    View view3 = viewFindViewById2;
                    if (visibility == 8) {
                        view2.setVisibility(0);
                        imageView2.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
                        view3.setContentDescription(cysgVar.g.getResources().getString(R.string.instruction_how_to_pair_expanded_content_description));
                        view2.setAccessibilityLiveRegion(1);
                        return;
                    }
                    view2.setVisibility(8);
                    imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
                    view3.setContentDescription(cysgVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
                    view2.setAccessibilityLiveRegion(1);
                }
            });
            final View viewFindViewById4 = viewInflate.findViewById(R.id.paired_desktops_list_title_container);
            Button button2 = (Button) viewInflate.findViewById(R.id.paired_desktops_list_title);
            final View viewFindViewById5 = viewInflate.findViewById(R.id.gaia_paired_desktop_item_list_layout);
            final ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.paired_desktops_list_indicator);
            final TextView textView = (TextView) viewInflate.findViewById(R.id.no_paired_devices_text);
            button2.setText(context.getResources().getString(R.string.paired_desktops_title, 0));
            button2.setOnClickListener(new View.OnClickListener() { // from class: cyrz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    View view2 = viewFindViewById5;
                    TextView textView2 = textView;
                    int visibility = view2.getVisibility();
                    cysg cysgVar = cysgVarH;
                    ImageView imageView3 = imageView2;
                    View view3 = viewFindViewById4;
                    if (visibility != 8) {
                        textView2.setVisibility(8);
                        view2.setVisibility(8);
                        imageView3.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
                        view3.setContentDescription(cysgVar.g.getResources().getString(R.string.paired_desktops_collapsed_content_description, Integer.valueOf(cysgVar.r.size())));
                        view2.setAccessibilityLiveRegion(1);
                        return;
                    }
                    if (cysgVar.r.isEmpty()) {
                        textView2.setVisibility(0);
                    } else {
                        textView2.setVisibility(8);
                    }
                    view2.setVisibility(0);
                    imageView3.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
                    view3.setContentDescription(cysgVar.g.getResources().getString(R.string.paired_desktops_expanded_content_description, Integer.valueOf(cysgVar.r.size())));
                    view2.setAccessibilityLiveRegion(1);
                }
            });
            viewInflate.findViewById(R.id.unpair_all_devices_button).setOnClickListener(new View.OnClickListener() { // from class: cyrr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Resources.NotFoundException {
                    final cysg cysgVar = cysgVarH;
                    ((ains) cysgVar.l.b()).c("Bugle.Gaia.UnpairAll.Button.Clicked");
                    Context context2 = cysgVar.g;
                    eeji eejiVar = new eeji(context2);
                    eejiVar.v(context2.getResources().getString(R.string.delete_all_paired_desktops_dialog_title));
                    eejiVar.l(context2.getResources().getString(R.string.delete_all_paired_desktops_dialog_content));
                    String string = context2.getResources().getString(R.string.delete_paired_desktop_positive_button_text);
                    fcsu fcsuVar2 = cysgVar.i;
                    eejiVar.s(string, new eigf((eigp) fcsuVar2.b(), "com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onUnpairAllDesktopsClicked", 563, "GaiaPairingSettingsFragmentPeer.confirm_signout_all", new DialogInterface.OnClickListener() { // from class: cyrs
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cysg cysgVar2 = cysgVar;
                            ((ains) cysgVar2.l.b()).c("Bugle.Gaia.UnpairAll.Button.Confirmed");
                            cysgVar2.a((List) Collection.EL.stream(cysgVar2.r).map(new Function() { // from class: cyru
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bvmr) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: cyrv
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            })));
                        }
                    }));
                    eejiVar.n(context2.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new eigf((eigp) fcsuVar2.b(), "com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onUnpairAllDesktopsClicked", 570, "GaiaPairingSettingsFragmentPeer.cancel_signout_all", new DialogInterface.OnClickListener() { // from class: cyrt
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ((ains) cysgVar.l.b()).c("Bugle.Gaia.UnpairAll.Button.Cancelled");
                            dialogInterface.dismiss();
                        }
                    }));
                    eejiVar.a();
                }
            });
            if (viewInflate == null) {
                cysi.a(this, H());
            }
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cysg H() {
        cysg cysgVar = this.a;
        if (cysgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cysgVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.cysn, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        H();
        menuInflater.inflate(R.menu.gaia_ditto_toolbar_menu, menu);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            cysi.a(this, H());
            bn(view, bundle);
            final cysg cysgVarH = H();
            Button button = (Button) view.findViewById(R.id.switch_to_qr_button);
            cysgVarH.c(false);
            button.setOnClickListener(new eifs((eigp) cysgVarH.i.b(), "com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "setupGaiaPairingSwitchAndSwitchToQrBtn", 536, "GaiaPairingSettingsFragmentPeer.onSwitchToQrClick", new View.OnClickListener() { // from class: cyrw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cysg cysgVar = cysgVarH;
                    ((ains) cysgVar.l.b()).c("Bugle.Gaia.SwitchToQr.Button.Clicked");
                    ((egpr) cysgVar.d.b()).g(egpq.b(((bvmu) cysgVar.f.b()).e()), cysgVar.q);
                }
            }));
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.cysn
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.cysn, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragment", 100, cyrn.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragment", 105, cyrn.class, "CreatePeer");
                        try {
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            efwo efwoVar = (efwo) ahjrVar.b.b();
                            cyrn cyrnVar = (cyrn) ((ahhw) objBb).dU.b();
                            eyik eyikVar = ((ahhw) objBb).f;
                            eyik eyikVar2 = ((ahhw) objBb).n;
                            eyik eyikVar3 = ((ahhw) objBb).cj;
                            ahkn ahknVar = ((ahhw) objBb).a;
                            ahnh ahnhVar = ahknVar.a;
                            this.a = new cysg(efwoVar, cyrnVar, eyikVar, eyikVar2, eyikVar3, ahnhVar.Uk, ahjrVar.ac, ((ahhw) objBb).dV, ((ahhw) objBb).g, ahnhVar.pG, ahnhVar.pQ, ((ahhw) objBb).cg, ahnhVar.tG, ahknVar.b.kx);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            cysg cysgVarH = H();
            ((ehbb) cysgVarH.e.b()).g(R.id.device_pairing_settings_local_subscription, ((bvmu) cysgVarH.f.b()).a(cysgVarH.b), new cysf(cysgVarH));
            fcsu fcsuVar = cysgVarH.d;
            ((egpr) fcsuVar.b()).j(cysgVarH.p);
            ((egpr) fcsuVar.b()).j(cysgVarH.q);
            cyrh cyrhVar = (cyrh) cysgVarH.h.b();
            Context context = cysgVarH.g;
            cyrn cyrnVar = (cyrn) cyrhVar.a.b();
            cyrnVar.getClass();
            cqjk cqjkVar = (cqjk) cyrhVar.b.b();
            cqjkVar.getClass();
            eigp eigpVar = (eigp) cyrhVar.c.b();
            eigpVar.getClass();
            cysgVarH.s = new cyrg(cyrnVar, cqjkVar, eigpVar, cyrhVar.d, cyrhVar.e, context);
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            if (this.Q == null) {
                this.ag.c();
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.cysn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
