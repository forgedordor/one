package defpackage;

import android.database.ContentObserver;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfdg extends ContentObserver {
    final /* synthetic */ dfdi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfdg(dfdi dfdiVar) {
        super(null);
        this.a = dfdiVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (z) {
            return;
        }
        dfdi dfdiVar = this.a;
        boolean zIsEmpty = TextUtils.isEmpty(dfdiVar.c.h());
        dhja.c("User is logged in: %b", Boolean.valueOf(!zIsEmpty));
        if (zIsEmpty) {
            return;
        }
        dhja.o("Address book has changed, triggering IMS contacts DB sync.", new Object[0]);
        dfdiVar.c();
    }
}
