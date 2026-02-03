package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfe extends chfg {
    public final cjnm a;
    private final ContentType b;

    public chfe(cjnm cjnmVar) {
        this.a = cjnmVar;
        atal atalVar = new atal();
        aubt aubtVar = cjnmVar.c;
        aubx aubxVar = (aubtVar == null ? aubt.a : aubtVar).c;
        Object objFM = atalVar.fM(aubxVar == null ? aubx.a : aubxVar);
        objFM.getClass();
        this.b = (ContentType) objFM;
    }

    @Override // defpackage.chfg
    public final ContentType a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chfe) && fdbq.f(this.a, ((chfe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RawMessage(rawMessage=" + this.a + ")";
    }
}
