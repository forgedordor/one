package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elep extends eles {
    final /* synthetic */ eles a;

    public elep(eles elesVar) {
        this.a = elesVar;
    }

    @Override // defpackage.eles
    public final eler a(String str) {
        eler elerVarA = this.a.a(str);
        if (elerVarA == null) {
            return null;
        }
        String str2 = elerVarA.a;
        int length = str2.length() - elerVarA.c;
        int length2 = str2.length() - length;
        return new eler(str2, length2, length, Math.max(1, length) + length2);
    }

    public final String toString() {
        return "after(" + this.a.toString() + ")";
    }
}
