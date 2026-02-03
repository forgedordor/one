package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwm implements bzwj {
    public final fcsu a;
    private final cajh b;
    private final aqfr c;

    public bzwm(fcsu fcsuVar, cajh cajhVar, aqfr aqfrVar) {
        this.a = fcsuVar;
        this.b = cajhVar;
        this.c = aqfrVar;
    }

    @Override // defpackage.bzwj
    public final void a(bojh bojhVar, epjf epjfVar, ConversationIdType conversationIdType) {
        String strY = bojhVar.Y();
        String strAh = bojhVar.ah();
        bvdk bvdkVarG = bojhVar.G();
        bvdp bvdpVarH = bojhVar.H();
        String strS = bojhVar.S();
        int iN = bojhVar.n();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.al();
        boteVar.ap("overwriteWithCmsConversation");
        boteVar.C(strY);
        boteVar.k(strS);
        boteVar.h(bvdkVarG);
        boteVar.Y(strAh);
        boteVar.D(bvdpVarH);
        boteVar.A(iN);
        String strAe = bojhVar.ae();
        if (!TextUtils.isEmpty(strAe)) {
            boteVar.Q(strAe);
        }
        boteVar.l(cpyi.MERGED_FROM_CMS);
        if (((Boolean) avos.a.e()).booleanValue()) {
            boteVar.Z(bojhVar.x());
        }
        if (this.c.a()) {
            cins cinsVarM = bojhVar.M();
            if (!cinsVarM.equals(cins.a)) {
                boteVar.B(cinsVarM);
            }
            boteVar.j(bojhVar.R());
        }
        if (!boteVar.f(conversationIdType)) {
            throw new bzwl(String.format("Conversation Bugle update failed, conversation id = %s. cms_id = %s", conversationIdType, strS));
        }
        if (cpyl.a()) {
            this.b.b(epjfVar, conversationIdType.toString(), strS, 3);
        }
    }
}
