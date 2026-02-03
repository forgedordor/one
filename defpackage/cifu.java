package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cifu extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cifv f;
    final /* synthetic */ audk g;
    final /* synthetic */ ConversationIdType h;
    final /* synthetic */ ewxh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cifu(cifv cifvVar, audk audkVar, ConversationIdType conversationIdType, ewxh ewxhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = cifvVar;
        this.g = audkVar;
        this.h = conversationIdType;
        this.i = ewxhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cifu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [alqm] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        cifv cifvVar;
        String str;
        Object next;
        int i;
        String str2;
        aubq aubqVar;
        Optional optionalO;
        fcyl fcylVar = fcyl.a;
        if (this.e != 0) {
            obj4 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            ?? r4 = this.a;
            fctl.b(obj);
            cifvVar = r4;
        } else {
            fctl.b(obj);
            cifv cifvVar2 = this.f;
            obj2 = this.g;
            obj3 = this.h;
            ewxh ewxhVar = this.i;
            this.a = cifvVar2;
            this.b = obj2;
            this.c = obj3;
            this.d = ewxhVar;
            this.e = 1;
            Object objA = cifvVar2.a(this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj4 = ewxhVar;
            obj = objA;
            cifvVar = cifvVar2;
        }
        obj.getClass();
        ekgb ekgbVar = (ekgb) obj;
        eksp ekspVar = cifv.a;
        cifv cifvVar3 = cifvVar;
        List listK = ((bakt) cifvVar3.e.b()).K((ConversationIdType) obj3);
        Set setO = ((dggw) cifvVar3.c.b()).o();
        ArrayList arrayList = new ArrayList(fcva.p(setO, 10));
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            arrayList.add(((asqx) cifvVar3.d.b()).c(((dggk) it.next()).a));
        }
        Set setAv = fcva.av(arrayList);
        Iterator it2 = ekgbVar.iterator();
        while (true) {
            str = null;
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
        ?? r6 = (aoerVar == null || (optionalO = aoerVar.o()) == null) ? 0 : (alqm) fdct.b(optionalO);
        Stream stream = Collection.EL.stream(((audk) obj2).h);
        final fdap fdapVar = new fdap() { // from class: cifo
            @Override // defpackage.fdap
            public final Object invoke(Object obj5) {
                auek auekVar = (auek) obj5;
                auekVar.getClass();
                return Boolean.valueOf((auekVar.b & 2) != 0);
            }
        };
        Stream streamFilter = stream.filter(new Predicate() { // from class: cifp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj5) {
                return ((Boolean) fdapVar.invoke(obj5)).booleanValue();
            }
        });
        final fdap fdapVar2 = new fdap() { // from class: cifq
            @Override // defpackage.fdap
            public final Object invoke(Object obj5) {
                auek auekVar = (auek) obj5;
                auekVar.getClass();
                eksp ekspVar2 = cifv.a;
                int i2 = auekVar.d;
                auej auejVarB = auej.b(i2);
                if (auejVarB == null) {
                    auejVarB = auej.UNKNOWN_STATE;
                }
                boolean z = true;
                if (auejVarB != auej.JOINED) {
                    auej auejVarB2 = auej.b(i2);
                    if (auejVarB2 == null) {
                        auejVarB2 = auej.UNKNOWN_STATE;
                    }
                    if (auejVarB2 != auej.PENDING) {
                        auej auejVarB3 = auej.b(i2);
                        if (auejVarB3 == null) {
                            auejVarB3 = auej.UNKNOWN_STATE;
                        }
                        if (auejVarB3 != auej.UNKNOWN_STATE) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        Object objCollect = streamFilter.filter(new Predicate() { // from class: cifr
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj5) {
                return ((Boolean) fdapVar2.invoke(obj5)).booleanValue();
            }
        }).collect(ekcv.a);
        objCollect.getClass();
        ekgb ekgbVar2 = (ekgb) objCollect;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, ellgVar);
        ewxi ewxiVar = (ewxi) ewxj.a.createBuilder();
        ewxiVar.getClass();
        ewxf.e((ewxh) obj4, ewxiVar);
        int size = ekgbVar2.size();
        ewxiVar.copyOnWrite();
        ewxj ewxjVar = (ewxj) ewxiVar.instance;
        ewxjVar.b |= 2;
        ewxjVar.d = size;
        boolean z = false;
        if (ekgbVar2.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = ekgbVar2.iterator();
            i = 0;
            while (it3.hasNext()) {
                aubq aubqVar2 = ((auek) it3.next()).c;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                if (setAv.contains(aubqVar2) && (i = i + 1) < 0) {
                    fcva.l();
                }
            }
        }
        ewxiVar.copyOnWrite();
        ewxj ewxjVar2 = (ewxj) ewxiVar.instance;
        ewxjVar2.b |= 4;
        ewxjVar2.e = i;
        boolean z2 = r6 == 0;
        if (r6 != 0) {
            Optional optionalE = r6.e();
            if (optionalE != null && (aubqVar = (aubq) fdct.b(optionalE)) != null) {
                str = aubqVar.d;
            }
            str2 = str;
            str = r6;
        } else {
            str2 = null;
        }
        if (str != null && !ekgbVar2.isEmpty()) {
            Iterator it4 = ekgbVar2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                auek auekVar = (auek) it4.next();
                if ((auekVar.b & 1) != 0) {
                    aubq aubqVar3 = auekVar.c;
                    if (aubqVar3 == null) {
                        aubqVar3 = aubq.a;
                    }
                    if (fdbq.f(aubqVar3.d, str2)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        ewxiVar.copyOnWrite();
        ewxj ewxjVar3 = (ewxj) ewxiVar.instance;
        ewxjVar3.b |= 8;
        ewxjVar3.f = z;
        ewxf.c(listK.size(), ewxiVar);
        listK.getClass();
        ewxf.d(cifs.b(listK, setAv), ewxiVar);
        ewxf.b(cifs.a(r6, listK), ewxiVar);
        ewxf.f(!z2, ewxiVar);
        ewxf.g(cifv.c(ekgbVar), ewxiVar);
        ewxf.h(setAv.size(), ewxiVar);
        elgr.e(ewxf.a(ewxiVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ((aimb) cifvVar3.b.b()).a().h((ellg) builder, aioj.LOG_SPEC_DSDR_GROUP_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cifu(this.f, this.g, this.h, this.i, fcxyVar);
    }
}
