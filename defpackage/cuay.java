package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuay implements cuar {
    public final fdjx a;
    public final cucf b;
    public final cudy c;
    public final ctxf d;
    public final ctuu e;
    public final fcsu f;
    private final cuec g;

    public cuay(fdjx fdjxVar, cucf cucfVar, cudy cudyVar, cuec cuecVar, ctxf ctxfVar, ctuu ctuuVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        cucfVar.getClass();
        cudyVar.getClass();
        cuecVar.getClass();
        ctxfVar.getClass();
        ctuuVar.getClass();
        fcsuVar.getClass();
        this.a = fdjxVar;
        this.b = cucfVar;
        this.c = cudyVar;
        this.g = cuecVar;
        this.d = ctxfVar;
        this.e = ctuuVar;
        this.f = fcsuVar;
    }

    @Override // defpackage.cuar
    public final fdae a(final ConversationId conversationId) {
        return new cuas(this, new fdae() { // from class: cuav
            @Override // defpackage.fdae
            public final Object invoke() {
                cuay cuayVar = this.a;
                cuayVar.d.c(conversationId);
                ctuu ctuuVar = cuayVar.e;
                ufx.d(ctuuVar.b, 17, 0, ctuuVar.f, 0, false, 58);
                ctuuVar.i(true);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.cuar
    public final fdae b(final antq antqVar, final alqm alqmVar, final cudx cudxVar) {
        alqmVar.getClass();
        cudxVar.getClass();
        return new cuas(this, new fdae() { // from class: cuau
            @Override // defpackage.fdae
            public final Object invoke() {
                antq antqVar2 = antqVar;
                chpq chpqVar = chpq.PROFILE_PEOPLE_SHARING_SOURCE;
                chos chosVar = (chos) antqVar2;
                chpb chpbVar = chosVar.g;
                String strB = chsk.b(chpbVar.c, chpbVar.e, chpqVar);
                alqm alqmVar2 = alqmVar;
                if (strB == null) {
                    strB = udo.a(alqmVar2);
                }
                String str = strB;
                cuay cuayVar = this.a;
                cudx cudxVar2 = cudxVar;
                cuayVar.c.c(new ChipData(alqmVar2, str, null, chosVar.h.a, false, 20, null));
                String strN = alqmVar2.n();
                if (strN == null) {
                    strN = "";
                }
                cucf cucfVar = cuayVar.b;
                cuayVar.e.g(strN, (String) cucfVar.a().a());
                if (cudxVar2.d == cueh.a) {
                    auvw.k(cuayVar.a, null, null, new cuaw(cuayVar, alqmVar2, null), 3);
                }
                cucfVar.c();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.cuar
    public final fdae c(final ajpq ajpqVar, final cudx cudxVar) {
        ajpqVar.getClass();
        cudxVar.getClass();
        return new cuas(this, new fdae() { // from class: cuat
            @Override // defpackage.fdae
            public final Object invoke() {
                ajpq ajpqVar2 = ajpqVar;
                ChipData chipData = new ChipData(ajpqVar2.b(), ajpqVar2.e(), ajpqVar2.g(), ajpqVar2.a(), false, 16, null);
                cuay cuayVar = this.a;
                cuayVar.c.c(chipData);
                String strN = ajpqVar2.b().n();
                if (strN == null) {
                    strN = "";
                }
                cucf cucfVar = cuayVar.b;
                cuayVar.e.g(strN, (String) cucfVar.a().a());
                if (cudxVar.d == cueh.a) {
                    auvw.k(cuayVar.a, null, null, new cuax(cuayVar, ajpqVar2, null), 3);
                }
                cucfVar.c();
                return fctx.a;
            }
        });
    }

    public final aoer d() {
        return (aoer) this.g.a().c();
    }
}
