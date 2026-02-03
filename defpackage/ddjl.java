package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddjl extends ddjb {
    protected abstract ddjt a(Context context);

    @Override // defpackage.ddjb
    public final void b(String str, byte[] bArr, byte[] bArr2, ddkc ddkcVar) throws evtj {
        etpk etpkVar;
        evvp evvpVar;
        if (Log.isLoggable("ExampleStoreSvc", 3)) {
            Log.d("ExampleStoreSvc", "startQuery called with collection ".concat(String.valueOf(str)));
        }
        try {
            evqe evqeVar = (evqe) evsn.parseFrom(evqe.a, bArr, evrr.a());
            try {
                if (!evqeVar.b.isEmpty() && !"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(evqeVar.b)) {
                    throw new evtj(String.format("Incorrect type url: %s, expected: %s", evqeVar.b, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                }
                etpkVar = (etpk) evsn.parseFrom(etpk.a, evqeVar.c, evrr.a());
                evvpVar = etpkVar.f;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
            } catch (evtj e) {
                e = e;
            }
            try {
                if (evvpVar.b < 0) {
                    throw new evtj("Start date less than zero");
                }
                evvp evvpVar2 = etpkVar.f;
                if ((evvpVar2 == null ? evvp.a : evvpVar2).c >= 0) {
                    if ((evvpVar2 == null ? evvp.a : evvpVar2).c <= 999999999) {
                        evvp evvpVar3 = etpkVar.g;
                        if ((evvpVar3 == null ? evvp.a : evvpVar3).b < 0) {
                            throw new evtj("End date less than zero");
                        }
                        if ((evvpVar3 == null ? evvp.a : evvpVar3).c >= 0) {
                            if ((evvpVar3 == null ? evvp.a : evvpVar3).c <= 999999999) {
                                if (evvpVar3 == null) {
                                    evvpVar3 = evvp.a;
                                }
                                long j = evvpVar3.b;
                                if (evvpVar2 == null) {
                                    evvpVar2 = evvp.a;
                                }
                                if (j < evvpVar2.b) {
                                    throw new evtj("End date before start date");
                                }
                                try {
                                    evqe evqeVar2 = (evqe) evsn.parseFrom(evqe.a, bArr2, evrr.a());
                                    try {
                                        if (!evqeVar2.equals(evqe.a) && !"type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint".equals(evqeVar2.b)) {
                                            throw new evtj(String.format("Incorrect type url: %s, expected: %s", evqeVar2.b, "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"));
                                        }
                                        etph etphVar = (etph) evsn.parseFrom(etph.a, evqeVar2.c, evrr.a());
                                        if ((etphVar.b == 1 ? ((Long) etphVar.c).longValue() : 0L) >= 0) {
                                            ddjt ddjtVarA = a(this);
                                            ddjt.a(str);
                                            ddkcVar.b(new ddjo(ddjtVarA.b, str, etpkVar, etphVar, ddjtVarA.c));
                                            return;
                                        } else {
                                            try {
                                                throw new evtj("LastReturnedId less than zero");
                                            } catch (evtj e2) {
                                                e = e2;
                                                Log.w("ExampleStoreSvc", e.getMessage());
                                                ddkcVar.a(10, e.getMessage());
                                                return;
                                            }
                                        }
                                    } catch (evtj e3) {
                                        e = e3;
                                    }
                                } catch (evtj unused) {
                                    Log.w("ExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
                                    ddkcVar.a(10, "Error parsing Any proto from resumptionPoint");
                                    return;
                                }
                            }
                        }
                        throw new evtj("Invalid end date nanos");
                    }
                }
                throw new evtj("Invalid start date nanos");
            } catch (evtj e4) {
                e = e4;
                String strConcat = "Error parsing SelectionCriteria proto: ".concat(String.valueOf(e.getMessage()));
                Log.w("ExampleStoreSvc", strConcat);
                ddkcVar.a(10, strConcat);
            }
        } catch (evtj unused2) {
            Log.w("ExampleStoreSvc", "Error parsing Any proto from criteria");
            ddkcVar.a(10, "Error parsing Any proto from criteria");
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Log.isLoggable("ExampleStoreSvc", 3)) {
            Log.d("ExampleStoreSvc", "onCreate() called");
        }
    }

    @Override // defpackage.ddjb, android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("ExampleStoreSvc", 3)) {
            Log.d("ExampleStoreSvc", "onDestroy() called");
        }
        super.onDestroy();
    }
}
