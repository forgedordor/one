package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiks extends cmwg {
    public final aiwu a;
    public final aiwq b;
    private final eosc c;

    public aiks(aiwu aiwuVar, aiwq aiwqVar, eosc eoscVar) {
        this.c = eoscVar;
        this.a = aiwuVar;
        this.b = aiwqVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("MessageStatusLoggerBackgroundStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: aikr
            @Override // java.lang.Runnable
            public final void run() {
                aiks aiksVar = this.a;
                aiksVar.a.e();
                aiksVar.b.d();
            }
        }, this.c);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
