package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.auvh;
import defpackage.axlt;
import defpackage.aybt;
import defpackage.aybu;
import defpackage.aybz;
import defpackage.ayca;
import defpackage.bary;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.elgm;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveP2pSuggestionsAction extends Action<Void> implements Parcelable {
    private final ayca b;
    private static final cqce a = cqce.g("BugleDataModel", "ReceiveP2pSuggestionsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aybt();

    /* compiled from: PG */
    public interface a {
        aybu id();
    }

    public ReceiveP2pSuggestionsAction(ayca aycaVar, Bundle bundle) {
        super(bundle, elgm.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = aycaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveP2pSuggestionsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        h();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveConversationSuggestions.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("ReceiveP2pSuggestionsAction.executeActionAsync");
        try {
            try {
                MessageIdType messageIdTypeB = bary.b(this.v.l("target_message_id"));
                eijuVarE = this.b.d(messageIdTypeB, this.v.m("rcs.intent.extra.conversationClassifications"), new Supplier() { // from class: aybm
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (ArrayList) Collection.EL.stream(this.a.v.m(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS)).map(new Function() { // from class: aybp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgi) ((evwl) ((Parcelable) obj)).a(ezgi.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                }, new Supplier() { // from class: aybn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(this.a.v.m("rcs.intent.extra.messageClassifications")).map(new Function() { // from class: aybs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgd) ((evwl) ((Parcelable) obj)).a(ezgd.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                }, new Supplier() { // from class: aybo
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(this.a.v.m("rcs.intent.extra.conversationTags")).map(new Function() { // from class: aybh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgd) ((evwl) ((Parcelable) obj)).a(ezgd.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                });
                eieuVarK.b(eijuVarE);
            } catch (BadParcelableException unused) {
                a.n("Failed to unparcel parameters.");
                eijuVarE = eijx.e(null);
            }
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    public final void h() {
        eieu eieuVarK = eiiy.k("ReceiveP2pSuggestionsAction.executeAction");
        try {
            try {
                MessageIdType messageIdTypeB = bary.b(this.v.l("target_message_id"));
                ArrayList arrayListE = this.v.E(new ArrayList());
                ayca aycaVar = this.b;
                Supplier supplier = new Supplier() { // from class: aybg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (ArrayList) Collection.EL.stream(this.a.v.m(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS)).map(new Function() { // from class: aybi
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgi) ((evwl) ((Parcelable) obj)).a(ezgi.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                };
                Supplier supplier2 = new Supplier() { // from class: aybk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(this.a.v.m("rcs.intent.extra.messageClassifications")).map(new Function() { // from class: aybj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgd) ((evwl) ((Parcelable) obj)).a(ezgd.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                };
                Supplier supplier3 = new Supplier() { // from class: aybl
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return (List) Collection.EL.stream(this.a.v.m("rcs.intent.extra.conversationTags")).map(new Function() { // from class: aybr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                                return (ezgd) ((evwl) ((Parcelable) obj)).a(ezgd.a, evrr.a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new aybq()));
                    }
                };
                List list = (List) supplier2.get();
                aybz aybzVarA = aycaVar.a(messageIdTypeB);
                if (aybzVarA != null) {
                    aycaVar.a.a(messageIdTypeB, arrayListE, list, ((axlt) aybzVarA).b);
                }
                aycaVar.e(messageIdTypeB, supplier);
                auvh.h(aycaVar.c(messageIdTypeB, supplier2));
                auvh.h(aycaVar.b(messageIdTypeB, supplier3));
            } catch (BadParcelableException unused) {
                a.n("Failed to unparcel parameters.");
            }
            eieuVarK.close();
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

    public ReceiveP2pSuggestionsAction(ayca aycaVar, Parcel parcel) {
        super(parcel, elgm.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION);
        this.b = aycaVar;
    }
}
