package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshz implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evlf evlfVar = (evlf) obj;
        etos etosVar = (etos) etot.a.createBuilder();
        etosVar.a(evlfVar.c);
        if ((evlfVar.b & 1) != 0) {
            ejvj ejvjVar = dskc.a;
            evld evldVarB = evld.b(evlfVar.d);
            if (evldVarB == null) {
                evldVarB = evld.ACTION_UNSPECIFIED;
            }
            etor etorVar = (etor) ejvjVar.fM(evldVarB);
            etosVar.copyOnWrite();
            etot etotVar = (etot) etosVar.instance;
            etotVar.d = etorVar.e;
            etotVar.b |= 1;
        }
        return (etot) etosVar.build();
    }
}
