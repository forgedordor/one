package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anjp implements ancm {
    public static final /* synthetic */ int b = 0;
    private static final ekgb c;
    private static final ekgb d;
    private static final brec e;
    private static final brec f;
    public final cogw a;
    private final afhk g;
    private final fcsu h;

    static {
        ekgb ekgbVarU = ekgb.u(100, 1, 2, 11);
        c = ekgbVarU;
        ekgb ekgbVarV = ekgb.v(100, 1, 2, 11, 5);
        d = ekgbVarV;
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.ah(ekgbVarU);
        brecVar.A(false);
        e = brecVar;
        brec brecVar2 = new brec();
        brecVar2.ah(ekgbVarV);
        brecVar2.A(false);
        f = brecVar2;
    }

    public anjp(cogw cogwVar, afhk afhkVar, fcsu fcsuVar) {
        cogwVar.getClass();
        afhkVar.getClass();
        fcsuVar.getClass();
        this.a = cogwVar;
        this.g = afhkVar;
        this.h = fcsuVar;
    }

    private final boolean f() {
        return this.g.c();
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        brdr brdrVarC = amgb.c("reply_parts", null, null, null, 14);
        if (f()) {
            bpxe bpxeVarB = bpxj.b();
            bpxeVarB.d(new Function() { // from class: anjl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpwi bpwiVar = (bpwi) obj;
                    int i = anjp.b;
                    return new bpwj[]{bpwiVar.a, bpwiVar.c, bpwiVar.e, bpwiVar.g, bpwiVar.k, bpwiVar.d};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqtr dqtrVarI = dqts.i(bpxeVarB.b(), bpxj.c.b, MessagesTable.c.a);
            ((dqos) dqtrVarI).e = "reply_preview";
            brdrVarC.H(dqtrVarI.g());
        }
        String[] strArr = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.A("+loadMessageReplies");
        brdp brdpVarB = brdrVarC.b();
        brao braoVar = MessagesTable.c.a;
        bqli bqliVar = bqmc.c;
        dqtr dqtrVarT = brdpVarB.t(braoVar, bqliVar.b, ((Boolean) this.h.b()).booleanValue() ? new brdv(f) : new brdv(e));
        ((dqos) dqtrVarT).e = "reply_messages";
        bqlwVar.H(dqtrVarT.g());
        brdrVar.H(dqts.i(bqlwVar.b(), bqliVar.a, braoVar).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bqks bqksVar;
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bqmc.a;
        dqpd[] dqpdVarArrAH = bindData.aH("message_replies", new bqks[0]);
        bqks[] bqksVarArr = (bqks[]) dqpdVarArrAH;
        bqksVarArr.getClass();
        ajmx anjmVar = null;
        anjmVar = null;
        anjmVar = null;
        anjmVar = null;
        if (bqksVarArr.length == 0) {
            dqpdVarArrAH = null;
        }
        bqks[] bqksVarArr2 = (bqks[]) dqpdVarArrAH;
        if (bqksVarArr2 != null && (bqksVar = (bqks) fcur.H(bqksVarArr2)) != null) {
            if (!bqksVar.n().c()) {
                dqpd[] dqpdVarArrAH2 = bindData.aH("reply_messages", new MessagesTable.BindData[0]);
                dqpdVarArrAH2.getClass();
                MessagesTable.BindData bindData2 = (MessagesTable.BindData) fcur.I(dqpdVarArrAH2);
                if (bindData2 != null) {
                    anck anckVarO = ancl.o();
                    if (f()) {
                        dqpd[] dqpdVarArrAH3 = bindData.aH("reply_preview", new bpvd[0]);
                        dqpdVarArrAH3.getClass();
                        bpvd bpvdVar = (bpvd) fcur.I(dqpdVarArrAH3);
                        ((anaq) anckVarO).a = bpvdVar != null ? new anjn(bpvdVar, this) : null;
                    }
                    ameq ameqVar = (ameq) anbiVar;
                    ekgb ekgbVarA = ameqVar.a(bindData2, ameqVar.b((PartsTable.BindData[]) bindData.aH("reply_parts", new PartsTable.BindData[0]), false), new BugleConversationId(bindData2.D()), andwVar, ekgpVar, anckVarO.a(), ajtsVar);
                    ekgbVarA.getClass();
                    anjmVar = new anjm((ajlt) fcva.N(ekgbVarA));
                }
            } else if (bqksVar.k() == ahqp.UNSPECIFIED) {
                anjmVar = new anjo();
            }
        }
        ((anaq) anckVar).c = anjmVar;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ anbf e() {
        return new ancw("replied to");
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
