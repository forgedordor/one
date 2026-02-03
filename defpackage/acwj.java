package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwj extends oup implements acwl {
    public static final eksp d = eksp.c("ConversationListAdapter");
    public cwvv e;
    public final fcsu f;
    private final Context g;
    private final Activity h;
    private final einm i;
    private final eigp j;
    private pcw k;
    private boolean l;
    private ConversationId m;
    private int n;
    private final tlt o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final Optional s;
    private final arpr t;

    public acwj(Context context, Activity activity, eosc eoscVar, einm einmVar, eigp eigpVar, acxq acxqVar, tlt tltVar, fcsu fcsuVar, fcsu fcsuVar2, Optional optional, fcsu fcsuVar3, arpr arprVar, fcsu fcsuVar4) {
        mb mbVar = new mb(acxqVar);
        mbVar.a = eoscVar;
        super(mbVar.a());
        this.m = acxg.a;
        this.n = -1;
        this.g = context;
        this.h = activity;
        this.i = einmVar;
        this.j = eigpVar;
        this.o = tltVar;
        this.p = fcsuVar;
        this.q = fcsuVar2;
        this.s = optional;
        this.r = fcsuVar3;
        this.f = fcsuVar4;
        this.t = arprVar;
    }

    private static void R(int i) {
        ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "logGetItemAdapterDetails", 271, "ConversationListAdapter.java")).r("position: %s", i);
    }

    @Override // defpackage.oup
    public final void F() {
        this.n = G(this.m.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acwl
    public final int G(String str) {
        oun ounVarL = l();
        if (ounVarL == null) {
            return -1;
        }
        for (int i = 0; i < ounVarL.size(); i++) {
            adao adaoVar = (adao) ounVarL.get(i);
            if (adaoVar != null && str.equals(adaoVar.k().w().a())) {
                return i;
            }
        }
        return -1;
    }

    public final wv H(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        if (i == 0) {
            return acxy.C(layoutInflater, viewGroup);
        }
        View viewInflate = layoutInflater.inflate(((asgt) this.r.b()).a() ? this.t.a() ? R.layout.conversation_list_item_view_coolranch_v2 : R.layout.conversation_list_item_view_coolranch : this.t.a() ? R.layout.conversation_list_item_view_v3 : R.layout.conversation_list_item_view_v2, viewGroup, false);
        final acwi acwiVar = new acwi(viewInflate);
        final einm einmVar = this.i;
        einm.d(viewInflate, "Conversation List Item");
        einmVar.a(viewInflate, new View.OnClickListener() { // from class: acwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.L(false, acwiVar);
            }
        });
        final View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: acwe
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.a.L(true, acwiVar);
                return true;
            }
        };
        viewInflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: eink
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                View.OnLongClickListener onLongClickListener2 = onLongClickListener;
                if (!eidq.a(view)) {
                    return false;
                }
                einm einmVar2 = einmVar;
                eieh eiehVarD = einmVar2.a.d("com/google/apps/tiktok/ui/event/Events", "onLongClick", 198, einm.c("Long clicked", view));
                try {
                    boolean zOnLongClick = onLongClickListener2.onLongClick(view);
                    eiehVarD.close();
                    return zOnLongClick;
                } catch (Throwable th) {
                    try {
                        eiehVarD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        Optional optional = this.s;
        optional.isPresent();
        optional.get();
        View viewFindViewById = viewInflate.findViewById(R.id.contact_avatar_view);
        viewFindViewById.setImportantForAccessibility(2);
        viewFindViewById.setContentDescription(this.g.getString(R.string.a11y_conversation_icon));
        viewFindViewById.setOnClickListener(new eifs(this.j, "com/google/android/apps/messaging/home/list/ConversationListAdapter", "createViewHolder", 312, "Avatar click", new View.OnClickListener() { // from class: acwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acwj acwjVar = this.a;
                boolean zA = ((arfk) acwjVar.f.b()).a();
                acwi acwiVar2 = acwiVar;
                if (zA && acwjVar.e != null) {
                    acwjVar.L(false, acwiVar2);
                    return;
                }
                int iFt = acwiVar2.ft();
                View view2 = acwiVar2.a;
                if (iFt == -1) {
                    return;
                }
                adao adaoVarI = iFt == -1 ? null : acwjVar.I(iFt);
                adaoVarI.getClass();
                SelectedConversation selectedConversationA = acwk.a(adaoVarI);
                ((eksl) ((eksl) acwj.d.h()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onAvatarClick", 361, "ConversationListAdapter.java")).E("Avatar for ConversationId:%s clicked with isRead:%s", adaoVarI.k().w(), adaoVarI.ab());
                einf.g(new acvz(view2, selectedConversationA), view2);
            }
        }));
        return acwiVar;
    }

    public final adao I(int i) {
        Object obj;
        if (i == -1) {
            ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 249, "ConversationListAdapter.java")).q("getItem returning null because NO_POSITION was requested.");
            if (((apup) this.q.b()).a()) {
                ((ains) this.p.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 0);
            }
            R(-1);
            return null;
        }
        onv onvVar = ((oup) this).a;
        oun ounVar = onvVar.f;
        oun ounVar2 = onvVar.e;
        if (ounVar != null) {
            obj = ounVar.get(i);
        } else {
            if (ounVar2 == null) {
                throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
            }
            ounVar2.q(i);
            obj = ounVar2.get(i);
        }
        adao adaoVar = (adao) obj;
        if (adaoVar == null) {
            ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 261, "ConversationListAdapter.java")).q("getItem returning null because super returned null");
            ((ains) this.p.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 1);
            R(i);
        }
        return adaoVar;
    }

    @Override // defpackage.acwl
    public final SelectedConversation J(wv wvVar) {
        adao adaoVarI = I(wvVar.ft());
        if (adaoVarI == null) {
            return null;
        }
        return acwk.a(adaoVarI);
    }

    @Override // defpackage.acwl
    public final String K(int i) {
        adao adaoVarI;
        if (i >= 0 && i < a() && (adaoVarI = I(i)) != null) {
            return adaoVarI.k().w().a();
        }
        return null;
    }

    public final void L(boolean z, acwi acwiVar) {
        int iFt = acwiVar.ft();
        if (iFt == -1) {
            return;
        }
        View view = acwiVar.a;
        adao adaoVarI = I(iFt);
        adaoVarI.getClass();
        SelectedConversation selectedConversationA = acwk.a(adaoVarI);
        ((eksl) ((eksl) d.h()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onClick", 384, "ConversationListAdapter.java")).E("ConversationId:%s clicked with isRead:%s", adaoVarI.k().w(), adaoVarI.ab());
        einf.g(new acvr(z, selectedConversationA, view, adaoVarI.k().x(), new bajg(null, adaoVarI.k().K(), null)), view);
    }

    @Override // defpackage.acwl
    public final void M(int i, final Bundle bundle) {
        adao adaoVarI;
        if (!this.l && i >= 0 && i < a() && (adaoVarI = I(i)) != null) {
            bundle.putString("adapterState_conversationId", adaoVarI.k().w().a());
            bundle.putLong("adapterState_sortTimestamp", adaoVarI.k().o());
            bundle.putBoolean("adapterState_pinStatus", adaoVarI.k().af());
            if (crbf.g() || tet.a() || czwc.b()) {
                final acyx acyxVarK = adaoVarI.k();
                acyxVarK.D().ifPresent(new Consumer() { // from class: acwh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Long l = (Long) obj;
                        eksp ekspVar = acwj.d;
                        if (l.longValue() > acyxVarK.o()) {
                            bundle.putLong("adapterState_nudgeAdjustedTimestamp", l.longValue());
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.acwl
    public final void N(boolean z) {
        this.l = z;
    }

    @Override // defpackage.acwl
    public final void O(cwvv cwvvVar) {
        this.e = cwvvVar;
    }

    @Override // defpackage.acwl
    public final void P(pcw pcwVar) {
        this.k = pcwVar;
    }

    @Override // defpackage.acwl
    public final void Q(ConversationId conversationId) {
        int i = this.n;
        this.n = G(conversationId.b());
        this.m = conversationId;
        q(i);
        q(this.n);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return I(i) == null ? 0 : 1;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return H(viewGroup, i, LayoutInflater.from(viewGroup.getContext()));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = ekgb.d;
        z(wvVar, i, ekoe.a);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        adao adaoVarI = I(i);
        return adaoVarI != null ? adaoVarI.k().w().a : -i;
    }

    @Override // defpackage.vo
    public final void z(wv wvVar, int i, List list) {
        boolean zL;
        if (wvVar instanceof acxy) {
            ((eksl) d.n().h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 427, "ConversationListAdapter.java")).q("Showing lottie animation, no need to rebind");
            return;
        }
        adao adaoVarI = I(i);
        if (adaoVarI == null) {
            ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 433, "ConversationListAdapter.java")).r("Skipping onBindViewHolder for position= %s since getItem is null ", i);
            return;
        }
        ConversationListItemView conversationListItemView = (ConversationListItemView) wvVar.a;
        pcw pcwVar = this.k;
        if (pcwVar != null) {
            zL = pcwVar.l(String.valueOf(gH(i)));
        } else {
            cwvv cwvvVar = this.e;
            zL = cwvvVar != null && cwvvVar.e(new ConversationIdType(gH(i)));
        }
        conversationListItemView.setSelected(zL);
        conversationListItemView.setActivated(i == this.n && afic.a(this.h, this.o.a));
        acxb acxbVarH = conversationListItemView.H();
        if (list.isEmpty()) {
            acxbVarH.a(adaoVarI, zL);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof adam) {
                adam adamVar = (adam) obj;
                ekqg ekqgVarListIterator = adamVar.a().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    adar adarVar = (adar) ekqgVarListIterator.next();
                    adaq adaqVar = (adaq) acxbVarH.b.get(adarVar);
                    if (adaqVar == null) {
                        acxb.a.r(String.format("Received a change payload for a nonexistent view part: %s", adarVar));
                    } else if (adamVar.b()) {
                        adaqVar.b(adaqVar.a(adaoVarI), zL);
                    } else {
                        adaqVar.b(adaoVarI, zL);
                    }
                }
            } else if ((obj instanceof String) && "Selection-Changed".equals(obj)) {
                acxbVarH.a(adaoVarI, zL);
            }
        }
    }
}
