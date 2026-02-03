package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctwn b;
    final /* synthetic */ List c;
    final /* synthetic */ ConversationId d;
    final /* synthetic */ fdae e;
    final /* synthetic */ cudx f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctwj(fcxy fcxyVar, ctwn ctwnVar, List list, cudx cudxVar, ConversationId conversationId, fdae fdaeVar) {
        super(2, fcxyVar);
        this.b = ctwnVar;
        this.c = list;
        this.f = cudxVar;
        this.d = conversationId;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctwj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        auib auibVarB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctwn ctwnVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = ctwnVar.b(list, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            cqce cqceVar = ctwn.a;
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("Add identities to Rcs group");
            List list2 = this.c;
            cqbdVarC.y("newRecipientCount", list2.size());
            cqbdVarC.r();
            cudx cudxVar = this.f;
            if (cudxVar.d == cueh.e && cudxVar.e.size() < 2) {
                cqbd cqbdVarC2 = cqceVar.c();
                cqbdVarC2.I("Failed to add people to Rcs group since less than two identities are selected.");
                cqbdVarC2.r();
                this.b.c(null);
                return fctx.a;
            }
            ctwn ctwnVar2 = this.b;
            if (((ardw) ctwnVar2.e.b()).a()) {
                auibVarB = ((cifw) ctwnVar2.d.b()).b();
            } else {
                auibVarB = auib.a;
                auibVarB.getClass();
            }
            String str = list2.size() <= 1 ? ((ChipData) list2.get(0)).b : null;
            cqob cqobVar = new cqob(new ctwk(ctwnVar2, str), new ctwl(ctwnVar2, str));
            cisv cisvVar = ctwnVar2.c;
            cist cistVar = (cist) cisu.a.createBuilder();
            ConversationId conversationId = this.d;
            String strB = conversationId.b();
            cistVar.copyOnWrite();
            cisu cisuVar = (cisu) cistVar.instance;
            strB.getClass();
            cisuVar.c = strB;
            ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(alre.c(((ChipData) it.next()).a));
            }
            cistVar.copyOnWrite();
            cisu cisuVar2 = (cisu) cistVar.instance;
            cisuVar2.a();
            evpz.addAll(arrayList, cisuVar2.d);
            cistVar.copyOnWrite();
            cisu cisuVar3 = (cisu) cistVar.instance;
            auibVarB.getClass();
            cisuVar3.f = auibVarB;
            cisuVar3.b |= 2;
            cisu cisuVar4 = (cisu) cistVar.build();
            caxr caxrVar = new caxr();
            caxrVar.a = conversationId.b();
            caxrVar.e = cqobVar;
            ((cazj) cisvVar.a.b()).g(cbcu.g("add_members_to_rcs_conversation", cisuVar4, caxrVar.a()));
            ctwnVar2.b.j(agbf.a);
        } else {
            cqbd cqbdVarC3 = ctwn.a.c();
            cqbdVarC3.I("Create new group chat since not all recipients have Rcs.");
            cqbdVarC3.r();
            this.e.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctwj ctwjVar = new ctwj(fcxyVar, this.b, this.c, this.f, this.d, this.e);
        ctwjVar.g = obj;
        return ctwjVar;
    }
}
