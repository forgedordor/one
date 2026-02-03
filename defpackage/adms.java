package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adms {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache");
    public final cogw b;
    public final adap c;
    public dqpi e;
    public aczf g = acza.a(ekoj.a, null, null);
    public aeum d = null;
    public final Map f = new HashMap();

    public adms(cogw cogwVar, adap adapVar) {
        this.b = cogwVar;
        this.c = adapVar;
    }

    public static void d(String str, cdpg cdpgVar, SuperSortLabel superSortLabel) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", "logQuery", 224, "HomeScreenQueryCache.java")).I("%s\nConversationListGroup: %s\nLabel: %s", str, cdpgVar, superSortLabel);
    }

    public final aeum a(aeum aeumVar, dqpi dqpiVar, CancellationSignal cancellationSignal) throws dqwt {
        dqpi dqpiVar2;
        if (cancellationSignal.isCanceled()) {
            throw new dqwt((byte[]) null);
        }
        aeum aeumVar2 = this.d;
        if (aeumVar2 != null && (dqpiVar2 = this.e) != null) {
            aeumVar2.Q(dqpiVar2);
        }
        this.d = aeumVar;
        this.e = dqpiVar;
        aeumVar.M(dqpiVar);
        return this.d;
    }

    public final aewb b(cdpg cdpgVar, SuperSortLabel superSortLabel) {
        Map map = this.f;
        aewb aewbVar = (aewb) map.get(superSortLabel);
        if (aewbVar != null) {
            return aewbVar;
        }
        admu admuVar = new admu();
        int iOrdinal = cdpgVar.ordinal();
        if (iOrdinal == 1) {
            admuVar.a = true;
        } else if (iOrdinal != 2) {
            admuVar.b = true;
        } else {
            admuVar.c = true;
        }
        aewb aewbVarA = admuVar.a();
        map.put(superSortLabel, aewbVarA);
        return aewbVarA;
    }

    public final List c(aeum aeumVar, final Map map, final CancellationSignal cancellationSignal) {
        dqsy dqsyVarS = aeumVar.s();
        aeumVar.P();
        aeumVar.r = cancellationSignal;
        dqox dqoxVar = new dqox(aeumVar.e);
        dqoxVar.v = new dqwa(aeumVar);
        dqwv dqwvVarA = dqoxVar.a();
        Cursor cursorG = dqsyVarS.g(aeumVar.k, aeumVar.j, dqwvVarA, cancellationSignal);
        dqxe[] dqxeVarArr = (dqxe[]) aeumVar.i.toArray(new dqxe[0]);
        dqwj dqwjVar = new dqwj() { // from class: dqvx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dqwl.a;
                return str;
            }
        };
        dqtm dqtmVar = aeumVar.m;
        aeuk aeukVar = new aeuk(dqsyVarS, cursorG, aeumVar.l, dqxeVarArr, dqwjVar, dqtmVar, aeumVar);
        aeukVar.dh(dqtmVar, dqtmVar.c(), aeumVar.S());
        Stream streamDa = aeukVar.da();
        try {
            List list = (List) streamDa.map(new Function() { // from class: admp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    adms admsVar = this.a;
                    adtz adtzVar = (adtz) obj;
                    if (cancellationSignal.isCanceled()) {
                        ekrw ekrwVarJ = adms.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 198, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                        throw new CancellationException();
                    }
                    eieu eieuVarK = eiiy.k("ConversationListDataSources#fromHomeScreenQuery");
                    try {
                        acyx acyxVarAj = acyx.aj(adtzVar, admsVar.b);
                        eieuVarK.close();
                        return acyxVarAj;
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: admq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map map2 = map;
                    adms admsVar = this.a;
                    acyx acyxVar = (acyx) obj;
                    if (cancellationSignal.isCanceled()) {
                        ekrw ekrwVarJ = adms.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 209, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                        throw new CancellationException();
                    }
                    eieu eieuVarK = eiiy.k("ConversationListDataSources#conversationListItemViewDataFactory");
                    try {
                        adap adapVar = admsVar.c;
                        aczf aczfVar = admsVar.g;
                        adan adanVarAk = adao.ak();
                        adanVarAk.b(acyxVar);
                        adanVarAk.e(acxp.a(acyxVar));
                        adanVarAk.l(acxp.c(acyxVar));
                        ((adaj) adanVarAk).v = (bbew) map2.get(acyxVar.w());
                        adanVarAk.c(TextUtils.equals(acyxVar.al("conversation_contains_vsms_participant"), "1"));
                        adanVarAk.d(acyxVar.am());
                        ((adaj) adanVarAk).C = "";
                        ((adaj) adanVarAk).I = null;
                        Iterator it = adapVar.a.iterator();
                        while (it.hasNext()) {
                            ((aczd) it.next()).a().a(adanVarAk, acyxVar, aczfVar);
                        }
                        Iterator it2 = adapVar.b(acyxVar).iterator();
                        while (it2.hasNext()) {
                            ((adaq) it2.next()).d(adanVarAk, acyxVar);
                        }
                        adao adaoVarA = adanVarAk.a();
                        eieuVarK.close();
                        return adaoVarA;
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: admr
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            if (streamDa != null) {
                streamDa.close();
            }
            return list;
        } catch (Throwable th) {
            if (streamDa == null) {
                throw th;
            }
            try {
                streamDa.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
