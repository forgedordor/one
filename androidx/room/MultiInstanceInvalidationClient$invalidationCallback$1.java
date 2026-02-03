package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import defpackage.fdil;
import defpackage.fdjx;
import defpackage.pea;
import defpackage.peb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ peb this$0;

    MultiInstanceInvalidationClient$invalidationCallback$1(peb pebVar) {
        this.this$0 = pebVar;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(String[] strArr) {
        strArr.getClass();
        peb pebVar = this.this$0;
        fdjx fdjxVar = pebVar.a;
        fdil.d(null, null, null, new pea(strArr, pebVar, null), 3);
    }
}
