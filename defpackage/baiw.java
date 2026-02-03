package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baiw {
    public static final bopq[] a;
    public static final brdv b;

    static {
        bopp boppVar = botm.c;
        a = new bopq[]{boppVar.M, boppVar.O, boppVar.aa, boppVar.ab};
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.J(3);
        brecVar.b(new Function() { // from class: bain
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                brecVar2.H(bvdx.UNKNOWN);
                brecVar2.D(1);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: baio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                brecVar2.I(bvdx.UNKNOWN);
                brecVar2.D(2);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: baip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                brecVar2.H(bvdx.NOT_SENT);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: baiq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                brecVar2.I(bvdx.NOT_SENT);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 37030) {
            dqru.x("report_attempt_acounter", iIntValue);
        }
        brecVar.ap(new dqty("messages.report_attempt_acounter", 10, 10L));
        b = new brdv(brecVar);
    }

    public static void a(Set set, brdr brdrVar) {
        final ekhx ekhxVar = (ekhx) Collection.EL.stream(set).map(new Function() { // from class: bais
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aubq) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.b(new Function() { // from class: bait
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                int iIntValue = MessagesTable.g().intValue();
                if (iIntValue < 59340) {
                    dqru.x("msisdn_receiving_rcs_message", iIntValue);
                }
                brecVar2.ap(new dqpm("messages.msisdn_receiving_rcs_message", 3, brec.as(ekhxVar), false));
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: baiu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar2 = (brec) obj;
                bopq[] bopqVarArr = baiw.a;
                brecVar2.X(ekhxVar);
                return brecVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.k(new brdv(brecVar));
    }

    public static void b(brdr brdrVar) {
        brdrVar.d(new brdo(MessagesTable.c.i, true));
    }
}
