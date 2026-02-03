package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aikl implements aiwq {
    static final cczv a = cdag.f(cdag.b, "AppEventMaxRows", 300);
    public static final /* synthetic */ int c = 0;
    public final Executor b;
    private final cogw d;
    private final fcsu e;
    private bosz f;

    public aikl(eosc eoscVar, cogw cogwVar, fcsu fcsuVar) {
        this.b = new eoss(eoscVar);
        this.d = cogwVar;
        this.e = fcsuVar;
    }

    @Override // defpackage.aiwq
    public final int a() {
        if (!((Boolean) ccze.V.e()).booleanValue()) {
            return 0;
        }
        String[] strArr = bqub.a;
        bqty bqtyVar = new bqty(bqub.a);
        bqtyVar.A("AppEventLoggerImpl#cleanup-messages");
        final long jK = bqtyVar.b().k(bqub.c.c);
        String[] strArr2 = bpjz.a;
        bpjw bpjwVar = new bpjw(bpjz.a);
        bpjwVar.A("AppEventLoggerImpl#cleanup-events");
        final long jMax = Math.max(bpjwVar.b().j(bpjz.c.a) - ((Long) a.e()).longValue(), 0L);
        bpjp bpjpVar = new bpjp();
        bpjpVar.f("AppEventLoggerImpl#cleanup#events1");
        bpjpVar.a(new Function() { // from class: aikh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpjy bpjyVar = (bpjy) obj;
                int i = aikl.c;
                bpjyVar.ar(new dqxl("$V <= $V", new Object[]{bpjz.c.a, Long.valueOf(jMax)}));
                return bpjyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iD = bpjpVar.d();
        bpjp bpjpVar2 = new bpjp();
        bpjpVar2.f("AppEventLoggerImpl#cleanup#events2");
        bpjpVar2.a(new Function() { // from class: aiki
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpjy bpjyVar = (bpjy) obj;
                int i = aikl.c;
                bpjyVar.ap(new dqty("events.timestamp", 8, Long.valueOf(jK)));
                return bpjyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iD2 = iD + bpjpVar2.d();
        fcsu fcsuVar = this.e;
        ((crqv) fcsuVar.b()).j("events_cleaup_rows_deleted", iD2);
        ((crqv) fcsuVar.b()).k("message_status_cleaup_time_millis", this.d.f().toEpochMilli());
        return iD2;
    }

    @Override // defpackage.aiwq
    public final aiwv b() {
        aiwv aiwvVar = new aiwv();
        String[] strArr = bpjz.a;
        String[] strArr2 = bpjz.a;
        bpjw bpjwVar = new bpjw(strArr2);
        bpjwVar.A("AppEventLoggerImpl#getRowCount");
        bpjwVar.s();
        aiwvVar.a = bpjwVar.b().h();
        bpjw bpjwVar2 = new bpjw(strArr2);
        bpjwVar2.A("AppEventLoggerImpl#getSizeEstimate");
        bpjwVar2.s();
        bpji bpjiVar = (bpji) bpjwVar2.b().p();
        int length = 0;
        while (true) {
            try {
                bpis bpisVar = (bpis) bpjiVar.cS();
                if (bpisVar == null) {
                    bpjiVar.close();
                    aiwvVar.b = length;
                    bpjw bpjwVar3 = new bpjw(bpjz.a);
                    bpjwVar3.A("AppEventLoggerImpl-getEarliestTimestamp");
                    aiwvVar.c = bpjwVar3.b().k(bpjz.c.b);
                    fcsu fcsuVar = this.e;
                    aiwvVar.d = ((crqv) fcsuVar.b()).e("message_status_cleaup_time_millis", 0L);
                    aiwvVar.e = ((crqv) fcsuVar.b()).d("events_cleaup_rows_deleted", 0);
                    return aiwvVar;
                }
                length += bpisVar.a().length();
            } catch (Throwable th) {
                try {
                    bpjiVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.aiwq
    public final String c(aiwp aiwpVar, String str) throws NumberFormatException {
        String string;
        try {
            if (aiwpVar == aiwp.RCS_EVENT) {
                String[] strArrSplit = str.split(" ", -1);
                if (strArrSplit.length == 2) {
                    int i = Integer.parseInt(strArrSplit[0]);
                    long j = Long.parseLong(strArrSplit[1]);
                    int i2 = dhcd.a;
                    int i3 = i / 10000;
                    if (i3 >= 0) {
                        if (i3 == 2) {
                            StringBuilder sb = new StringBuilder();
                            if (i == 20001) {
                                sb.append("FILE TRANSFER SESSION STARTING");
                            } else if (i != 20002) {
                                switch (i) {
                                    case 20010:
                                        sb.append("FILE TRANSFER STARTED");
                                        break;
                                    case 20011:
                                        sb.append("FILE TRANSFER FINISHED");
                                        break;
                                    case 20012:
                                        sb.append("FILE TRANSFER PROGRESS: TRANSFERRED ");
                                        sb.append(FileTransferEvent.h(j));
                                        sb.append(" of ");
                                        sb.append((int) j);
                                        break;
                                    case 20013:
                                        sb.append("FILE TRANSFER INTERRUPTED");
                                        break;
                                    default:
                                        sb.append("Unknown FileTransfer event: ");
                                        sb.append(i);
                                        break;
                                }
                            } else {
                                sb.append("FILE TRANSFER SESSION STARTED");
                            }
                            string = sb.toString();
                        } else if (i3 == 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if (i == 30013) {
                                sb2.append("CAPABILITIES UPDATED");
                            } else if (i != 30050) {
                                switch (i) {
                                    case 30100:
                                        sb2.append("SIP REGISTRATION SUCCESSFUL");
                                        break;
                                    case 30101:
                                        sb2.append("SIP REGISTRATION FAILED");
                                        break;
                                    case 30102:
                                        sb2.append("SIP REGISTRATION TERMINATED");
                                        break;
                                    default:
                                        switch (i) {
                                            case 30104:
                                                sb2.append("RCS PROVISIONING RESCHEDULED");
                                                break;
                                            case 30105:
                                                sb2.append("IMS MODULE INITIALIZED");
                                                break;
                                            case 30106:
                                                sb2.append("SIP REGISTRATION STATE CHANGED");
                                                break;
                                            default:
                                                sb2.append(a.g(i, "Unknown IMS event: "));
                                                break;
                                        }
                                }
                            } else {
                                sb2.append("CONFIGURATION UPDATED SUCCESSFULLY");
                            }
                            int i4 = (int) j;
                            if (i4 == 100) {
                                sb2.append(": SIP CONNECTION ESTABLISHED");
                            } else if (i4 == 101) {
                                sb2.append(": SIP CONNECTION LOST");
                            }
                            string = sb2.toString();
                        } else if (i3 == 5) {
                            StringBuilder sb3 = new StringBuilder();
                            switch (i) {
                                case 50002:
                                    sb3.append("CHAT SESSION STARTED");
                                    break;
                                case 50003:
                                    sb3.append("CHAT SESSION START FAILED");
                                    break;
                                case 50005:
                                    sb3.append("CHAT SESSION TERMINATED");
                                    break;
                                case 50020:
                                    sb3.append("USER HAS JOINED GROUP CHAT");
                                    break;
                                case 50021:
                                    sb3.append("USER HAS LEFT GROUP CHAT");
                                    break;
                                case 50030:
                                    sb3.append("MESSAGE SENT SUCCESSFULLY");
                                    break;
                                case 50031:
                                    sb3.append("UNABLE TO SEND MESSAGE");
                                    break;
                                case 50032:
                                    sb3.append("IMDN REPORT: MESSAGE DISPLAYED TO REMOTE USER");
                                    break;
                                case 50035:
                                    sb3.append("IMDN REPORT: MESSAGE DELIVERED TO REMOTE USER");
                                    break;
                                case 50038:
                                    sb3.append("MESSAGE NOT YET DELIVERED");
                                    break;
                                case 50039:
                                    sb3.append("MESSAGE REVOCATION SENT");
                                    break;
                                case 50040:
                                    sb3.append("MESSAGE REVOCATION SEND FAILED");
                                    break;
                                case 50044:
                                    sb3.append("MESSAGE INTERWORKING SMS");
                                    break;
                                case 50045:
                                    sb3.append("MESSAGE INTERWORKING MMS");
                                    break;
                                case 50050:
                                    sb3.append("REMOTE USER COMPOSING STATE CHANGED");
                                    break;
                                case 50070:
                                    sb3.append("IMDN REPORT: REPORT SENT SUCCESSFULLY");
                                    break;
                                case 50071:
                                    sb3.append("IMDN REPORT: UNABLE TO SEND REPORT");
                                    break;
                                default:
                                    sb3.append(a.g(i, "Unknown ChatSession event: "));
                                    break;
                            }
                            int i5 = (int) j;
                            if (i5 == 0) {
                                sb3.append(": IS NOT TYPING");
                            } else if (i5 == 1) {
                                sb3.append(": IS TYPING");
                            } else if (i5 == 2) {
                                sb3.append(": WAS OFFLINE");
                            }
                            string = sb3.toString();
                        } else if (i3 == 6) {
                            string = a.g(i, "Location sharing event: ");
                        }
                        return a.v(string, "RCS: ");
                    }
                    string = a.g(i, "Unknown RCS event: ");
                    return a.v(string, "RCS: ");
                }
            } else {
                if (aiwpVar == aiwp.PHONE_STATE_CHANGED) {
                    int i6 = Integer.parseInt(str);
                    return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? "Unknown phone state" : "Radio of telephony is explicitly powered off" : "Phone only allowed emergency service" : "Phone out of service" : "Phone in service";
                }
                if (aiwpVar == aiwp.TRIM_MEMORY) {
                    return "Trim memory";
                }
            }
        } catch (NumberFormatException unused) {
        }
        return str;
    }

    @Override // defpackage.aiwq
    public final void d() {
        botb botbVarE = botm.e();
        botbVarE.A("AppEventLoggerImpl#init");
        botbVarE.f(new Function() { // from class: aikj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                int i = aikl.c;
                return new bopq[]{boppVar.a, boppVar.q};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bosz boszVarB = botbVarE.b();
        this.f = boszVarB;
        boszVarB.M(new aikk(this));
    }

    @Override // defpackage.aiwq
    public final void e(Intent intent) {
        String uri;
        aiwp aiwpVar;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            aiwpVar = aiwp.NO_CONNECTIVITY;
            uri = null;
        } else {
            uri = intent.toUri(0);
            aiwpVar = aiwp.CONNECTIVITY_CHANGED;
        }
        f(aiwpVar, Optional.ofNullable(uri));
    }

    @Override // defpackage.aiwq
    public final void f(final aiwp aiwpVar, final Optional optional) {
        final long epochMilli = this.d.f().toEpochMilli();
        auvh.h(ccze.V.b().i(new eooz() { // from class: aikd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(null);
                }
                final Optional optional2 = optional;
                final long j = epochMilli;
                final aiwp aiwpVar2 = aiwpVar;
                return eijx.f(new Runnable() { // from class: aikc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = aikl.c;
                        String[] strArr = bpjz.a;
                        final bpix bpixVar = new bpix();
                        bpixVar.c(aiwpVar2);
                        bpixVar.d(j);
                        optional2.ifPresent(new Consumer() { // from class: aikg
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                bpixVar.b((String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        final bpis bpisVarA = bpixVar.a(new Supplier() { // from class: bpiu
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bpit();
                            }
                        });
                        final dqsy dqsyVarA = bpjz.a();
                        dqru.b(bpjz.a(), "events", bpisVarA, new Function() { // from class: bpiq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Long.valueOf(dqsyVarA.O("events", (dqst) obj2));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bpir
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                Long l = (Long) obj2;
                                if (l.longValue() >= 0) {
                                    bpis bpisVar = bpisVarA;
                                    bpisVar.a = l.longValue();
                                    bpisVar.fN(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }, this.a.b);
            }
        }, eoqg.a));
    }

    @Override // defpackage.aiwq
    public final void g(Event event) {
        int i = event.h;
        if (i == 50050 || i == 50070) {
            return;
        }
        f(aiwp.RCS_EVENT, Optional.of(i + " " + event.i));
    }

    @Override // defpackage.aiwq
    public final byte[] h() {
        evqs evqsVar = evqs.b;
        evqr evqrVar = new evqr();
        PrintWriter printWriter = new PrintWriter((OutputStream) evqrVar, true);
        String[] strArr = bpjz.a;
        bpjw bpjwVar = new bpjw(bpjz.a);
        bpjwVar.A("AppEventLoggerImpl-dump");
        bpjwVar.c(new Function() { // from class: aike
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpjg bpjgVar = (bpjg) obj;
                int i = aikl.c;
                return new bpjh[]{bpjgVar.b, bpjgVar.c, bpjgVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpjwVar.s();
        bpji bpjiVar = (bpji) bpjwVar.b().p();
        while (bpjiVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(bpjiVar.c())).append('\t').append((CharSequence) Integer.toString(bpjiVar.e().p)).append('\t');
                if (bpjiVar.f() != null) {
                    printWriter.append((CharSequence) bpjiVar.f());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    bpjiVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bpjiVar.close();
        printWriter.flush();
        byte[] bArrI = evqrVar.b().I();
        printWriter.close();
        return dhja.x(bArrI, 524288);
    }
}
