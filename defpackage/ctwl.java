package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwl implements Consumer {
    final /* synthetic */ ctwn a;
    final /* synthetic */ String b;

    public ctwl(ctwn ctwnVar, String str) {
        this.a = ctwnVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        cqbd cqbdVarE = ctwn.a.e();
        cqbdVarE.I("Failed to add member to Rcs group chat");
        cqbdVarE.s((Throwable) obj);
        this.a.c(this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
