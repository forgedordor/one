package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cmpe implements cmoy, cqci {
    public static final /* synthetic */ int a = 0;
    private static final cqce b = cqce.g("Bugle", "MmsSmsThreadIdResolverMessagingIdentityImpl");
    private static final eksp c = eksp.c("Bugle");
    private static final ekhx d = ekhx.r("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ");
    private final Context e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final Map i = new HashMap();

    public cmpe(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.e = context;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
    }

    private static boolean c(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            alqm alqmVar = (alqm) it.next();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                if (alqmVar.equals((alqm) it2.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.cmoy
    public final long a(alqm alqmVar) {
        cqaz.h();
        if (!alqmVar.w()) {
            return b(ekgb.r(alqmVar));
        }
        eksl ekslVar = (eksl) c.i();
        ekslVar.Z(eksk.FULL);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "safeResolveFromRecipient", 140, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
        return -1L;
    }

    @Override // defpackage.cmoy
    public final long b(Collection collection) {
        String strJoin;
        Long l;
        cmpd cmpdVar;
        long jLongValue;
        cqaz.h();
        try {
            eieu eieuVarK = eiiy.k("MmsSmsThreadIdResolver.resolveFromRecipients");
            try {
                cqaz.h();
                if (collection != null && !collection.isEmpty()) {
                    ArrayList<alqm> arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        alqm alqmVar = (alqm) it.next();
                        if (alqmVar.w()) {
                            b.r("empty recipient");
                        } else {
                            arrayList.add(((alrj) this.h.b()).k(alqmVar));
                        }
                    }
                    if (arrayList.size() == 1) {
                        alqm alqmVar2 = (alqm) arrayList.iterator().next();
                        ejyb.e(alqmVar2);
                        if (alqmVar2.w()) {
                            strJoin = "null";
                        } else {
                            strJoin = alqmVar2.p(true);
                            ejyb.e(strJoin);
                        }
                    } else {
                        strJoin = TextUtils.join(",", (List) Collection.EL.stream(arrayList).map(new Function() { // from class: cmoz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i = cmpe.a;
                                String strP = ((alqm) obj).p(true);
                                ejyb.e(strP);
                                return strP;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).sorted().collect(Collectors.toCollection(new Supplier() { // from class: cmpa
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                    }
                    Map map = this.i;
                    synchronized (map) {
                        l = (Long) map.get(strJoin);
                    }
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        if (arrayList.isEmpty()) {
                            eksl ekslVar = (eksl) c.i();
                            ekslVar.Z(eksk.FULL);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "resolveFromParticipants", 323, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipants returned invalid thread id because the participants parameter was an empty collection of participants");
                            jLongValue = -1;
                        } else {
                            if (arrayList.size() == 1) {
                                alqm alqmVar3 = (alqm) arrayList.iterator().next();
                                String strK = alqmVar3.k(true);
                                String str = alqmVar3.G(true).a;
                                boolean zEquals = TextUtils.equals(strK, str);
                                cqbd cqbdVarA = b.a();
                                cqbdVarA.I("get candidate thread Ids.");
                                cqbdVarA.M("sendDestination", strK);
                                cqbdVarA.M("displayDestination", str);
                                cqbdVarA.B("equal destinations", zEquals);
                                cqbdVarA.r();
                                cmpdVar = (cmpd) this.g.b();
                                cmqj cmqjVar = (cmqj) this.f.b();
                                if (strK != null) {
                                    cmpdVar.b = cmqjVar.d(this.e, strK);
                                }
                                if (zEquals || TextUtils.isEmpty(str)) {
                                    cmpdVar.c = cmpdVar.b;
                                } else if (!TextUtils.isEmpty(str)) {
                                    cmpdVar.c = cmqjVar.d(this.e, str);
                                }
                            } else {
                                cmpdVar = (cmpd) this.g.b();
                                cmqj cmqjVar2 = (cmqj) this.f.b();
                                Context context = this.e;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    String strK2 = ((alqm) it2.next()).k(true);
                                    ejyb.e(strK2);
                                    arrayList2.add(strK2);
                                }
                                cmpdVar.b = cmqjVar2.e(context, arrayList2);
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                for (alqm alqmVar4 : arrayList) {
                                    String strK3 = (d.contains(alqmVar4.j()) || alqmVar4.D()) ? alqmVar4.k(true) : alqmVar4.G(true).a;
                                    if (strK3 != null) {
                                        arrayList3.add(strK3);
                                    }
                                }
                                cmpdVar.c = cmqjVar2.e(context, arrayList3);
                            }
                            cqce cqceVar = b;
                            cqbd cqbdVarA2 = cqceVar.a();
                            cqbdVarA2.I("resolve from");
                            cqbdVarA2.L("identities", arrayList);
                            cqbdVarA2.z("idForSendDestinations", cmpdVar.b);
                            cqbdVarA2.z("idForDisplayDestinations", cmpdVar.c);
                            cqbdVarA2.r();
                            jLongValue = cmpdVar.b;
                            if (jLongValue != cmpdVar.c) {
                                if (c(arrayList, cmpdVar.a(jLongValue))) {
                                    cqbd cqbdVarA3 = cqceVar.a();
                                    cqbdVarA3.I("resolve using idForSendDestinations:");
                                    cqbdVarA3.H(cmpdVar.b);
                                    cqbdVarA3.r();
                                    jLongValue = cmpdVar.b;
                                } else {
                                    java.util.Collection collectionA = cmpdVar.a(cmpdVar.c);
                                    if (c(arrayList, collectionA)) {
                                        cqbd cqbdVarA4 = cqceVar.a();
                                        cqbdVarA4.I("resolve using idForDisplayDestinations:");
                                        cqbdVarA4.H(cmpdVar.c);
                                        cqbdVarA4.r();
                                        jLongValue = cmpdVar.c;
                                    } else if (collectionA.isEmpty()) {
                                        cqbd cqbdVarA5 = cqceVar.a();
                                        cqbdVarA5.I("resolve for empty displayDestinationParticipants.");
                                        cqbdVarA5.z("idForDisplayDestinations", cmpdVar.c);
                                        cqbdVarA5.r();
                                        jLongValue = cmpdVar.c;
                                    } else {
                                        cqbd cqbdVarA6 = cqceVar.a();
                                        cqbdVarA6.I("resolve for non-empty displayDestinationParticipants.");
                                        cqbdVarA6.z("idForSendDestinations", cmpdVar.b);
                                        cqbdVarA6.r();
                                        jLongValue = cmpdVar.b;
                                    }
                                }
                            }
                        }
                        Long lValueOf = Long.valueOf(jLongValue);
                        Map map2 = this.i;
                        synchronized (map2) {
                            map2.put(strJoin, lValueOf);
                        }
                        lValueOf.getClass();
                    }
                    eieuVarK.close();
                    return jLongValue;
                }
                eksl ekslVar2 = (eksl) c.i();
                ekslVar2.Z(eksk.FULL);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "resolveFromRecipients", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipients returned invalid thread id because the recipients parameter was an empty collection of recipients");
                eieuVarK.close();
                return -1L;
            } finally {
            }
        } catch (cgex | IllegalArgumentException | SecurityException e) {
            ((eksl) ((eksl) ((eksl) c.i()).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "safeResolveFromRecipients", (char) 165, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipients failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        Map map = this.i;
        synchronized (map) {
            map.clear();
        }
    }
}
