package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayy {
    public static final /* synthetic */ int a = 0;
    private static final brdv b;
    private final bxlc c;
    private final fcsu d;

    static {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.ae(10);
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("PROCESSING_COMPLETE_YET_TO_SEND");
        bsjeVarC.f(new Function() { // from class: bayu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bayy.a;
                return ((bsgr) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.h(new Function() { // from class: bayv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                int i = bayy.a;
                bsjlVar.b(new Function() { // from class: bayw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsjl bsjlVar2 = (bsjl) obj2;
                        int i2 = bayy.a;
                        bsjlVar2.s();
                        return bsjlVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bayx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsjl bsjlVar2 = (bsjl) obj2;
                        int i2 = bayy.a;
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
        b = new brdv(brecVar);
    }

    public bayy(bxlc bxlcVar, fcsu fcsuVar) {
        this.c = bxlcVar;
        this.d = fcsuVar;
    }

    public final int a() {
        boolean zBooleanValue = ((Boolean) cgwx.a.e()).booleanValue();
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.ae(10);
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("buildWhereProcessedMessageHasFailedParts");
        bsjeVarC.f(new Function() { // from class: bayt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bayy.a;
                return ((bsgr) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(bvdt.SUCCEEDED);
        if (zBooleanValue) {
            ekfwVar.h(bvdt.PENDING);
        }
        bsjl bsjlVar = new bsjl();
        ekgb ekgbVarG = ekfwVar.g();
        int iIntValue = PartsTable.e().intValue();
        if (iIntValue < 4020) {
            dqru.x("processing_status", iIntValue);
        }
        bsjlVar.ap(new dqpm("parts.processing_status", 4, bsjl.as((Iterable) ekpo.a(ekgbVarG).map(new Function() { // from class: bsjk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((bvdt) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bsjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        bsjeVarC.k(new bsji(bsjlVar));
        brecVar.s(bsjeVarC.b());
        brdv brdvVar = new brdv(brecVar);
        ajrc ajrcVar = (ajrc) this.d.b();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("promoteProcessedMessages-messages1");
        brdrVarD.s();
        brdrVarD.k(brdvVar);
        ekgb ekgbVarG2 = brdrVarD.b().g();
        ajsk ajskVarE = ajsl.e();
        ((ajqp) ajskVarE).a = Optional.of(10001);
        ajskVarE.b(embo.ATTACHMENT_PROCESS_FAILED);
        ajrcVar.e(ekgbVarG2, ajskVarE.a());
        brdv brdvVar2 = b;
        brdu brduVar = new brdu();
        brduVar.ap("promoteProcessedMessages-messages2");
        brduVar.U(4);
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("+notifyAboutMessagesChangeAndUpdate");
        brdrVarD2.s();
        brdrVarD2.k(brdvVar2);
        brap brapVar = (brap) brdrVarD2.b().p();
        while (brapVar.moveToNext()) {
            try {
                this.c.l(brapVar.p(), brapVar.q(), "message_status");
            } catch (Throwable th) {
                try {
                    brapVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brapVar.close();
        brduVar.af(brdvVar2);
        brduVar.ak();
        return brduVar.b().e();
    }
}
