package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cmox implements cmot, cqci {
    public static final /* synthetic */ int b = 0;
    private static final cqce c = cqce.g("Bugle", "MmsSmsThreadIdResolver");
    private static final eksp d = eksp.c("Bugle");
    private static final ekhx e = ekhx.t("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    private final Context f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final Map n = new HashMap();
    final Function a = new Function() { // from class: cmov
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            int i = cmox.b;
            return bindData != null ? Objects.toString(bindData.T(), "") : "";
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    };

    public cmox(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.f = context;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
    }

    private static String l(ParticipantsTable.BindData bindData) {
        return e.contains(bindData.V()) ? bindData.V() : bindData.O();
    }

    private static boolean m(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                if (bbdl.k(bindData2) || !TextUtils.equals(bindData.T(), bindData2.T())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.cmot
    public final long a(cmmp cmmpVar, String str) {
        cqaz.h();
        ((cmmq) this.l.b()).a(cmmpVar);
        if (TextUtils.isEmpty(str)) {
            eksl ekslVar = (eksl) d.i();
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipient", 248, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipient returned invalid thread id because the recipient parameter was a null recipient");
            return -1L;
        }
        ParticipantsTable.BindData bindDataB = bbbd.b(str);
        cqaz.h();
        if (bindDataB != null) {
            return k(cmmpVar, Collections.singleton(bindDataB));
        }
        eksl ekslVar2 = (eksl) d.i();
        ekslVar2.Z(eksk.FULL);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipant", 306, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipant returned invalid thread id because the participant parameter was a null participant");
        return -1L;
    }

    @Override // defpackage.cmot
    public final long b(ConversationIdType conversationIdType) {
        cqaz.h();
        try {
            if (((Boolean) avos.a.e()).booleanValue()) {
                return ((avmr) this.k.b()).a(conversationIdType).a();
            }
            List listK = ((bakt) this.g.b()).K(conversationIdType);
            if (!listK.isEmpty()) {
                j();
                return d(listK);
            }
            eksl ekslVar = (eksl) d.i();
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", 336, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId can't resolve a conversation with no recipients");
            return -1L;
        } catch (cgex | IllegalArgumentException | SecurityException e2) {
            ((eksl) ((eksl) ((eksl) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", (char) 345, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.cmot
    public final long c(ParticipantsTable.BindData bindData) {
        cqaz.h();
        if (bindData != null) {
            return d(Collections.singleton(bindData));
        }
        eksl ekslVar = (eksl) d.i();
        ekslVar.Z(eksk.FULL);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipant", 155, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipant returned invalid thread id because parameter was a null participant");
        return -1L;
    }

    @Override // defpackage.cmot
    public final long d(Collection collection) {
        cqaz.h();
        try {
            return k(cmol.a, collection);
        } catch (cgex | IllegalArgumentException | SecurityException e2) {
            ((eksl) ((eksl) ((eksl) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipants", (char) 206, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipants failed");
            return -1L;
        }
    }

    @Override // defpackage.cmot
    public final /* synthetic */ long e(String str) {
        return f(cmol.a, str);
    }

    @Override // defpackage.cmot
    public final long f(cmmp cmmpVar, String str) {
        cqaz.h();
        ((cmmq) this.l.b()).a(cmmpVar);
        if (!TextUtils.isEmpty(str)) {
            return h(cmmpVar, Collections.singleton(str));
        }
        eksl ekslVar = (eksl) d.i();
        ekslVar.Z(eksk.FULL);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipient", 181, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
        return -1L;
    }

    @Override // defpackage.cmot
    public final /* synthetic */ long g(Collection collection) {
        return h(cmol.a, collection);
    }

    @Override // defpackage.cmot
    public final long h(cmmp cmmpVar, Collection collection) {
        cqaz.h();
        fcsu fcsuVar = this.l;
        ((cmmq) fcsuVar.b()).a(cmmpVar);
        try {
            eieu eieuVarK = eiiy.k("MmsSmsThreadIdResolver.resolveFromRecipients");
            try {
                cqaz.h();
                ((cmmq) fcsuVar.b()).a(cmmpVar);
                if (collection != null && !collection.isEmpty()) {
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (TextUtils.isEmpty(str)) {
                            c.r("empty recipient");
                        } else {
                            arrayList.add(bbbd.b(str));
                        }
                    }
                    long jK = k(cmmpVar, arrayList);
                    eieuVarK.close();
                    return jK;
                }
                eksl ekslVar = (eksl) d.i();
                ekslVar.Z(eksk.FULL);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipients", 274, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipients returned invalid thread id because the recipients parameter was an empty collection of recipients");
                eieuVarK.close();
                return -1L;
            } finally {
            }
        } catch (cgex | IllegalArgumentException | SecurityException e2) {
            ((eksl) ((eksl) ((eksl) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipients", (char) 230, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipients failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        j();
    }

    @Override // defpackage.cmot
    public final void j() {
        Map map = this.n;
        synchronized (map) {
            map.clear();
        }
    }

    public final long k(cmmp cmmpVar, Collection collection) {
        String strJoin;
        Long l;
        long j;
        cmow cmowVar;
        ((cmmq) this.l.b()).a(cmmpVar);
        if (collection.size() == 1) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) collection.iterator().next();
            strJoin = bindData != null ? bindData.T() : "null";
        } else {
            strJoin = TextUtils.join(",", (List) Collection.EL.stream(collection).map(this.a).sorted().collect(Collectors.toCollection(new Supplier() { // from class: cmou
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        Map map = this.n;
        synchronized (map) {
            l = (Long) map.get(strJoin);
        }
        if (l != null) {
            return l.longValue();
        }
        if (collection == null || collection.isEmpty()) {
            eksl ekslVar = (eksl) d.i();
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipants", 401, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipants returned invalid thread id because the participants parameter was an empty collection of participants");
            j = -1;
        } else {
            if (collection.size() == 1) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) collection.iterator().next();
                String strV = bindData2.V();
                String strL = l(bindData2);
                boolean zEquals = TextUtils.equals(strV, strL);
                cqbd cqbdVarA = c.a();
                cqbdVarA.I("get candidate thread Ids.");
                cqbdVarA.M("sendDestination", strV);
                cqbdVarA.M("displayDestination", strL);
                cqbdVarA.B("equal destinations", zEquals);
                cqbdVarA.r();
                cmowVar = (cmow) this.j.b();
                cmqj cmqjVar = (cmqj) this.h.b();
                awch awchVarA = ((awci) this.m.b()).a();
                Context context = this.f;
                cmowVar.a = cmqjVar.h(context, cmmpVar, strV, awchVarA);
                if (zEquals || TextUtils.isEmpty(strL)) {
                    cmowVar.b = cmowVar.a;
                } else {
                    cmowVar.b = cmqjVar.h(context, cmmpVar, strL, awchVarA);
                }
            } else {
                cmowVar = (cmow) this.j.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ParticipantsTable.BindData) it.next()).V());
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(l((ParticipantsTable.BindData) it2.next()));
                }
                cmqj cmqjVar2 = (cmqj) this.h.b();
                awch awchVarA2 = ((awci) this.m.b()).a();
                Context context2 = this.f;
                cmowVar.a = cmqjVar2.i(context2, cmmpVar, arrayList, awchVarA2);
                cmowVar.b = cmqjVar2.i(context2, cmmpVar, arrayList2, awchVarA2);
            }
            cqce cqceVar = c;
            cqbd cqbdVarA2 = cqceVar.a();
            cqbdVarA2.I("resolve from");
            cqbdVarA2.L("participants", collection);
            cqbdVarA2.z("idForSendDestinations", cmowVar.a);
            cqbdVarA2.z("idForDisplayDestinations", cmowVar.b);
            cqbdVarA2.r();
            j = cmowVar.a;
            if (j != cmowVar.b) {
                if (m(collection, cmowVar.a(j))) {
                    cqbd cqbdVarA3 = cqceVar.a();
                    cqbdVarA3.I("resolve using idForSendDestinations:");
                    cqbdVarA3.H(cmowVar.a);
                    cqbdVarA3.r();
                    ((ains) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                    j = cmowVar.a;
                } else {
                    java.util.Collection collectionA = cmowVar.a(cmowVar.b);
                    if (m(collection, collectionA)) {
                        cqbd cqbdVarA4 = cqceVar.a();
                        cqbdVarA4.I("resolve using idForDisplayDestinations:");
                        cqbdVarA4.H(cmowVar.b);
                        cqbdVarA4.r();
                        ((ains) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 1);
                        j = cmowVar.b;
                    } else if (collectionA.isEmpty()) {
                        cqbd cqbdVarA5 = cqceVar.a();
                        cqbdVarA5.I("resolve for empty displayDestinationParticipants.");
                        cqbdVarA5.z("idForDisplayDestinations", cmowVar.b);
                        cqbdVarA5.r();
                        ((ains) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 2);
                        j = cmowVar.b;
                    } else {
                        cqbd cqbdVarA6 = cqceVar.a();
                        cqbdVarA6.I("resolve for non-empty displayDestinationParticipants.");
                        cqbdVarA6.z("idForSendDestinations", cmowVar.a);
                        cqbdVarA6.r();
                        ((ains) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                        j = cmowVar.a;
                    }
                }
            }
        }
        Map map2 = this.n;
        Long lValueOf = Long.valueOf(j);
        synchronized (map2) {
            map2.put(strJoin, lValueOf);
        }
        lValueOf.getClass();
        return j;
    }
}
