package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessTopActionView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uro implements url {
    public ParticipantsTable.BindData a;
    public BusinessInfoData b;
    public urt c;
    public uru d;
    public final uri e;
    public final axjf f;
    public final achu g;
    public final cpcb h;
    public final cpcd i;
    public final cpcf j;
    public final ehac k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final urk o;
    public final alrj p;
    public final egzv q = new egzv<urg>() { // from class: uro.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cqca.f("Bugle", "Failed to load InfoAndOptions data.");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
            int color;
            String string;
            Uri uri;
            urg urgVar = (urg) obj;
            ParticipantsTable.BindData bindData = urgVar.a;
            uro uroVar = uro.this;
            uroVar.a = bindData;
            uroVar.b = urgVar.b;
            uri uriVar = uroVar.e;
            upv upvVar = (upv) uriVar.I().h("conversation_settings_base_fragment");
            upvVar.getClass();
            upvVar.H().f = uroVar.b();
            uroVar.r.getClass();
            uroVar.s.getClass();
            uroVar.t.getClass();
            uroVar.u.getClass();
            uroVar.v.getClass();
            eg egVarG = uriVar.G();
            egVarG.getClass();
            Resources resources = egVarG.getResources();
            ParticipantsTable.BindData bindData2 = uroVar.a;
            if (bindData2 != null) {
                uroVar.s.setText(((bbcc) uroVar.n.b()).a(bindData2, true));
                color = bbax.a(bindData2).c;
                uroVar.r.g(uroVar.f.a(bindData2));
                uroVar.r.setImportantForAccessibility(4);
            } else {
                color = 3622735;
            }
            BusinessInfoData businessInfoData = uroVar.b;
            if (businessInfoData != null) {
                string = businessInfoData.getDescription();
                if (uroVar.a == null) {
                    uroVar.s.setText(businessInfoData.getName());
                    if (businessInfoData.getColor() != null) {
                        color = Color.parseColor(businessInfoData.getColor());
                    }
                }
                View view = uriVar.Q;
                view.getClass();
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.info_and_options_top_actions);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(egVarG);
                alqm alqmVarA = uroVar.p.a(businessInfoData.getRbmBotId());
                BusinessInfoProperty primaryPhoneNumber = businessInfoData.getPrimaryPhoneNumber();
                if (primaryPhoneNumber != null) {
                    uroVar.c(uroVar.h.a(alqmVarA, primaryPhoneNumber.getValue()), color, linearLayout, layoutInflaterFrom);
                }
                BusinessInfoProperty primaryWebsite = businessInfoData.getPrimaryWebsite();
                if (primaryWebsite != null) {
                    uroVar.c(uroVar.j.a(alqmVarA, primaryWebsite.getValue()), color, linearLayout, layoutInflaterFrom);
                }
                BusinessInfoProperty primaryEmailAddress = businessInfoData.getPrimaryEmailAddress();
                if (primaryEmailAddress != null) {
                    uroVar.c(uroVar.i.a(alqmVarA, primaryEmailAddress.getValue()), color, linearLayout, layoutInflaterFrom);
                }
                TabLayout tabLayout = uroVar.u;
                tabLayout.f(new urp(uroVar));
                Resources resources2 = uriVar.G().getResources();
                String string2 = resources2.getString(R.string.info_and_options_activity_info_tab_title);
                String string3 = resources2.getString(R.string.info_and_options_activity_info_tab_content_description);
                String string4 = resources2.getString(R.string.info_and_options_activity_options_tab_title);
                eeve eeveVarE = tabLayout.e();
                eeveVarE.f(string2);
                eeveVarE.d(string3);
                tabLayout.h(eeveVarE, true);
                eeve eeveVarE2 = tabLayout.e();
                eeveVarE2.f(string4);
                tabLayout.g(eeveVarE2);
            } else {
                uroVar.u.setVisibility(8);
                string = resources.getString(R.string.info_and_options_activity_loading_info);
            }
            if (TextUtils.isEmpty(string)) {
                uroVar.t.setVisibility(8);
            } else {
                uroVar.t.setText(string);
            }
            BusinessInfoData businessInfoData2 = uroVar.b;
            ImageView imageView = uroVar.v;
            imageView.setBackgroundColor(color);
            if (businessInfoData2 == null) {
                cqca.c("Bugle", "No business info, setting hero image view to plain color");
                return;
            }
            String heroImageLocalUri = businessInfoData2.getHeroImageLocalUri();
            String heroImageRemoteUrl = businessInfoData2.getHeroImageRemoteUrl();
            if (TextUtils.isEmpty(heroImageLocalUri)) {
                if (TextUtils.isEmpty(heroImageRemoteUrl) || !URLUtil.isValidUrl(heroImageRemoteUrl)) {
                    cqca.n("Bugle", "Business hero image remote url is invalid: ".concat(String.valueOf(heroImageRemoteUrl)));
                    return;
                }
                uri = Uri.parse(heroImageRemoteUrl);
            } else {
                if (!URLUtil.isValidUrl(heroImageLocalUri)) {
                    cqca.n("Bugle", "Business hero image local url is invalid: ".concat(String.valueOf(heroImageLocalUri)));
                    return;
                }
                uri = Uri.parse(heroImageLocalUri);
            }
            if (!cqmz.p(uri)) {
                cqca.n("Bugle", "Can't set business hero image. Its URL is not for a local resource: ".concat(String.valueOf(heroImageRemoteUrl)));
            } else {
                imageView.setBackground(null);
                ((ehrb) uroVar.m.b()).d(uri).v(imageView);
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };
    public ContactIconView r;
    public TextView s;
    public TextView t;
    public TabLayout u;
    public ImageView v;
    private final aijh w;
    private final fcsu x;

    public uro(fcsu fcsuVar, uri uriVar, axjf axjfVar, achu achuVar, cpcb cpcbVar, cpcd cpcdVar, cpcf cpcfVar, aijh aijhVar, ehac ehacVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, alrj alrjVar, urk urkVar) {
        this.m = fcsuVar;
        this.e = uriVar;
        this.f = axjfVar;
        this.g = achuVar;
        this.h = cpcbVar;
        this.i = cpcdVar;
        this.j = cpcfVar;
        this.w = aijhVar;
        this.k = ehacVar;
        this.l = fcsuVar2;
        this.x = fcsuVar3;
        this.n = fcsuVar4;
        this.p = alrjVar;
        this.o = urkVar;
    }

    @Override // defpackage.url
    public final uql a() {
        upv upvVar = (upv) this.e.I().h("conversation_settings_base_fragment");
        upvVar.getClass();
        return upvVar.H().d;
    }

    public final Optional b() {
        return Optional.ofNullable(this.b);
    }

    public final void c(cpby cpbyVar, int i, LinearLayout linearLayout, LayoutInflater layoutInflater) {
        if (((cpbz) this.x.b()).d(cpbyVar.e())) {
            BusinessTopActionView businessTopActionView = (BusinessTopActionView) layoutInflater.inflate(R.layout.business_top_action, (ViewGroup) linearLayout, false);
            businessTopActionView.a = cpbyVar;
            TextView textView = (TextView) businessTopActionView.findViewById(R.id.business_top_action_text);
            if (textView == null) {
                cqaz.c("Can't configure top business action view: view text not found");
            } else {
                if (businessTopActionView.d.g()) {
                    i = eehg.b(textView, R.attr.colorPrimaryBrandIcon);
                }
                textView.setTextColor(i);
                Context context = cpbyVar.a;
                textView.setText(context.getResources().getString(cpbyVar.d()));
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, cpbyVar.f(i), (Drawable) null, (Drawable) null);
                businessTopActionView.setContentDescription(context.getResources().getString(cpbyVar.c()));
            }
            linearLayout.addView(businessTopActionView);
        }
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.w.t(this.e.G(), str);
    }

    public final void e(ea eaVar) {
        cg cgVar = new cg(this.e.I());
        cgVar.D(R.id.info_and_options_tab_container, eaVar);
        cgVar.c();
    }
}
