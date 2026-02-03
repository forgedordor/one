package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfnq implements cfmz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate");
    public final aypg b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final eosc f;
    public final cehg g;
    public final ains h;
    public final cogw i;
    public final bagw j;
    public final bahv k;
    public final bveg l;
    public final alrj m;
    public final ceku n;
    public final bbdl o;
    public final Optional p;
    public final fcsu q;
    public final fcsu r;
    private final Context s;
    private final crmx t;
    private final aipo u;

    public cfnq(Context context, aypg aypgVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, cehg cehgVar, ains ainsVar, cogw cogwVar, bagw bagwVar, bahv bahvVar, bveg bvegVar, crmx crmxVar, aipo aipoVar, alrj alrjVar, ceku cekuVar, bbdl bbdlVar, Optional optional, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.s = context;
        this.b = aypgVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = cehgVar;
        this.h = ainsVar;
        this.i = cogwVar;
        this.j = bagwVar;
        this.k = bahvVar;
        this.l = bvegVar;
        this.t = crmxVar;
        this.u = aipoVar;
        this.m = alrjVar;
        this.n = cekuVar;
        this.o = bbdlVar;
        this.p = optional;
        this.q = fcsuVar3;
        this.r = fcsuVar4;
    }

    public static boolean e(evqs evqsVar) {
        return evqsVar != null && baja.c(evqsVar.I());
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        final epds epdsVar = (epds) evuhVar;
        if (this.t.G()) {
            return eijx.h(new eooy() { // from class: cfna
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final epds epdsVar2 = epdsVar;
                    if (!epdsVar2.f.isEmpty()) {
                        final String str = epdsVar2.f;
                        eieu eieuVarK = eiiy.k("SendMessageDelegate#hasMessageWithWebId");
                        try {
                            cqaz.h();
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("hasMessageWithWebId");
                            brdrVarD.h(new Function() { // from class: cfnd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brec brecVar = (brec) obj;
                                    int iIntValue = MessagesTable.g().intValue();
                                    if (iIntValue < 19020) {
                                        dqru.x("web_id", iIntValue);
                                    }
                                    brecVar.ap(new dqpj("messages.web_id", 1, String.valueOf(str)));
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.f(new Function() { // from class: cfne
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bran) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            boolean zU = brdrVarD.b().U();
                            eieuVarK.close();
                            if (zU) {
                                epdt epdtVar = (epdt) epdv.a.createBuilder();
                                epdtVar.copyOnWrite();
                                ((epdv) epdtVar.instance).b = epdu.a(4);
                                return eijx.e((epdv) epdtVar.build());
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
                    final cfnq cfnqVar = this.a;
                    cqle cqleVar = (cqle) cfnqVar.q.b();
                    epes epesVar = epdsVar2.e;
                    if (epesVar == null) {
                        epesVar = epes.a;
                    }
                    Optional optionalA = cqleVar.a(epesVar);
                    if (optionalA.isEmpty()) {
                        cfnqVar.h.c("Bugle.Ditto.SendMessage.MultiSim.InvalidSubscriptionId.Count");
                        epdt epdtVar2 = (epdt) epdv.a.createBuilder();
                        epdtVar2.copyOnWrite();
                        ((epdv) epdtVar2.instance).b = epdu.a(4);
                        return eijx.e((epdv) epdtVar2.build());
                    }
                    final int iIntValue = ((Integer) optionalA.get()).intValue();
                    final SelfIdentityId selfIdentityIdF = cfnqVar.o.f(iIntValue).f();
                    final epbl epblVar = epdsVar2.d;
                    if (epblVar == null) {
                        epblVar = epbl.a;
                    }
                    evtg evtgVar = epblVar.k;
                    ejvr ejvrVar = new ejvr() { // from class: cfni
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            epbi epbiVar = (epbi) obj;
                            int i = epbiVar.b;
                            final cfnq cfnqVar2 = cfnqVar;
                            if (i != 3) {
                                return i == 4 ? eijx.d(new IllegalStateException("Legacy sticker is no longer supported!")) : i == 2 ? eijx.e(new cfnp(cfnqVar2.k.i(((epcq) epbiVar.c).b))) : eijx.d(new IllegalStateException("The part doesn't have any content!"));
                            }
                            final epbe epbeVar = (epbe) epbiVar.c;
                            final cehg cehgVar = cfnqVar2.g;
                            final String str2 = epbeVar.d;
                            epbd epbdVarB = epbd.b(epbeVar.c);
                            if (epbdVarB == null) {
                                epbdVarB = epbd.UNRECOGNIZED;
                            }
                            ceku cekuVar = cfnqVar2.n;
                            final Optional optionalEmpty = ((Boolean) cdip.a.e()).booleanValue() ? cfnqVar2.p : Optional.empty();
                            final String strD = le.d((String) ((ekod) cedu.a).d.get(epbdVarB));
                            return eiju.g(cekuVar != null ? eika.k(cekuVar.l(), new eooz() { // from class: cegp
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return ((ceoa) cehgVar.l.b()).b((ezns) obj2, optionalEmpty, str2, strD);
                                }
                            }, (Executor) cehgVar.v.get()) : eooq.g(((cedm) cehgVar.j.b()).w(), new eooz() { // from class: cegx
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return ((ceoa) cehgVar.l.b()).b((ezns) obj2, optionalEmpty, str2, strD);
                                }
                            }, (Executor) cehgVar.v.get())).i(new eooz() { // from class: cfnc
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    String str3;
                                    cfnq cfnqVar3 = cfnqVar2;
                                    ains ainsVar = cfnqVar3.h;
                                    epbe epbeVar2 = epbeVar;
                                    Uri uriD = (Uri) obj2;
                                    ainsVar.g("Bugle.Ditto.Blobstore.Attachment.Downloaded.Bytes", epbeVar2.f);
                                    if (cfnq.e(epbeVar2.l)) {
                                        uriD = cfnqVar3.d(epbeVar2, uriD);
                                    }
                                    cogw cogwVar = cfnqVar3.i;
                                    if (epbeVar2.o.isEmpty()) {
                                        ekrw ekrwVarH = cfnq.a.h();
                                        ekrwVarH.X(eksq.a, "BugleNetwork");
                                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "createAttachmentMessageItemPartData", 494, "SendMessageDelegate.java")).q("Mime type not set, falling back to content type");
                                        ekod ekodVar = ((ekod) cedu.a).d;
                                        epbd epbdVarB2 = epbd.b(epbeVar2.c);
                                        if (epbdVarB2 == null) {
                                            epbdVarB2 = epbd.UNRECOGNIZED;
                                        }
                                        str3 = (String) ekodVar.get(epbdVarB2);
                                        str3.getClass();
                                    } else {
                                        str3 = epbeVar2.o;
                                    }
                                    bahv bahvVar = cfnqVar3.k;
                                    String strC = le.c(str3);
                                    bahx bahxVarD = bahy.D();
                                    bacm bacmVar = (bacm) bahxVarD;
                                    bacmVar.c = strC;
                                    bacmVar.d = uriD;
                                    bahxVarD.n(elha.BLOBSTORE);
                                    MessagePartData messagePartDataC = bahvVar.c(bahxVarD.q());
                                    if (!epbeVar2.e.isEmpty()) {
                                        messagePartDataC.aw(epbeVar2.e);
                                    }
                                    if (!epbeVar2.d.isEmpty()) {
                                        messagePartDataC.al(epbeVar2.d);
                                        messagePartDataC.am(cogwVar.f().toEpochMilli());
                                    }
                                    if (cfnq.e(epbeVar2.l)) {
                                        messagePartDataC.ay(epbeVar2.l.I());
                                    }
                                    return eijx.e(new cfnp(messagePartDataC));
                                }
                            }, cfnqVar2.e);
                        }
                    };
                    ekgi ekgiVar = new ekgi();
                    for (Object obj : evtgVar) {
                        ekgiVar.i(obj, ejvrVar.apply(obj));
                    }
                    final ekgp ekgpVarB = ekgiVar.b();
                    eijw eijwVarL = eijx.l(ekgpVarB.values());
                    eooy eooyVar = new eooy() { // from class: cfnj
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            Stream stream = Collection.EL.stream(epblVar.k);
                            final Map map = ekgpVarB;
                            return eijx.a((ArrayList) stream.map(new Function() { // from class: cfno
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    eiju eijuVar = (eiju) map.get((epbi) obj2);
                                    eijuVar.getClass();
                                    return eijuVar.h(new ejvr() { // from class: cfnf
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            return ((cfnp) obj3).a;
                                        }
                                    }, eoqg.a);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: cfnb
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            })));
                        }
                    };
                    eosc eoscVar = cfnqVar.f;
                    eiju eijuVarB = eijwVarL.b(eooyVar, eoscVar);
                    eooz eoozVar = new eooz() { // from class: cfnk
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            List list;
                            eiju eijuVarB2;
                            List list2 = (List) obj2;
                            final epds epdsVar3 = epdsVar2;
                            final ConversationIdType conversationIdTypeB = barn.b(epdsVar3.c);
                            final cfnq cfnqVar2 = cfnqVar;
                            Stream stream = Collection.EL.stream(((baqt) cfnqVar2.d.b()).a(conversationIdTypeB, true));
                            final alrj alrjVar = cfnqVar2.m;
                            alrjVar.getClass();
                            Stream map = stream.map(new Function() { // from class: cfng
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return alrjVar.r((String) obj3);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                            boolean z = false;
                            if ((epdsVar3.b & 2) != 0) {
                                epes epesVar2 = epdsVar3.e;
                                if (epesVar2 == null) {
                                    epesVar2 = epes.a;
                                }
                                int iB = eper.b(epesVar2.b);
                                ejwl.l(!(iB != 0 && iB == 3));
                            }
                            final bajf bajfVarA = ((axgh) cfnqVar2.c.b()).a(conversationIdTypeB);
                            if (bajfVarA != null && (bajfVarA.d() == 2 || bajfVarA.d() == 1)) {
                                z = true;
                            }
                            if (!epdsVar3.g || z) {
                                bagw bagwVar = cfnqVar2.j;
                                epbl epblVar2 = epdsVar3.d;
                                if (epblVar2 == null) {
                                    epblVar2 = epbl.a;
                                }
                                epbn epbnVar = epblVar2.i;
                                if (epbnVar == null) {
                                    epbnVar = epbn.a;
                                }
                                String str2 = (epbnVar.b == 1 ? (epcq) epbnVar.c : epcq.a).b;
                                if (TextUtils.isEmpty(str2)) {
                                    epbl epblVar3 = epdsVar3.d;
                                    if (epblVar3 == null) {
                                        epblVar3 = epbl.a;
                                    }
                                    Iterator<E> it = epblVar3.k.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        epbi epbiVar = (epbi) it.next();
                                        if (epbiVar.b == 2) {
                                            str2 = ((epcq) epbiVar.c).b;
                                            break;
                                        }
                                    }
                                }
                                list = list2;
                                eijuVarB2 = bagwVar.b(conversationIdTypeB, ekgbVar, null, str2, list, iIntValue, false, false);
                            } else {
                                eijuVarB2 = eijx.e(3);
                                list = list2;
                            }
                            eiju eijuVar = eijuVarB2;
                            final SelfIdentityId selfIdentityId = selfIdentityIdF;
                            final List list3 = list;
                            return eijuVar.h(new ejvr() { // from class: cfnh
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    bajf bajfVar;
                                    Integer num = (Integer) obj3;
                                    int iIntValue2 = num.intValue();
                                    cfnq cfnqVar3 = cfnqVar2;
                                    MessageCoreData messageCoreDataG = cfnqVar3.l.g(iIntValue2, conversationIdTypeB, selfIdentityId);
                                    ((MessageData) messageCoreDataG).i.addAll(list3);
                                    messageCoreDataG.bZ(epdsVar3.f);
                                    if (((aqsh) cfnqVar3.r.b()).a() && num.intValue() == 3 && (bajfVar = bajfVarA) != null) {
                                        if (bajfVar.D()) {
                                            messageCoreDataG.by();
                                            return messageCoreDataG;
                                        }
                                        messageCoreDataG.bC();
                                    }
                                    return messageCoreDataG;
                                }
                            }, cfnqVar2.e);
                        }
                    };
                    eosc eoscVar2 = cfnqVar.e;
                    return eijuVarB.i(eoozVar, eoscVar2).h(new ejvr() { // from class: cfnl
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj2;
                            epdi epdiVar = epdsVar2.h;
                            if (epdiVar == null) {
                                epdiVar = epdi.a;
                            }
                            String str2 = epdiVar.b;
                            if (!ejwk.c(str2)) {
                                ekrw ekrwVarE = cfnq.a.e();
                                ekrwVarE.X(eksq.a, "BugleNetwork");
                                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "sendMessage", 237, "SendMessageDelegate.java")).t("Reply to message: %s", str2);
                                messageCoreData.bN(clfx.a(bary.b(str2)));
                            }
                            return messageCoreData;
                        }
                    }, eoscVar).h(new ejvr() { // from class: cfnm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj2;
                            cfnqVar.b.e(messageCoreData, iIntValue, false).z();
                            ekrw ekrwVarH = cfnq.a.h();
                            ekrwVarH.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "sendMessageData", 450, "SendMessageDelegate.java")).t("Inserted new message %s", messageCoreData);
                            epdt epdtVar3 = (epdt) epdv.a.createBuilder();
                            epdtVar3.copyOnWrite();
                            ((epdv) epdtVar3.instance).b = epdu.a(3);
                            return (epdv) epdtVar3.build();
                        }
                    }, eoscVar2).e(Throwable.class, new ejvr() { // from class: cfnn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Throwable th3 = (Throwable) obj2;
                            ekrw ekrwVarH = cfnq.a.h();
                            ekrwVarH.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(th3)).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "handleSendError", (char) 474, "SendMessageDelegate.java")).q("Failed to send message");
                            int i = true != (th3 instanceof IllegalArgumentException) ? 5 : 4;
                            epdt epdtVar3 = (epdt) epdv.a.createBuilder();
                            epdtVar3.copyOnWrite();
                            ((epdv) epdtVar3.instance).b = epdu.a(i);
                            return (epdv) epdtVar3.build();
                        }
                    }, eoqg.a);
                }
            }, this.e);
        }
        epdt epdtVar = (epdt) epdv.a.createBuilder();
        epdtVar.copyOnWrite();
        ((epdv) epdtVar.instance).b = epdu.a(6);
        return eijx.e((epdv) epdtVar.build());
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ evuh c(evqs evqsVar) {
        return (epds) evsn.parseFrom(epds.a, evqsVar);
    }

    final Uri d(epbe epbeVar, Uri uri) {
        String strD;
        baja bajaVar = new baja(epbeVar.l.I());
        if (epbeVar.o.isEmpty()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "decryptAttachment", 324, "SendMessageDelegate.java")).q("Mime type not set, falling back to content type");
            ekod ekodVar = ((ekod) cedu.a).d;
            epbd epbdVarB = epbd.b(epbeVar.c);
            if (epbdVarB == null) {
                epbdVarB = epbd.UNRECOGNIZED;
            }
            String str = (String) ekodVar.get(epbdVarB);
            str.getClass();
            strD = le.d(str);
        } else {
            strD = epbeVar.o;
        }
        Context context = this.s;
        String strC = le.c(strD);
        File fileH = bxlf.h(uri, context);
        Uri uriD = bxlf.d(strC, context);
        File fileH2 = bxlf.h(uriD, context);
        String string = UUID.randomUUID().toString();
        this.u.c("Bugle.Ditto.Attachment.Decrypt.Latency", string);
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileH);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileH2);
                    try {
                        this.g.C(fileInputStream, fileOutputStream, bajaVar);
                        bxlf.i(context, uri);
                        fileOutputStream.close();
                        fileInputStream.close();
                        return uriD == null ? uri : uriD;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.u.m("Bugle.Ditto.Attachment.Decrypt.Latency", string);
            }
        } catch (IOException | GeneralSecurityException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/net/handler/ditto/SendMessageDelegate", "decryptAttachment", 351, "SendMessageDelegate.java")).q("Failed to decrypt attachment");
            Context context2 = this.s;
            bxlf.i(context2, uri);
            bxlf.i(context2, uriD);
            throw e;
        }
    }
}
