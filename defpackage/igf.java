package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class igf extends fdbo implements fdae {
    public igf(Object obj) {
        super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.g;
        if (focusOwnerImpl.h == null || focusOwnerImpl.c.f() == igx.d) {
            focusOwnerImpl.b.invoke();
        }
        return fctx.a;
    }
}
