package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.reflection.Consumer2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prx implements Consumer2 {
    public prx(ptj ptjVar, psk pskVar) {
        ptjVar.getClass();
        pskVar.getClass();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(List<? extends ActivityStack> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(psk.b(prn$$ExternalSyntheticApiModelOutline0.m719m(it.next())));
        }
    }
}
