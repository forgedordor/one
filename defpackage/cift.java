package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cift extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cifv e;
    final /* synthetic */ audc f;
    final /* synthetic */ ConversationIdType g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cift(cifv cifvVar, audc audcVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = cifvVar;
        this.f = audcVar;
        this.g = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cift) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        alqm alqmVar;
        Object next;
        Optional optionalO;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            Object obj5 = this.a;
            fctl.b(obj);
            obj4 = obj5;
        } else {
            fctl.b(obj);
            cifv cifvVar = this.e;
            obj2 = this.f;
            ConversationIdType conversationIdType = this.g;
            this.a = cifvVar;
            this.b = obj2;
            this.c = conversationIdType;
            this.d = 1;
            Object objA = cifvVar.a(this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj3 = conversationIdType;
            obj = objA;
            obj4 = cifvVar;
        }
        obj.getClass();
        ekgb ekgbVar = (ekgb) obj;
        eksp ekspVar = cifv.a;
        cifv cifvVar2 = (cifv) obj4;
        List listK = ((bakt) cifvVar2.e.b()).K((ConversationIdType) obj3);
        Set setO = ((dggw) cifvVar2.c.b()).o();
        ArrayList arrayList = new ArrayList(fcva.p(setO, 10));
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            arrayList.add(((asqx) cifvVar2.d.b()).c(((dggk) it.next()).a));
        }
        Set setAv = fcva.av(arrayList);
        Iterator<E> it2 = ekgbVar.iterator();
        while (true) {
            alqmVar = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((aoer) next).x()) {
                break;
            }
        }
        aoer aoerVar = (aoer) next;
        if (aoerVar != null && (optionalO = aoerVar.o()) != null) {
            alqmVar = (alqm) fdct.b(optionalO);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, ellgVar);
        ewxi ewxiVar = (ewxi) ewxj.a.createBuilder();
        ewxiVar.getClass();
        ewxf.e(ewxh.GROUP_EVENT_NOTIFICATION, ewxiVar);
        audc audcVar = (audc) obj2;
        int size = audcVar.g.size();
        ewxiVar.copyOnWrite();
        ewxj ewxjVar = (ewxj) ewxiVar.instance;
        ewxjVar.b |= 8192;
        ewxjVar.m = size;
        evtg evtgVar = audcVar.g;
        evtgVar.getClass();
        boolean zC = cifs.c(alqmVar, evtgVar);
        ewxiVar.copyOnWrite();
        ewxj ewxjVar2 = (ewxj) ewxiVar.instance;
        ewxjVar2.b |= 32768;
        ewxjVar2.o = zC;
        evtg evtgVar2 = audcVar.g;
        evtgVar2.getClass();
        int iD = cifs.d(evtgVar2, setAv);
        ewxiVar.copyOnWrite();
        ewxj ewxjVar3 = (ewxj) ewxiVar.instance;
        ewxjVar3.b |= 16384;
        ewxjVar3.n = iD;
        int size2 = audcVar.h.size();
        ewxiVar.copyOnWrite();
        ewxj ewxjVar4 = (ewxj) ewxiVar.instance;
        ewxjVar4.b |= 65536;
        ewxjVar4.p = size2;
        evtg evtgVar3 = audcVar.h;
        evtgVar3.getClass();
        boolean zC2 = cifs.c(alqmVar, evtgVar3);
        ewxiVar.copyOnWrite();
        ewxj ewxjVar5 = (ewxj) ewxiVar.instance;
        ewxjVar5.b |= 262144;
        ewxjVar5.r = zC2;
        evtg evtgVar4 = audcVar.h;
        evtgVar4.getClass();
        int iD2 = cifs.d(evtgVar4, setAv);
        ewxiVar.copyOnWrite();
        ewxj ewxjVar6 = (ewxj) ewxiVar.instance;
        ewxjVar6.b |= 131072;
        ewxjVar6.q = iD2;
        ewxf.c(listK.size(), ewxiVar);
        listK.getClass();
        ewxf.d(cifs.b(listK, setAv), ewxiVar);
        ewxf.b(cifs.a(alqmVar, listK), ewxiVar);
        ewxf.f(alqmVar != null, ewxiVar);
        ewxf.g(cifv.c(ekgbVar), ewxiVar);
        ewxf.h(setAv.size(), ewxiVar);
        elgr.e(ewxf.a(ewxiVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ((aimb) cifvVar2.b.b()).a().h((ellg) builder, aioj.LOG_SPEC_DSDR_GROUP_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cift(this.e, this.f, this.g, fcxyVar);
    }
}
