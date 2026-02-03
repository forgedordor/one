package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.reflection.Consumer2;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptq implements Consumer2 {
    private final fdap a;

    public ptq(fdap<? super List<? extends ActivityStack>, fctx> fdapVar) {
        fdapVar.getClass();
        this.a = fdapVar;
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(List<? extends ActivityStack> list) {
        list.getClass();
        this.a.invoke(list);
    }
}
