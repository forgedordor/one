package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbk implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        jcr jcrVar = (jcr) obj;
        jcr jcrVar2 = (jcr) obj2;
        int iA = fdbq.a(jcrVar.m, jcrVar2.m);
        return iA != 0 ? iA : fdbq.a(jcrVar.hashCode(), jcrVar2.hashCode());
    }
}
