package defpackage;

import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgfk implements dfyw, dfmx {
    final String a;
    String b;
    private final deym c;
    private final int d;
    private long f;
    private ewnf e = ewnf.SIP_REGISTRATION_STATE_UNKNOWN;
    private final AtomicReference g = new AtomicReference();
    private final boolean h = ((Boolean) dfnv.b("use_elapsed_time_in_registration_event_logger").a()).booleanValue();

    public dgfk(String str, int i, deym deymVar) {
        this.c = deymVar;
        this.a = str;
        this.d = i;
    }

    private static ewnb o(int i) {
        switch (i) {
            case 1:
                return ewnb.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
            case 2:
                return ewnb.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
            case 3:
                return ewnb.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
            case 4:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
            case 5:
                return ewnb.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
            case 6:
            case 11:
            default:
                return ewnb.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 7:
                return ewnb.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 8:
                return ewnb.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 9:
                return ewnb.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
            case 10:
                return ewnb.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
            case 12:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
            case 13:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
            case 14:
                return ewnb.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
            case 15:
                return ewnb.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return ewnb.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
            case 17:
                return ewnb.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
            case 18:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
            case 19:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
        }
    }

    private final void p(int i) {
        ewds ewdsVar = (ewds) ewdt.a.createBuilder();
        ewdsVar.copyOnWrite();
        ewdt ewdtVar = (ewdt) ewdsVar.instance;
        ewdtVar.c = i - 1;
        ewdtVar.b |= 16384;
        ((dfyu) this.g.get()).c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    @Override // defpackage.dfmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dfmy r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgfk.b(dfmy):void");
    }

    @Override // defpackage.dfmx
    public final void e(dfmy dfmyVar, Message message) {
        dhja.c("[%s] processed Message %s", dfmyVar.a(), message);
        int i = message.what;
        if (i == 101 || i == 4) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof dezf) {
            this.c.i(this.a, o(message.what), (dezf) obj);
            return;
        }
        if (message.what == 2) {
            if (obj instanceof ebqs) {
                deym deymVar = this.c;
                String str = this.a;
                ewnb ewnbVarO = o(message.what);
                int iY = ((ebqs) obj).y();
                ewmy ewmyVar = (ewmy) ewmz.a.createBuilder();
                ewmyVar.copyOnWrite();
                ewmz ewmzVar = (ewmz) ewmyVar.instance;
                ewmzVar.c = ewnbVarO.C;
                ewmzVar.b |= 1;
                ewmyVar.copyOnWrite();
                ewmz ewmzVar2 = (ewmz) ewmyVar.instance;
                ewmzVar2.b = 4 | ewmzVar2.b;
                ewmzVar2.e = iY;
                ewmz ewmzVar3 = (ewmz) ewmyVar.build();
                ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
                ewmxVar.copyOnWrite();
                ewng ewngVar = (ewng) ewmxVar.instance;
                str.getClass();
                ewngVar.b |= 64;
                ewngVar.g = str;
                ewmxVar.copyOnWrite();
                ewng ewngVar2 = (ewng) ewmxVar.instance;
                ewmzVar3.getClass();
                ewngVar2.f = ewmzVar3;
                ewngVar2.b |= 32;
                ewng ewngVar3 = (ewng) ewmxVar.build();
                dhja.o("Logging SIP registration Processed message, message = %s sipResponseCode = %d", ewnbVarO, Integer.valueOf(iY));
                deymVar.n(ewngVar3);
                return;
            }
            return;
        }
        if (message.what != 7) {
            this.c.h(this.a, o(message.what));
            return;
        }
        deym deymVar2 = this.c;
        String str2 = this.a;
        ewnb ewnbVarO2 = o(message.what);
        int i2 = message.arg1;
        ewmy ewmyVar2 = (ewmy) ewmz.a.createBuilder();
        ewmyVar2.copyOnWrite();
        ewmz ewmzVar4 = (ewmz) ewmyVar2.instance;
        ewmzVar4.c = ewnbVarO2.C;
        ewmzVar4.b |= 1;
        ewmyVar2.copyOnWrite();
        ewmz ewmzVar5 = (ewmz) ewmyVar2.instance;
        ewmzVar5.b |= 8;
        ewmzVar5.f = i2;
        ewmz ewmzVar6 = (ewmz) ewmyVar2.build();
        ewmx ewmxVar2 = (ewmx) ewng.a.createBuilder();
        ewmxVar2.copyOnWrite();
        ewng ewngVar4 = (ewng) ewmxVar2.instance;
        str2.getClass();
        ewngVar4.b |= 64;
        ewngVar4.g = str2;
        ewmxVar2.copyOnWrite();
        ewng ewngVar5 = (ewng) ewmxVar2.instance;
        ewmzVar6.getClass();
        ewngVar5.f = ewmzVar6;
        ewngVar5.b |= 32;
        ewng ewngVar6 = (ewng) ewmxVar2.build();
        dhja.o("Logging SIP registration Processed message, message = %s configVersion = %d", ewnbVarO2, Integer.valueOf(i2));
        deymVar2.n(ewngVar6);
    }

    @Override // defpackage.dfyw
    public final void h(dfyu dfyuVar) {
        this.g.set(dfyuVar);
    }

    @Override // defpackage.dfyw
    public final void j(String str) {
        this.b = str;
        this.c.e(ewnd.SIP_REGISTRATION_EVENT_TYPE_REGISTERED, str);
        p(2);
    }

    @Override // defpackage.dfyw
    public final void k(String str) {
        this.b = str;
        this.c.e(ewnd.SIP_REGISTRATION_EVENT_TYPE_REGISTERING, str);
    }

    @Override // defpackage.dfyw
    public final void l() {
        p(3);
    }

    @Override // defpackage.dfyw
    public final void m() {
        p(3);
    }

    @Override // defpackage.dfmx
    public final void a() {
    }

    @Override // defpackage.dfmx
    public final void c() {
    }

    @Override // defpackage.dfmx
    public final void d() {
    }

    @Override // defpackage.dfmx
    public final void f() {
    }

    @Override // defpackage.dfmx
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.dfyw
    public final void i() {
    }

    @Override // defpackage.dfyw
    public final void n() {
    }
}
