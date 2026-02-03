package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshc implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evnt evntVar = (evnt) obj;
        etkg etkgVar = (etkg) etkh.a.createBuilder();
        if ((evntVar.b & 1) != 0) {
            ejvr ejvrVar = dsiu.a;
            evnq evnqVarB = evnq.b(evntVar.c);
            if (evnqVarB == null) {
                evnqVarB = evnq.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object objApply = ejvrVar.apply(evnqVarB);
            etkgVar.copyOnWrite();
            etkh etkhVar = (etkh) etkgVar.instance;
            etkhVar.c = ((etgd) objApply).a();
            etkhVar.b |= 1;
        }
        return (etkh) etkgVar.build();
    }
}
