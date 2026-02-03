package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshb implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evij evijVar = (evij) obj;
        etkc etkcVar = (etkc) etkd.a.createBuilder();
        if ((evijVar.b & 1) != 0) {
            ejvr ejvrVar = dsis.a;
            evnq evnqVarB = evnq.b(evijVar.c);
            if (evnqVarB == null) {
                evnqVarB = evnq.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object objApply = ejvrVar.apply(evnqVarB);
            etkcVar.copyOnWrite();
            etkd etkdVar = (etkd) etkcVar.instance;
            etkdVar.c = ((etgd) objApply).a();
            etkdVar.b |= 1;
        }
        if ((evijVar.b & 2) != 0) {
            int i = evijVar.d;
            etkcVar.copyOnWrite();
            etkd etkdVar2 = (etkd) etkcVar.instance;
            etkdVar2.b |= 2;
            etkdVar2.d = i;
        }
        return (etkd) etkcVar.build();
    }
}
