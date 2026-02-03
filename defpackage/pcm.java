package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcm<K> implements Iterable<K> {
    final Set a = new LinkedHashSet();
    final Set b = new LinkedHashSet();

    public final int a() {
        return this.a.size() + this.b.size();
    }

    final void b() {
        this.b.clear();
    }

    public final boolean c(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    public final boolean d() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pcm) {
            pcm pcmVar = (pcm) obj;
            if (this.a.equals(pcmVar.a) && this.b.equals(pcmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.b;
        return set.hashCode() ^ this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<K> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        if (a() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb = new StringBuilder(a() * 28);
        sb.append("Selection{");
        StringBuilder sb2 = new StringBuilder("primary{size=");
        Set set = this.a;
        sb2.append(set.size());
        sb.append(sb2.toString());
        Objects.toString(set);
        sb.append(", entries=".concat(set.toString()));
        StringBuilder sb3 = new StringBuilder("}, provisional{size=");
        Set set2 = this.b;
        sb3.append(set2.size());
        sb.append(sb3.toString());
        Objects.toString(set2);
        sb.append(", entries=".concat(set2.toString()));
        sb.append("}}");
        return sb.toString();
    }
}
