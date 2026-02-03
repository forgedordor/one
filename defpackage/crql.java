package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crql {
    public final fcsu a;
    public final eygg b;
    public final eosc c;
    public final fcsu d;

    public crql(fcsu fcsuVar, eygg eyggVar, eosc eoscVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = eyggVar;
        this.c = eoscVar;
        this.d = fcsuVar2;
    }

    public static String b(ezbd ezbdVar) {
        ezev ezevVar = ezbdVar.c;
        if (ezevVar == null) {
            ezevVar = ezev.a;
        }
        ejwc ejwcVar = new ejwc(",");
        return new ejvz(ejwcVar, ejwcVar).f(new String[]{ejwk.a(ezevVar.b), ejwk.a(ezevVar.c), ejwk.a(ezevVar.d), ejwk.a(ezevVar.e), ejwk.a(ezevVar.f), ejwk.a(ezevVar.g), ejwk.a(ezevVar.h)});
    }

    public static boolean c(ezev ezevVar) {
        return (ezevVar.b.isEmpty() || TextUtils.isEmpty(ezevVar.f)) ? false : true;
    }

    public final eiju a(String str) {
        crqd crqdVar = (crqd) this.d.b();
        eiju eijuVarG = eiju.g(drgi.a(((eavo) crqdVar.d.b()).c(eavr.s(str, crqdVar.b).f())));
        eooz eoozVar = new eooz() { // from class: crpy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eijx.e(ekgb.n(((eavt) obj).a()));
            }
        };
        eosc eoscVar = crqdVar.c;
        return eijuVarG.i(eoozVar, eoscVar).e(Throwable.class, new ejvr() { // from class: crpz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) crqd.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "search", 'H', "PlacesMessagingClient.java")).q("Failed to get places from search by text request.");
                int i = ekgb.d;
                return ekoe.a;
            }
        }, eoscVar).i(new eooz() { // from class: crqf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                return ekgbVar.isEmpty() ? eijx.e(Optional.empty()) : eijx.e(Optional.of((eatj) ekgbVar.get(0)));
            }
        }, this.c);
    }
}
