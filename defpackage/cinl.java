package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cinl implements bayb {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/mentions/transport/MentionsOnRcsMessageReceivedListener");
    private final ains b;
    private final fcsu c;
    private final fcsu d;

    public cinl(ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2) {
        ainsVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = ainsVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) throws IOException {
        List<ezds> listAl;
        messageCoreData.getClass();
        if (!((ardm) this.c.b()).a()) {
            return;
        }
        eieu eieuVarH = eiiy.h("MentionsOnRcsMessageReceivedListener::beforeMessageInserted");
        try {
            String strAs = messageCoreData.as();
            if (strAs != null) {
                if (true != messageCoreData.cX()) {
                    strAs = null;
                }
                if (strAs != null) {
                    try {
                        eyga eygaVarAc = messageCoreData.ac();
                        if (eygaVarAc != null) {
                            cinh cinhVarB = cinj.b(eygaVarAc);
                            if (cinhVarB == null) {
                                listAl = fcvo.a;
                            } else {
                                evtg<cinf> evtgVar = cinhVarB.b;
                                evtgVar.getClass();
                                ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
                                for (cinf cinfVar : evtgVar) {
                                    ezdr ezdrVar = (ezdr) ezds.a.createBuilder();
                                    ezdrVar.getClass();
                                    eyvu.d(cinj.a(strAs, (int) cinfVar.b), ezdrVar);
                                    eyvu.c(cinj.a(strAs, (int) (cinfVar.b + cinfVar.c)), ezdrVar);
                                    eyvu.b(eyzy.UX_COMPONENT_ANNOTATION, ezdrVar);
                                    eyvu.f(21, ezdrVar);
                                    ezdp ezdpVar = (ezdp) ezdq.a.createBuilder();
                                    ezdpVar.getClass();
                                    String str = cinfVar.d;
                                    str.getClass();
                                    ezdpVar.copyOnWrite();
                                    ((ezdq) ezdpVar.instance).b = str;
                                    evsn evsnVarBuild = ezdpVar.build();
                                    evsnVarBuild.getClass();
                                    ezdrVar.copyOnWrite();
                                    ezds ezdsVar = (ezds) ezdrVar.instance;
                                    ezdsVar.d = (ezdq) evsnVarBuild;
                                    ezdsVar.c = 23;
                                    arrayList.add(eyvu.a(ezdrVar));
                                }
                                listAl = fcva.al(arrayList, new cini());
                                for (ezds ezdsVar2 : listAl) {
                                    if (ezdsVar2.h >= ezdsVar2.i) {
                                        throw new cind("Mention has invalid range");
                                    }
                                    if (ezdsVar2.c == 23) {
                                        String str2 = ((ezdq) ezdsVar2.d).b;
                                        str2.getClass();
                                        if (str2.length() != 0) {
                                        }
                                    }
                                    throw new cind("Mention has no RCS identifier");
                                }
                                ArrayList arrayList2 = new ArrayList(fcva.p(listAl, 10));
                                for (ezds ezdsVar3 : listAl) {
                                    arrayList2.add(eknz.d(Integer.valueOf(ezdsVar3.h), Integer.valueOf(ezdsVar3.i)));
                                }
                                try {
                                    ekhu.a(arrayList2);
                                } catch (IllegalArgumentException e) {
                                    throw new cind("Overlapping mentions", e);
                                }
                            }
                            Iterator it = listAl.iterator();
                            while (it.hasNext()) {
                                messageCoreData.aK((ezds) it.next());
                            }
                        }
                    } catch (cind e2) {
                        this.b.c("Bugle.RcsGroups.Mentions.InvalidHeaderReceived.Count");
                        ekrw ekrwVarJ = a.j();
                        ekrwVarJ.X(eksq.a, "BugleMentions");
                        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e2);
                        ekrdVar.X(cqnc.b, messageCoreData.C());
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/mentions/transport/MentionsOnRcsMessageReceivedListener", "beforeMessageInserted", 59, "MentionsOnRcsMessageReceivedListener.kt")).q("Invalid mentions header received, ignoring");
                    }
                    fczl.a(eieuVarH, null);
                    return;
                }
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        if (!((ardm) this.c.b()).a()) {
            return;
        }
        eieu eieuVarH = eiiy.h("MentionsOnRcsMessageReceivedListener::onInsertedInTransaction");
        try {
            cqyx cqyxVar = (cqyx) this.d.b();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            MessageIdType messageIdTypeC = messageCoreData.C();
            ekgb ekgbVarAa = messageCoreData.aa();
            ekgbVarAa.getClass();
            ArrayList arrayList = new ArrayList();
            ekqh it = ekgbVarAa.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (((ezds) next).c == 23) {
                    arrayList.add(next);
                }
            }
            cqyxVar.b(conversationIdTypeA, messageIdTypeC, arrayList);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
