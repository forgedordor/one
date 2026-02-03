package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqay extends dqws {
    public bqay(String[] strArr) {
        super("message_captions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqax b() {
        l();
        return new bqax(this.a.a());
    }

    public final void c(bqan... bqanVarArr) {
        int iA = bqbb.b().a();
        Integer.valueOf(iA).getClass();
        for (bqan bqanVar : bqanVarArr) {
            if (((Integer) bqbb.b.getOrDefault(bqanVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bqanVarArr);
    }
}
