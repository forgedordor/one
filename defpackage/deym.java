package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deym extends deys {
    public static final dfny b = dfnv.b("add_ip_version_to_socket_event_rev1");
    private final Context e;

    public deym(Context context, dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
        this.e = context;
    }

    public static int r(String str) {
        if (((Boolean) b.a()).booleanValue()) {
            try {
                return InetAddress.getByName(str) instanceof Inet6Address ? 3 : 2;
            } catch (UnknownHostException unused) {
            }
        }
        return 1;
    }

    public static final void t(ewmd ewmdVar, ebhy ebhyVar) {
        String str = ((ebgu) ebhyVar).c;
        if (str != null) {
            ewmdVar.copyOnWrite();
            ewmn ewmnVar = (ewmn) ewmdVar.instance;
            ewmn ewmnVar2 = ewmn.a;
            ewmnVar.b |= 64;
            ewmnVar.i = str;
        }
    }

    public final void d(ewnd ewndVar) {
        e(ewndVar, null);
    }

    public final void e(ewnd ewndVar, String str) {
        dhja.o("Logging SIP registration event, type = %s", ewndVar);
        ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        ewngVar.c = ewndVar.g;
        ewngVar.b |= 1;
        if (!TextUtils.isEmpty(str)) {
            ewmxVar.copyOnWrite();
            ewng ewngVar2 = (ewng) ewmxVar.instance;
            str.getClass();
            ewngVar2.b |= 2;
            ewngVar2.d = str;
        }
        n((ewng) ewmxVar.build());
    }

    public final void f(ewnf ewnfVar, Optional optional) {
        ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        ewngVar.e = ewnfVar.w;
        ewngVar.b |= 4;
        ewmxVar.getClass();
        optional.ifPresent(new deyl(ewmxVar));
        dhja.o("Logging SIP registration state change event, state = %s", ewnfVar);
        n((ewng) ewmxVar.build());
    }

    public final void g(ewnf ewnfVar, ewnf ewnfVar2, long j, Optional optional, Optional optional2) {
        final ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        ewngVar.e = ewnfVar.w;
        ewngVar.b |= 4;
        ewmxVar.copyOnWrite();
        ewng ewngVar2 = (ewng) ewmxVar.instance;
        ewngVar2.h = ewnfVar2.w;
        ewngVar2.b |= 128;
        ewmxVar.copyOnWrite();
        ewng ewngVar3 = (ewng) ewmxVar.instance;
        ewngVar3.b |= 256;
        ewngVar3.i = (int) j;
        ewmxVar.getClass();
        optional.ifPresent(new Consumer() { // from class: deyk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                ewmx ewmxVar2 = ewmxVar;
                ewmxVar2.copyOnWrite();
                ewng ewngVar4 = (ewng) ewmxVar2.instance;
                ewng ewngVar5 = ewng.a;
                ewngVar4.b |= 512;
                ewngVar4.j = iIntValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new deyl(ewmxVar));
        dhja.o("Logging SIP registration state change event, from %s to %s after %d ms. subId=%d", ewnfVar2, ewnfVar, Long.valueOf(j), optional.orElse(-1));
        n((ewng) ewmxVar.build());
    }

    public final void h(String str, ewnb ewnbVar) {
        ewmy ewmyVar = (ewmy) ewmz.a.createBuilder();
        ewmyVar.copyOnWrite();
        ewmz ewmzVar = (ewmz) ewmyVar.instance;
        ewmzVar.c = ewnbVar.C;
        ewmzVar.b |= 1;
        ewmz ewmzVar2 = (ewmz) ewmyVar.build();
        ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        str.getClass();
        ewngVar.b |= 64;
        ewngVar.g = str;
        ewmxVar.copyOnWrite();
        ewng ewngVar2 = (ewng) ewmxVar.instance;
        ewmzVar2.getClass();
        ewngVar2.f = ewmzVar2;
        ewngVar2.b |= 32;
        ewng ewngVar3 = (ewng) ewmxVar.build();
        dhja.o("Logging SIP registration Processed message, message = %s", ewnbVar);
        n(ewngVar3);
    }

    public final void i(String str, ewnb ewnbVar, dezf dezfVar) {
        ewmy ewmyVar = (ewmy) ewmz.a.createBuilder();
        ewmyVar.copyOnWrite();
        ewmz ewmzVar = (ewmz) ewmyVar.instance;
        ewmzVar.c = ewnbVar.C;
        ewmzVar.b |= 1;
        int iA = ewga.a(dezfVar.ordinal());
        if (iA != 0) {
            ewmyVar.copyOnWrite();
            ewmz ewmzVar2 = (ewmz) ewmyVar.instance;
            ewmzVar2.d = iA - 1;
            ewmzVar2.b |= 2;
        }
        ewmx ewmxVar = (ewmx) ewng.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewng ewngVar = (ewng) ewmxVar.instance;
        str.getClass();
        ewngVar.b |= 64;
        ewngVar.g = str;
        ewmxVar.copyOnWrite();
        ewng ewngVar2 = (ewng) ewmxVar.instance;
        ewmz ewmzVar3 = (ewmz) ewmyVar.build();
        ewmzVar3.getClass();
        ewngVar2.f = ewmzVar3;
        ewngVar2.b |= 32;
        ewng ewngVar3 = (ewng) ewmxVar.build();
        dhja.o("Logging SIP registration Processed message, message = %s, terminationReason = %s", ewnbVar, dezfVar);
        n(ewngVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.ewnx r5) {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r5.n
            int r1 = r5.m
            int r1 = defpackage.ewnv.a(r1)
            if (r1 != 0) goto L12
            goto L36
        L12:
            switch(r1) {
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L27;
                case 7: goto L24;
                case 8: goto L21;
                case 9: goto L1e;
                case 10: goto L1b;
                case 11: goto L18;
                default: goto L15;
            }
        L15:
            java.lang.String r1 = "SOCKET_STATE_FAILED"
            goto L38
        L18:
            java.lang.String r1 = "SOCKET_STATE_CLOSED"
            goto L38
        L1b:
            java.lang.String r1 = "SOCKET_STATE_CLOSING"
            goto L38
        L1e:
            java.lang.String r1 = "SOCKET_STATE_ACTIVE"
            goto L38
        L21:
            java.lang.String r1 = "SOCKET_STATE_AUTHENTICATED"
            goto L38
        L24:
            java.lang.String r1 = "SOCKET_STATE_AUTHENTICATING"
            goto L38
        L27:
            java.lang.String r1 = "SOCKET_STATE_CONNECTED"
            goto L38
        L2a:
            java.lang.String r1 = "SOCKET_STATE_CONNECTING"
            goto L38
        L2d:
            java.lang.String r1 = "SOCKET_STATE_ACCEPTED"
            goto L38
        L30:
            java.lang.String r1 = "SOCKET_STATE_ACCEPTING"
            goto L38
        L33:
            java.lang.String r1 = "SOCKET_STATE_INIT"
            goto L38
        L36:
            java.lang.String r1 = "SOCKET_STATE_UNKNOWN"
        L38:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "Logging socket state monitoring event for socket [%s]: %s"
            defpackage.dhja.o(r0, r2)
            android.content.Context r0 = r4.e
            ewmp r1 = defpackage.ewmp.a
            evsf r1 = r1.createBuilder()
            ewmo r1 = (defpackage.ewmo) r1
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r1.instance
            ewmp r2 = (defpackage.ewmp) r2
            r5.getClass()
            r2.c = r5
            r5 = 3
            r2.b = r5
            evsn r5 = r1.build()
            ewmp r5 = (defpackage.ewmp) r5
            r4.C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deym.j(ewnx):void");
    }

    public final void k(ewmn ewmnVar) {
        ewmo ewmoVar = (ewmo) ewmp.a.createBuilder();
        ewmoVar.copyOnWrite();
        ewmp ewmpVar = (ewmp) ewmoVar.instance;
        ewmnVar.getClass();
        ewmpVar.c = ewmnVar;
        ewmpVar.b = 2;
        C(this.e, (ewmp) ewmoVar.build());
    }

    @Deprecated
    public final void l(ewnx ewnxVar) {
        if (o()) {
            return;
        }
        ewmo ewmoVar = (ewmo) ewmp.a.createBuilder();
        ewmoVar.copyOnWrite();
        ewmp ewmpVar = (ewmp) ewmoVar.instance;
        ewnxVar.getClass();
        ewmpVar.c = ewnxVar;
        ewmpVar.b = 3;
        C(this.e, (ewmp) ewmoVar.build());
    }

    public final void m(ewmw ewmwVar) {
        ewmo ewmoVar = (ewmo) ewmp.a.createBuilder();
        ewmoVar.copyOnWrite();
        ewmp ewmpVar = (ewmp) ewmoVar.instance;
        ewmwVar.getClass();
        ewmpVar.c = ewmwVar;
        ewmpVar.b = 1;
        C(this.e, (ewmp) ewmoVar.build());
    }

    public final void n(ewng ewngVar) {
        if (((Boolean) dfog.o().a.P.a()).booleanValue()) {
            ewmo ewmoVar = (ewmo) ewmp.a.createBuilder();
            ewmoVar.copyOnWrite();
            ewmp ewmpVar = (ewmp) ewmoVar.instance;
            ewngVar.getClass();
            ewmpVar.c = ewngVar;
            ewmpVar.b = 4;
            C(this.e, (ewmp) ewmoVar.build());
        }
    }

    public final boolean o() {
        if (dfpk.u()) {
            return emko.CARRIER_SERVICES_EVENT_SOURCE_RCS.equals(this.a);
        }
        return false;
    }

    public final ewmq p(int i, ewmv ewmvVar, ewms ewmsVar, int i2) {
        ewmq ewmqVar = (ewmq) ewmw.a.createBuilder();
        ewmqVar.copyOnWrite();
        ewmw ewmwVar = (ewmw) ewmqVar.instance;
        ewmwVar.c = i - 1;
        ewmwVar.b |= 1;
        ewmqVar.copyOnWrite();
        ewmw ewmwVar2 = (ewmw) ewmqVar.instance;
        ewmwVar2.d = ewmvVar.e;
        ewmwVar2.b |= 2;
        if (dext.a() == 2) {
            ewmqVar.copyOnWrite();
            ewmw ewmwVar3 = (ewmw) ewmqVar.instance;
            ewmwVar3.e = ewmsVar.d;
            ewmwVar3.b |= 4;
            ewmqVar.copyOnWrite();
            ewmw ewmwVar4 = (ewmw) ewmqVar.instance;
            ewmwVar4.b |= 8;
            ewmwVar4.f = i2;
        }
        return ewmqVar;
    }

    @Deprecated
    public final ewnm q(ewnt ewntVar, int i, String str, int i2, int i3) {
        ewnm ewnmVar = (ewnm) ewnx.a.createBuilder();
        ewnmVar.copyOnWrite();
        ewnx ewnxVar = (ewnx) ewnmVar.instance;
        ewnxVar.f = ewntVar.e;
        ewnxVar.b |= 8;
        if (((Boolean) b.a()).booleanValue()) {
            ewnmVar.copyOnWrite();
            ewnx ewnxVar2 = (ewnx) ewnmVar.instance;
            ewnxVar2.k = i - 1;
            ewnxVar2.b |= 256;
            ewnmVar.copyOnWrite();
            ewnx ewnxVar3 = (ewnx) ewnmVar.instance;
            ewnxVar3.j = i3 - 1;
            ewnxVar3.b |= 128;
        }
        if (dext.a() == 2) {
            ewnmVar.copyOnWrite();
            ewnx ewnxVar4 = (ewnx) ewnmVar.instance;
            ewnxVar4.b |= 32;
            ewnxVar4.h = str;
            ewnmVar.copyOnWrite();
            ewnx ewnxVar5 = (ewnx) ewnmVar.instance;
            ewnxVar5.b |= 64;
            ewnxVar5.i = i2;
        }
        return ewnmVar;
    }

    public final void s(String str, int i) {
        ewnh ewnhVar = (ewnh) ewnl.a.createBuilder();
        ewnk ewnkVar = ewnk.SIP_TRANSPORT_EVENT_TYPE_ERROR;
        ewnhVar.copyOnWrite();
        ewnl ewnlVar = (ewnl) ewnhVar.instance;
        ewnlVar.c = ewnkVar.c;
        ewnlVar.b |= 1;
        ewnhVar.copyOnWrite();
        ewnl ewnlVar2 = (ewnl) ewnhVar.instance;
        ewnlVar2.e = i - 1;
        ewnlVar2.b |= 4;
        ewnhVar.copyOnWrite();
        ewnl ewnlVar3 = (ewnl) ewnhVar.instance;
        str.getClass();
        ewnlVar3.b |= 2;
        ewnlVar3.d = str;
        ewnl ewnlVar4 = (ewnl) ewnhVar.build();
        if (((Boolean) dfpk.a().b.s.a()).booleanValue()) {
            ewnk ewnkVarB = ewnk.b(ewnlVar4.c);
            if (ewnkVarB == null) {
                ewnkVarB = ewnk.SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
            }
            dhja.o("Logging SipTransportEvent event type, %s", ewnkVarB);
            ewmo ewmoVar = (ewmo) ewmp.a.createBuilder();
            ewmoVar.copyOnWrite();
            ewmp ewmpVar = (ewmp) ewmoVar.instance;
            ewnlVar4.getClass();
            ewmpVar.c = ewnlVar4;
            ewmpVar.b = 5;
            C(this.e, (ewmp) ewmoVar.build());
        }
    }
}
