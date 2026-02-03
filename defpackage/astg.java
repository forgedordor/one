package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class astg extends astf {
    private volatile transient boolean c;
    private volatile transient boolean d;

    public astg(asva asvaVar, Instant instant) {
        super(asvaVar, instant);
    }

    @Override // defpackage.asts
    public final boolean c() {
        boolean z;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    asva asvaVar = this.a;
                    evtg evtgVar = asvaVar.b;
                    asvc asvcVar = asvc.a;
                    asvb asvbVar = (asvb) asvcVar.createBuilder();
                    asvbVar.copyOnWrite();
                    asvc asvcVar2 = (asvc) asvbVar.instance;
                    asvcVar2.b |= 1;
                    asvcVar2.c = "+g.3gpp.iari-ref";
                    asvbVar.copyOnWrite();
                    asvc asvcVar3 = (asvc) asvbVar.instance;
                    asvcVar3.b |= 2;
                    asvcVar3.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im";
                    if (!evtgVar.contains(asvbVar.build())) {
                        evtg evtgVar2 = asvaVar.b;
                        asvb asvbVar2 = (asvb) asvcVar.createBuilder();
                        asvbVar2.copyOnWrite();
                        asvc asvcVar4 = (asvc) asvbVar2.instance;
                        asvcVar4.b |= 1;
                        asvcVar4.c = "+g.3gpp.iari-ref";
                        asvbVar2.copyOnWrite();
                        asvc asvcVar5 = (asvc) asvbVar2.instance;
                        asvcVar5.b |= 2;
                        asvcVar5.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp";
                        if (!evtgVar2.contains(asvbVar2.build())) {
                            z = false;
                            this.c = z;
                            this.d = true;
                        }
                    }
                    z = true;
                    this.c = z;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
