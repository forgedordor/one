package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwk implements Consumer {
    final /* synthetic */ ctwn a;
    final /* synthetic */ String b;

    public ctwk(ctwn ctwnVar, String str) {
        this.a = ctwnVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        cbcw cbcwVar = (cbcw) obj;
        cbcwVar.getClass();
        if (cbcwVar.e()) {
            return;
        }
        this.a.c(this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
