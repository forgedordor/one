package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjl extends Thread {
    private static final dhip b = new dhip("MsrpReceiver");
    public boolean a = false;
    private final InputStream c;
    private final ebjx d;
    private final PowerManager.WakeLock e;

    public ebjl(Context context, ebjx ebjxVar, InputStream inputStream) {
        this.d = ebjxVar;
        this.c = inputStream;
        this.e = dhkk.a(context).newWakeLock(1, "CarrierServices:MsrpReceiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ebjr, ebjx] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ebjr, ebjx] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws EOFException {
        ebjw ebjwVarA;
        String strB;
        PowerManager.WakeLock wakeLock;
        try {
            dhja.c("Receiver is started", new Object[0]);
            while (!this.a) {
                try {
                    if (((Boolean) dfbu.g.a()).booleanValue() && dfoq.o()) {
                        ebeo ebeoVar = new ebeo(this.c);
                        ebjwVarA = ebjk.a(ebeoVar);
                        if (ebjwVarA != null) {
                            dhja.d(b, "MSRP message: %s", new String(ebeoVar.a.array()));
                        }
                    } else {
                        ebjwVarA = ebjk.a(this.c);
                    }
                } catch (SocketTimeoutException unused) {
                    dhja.c("Socket read timeout due to inactivity", new Object[0]);
                }
                if (ebjwVarA == null) {
                    throw new EOFException();
                }
                ?? r6 = this.d;
                if (r6 != 0) {
                    if (dfpo.o() > 0 && (wakeLock = this.e) != null) {
                        wakeLock.acquire(dfpo.o());
                    }
                    if (ebjwVarA instanceof ebjm) {
                        ebjm ebjmVar = (ebjm) ebjwVarA;
                        dhip dhipVar = ((ebjv) r6).f;
                        dhja.d(dhipVar, "New request transaction (id=%s)", ebjmVar.d);
                        String strA = ebjmVar.a();
                        if (strA == null) {
                            dhja.r(dhipVar, "Received a MSRP request with null message ID. Ignoring", new Object[0]);
                        } else {
                            dhja.w(18, 3, "MSRP request received ", new Object[0]);
                            HashMap map = ((ebjv) r6).g;
                            ebjj ebjjVar = (ebjj) map.get(ebjmVar.a());
                            if (ebjjVar == null) {
                                ebjjVar = new ebjj(ebjmVar.c);
                                map.put(strA, ebjjVar);
                                dhja.d(dhipVar, "Created new msrp message with message ID: %s", ebjjVar.b());
                                if (ebjmVar.e(ffho.a) != null) {
                                    ekqh it = ((ekgb) ((ebjv) r6).d).iterator();
                                    while (it.hasNext()) {
                                        ((ebjc) it.next()).aL(ebjjVar);
                                    }
                                }
                            }
                            try {
                                try {
                                    try {
                                        ebjjVar.l.a(ebjmVar.a.e());
                                        int i = ebjmVar.b;
                                        String strE = ebjmVar.e("Failure-Report");
                                        int i2 = i - 1;
                                        if (i2 == 1) {
                                            if (strE == null || "yes".equals(strE)) {
                                                ((ebjv) r6).e(ebjn.a(ebjmVar, BasePaymentResult.ERROR_REQUEST_FAILED, "OK"), ebjmVar);
                                            }
                                            int i3 = ebjmVar.e;
                                            if (i3 == 36) {
                                                map.remove(ebjmVar.a());
                                                dhja.c("Timestamp for LAST_CHUNK_RECEIVED: %d", dhkl.a());
                                                dhja.w(17, 3, "complete request received (messageid=%s, data size=%d", ebjjVar.b(), Long.valueOf(ebjjVar.e));
                                                if (!((Boolean) dfoq.c().a.d.a()).booleanValue() || (strB = ebjjVar.b()) == null || ((ebjv) r6).i.add(strB)) {
                                                    boolean zEquals = "yes".equals(ebjjVar.i);
                                                    if (ebjjVar.h != null) {
                                                        byte[] bArrE = ebjjVar.l.e();
                                                        ebjjVar.l.d();
                                                        if (bArrE != null) {
                                                            ebjjVar.b = evqs.x(bArrE);
                                                        }
                                                        ebjjVar.e = bArrE != null ? bArrE.length : 0L;
                                                        ekqh it2 = ((ekgb) ((ebjv) r6).d).iterator();
                                                        while (it2.hasNext()) {
                                                            ((ebjc) it2.next()).aM(r6, ebjjVar);
                                                        }
                                                        if (dzfj.i() && dfoi.d()) {
                                                            dzfj.a().e(new dzfh("msrpMessageReceived"));
                                                        }
                                                    }
                                                    if (zEquals) {
                                                        try {
                                                            ebjj ebjjVar2 = new ebjj();
                                                            ebjjVar2.r = 3;
                                                            ebjjVar2.s = 1;
                                                            ebjjVar2.f = ebjjVar.e;
                                                            ebit ebitVar = new ebit();
                                                            String strA2 = ebjjVar.a();
                                                            strA2.getClass();
                                                            ebitVar.b("To-Path", strA2);
                                                            String strD = ebjjVar.d();
                                                            strD.getClass();
                                                            ebitVar.b("From-Path", strD);
                                                            String strB2 = ebjjVar.b();
                                                            strB2.getClass();
                                                            ebitVar.b("Message-ID", strB2);
                                                            ebjjVar2.g = ebitVar;
                                                            ebjjVar2.p = BasePaymentResult.ERROR_REQUEST_FAILED;
                                                            ((ebjv) r6).c(ebjjVar2, false);
                                                        } catch (IOException e) {
                                                            dhja.j(e, ((ebjv) r6).f, "Error while sending success report: %s", e.getMessage());
                                                        }
                                                    }
                                                } else {
                                                    dhja.l(((ebjv) r6).f, "Discarding received MSRP message duplicate with ID: %s", strB);
                                                }
                                            } else if (i3 == 35) {
                                                ((ebjv) r6).g.remove(ebjmVar.a());
                                                dhja.d(((ebjv) r6).f, "Aborted request received. Message ID: %s. Data size: %s", ebjjVar.b(), Long.valueOf(ebjjVar.e));
                                                ebis ebisVar = ebjjVar.l;
                                                if (ebisVar != null) {
                                                    try {
                                                        ebisVar.c();
                                                        ebjjVar.l.b();
                                                    } catch (IOException e2) {
                                                        dhja.j(e2, ebjj.a, "Error while closing message: %s", e2.getMessage());
                                                    }
                                                }
                                                ebjjVar.l.d();
                                                try {
                                                    ebjjVar.l.b();
                                                } catch (IOException e3) {
                                                    dhja.j(e3, ((ebjv) r6).f, "Error while closing chunk cache", new Object[0]);
                                                }
                                                ((ebjv) r6).d(ebjjVar);
                                            } else if (i3 == 43) {
                                                dhja.d(((ebjv) r6).f, "More chunks are coming - expecting next transaction", new Object[0]);
                                            }
                                        } else if (i2 != 2) {
                                            dhja.h(dhipVar, "receiveMsrpRequest: UNKNOWN method", new Object[0]);
                                            ((ebjv) r6).e(ebjn.a(ebjmVar, 501, "MIME-not-understood"), ebjmVar);
                                        } else {
                                            dhja.d(dhipVar, "REPORT request received", new Object[0]);
                                            ekqh it3 = ((ekgb) ((ebjv) r6).d).iterator();
                                            while (it3.hasNext()) {
                                                ((ebjc) it3.next()).bk(ebjmVar);
                                            }
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        dhja.j(e, ((ebjv) r6).f, "Error while processing request: %s", e.getMessage());
                                        ((ebjv) r6).f(ebjjVar, 1);
                                    }
                                } finally {
                                    ebjmVar.b();
                                }
                            } catch (ebjd e5) {
                                e = e5;
                                dhja.j(e, ((ebjv) r6).f, "Error while processing request: %s", e.getMessage());
                                ((ebjv) r6).f(ebjjVar, 1);
                            }
                        }
                    } else {
                        ?? r62 = this.d;
                        ebjn ebjnVar = (ebjn) ebjwVarA;
                        dhip dhipVar2 = ((ebjv) r62).f;
                        String str = ebjnVar.d;
                        dhja.d(dhipVar2, "New response transaction (id=%s)", str);
                        if (((ebjv) r62).h.isEmpty()) {
                            dhja.r(dhipVar2, "No pending transaction found for response: %s", str);
                        } else {
                            int i4 = ebjnVar.a;
                            Integer numValueOf = Integer.valueOf(i4);
                            dhja.w(19, 3, "Received MSRP response %d", numValueOf);
                            if (str.equals(((ebjo) ((ebjv) r62).h.get()).a())) {
                                ((ebjo) ((ebjv) r62).h.get()).b = ebjnVar;
                                if (i4 == 200) {
                                    dhja.c("Timestamp for MSRP_OK_RESPONSE: %d", dhkl.a());
                                } else if (i4 != 413) {
                                    dhja.d(dhipVar2, "Received %d response", numValueOf);
                                } else {
                                    dhja.d(dhipVar2, "Received 413 response - stop sending message", new Object[0]);
                                }
                            } else {
                                dhja.r(dhipVar2, "Received a response but there is no pending transactions associated with the ID: %s", str);
                            }
                        }
                        ebjj ebjjVar3 = (ebjj) ((ebjv) r62).h.map(new Function() { // from class: ebjt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((ebjo) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(null);
                        ekqh it4 = ((ekgb) ((ebjv) r62).d).iterator();
                        while (it4.hasNext()) {
                            ((ebjc) it4.next()).aQ(r62, ebjnVar, ebjjVar3);
                        }
                        ((ebjv) r62).h.ifPresent(new ebju());
                    }
                }
            }
        } catch (Exception e6) {
            if (this.a) {
                dhja.c("MSRP receiver thread terminated", new Object[0]);
                return;
            }
            dhja.i(e6, "MSRP receiver has failed", new Object[0]);
            this.a = true;
            ebjx ebjxVar = this.d;
            if (ebjxVar != null) {
                String strValueOf = String.valueOf(e6.getMessage());
                ebjd ebjdVar = new ebjd(e6);
                if (ebjdVar.getCause() == null || ebjdVar.getCause().getClass() != EOFException.class) {
                    ebjv ebjvVar = (ebjv) ebjxVar;
                    dhja.h(ebjvVar.f, "Generic transfer error:[%s] on message:[%s]", ebjdVar.getMessage(), "MSRP receiver has failed : ".concat(strValueOf));
                    ebjvVar.f(null, 1);
                } else {
                    ebjv ebjvVar2 = (ebjv) ebjxVar;
                    dhja.r(ebjvVar2.f, "MSRP socket is closed by the server.", new Object[0]);
                    ebjvVar2.f(null, 4);
                }
            }
        }
    }
}
