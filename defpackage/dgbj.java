package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.ImsException;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbj extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbj(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    private final void f() {
        dgbn dgbnVar = this.b;
        RcsUceAdapter.OnPublishStateChangedListener onPublishStateChangedListener = dgbnVar.H;
        if (onPublishStateChangedListener != null) {
            try {
                dgbnVar.A.removeOnPublishStateChangedListener(onPublishStateChangedListener);
                dhja.l(dgbnVar.i, "Removed OnPublishCallback from AOSP.", new Object[0]);
            } catch (ImsException e) {
                dhja.j(e, this.b.i, "Failed to remove publishCallback from AOSP.", new Object[0]);
            }
            this.b.H = null;
        }
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgbn dgbnVar = this.b;
        dgbnVar.H();
        dfzi dfziVar = dgbnVar.v;
        if (dfziVar != null && !dgbn.P()) {
            dfziVar.h();
        }
        String str = dgbnVar.G;
        if (str == null) {
            str = "";
        }
        ebkz ebkzVar = dgbnVar.w;
        SipDelegateConfiguration sipDelegateConfiguration = dgbnVar.E;
        sipDelegateConfiguration.getClass();
        ebkzVar.e(dgbnVar.K.a(sipDelegateConfiguration), str);
        if (dgbn.P()) {
            try {
                dgbnVar.H = new dgay(dgbnVar);
                dgbnVar.A.addOnPublishStateChangedListener(dgbnVar.z, dgbnVar.H);
                dhja.l(dgbnVar.i, "Registered OnPublishCallback in AOSP.", new Object[0]);
            } catch (ImsException e) {
                dgbn dgbnVar2 = this.b;
                dhja.j(e, dgbnVar2.i, "Failed to register Publish callback. Retrying.", new Object[0]);
                dgbnVar2.w(dgbnVar2.s);
            }
        }
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void c() {
        f();
        if (!dgbn.P()) {
            this.b.G(dezf.CONNECTIVITY_CHANGE);
        }
        super.c();
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            dgbn dgbnVar = this.b;
            dgbnVar.M((SipDelegateConfiguration) message.obj);
            dgbnVar.K((SipDelegateConfiguration) message.obj);
            return true;
        }
        if (i != 17) {
            if (i == 18) {
                this.b.J(message.arg1);
                return true;
            }
            switch (i) {
                case 4:
                    dgbn dgbnVar2 = this.b;
                    dgbnVar2.w(dgbnVar2.q);
                    return true;
                case 5:
                    this.b.L((DelegateRegistrationState) message.obj);
                    return true;
                case 6:
                    dgbn dgbnVar3 = this.b;
                    dgbnVar3.w(dgbnVar3.r);
                    return true;
                case 7:
                    this.b.E();
                    return true;
                case 8:
                    int i2 = message.arg1;
                    dgbn dgbnVar4 = this.b;
                    dfzi dfziVar = dgbnVar4.v;
                    if (dfziVar != null) {
                        dfziVar.i(dezf.DISABLED);
                    }
                    dgbnVar4.C(i2);
                    return true;
                case 9:
                    dgbn dgbnVar5 = this.b;
                    dgbnVar5.w(dgbnVar5.p);
                    return true;
                case 10:
                    break;
                default:
                    return false;
            }
        }
        dhja.r(this.b.i, "[%s] Publish failed.", "RegisteredState");
        return true;
    }
}
