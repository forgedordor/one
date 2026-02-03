package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckee {
    public static final MessageIdType a(basd basdVar) {
        basdVar.getClass();
        Object objM = basdVar.m(new Function() { // from class: cked
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) throws IOException {
                final basd basdVar2 = (basd) obj;
                String[] strArr = bqfo.a;
                bqfj bqfjVar = new bqfj(bqfo.a);
                bqfjVar.A("getLatestEditMessageId");
                bqfjVar.e(new Function() { // from class: ckeb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new bqev[]{((bqeu) obj2).b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqfjVar.y(1);
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.v();
                brdrVarD.h(new Function() { // from class: ckec
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar = (brec) obj2;
                        brecVar.F(basdVar2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqfjVar.H(dqts.i(brdrVarD.a(), MessagesTable.c.a, bqfo.c.a).g());
                dqqj dqqjVarP = bqfjVar.a().p();
                try {
                    bqew bqewVar = (bqew) dqqjVarP;
                    if (bqewVar.moveToFirst()) {
                        MessageIdType messageIdTypeC = bqewVar.c();
                        fczl.a(dqqjVarP, null);
                        return messageIdTypeC;
                    }
                    MessageIdType messageIdType = bary.a;
                    fczl.a(dqqjVarP, null);
                    return messageIdType;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(dqqjVarP, th);
                        throw th2;
                    }
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objM.getClass();
        return (MessageIdType) objM;
    }
}
