package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgbx implements dfmx {
    final String a;
    private final deym b;
    private ewnf c = ewnf.SIP_REGISTRATION_STATE_UNKNOWN;
    private long d;

    public dgbx(String str, deym deymVar) {
        this.b = deymVar;
        this.a = "SR-".concat(String.valueOf(str));
    }

    private static ewnb h(int i) {
        switch (i) {
            case 1:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
            case 2:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
            case 3:
                return ewnb.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 4:
                return ewnb.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 5:
                return ewnb.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
            case 6:
                return ewnb.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
            case 7:
                return ewnb.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
            case 8:
                return ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
            case 9:
                return ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
            case 10:
                return ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                return ewnb.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 15:
                return ewnb.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return ewnb.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
            case 17:
                return ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    @Override // defpackage.dfmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dfmy r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgbx.b(dfmy):void");
    }

    @Override // defpackage.dfmx
    public final void e(dfmy dfmyVar, Message message) {
        dhja.c("[%s] processed Message %s", dfmyVar.a(), message);
        if (message.what == 101) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof dezf) {
            this.b.i(this.a, h(message.what), (dezf) obj);
        } else {
            this.b.h(this.a, h(message.what));
        }
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
}
