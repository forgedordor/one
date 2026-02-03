package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccoq {
    public final String a;

    public ccoq(String str) {
        this.a = str;
    }

    public final void a(String str, epvp epvpVar) {
        String[] strArr = ccni.a;
        ccml ccmlVar = new ccml();
        ccmlVar.c(this.a);
        ccmlVar.b(str);
        ccmlVar.d(epvpVar.toByteArray());
        dqru.B(ccni.a(), 5, false, new BiConsumer() { // from class: ccmh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String[] strArr2 = ccni.a;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, ccmlVar.a());
    }
}
