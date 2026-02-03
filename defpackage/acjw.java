package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjw implements egyi {
    public final cogw a;
    public final fcsu b;
    public final AtomicReference c = new AtomicReference(egyh.a);
    public final fcsu d;
    public final acjr e;
    public final fcsu f;
    public final Context g;
    private final eosc h;
    private final eosc i;

    public acjw(Context context, eosc eoscVar, eosc eoscVar2, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, acjr acjrVar) {
        this.g = context;
        this.h = eoscVar;
        this.i = eoscVar2;
        this.a = cogwVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.d = fcsuVar3;
        this.e = acjrVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eieu eieuVarK = eiiy.k("MessageDataSource#ProblematicConversationDataSource#LoadData");
        try {
            eopy eopyVar = new eopy(eork.i((egyh) this.c.get()));
            eieuVarK.a(eopyVar);
            eieuVarK.close();
            return eopyVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        eieu eieuVarK = eiiy.k("MessageDataSource#ProblematicConversationDataSource#FetchAndStoreData");
        try {
            acjr acjrVar = this.e;
            final int i = ((acjl) acjrVar).b;
            final int i2 = ((acjl) acjrVar).a;
            eiju eijuVarG = eijx.g(new Callable() { // from class: acju
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    acjn acjiVar;
                    SpannableString spannableString;
                    SpannableString spannableString2;
                    HashMap map = new HashMap();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("getConversations");
                    brdrVarD.d(new brdo(MessagesTable.c.i, false));
                    brdrVarD.y(i);
                    brap brapVar = (brap) brdrVarD.b().p();
                    acjw acjwVar = this.a;
                    while (brapVar.moveToNext()) {
                        try {
                            MessageCoreData messageCoreDataA = ((bveg) acjwVar.f.b()).a();
                            messageCoreDataA.aO(brapVar);
                            ConversationIdType conversationIdTypeA = messageCoreDataA.A();
                            if (map.containsKey(conversationIdTypeA)) {
                                acjiVar = (acjn) map.get(conversationIdTypeA);
                            } else if (map.size() < i2) {
                                acjiVar = new acji();
                                String strI = ((bakt) acjwVar.b.b()).I(conversationIdTypeA);
                                if (TextUtils.isEmpty(strI)) {
                                    String string = acjwVar.g.getString(R.string.conversation_empty_name);
                                    spannableString2 = new SpannableString(string);
                                    spannableString2.setSpan(new StyleSpan(2), 0, string.length(), 18);
                                } else {
                                    spannableString2 = new SpannableString(strI);
                                }
                                acjiVar.d(spannableString2);
                                acjiVar.c(conversationIdTypeA);
                                map.put(conversationIdTypeA, acjiVar);
                            } else {
                                continue;
                            }
                            ((bbae) acjwVar.d.b()).c(messageCoreDataA, true);
                            String strAs = messageCoreDataA.as();
                            if (TextUtils.isEmpty(strAs)) {
                                String strAm = messageCoreDataA.am();
                                Context context = acjwVar.g;
                                String string2 = context.getString(R.string.message_empty_name);
                                spannableString = new SpannableString(string2);
                                spannableString.setSpan(new StyleSpan(2), 0, string2.length(), 18);
                                if (strAm != null) {
                                    int iOrdinal = cqmg.a(strAm).ordinal();
                                    String string3 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 5 ? context.getString(R.string.message_type_other) : context.getString(R.string.message_type_vcard) : context.getString(R.string.message_type_video) : context.getString(R.string.message_type_image) : context.getString(R.string.message_type_text);
                                    spannableString = new SpannableString(string3);
                                    spannableString.setSpan(new StyleSpan(2), 0, string3.length(), 18);
                                }
                            } else {
                                spannableString = new SpannableString(strAs);
                            }
                            long jO = messageCoreDataA.o();
                            MessageIdType messageIdTypeC = messageCoreDataA.C();
                            if (messageIdTypeC == null) {
                                throw new NullPointerException("Null messageId");
                            }
                            acjiVar.e(new acjm(spannableString, jO, messageIdTypeC));
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
                    Stream map2 = Collection.EL.stream(map.values()).map(new Function() { // from class: acjt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((acjn) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i3 = ekgb.d;
                    return (ekgb) map2.collect(ekcv.a);
                }
            }, this.i);
            ejvr ejvrVar = new ejvr() { // from class: acjv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgb ekgbVar = (ekgb) obj;
                    cczi ccziVar = acmt.a;
                    return ekgbVar;
                }
            };
            eosc eoscVar = this.h;
            eiju eijuVarH = eijuVarG.h(ejvrVar, eoscVar).h(new ejvr() { // from class: acjs
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    if (obj != null) {
                        acjw acjwVar = this.a;
                        acjwVar.c.set(egyh.a(obj, acjwVar.a.f()));
                    }
                    return obj;
                }
            }, eoscVar);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final /* synthetic */ Object c() {
        return "PROBLEMATIC_CONVERSATIONS_DATA";
    }
}
