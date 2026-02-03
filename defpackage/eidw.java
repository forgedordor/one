package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidw extends eicq implements eicp {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public eidw(String str, eicp eicpVar, eiez eiezVar, boolean z, eifi eifiVar) {
        super("<missing root>:".concat(String.valueOf(str)), eicpVar, eiez.e(eiezVar, eiey.b), eifiVar);
        this.b = eicpVar.c();
        this.a = eicpVar.h();
        this.c = z;
    }

    public static void m() {
        ekhx ekhxVarL = eidc.l();
        if (ekhxVarL.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(ekhxVarL, new Consumer() { // from class: eidv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((eigv) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eicp
    public final Exception c() {
        return this.b;
    }

    @Override // defpackage.eicp
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.eicp
    public final eifn i(String str, eiez eiezVar, boolean z, eifi eifiVar) {
        if (z && !this.c) {
            eidc.y();
        }
        boolean z2 = true;
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new eidw(str, this, eiezVar, z2, eifiVar);
    }

    @Override // defpackage.eicq, defpackage.eifn
    public final eiev j(eiew eiewVar) {
        eiev eievVarJ = super.j(eiewVar);
        return eievVarJ.c() == 3 ? eiev.d(2) : eievVarJ;
    }

    @Override // defpackage.eifn
    public final long l() {
        return -1L;
    }

    @Override // defpackage.eifn
    public final eiez n() {
        return eiey.a;
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

    public eidw(UUID uuid, String str, String str2, eiez eiezVar, Exception exc, boolean z, boolean z2, eifi eifiVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, eiez.e(eiezVar, eiey.b), eifiVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
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
