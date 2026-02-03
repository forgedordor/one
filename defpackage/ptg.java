package defpackage;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptg {
    public final ActivityEmbeddingComponent a;
    public final psk b;
    public final prm c;
    public final pri d;

    public ptg(ActivityEmbeddingComponent activityEmbeddingComponent, psk pskVar, prm prmVar) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = pskVar;
        this.c = prmVar;
        this.d = new prh();
    }

    public final void a(final ptj ptjVar) {
        this.a.setSplitInfoCallback(new Consumer2() { // from class: ptd
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                List list = (List) obj;
                list.getClass();
                this.b.a(list);
                ptjVar.a();
            }
        });
    }
}
