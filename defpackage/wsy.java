package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsy implements wsl {
    private final fcyh a;

    public wsy(fcyh fcyhVar) {
        fcyhVar.getClass();
        this.a = fcyhVar;
    }

    @Override // defpackage.wsl
    public final Object a(vvv vvvVar, bpbj bpbjVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.a), new wsx(null, vvvVar, bpbjVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.wsl
    public final void c(bpbl bpblVar, vvw vvwVar) {
        vvwVar.getClass();
        MessageId messageId = vvwVar.e;
        bpblVar.f(messageId != null ? messageId.a() : null);
    }

    @Override // defpackage.wsl
    public final void d(bpcv bpcvVar, vvw vvwVar) {
        MessageId messageId = vvwVar.e;
        String strA = messageId != null ? messageId.a() : null;
        int iIntValue = bpcy.c().intValue();
        int iIntValue2 = bpcy.c().intValue();
        if (iIntValue2 < 59540) {
            dqru.x("replied_to_message_id", iIntValue2);
        }
        if (iIntValue >= 59540) {
            dqru.v(bpcvVar.a, "replied_to_message_id", strA);
        }
    }

    @Override // defpackage.wsl
    public final boolean e(wsa wsaVar) {
        return wsaVar.a(new fdap() { // from class: wsw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvwVar.e;
            }
        });
    }
}
