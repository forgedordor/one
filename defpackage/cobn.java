package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobn implements cobo {
    private final Set a;
    private final int b;
    private final UUID c;
    private final UUID d;

    public cobn(Set set, int i, UUID uuid, UUID uuid2) {
        uuid2.getClass();
        this.a = set;
        this.b = i;
        this.c = uuid;
        this.d = uuid2;
    }

    @Override // defpackage.cobo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cobo
    public final cnsx b(cnsy cnsyVar) {
        Context context = (Context) cnsyVar.a.b();
        context.getClass();
        aipo aipoVar = (aipo) cnsyVar.b.b();
        aipoVar.getClass();
        ains ainsVar = (ains) cnsyVar.c.b();
        ainsVar.getClass();
        ((ains) cnsyVar.d.b()).getClass();
        cnsz cnszVar = (cnsz) cnsyVar.k.b();
        cnszVar.getClass();
        cmqj cmqjVar = (cmqj) cnsyVar.e.b();
        cmqjVar.getClass();
        ((apua) cnsyVar.f.b()).getClass();
        ((aptz) cnsyVar.h.b()).getClass();
        apub apubVar = (apub) cnsyVar.i.b();
        apubVar.getClass();
        ((asff) cnsyVar.j.b()).getClass();
        return new cnsx(context, aipoVar, ainsVar, cnszVar, cmqjVar, cnsyVar.g, apubVar, this.a);
    }

    @Override // defpackage.cobo
    public final UUID c() {
        return this.d;
    }

    @Override // defpackage.cobo
    public final UUID d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cobn)) {
            return false;
        }
        cobn cobnVar = (cobn) obj;
        return fdbq.f(this.a, cobnVar.a) && this.b == cobnVar.b && fdbq.f(this.c, cobnVar.c) && fdbq.f(this.d, cobnVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "UriBasedSyncBatch(messageUris=" + this.a + ", targetMessagesToUpdate=" + this.b + ", syncId=" + this.c + ", batchId=" + this.d + ")";
    }
}
