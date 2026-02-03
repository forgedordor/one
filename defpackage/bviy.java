package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bviy {
    private final crqv a;

    public bviy(crqv crqvVar) {
        crqvVar.getClass();
        this.a = crqvVar;
    }

    public final void a() {
        crqv crqvVar = this.a;
        crqvVar.n("ditto_active_desktop_id");
        crqvVar.n("ditto_active_desktop_request_id");
    }

    public final boolean b(ezol ezolVar) {
        byte[] bArrR = this.a.r("ditto_active_desktop_id");
        ezol ezolVar2 = null;
        if (bArrR != null) {
            try {
                ezolVar2 = (ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a());
            } catch (evtj unused) {
            }
        }
        return ezolVar2 != null && ezolVar.c.equals(ezolVar2.c);
    }
}
