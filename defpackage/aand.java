package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aand extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ aani b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aand(List list, aani aaniVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = list;
        this.b = aaniVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aand) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekhy ekhyVar = new ekhy();
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("getConversationsContainingParticipants");
        final List list = this.a;
        final aani aaniVar = this.b;
        boiqVar.f(new Function() { // from class: aanb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                boiu boiuVar = (boiu) obj2;
                String[] strArr2 = boiv.a;
                boiq boiqVar2 = new boiq(boiv.a);
                final List list2 = list;
                final aani aaniVar2 = aaniVar;
                boiqVar2.f(new Function() { // from class: aamz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        List list3 = list2;
                        boiu boiuVar2 = (boiu) obj3;
                        ArrayList arrayList = new ArrayList(fcva.p(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            String strR = ((ParticipantsTable.BindData) it.next()).R();
                            strR.getClass();
                            arrayList.add(Long.valueOf(Long.parseLong(strR)));
                        }
                        aani aaniVar3 = aaniVar2;
                        boiuVar2.f(arrayList);
                        boiuVar2.ap(new dqpj("conversation_to_participants.conversation_id", 2, Long.valueOf(barn.a(aaniVar3.f.C()))));
                        return boiuVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar2.d(new Function() { // from class: aana
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new boid[]{((boic) obj3).a};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar2.w(boiv.c.a);
                boiuVar.d(boiqVar2.b());
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVar.d(new Function() { // from class: aanc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                boic boicVar = (boic) obj2;
                return new boid[]{boicVar.b, boicVar.a};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = boiqVar.b().p();
        try {
            boie boieVar = (boie) dqqjVarP;
            while (boieVar.moveToNext()) {
                ekhyVar.b(new Long(boieVar.e().a), new Long(boieVar.c()));
            }
            fczl.a(dqqjVarP, null);
            return ekhyVar.a();
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aand(this.a, this.b, fcxyVar);
    }
}
