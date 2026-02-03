package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepq {
    public final ains a;
    private final aipo b;
    private final eosc c;

    public cepq(aipo aipoVar, ains ainsVar, eosc eoscVar) {
        this.b = aipoVar;
        this.a = ainsVar;
        this.c = eoscVar;
    }

    public final eiju a(cepp ceppVar, ListenableFuture listenableFuture) {
        String str = ((ceob) ceppVar).a;
        eika.l(listenableFuture, new cepo(this, str == null ? new aioo() : this.b.b(str), ceppVar), this.c);
        return eiju.g(listenableFuture);
    }
}
