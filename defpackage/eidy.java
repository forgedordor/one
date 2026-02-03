package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidy extends eicq {
    public static final UUID a;
    public static final String b;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        a = uuidRandomUUID;
        b = eibd.ho(uuidRandomUUID);
    }

    private eidy(eidy eidyVar, String str, eiez eiezVar, eifi eifiVar) {
        super(str, eidyVar, eiezVar, eifiVar);
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
        return new eidy(this, str, eiezVar, eifiVar);
    }

    public eidy(String str, UUID uuid, String str2, eiez eiezVar, eifi eifiVar) {
        super(str, uuid, str2, eiezVar, eifiVar);
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
