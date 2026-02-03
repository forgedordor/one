package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpaa extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bozz(this);
    }

    public final void b(String str) {
        ap(new dqpj("desktop.desktop_id", 1, String.valueOf(str)));
    }

    public final void c() {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 58010) {
            dqru.x("is_active", iIntValue);
        }
        ap(new dqty("desktop.is_active", 1, 1));
    }

    public final void d(bvdu bvduVar) {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 58960) {
            dqru.x("pairing_type", iIntValue);
        }
        ap(new dqty("desktop.pairing_type", 1, Integer.valueOf(bvduVar == null ? 0 : bvduVar.ordinal())));
    }

    public final void e() {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 58010) {
            dqru.x("request_id", iIntValue);
        }
        ap(new dqpn("desktop.request_id", 6));
    }

    public final void f() {
        int iIntValue = bpab.c().intValue();
        if (iIntValue < 58010) {
            dqru.x("request_id", iIntValue);
        }
        ap(new dqpj("desktop.request_id", 2, ""));
    }
}
