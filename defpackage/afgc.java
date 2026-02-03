package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgc implements aikq {
    static final cczv a = cdag.h(cdag.b, "disable_logging_linkify", false);
    public static final cqce b = cqce.g("BugleAnnotation", "LinkifyLogging");
    public final Context c;
    public final ajhd d;
    public final ains e;
    public final Optional f;
    public final fcsu g;
    public final fcsu h;
    public final eosc i;
    private final aips j;
    private final eosc k;

    public afgc(Context context, ajhd ajhdVar, ains ainsVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, aips aipsVar, eosc eoscVar, eosc eoscVar2) {
        this.c = context;
        this.d = ajhdVar;
        this.e = ainsVar;
        this.f = optional;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.j = aipsVar;
        this.k = eoscVar;
        this.i = eoscVar2;
    }

    @Override // defpackage.aikq
    public final void a(final MessageCoreData messageCoreData, final ParticipantsTable.BindData bindData) {
        if (bindData == null || ((Boolean) a.e()).booleanValue()) {
            return;
        }
        final aips aipsVar = this.j;
        final Runnable runnable = new Runnable() { // from class: affz
            @Override // java.lang.Runnable
            public final void run() {
                final afgc afgcVar = this.a;
                bakt baktVar = (bakt) afgcVar.h.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                final boolean zB = bvdi.b(baktVar.c(messageCoreData2.A()));
                final ConversationIdType conversationIdTypeA = messageCoreData2.A();
                eieu eieuVarK = eiiy.k("MessageDatabaseOperations#hasSentMessage");
                try {
                    cqaz.h();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("hasSentMessage");
                    brdrVarD.h(new Function() { // from class: bawm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            cqce cqceVar = baxe.a;
                            brecVar.m(conversationIdTypeA);
                            brecVar.ah(avbn.f);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean zU = brdrVarD.b().U();
                    eieuVarK.close();
                    if (((Boolean) afgc.a.e()).booleanValue()) {
                        return;
                    }
                    Optional optional = afgcVar.f;
                    if (optional.isEmpty()) {
                        afgc.b.m("Received message or sender is null, skip logging links.");
                        return;
                    }
                    final ParticipantsTable.BindData bindData2 = bindData;
                    final boolean z = !TextUtils.isEmpty(bindData2.S());
                    final int iQ = bbbd.q(bindData2);
                    String strAs = messageCoreData2.as();
                    if (TextUtils.isEmpty(strAs)) {
                        afgc.b.m("Received message text is empty, skip logging links.");
                    } else {
                        eork.r(((cdrx) optional.get()).a(SpannableString.valueOf(strAs), afgcVar.c), auwc.a(new cqob(new Consumer() { // from class: afga
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ekqg ekqgVarListIterator = ((ekgp) ((Pair) obj).second).values().listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    cdrw cdrwVar = (cdrw) ekqgVarListIterator.next();
                                    cdrw cdrwVar2 = cdrw.WEB_URL;
                                    if (cdrwVar == cdrwVar2) {
                                        int i = iQ;
                                        elih elihVar = (elih) elij.a.createBuilder();
                                        eyzy eyzyVar = eyzy.LINK_ANNOTATION;
                                        elihVar.copyOnWrite();
                                        elij elijVar = (elij) elihVar.instance;
                                        elijVar.c = eyzyVar.a();
                                        int i2 = 1;
                                        elijVar.b |= 1;
                                        elihVar.copyOnWrite();
                                        elij elijVar2 = (elij) elihVar.instance;
                                        boolean z2 = z;
                                        MessageCoreData messageCoreData3 = messageCoreData2;
                                        afgc afgcVar2 = afgcVar;
                                        elijVar2.d = i - 1;
                                        elijVar2.b |= 2;
                                        elihVar.copyOnWrite();
                                        elij elijVar3 = (elij) elihVar.instance;
                                        elijVar3.b |= 4;
                                        elijVar3.e = z2;
                                        afgcVar2.d.x(messageCoreData3, (elij) elihVar.build());
                                        if (cdrwVar == cdrwVar2) {
                                            boolean zAa = bindData2.aa();
                                            if (((Boolean) ccze.s.e()).booleanValue()) {
                                                boolean z3 = zU;
                                                if (zB) {
                                                    i2 = zAa ? 4 : !z3 ? 6 : 2;
                                                } else if (zAa) {
                                                    i2 = 3;
                                                } else if (!z3) {
                                                    i2 = 5;
                                                }
                                                afgcVar2.e.e("Bugle.Share.WebLink.Received", i2);
                                            }
                                        }
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: afgb
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                cqbd cqbdVarE = afgc.b.e();
                                cqbdVarE.I("Threw during logReceivedMessageLinkAnnotationEvents()");
                                cqbdVarE.s((Throwable) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })), afgcVar.i);
                    }
                } finally {
                }
            }
        };
        auwa.a(new Runnable() { // from class: aipr
            public final /* synthetic */ String b = "Bugle.Async.LinkPreviewUtils.logReceivedLinkAnnotation.Duration";

            @Override // java.lang.Runnable
            public final void run() {
                aipo aipoVar = aipsVar.a;
                String str = this.b;
                aipoVar.b(str);
                runnable.run();
                aipoVar.k(str);
            }
        }, this.k);
    }

    @Override // defpackage.aikq
    public final void b(final MessageCoreData messageCoreData) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (messageCoreData != null) {
            Optional optional = this.f;
            if (!optional.isEmpty()) {
                String strAs = messageCoreData.as();
                if (TextUtils.isEmpty(strAs)) {
                    b.m("Sent message text is empty, skip logging links.");
                    return;
                } else {
                    eork.r(((cdrx) optional.get()).a(SpannableString.valueOf(strAs), this.c), auwc.a(new cqob(new Consumer() { // from class: affx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekqg ekqgVarListIterator = ((ekgp) ((Pair) obj).second).values().listIterator();
                            while (ekqgVarListIterator.hasNext()) {
                                if (((cdrw) ekqgVarListIterator.next()) == cdrw.WEB_URL) {
                                    MessageCoreData messageCoreData2 = messageCoreData;
                                    afgc afgcVar = this.a;
                                    elih elihVar = (elih) elij.a.createBuilder();
                                    eyzy eyzyVar = eyzy.LINK_ANNOTATION;
                                    elihVar.copyOnWrite();
                                    elij elijVar = (elij) elihVar.instance;
                                    elijVar.c = eyzyVar.a();
                                    elijVar.b |= 1;
                                    afgcVar.d.y(messageCoreData2, (elij) elihVar.build());
                                }
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: affy
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cqbd cqbdVarE = afgc.b.e();
                            cqbdVarE.I("Threw during logSentMessageLinkAnnotationEvents()");
                            cqbdVarE.s((Throwable) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    })), this.i);
                    return;
                }
            }
        }
        b.m("Sent message is null, skip logging links.");
    }
}
