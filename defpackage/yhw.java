package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhw implements ygv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/footer/MessageListFooterUiAdapterImpl");
    public final Context b;
    public final ConversationId c;
    public final arqu d;
    public final fcsu e;
    public final cssf f;
    public final ahax g;
    public final aqiy h;
    public final Optional i;
    public final fdvc j;
    public final aadl k;
    public final fdvc l;
    public final fdvc m;
    public final fdvc n;
    private final fdpl o;
    private final fcsu p;
    private final fcsu q;
    private final fdvc r;

    /* JADX WARN: Type inference failed for: r10v10, types: [ahdx, java.lang.Object] */
    public yhw(Context context, fdjx fdjxVar, ConversationId conversationId, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, fdpl fdplVar4, fdpl fdplVar5, fdpl fdplVar6, arqu arquVar, fcsu fcsuVar, zrc zrcVar, wre wreVar, Optional optional, fcsu fcsuVar2, cssf cssfVar, ahax ahaxVar, fcsu fcsuVar3, aqiy aqiyVar, Optional optional2) {
        context.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdplVar5.getClass();
        fdplVar6.getClass();
        fcsuVar.getClass();
        zrcVar.getClass();
        wreVar.getClass();
        cssfVar.getClass();
        ahaxVar.getClass();
        this.b = context;
        this.c = conversationId;
        this.o = fdplVar6;
        this.d = arquVar;
        this.p = fcsuVar;
        this.e = fcsuVar2;
        this.f = cssfVar;
        this.g = ahaxVar;
        this.q = fcsuVar3;
        this.h = aqiyVar;
        this.i = optional2;
        ygz ygzVar = new ygz(fdplVar, this, fdjxVar, fdplVar);
        fdus fdusVar = fdur.a;
        this.j = fdtg.b(ygzVar, fdjxVar, fdusVar, null);
        this.k = aadl.a;
        fdvc fdvcVarA = (((Boolean) ((cczi) crbf.by.get()).e()).booleanValue() && ((Optional) fcsuVar.b()).isPresent()) ? ((xpi) ((Optional) fcsuVar.b()).get()).a() : fdvf.a(false);
        this.r = fdvcVarA;
        this.l = (((Boolean) crbf.bl.e()).booleanValue() || ((Boolean) crbf.bm.e()).booleanValue()) ? ((Boolean) ((cczi) crbf.bv.get()).e()).booleanValue() ? fdtg.b(fdud.c(fdplVar5, fdqq.a(new yhc(wreVar.a)), fdplVar4, ((vwg) fcsuVar3.b()).b(), fdvcVarA, new yhm(this, zrcVar, null)), fdjxVar, fdusVar, null) : fdtg.b(fdud.c(fdplVar2, fdqq.a(new yhf(wreVar.a)), fdplVar3, ((vwg) fcsuVar3.b()).b(), fdvcVarA, new yhn(this, zrcVar, null)), fdjxVar, fdusVar, null) : ((Boolean) ((cczi) crbf.bv.get()).e()).booleanValue() ? fdtg.b(fdud.a(fdplVar5, fdqq.a(new yhi(wreVar.a)), fdvcVarA, new yho(this, zrcVar, null)), fdjxVar, fdusVar, null) : fdtg.b(fdud.a(fdplVar2, fdqq.a(new yhl(wreVar.a)), fdvcVarA, new yhp(this, zrcVar, null)), fdjxVar, fdusVar, null);
        optional.isPresent();
        this.m = optional.get().a();
        this.n = fdtg.b(fdplVar6, fdjxVar, fdusVar, false);
    }

    public final zym a(ekgb ekgbVar, final ahat ahatVar, final fdae fdaeVar) {
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ajld ajldVar = (ajld) it.next();
            dkrk dkrkVar = new dkrk(((cphz) this.e.b()).c(ajldVar.a()), null, 0, 0, 0.0f, null, 62);
            String strX = ajldVar.a().x(true);
            strX.getClass();
            arrayList.add(new djyl(dkrkVar, strX, null, null, null, null, 124));
        }
        return new zym(arrayList, new fdae() { // from class: ygw
            @Override // defpackage.fdae
            public final Object invoke() {
                ((fdlr) fdaeVar.invoke()).t(null);
                ahatVar.a();
                return fctx.a;
            }
        });
    }
}
