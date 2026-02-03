package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtx implements Comparator {
    public static final jtx a = new jtx();

    private jtx() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ihu ihuVar = (ihu) ((fcti) obj).a;
        float f = ihuVar.c;
        ihu ihuVar2 = (ihu) ((fcti) obj2).a;
        int iCompare = Float.compare(f, ihuVar2.c);
        return iCompare != 0 ? iCompare : Float.compare(ihuVar.e, ihuVar2.e);
    }
}
