package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczz extends fcyz implements fdat {
    int a;
    final /* synthetic */ adae b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczz(fcxy fcxyVar, adae adaeVar) {
        super(2, fcxyVar);
        this.b = adaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.b.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgp ekgpVar = (ekgp) obj;
        ekgi ekgiVar = new ekgi();
        ekgpVar.getClass();
        Iterator it = ekgpVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            adae adaeVar = this.b;
            Object key = entry.getKey();
            key.getClass();
            final ConversationIdType conversationIdType = (ConversationIdType) key;
            Object value = entry.getValue();
            value.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : ((Map) value).entrySet()) {
                if (((Instant) entry2.getValue()).isAfter(adaeVar.d.f())) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(fcva.p(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(adaeVar.c.b((aubq) it2.next()));
            }
            final Set setAv = fcva.av(arrayList);
            bsbo bsboVarE = ParticipantsTable.e();
            brzh brzhVar = ParticipantsTable.c;
            bsboVarE.c(brzhVar.a, brzhVar.n, brzhVar.m, brzhVar.h);
            bsboVarE.h(new Function() { // from class: aczy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Set set = setAv;
                    bsbx bsbxVar = (bsbx) obj2;
                    ArrayList arrayList2 = new ArrayList(fcva.p(set, 10));
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((alqm) it3.next()).o());
                    }
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    bsbxVar.s(arrayList2);
                    bsbxVar.getClass();
                    String[] strArr = boiv.a;
                    boiq boiqVar = new boiq(boiv.a);
                    boiqVar.c(boiv.c.b);
                    boiqVar.f(new Function() { // from class: aczw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            boiu boiuVar = (boiu) obj3;
                            boiuVar.b(conversationIdType2);
                            return boiuVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsbxVar.l(boiqVar.b());
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsboVarE.A("HomeScreenActiveComposersObservableSupplier#getActiveComposerParticipantData");
            ekgb ekgbVarZ = bsboVarE.b().z();
            ekgbVarZ.getClass();
            ekhx ekhxVarF = ekfv.f(ekgbVarZ);
            if (!ekhxVarF.isEmpty()) {
                ekgiVar.i(entry.getKey(), ekhxVarF);
            }
        }
        return new adah(ekgiVar.c());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aczz aczzVar = new aczz(fcxyVar, this.b);
        aczzVar.c = obj;
        return aczzVar;
    }
}
