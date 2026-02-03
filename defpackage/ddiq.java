package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.kids.internal.InternalParentalControlsClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddiq extends BroadcastReceiver {
    final /* synthetic */ InternalParentalControlsClient a;

    public ddiq(InternalParentalControlsClient internalParentalControlsClient) {
        this.a = internalParentalControlsClient;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final InternalParentalControlsClient internalParentalControlsClient = this.a;
        internalParentalControlsClient.m = false;
        Set set = internalParentalControlsClient.b;
        final Set<ddhu> setAv = fcva.av(set);
        dckv dckvVar = InternalParentalControlsClient.a;
        Objects.toString(setAv);
        dckvVar.b("Re-registering listeners: ".concat(setAv.toString()));
        ArrayList arrayList = new ArrayList(fcva.p(setAv, 10));
        for (final ddhu ddhuVar : setAv) {
            ddhuVar.getClass();
            set.remove(ddhuVar);
            arrayList.add(internalParentalControlsClient.e(new fdae() { // from class: ddik
                @Override // defpackage.fdae
                public final Object invoke() {
                    return degc.d(Arrays.asList(internalParentalControlsClient.l(dcic.a(ddhuVar, "ParentalControlsListener"), 14108)));
                }
            }, new fdae() { // from class: ddil
                @Override // defpackage.fdae
                public final Object invoke() {
                    InternalParentalControlsClient.a.b("Ignoring call to unregister listener");
                    return null;
                }
            }));
        }
        defn defnVarD = degc.d(arrayList).d(new deeq() { // from class: ddie
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                InternalParentalControlsClient internalParentalControlsClient2 = internalParentalControlsClient;
                if (!internalParentalControlsClient2.n) {
                    return degc.c(true);
                }
                dchp dchpVar = internalParentalControlsClient2.l;
                dchd dchdVar = new dchd(internalParentalControlsClient2.h);
                Handler handler = dchpVar.o;
                handler.sendMessage(handler.obtainMessage(14, dchdVar));
                return dchdVar.b.a;
            }
        });
        eoqg eoqgVar = eoqg.a;
        defnVarD.e(eoqgVar, new deeq() { // from class: ddif
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                Set set2 = setAv;
                ArrayList arrayList2 = new ArrayList(fcva.p(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(internalParentalControlsClient.c((ddhu) it.next()));
                }
                return degc.d(arrayList2);
            }
        }).c(eoqgVar, new deeq() { // from class: ddig
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                InternalParentalControlsClient.a.b("Re-registration completed");
                return fctx.a;
            }
        });
    }
}
