package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnn {
    public static final awnn a = new awnn(fcvq.a, fcvp.a);
    public final Set b;
    public final Map c;
    private final fctc d;

    public awnn(Set set, Map map) {
        set.getClass();
        this.b = set;
        this.c = map;
        this.d = fctd.a(new fdae() { // from class: awnl
            @Override // defpackage.fdae
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                awnn awnnVar = this.a;
                for (Object obj : awnnVar.b) {
                    Map map2 = awnnVar.c;
                    if (map2.values().contains(((awnk) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return fcva.av(arrayList);
            }
        });
        fctd.a(new fdae() { // from class: awnm
            @Override // defpackage.fdae
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                awnn awnnVar = this.a;
                for (Object obj : awnnVar.b) {
                    Map map2 = awnnVar.c;
                    if (!map2.values().contains(((awnk) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return fcva.av(arrayList);
            }
        });
    }

    public final Set a() {
        return (Set) this.d.a();
    }

    public final boolean b(axcm axcmVar) {
        axcmVar.getClass();
        return this.c.keySet().contains(axcmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awnn)) {
            return false;
        }
        awnn awnnVar = (awnn) obj;
        return fdbq.f(this.b, awnnVar.b) && fdbq.f(this.c, awnnVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GroupMembers(members=" + this.b + ", activeMyIdentitiesInGroup=" + this.c + ")";
    }
}
