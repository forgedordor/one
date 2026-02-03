package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfa implements Comparator {
    public static final jfa a = new jfa();

    private jfa() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        jcr jcrVar = (jcr) obj;
        jcr jcrVar2 = (jcr) obj2;
        int iA = fdbq.a(jcrVar2.m, jcrVar.m);
        return iA != 0 ? iA : fdbq.a(jcrVar.hashCode(), jcrVar2.hashCode());
    }
}
