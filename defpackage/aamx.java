package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamx extends fcyz implements fdat {
    final /* synthetic */ aani a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamx(aani aaniVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aaniVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aamx) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("getConversationParticipantMessagingIdentities");
        final aani aaniVar = this.a;
        boiqVar.f(new Function() { // from class: aamu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                boiu boiuVar = (boiu) obj2;
                boiuVar.b(aaniVar.f.C());
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVar.d(new Function() { // from class: aamv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new boid[]{boiv.c.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.e(new Function() { // from class: aamw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brzh brzhVar = ParticipantsTable.c;
                return new brzi[]{brzhVar.g, brzhVar.f, brzhVar.h, brzhVar.z};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = ((boiq) boiqVar.j(dqts.i(bsboVarE.b(), ParticipantsTable.c.a, boiv.c.b))).b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(aaniVar.a.q((ParticipantsTable.BindData) ((bohm) it.next()).ax("participants", ParticipantsTable.BindData.class)));
        }
        return fcva.av(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aamx(this.a, fcxyVar);
    }
}
