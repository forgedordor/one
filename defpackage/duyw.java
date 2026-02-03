package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyw implements draj {
    public static final /* synthetic */ int d = 0;
    private static final ekhx e = ekhx.s("next-pending", "current-active", "inline-payload");
    public final Executor a;
    public final ejxr b;
    public final duyv c;

    public duyw(duyt duytVar) {
        this.a = duytVar.a;
        this.b = duytVar.b;
        this.c = duytVar.c;
    }

    public static dtpq b(ewuw ewuwVar) {
        evqe evqeVar = ewuwVar.e;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        evqs evqsVar = evqeVar.c;
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (dtpq) evsn.parseFrom(dtpq.a, evqsVar, evrr.a);
    }

    public static ekgb c(List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dtnq dtnqVar = (dtnq) it.next();
            if (dtnqVar.d.startsWith("inlinefile")) {
                ekfwVar.h(dtnqVar);
            }
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb d(ekgp ekgpVar, List list) {
        if (list.isEmpty()) {
            int i = ekgb.d;
            return ekoe.a;
        }
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejwi ejwiVar = (ejwi) it.next();
            if (ejwiVar.g()) {
                dtns dtnsVar = (dtns) ejwiVar.c();
                ekgb ekgbVarC = c(dtnsVar.g);
                ekgi ekgiVar = new ekgi();
                int i3 = ((ekoe) ekgbVarC).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    dtnq dtnqVar = (dtnq) ekgbVarC.get(i4);
                    dtnp dtnpVarB = dtnp.b(dtnqVar.f);
                    if (dtnpVarB == null) {
                        dtnpVarB = dtnp.DEFAULT;
                    }
                    if (dtnpVarB.equals(dtnp.NONE)) {
                        String str = dtnqVar.c;
                        String str2 = dtnsVar.c;
                        dtnp dtnpVarB2 = dtnp.b(dtnqVar.f);
                        if (dtnpVarB2 == null) {
                            dtnpVarB2 = dtnp.DEFAULT;
                        }
                        durt.d("%s: Skip adding inlinefile to file map for file : %s , groupName : %s since checksumType is %s.", "GddDownloadedElementsListener", str, str2, dtnpVarB2);
                    } else {
                        ejwl.i(ekgpVar.containsKey(dtnqVar.g), "Can't find the inlinefile %s of group %s in the inlinePayload", dtnqVar.c, dtnsVar.c);
                        String str3 = dtnqVar.c;
                        dtpg dtpgVar = (dtpg) ekgpVar.get(dtnqVar.g);
                        dtpgVar.getClass();
                        ekgiVar.i(str3, dtpgVar);
                    }
                }
                ekfwVar.h(new duyd((dtns) ejwiVar.c(), ekgiVar.c()));
            }
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List e(List list) {
        ListenableFuture listenableFutureH;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                dtpq dtpqVarB = b((ewuw) ((ejwt) ejwi.j((ewuw) it.next())).a);
                boolean z = true;
                ejwl.b(dtpqVarB.b == 3, "MddElement with current-active or next-pending key must contain a ManifestConfig");
                dtpo dtpoVar = dtpqVarB.b == 3 ? (dtpo) dtpqVarB.c : dtpo.a;
                ejwl.b(1 == (dtpoVar.b & 1), "ManifestConfigResponse should contain ManifestConfig to process, but none was found.");
                dtok dtokVar = dtpoVar.c;
                if (dtokVar == null) {
                    dtokVar = dtok.a;
                }
                dtok dtokVarA = duwl.a(dtokVar);
                if (dtokVarA.c.size() <= 0) {
                    z = false;
                }
                ejwl.b(z, "ManifestConfig should contain at least one entry, but none was found");
                dtns dtnsVar = ((dtoh) dtokVarA.c.get(0)).d;
                if (dtnsVar == null) {
                    dtnsVar = dtns.a;
                }
                listenableFutureH = eork.i(ejwi.j(dtnsVar));
            } catch (evtj | IllegalArgumentException e2) {
                listenableFutureH = eork.h(e2);
            }
            arrayList.add(listenableFutureH);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.draj
    public final ListenableFuture a(final ejwi ejwiVar, final ewun ewunVar, ekgb ekgbVar) {
        ListenableFuture listenableFutureI;
        durt.c("%s: Processing Sync Response, expected response type = %s", "GddDownloadedElementsListener", this.c);
        if (ekgbVar.isEmpty()) {
            durt.b("%s: No elements were synced, returning early.", "GddDownloadedElementsListener");
            return eorv.a;
        }
        HashMap map = new HashMap();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            ewuw ewuwVar = (ewuw) ekgbVar.get(i);
            try {
                String str = ewuwVar.d;
                int iIndexOf = str.indexOf(":");
                String strSubstring = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
                if (!e.contains(strSubstring)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Element key (%s) had an unexpected key type", str));
                }
                if (!map.containsKey(strSubstring)) {
                    map.put(strSubstring, new ArrayList());
                }
                ((List) map.get(strSubstring)).add(ewuwVar);
            } catch (IllegalArgumentException e2) {
                listenableFutureI = eork.h(e2);
            }
        }
        listenableFutureI = (map.size() != 1 || map.containsKey("next-pending")) ? (!map.containsKey("inline-payload") || ((List) map.get("inline-payload")).size() == 1) ? eork.i(ekgp.j(map)) : eork.h(new IllegalArgumentException(String.format(Locale.US, "Only 1 inline payload element should be in the response, but multiple (%d) elements were received", Integer.valueOf(((List) map.get("inline-payload")).size())))) : eork.h(new IllegalArgumentException(String.format("1 element synced and was expected to be next-pending element, but was: %s", map.keySet())));
        return dvaq.e(dtox.b(listenableFutureI, dtow.GDD_INVALID_ELEMENT_COMBINATION_RECEIVED, "Unexpected element combination received")).g(new eooz() { // from class: duyr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ListenableFuture listenableFutureI2;
                ListenableFuture listenableFutureH;
                ekgp ekgpVar = (ekgp) obj;
                ewvl ewvlVar = ewunVar.e;
                if (ewvlVar == null) {
                    ewvlVar = ewvl.a;
                }
                int iA = ewvp.a(ewvlVar.d);
                if (iA != 0 && iA == 4) {
                    ejwi ejwiVar2 = ejwiVar;
                    listenableFutureI2 = !ejwiVar2.g() ? eork.h(new IllegalArgumentException()) : eork.i(ejwiVar2);
                } else {
                    listenableFutureI2 = eork.i(ejud.a);
                }
                final duyw duywVar = this.a;
                final ListenableFuture listenableFutureB = dtox.b(listenableFutureI2, dtow.GDD_MISSING_ACCOUNT_FOR_PRIVATE_SYNC, "Received gaia-scoped elements but account is unavailable");
                final ListenableFuture listenableFutureB2 = dtox.b(eork.e(duyw.e((List) ekgpVar.getOrDefault("current-active", new ArrayList()))), dtow.GDD_INVALID_CURRENT_ACTIVE_ELEMENT_DATA, "Received invalid data in current-active element");
                final ListenableFuture listenableFutureB3 = dtox.b(eork.e(duyw.e((List) ekgpVar.getOrDefault("next-pending", new ArrayList()))), dtow.GDD_INVALID_NEXT_PENDING_ELEMENT_DATA, "Received invalid data in next-pending element");
                ejwi ejwiVarJ = ekgpVar.containsKey("inline-payload") ? ejwi.j((ewuw) ((List) ekgpVar.get("inline-payload")).get(0)) : ejud.a;
                if (ejwiVarJ.g()) {
                    try {
                        dtpq dtpqVarB = duyw.b((ewuw) ejwiVarJ.c());
                        ejwl.b(dtpqVarB.b == 2, "MddElement with inline-payload key must contain an InlinePayload");
                        evtg<dtpk> evtgVar = (dtpqVarB.b == 2 ? (dtpm) dtpqVarB.c : dtpm.a).b;
                        ekgi ekgiVarH = ekgp.h(evtgVar.size());
                        for (dtpk dtpkVar : evtgVar) {
                            int i2 = dtpkVar.b;
                            int i3 = i2 & 1;
                            ejwl.f((i3 == 0 || (i2 & 2) == 0) ? false : true, "Invalid format for InlineFile, key: %s", i3 != 0 ? dtpkVar.c : "UNKNOWN");
                            String str2 = dtpkVar.c;
                            evqs evqsVar = dtpkVar.d;
                            if (evqsVar == null) {
                                throw null;
                            }
                            ekgiVarH.i(str2, new dtpe(evqsVar));
                        }
                        listenableFutureH = eork.i(ekgiVarH.c());
                    } catch (evtj | IllegalArgumentException e3) {
                        listenableFutureH = eork.h(e3);
                    }
                } else {
                    listenableFutureH = eork.i(ekoj.a);
                }
                final ListenableFuture listenableFutureB4 = dtox.b(listenableFutureH, dtow.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA, "Received invalid data in inline-payload element");
                return dvat.d(listenableFutureB, listenableFutureB2, listenableFutureB3, listenableFutureB4).b(new eooy() { // from class: duym
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v4, types: [dtsl, java.lang.Object] */
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final ejwi ejwiVar3 = (ejwi) eork.q(listenableFutureB);
                        ekgp ekgpVar2 = (ekgp) eork.q(listenableFutureB4);
                        List list = (List) eork.q(listenableFutureB2);
                        List list2 = (List) eork.q(listenableFutureB3);
                        try {
                            final ekgb ekgbVarD = duyw.d(ekgpVar2, list);
                            ekgb ekgbVarD2 = duyw.d(ekgpVar2, list2);
                            final duyw duywVar2 = duywVar;
                            ListenableFuture listenableFutureB5 = eorv.a;
                            if (!ekgbVarD2.isEmpty()) {
                                final ArrayList arrayList = new ArrayList();
                                int i4 = ((ekoe) ekgbVarD2).c;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    duyu duyuVar = (duyu) ekgbVarD2.get(i5);
                                    final dtns dtnsVarA = duyuVar.a();
                                    final ekgp ekgpVarB = duyuVar.b();
                                    durt.c("%s: Adding next-pending instance of group: %s", "GddDownloadedElementsListener", dtnsVarA.c);
                                    dtmj dtmjVar = new dtmj();
                                    dtmjVar.c(dtnsVarA);
                                    dtmjVar.b(ejwiVar3);
                                    if (duywVar2.c.equals(duyv.MULTI_VARIANT_USING_GROUP_KEY)) {
                                        dtmjVar.a = ejwi.j(dtnsVarA.i);
                                    }
                                    arrayList.add(eika.k(duywVar2.b.get().a(dtmjVar.a()), new eooz() { // from class: duyl
                                        /* JADX WARN: Type inference failed for: r6v10, types: [dtsl, java.lang.Object] */
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            dtns dtnsVar = dtnsVarA;
                                            if (!zBooleanValue) {
                                                durt.h("%s: Failed to add next pending group %s, skipping import", "GddDownloadedElementsListener", dtnsVar.c);
                                                dtov dtovVarA = dtox.a();
                                                dtovVarA.a = dtow.GDD_FAIL_TO_ADD_NEXT_PENDING_GROUP;
                                                return eork.h(dtovVarA.a());
                                            }
                                            ekgp ekgpVar3 = ekgpVarB;
                                            if (ekgpVar3.isEmpty()) {
                                                durt.c("%s: No inline files in next pending group %s, skipping import", "GddDownloadedElementsListener", dtnsVar.c);
                                                return eorv.a;
                                            }
                                            ejwi ejwiVar4 = ejwiVar3;
                                            dtqd dtqdVarH = dtqe.h();
                                            dtqdVarH.d(dtnsVar.c);
                                            dtqdVarH.c(dtnsVar.h);
                                            dtqdVarH.f(dtnsVar.i);
                                            dtms dtmsVar = (dtms) dtqdVarH;
                                            dtmsVar.b = ekgpVar3;
                                            dtqdVarH.e(duyw.c(dtnsVar.g));
                                            dtqdVarH.b(ejwiVar4);
                                            if ((dtnsVar.b & 8) != 0) {
                                                evqe evqeVar = dtnsVar.f;
                                                if (evqeVar == null) {
                                                    evqeVar = evqe.a;
                                                }
                                                dtmsVar.a = ejwi.j(evqeVar);
                                            }
                                            return duywVar2.b.get().h(dtqdVarH.a());
                                        }
                                    }, duywVar2.a));
                                }
                                listenableFutureB5 = dvat.a(arrayList).b(new eooy() { // from class: duyo
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        int i6 = duyw.d;
                                        return dtmi.b(arrayList, "Failed to add next pending variants to MDD", new Object[0]);
                                    }
                                }, duywVar2.a);
                            }
                            if (ekgbVarD.isEmpty()) {
                                return listenableFutureB5;
                            }
                            dvas dvasVarB = dvat.b(listenableFutureB5);
                            eooy eooyVar = new eooy() { // from class: duyp
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v10, types: [dtsl, java.lang.Object] */
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    ListenableFuture listenableFutureF;
                                    final ArrayList arrayList2 = new ArrayList();
                                    int i6 = 0;
                                    while (true) {
                                        ekgb ekgbVar2 = ekgbVarD;
                                        duyw duywVar3 = duywVar2;
                                        if (i6 >= ((ekoe) ekgbVar2).c) {
                                            return dvat.a(arrayList2).b(new eooy() { // from class: duyn
                                                @Override // defpackage.eooy
                                                public final ListenableFuture a() {
                                                    int i7 = duyw.d;
                                                    return dtmi.b(arrayList2, "Failed to import current-active variants to MDD", new Object[0]);
                                                }
                                            }, duywVar3.a);
                                        }
                                        duyu duyuVar2 = (duyu) ekgbVar2.get(i6);
                                        final dtns dtnsVarA2 = duyuVar2.a();
                                        ekgp ekgpVarB2 = duyuVar2.b();
                                        durt.c("%s: Updating current active instance of group: %s", "GddDownloadedElementsListener", dtnsVarA2.c);
                                        if (ekgpVarB2.isEmpty()) {
                                            durt.h("%s: No inline files in received current active group %s, skipping import", "GddDownloadedElementsListener", dtnsVarA2.c);
                                            dtov dtovVarA = dtox.a();
                                            dtovVarA.a = dtow.GDD_CURRENT_ACTIVE_GROUP_HAS_NO_INLINE_FILE;
                                            listenableFutureF = eork.h(dtovVarA.a());
                                        } else {
                                            ejwi ejwiVar4 = ejwiVar3;
                                            dtqd dtqdVarH = dtqe.h();
                                            dtqdVarH.d(dtnsVarA2.c);
                                            dtqdVarH.c(dtnsVarA2.h);
                                            dtqdVarH.f(dtnsVarA2.i);
                                            dtms dtmsVar = (dtms) dtqdVarH;
                                            dtmsVar.b = ekgpVarB2;
                                            dtqdVarH.e(duyw.c(dtnsVarA2.g));
                                            dtqdVarH.b(ejwiVar4);
                                            if ((dtnsVarA2.b & 8) != 0) {
                                                evqe evqeVar = dtnsVarA2.f;
                                                if (evqeVar == null) {
                                                    evqeVar = evqe.a;
                                                }
                                                dtmsVar.a = ejwi.j(evqeVar);
                                            }
                                            listenableFutureF = eika.f(duywVar3.b.get().h(dtqdVarH.a()), dtox.class, new eooz() { // from class: duys
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj2) {
                                                    dtox dtoxVar = (dtox) obj2;
                                                    dtow dtowVar = dtoxVar.a;
                                                    int i7 = duyw.d;
                                                    if (!dtowVar.equals(dtow.GROUP_NOT_FOUND_ERROR)) {
                                                        return eork.h(dtoxVar);
                                                    }
                                                    durt.c("%s: Received current active group %s, but could not be imported (either not found or outdated).", "GddDownloadedElementsListener", dtnsVarA2.c);
                                                    return eorv.a;
                                                }
                                            }, duywVar3.a);
                                        }
                                        arrayList2.add(listenableFutureF);
                                        i6++;
                                    }
                                }
                            };
                            Executor executor = duywVar2.a;
                            final ekgb ekgbVarS = ekgb.s(listenableFutureB5, dvasVarB.b(eooyVar, executor));
                            return dvat.a(ekgbVarS).b(new eooy() { // from class: duyq
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    int i6 = duyw.d;
                                    return dtmi.b(ekgbVarS, "Error processing downloaded elements from Geller", new Object[0]);
                                }
                            }, executor);
                        } catch (IllegalArgumentException e4) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.c = e4;
                            dtovVarA.a = dtow.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA;
                            return eork.h(dtovVarA.a());
                        }
                    }
                }, duywVar.a);
            }
        }, this.a);
    }
}
