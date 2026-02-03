package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txx implements cdfg {
    public final eosc a;
    public final apqd b;
    public final apqe c;
    public final autx d;
    public final fcsu e;
    private final aurx f;
    private final caqw g;
    private final carl h;
    private final eosc i;

    public txx(aurx aurxVar, eosc eoscVar, eosc eoscVar2, caqw caqwVar, carl carlVar, apqd apqdVar, apqe apqeVar, autx autxVar, fcsu fcsuVar) {
        this.f = aurxVar;
        this.a = eoscVar;
        this.i = eoscVar2;
        this.g = caqwVar;
        this.h = carlVar;
        this.c = apqeVar;
        this.b = apqdVar;
        this.d = autxVar;
        this.e = fcsuVar;
    }

    public final eiju a(boolean z) {
        eiju eijuVarC;
        final StringWriter stringWriter = new StringWriter();
        if (z) {
            carc carcVar = (carc) this.g;
            eijuVarC = auvw.c(carcVar.f, fcyi.a, fdjz.a, new caqz(carcVar, new PrintWriter(stringWriter), null));
        } else {
            carq carqVar = (carq) this.h;
            eijuVarC = auvw.c(carqVar.e, fcyi.a, fdjz.a, new caro(carqVar, new PrintWriter(stringWriter), null));
        }
        return eijuVarC.h(new ejvr() { // from class: txq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return stringWriter.toString();
            }
        }, this.a);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.h(new eooy() { // from class: txr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cpyl.l);
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ejxr ejxrVar = (ejxr) arrayList2.get(i);
                    Object objE = ((cczi) ejxrVar.get()).e();
                    sb.append(String.format("%c%s: %s\n", Character.valueOf(true != Objects.equals(objE, ((cczi) ejxrVar.get()).f()) ? '*' : ' '), ((cczi) ejxrVar.get()).j(), objE));
                }
                final txx txxVar = this.a;
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "CmsPhenotype"));
                eiju eijuVarE = eijx.e(arrayList);
                if (txxVar.b.a()) {
                    eijuVarE = eijuVarE.i(new eooz() { // from class: txv
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            txx txxVar2 = txxVar;
                            final List list = (List) obj;
                            return txxVar2.a(true).h(new ejvr() { // from class: txs
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    String str = (String) obj2;
                                    boolean zIsEmpty = str.isEmpty();
                                    List list2 = list;
                                    if (!zIsEmpty) {
                                        list2.add(new FileTeleporter(str.getBytes(), "CmsBackupTimingStats"));
                                    }
                                    return list2;
                                }
                            }, txxVar2.a);
                        }
                    }, txxVar.a);
                }
                return txxVar.c.a() ? eijuVarE.i(new eooz() { // from class: txw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        txx txxVar2 = txxVar;
                        final List list = (List) obj;
                        return txxVar2.a(false).h(new ejvr() { // from class: txu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                String str = (String) obj2;
                                boolean zIsEmpty = str.isEmpty();
                                List list2 = list;
                                if (!zIsEmpty) {
                                    list2.add(new FileTeleporter(str.getBytes(), "CmsRestoreTimingStats"));
                                }
                                return list2;
                            }
                        }, txxVar2.a);
                    }
                }, txxVar.a) : eijuVarE;
            }
        }, this.i);
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        eiju eijuVarK = this.f.k();
        ejvr ejvrVar = new ejvr() { // from class: txo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                String strB = this.a.d.b(aumqVar);
                ekgi ekgiVar = new ekgi();
                auml aumlVarB = auml.b(aumqVar.l);
                if (aumlVarB == null) {
                    aumlVarB = auml.UNSPECIFIED_STATUS;
                }
                ekgiVar.i("CmsMultiDeviceFeatureEnableStatus", aumlVarB.name());
                ekgiVar.i("CmsIsMultiDeviceEnabled", String.valueOf(aumqVar.e));
                ekgiVar.i("CmsIsBnrEnabled", String.valueOf(aumqVar.q));
                ekgiVar.i("CmsInitialSyncStatus", strB);
                ekgiVar.i("cms_session_id", aumqVar.j);
                evtg evtgVar = aumqVar.L;
                StringBuilder sb = new StringBuilder();
                Iterator<E> it = evtgVar.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                    }
                }
                ekgiVar.i("cms_previous_session_ids", sb.toString());
                return ekgiVar.c();
            }
        };
        eosc eoscVar = this.a;
        return eijuVarK.h(ejvrVar, eoscVar).i(new eooz() { // from class: txp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                txx txxVar = this.a;
                final ekgp ekgpVar = (ekgp) obj;
                cobl coblVar = (cobl) txxVar.e.b();
                return auvw.c(coblVar.e, fcyi.a, fdjz.a, new cobd(coblVar, null)).h(new ejvr() { // from class: txn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgi ekgiVar = new ekgi();
                        ekgiVar.g(ekgpVar);
                        ekgiVar.i("CmsTelephonyForwardSyncIsPaused", String.valueOf((Boolean) obj2));
                        return ekgiVar.c();
                    }
                }, txxVar.a);
            }
        }, eoscVar).h(new ejvr() { // from class: txt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cdfd.a((Map) obj);
            }
        }, eoscVar);
    }
}
