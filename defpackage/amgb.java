package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgb {
    public static final brap a(MessageIdType messageIdType) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.e(new Function() { // from class: amfv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                branVar.getClass();
                return new brao[]{branVar.a, branVar.g, branVar.i, branVar.r, branVar.p, branVar.j, branVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.A("MessageQueryHelper.getBasicMessageDetailsData");
        brec brecVar = new brec();
        brecVar.p(messageIdType);
        brdrVarD.g(brecVar);
        return (brap) brdrVarD.b().p();
    }

    public static final bsgt b(Uri uri, MessageIdType messageIdType) {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.e(new Function() { // from class: amfx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsgr bsgrVar = (bsgr) obj;
                return new bsgs[]{bsgrVar.a, bsgrVar.e, bsgrVar.S};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.A("MessageQueryHelper.getPartsFileSizeBytes");
        bsjl bsjlVar = new bsjl();
        bsjlVar.v(uri);
        bsjlVar.n(messageIdType);
        bsjeVarC.g(bsjlVar);
        return (bsgt) bsjeVarC.b().p();
    }

    public static /* synthetic */ brdr c(String str, String str2, String str3, ekgb ekgbVar, int i) {
        if ((i & 1) != 0) {
            String[] strArr = PartsTable.a;
            str = "parts";
        }
        if ((i & 2) != 0) {
            String[] strArr2 = ParticipantsTable.a;
            str2 = "participants";
        }
        if ((i & 4) != 0) {
            String[] strArr3 = buyx.a;
            str3 = "user_references";
        }
        if ((i & 8) != 0) {
            int i2 = ekgb.d;
            ekgbVar = ekoe.a;
        }
        int i3 = i & 16;
        str.getClass();
        str2.getClass();
        str3.getClass();
        ekgbVar.getClass();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.e(new Function() { // from class: amfy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsgr bsgrVar = (bsgr) obj;
                return (bsgs[]) fcva.i(bsgrVar.a, bsgrVar.c, bsgrVar.e, bsgrVar.g, bsgrVar.v, bsgrVar.w, bsgrVar.f, bsgrVar.i, bsgrVar.j, bsgrVar.I, bsgrVar.S, bsgrVar.m, bsgrVar.J, bsgrVar.V, bsgrVar.b, bsgrVar.y, bsgrVar.z, bsgrVar.Q, bsgrVar.o, bsgrVar.C, bsgrVar.Y, bsgrVar.Z).toArray(new bsgs[0]);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekqh it = ekgbVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            bsjeVarC = ((ancm) it.next()).b(bsjeVarC);
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.e(new Function() { // from class: amfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                branVar.getClass();
                return new brao[]{branVar.a, branVar.b, branVar.c, branVar.i, branVar.k, branVar.n, branVar.y, branVar.j, branVar.D, branVar.r, branVar.p, branVar.u, branVar.I, branVar.ak, branVar.C, branVar.R, branVar.w, branVar.J, branVar.K, branVar.x, branVar.g, branVar.P, branVar.ae, branVar.ah, branVar.W};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ((dqox) brdrVarD.a).o = true;
        bsjc bsjcVarB = bsjeVarC.b();
        bsgs bsgsVar = PartsTable.d.b;
        brao braoVar = MessagesTable.c.a;
        bsjl bsjlVar = new bsjl();
        bsjlVar.ap(new dqpn("parts._id", 6));
        dqtr dqtrVarT = bsjcVarB.t(bsgsVar, braoVar, new bsji(bsjlVar));
        ((dqos) dqtrVarT).e = str;
        brdrVarD.H(dqtrVarT.g());
        if (i3 != 0) {
            String[] strArr4 = buyx.a;
            buyu buyuVar = new buyu(buyx.a);
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.e(new Function() { // from class: amfw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brzh brzhVar = (brzh) obj;
                    return new brzi[]{brzhVar.a, brzhVar.f, brzhVar.h, brzhVar.t, brzhVar.s, brzhVar.u, brzhVar.o, brzhVar.Q, brzhVar.m, brzhVar.n, brzhVar.r, brzhVar.z};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsbm bsbmVarB = bsboVarE.b();
            brzi brziVar = ParticipantsTable.c.a;
            buyd buydVar = buyx.c;
            dqtr dqtrVarI = dqts.i(bsbmVarB, brziVar, buydVar.c);
            ((dqos) dqtrVarI).e = str2;
            buyuVar.H(dqtrVarI.g());
            dqtr dqtrVarI2 = dqts.i(buyuVar.b(), buydVar.b, braoVar);
            ((dqos) dqtrVarI2).e = str3;
            brdrVarD.H(dqtrVarI2.g());
        }
        return brdrVarD;
    }
}
