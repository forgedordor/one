package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqh extends ebpf {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        eblx eblxVar;
        ebmk ebmkVar;
        d(2063);
        ebos ebosVar = new ebos();
        super.b(ebosVar);
        this.a.a(10);
        eblv eblvVar = ebosVar.a;
        if (eblvVar.c == 2) {
            ebma ebmaVar = eblvVar.b;
            if ((ebmaVar instanceof eblx) && (ebmkVar = (eblxVar = (eblx) ebmaVar).b) != null && !ebmkVar.h()) {
                ebosVar.e = ebmkVar;
                eblxVar.f();
            }
        }
        return ebosVar;
    }
}
