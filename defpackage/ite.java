package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ite implements PointerInputEventHandler, fdbl {
    private final /* synthetic */ fdat a;

    public ite(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(isn isnVar, fcxy fcxyVar) {
        return this.a.a(isnVar, fcxyVar);
    }
}
