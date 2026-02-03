package defpackage;

import android.content.ContentValues;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chif extends chil {
    public final long a;
    public final UUID b;
    public final fhaz c;
    public final chia d;
    public final chhu e;
    public final chhz f;
    public final ContentValues g;

    public chif(long j, UUID uuid, fhaz fhazVar, chia chiaVar, chhu chhuVar, chhz chhzVar, ContentValues contentValues) {
        chhuVar.getClass();
        chhzVar.getClass();
        contentValues.getClass();
        this.a = j;
        this.b = uuid;
        this.c = fhazVar;
        this.d = chiaVar;
        this.e = chhuVar;
        this.f = chhzVar;
        this.g = contentValues;
    }

    public static /* synthetic */ chif a(chif chifVar, chhz chhzVar) {
        return new chif(chifVar.a, chifVar.b, chifVar.c, chifVar.d, chifVar.e, chhzVar, chifVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chif)) {
            return false;
        }
        chif chifVar = (chif) obj;
        return this.a == chifVar.a && fdbq.f(this.b, chifVar.b) && fdbq.f(this.c, chifVar.c) && fdbq.f(this.d, chifVar.d) && fdbq.f(this.e, chifVar.e) && fdbq.f(this.f, chifVar.f) && fdbq.f(this.g, chifVar.g);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "BugleData(xMessageId=" + this.a + ", persistenceId=" + this.b + ", traceId=" + this.c + ", parsedSmsData=" + this.d + ", conversationData=" + this.e + ", messageState=" + this.f + ", messageValues=" + this.g + ")";
    }
}
