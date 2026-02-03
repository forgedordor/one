package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqyx {
    public static final cqce a = cqce.g("BugleDataModel", "MessageAnnotationDatabaseOperations");
    public final fcsu b;
    private final dqsn c;

    public cqyx(fcsu fcsuVar, dqsn dqsnVar) {
        this.b = fcsuVar;
        this.c = dqsnVar;
    }

    public static bbew a(final MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("MessageAnnotationDatabaseOperations#getAnnotationsForMessage");
        try {
            cqaz.h();
            bbew bbewVar = new bbew();
            bpzs bpzsVarA = bpzx.a();
            bpzsVarA.A("getAnnotationsForMessage");
            bpzsVarA.e(new Function() { // from class: cqyo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpzw bpzwVar = (bpzw) obj;
                    bpzwVar.d(messageIdType);
                    return bpzwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bbewVar.d(bpzsVarA.b().z());
            eieuVarK.close();
            return bbewVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean b(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final List list) {
        eieu eieuVarK = eiiy.k("MessageAnnotationDatabaseOperations#addMessageAnnotations");
        try {
            cqaz.h();
            boolean zBooleanValue = dhic.a(list) ? false : ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#addMessageAnnotationsTraced", new ejxr() { // from class: cqyw
                @Override // defpackage.ejxr
                public final Object get() {
                    Iterator it = list.iterator();
                    boolean z = true;
                    while (true) {
                        MessageIdType messageIdType2 = messageIdType;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        if (!it.hasNext()) {
                            fcsu fcsuVar = this.a.b;
                            ((bxlc) fcsuVar.b()).i(conversationIdType2);
                            bxlc bxlcVar = (bxlc) fcsuVar.b();
                            String[] strArr = bpzx.a;
                            bxlcVar.l(conversationIdType2, messageIdType2, "messages_annotations");
                            return Boolean.valueOf(z);
                        }
                        ezds ezdsVar = (ezds) it.next();
                        String[] strArr2 = bpzx.a;
                        bpyq bpyqVar = new bpyq();
                        bpyqVar.d(conversationIdType2);
                        bpyqVar.e(messageIdType2);
                        bpyqVar.c(ezdsVar.e);
                        bpyqVar.b(ezdsVar);
                        final bpyn bpynVarA = bpyqVar.a();
                        final dqsy dqsyVarB = bpzx.b();
                        long jB = dqru.b(bpzx.b(), "messages_annotations", bpynVarA, new Function() { // from class: bpyk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarB.O("messages_annotations", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bpyl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                Long l = (Long) obj;
                                if (l.longValue() >= 0) {
                                    bpyn bpynVar = bpynVarA;
                                    bpynVar.a = String.valueOf(l);
                                    bpynVar.fN(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(jB).getClass();
                        z &= jB > -1;
                    }
                }
            })).booleanValue();
            eieuVarK.close();
            return zBooleanValue;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final List list) {
        cqaz.h();
        return ((Boolean) this.c.c("MessageAnnotationDatabaseOperations#setMessageAnnotations", new ejxr() { // from class: cqyn
            @Override // defpackage.ejxr
            public final Object get() {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("setMessageAnnotations");
                final MessageIdType messageIdType2 = messageIdType;
                brdrVarD.h(new Function() { // from class: cqym
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.p(messageIdType2);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (brdrVarD.b().h() == 0) {
                    cqyx.a.r("Message annotation is set on deleted message.");
                    return false;
                }
                List list2 = list;
                ConversationIdType conversationIdType2 = conversationIdType;
                cqyx cqyxVar = this.a;
                String[] strArr = bpzx.a;
                bpzm bpzmVar = new bpzm();
                bpzmVar.f("setMessageAnnotations");
                bpzmVar.a(new Function() { // from class: cqyp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpzw bpzwVar = (bpzw) obj;
                        bpzwVar.d(messageIdType2);
                        return bpzwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bpzmVar.d();
                return Boolean.valueOf(cqyxVar.b(conversationIdType2, messageIdType2, list2));
            }
        })).booleanValue();
    }
}
