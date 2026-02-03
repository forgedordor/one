package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwam implements cwac {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl");
    private static final cwav e;
    private static final RuntimeException f;
    public final ConversationId b;
    public final fcsu c;
    public final fcsu d;
    private final Context g;
    private final fdjx h;
    private final fdpl i;
    private final fdpl j;
    private final fdpl k;
    private final arqu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final aqlb r;
    private final aqla s;

    static {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        e = new cwav(ekgbVar, new cwau(null));
        f = new RuntimeException("InvalidCdpAccess");
    }

    public cwam(Context context, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, ConversationId conversationId, fdpl fdplVar3, arqu arquVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, aqlb aqlbVar, aqla aqlaVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        conversationId.getClass();
        fdplVar3.getClass();
        fcsuVar2.getClass();
        fcsuVar7.getClass();
        this.g = context;
        this.h = fdjxVar;
        this.i = fdplVar;
        this.j = fdplVar2;
        this.b = conversationId;
        this.k = fdplVar3;
        this.l = arquVar;
        this.c = fcsuVar;
        this.m = fcsuVar2;
        this.n = fcsuVar3;
        this.o = fcsuVar4;
        this.p = fcsuVar5;
        this.d = fcsuVar6;
        this.q = fcsuVar7;
        this.r = aqlbVar;
        this.s = aqlaVar;
    }

    @Override // defpackage.cwac
    public final fdpl a() {
        if (this.l.a()) {
            return avac.d(auyk.a(this.i, "ConversationProperties"), auyk.a(this.j, "Recipients"), auyk.a(((vfn) this.m.b()).d, "PhoneCallAction"), auyk.a(((vpp) this.n.b()).o, "VideoCallAction"), auyk.a(((vev) this.o.b()).g, "AddPeopleToGroupAction"), auyk.a(((vmi) this.p.b()).c, "SearchAction"), this.h, new cwaj(this, null));
        }
        return avac.f(auyk.a(this.i, "ConversationProperties"), auyk.a(this.j, "Recipients"), auyk.a(this.k, "IsPenpalConversation"), auyk.a(((vfn) this.m.b()).d, "PhoneCallAction"), auyk.a(((vpp) this.n.b()).o, "VideoCallAction"), auyk.a(((vev) this.o.b()).g, "AddPeopleToGroupAction"), auyk.a(((vmi) this.p.b()).c, "SearchAction"), this.h, new cwak(this, null));
    }

    public final cwav b(ajlk ajlkVar, final ekgb ekgbVar, boolean z, dihq dihqVar, dihq dihqVar2, dihq dihqVar3, final dihq dihqVar4) {
        boolean zA = ((asgm) this.q.b()).a();
        aqla aqlaVar = this.s;
        cwau cwauVar = new cwau(zA, aqlaVar.a());
        if (z) {
            int i = ekgb.d;
            ekgb ekgbVar2 = ekoe.a;
            ekgbVar2.getClass();
            return new cwav(ekgbVar2, cwauVar);
        }
        aqlb aqlbVar = this.r;
        if (aqlbVar.a() && ajlkVar.z()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCdp");
            ((ekrd) ((ekrd) ekrwVarJ).g(eiip.b(f)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl", "internalCreateUiData", 145, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP header for a deleted conversation");
            return e;
        }
        if (!aqlbVar.a()) {
            ajlj ajljVarC = ajlkVar.c();
            if (ajljVarC != null && ajljVarC.ordinal() == 2) {
                fcww fcwwVar = new fcww((byte[]) null);
                if (dihqVar2 != null) {
                    fcwwVar.add(dihqVar2);
                }
                if (dihqVar3 != null) {
                    fcwwVar.add(dihqVar3);
                }
                if (dihqVar4 != null && dihqVar4.e) {
                    fcwwVar.add(new dihq(dihqVar4.a, dihqVar4.b, false, false, false, false, null, false, null, new fdae() { // from class: cwag
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dihqVar4.k.invoke();
                            ((cwbr) this.d.b()).a();
                            return fctx.a;
                        }
                    }, 1020));
                }
                return new cwav(ekfv.a(fcva.a(fcwwVar)), cwauVar);
            }
            fcww fcwwVar2 = new fcww((byte[]) null);
            if (dihqVar != null && dihqVar.e) {
                fcwwVar2.add(dihqVar);
            }
            if (dihqVar2 != null) {
                fcwwVar2.add(dihqVar2);
            }
            String string = (((ResolvedRecipient) fcva.X(ekgbVar)).A() && aqlaVar.a()) ? this.g.getString(R.string.contact) : ((ResolvedRecipient) fcva.X(ekgbVar)).A() ? this.g.getString(R.string.show_contact_details) : this.g.getString(R.string.add_contact_button);
            string.getClass();
            fcwwVar2.add(new dihq(string, ((ResolvedRecipient) fcva.X(ekgbVar)).A() ? djrr.o : djrr.cX, false, false, false, false, null, false, null, new fdae() { // from class: cwah
                @Override // defpackage.fdae
                public final Object invoke() {
                    Object objX = fcva.X(ekgbVar);
                    objX.getClass();
                    this.a.c((ResolvedRecipient) objX);
                    return fctx.a;
                }
            }, 1020));
            if (dihqVar4 != null && dihqVar4.e) {
                fcwwVar2.add(new dihq(dihqVar4.a, dihqVar4.b, false, false, false, false, null, false, null, new fdae() { // from class: cwai
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dihqVar4.k.invoke();
                        ((cwbr) this.d.b()).a();
                        return fctx.a;
                    }
                }, 1020));
            }
            return new cwav(ekfv.a(fcva.a(fcwwVar2)), cwauVar);
        }
        ajlj ajljVarC2 = ajlkVar.c();
        if (ajljVarC2 != null) {
            int iOrdinal = ajljVarC2.ordinal();
            if (iOrdinal == 1) {
                fcww fcwwVar3 = new fcww((byte[]) null);
                if (dihqVar != null && dihqVar.e) {
                    fcwwVar3.add(dihqVar);
                }
                if (dihqVar2 != null) {
                    fcwwVar3.add(dihqVar2);
                }
                String string2 = (((ResolvedRecipient) fcva.X(ekgbVar)).A() && aqlaVar.a()) ? this.g.getString(R.string.contact) : ((ResolvedRecipient) fcva.X(ekgbVar)).A() ? this.g.getString(R.string.show_contact_details) : this.g.getString(R.string.add_contact_button);
                string2.getClass();
                fcwwVar3.add(new dihq(string2, ((ResolvedRecipient) fcva.X(ekgbVar)).A() ? djrr.o : djrr.cX, false, false, false, false, null, false, null, new fdae() { // from class: cwae
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        Object objX = fcva.X(ekgbVar);
                        objX.getClass();
                        this.a.c((ResolvedRecipient) objX);
                        return fctx.a;
                    }
                }, 1020));
                dihqVar4.getClass();
                if (dihqVar4.e) {
                    fcwwVar3.add(new dihq(dihqVar4.a, dihqVar4.b, false, false, false, false, null, false, null, new fdae() { // from class: cwaf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dihqVar4.k.invoke();
                            ((cwbr) this.d.b()).a();
                            return fctx.a;
                        }
                    }, 1020));
                }
                return new cwav(ekfv.a(fcva.a(fcwwVar3)), cwauVar);
            }
            if (iOrdinal == 2) {
                fcww fcwwVar4 = new fcww((byte[]) null);
                if (dihqVar2 != null) {
                    fcwwVar4.add(dihqVar2);
                }
                if (dihqVar3 != null) {
                    fcwwVar4.add(dihqVar3);
                }
                if (dihqVar4 != null && dihqVar4.e) {
                    fcwwVar4.add(new dihq(dihqVar4.a, dihqVar4.b, false, false, false, false, null, false, null, new fdae() { // from class: cwad
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dihqVar4.k.invoke();
                            ((cwbr) this.d.b()).a();
                            return fctx.a;
                        }
                    }, 1020));
                }
                return new cwav(ekfv.a(fcva.a(fcwwVar4)), cwauVar);
            }
            if (iOrdinal == 3 || iOrdinal == 4) {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleCdp");
                ((ekrd) ((ekrd) ekrwVarJ2).g(eiip.b(f)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl", "internalCreateUiData", 225, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP for unsupported RBM/Business conversation");
                return e;
            }
        }
        ekrw ekrwVarJ3 = a.j();
        ekrwVarJ3.X(eksq.a, "BugleCdp");
        ((ekrd) ((ekrd) ekrwVarJ3).g(eiip.b(f)).h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl", "internalCreateUiData", 232, "ActionsUiAdapterImpl.kt")).q("Attempting to open CDP for unknown conversation kind");
        return e;
    }

    public final void c(ResolvedRecipient resolvedRecipient) {
        auvw.k(this.h, null, null, new cwal(this, resolvedRecipient, null), 3);
    }
}
