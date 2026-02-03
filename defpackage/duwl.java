package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwl {
    public final dtsl a;
    public final ejwi b;
    public final List c;

    public duwl(dtsl dtslVar, ejwi ejwiVar, List list) {
        this.a = dtslVar;
        this.b = ejwiVar;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dtok a(dtok dtokVar) {
        if ((dtokVar.b & 1) != 0) {
            dtoj dtojVar = dtokVar.d;
            if (dtojVar == null) {
                dtojVar = dtoj.a;
            }
            if (!dtojVar.b.isEmpty()) {
                dtoj dtojVar2 = dtokVar.d;
                if (dtojVar2 == null) {
                    dtojVar2 = dtoj.a;
                }
                String str = dtojVar2.b;
                dtod dtodVar = (dtod) dtokVar.toBuilder();
                dtodVar.copyOnWrite();
                ((dtok) dtodVar.instance).c = dtok.emptyProtobufList();
                for (dtoh dtohVar : dtokVar.c) {
                    dtns dtnsVar = dtohVar.d;
                    if (dtnsVar == null) {
                        dtnsVar = dtns.a;
                    }
                    dtnr dtnrVar = (dtnr) dtnsVar.toBuilder();
                    dtnrVar.copyOnWrite();
                    ((dtns) dtnrVar.instance).g = dtns.emptyProtobufList();
                    dtns dtnsVar2 = dtohVar.d;
                    if (dtnsVar2 == null) {
                        dtnsVar2 = dtns.a;
                    }
                    for (dtnq dtnqVar : dtnsVar2.g) {
                        dtnn dtnnVar = (dtnn) dtnqVar.toBuilder();
                        dtnnVar.copyOnWrite();
                        ((dtnq) dtnnVar.instance).l = dtnq.emptyProtobufList();
                        if (dtnqVar.d.isEmpty()) {
                            String strReplace = str.replace("{checksum}", dtnqVar.g);
                            dtnnVar.copyOnWrite();
                            dtnq dtnqVar2 = (dtnq) dtnnVar.instance;
                            strReplace.getClass();
                            dtnqVar2.b |= 2;
                            dtnqVar2.d = strReplace;
                        }
                        for (dtnw dtnwVar : dtnqVar.l) {
                            if (dtnwVar.c.isEmpty()) {
                                dtnt dtntVar = (dtnt) dtnwVar.toBuilder();
                                String strReplace2 = str.replace("{checksum}", dtnwVar.e);
                                dtntVar.copyOnWrite();
                                dtnw dtnwVar2 = (dtnw) dtntVar.instance;
                                strReplace2.getClass();
                                dtnwVar2.b |= 1;
                                dtnwVar2.c = strReplace2;
                                dtnwVar = (dtnw) dtntVar.build();
                            }
                            dtnnVar.copyOnWrite();
                            dtnq dtnqVar3 = (dtnq) dtnnVar.instance;
                            dtnwVar.getClass();
                            evtg evtgVar = dtnqVar3.l;
                            if (!evtgVar.c()) {
                                dtnqVar3.l = evsn.mutableCopy(evtgVar);
                            }
                            dtnqVar3.l.add(dtnwVar);
                        }
                        dtnrVar.copyOnWrite();
                        dtns dtnsVar3 = (dtns) dtnrVar.instance;
                        dtnq dtnqVar4 = (dtnq) dtnnVar.build();
                        dtnqVar4.getClass();
                        dtnsVar3.a();
                        dtnsVar3.g.add(dtnqVar4);
                    }
                    dtoe dtoeVar = (dtoe) dtohVar.toBuilder();
                    dtoeVar.copyOnWrite();
                    dtoh dtohVar2 = (dtoh) dtoeVar.instance;
                    dtns dtnsVar4 = (dtns) dtnrVar.build();
                    dtnsVar4.getClass();
                    dtohVar2.d = dtnsVar4;
                    dtohVar2.b |= 2;
                    dtodVar.copyOnWrite();
                    dtok dtokVar2 = (dtok) dtodVar.instance;
                    dtoh dtohVar3 = (dtoh) dtoeVar.build();
                    dtohVar3.getClass();
                    evtg evtgVar2 = dtokVar2.c;
                    if (!evtgVar2.c()) {
                        dtokVar2.c = evsn.mutableCopy(evtgVar2);
                    }
                    dtokVar2.c.add(dtohVar3);
                }
                return (dtok) dtodVar.build();
            }
        }
        Iterator<E> it = dtokVar.c.iterator();
        while (it.hasNext()) {
            dtns dtnsVar5 = ((dtoh) it.next()).d;
            if (dtnsVar5 == null) {
                dtnsVar5 = dtns.a;
            }
            for (dtnq dtnqVar5 : dtnsVar5.g) {
                if (dtnqVar5.d.isEmpty()) {
                    throw new IllegalArgumentException(String.format("DataFile %s url_to_download is missing.", dtnqVar5.c));
                }
                Iterator<E> it2 = dtnqVar5.l.iterator();
                while (it2.hasNext()) {
                    if (((dtnw) it2.next()).c.isEmpty()) {
                        throw new IllegalArgumentException(String.format("DeltaFile for file %s url_to_download is missing.", dtnqVar5.c));
                    }
                }
            }
        }
        return dtokVar;
    }

    public static final void b(ListenableFuture listenableFuture, String str, ejwi ejwiVar, ejwi ejwiVar2) {
        eika.l(listenableFuture, new duwk(str, ejwiVar), eoqg.a);
    }
}
