package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqp implements fdpm {
    final /* synthetic */ afrd a;

    public afqp(afrd afrdVar) {
        this.a = afrdVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        dnih dnihVar = this.a.h.f;
        String str = (String) obj;
        if (!fdbq.f(str, dnihVar.b(false))) {
            if (str == null) {
                dnihVar.e();
            } else {
                dnihVar.k(str);
            }
        }
        return fctx.a;
    }
}
