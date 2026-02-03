package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezd implements dhkw {
    public dhki a = dhki.UNKNOWN;

    @Override // defpackage.dhkw
    public final dhki a(int i) {
        dhki dhkiVar = this.a;
        ejwl.b(!dhki.UNKNOWN.equals(dhkiVar), "SipConnectionType is UNKNOWN.");
        return dhkiVar;
    }

    @Override // defpackage.dhkw
    public final boolean b(int i) {
        return dhki.SINGLE_REG.equals(a(i));
    }
}
