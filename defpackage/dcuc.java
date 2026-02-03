package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityService;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.DuoKitContainerActivity;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.GenerateInviteLinkResponse;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.SetupDuoResponse;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartCallResponse;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcuc implements dcsx {
    public final ejxr a;
    private final dctm b;
    private final Context c;
    private final ejxr d;
    private final ejxr e;
    private final ejxr f;

    public dcuc(final Context context, final ejwi ejwiVar) {
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: dctx
            @Override // defpackage.ejxr
            public final Object get() {
                return ((ejwt) ejwiVar).a;
            }
        });
        this.d = ejxrVarA;
        this.b = new dctm(context, ejxrVarA);
        this.a = ejxx.a(new ejxr() { // from class: dcty
            @Override // defpackage.ejxr
            public final Object get() {
                return dcsz.a(context);
            }
        });
        this.c = context;
        ejxx.a(new ejxr() { // from class: dctz
            @Override // defpackage.ejxr
            public final Object get() {
                return new dcue(context);
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: dcua
            @Override // defpackage.ejxr
            public final Object get() {
                return new dcul(context, (dcsz) this.a.a.get());
            }
        });
        this.f = ejxx.a(new ejxr() { // from class: dcub
            @Override // defpackage.ejxr
            public final Object get() {
                return new dctt(context, (dcsz) this.a.a.get());
            }
        });
        int i = dctb.a;
        ejxx.a(new dcta(context));
    }

    @Override // defpackage.dcsx
    public final defn a(final GenerateInviteLinkRequest generateInviteLinkRequest) {
        String str;
        ((dcsz) this.a.get()).g(15, ejwi.i(generateInviteLinkRequest.b));
        final dctt dcttVar = (dctt) this.f.get();
        defn defnVarA = this.b.a();
        DuoId duoId = generateInviteLinkRequest.a;
        if (duoId == null || (str = duoId.b) == null || str.length() == 0) {
            dcttVar.b.c(false);
            return degc.c(new GenerateInviteLinkResponse());
        }
        defnVarA.t(new defe() { // from class: dctp
            @Override // defpackage.defe
            public final void d(Exception exc) {
                dcttVar.b.f(15);
            }
        });
        return defnVarA.f(new defm() { // from class: dctq
            @Override // defpackage.defm
            public final defn a(Object obj) {
                final dctd dctdVar = (dctd) obj;
                boolean zB = dctdVar.b();
                final dctt dcttVar2 = dcttVar;
                if (!zB) {
                    dcttVar2.b.f(15);
                    return degc.b(new IllegalStateException("Neither Duo nor Meet API provider is available"));
                }
                final GenerateInviteLinkRequest generateInviteLinkRequest2 = generateInviteLinkRequest;
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: dctr
                    @Override // defpackage.dcir
                    public final void a(Object obj2, Object obj3) {
                        IBinder iBinderB = ((dcih) obj2).b();
                        dclh.m(iBinderB);
                        ((defr) obj3).b(IReachabilityService.Stub.asInterface(iBinderB));
                    }
                };
                dcizVar.c = 12302;
                defn defnVarJ = dcttVar2.j(dcizVar.a());
                defnVarJ.t(new defe() { // from class: dctn
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        dcttVar2.b.f(15);
                    }
                });
                return defnVarJ.f(new defm() { // from class: dcto
                    @Override // defpackage.defm
                    public final defn a(Object obj2) {
                        IReachabilityService iReachabilityService = (IReachabilityService) obj2;
                        defr defrVar = new defr();
                        dctt dcttVar3 = dcttVar2;
                        GenerateInviteLinkRequest generateInviteLinkRequest3 = generateInviteLinkRequest2;
                        boolean zC = dctdVar.c();
                        try {
                            if (zC) {
                                iReachabilityService.generateMeetingInviteLink(ekgb.r(generateInviteLinkRequest3.a.b), new dcts(dcttVar3, defrVar, true));
                            } else {
                                iReachabilityService.generateInviteLink(ekgb.r(generateInviteLinkRequest3.a.b), new dcts(dcttVar3, defrVar, false));
                            }
                        } catch (RemoteException unused) {
                            dcttVar3.b.f(true != zC ? 15 : 16);
                            defrVar.a(new IllegalStateException("Failed to query Meet reachability service"));
                        }
                        return defrVar.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.dcsx
    public final defn b(final LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest) {
        String str;
        ((dcsz) this.a.get()).g(14, ejwi.i(lookupSingleRemoteReachabilityRequest.b));
        final dcul dculVar = (dcul) this.e.get();
        defn defnVarA = this.b.a();
        DuoId duoId = lookupSingleRemoteReachabilityRequest.a;
        if (duoId == null || (str = duoId.b) == null || str.isEmpty()) {
            dculVar.a.d(eyak.a);
            return degc.c(new LookupSingleRemoteReachabilityResponse());
        }
        defnVarA.t(new defe() { // from class: dcui
            @Override // defpackage.defe
            public final void d(Exception exc) {
                dculVar.a.f(14);
            }
        });
        return defnVarA.f(new defm() { // from class: dcuj
            @Override // defpackage.defm
            public final defn a(Object obj) {
                boolean zB = ((dctd) obj).b();
                final dcul dculVar2 = dculVar;
                if (!zB) {
                    dculVar2.a.f(14);
                    return degc.b(new IllegalStateException("API provider not available"));
                }
                final LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest2 = lookupSingleRemoteReachabilityRequest;
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: dcuf
                    @Override // defpackage.dcir
                    public final void a(Object obj2, Object obj3) {
                        IBinder iBinderB = ((dcih) obj2).b();
                        dclh.m(iBinderB);
                        ((defr) obj3).b(IReachabilityService.Stub.asInterface(iBinderB));
                    }
                };
                dcizVar.c = 12302;
                defn defnVarJ = dculVar2.j(dcizVar.a());
                defnVarJ.t(new defe() { // from class: dcug
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        dculVar2.a.f(14);
                    }
                });
                return defnVarJ.f(new defm() { // from class: dcuh
                    @Override // defpackage.defm
                    public final defn a(Object obj2) {
                        IReachabilityService iReachabilityService = (IReachabilityService) obj2;
                        defr defrVar = new defr();
                        dcul dculVar3 = dculVar2;
                        LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest3 = lookupSingleRemoteReachabilityRequest2;
                        try {
                            iReachabilityService.queryReachabilityNoCache(ekgb.r(lookupSingleRemoteReachabilityRequest3.a.b), new dcuk(dculVar3, lookupSingleRemoteReachabilityRequest3, defrVar));
                        } catch (RemoteException unused) {
                            dculVar3.a.f(14);
                            defrVar.a(new IllegalStateException("Failed to query Duo reachability service"));
                        }
                        return defrVar.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.dcsx
    public final defn c(final SetupDuoRequest setupDuoRequest) {
        ejxr ejxrVar = this.a;
        ((dcsz) ejxrVar.get()).g(7, ejud.a);
        final dcsz dcszVar = (dcsz) ejxrVar.get();
        defn defnVarA = this.b.a();
        final defr defrVar = new defr();
        final SetupDuoResponse setupDuoResponse = new SetupDuoResponse();
        final Context context = this.c;
        defnVarA.a(new defh() { // from class: dcup
            @Override // defpackage.defh
            public final void e(Object obj) throws PackageManager.NameNotFoundException {
                dctd dctdVar = (dctd) obj;
                boolean zB = dctdVar.b();
                Context context2 = context;
                dcsz dcszVar2 = dcszVar;
                if (zB) {
                    DuoKitContainerActivity.a(context2, false, new ArrayList());
                    dcszVar2.i(6);
                } else if (dctdVar.a() == 2) {
                    SetupDuoRequest setupDuoRequest2 = setupDuoRequest;
                    ArrayList arrayList = new ArrayList();
                    if (setupDuoRequest2.a != null) {
                        ekhv ekhvVar = new ekhv();
                        for (DuoId duoId : setupDuoRequest2.a) {
                            if (duoId.a == 1) {
                                ekhvVar.c(duoId.b);
                            }
                        }
                        arrayList.addAll(ekhvVar.g());
                    }
                    DuoKitContainerActivity.a(context2, true, arrayList);
                    dcszVar2.i(3);
                } else {
                    dcur.b(context2, dcszVar2, ejud.a);
                }
                defrVar.b(setupDuoResponse);
            }
        });
        defnVarA.t(new defe() { // from class: dcuq
            @Override // defpackage.defe
            public final void d(Exception exc) throws PackageManager.NameNotFoundException {
                dcur.b(context, dcszVar, ejud.a);
                defrVar.b(setupDuoResponse);
            }
        });
        return defrVar.a;
    }

    @Override // defpackage.dcsx
    public final defn d(final StartCallRequest startCallRequest) {
        ejxr ejxrVar = this.a;
        ((dcsz) ejxrVar.get()).g(5, ejwi.i(startCallRequest.d));
        final dcsz dcszVar = (dcsz) ejxrVar.get();
        defn defnVarA = this.b.a();
        final defr defrVar = new defr();
        final Context context = this.c;
        defnVarA.a(new defh() { // from class: dcuu
            @Override // defpackage.defh
            public final void e(Object obj) throws PackageManager.NameNotFoundException, dcsy {
                defr defrVar2 = defrVar;
                StartCallRequest startCallRequest2 = startCallRequest;
                dctd dctdVar = (dctd) obj;
                try {
                    StartCallResponse startCallResponse = new StartCallResponse();
                    DuoId duoId = startCallRequest2.a;
                    int i = duoId.a;
                    dcsz dcszVar2 = dcszVar;
                    if (i != 1) {
                        Log.w("DuoKitStartCall", "Only call to phone numbers is supported");
                        dcszVar2.f(5);
                        throw new dcsy("Only phone number calling is supported.");
                    }
                    int i2 = startCallRequest2.b;
                    boolean z = i2 == 1;
                    ejwi ejwiVarJ = TextUtils.isEmpty(startCallRequest2.d) ? ejud.a : ejwi.j(startCallRequest2.d);
                    boolean zB = dctdVar.b();
                    Context context2 = context;
                    if (zB) {
                        Intent intentAddFlags = new Intent("com.google.android.gms.duokit.action.DUO_CALL").setData(Uri.parse(String.format("%s:%s", "tel", duoId.b))).setClassName(context2, DuoKitContainerActivity.class.getName()).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", z).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        if (ejwiVarJ.g()) {
                            intentAddFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) ejwiVarJ.c());
                        }
                        context2.startActivity(intentAddFlags);
                        exzz exzzVar = (exzz) eyaa.a.createBuilder();
                        int i3 = i2 == 1 ? 5 : 4;
                        exzzVar.copyOnWrite();
                        ((eyaa) exzzVar.instance).b = i3 - 2;
                        eyaa eyaaVar = (eyaa) exzzVar.build();
                        exzy exzyVar = (exzy) eyap.a.createBuilder();
                        exzyVar.copyOnWrite();
                        ((eyap) exzyVar.instance).d = felj.a(5);
                        String str = dcszVar2.a;
                        exzyVar.copyOnWrite();
                        eyap eyapVar = (eyap) exzyVar.instance;
                        str.getClass();
                        eyapVar.e = str;
                        exzyVar.copyOnWrite();
                        ((eyap) exzyVar.instance).f = feli.a(4);
                        exzyVar.copyOnWrite();
                        eyap eyapVar2 = (eyap) exzyVar.instance;
                        eyaaVar.getClass();
                        eyapVar2.c = eyaaVar;
                        eyapVar2.b = 3;
                        dcszVar2.b((eyap) exzyVar.build());
                    } else {
                        if (!startCallRequest2.c || dctc.a(context2)) {
                            Log.w("DuoKitStartCall", "Duo installed but can't handle the API");
                            dcszVar2.f(5);
                            throw new dcsy("Failed to handle the API call");
                        }
                        dcszVar2.e(5, 7);
                        dcur.b(context2, dcszVar2, ejwiVarJ);
                    }
                    defrVar2.b(startCallResponse);
                } catch (dcsy e) {
                    defrVar2.a(e);
                }
            }
        });
        defnVarA.t(new defe() { // from class: dcuv
            @Override // defpackage.defe
            public final void d(Exception exc) {
                dcszVar.f(5);
                defrVar.a(new IllegalStateException("Failed to get Duo state."));
            }
        });
        return defrVar.a;
    }

    @Override // defpackage.dcsx
    public final defn e(final StartGroupCreationFlowRequest startGroupCreationFlowRequest) {
        ejxr ejxrVar = this.a;
        ((dcsz) ejxrVar.get()).g(12, ejwi.i(startGroupCreationFlowRequest.b));
        final dcsz dcszVar = (dcsz) ejxrVar.get();
        defn defnVarA = this.b.a();
        final defr defrVar = new defr();
        final Context context = this.c;
        defnVarA.a(new defh() { // from class: dcuy
            @Override // defpackage.defh
            public final void e(Object obj) throws PackageManager.NameNotFoundException, dcsy {
                ekhx ekhxVarG;
                defr defrVar2 = defrVar;
                StartGroupCreationFlowRequest startGroupCreationFlowRequest2 = startGroupCreationFlowRequest;
                dctd dctdVar = (dctd) obj;
                try {
                    StartGroupCreationFlowResponse startGroupCreationFlowResponse = new StartGroupCreationFlowResponse();
                    boolean z = false;
                    if (startGroupCreationFlowRequest2.a == null) {
                        ekhxVarG = ekon.a;
                    } else {
                        ekhv ekhvVar = new ekhv();
                        for (DuoId duoId : startGroupCreationFlowRequest2.a) {
                            int i = duoId.a;
                            if (i == 1) {
                                ekhvVar.c(duoId.b);
                            } else {
                                Log.w("DuoKitStrtGrpCrtnFlw", a.g(i, "Ignoring id type: "));
                            }
                        }
                        ekhxVarG = ekhvVar.g();
                    }
                    ejwi ejwiVarJ = TextUtils.isEmpty(startGroupCreationFlowRequest2.b) ? ejud.a : ejwi.j(startGroupCreationFlowRequest2.b);
                    boolean zB = dctdVar.b();
                    dcsz dcszVar2 = dcszVar;
                    Context context2 = context;
                    if (zB) {
                        if (new Intent("com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS").setPackage("com.google.android.apps.tachyon").resolveActivity(context2.getPackageManager()) != null) {
                            Intent intentAddFlags = new Intent("com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW").setClassName(context2, DuoKitContainerActivity.class.getName()).putStringArrayListExtra("members", new ArrayList<>(ekhxVarG)).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (ejwiVarJ.g()) {
                                intentAddFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) ejwiVarJ.c());
                            }
                            context2.startActivity(intentAddFlags);
                            z = true;
                        } else {
                            Log.w("DuoKitContainerActivity", "Duo can't handle group flow intent, fallback to Duo home screen");
                            Intent intentAddFlags2 = new Intent("com.google.android.gms.duokit.action.LAUNCH_DUO").setClassName(context2, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            if (ejwiVarJ.g()) {
                                intentAddFlags2.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) ejwiVarJ.c());
                            }
                            context2.startActivity(intentAddFlags2);
                        }
                        eyaf eyafVar = (eyaf) eyag.a.createBuilder();
                        int size = ekhxVarG.size();
                        eyafVar.copyOnWrite();
                        ((eyag) eyafVar.instance).b = size;
                        int i2 = true != z ? 4 : 3;
                        eyafVar.copyOnWrite();
                        ((eyag) eyafVar.instance).c = i2 - 2;
                        eyag eyagVar = (eyag) eyafVar.build();
                        exzy exzyVar = (exzy) eyap.a.createBuilder();
                        exzyVar.copyOnWrite();
                        ((eyap) exzyVar.instance).d = felj.a(12);
                        String str = dcszVar2.a;
                        exzyVar.copyOnWrite();
                        eyap eyapVar = (eyap) exzyVar.instance;
                        str.getClass();
                        eyapVar.e = str;
                        exzyVar.copyOnWrite();
                        ((eyap) exzyVar.instance).f = feli.a(4);
                        exzyVar.copyOnWrite();
                        eyap eyapVar2 = (eyap) exzyVar.instance;
                        eyagVar.getClass();
                        eyapVar2.c = eyagVar;
                        eyapVar2.b = 12;
                        dcszVar2.b((eyap) exzyVar.build());
                    } else {
                        if (dctc.a(context2) || !startGroupCreationFlowRequest2.c) {
                            Log.w("DuoKitStrtGrpCrtnFlw", "Duo installed but can't handle the API");
                            dcszVar2.f(12);
                            throw new dcsy("Failed to handle the API call");
                        }
                        eyaf eyafVar2 = (eyaf) eyag.a.createBuilder();
                        int size2 = ekhxVarG.size();
                        eyafVar2.copyOnWrite();
                        ((eyag) eyafVar2.instance).b = size2;
                        eyag eyagVar2 = (eyag) eyafVar2.build();
                        exzy exzyVar2 = (exzy) eyap.a.createBuilder();
                        exzyVar2.copyOnWrite();
                        ((eyap) exzyVar2.instance).d = felj.a(12);
                        String str2 = dcszVar2.a;
                        exzyVar2.copyOnWrite();
                        eyap eyapVar3 = (eyap) exzyVar2.instance;
                        str2.getClass();
                        eyapVar3.e = str2;
                        exzyVar2.copyOnWrite();
                        ((eyap) exzyVar2.instance).f = feli.a(7);
                        exzyVar2.copyOnWrite();
                        eyap eyapVar4 = (eyap) exzyVar2.instance;
                        eyagVar2.getClass();
                        eyapVar4.c = eyagVar2;
                        eyapVar4.b = 12;
                        dcszVar2.b((eyap) exzyVar2.build());
                        dcur.b(context2, dcszVar2, ejwiVarJ);
                    }
                    defrVar2.b(startGroupCreationFlowResponse);
                } catch (dcsy e) {
                    defrVar2.a(e);
                }
            }
        });
        defnVarA.t(new defe() { // from class: dcuz
            @Override // defpackage.defe
            public final void d(Exception exc) {
                dcszVar.f(12);
                defrVar.a(new IllegalStateException("Failed to get Duo state."));
            }
        });
        return defrVar.a;
    }

    @Override // defpackage.dcsx
    public final defn f() {
        ejxr ejxrVar = this.a;
        ((dcsz) ejxrVar.get()).g(8, ejud.a);
        final dcsz dcszVar = (dcsz) ejxrVar.get();
        defn defnVarA = this.b.a();
        int i = dcsq.b;
        final defr defrVar = new defr();
        final Context context = this.c;
        defnVarA.a(new defh() { // from class: dcso
            @Override // defpackage.defh
            public final void e(Object obj) {
                dctd dctdVar = (dctd) obj;
                int i2 = dcsq.b;
                Intent flags = new Intent("com.google.android.apps.tachyon.intent.INSTALL").setPackage("com.google.android.apps.tachyon").setFlags(32);
                AtomicBoolean atomicBoolean = dcsq.a;
                if (!atomicBoolean.get()) {
                    Context context2 = context;
                    if (Build.VERSION.SDK_INT < 34) {
                        context2.sendBroadcast(flags);
                    } else {
                        context2.sendBroadcast(flags, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                    atomicBoolean.compareAndSet(false, true);
                }
                int iA = dctdVar.a();
                dcszVar.h(iA != 1 ? iA != 2 ? iA != 3 ? 7 : 5 : 4 : 3);
                GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
                int iA2 = dctdVar.b() ? 3 : dctdVar.a();
                defr defrVar2 = defrVar;
                getApiAvailabilityResponse.a = iA2;
                defrVar2.b(getApiAvailabilityResponse);
            }
        });
        defnVarA.t(new defe() { // from class: dcsp
            @Override // defpackage.defe
            public final void d(Exception exc) {
                int i2 = dcsq.b;
                dcszVar.h(3);
                GetApiAvailabilityResponse getApiAvailabilityResponse = new GetApiAvailabilityResponse();
                getApiAvailabilityResponse.a = 1;
                defrVar.b(getApiAvailabilityResponse);
            }
        });
        return defrVar.a;
    }
}
