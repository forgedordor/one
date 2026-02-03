package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jru implements Comparator {
    public static final jru a = new jru();

    private jru() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ihu ihuVarD = ((jsl) obj).d();
        ihu ihuVarD2 = ((jsl) obj2).d();
        int iCompare = Float.compare(ihuVarD.b, ihuVarD2.b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(ihuVarD.c, ihuVarD2.c);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(ihuVarD.e, ihuVarD2.e);
        return iCompare3 != 0 ? iCompare3 : Float.compare(ihuVarD.d, ihuVarD2.d);
    }
}
