package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdf extends fcyz implements fdat {
    final /* synthetic */ ckdh a;
    final /* synthetic */ basd b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckdf(fcxy fcxyVar, ckdh ckdhVar, basd basdVar, String str) {
        super(2, fcxyVar);
        this.a = ckdhVar;
        this.b = basdVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckdf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Instant instant;
        fctl.b(obj);
        ckdh ckdhVar = this.a;
        final String str = this.c;
        Instant instant2 = (Instant) this.b.m(new Function() { // from class: ckdb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) throws IOException {
                final basd basdVar = (basd) obj2;
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("getDeletedMessageReceivedTimestamp");
                brdrVarD.e(new Function() { // from class: ckcz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new brao[]{((bran) obj3).i};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final String str2 = str;
                brdrVarD.h(new Function() { // from class: ckda
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        brec brecVar = (brec) obj3;
                        brecVar.F(basdVar);
                        brecVar.W(str2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.d(new brdo(MessagesTable.c.i, true));
                brdrVarD.y(1);
                dqqj dqqjVarP = brdrVarD.b().p();
                try {
                    brap brapVar = (brap) dqqjVarP;
                    if (!brapVar.moveToFirst()) {
                        fczl.a(dqqjVarP, null);
                        return null;
                    }
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(brapVar.l());
                    fczl.a(dqqjVarP, null);
                    return instantOfEpochMilli;
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (instant2 == null || (instant = ckdhVar.b) == null) {
            return null;
        }
        return Duration.between(instant2, instant);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckdf ckdfVar = new ckdf(fcxyVar, this.a, this.b, this.c);
        ckdfVar.d = obj;
        return ckdfVar;
    }
}
