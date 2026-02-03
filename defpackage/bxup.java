package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxup extends fcyz implements fdat {
    final /* synthetic */ bxur a;
    final /* synthetic */ bxwf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxup(fcxy fcxyVar, bxur bxurVar, bxwf bxwfVar) {
        super(2, fcxyVar);
        this.a = bxurVar;
        this.b = bxwfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxup) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        dqxl dqxlVar;
        final boolean z;
        ekgb ekgbVarG;
        fctl.b(obj);
        final Collection collectionC = this.b.c();
        final Function function = new Function() { // from class: bxuo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                boolean z2 = true;
                if (!le.w(str) && !le.f(str)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Object objE = ames.a.e();
        objE.getClass();
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        eieu eieuVarK = eiiy.k("MessageTableOperations#getMessageAbsoluteOffsets");
        try {
            int i2 = ekgb.d;
            final ekfw ekfwVar = new ekfw();
            if (collectionC.isEmpty()) {
                ekgbVarG = ekfwVar.g();
            } else {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("getMessageAbsoluteOffsets");
                brdrVarD.e(new Function() { // from class: ancp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bran branVar = (bran) obj2;
                        return new brao[]{branVar.a, branVar.i};
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                if (!apsb.a()) {
                    i = 1;
                    if (zBooleanValue) {
                        String[] strArr = PartsTable.a;
                        bran branVar = MessagesTable.c;
                        String string = branVar.b.toString();
                        brao braoVar = branVar.i;
                        String string2 = braoVar.toString();
                        String string3 = braoVar.toString();
                        brao braoVar2 = branVar.a;
                        dqxlVar = new dqxl("SELECT COUNT(*) FROM $R as b LEFT JOIN $R as p ON b.$R = p.$R WHERE  (b.$R = 0) AND (b.$R <> 3) AND (b.$R <> $V) AND (b.$R = $R) AND  ((b.$R > $R) OR ((b.$R = $R)    AND (b.$R > $R)) OR ((b.$R = $R) AND (b.$R = $R) AND (p.$R > $V{J:parts})))", new Object[]{"messages", "parts", "_id", "message_id", "is_hidden", "message_status", "message_status", 16, "conversation_id", string, "received_timestamp", string2, "received_timestamp", string3, "_id", braoVar2.toString(), "received_timestamp", braoVar.toString(), "_id", braoVar2.toString(), "_id", PartsTable.d.a});
                        z = i;
                    } else {
                        bran branVar2 = MessagesTable.c;
                        String string4 = branVar2.b.toString();
                        brao braoVar3 = branVar2.i;
                        dqxlVar = new dqxl("SELECT COUNT(*) FROM $R as b WHERE (b.$R = 0) AND (b.$R <> 3)  AND (b.$R <> $V) AND (b.$R = $R) AND ((b.$R > $R) OR ((b.$R = $R) AND (b.$R > $R)))", new Object[]{"messages", "is_hidden", "message_status", "message_status", 16, "conversation_id", string4, "received_timestamp", braoVar3.toString(), "received_timestamp", braoVar3.toString(), "_id", branVar2.a.toString()});
                        z = 0;
                    }
                } else if (zBooleanValue) {
                    String[] strArr2 = PartsTable.a;
                    bran branVar3 = MessagesTable.c;
                    String string5 = branVar3.b.toString();
                    brao braoVar4 = branVar3.i;
                    String string6 = braoVar4.toString();
                    String string7 = braoVar4.toString();
                    brao braoVar5 = branVar3.a;
                    i = 1;
                    dqxlVar = new dqxl("SELECT COUNT(*) FROM $R as b LEFT JOIN $R as p ON b.$R = p.$R WHERE  (b.$R = 0) AND (b.$R <> 3) AND (b.$R NOT IN ($V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V))  AND (b.$R = $R) AND  ((b.$R > $R) OR ((b.$R = $R)    AND (b.$R > $R)) OR ((b.$R = $R) AND (b.$R = $R) AND (p.$R > $V{J:parts})))", new Object[]{"messages", "parts", "_id", "message_id", "is_hidden", "message_status", "message_status", 16, 214, 215, 216, 233, 234, 252, 235, 236, 237, 238, 219, 208, 223, 224, 222, "conversation_id", string5, "received_timestamp", string6, "received_timestamp", string7, "_id", braoVar5.toString(), "received_timestamp", braoVar4.toString(), "_id", braoVar5.toString(), "_id", PartsTable.d.a});
                    z = i;
                } else {
                    i = 1;
                    bran branVar4 = MessagesTable.c;
                    String string8 = branVar4.b.toString();
                    brao braoVar6 = branVar4.i;
                    dqxlVar = new dqxl("SELECT COUNT(*) FROM $R as b WHERE (b.$R = 0) AND (b.$R <> 3)  AND (b.$R NOT IN ($V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V, $V))  AND (b.$R = $R)  AND ((b.$R > $R) OR ((b.$R = $R) AND (b.$R > $R)))", new Object[]{"messages", "is_hidden", "message_status", "message_status", 16, 214, 215, 216, 233, 234, 252, 235, 236, 237, 238, 219, 208, 223, 224, 222, "conversation_id", string8, "received_timestamp", braoVar6.toString(), "received_timestamp", braoVar6.toString(), "_id", branVar4.a.toString()});
                    z = 0;
                }
                brdrVarD.n(dqxlVar, "offset");
                brdrVarD.h(new Function() { // from class: ancq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar = (brec) obj2;
                        brecVar.t(collectionC);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                Object[] objArr = new Object[i];
                objArr[0] = "offset";
                brdrVarD.C(new dqxl("$R", objArr));
                if (z != 0) {
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.A("fanOutWhenFlatteningIfNeeded");
                    bsjeVarC.e(new Function() { // from class: ancu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsgr bsgrVar = (bsgr) obj2;
                            return new bsgs[]{bsgrVar.a, bsgrVar.f};
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    brdrVarD.H(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a).g());
                }
                Iterable$EL.forEach(brdrVarD.b().z(), new Consumer() { // from class: ancr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) throws NumberFormatException {
                        int i3;
                        PartsTable.BindData bindData;
                        String strI;
                        CoreBugleMessageId coreBugleMessageId;
                        MessagesTable.BindData bindData2 = (MessagesTable.BindData) obj2;
                        try {
                            i3 = Integer.parseInt(bindData2.az("offset"));
                        } catch (NumberFormatException unused) {
                            i3 = 0;
                        }
                        ekfw ekfwVar2 = ekfwVar;
                        if (!z) {
                            ekfwVar2.h(new bxuv(new CoreBugleMessageId(bindData2.E(), -1L), i3));
                            return;
                        }
                        String[] strArr3 = PartsTable.a;
                        PartsTable.BindData[] bindDataArr = (PartsTable.BindData[]) bindData2.aH("parts", new PartsTable.BindData[0]);
                        if (bindDataArr == null || bindDataArr.length == 0 || (strI = (bindData = bindDataArr[0]).I()) == null || !((Boolean) function.apply(strI)).booleanValue()) {
                            return;
                        }
                        MessageIdType messageIdTypeE = bindData2.E();
                        try {
                            coreBugleMessageId = new CoreBugleMessageId(messageIdTypeE, Long.parseLong(bindData.K()));
                        } catch (NumberFormatException unused2) {
                            coreBugleMessageId = new CoreBugleMessageId(messageIdTypeE, -1L);
                        }
                        ekfwVar2.h(new bxuv(coreBugleMessageId, i3));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ekgbVarG = ekfwVar.g();
            }
            eieuVarK.close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxup bxupVar = new bxup(fcxyVar, this.a, this.b);
        bxupVar.c = obj;
        return bxupVar;
    }
}
