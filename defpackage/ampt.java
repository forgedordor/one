package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampt implements cqto {
    final /* synthetic */ ampu a;

    public ampt(ampu ampuVar) {
        this.a = ampuVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final ampu ampuVar = this.a;
        ampuVar.b = ampuVar.d.a.a(new cqtk() { // from class: ampq
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                ampu ampuVar2 = ampuVar;
                return auvw.c(ampuVar2.a, fcyi.a, fdjz.a, new amps(ampuVar2, null));
            }
        }, "LocationPermissionManagerImpl::Register", "LocationPermissionManagerImpl::Callback", "LocationPermissionManagerImpl::Unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        ampu ampuVar = this.a;
        cquc cqucVar = ampuVar.b;
        if (cqucVar != null) {
            cqucVar.a();
        }
        ampuVar.b = null;
    }
}
