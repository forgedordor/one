package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxty extends bxwf {
    private final Collection a;
    private final Map b;
    private final Collection c;
    private final Collection d;

    public bxty(Collection collection, Map map, Collection collection2, Collection collection3) {
        if (collection == null) {
            throw new NullPointerException("Null matchingMessageIds");
        }
        this.a = collection;
        this.b = map;
        if (collection2 == null) {
            throw new NullPointerException("Null matchingLinkIds");
        }
        this.c = collection2;
        if (collection3 == null) {
            throw new NullPointerException("Null matchingLocationIds");
        }
        this.d = collection3;
    }

    @Override // defpackage.bxwf
    public final Collection a() {
        return this.c;
    }

    @Override // defpackage.bxwf
    public final Collection b() {
        return this.d;
    }

    @Override // defpackage.bxwf
    public final Collection c() {
        return this.a;
    }

    @Override // defpackage.bxwf
    public final Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxwf) {
            bxwf bxwfVar = (bxwf) obj;
            if (this.a.equals(bxwfVar.c()) && this.b.equals(bxwfVar.d()) && this.c.equals(bxwfVar.a()) && this.d.equals(bxwfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Collection collection = this.d;
        Collection collection2 = this.c;
        Map map = this.b;
        return "OnDeviceMessageSearchResults{matchingMessageIds=" + this.a.toString() + ", matchingConversationParts=" + map.toString() + ", matchingLinkIds=" + collection2.toString() + ", matchingLocationIds=" + collection.toString() + "}";
    }
}
