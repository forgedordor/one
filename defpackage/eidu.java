package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidu extends eibd implements eicp {
    static final eicn a = new eico();
    public static final /* synthetic */ int c = 0;
    public final boolean b;
    private final Exception d;

    public eidu(UUID uuid, String str, Exception exc, boolean z, eifi eifiVar) {
        super("<missing root>", uuid, str, eifiVar);
        this.d = exc;
        this.b = z;
    }

    static eidu m(eifi eifiVar) {
        UUID uuidB = eidg.a.b();
        String strHo = eibd.ho(uuidB);
        if (!eifo.a()) {
            t();
            return new eidu(uuidB, strHo, a, false, eifiVar);
        }
        eicn eicnVar = new eicn();
        t();
        return new eidu(uuidB, strHo, eicnVar, eidc.u(eicnVar), eifiVar);
    }

    public static void t() {
        ekhx ekhxVarL = eidc.l();
        if (ekhxVarL.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(ekhxVarL, new Consumer() { // from class: eidt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int i = eidu.c;
                ((eigv) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eicp
    public final Exception c() {
        return this.d;
    }

    @Override // defpackage.eicp
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.eicp
    public final eifn i(String str, eiez eiezVar, boolean z, eifi eifiVar) {
        if (z) {
            eidc.y();
        }
        return new eidw(str, this, eiezVar, z, eifiVar);
    }

    @Override // defpackage.eifn
    public final eiev j(eiew eiewVar) {
        return eiev.d(2);
    }

    @Override // defpackage.eifn
    public final eiez k() {
        return eiey.a;
    }

    @Override // defpackage.eifn
    public final long l() {
        return -1L;
    }

    @Override // defpackage.eifn
    public final eiez n() {
        throw null;
    }

    @Override // defpackage.eifn
    public final boolean r() {
        return false;
    }

    @Override // defpackage.eifn
    public final eifn s(String str, eiez eiezVar, eifi eifiVar) {
        eidc.y();
        return i(str, eiezVar, true, eifiVar);
    }

    @Override // defpackage.eifn
    public final void u() {
    }

    @Override // defpackage.eifn
    public final void o(int i) {
    }

    @Override // defpackage.eifn
    public final void q(boolean z) {
    }

    @Override // defpackage.eifn
    public final void p(eiew eiewVar, Object obj) {
    }
}
