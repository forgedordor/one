package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbff extends dqye {
    public cbff() {
        super("work_queue");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbfe b() {
        ah();
        return new cbfe(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(long j) {
        String[] strArr = cbfi.a;
        cbfh cbfhVar = new cbfh();
        cbfhVar.c(j);
        aj(new cbfg(cbfhVar), "work_queue-buildAndUpdateForId");
    }

    public final void d() {
        int iIntValue = cbfi.c().intValue();
        int iIntValue2 = cbfi.c().intValue();
        if (iIntValue2 < 45030) {
            dqru.x("scheduled_in_workmanager", iIntValue2);
        }
        if (iIntValue >= 45030) {
            this.a.put("scheduled_in_workmanager", (Boolean) true);
        }
    }
}
