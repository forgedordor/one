package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.internal.AbstractKidsCallbacks;
import com.google.android.gms.kids.internal.IParentalControlsListener;
import com.google.android.gms.kids.internal.IParentalControlsService;
import com.google.android.gms.kids.internal.InternalParentalControlsClient;
import defpackage.dcfa;
import defpackage.dcfd;
import defpackage.dcfe;
import defpackage.dcfl;
import defpackage.dcfm;
import defpackage.dcjb;
import defpackage.dckv;
import defpackage.ddhu;
import defpackage.ddhv;
import defpackage.ddip;
import defpackage.ddiq;
import defpackage.deeq;
import defpackage.defm;
import defpackage.defn;
import defpackage.degc;
import defpackage.fcva;
import defpackage.fcvp;
import defpackage.fcwa;
import defpackage.fcwm;
import defpackage.fdae;
import defpackage.kxj;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient extends dcfm implements ddhv {
    public static final dckv a;
    private static final dcfd o;
    private static final ddip p;
    private static final dcfe q;
    public final Set b;
    public boolean m;
    public final boolean n;

    static {
        dcfd dcfdVar = new dcfd();
        o = dcfdVar;
        ddip ddipVar = new ddip();
        p = ddipVar;
        q = new dcfe("ParentalControls.API", ddipVar, dcfdVar);
        a = new dckv("ParentalControlsClient");
    }

    public InternalParentalControlsClient(Context context) {
        super(context, q, dcfa.q, dcfl.a);
        this.b = new LinkedHashSet();
        this.n = true;
        kxj.g(this.c, new ddiq(this), new IntentFilter("android.app.action.PROFILE_OWNER_CHANGED"));
    }

    @Override // defpackage.ddhv
    public final defn a(final Set set) {
        return set.isEmpty() ? degc.c(fcvp.a) : e(new fdae() { // from class: ddhz
            @Override // defpackage.fdae
            public final Object invoke() {
                dciz dcizVar = new dciz();
                dcizVar.b = new Feature[]{ddhp.a};
                dcizVar.b();
                dcizVar.c = 14106;
                final Set set2 = set;
                dcizVar.a = new dcir() { // from class: ddim
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        dckv dckvVar = InternalParentalControlsClient.a;
                        final List<Uri> listAo = fcva.ao(set2);
                        final defr defrVar = (defr) obj2;
                        ((IParentalControlsService) ((ddir) obj).w()).areAllowed(listAo, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$areAllowed$1$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onBooleanList(Status status, List<Boolean> list) {
                                status.getClass();
                                list.getClass();
                                dcjb.b(status, fcwa.k(fcva.ar(listAo, list)), defrVar);
                            }
                        });
                    }
                };
                return this.a.j(dcizVar.a());
            }
        }, new fdae() { // from class: ddih
            @Override // defpackage.fdae
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Shortcutting call to areAllowed");
                Set set2 = set;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(set2, 10)), 16));
                for (Object obj : set2) {
                    linkedHashMap.put(obj, true);
                }
                return linkedHashMap;
            }
        });
    }

    @Override // defpackage.ddhv
    public final /* synthetic */ defn b(final Uri uri) {
        return a(fcwm.b(uri)).f(new defm() { // from class: ddht
            @Override // defpackage.defm
            public final defn a(Object obj) {
                return degc.c(((Map) obj).get(uri));
            }
        });
    }

    @Override // defpackage.ddhv
    public final defn c(final ddhu ddhuVar) {
        ddhuVar.getClass();
        this.b.add(ddhuVar);
        return e(new fdae() { // from class: ddii
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1] */
            @Override // defpackage.fdae
            public final Object invoke() {
                final ddhu ddhuVar2 = ddhuVar;
                final ?? r0 = new IParentalControlsListener.Stub() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$callback$1
                    @Override // com.google.android.gms.kids.internal.IParentalControlsListener
                    public void onParentalControlsChange(boolean z, int i) {
                        ddhuVar2.a(z ? null : Integer.valueOf(i));
                    }
                };
                InternalParentalControlsClient internalParentalControlsClient = this;
                dcib dcibVarB = dcic.b(ddhuVar2, internalParentalControlsClient.i, "ParentalControlsListener");
                dcip dcipVar = new dcip();
                dcipVar.c = dcibVarB;
                dcipVar.d = new Feature[]{ddhp.a};
                dcipVar.b();
                dcipVar.e = 14107;
                dcipVar.a = new dcir() { // from class: ddia
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        dckv dckvVar = InternalParentalControlsClient.a;
                        final defr defrVar = (defr) obj2;
                        ((IParentalControlsService) ((ddir) obj).w()).registerParentalControlsListener(r0, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onStatus(Status status) {
                                status.getClass();
                                dcjb.a(status, defrVar);
                            }
                        });
                    }
                };
                dcipVar.b = new dcir() { // from class: ddib
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        dckv dckvVar = InternalParentalControlsClient.a;
                        final defr defrVar = (defr) obj2;
                        ((IParentalControlsService) ((ddir) obj).w()).unregisterParentalControlsListener(r0, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$2$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onBoolean(Status status, boolean z) {
                                status.getClass();
                                onStatus(status);
                            }

                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onStatus(Status status) {
                                status.getClass();
                                dcjb.b(status, true, defrVar);
                            }
                        });
                    }
                };
                return internalParentalControlsClient.k(dcipVar.a());
            }
        }, new fdae() { // from class: ddij
            @Override // defpackage.fdae
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Ignoring call to register listener");
                ddhuVar.a(null);
                return null;
            }
        });
    }

    @Override // defpackage.ddhv
    public final defn d(final TrustedContactsRequest trustedContactsRequest) {
        return e(new fdae() { // from class: ddic
            @Override // defpackage.fdae
            public final Object invoke() {
                dciz dcizVar = new dciz();
                dcizVar.b = new Feature[]{ddhp.a};
                dcizVar.b();
                dcizVar.c = 14110;
                final TrustedContactsRequest trustedContactsRequest2 = trustedContactsRequest;
                dcizVar.a = new dcir() { // from class: ddio
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        dckv dckvVar = InternalParentalControlsClient.a;
                        final defr defrVar = (defr) obj2;
                        ((IParentalControlsService) ((ddir) obj).w()).requestTrustedContactsPendingIntent(trustedContactsRequest2, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$requestTrustedContactsPendingIntent$1$1$1
                            @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                            public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                                status.getClass();
                                dcjb.b(status, pendingIntent, defrVar);
                            }
                        });
                    }
                };
                return this.a.j(dcizVar.a());
            }
        }, new fdae() { // from class: ddid
            @Override // defpackage.fdae
            public final Object invoke() {
                InternalParentalControlsClient.a.b("Shortcutting call to requestTrustedContactsPendingIntent");
                return null;
            }
        });
    }

    public final defn e(fdae fdaeVar, final fdae fdaeVar2) {
        return this.m ? degc.c(fdaeVar2.invoke()) : ((defn) fdaeVar.invoke()).b(new deeq() { // from class: ddin
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                Exception excH = defnVar.h();
                dcff dcffVar = excH instanceof dcff ? (dcff) excH : null;
                if ((dcffVar == null || dcffVar.a() != 17) && !(defnVar.h() instanceof dcgc)) {
                    return defnVar.i();
                }
                dckv dckvVar = InternalParentalControlsClient.a;
                Exception excH2 = defnVar.h();
                if (dckvVar.a(2)) {
                    Log.v("ParentalControlsClient", "Failed to connect to ParentalControlsClient. Not a child account.", excH2);
                }
                fdae fdaeVar3 = fdaeVar2;
                this.a.m = true;
                return fdaeVar3.invoke();
            }
        });
    }
}
