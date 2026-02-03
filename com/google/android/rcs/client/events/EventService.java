package com.google.android.rcs.client.events;

import android.content.Context;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.ims.rcsservice.events.IEvent;
import defpackage.cczn;
import defpackage.cqca;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efal;
import defpackage.efao;
import defpackage.efaq;
import defpackage.efas;
import defpackage.efat;
import defpackage.efau;
import defpackage.efav;
import defpackage.efaw;
import defpackage.eigp;
import defpackage.ewee;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EventService extends efaj<IEvent> {
    public static final dfny h = dfnv.b("event_service_connection_deprecated");
    final efau i;
    private final SparseArray j;

    public EventService(eigp eigpVar, cczn ccznVar, efal efalVar, Context context, efaq efaqVar) {
        super(IEvent.class, context, efaqVar, 1, Optional.of(efalVar));
        ccznVar.a();
        SparseArray sparseArray = new SparseArray();
        this.j = sparseArray;
        this.i = new efau(sparseArray, eigpVar);
    }

    private final void h() {
        efaw.a.a(this);
        SparseArray sparseArray = this.j;
        synchronized (sparseArray) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                int iA = ((efat) sparseArray.valueAt(i)).a();
                try {
                    synchronized (this.d) {
                        try {
                            try {
                                if (a() != null) {
                                    ((IEvent) a()).unsubscribe(iKeyAt, iA);
                                    cqca.d("RcsClientLib", "EventService removing key %d as listener for %d", Integer.valueOf(iA), Integer.valueOf(iKeyAt));
                                }
                            } catch (efao unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    cqca.p("RcsClientLib", e, "exception when unsubscribing for disconnect");
                }
            }
            this.j.clear();
        }
    }

    @Override // defpackage.efaj
    protected final void d(String str) {
        super.d(str);
        efaw.a.b.put(this, true);
    }

    @Override // defpackage.efaj
    public void disconnect() {
        h();
        super.disconnect();
    }

    @Override // defpackage.efaj
    protected final void e(String str) {
        h();
        efaw.a.a(this);
        super.e(str);
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "EventServiceVersions";
    }

    @Override // defpackage.efaj
    public ewee getServiceNameLoggingEnum() {
        return ewee.EVENT_SERVICE;
    }

    public boolean isSubscribed(efav efavVar) {
        SparseArray sparseArray = this.j;
        synchronized (sparseArray) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                if (((efat) sparseArray.valueAt(i)).b().contains(efavVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    public void subscribe(int i, efav efavVar) throws efao {
        b();
        try {
            SparseArray sparseArray = this.j;
            synchronized (sparseArray) {
                efat efatVar = (efat) sparseArray.get(i);
                if (efatVar == null) {
                    cqca.d("RcsClientLib", "EventService subscribing itself as listener for %d", Integer.valueOf(i));
                    efas efasVar = new efas(((IEvent) a()).subscribe(i, this.i), new CopyOnWriteArrayList());
                    sparseArray.put(i, efasVar);
                    efatVar = efasVar;
                }
                cqca.d("RcsClientLib", "EventService adding %s as listener for %d", efavVar.a(), Integer.valueOf(i));
                efatVar.b().add(efavVar);
            }
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }

    public void unsubscribe(int i, efav efavVar) throws efao {
        b();
        try {
            SparseArray sparseArray = this.j;
            synchronized (sparseArray) {
                efat efatVar = (efat) sparseArray.get(i);
                if (efatVar == null) {
                    cqca.n("RcsClientLib", "Cannot unsubscribe from Rcs Event Service, there are no observers");
                    return;
                }
                String strA = efavVar.a();
                Integer numValueOf = Integer.valueOf(i);
                cqca.d("RcsClientLib", "EventService removing %s as listener for %d", strA, numValueOf);
                efatVar.b().remove(efavVar);
                if (efatVar.b().isEmpty()) {
                    ((IEvent) a()).unsubscribe(i, efatVar.a());
                    sparseArray.remove(i);
                    cqca.d("RcsClientLib", "EventService removing itself as listener for %d", numValueOf);
                }
            }
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }

    public void unsubscribeAllCategories(efav efavVar) throws efao {
        b();
        try {
            SparseArray sparseArray = this.j;
            synchronized (sparseArray) {
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    if (((efat) sparseArray.valueAt(i)).b().contains(efavVar)) {
                        arrayList.add(Integer.valueOf(iKeyAt));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unsubscribe(((Integer) it.next()).intValue(), efavVar);
                }
            }
        } catch (Exception e) {
            throw new efao(e.getMessage(), e);
        }
    }
}
