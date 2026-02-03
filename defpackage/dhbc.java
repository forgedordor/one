package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbc implements dgxg {
    private final dgxb a;
    private final dgxf b;

    public dhbc(dgxb dgxbVar, dgxf dgxfVar) {
        this.a = dgxbVar;
        this.b = dgxfVar;
    }

    @Override // defpackage.dgxg
    public final void k(long j, String str, dgwx dgwxVar) {
        dhja.o("Received capabilities for %s: %s", dhja.a(str), dgwxVar);
        if (dgwxVar.y()) {
            dhja.o("updating RCS contact %s", dhja.a(str));
        } else if (dgwxVar.c || !dgwxVar.d) {
            dhja.o("updating non RCS contact %s", dhja.a(str));
        } else {
            dhja.o("updating offline contact %s", dhja.a(str));
        }
        this.a.d(j, str, new ImsCapabilities(dgwxVar));
    }

    @Override // defpackage.dgxg
    public final void l(long j, String str) {
        dhja.o("update error for contact %s", dhja.a(str));
        ImsCapabilities imsCapabilities = new ImsCapabilities(this.b.a);
        dgxb dgxbVar = this.a;
        Optional optionalC = dgxbVar.c.c(str);
        if (optionalC.isEmpty()) {
            dgxbVar.d(j, str, imsCapabilities);
        } else {
            dgxbVar.e(j, str, (ImsCapabilities) optionalC.get());
        }
    }
}
