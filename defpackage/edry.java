package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edry extends edrj {
    public MaterialTextView aA;
    public FullscreenErrorView aB;
    public Toolbar aC;
    public dtak aD;
    public edlm aE;
    private ViewAnimator aF;
    private dtak aG;
    public dsvh ag;
    public eddy ah;
    public edrz ai;
    public edgp aj;
    public edgl ak;
    public edgv al;
    public ejwi am;
    public ejwi an;
    public edgm ao;
    public String ap;
    public edtv aq;
    edtf ar;
    edtb as;
    public edgr at;
    public ImageView au;
    public MaterialButton av;
    public MaterialButton aw;
    public MaterialButton ax;
    public MaterialTextView ay;
    public MaterialTextView az;
    public lxo b;
    public lxo c;
    public eduu d;
    public dswb e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.profile_picture_preview_fragment, viewGroup, false);
        this.e.b.a(90302).b(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        edlm edlmVar = this.aE;
        edlmVar.a.b(100);
        edlmVar.b.a(100);
        edlmVar.c.b(100);
        edrz edrzVar = this.ai;
        ejxm ejxmVar = (ejxm) edrzVar.b.b();
        ejxmVar.f();
        edrzVar.c = ejwi.j(ejxmVar);
        edgv edgvVar = edrzVar.a;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 12;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.at = this.aj.b(5);
        this.d.k(this);
        ((MaterialToolbar) this.Q.findViewById(R.id.photo_picker_google_account_toolbar)).t(new View.OnClickListener() { // from class: edrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.l();
            }
        });
        this.aC = (Toolbar) this.Q.findViewById(R.id.photo_picker_preview_action_toolbar);
        dtak dtakVar = new dtak(this.e.b.a(92715).b(this.aC));
        this.aG = dtakVar;
        dtak dtakVar2 = new dtak(dtakVar.c(89755).a(Integer.valueOf(R.id.photo_picker_overflow_menu)));
        this.aD = dtakVar2;
        dtakVar2.c(89753).a(Integer.valueOf(R.id.photo_picker_past_profile_photos_menu_item));
        this.aD.c(89747).a(Integer.valueOf(R.id.photo_picker_help_menu_item));
        this.aD.c(89742).a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item));
        this.aC.o(R.menu.photo_picker_common_menu);
        Toolbar toolbar = this.aC;
        toolbar.x = new zh() { // from class: edrn
            @Override // defpackage.zh
            public final boolean a(MenuItem menuItem) {
                edry edryVar = this.a;
                edryVar.aC.B();
                dsvh dsvhVar = edryVar.ag;
                dsvg dsvgVarE = dsvg.e();
                dtak dtakVar3 = edryVar.aD;
                int i = ((of) menuItem).a;
                dsvhVar.b(dsvgVarE, dtakVar3.b(Integer.valueOf(i)));
                if (i == R.id.photo_picker_past_profile_photos_menu_item) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(String.format("https://accounts.google.com/AccountChooser?Email=%s&continue=", edryVar.am.c())).concat(String.valueOf(Uri.encode("https://myaccount.google.com/profile-picture/past-photos?interop=standalone&opts=ppo")))));
                    if (!edryVar.ao.a(intent)) {
                        return true;
                    }
                    edryVar.aQ(intent);
                    return true;
                }
                if (i == R.id.photo_picker_help_menu_item) {
                    edryVar.ak.b(edryVar.ap);
                    return false;
                }
                if (i != R.id.photo_picker_send_feedback_menu_item) {
                    return false;
                }
                edryVar.ak.a();
                return true;
            }
        };
        toolbar.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        this.ar = (edtf) this.b.a(edtf.class);
        this.as = (edtb) this.c.a(edtb.class);
        ViewAnimator viewAnimator = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        this.aF = viewAnimator;
        this.au = (ImageView) viewAnimator.findViewById(R.id.photo_picker_preview_profile_image);
        this.av = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_edit_button);
        this.aw = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_delete_button);
        this.ax = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_add_button);
        this.aB = (FullscreenErrorView) this.aF.findViewById(R.id.photo_picker_error_view);
        this.ay = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_visibility_message);
        this.az = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_info_message);
        this.aA = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_intro_message);
        this.av.d(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_edit_vd_theme_24));
        this.aw.d(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_delete_vd_theme_24));
        this.ax.d(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_add_a_photo_vd_theme_24));
        this.e.b.a(95413).b(this.au);
        this.e.b.a(94212).b(this.ax);
        this.e.b.a(89731).b(this.av);
        this.e.b.a(89759).b(this.aw);
        this.e.b.a(89777).b(this.ay);
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: edrr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edry edryVar = this.a;
                edryVar.ag.a(dsvg.e(), edryVar.aw);
                new edso().t(edryVar.I(), null);
            }
        });
        this.aB.b(new View.OnClickListener() { // from class: edrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edry edryVar = this.a;
                edtf edtfVar = edryVar.ar;
                edtfVar.a.b();
                edtfVar.b.b();
                edlm edlmVar2 = edryVar.aE;
                edlmVar2.a.c();
                edlmVar2.b.c();
                edlmVar2.c.c();
            }
        });
        this.ar.c.f(Q(), new lvz() { // from class: edrt
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final edry edryVar = this.a;
                edtc edtcVar = (edtc) obj;
                edryVar.at.b();
                if (edtcVar.a().g()) {
                    int iOrdinal = ((edhe) edtcVar.a().c()).ordinal();
                    if (iOrdinal == 0) {
                        edryVar.aB.f();
                    } else if (iOrdinal == 1) {
                        edryVar.aB.g();
                    } else if (iOrdinal == 2) {
                        edryVar.aB.d();
                    }
                    edryVar.p(R.id.photo_picker_error_view);
                    edrz edrzVar2 = edryVar.ai;
                    ekfw ekfwVar = new ekfw();
                    ekfwVar.j(edtcVar.d());
                    ekfwVar.h(edryVar.at.a());
                    edrzVar2.a(ekfwVar.g());
                    return;
                }
                if (!edtcVar.b().g() || !edtcVar.c().g()) {
                    edryVar.p(R.id.photo_picker_loading_view);
                    return;
                }
                edryVar.p(R.id.photo_picker_content_view);
                eddy eddyVar = edryVar.ah;
                Bitmap bitmapA = ((edml) edtcVar.b().c()).a();
                edea edeaVar = new edea();
                edeaVar.b();
                edeaVar.c();
                eddyVar.d(bitmapA, edeaVar, edryVar.au);
                edryVar.au.setContentDescription(((edml) edtcVar.b().c()).c() ? edryVar.B().getString(R.string.op3_profile_picture_monogram_content_description) : edryVar.B().getString(R.string.op3_profile_picture_content_description));
                boolean zC = ((edml) edtcVar.b().c()).c();
                boolean zE = ((edmn) edtcVar.c().c()).e();
                if (zC) {
                    edryVar.ax.setVisibility(0);
                    edryVar.av.setVisibility(8);
                    edryVar.aw.setVisibility(8);
                } else {
                    edryVar.ax.setVisibility(8);
                    edryVar.av.setVisibility(0);
                    edryVar.aw.setVisibility(0);
                }
                boolean z = !zE;
                edryVar.au.setEnabled(z);
                edryVar.av.setEnabled(z);
                edryVar.aw.setEnabled(z);
                edryVar.ax.setEnabled(z);
                edryVar.aq.b(edtt.GOOGLE_PHOTOS, ((edmn) edtcVar.c().c()).c());
                List listA = edryVar.aq.a();
                final Runnable runnable = ((edtu) listA.get(0)).e() == edtt.ART ? new Runnable() { // from class: edrv
                    @Override // java.lang.Runnable
                    public final void run() {
                        edryVar.d.f();
                    }
                } : (listA.size() == 1 && ((edtu) listA.get(0)).e() == edtt.DEVICE_PHOTOS) ? new Runnable() { // from class: edrw
                    @Override // java.lang.Runnable
                    public final void run() {
                        edryVar.d.j();
                    }
                } : new Runnable() { // from class: edrl
                    @Override // java.lang.Runnable
                    public final void run() {
                        new edsi().t(edryVar.I(), null);
                    }
                };
                edryVar.au.setOnClickListener(new View.OnClickListener() { // from class: edro
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        edry edryVar2 = edryVar;
                        edryVar2.ag.a(dsvg.e(), edryVar2.au);
                        runnable.run();
                    }
                });
                edryVar.av.setOnClickListener(new View.OnClickListener() { // from class: edrp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        edry edryVar2 = edryVar;
                        edryVar2.ag.a(dsvg.e(), edryVar2.av);
                        runnable.run();
                    }
                });
                edryVar.ax.setOnClickListener(new View.OnClickListener() { // from class: edrq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        edry edryVar2 = edryVar;
                        edryVar2.ag.a(dsvg.e(), edryVar2.ax);
                        runnable.run();
                    }
                });
                int iF = ((edmn) edtcVar.c().c()).f() - 1;
                if (iF == 0) {
                    edgv edgvVar2 = edryVar.al;
                    euqu euquVar = (euqu) euqv.a.createBuilder();
                    euquVar.copyOnWrite();
                    euqv euqvVar = (euqv) euquVar.instance;
                    euqvVar.c = 117;
                    euqvVar.b |= 1;
                    edgvVar2.a((euqv) euquVar.build());
                    edryVar.f();
                } else if (iF != 1) {
                    String strY = edryVar.Y(R.string.op3_preview_visibility_message_learn_more);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(edryVar.Z(R.string.op3_preview_visibility_message, strY));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: edrm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            edry edryVar2 = edryVar;
                            edryVar2.ag.a(dsvg.e(), edryVar2.ay);
                            edryVar2.ak.b(edryVar2.ap);
                        }
                    };
                    int iIndexOf = spannableStringBuilder.toString().indexOf(strY);
                    spannableStringBuilder.setSpan(new edrx(onClickListener), iIndexOf, strY.length() + iIndexOf, 33);
                    edryVar.ay.setText(spannableStringBuilder);
                    edryVar.ay.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    edgv edgvVar3 = edryVar.al;
                    euqu euquVar2 = (euqu) euqv.a.createBuilder();
                    euquVar2.copyOnWrite();
                    euqv euqvVar2 = (euqv) euquVar2.instance;
                    euqvVar2.c = 118;
                    euqvVar2.b |= 1;
                    edgvVar3.a((euqv) euquVar2.build());
                    edryVar.f();
                }
                int iOrdinal2 = ((edmn) edtcVar.c().c()).b().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 2) {
                        edryVar.az.setText(true != fbgv.s() ? R.string.op3_preview_info_message_contact_admin : R.string.op3_preview_info_message_managed_organization);
                        edryVar.az.setVisibility(0);
                        if (fbgv.s()) {
                            float f = edryVar.B().getDisplayMetrics().density;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) edryVar.az.getLayoutParams();
                            marginLayoutParams.bottomMargin = 0;
                            edryVar.az.setLayoutParams(marginLayoutParams);
                            edryVar.az.setCompoundDrawablePadding((int) (12.0f * f));
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) edryVar.ay.getLayoutParams();
                            marginLayoutParams2.topMargin = (int) (f * 8.0f);
                            edryVar.ay.setLayoutParams(marginLayoutParams2);
                            edryVar.aA.setVisibility(8);
                        }
                    }
                    edrz edrzVar3 = edryVar.ai;
                    ekfw ekfwVar2 = new ekfw();
                    ekfwVar2.j(edtcVar.d());
                    ekfwVar2.h(edryVar.at.a());
                    edrzVar3.a(ekfwVar2.g());
                }
                edgv edgvVar4 = edryVar.al;
                euqu euquVar3 = (euqu) euqv.a.createBuilder();
                euquVar3.copyOnWrite();
                euqv euqvVar3 = (euqv) euquVar3.instance;
                euqvVar3.c = 119;
                euqvVar3.b = 1 | euqvVar3.b;
                edgvVar4.a((euqv) euquVar3.build());
                edryVar.az.setVisibility(8);
                edrz edrzVar32 = edryVar.ai;
                ekfw ekfwVar22 = new ekfw();
                ekfwVar22.j(edtcVar.d());
                ekfwVar22.h(edryVar.at.a());
                edrzVar32.a(ekfwVar22.g());
            }
        });
        this.as.d.f(Q(), new lvz() { // from class: edru
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edsy edsyVar = (edsy) obj;
                if (fbgv.r()) {
                    edry edryVar = this.a;
                    if (edryVar.an.g()) {
                        ecpn ecpnVar = new ecpn(edryVar.G(), edsyVar.c());
                        ecpnVar.c = (Account) edryVar.an.c();
                        ecpnVar.b(R.id.photo_picker_prompt_parent_sheet, 340);
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        ekqg ekqgVarListIterator = edsyVar.a().entrySet().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                            ekfwVar.h(new lcb((String) entry.getKey(), (String) entry.getValue()));
                        }
                        ecpnVar.d = ekfwVar.g();
                        ecpy.a(ecpnVar.a());
                    }
                }
            }
        });
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        edtf edtfVar = this.ar;
        if (!fbgv.h() || (fbgv.h() && !edtfVar.d.a().a(edtfVar.e.a()).g())) {
            edtfVar.a.b();
            edtfVar.b.b();
        }
    }

    public final void f() {
        this.aA.setVisibility(8);
        this.aF.findViewById(R.id.photo_picker_preview_visibility_message).setVisibility(8);
        this.aF.findViewById(R.id.photo_picker_preview_divider).setVisibility(8);
    }

    @Override // defpackage.edrj, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        eygl.a(this);
    }

    public final void p(int i) {
        ViewAnimator viewAnimator = this.aF;
        this.aF.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }
}
