package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckff extends fcyz implements fdat {
    final /* synthetic */ basd a;
    final /* synthetic */ String b;
    final /* synthetic */ ckfg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckff(fcxy fcxyVar, basd basdVar, String str, ckfg ckfgVar) {
        super(2, fcxyVar);
        this.a = basdVar;
        this.b = str;
        this.c = ckfgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Instant instant;
        fctl.b(obj);
        final String str = this.b;
        Instant instant2 = (Instant) this.a.m(new Function() { // from class: ckdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) throws IOException {
                final basd basdVar = (basd) obj2;
                String[] strArr = bqfo.a;
                bqfj bqfjVar = new bqfj(bqfo.a);
                bqfjVar.A("getEarliestTimestampForEditedMessage");
                bqfjVar.e(new Function() { // from class: ckdy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new bqev[]{((bqeu) obj3).e};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.e(new Function() { // from class: ckdz
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
                brdrVarD.h(new Function() { // from class: ckea
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
                brdp brdpVarB = brdrVarD.b();
                brao braoVar = MessagesTable.c.a;
                bqeu bqeuVar = bqfo.c;
                bqfjVar.H(dqts.i(brdpVarB, braoVar, bqeuVar.a).g());
                bqfjVar.d(new bqfg(bqeuVar.e));
                bqfjVar.y(1);
                dqqj dqqjVarP = bqfjVar.b().p();
                try {
                    bqew bqewVar = (bqew) dqqjVarP;
                    if (!bqewVar.moveToFirst()) {
                        fczl.a(dqqjVarP, null);
                        return null;
                    }
                    Instant instantG = bqewVar.g();
                    fczl.a(dqqjVarP, null);
                    return instantG;
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (instant2 == null || (instant = this.c.a) == null) {
            return null;
        }
        return Duration.between(instant2, instant);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckff ckffVar = new ckff(fcxyVar, this.a, this.b, this.c);
        ckffVar.d = obj;
        return ckffVar;
    }
}
