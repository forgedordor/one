package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.axny;
import defpackage.axnz;
import defpackage.bbae;
import defpackage.bsje;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FillPartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axny();
    public final fcsu a;
    private final dqsn b;

    /* compiled from: PG */
    public interface a {
        axnz hH();
    }

    public FillPartSizeAction(fcsu fcsuVar, dqsn dqsnVar) {
        super(elgm.FILL_PART_SIZE_ACTION);
        this.a = fcsuVar;
        this.b = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("FillPartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FillPartSize.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        final bbae bbaeVar = (bbae) this.a.b();
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperations#getMessagePartsWithoutSizes");
        try {
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("getMessagePartsWithoutSizes");
            bsjeVarC.s();
            bsjeVarC.h(new Function() { // from class: baze
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.b(new Function() { // from class: bazw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsjl bsjlVar2 = (bsjl) obj2;
                            bsjlVar2.g("image/%");
                            return bsjlVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bazx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsjl bsjlVar2 = (bsjl) obj2;
                            bsjlVar2.g("video/%");
                            return bsjlVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bazy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsjl bsjlVar2 = (bsjl) obj2;
                            bsjlVar2.f("application/vnd.gsma.rcspushlocation+xml");
                            return bsjlVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsjlVar.ap(new dqty("parts.width", 1, -1));
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream streamE = bsjeVarC.b().E();
            try {
                List<MessagePartCoreData> list = (List) streamE.map(new Function() { // from class: bazf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bahv) bbaeVar.a.b()).e((PartsTable.BindData) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bazg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (streamE != null) {
                    streamE.close();
                }
                eieuVarK.close();
                if (list == null) {
                    return null;
                }
                for (final MessagePartCoreData messagePartCoreData : list) {
                    messagePartCoreData.af();
                    this.b.c("FillPartSizeAction.doBackgroundWork", new ejxr() { // from class: axnx
                        @Override // defpackage.ejxr
                        public final Object get() {
                            MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                            ConversationIdType conversationIdTypeA = messagePartCoreData2.A();
                            if (conversationIdTypeA == null) {
                                conversationIdTypeA = barn.a;
                            }
                            bbae bbaeVar2 = (bbae) this.a.a.b();
                            MessageIdType messageIdTypeB = messagePartCoreData2.B();
                            String strW = messagePartCoreData2.W();
                            String[] strArr = PartsTable.a;
                            bsjh bsjhVar = new bsjh();
                            bsjhVar.ap("FillPartSizeAction#doBackgroundWork");
                            bsjhVar.B(messagePartCoreData2.c());
                            bsjhVar.p(messagePartCoreData2.b());
                            return Boolean.valueOf(bbaeVar2.f(conversationIdTypeA, messageIdTypeB, strW, bsjhVar));
                        }
                    });
                }
                return null;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public FillPartSizeAction(fcsu fcsuVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.FILL_PART_SIZE_ACTION);
        this.a = fcsuVar;
        this.b = dqsnVar;
    }
}
