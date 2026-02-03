package defpackage;

import android.app.NotificationChannel;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgrl extends fcyz implements fdat {
    final /* synthetic */ cgrm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgrl(cgrm cgrmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cgrmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgrl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgrm cgrmVar = this.a;
        String str = "invokeSuspend";
        if (!((arpu) cgrmVar.b.b()).a()) {
            ekrw ekrwVarH = cgrm.a.h();
            ekrwVarH.X(eksq.a, "BugleNotifications");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/notification2o/synclet/NotificationStateSynclet$sync$1", "invokeSuspend", 27, "NotificationStateSynclet.kt")).q("Notification state synclet is disabled, not executing");
            return fctx.a;
        }
        ekrg ekrgVar = cgrm.a;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH2.X(ekrzVar, "BugleNotifications");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/notification2o/synclet/NotificationStateSynclet$sync$1", "invokeSuspend", 31, "NotificationStateSynclet.kt")).q("Starting notification state synclet");
        cgkb cgkbVar = (cgkb) cgrmVar.c.b();
        final ArrayList arrayList = new ArrayList();
        fcsu fcsuVar = cgkbVar.d;
        Iterator it = ((Map) fcsuVar.b()).values().iterator();
        while (it.hasNext()) {
            Optional optionalF = ((cgiw) it.next()).f();
            if (!optionalF.isEmpty()) {
                arrayList.add(((cggq) optionalF.get()).a);
            }
        }
        arrayList.add("bugle_misc_channel");
        arrayList.add("bugle_broadcast_receiver_channel");
        arrayList.add("MessagesNotificationChannel");
        arrayList.add("bugle_while_using_web_channel_v1");
        arrayList.add("bugle_connected_to_web_channel_v1");
        arrayList.add("bugle_connected_to_web_channel_v1");
        arrayList.add("bugle_diagnostics_in_progress");
        arrayList.add("bugle_reminder_channel");
        arrayList.add("bugle_report_issue_channel");
        arrayList.add("bugle_auto_moved_spam_channel");
        arrayList.add("bugle_rcs_not_delivered_channel");
        arrayList.add("bugle_business_messages_channel");
        final HashMap map = new HashMap();
        Iterator it2 = ((Map) fcsuVar.b()).values().iterator();
        while (it2.hasNext()) {
            Optional optionalF2 = ((cgiw) it2.next()).f();
            if (!optionalF2.isEmpty()) {
                Optional optional = ((cggq) optionalF2.get()).b;
                if (!optional.isEmpty()) {
                    for (String str2 : optional.get()) {
                        if (!TextUtils.equals(str2, ((cggq) optionalF2.get()).a)) {
                            map.put(str2, ((cggq) optionalF2.get()).a);
                        }
                    }
                }
            }
        }
        kwx kwxVar = cgkbVar.b;
        List listC = kwxVar.c();
        if (craf.d) {
            Iterator it3 = ((List) Collection.EL.stream(listC).filter(new Predicate() { // from class: cgjt
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(obj2);
                    return (TextUtils.isEmpty(notificationChannelM.getConversationId()) || TextUtils.isEmpty(notificationChannelM.getParentChannelId()) || !map.containsKey(notificationChannelM.getParentChannelId())) ? false : true;
                }
            }).collect(Collectors.toCollection(new cgju()))).iterator();
            while (it3.hasNext()) {
                NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(it3.next());
                Iterator it4 = it3;
                String str3 = (String) map.get(notificationChannelM.getParentChannelId());
                str3.getClass();
                ekrg ekrgVar2 = ekrgVar;
                String conversationId = notificationChannelM.getConversationId();
                conversationId.getClass();
                String strH = cgkb.h(str3, conversationId);
                if (kwxVar.a(strH) == null) {
                    List list = listC;
                    String str4 = str;
                    NotificationChannel notificationChannelA = cgkbVar.a(strH, notificationChannelM.getName().toString(), notificationChannelM, notificationChannelM.getGroup());
                    String conversationId2 = notificationChannelM.getConversationId();
                    conversationId2.getClass();
                    notificationChannelA.setConversationId(str3, conversationId2);
                    ekrw ekrwVarH3 = cgkb.a.h();
                    ekrwVarH3.X(ekrzVar, "BugleNotifications");
                    ekrd ekrdVar = (ekrd) ekrwVarH3;
                    ekrdVar.X(cgey.k, notificationChannelM.getId());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndClearOldChannelsSync", 119, "NotificationChannelManager.java")).q("Migrating conversation channel");
                    cgkbVar.i(notificationChannelA);
                    it3 = it4;
                    ekrgVar = ekrgVar2;
                    str = str4;
                    listC = list;
                } else {
                    it3 = it4;
                    ekrgVar = ekrgVar2;
                }
            }
        }
        ekrg ekrgVar3 = ekrgVar;
        String str5 = str;
        List list2 = listC;
        Iterator it5 = ((List) Collection.EL.stream(list2).filter(new Predicate() { // from class: cgjv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return map.containsKey(akc$$ExternalSyntheticApiModelOutline0.m(obj2).getId());
            }
        }).collect(Collectors.toCollection(new cgju()))).iterator();
        while (it5.hasNext()) {
            NotificationChannel notificationChannelM2 = akc$$ExternalSyntheticApiModelOutline0.m(it5.next());
            String str6 = (String) map.get(notificationChannelM2.getId());
            str6.getClass();
            if (kwxVar.a(str6) == null) {
                NotificationChannel notificationChannelA2 = cgkbVar.a(str6, notificationChannelM2.getName().toString(), notificationChannelM2, notificationChannelM2.getGroup());
                ekrw ekrwVarH4 = cgkb.a.h();
                ekrwVarH4.X(ekrzVar, "BugleNotifications");
                ekrd ekrdVar2 = (ekrd) ekrwVarH4;
                ekrdVar2.X(cgey.k, notificationChannelM2.getId());
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndClearOldChannelsSync", 142, "NotificationChannelManager.java")).q("Migrating channel");
                cgkbVar.i(notificationChannelA2);
            }
        }
        Iterator it6 = ((List) Collection.EL.stream(list2).filter(new Predicate() { // from class: cgjw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                NotificationChannel notificationChannelM3 = akc$$ExternalSyntheticApiModelOutline0.m(obj2);
                String str7 = craf.d ? (String) Objects.requireNonNullElse(notificationChannelM3.getParentChannelId(), "") : "";
                List list3 = arrayList;
                return (list3.contains(notificationChannelM3.getId()) || list3.contains(str7) || TextUtils.isDigitsOnly(notificationChannelM3.getId())) ? false : true;
            }
        }).collect(Collectors.toCollection(new cgju()))).iterator();
        while (it6.hasNext()) {
            NotificationChannel notificationChannelM3 = akc$$ExternalSyntheticApiModelOutline0.m(it6.next());
            ekrw ekrwVarH5 = cgkb.a.h();
            ekrwVarH5.X(ekrzVar, "BugleNotifications");
            ekrd ekrdVar3 = (ekrd) ekrwVarH5;
            ekrdVar3.X(cgey.k, notificationChannelM3.getId());
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndClearOldChannelsSync", 163, "NotificationChannelManager.java")).q("Deleting channel");
            kwxVar.f(notificationChannelM3.getId());
        }
        ekrw ekrwVarH6 = ekrgVar3.h();
        ekrwVarH6.X(ekrzVar, "BugleNotifications");
        ((ekrd) ekrwVarH6.h("com/google/android/apps/messaging/shared/notification2o/synclet/NotificationStateSynclet$sync$1", str5, 33, "NotificationStateSynclet.kt")).q("Finishing notification state synclet");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgrl(this.a, fcxyVar);
    }
}
