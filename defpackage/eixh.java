package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eixh extends eiya implements eiqy {
    public final List a = new ArrayList();

    @Override // defpackage.eiqy
    public final /* bridge */ /* synthetic */ Object a() {
        c(DesugarCollections.unmodifiableList(this.a));
        return b();
    }

    public abstract eixi b();

    public abstract void c(List list);
}
