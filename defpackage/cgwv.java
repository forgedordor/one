package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgwv {
    public static final void a(brdu brduVar, final MessageIdType messageIdType) {
        brduVar.X(new Function() { // from class: cgwu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.p(messageIdType);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.ak();
        brduVar.b().e();
    }

    public static final brdu b() {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("failedUpdateBuilder");
        brduVar.U(8);
        brduVar.B(10001);
        return brduVar;
    }

    public static final ekgb c(doqi doqiVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+updatePhotosSharingState");
        brec brecVar = new brec();
        brecVar.ae(10);
        brdrVarD.g(brecVar);
        bran branVar = MessagesTable.c;
        brdrVarD.d(new brdo(branVar.i, false));
        brao braoVar = branVar.a;
        brdrVarD.c(braoVar);
        String[] strArr = bqik.a;
        bqif bqifVar = new bqif(bqik.a);
        bqifVar.A("photosSharingTableQuery");
        bqij bqijVar = new bqij();
        bqijVar.ap(new dqpk("message_photos_sharing.sharing_state", 1, new dqxl("$R", new Object[]{dqru.i(cgwb.a.b(doqiVar).toByteArray())})));
        bqifVar.k(new bqii(bqijVar));
        brdrVarD.E(dqts.i(bqifVar.b(), bqik.b.a, braoVar).g());
        brdrVarD.w(braoVar);
        return brdrVarD.b().g();
    }

    public static final bqih d(cgvx cgvxVar) {
        String[] strArr = bqik.a;
        bqih bqihVar = new bqih();
        bqihVar.ap("updatePhotosSharingState");
        if (cgvxVar == null) {
            bqihVar.a.putNull("sharing_state");
            return bqihVar;
        }
        bqihVar.a.put("sharing_state", cgvxVar.toByteArray());
        return bqihVar;
    }

    public static final brdu e() {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("yetToSendUpdateBuilder");
        brduVar.U(4);
        brec brecVar = new brec();
        brecVar.ae(10);
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.f(new Function() { // from class: cgws
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsgr) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.h(new Function() { // from class: cgwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.b(new Function() { // from class: cgwq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsjl bsjlVar2 = (bsjl) obj2;
                        bsjlVar2.s();
                        return bsjlVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cgwr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsjl bsjlVar2 = (bsjl) obj2;
                        bsjlVar2.t(bvdt.SUCCEEDED);
                        return bsjlVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brecVar.x(bsjeVarC.b());
        brduVar.af(new brdv(brecVar));
        return brduVar;
    }
}
