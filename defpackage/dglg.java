package defpackage;

import android.os.Message;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglg extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglg(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "DisabledState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.DISABLED_STAGE);
        dgngVar.J.ifPresent(new Consumer() { // from class: dglf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dgie) obj).o(2, this.a.a.h);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dgvf.b();
        dgvf.a(dgngVar.m, 2);
        dgngVar.aq(6);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_DISABLED;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_DISABLED_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return false;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        this.a.F("DisabledState", message);
        return super.q(message, dgibVar);
    }
}
