package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbq implements akbs {
    public static final eksp a = eksp.c("BugleTrustedContacts");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final aptm h;
    public final asjn i;
    public final asjm j;
    public final asjp k;
    public final fcsu l;
    public final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final ctce r;

    public akbq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, ctce ctceVar, fcsu fcsuVar10, aptm aptmVar, asjn asjnVar, asjm asjmVar, asjp asjpVar, aofc aofcVar, fcsu fcsuVar11, fcsu fcsuVar12) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        ctceVar.getClass();
        fcsuVar10.getClass();
        aptmVar.getClass();
        asjnVar.getClass();
        aofcVar.getClass();
        fcsuVar11.getClass();
        this.b = fcsuVar;
        this.n = fcsuVar2;
        this.o = fcsuVar3;
        this.c = fcsuVar4;
        this.p = fcsuVar5;
        this.d = fcsuVar6;
        this.e = fcsuVar7;
        this.f = fcsuVar8;
        this.q = fcsuVar9;
        this.r = ctceVar;
        this.g = fcsuVar10;
        this.h = aptmVar;
        this.i = asjnVar;
        this.j = asjmVar;
        this.k = asjpVar;
        this.l = fcsuVar11;
        this.m = fcsuVar12;
    }

    @Override // defpackage.akbs
    public final eiju a(ConversationId conversationId, akbl akblVar) {
        akblVar.getClass();
        Object objB = this.n.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new akbo(conversationId, akblVar, this, null));
    }

    @Override // defpackage.akbs
    public final eiju b(ConversationId conversationId) {
        conversationId.getClass();
        Object objB = this.n.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new akbp(this, conversationId, null));
    }

    @Override // defpackage.akbs
    public final Object c(ConversationIdType conversationIdType, fcxy fcxyVar) {
        return d(conversationIdType, fcvo.a, false, fcxyVar);
    }

    @Override // defpackage.akbs
    public final Object d(ConversationIdType conversationIdType, List list, boolean z, fcxy fcxyVar) {
        Object objB = this.o.b();
        objB.getClass();
        return fdin.a(eicg.a((fcyh) objB), new akbn(null, this, z, list, conversationIdType), fcxyVar);
    }

    public final boolean e() {
        return (this.i.a() && this.r.a()) || ((this.j.a() || this.k.a()) && this.r.b());
    }

    @Override // defpackage.akbs
    public final boolean f(ConversationIdType conversationIdType) {
        return g(conversationIdType, fcvo.a, false);
    }

    @Override // defpackage.akbs
    @fcsv
    public final boolean g(ConversationIdType conversationIdType, List list, boolean z) {
        Map mapC;
        list.getClass();
        ecem.b();
        if (!((cdni) this.e.b()).b()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.S, "ConversationTrustedContactsApi");
            ekslVar.q("Devices not under supervision, conversation is always allowed.");
            return true;
        }
        if (!z) {
            return cdmg.a(conversationIdType);
        }
        ecem.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alqm alqmVar = (alqm) it.next();
            linkedHashMap.put(alqmVar, alqmVar.l());
        }
        Set setAv = fcva.av(fcva.ae(linkedHashMap.values()));
        try {
            ddhv ddhvVar = (ddhv) this.p.b();
            ArrayList arrayList = new ArrayList(fcva.p(setAv, 10));
            Iterator it2 = setAv.iterator();
            while (it2.hasNext()) {
                Uri uriBuild = new Uri.Builder().scheme("sms").opaquePart((String) it2.next()).build();
                uriBuild.getClass();
                arrayList.add(uriBuild);
            }
            Object objF = degc.f(ddhvVar.a(fcva.Z(arrayList)));
            objF.getClass();
            mapC = cdmm.c((Map) objF);
        } catch (Exception unused) {
            eksl ekslVar2 = (eksl) a.j();
            ekslVar2.X(cqnc.S, "ConversationTrustedContactsApi");
            ekslVar2.q("Exception thrown by the Family Link API when querying areAllowed");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setAv, 10)), 16));
            for (Object obj : setAv) {
                linkedHashMap2.put(obj, false);
            }
            mapC = linkedHashMap2;
        }
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            alqm alqmVar2 = (alqm) entry.getKey();
            String str = (String) entry.getValue();
            if (str == null || str.length() == 0) {
                eksl ekslVar3 = (eksl) a.j();
                ekslVar3.X(cqnc.S, "ConversationTrustedContactsApi");
                ekslVar3.q("MessagingIdentity does not have a destination, default to not allowed by parents");
                return false;
            }
            if (mapC.get(str) == null) {
                eksl ekslVar4 = (eksl) a.j();
                ekslVar4.X(cqnc.S, "ConversationTrustedContactsApi");
                ekslVar4.q("A queried phone number is missing from the result returned by the ParentalControls API.");
            } else {
                Boolean bool = (Boolean) mapC.get(str);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (alqmVar2.t() || alqmVar2.A() || (!zBooleanValue && !alqmVar2.u() && !((bbdl) this.q.b()).j(alqmVar2))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.akbs
    public final Object h(ConversationId conversationId, fcxy fcxyVar) {
        Object objB = this.o.b();
        objB.getClass();
        return eicj.a((fcyh) objB, new akbm(this, conversationId, null), fcxyVar);
    }
}
