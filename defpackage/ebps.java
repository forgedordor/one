package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebps extends ebpf {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        eblx eblxVar;
        ebmk ebmkVar;
        eboa eboaVar = new eboa();
        this.a.a(2062);
        this.a.h();
        this.a.a(58);
        this.a.h();
        super.b(eboaVar);
        this.a.a(10);
        eblv eblvVar = eboaVar.a;
        if (eblvVar.c == 2) {
            ebma ebmaVar = eblvVar.b;
            if ((ebmaVar instanceof eblx) && (ebmkVar = (eblxVar = (eblx) ebmaVar).b) != null && !ebmkVar.h()) {
                eboaVar.e = ebmkVar;
                eblxVar.f();
            }
        }
        return eboaVar;
    }
}
