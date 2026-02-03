package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpn implements cgdv {
    private static final eksp a = eksp.c("BugleNotifications");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final cogw e;
    private final ahpu f;
    private final ahpd g;

    public ahpn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, ahpu ahpuVar, ahpd ahpdVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cogwVar;
        this.f = ahpuVar;
        this.g = ahpdVar;
    }

    @Override // defpackage.cgdv
    public final cgdu a(cgbn cgbnVar) {
        String strP;
        boolean z;
        boolean z2;
        MessagePartCoreData messagePartCoreDataH;
        final long epochMilli = this.e.f().toEpochMilli();
        btii btiiVarC = btin.c();
        btiiVarC.A("getUnnotifiedTriggeredReminders");
        btiiVarC.e(new Function() { // from class: clfd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btim btimVar = (btim) obj;
                btimVar.e(epochMilli);
                btimVar.d(bvdw.SET);
                return btimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = btiiVarC.b().z();
        ArrayList arrayList = new ArrayList(ekgbVarZ.size());
        Iterator<E> it = ekgbVarZ.iterator();
        while (true) {
            String strY = null;
            if (!it.hasNext()) {
                break;
            }
            bthb bthbVar = (bthb) it.next();
            MessageCoreData messageCoreDataW = ((baxe) this.b.b()).w(bthbVar.n());
            if (messageCoreDataW != null) {
                ConversationIdType conversationIdTypeA = messageCoreDataW.A();
                if (!conversationIdTypeA.b()) {
                    String strAs = messageCoreDataW.as();
                    String strR = (!TextUtils.isEmpty(strAs) || (messagePartCoreDataH = messageCoreDataW.H()) == null) ? null : messagePartCoreDataH.R();
                    ParticipantsTable.BindData bindDataB = ((bbca) this.c.b()).b(messageCoreDataW.aB());
                    if (bindDataB == null) {
                        strP = null;
                        z = false;
                    } else if (bbdl.k(bindDataB)) {
                        z = true;
                        strP = null;
                    } else {
                        z = false;
                        strP = !TextUtils.isEmpty(bindDataB.P()) ? bindDataB.P() : !TextUtils.isEmpty(bindDataB.Q()) ? bindDataB.Q() : bindDataB.O();
                    }
                    bojh bojhVarR = ((bakt) this.d.b()).r(messageCoreDataW.A());
                    if (bojhVarR != null) {
                        strY = bojhVarR.Y();
                        z2 = bojhVarR.q() > 1;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new ahpa(strP, strAs, strR, bthbVar.o(), bthbVar.k(), conversationIdTypeA, strY, z2, z));
                }
            }
        }
        if (arrayList.isEmpty()) {
            ((eksl) a.o().h("com/google/android/apps/messaging/reminder/notification/ReminderNotificationFactoryImpl", "createReminderNotification", 80, "ReminderNotificationFactoryImpl.java")).q("no unseen reminder message notifications.");
            return null;
        }
        if (arrayList.size() <= 1) {
            return this.f.a(cgbnVar, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f.a(cgbnVar, ekjz.c((ahpl) it2.next())));
        }
        ahpd ahpdVar = this.g;
        Context context = (Context) ahpdVar.a.b();
        context.getClass();
        cgaz cgazVar = (cgaz) ahpdVar.b.b();
        cgazVar.getClass();
        cqzr cqzrVar = (cqzr) ahpdVar.c.b();
        cqzrVar.getClass();
        crac cracVar = (crac) ahpdVar.d.b();
        cracVar.getClass();
        crab crabVar = (crab) ahpdVar.e.b();
        crabVar.getClass();
        cssf cssfVar = (cssf) ahpdVar.g.b();
        cssfVar.getClass();
        Optional optional = (Optional) ahpdVar.h.b();
        optional.getClass();
        Optional optional2 = (Optional) ahpdVar.i.b();
        optional2.getClass();
        Optional optional3 = (Optional) ahpdVar.j.b();
        optional3.getClass();
        avmp avmpVar = (avmp) ahpdVar.k.b();
        avmpVar.getClass();
        cuhf cuhfVar = (cuhf) ahpdVar.l.b();
        cuhfVar.getClass();
        return new ahpc(context, cgazVar, cqzrVar, cracVar, crabVar, ahpdVar.f, cssfVar, optional, optional2, optional3, avmpVar, cgbnVar, arrayList, cuhfVar, arrayList2);
    }
}
