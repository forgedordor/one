package defpackage;

import android.content.ContentValues;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqon extends dqst {
    private final ContentValues a;
    private final Consumer b;

    public dqon(ContentValues contentValues, Consumer consumer) {
        this.a = contentValues;
        this.b = consumer;
    }

    @Override // defpackage.dqst
    public final ContentValues a() {
        return this.a;
    }

    @Override // defpackage.dqst
    public final Consumer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqst) {
            dqst dqstVar = (dqst) obj;
            if (this.a.equals(dqstVar.a()) && this.b.equals(dqstVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Consumer consumer = this.b;
        return "InsertParams{contentValues=" + this.a.toString() + ", consumer=" + consumer.toString() + "}";
    }
}
