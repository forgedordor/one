package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrx implements Comparator {
    public static final jrx a = new jrx();

    private jrx() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ihu ihuVarD = ((jsl) obj).d();
        ihu ihuVarD2 = ((jsl) obj2).d();
        int iCompare = Float.compare(ihuVarD2.d, ihuVarD.d);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(ihuVarD.c, ihuVarD2.c);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(ihuVarD.e, ihuVarD2.e);
        return iCompare3 != 0 ? iCompare3 : Float.compare(ihuVarD2.b, ihuVarD.b);
    }
}
