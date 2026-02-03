package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektn implements ektj {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ektj
    public final /* synthetic */ void a(ekrz ekrzVar, Iterator it, Object obj) {
        ekwr.b(ekrzVar.b, "non repeating key");
        if (!ekrzVar.c || ekty.a() <= 20) {
            ekrzVar.b(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(ekrzVar.a, it.next());
            }
        }
    }
}
