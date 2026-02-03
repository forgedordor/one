package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybh extends wv {
    public final AccountParticle s;
    public final ejwi t;
    public final lvz u;
    public final ejwi v;
    public final dyyb w;
    public Object x;

    public dybh(ViewGroup viewGroup, dxxk dxxkVar, dxyj dxyjVar, ejwi ejwiVar, final dyaf dyafVar, int i, final dyyb dyybVar, final dyqd dyqdVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false));
        C(this.a, i, i);
        AccountParticle accountParticle = (AccountParticle) this.a.findViewById(R.id.account_list_item_particle);
        this.s = accountParticle;
        this.t = ejwiVar;
        this.v = dyafVar.a;
        this.w = dyybVar;
        C(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.j.t();
        accountParticle.j.h();
        accountParticle.j.i(dxyjVar, dxxkVar);
        accountParticle.i = new dyad(accountParticle, dxxkVar, dyafVar);
        ejwi ejwiVar2 = dyafVar.a;
        dxzr dxzrVar = null;
        if (ejwiVar2.g()) {
            ejwi ejwiVar3 = ((dyak) ejwiVar2.c()).c;
            if (ejwiVar3.g()) {
                lvj lvjVar = ((dyak) ejwiVar2.c()).a;
                dxzrVar = new dxzr(ekgb.r(new dykh(accountParticle.getContext(), lvjVar, (dyaj) ejwiVar3.c())), lvjVar);
            }
        }
        if (dxzrVar != null) {
            accountParticle.j.n(dxzrVar);
        }
        if (ejwiVar.g()) {
            ImageView imageView = (ImageView) accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip);
            ejwiVar.c();
            imageView.setImageResource(R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
        }
        final ViewGroup viewGroup2 = (ViewGroup) this.a.findViewById(R.id.account_list_item_critical_alert_container);
        this.u = new lvz() { // from class: dybf
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dybh dybhVar = this.a;
                if (dybhVar.x != null) {
                    ejwi ejwiVar4 = dybhVar.v;
                    if (ejwiVar4.g() && ((dyak) ejwiVar4.c()).c.g()) {
                        dyaf dyafVar2 = dyafVar;
                        dyyb dyybVar2 = dyybVar;
                        dyqd dyqdVar2 = dyqdVar;
                        ViewGroup viewGroup3 = viewGroup2;
                        ejwi ejwiVar5 = ((dyak) ejwiVar4.c()).c;
                        View view = dybhVar.a;
                        ((dyaj) ejwiVar5.c()).p(view.getContext(), dybhVar.x, viewGroup3, dyqdVar2, view, dyybVar2, false, dyafVar2.b);
                    }
                }
            }
        };
    }

    private static void C(View view, int i, int i2) {
        int[] iArr = ley.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
