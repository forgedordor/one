package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prw {
    private final List a;
    private final boolean b;
    private final ActivityStack.Token c;

    public prw(List list, boolean z, ActivityStack.Token token) {
        this.a = list;
        this.b = z;
        this.c = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prw)) {
            return false;
        }
        prw prwVar = (prw) obj;
        return fdbq.f(this.a, prwVar.a) && this.b == prwVar.b && fdbq.f(this.c, prwVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ActivityStack.Token token = this.c;
        return ((iHashCode + (true != this.b ? 1237 : 1231)) * 31) + (token != null ? token.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityStack{activitiesInProcess=" + this.a + ", isEmpty=" + this.b + ", token=" + this.c + '}';
    }
}
