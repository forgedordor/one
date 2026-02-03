package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarm implements egyi {
    public final eosc a;
    public final cogw b;
    public final Map c;
    public final Bundle d;
    public final AtomicReference e = new AtomicReference(egyh.a);
    private final eosc f;

    public aarm(eosc eoscVar, eosc eoscVar2, cogw cogwVar, Map map, Bundle bundle) {
        this.a = eoscVar;
        this.f = eoscVar2;
        this.b = cogwVar;
        this.c = map;
        this.d = bundle;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eieu eieuVarK = eiiy.k("MessageDataSource#DonationDataSource#LoadData");
        try {
            eopy eopyVar = new eopy(eijx.e((egyh) this.e.get()));
            eieuVarK.a(eopyVar);
            eieuVarK.close();
            return eopyVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        eieu eieuVarK = eiiy.k("MessageDataSource#DonationDataSource#FetchAndStoreData");
        try {
            eieu eieuVarK2 = eiiy.k("DataDonationSource#getDonatableMessages");
            try {
                eiju eijuVarH = eijx.h(new eooy() { // from class: aarl
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        aarm aarmVar = this.a;
                        Bundle bundle = aarmVar.d;
                        String string = bundle.getString("EXTRA_COLLECTOR_KEY");
                        ejwl.a(!TextUtils.isEmpty(string));
                        aari aariVar = (aari) aarmVar.c.get(string);
                        aariVar.getClass();
                        return aariVar.a(bundle).h(new ejvr() { // from class: aarj
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ekgb ekgbVar = (ekgb) obj;
                                int i = ekgb.d;
                                ekfw ekfwVar = new ekfw();
                                int size = ekgbVar.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    ekfwVar.h(new aauu((aarh) ekgbVar.get(i2)));
                                }
                                return ekgb.D(ekfwVar.g());
                            }
                        }, aarmVar.a);
                    }
                }, this.a);
                eieuVarK2.b(eijuVarH);
                eieuVarK2.close();
                eiju eijuVarH2 = eijuVarH.h(new ejvr() { // from class: aark
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        if (obj != null) {
                            aarm aarmVar = this.a;
                            aarmVar.e.set(egyh.a(obj, aarmVar.b.f()));
                        }
                        return obj;
                    }
                }, this.f);
                eieuVarK.b(eijuVarH2);
                eieuVarK.close();
                return eijuVarH2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egyi
    public final /* synthetic */ Object c() {
        return "DD_DATASOURCE_KEY";
    }
}
