package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleo extends eles {
    final /* synthetic */ eles a;

    public eleo(eles elesVar) {
        this.a = elesVar;
    }

    @Override // defpackage.eles
    public final eler a(String str) {
        eler elerVarA = this.a.a(str);
        if (elerVarA == null) {
            return null;
        }
        return new eler(str, 0, elerVarA.b, elerVarA.d);
    }

    public final String toString() {
        return "before(" + this.a.toString() + ")";
    }
}
