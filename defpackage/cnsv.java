package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsv implements cnss {
    public brap a;
    final /* synthetic */ cnsx b;

    public cnsv(cnsx cnsxVar, final String str) {
        this.b = cnsxVar;
        try {
            cqbd cqbdVarD = cnsx.a.d();
            cqbdVarD.I("Querying for local messages.");
            cqbdVarD.A("selection", str);
            cqbdVarD.r();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("+SyncCursorPair#LocalCursorIterator");
            brdrVarD.h(new Function() { // from class: cnst
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.ar(new dqxm(str));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bran branVar = MessagesTable.c;
            brdrVarD.d(new brdo(branVar.i, false));
            brdrVarD.c(branVar.a, branVar.i, branVar.o, branVar.j, branVar.b, branVar.x, branVar.s, branVar.ar);
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.f(new Function() { // from class: cnsu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bsgr) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjl bsjlVar = new bsjl();
            bsjlVar.u();
            bsjlVar.ap(new dqpk("parts.message_id", 1, branVar.a));
            bsjeVarC.g(bsjlVar);
            bsjeVarC.y(1);
            brdrVarD.n(bsjeVarC.b(), "parts_expression");
            this.a = (brap) brdrVarD.b().p();
        } catch (SQLiteException e) {
            cqbd cqbdVarB = cnsx.a.b();
            cqbdVarB.I("failed to query local sms/mms");
            cqbdVarB.s(e);
            throw e;
        }
    }
}
