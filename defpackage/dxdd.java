package defpackage;

import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxdd implements dxcr {
    public final dxck a;
    public final dxdj b;
    public final ekgb c;
    public dxcq d;
    public dxah e;
    private final ekgb f;

    public dxdd(MessageListView messageListView, dwpx dwpxVar, dwje dwjeVar, dvip dvipVar, dviy dviyVar, dxck dxckVar, ekgb ekgbVar) {
        new HashMap();
        new HashMap();
        if (!dwjeVar.c().g().contains(dwpxVar.a())) {
            throw new IllegalArgumentException("Conversation owner doesn't belong to the account context primary passed in");
        }
        this.a = dxckVar;
        dviyVar.a(dwpxVar);
        ekfw ekfwVar = new ekfw();
        ekoe ekoeVar = (ekoe) ekgbVar;
        int i = ekoeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ekfwVar.h(((dxcn) ekgbVar.get(i2)).a());
        }
        ekgb ekgbVarG = ekfwVar.g();
        this.f = ekgbVarG;
        ejwi ejwiVar = messageListView.ad;
        dxdj dxdjVar = new dxdj(dxckVar, ekgbVarG, new dxdb(this), new dxdc(this), dwjeVar, dwpxVar, dvipVar, dviyVar);
        this.b = dxdjVar;
        messageListView.al(dxdjVar);
        dxdjVar.e = messageListView.ac;
        new eoss(dvht.b().a);
        ekfw ekfwVar2 = new ekfw();
        int i3 = ekoeVar.c;
        for (int i4 = 0; i4 < i3; i4++) {
            dxcn dxcnVar = (dxcn) ekgbVar.get(i4);
            if (dxcnVar.b().g()) {
                ekfwVar2.h((dxcm) dxcnVar.b().c());
            }
        }
        ekgb ekgbVarG2 = ekfwVar2.g();
        this.c = ekgbVarG2;
        int i5 = ((ekoe) ekgbVarG2).c;
        for (int i6 = 0; i6 < i5; i6++) {
            dxcm dxcmVar = (dxcm) ekgbVarG2.get(i6);
            dxcmVar.b();
            dxcmVar.a();
        }
    }

    @Override // defpackage.dxcr
    public final void a(dxco dxcoVar) {
        dxdj dxdjVar = this.b;
        Map map = dxdjVar.f;
        if (map.containsKey(dxcoVar)) {
            map.remove(dxcoVar);
            dxdjVar.H();
        }
    }
}
